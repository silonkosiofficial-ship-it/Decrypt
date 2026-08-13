package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2836Sk implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f31742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3842gl f31743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2208Bk f31744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3952hl f31745d;

    C2836Sk(com.google.android.gms.internal.ads.C3952hl c3952hl, long j6, com.google.android.gms.internal.ads.C3842gl c3842gl, com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk) {
        this.f31742a = j6;
        this.f31743b = c3842gl;
        this.f31744c = interfaceC2208Bk;
        this.f31745d = c3952hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        p214v3.AbstractC7265q0.k("onGmsg /jsLoaded. JsLoaded latency is " + (p174r3.v.c().a() - this.f31742a) + " ms.");
        p214v3.AbstractC7265q0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f31745d.f36117a) {
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f31743b.a() != -1 && this.f31743b.a() != 1) {
                this.f31745d.f36125i = 0;
                com.google.android.gms.internal.ads.InterfaceC2208Bk interfaceC2208Bk = this.f31744c;
                interfaceC2208Bk.W("/log", com.google.android.gms.internal.ads.AbstractC3728fj.f35402g);
                interfaceC2208Bk.W("/result", com.google.android.gms.internal.ads.AbstractC3728fj.f35410o);
                this.f31743b.e(this.f31744c);
                this.f31745d.f36124h = this.f31743b;
                p214v3.AbstractC7265q0.k("Successfully loaded JS Engine.");
                p214v3.AbstractC7265q0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            p214v3.AbstractC7265q0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
