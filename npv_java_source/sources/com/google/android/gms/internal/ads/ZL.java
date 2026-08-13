package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class ZL extends k3.w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3581eJ f33573a;

    public ZL(com.google.android.gms.internal.ads.C3581eJ c3581eJ) {
        this.f33573a = c3581eJ;
    }

    private static p184s3.InterfaceC7081b1 f(com.google.android.gms.internal.ads.C3581eJ c3581eJ) {
        p184s3.Y0 y0W = c3581eJ.W();
        if (y0W == null) {
            return null;
        }
        try {
            return y0W.h();
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }

    @Override // k3.w.a
    public final void a() {
        p184s3.InterfaceC7081b1 interfaceC7081b1F = f(this.f33573a);
        if (interfaceC7081b1F == null) {
            return;
        }
        try {
            interfaceC7081b1F.d();
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Unable to call onVideoEnd()", e6);
        }
    }

    @Override // k3.w.a
    public final void c() {
        p184s3.InterfaceC7081b1 interfaceC7081b1F = f(this.f33573a);
        if (interfaceC7081b1F == null) {
            return;
        }
        try {
            interfaceC7081b1F.i();
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Unable to call onVideoEnd()", e6);
        }
    }

    @Override // k3.w.a
    public final void e() {
        p184s3.InterfaceC7081b1 interfaceC7081b1F = f(this.f33573a);
        if (interfaceC7081b1F == null) {
            return;
        }
        try {
            interfaceC7081b1F.h();
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Unable to call onVideoEnd()", e6);
        }
    }
}
