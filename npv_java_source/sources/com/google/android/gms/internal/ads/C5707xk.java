package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5707xk extends p114l3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.b2 f39907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p184s3.V f39908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f39909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.BinderC2801Rl f39910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f39911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p104k3.l f39912g;

    public C5707xk(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.BinderC2801Rl binderC2801Rl = new com.google.android.gms.internal.ads.BinderC2801Rl();
        this.f39910e = binderC2801Rl;
        this.f39911f = java.lang.System.currentTimeMillis();
        this.f39906a = context;
        this.f39909d = str;
        this.f39907b = p184s3.b2.f54193a;
        this.f39908c = p184s3.C7147y.a().e(context, new p184s3.c2(), str, binderC2801Rl);
    }

    @Override // p234x3.a
    public final p104k3.u a() {
        p184s3.U0 u0K = null;
        try {
            p184s3.V v6 = this.f39908c;
            if (v6 != null) {
                u0K = v6.k();
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
        return p104k3.u.e(u0K);
    }

    @Override // p234x3.a
    public final void c(p104k3.l lVar) {
        try {
            this.f39912g = lVar;
            p184s3.V v6 = this.f39908c;
            if (v6 != null) {
                v6.F1(new p184s3.B(lVar));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p234x3.a
    public final void d(boolean z6) {
        try {
            p184s3.V v6 = this.f39908c;
            if (v6 != null) {
                v6.Y4(z6);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // p234x3.a
    public final void e(android.app.Activity activity) {
        if (activity == null) {
            p224w3.p.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            p184s3.V v6 = this.f39908c;
            if (v6 != null) {
                v6.m6(X3.b.c2(activity));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void f(p184s3.C7093f1 c7093f1, p104k3.AbstractC6888e abstractC6888e) {
        try {
            if (this.f39908c != null) {
                c7093f1.o(this.f39911f);
                this.f39908c.o3(this.f39907b.a(this.f39906a, c7093f1), new p184s3.S1(abstractC6888e, this));
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
            abstractC6888e.a(new p104k3.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
