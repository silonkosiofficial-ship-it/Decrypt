package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2192Bc extends p124m3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2414Hc f25983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f25984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2303Ec f25985c = new com.google.android.gms.internal.ads.BinderC2303Ec();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p104k3.l f25986d;

    public C2192Bc(com.google.android.gms.internal.ads.InterfaceC2414Hc interfaceC2414Hc, java.lang.String str) {
        this.f25983a = interfaceC2414Hc;
        this.f25984b = str;
    }

    @Override // p124m3.a
    public final p104k3.u a() {
        p184s3.U0 u0E;
        try {
            u0E = this.f25983a.e();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            u0E = null;
        }
        return p104k3.u.e(u0E);
    }

    @Override // p124m3.a
    public final void d(p104k3.l lVar) {
        this.f25986d = lVar;
        this.f25985c.o6(lVar);
    }

    @Override // p124m3.a
    public final void e(android.app.Activity activity) {
        try {
            this.f25983a.M3(X3.b.c2(activity), this.f25985c);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
