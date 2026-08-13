package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final P3.InterfaceC1449e f24878C;

    protected LifecycleCallback(P3.InterfaceC1449e interfaceC1449e) {
        this.f24878C = interfaceC1449e;
    }

    protected static P3.InterfaceC1449e c(P3.C1448d c1448d) {
        if (c1448d.d()) {
            return P3.E.F1(c1448d.b());
        }
        if (c1448d.c()) {
            return P3.C.f(c1448d.a());
        }
        throw new java.lang.IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static P3.InterfaceC1449e d(android.app.Activity activity) {
        return c(new P3.C1448d(activity));
    }

    @androidx.annotation.Keep
    private static P3.InterfaceC1449e getChimeraLifecycleFragmentImpl(P3.C1448d c1448d) {
        throw new java.lang.IllegalStateException("Method not available in SDK.");
    }

    public void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    public android.app.Activity b() {
        android.app.Activity activityD = this.f24878C.d();
        Q3.AbstractC1477p.l(activityD);
        return activityD;
    }

    public void e(int i6, int i10, android.content.Intent intent) {
    }

    public void f(android.os.Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(android.os.Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
