'use strict';

// DexProtector DP:789 gate tracer for NPV Tunnel.
// Usage: frida -U -f com.napsternetlabs.napsternetv -l tools/frida/npv_dp789_gate_trace.js --no-pause

function log(msg) { console.log('[npv-dp789] ' + msg); }

Java.perform(function () {
  var Throwable = Java.use('java.lang.Throwable');
  var RuntimeException = Java.use('java.lang.RuntimeException');
  var MessageGuardException = Java.use('com.napsternetlabs.napsternetv.MessageGuardException');
  var PMA = Java.use('com.napsternetlabs.napsternetv.ProtectedMyApplication');
  var Wrapper = Java.use('com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication');

  function stackOf(t) {
    try { return Java.cast(t, Throwable).getStackTrace().toString(); } catch (_) { return '<stack unavailable>'; }
  }

  RuntimeException.$init.overload('java.lang.String').implementation = function (s) {
    var ret = this.$init(s);
    if (s !== null && String(s).indexOf('DP:') >= 0) {
      log('RuntimeException(String) message=' + s);
      log('creation stack=' + stackOf(this));
    }
    return ret;
  };

  RuntimeException.$init.overload('java.lang.String', 'java.lang.Throwable').implementation = function (s, c) {
    var ret = this.$init(s, c);
    if (s !== null && String(s).indexOf('DP:') >= 0) {
      log('RuntimeException(String,Throwable) message=' + s + ' cause=' + c);
      log('creation stack=' + stackOf(this));
    }
    return ret;
  };

  MessageGuardException.$init.overload('java.lang.Throwable', 'java.lang.String').implementation = function (t, id) {
    log('MessageGuardException(Throwable,String) cause=' + t + ' causeMessage=' + (t ? t.getMessage() : null) + ' id=' + id);
    log('wrapper creation stack=' + stackOf(t || this));
    return this.$init(t, id);
  };

  Wrapper.qk.overload('java.lang.Throwable', 'java.lang.String').implementation = function (t, id) {
    log('qk(th,id) th=' + t + ' message=' + (t ? t.getMessage() : null) + ' id=' + id);
    return this.qk(t, id);
  };

  Wrapper.fAHytsI.overload('android.content.Context', 'java.lang.Throwable', 'java.lang.String').implementation = function (ctx, t, id) {
    log('fAHytsI(ctx,th,id) th=' + t + ' message=' + (t ? t.getMessage() : null) + ' id=' + id);
    return this.fAHytsI(ctx, t, id);
  };

  PMA.attachBaseContext.overload('android.content.Context').implementation = function (ctx) {
    log('attachBaseContext enter');
    try { return this.attachBaseContext(ctx); }
    finally { log('attachBaseContext exit'); }
  };

  PMA.onCreate.implementation = function () {
    log('Application.onCreate enter');
    try { return this.onCreate(); }
    finally { log('Application.onCreate exit'); }
  };

  ['gwj', 'uapgpA', 'zInq'].forEach(function (name) {
    try {
      var overloads = PMA[name].overloads;
      overloads.forEach(function (ov) {
        ov.implementation = function () {
          log('native ' + name + ' enter argc=' + arguments.length);
          try {
            var r = ov.apply(this, arguments);
            log('native ' + name + ' return=' + r);
            return r;
          } catch (e) {
            log('native ' + name + ' THROW=' + e + ' message=' + (e && e.getMessage ? e.getMessage() : '<no getMessage>'));
            throw e;
          }
        };
      });
    } catch (e) { log('native hook unavailable for ' + name + ': ' + e); }
  });
});
