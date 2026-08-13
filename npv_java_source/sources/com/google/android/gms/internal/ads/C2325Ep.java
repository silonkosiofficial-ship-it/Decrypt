package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2325Ep extends E3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f27125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5497vp f27126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f27127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2657Np f27128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f27129e;

    public C2325Ep(android.content.Context context, java.lang.String str) {
        this(context.getApplicationContext(), str, p184s3.C7147y.a().n(context, str, new com.google.android.gms.internal.ads.BinderC2801Rl()), new com.google.android.gms.internal.ads.BinderC2657Np());
    }

    protected C2325Ep(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp, com.google.android.gms.internal.ads.BinderC2657Np binderC2657Np) {
        this.f27129e = java.lang.System.currentTimeMillis();
        this.f27127c = context.getApplicationContext();
        this.f27125a = str;
        this.f27126b = interfaceC5497vp;
        this.f27128d = binderC2657Np;
    }

    @Override // E3.c
    public final p104k3.u a() {
        p184s3.U0 u0C = null;
        try {
            com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp = this.f27126b;
            if (interfaceC5497vp != null) {
                u0C = interfaceC5497vp.c();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        return p104k3.u.e(u0C);
    }

    @Override // E3.c
    public final void c(android.app.Activity activity, p104k3.p pVar) {
        this.f27128d.o6(pVar);
        if (activity == null) {
            p224w3.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vp = this.f27126b;
            if (interfaceC5497vp != null) {
                interfaceC5497vp.d3(this.f27128d);
                this.f27126b.S2(X3.b.c2(activity));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void d(p184s3.C7093f1 c7093f1, E3.d dVar) {
        try {
            if (this.f27126b != null) {
                c7093f1.o(this.f27129e);
                this.f27126b.K4(p184s3.b2.f54193a.a(this.f27127c, c7093f1), new com.google.android.gms.internal.ads.BinderC2510Jp(dVar, this));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }
}
