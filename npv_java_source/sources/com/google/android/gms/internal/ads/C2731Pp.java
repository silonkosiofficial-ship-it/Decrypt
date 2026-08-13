package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2731Pp extends F3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f30809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5497vp f30810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f30811c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30813e = java.lang.System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2657Np f30812d = new com.google.android.gms.internal.ads.BinderC2657Np();

    public C2731Pp(android.content.Context context, java.lang.String str) {
        this.f30809a = str;
        this.f30811c = context.getApplicationContext();
        this.f30810b = p184s3.C7147y.a().n(context, str, new com.google.android.gms.internal.ads.BinderC2801Rl());
    }

    @Override // F3.a
    public final p104k3.u a() {
        p184s3.U0 u0C = null;
        try {
            com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp = this.f30810b;
            if (interfaceC5497vp != null) {
                u0C = interfaceC5497vp.c();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        return p104k3.u.e(u0C);
    }

    @Override // F3.a
    public final void c(android.app.Activity activity, p104k3.p pVar) {
        this.f30812d.o6(pVar);
        try {
            com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp = this.f30810b;
            if (interfaceC5497vp != null) {
                interfaceC5497vp.d3(this.f30812d);
                this.f30810b.S2(X3.b.c2(activity));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void d(p184s3.C7093f1 c7093f1, F3.b bVar) {
        try {
            if (this.f30810b != null) {
                c7093f1.o(this.f30813e);
                this.f30810b.m5(p184s3.b2.f54193a.a(this.f30811c, c7093f1), new com.google.android.gms.internal.ads.BinderC2694Op(bVar, this));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
