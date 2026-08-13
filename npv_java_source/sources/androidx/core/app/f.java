package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends android.app.Activity implements androidx.lifecycle.r, androidx.core.view.AbstractC2027t.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p170r.Y f21392C = new p170r.Y();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.lifecycle.C2087t f21393D = new androidx.lifecycle.C2087t(this);

    private final boolean x(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        java.lang.String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && android.os.Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && android.os.Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && android.os.Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return android.os.Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        p247y7.AbstractC7350t.f(keyEvent, "event");
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        if (androidx.core.view.AbstractC2027t.d(decorView, keyEvent)) {
            return true;
        }
        return androidx.core.view.AbstractC2027t.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        p247y7.AbstractC7350t.f(keyEvent, "event");
        android.view.View decorView = getWindow().getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window.decorView");
        if (androidx.core.view.AbstractC2027t.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.F.f22752D.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(bundle, "outState");
        this.f21393D.n(androidx.lifecycle.AbstractC2079k.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.AbstractC2027t.a
    public boolean r(android.view.KeyEvent keyEvent) {
        p247y7.AbstractC7350t.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return this.f21393D;
    }

    protected final boolean w(java.lang.String[] strArr) {
        return !x(strArr);
    }
}
