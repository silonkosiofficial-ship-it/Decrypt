package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4330l90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f37102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f37103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P4.d f37104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f37105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P4.d f37106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4550n90 f37107f;

    private C4330l90(com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90, java.lang.Object obj, java.lang.String str, P4.d dVar, java.util.List list, P4.d dVar2) {
        this.f37107f = abstractC4550n90;
        this.f37102a = obj;
        this.f37103b = str;
        this.f37104c = dVar;
        this.f37105d = list;
        this.f37106e = dVar2;
    }

    public final com.google.android.gms.internal.ads.C3124a90 a() {
        java.lang.Object obj = this.f37102a;
        java.lang.String strF = this.f37103b;
        if (strF == null) {
            strF = this.f37107f.f(obj);
        }
        final com.google.android.gms.internal.ads.C3124a90 c3124a90 = new com.google.android.gms.internal.ads.C3124a90(obj, strF, this.f37106e);
        this.f37107f.f37532c.W(c3124a90);
        P4.d dVar = this.f37104c;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.j90
            @Override // java.lang.Runnable
            public final void run() {
                this.f36603C.f37107f.f37532c.G(c3124a90);
            }
        };
        com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34801g;
        dVar.e(runnable, yk0);
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(c3124a90, new com.google.android.gms.internal.ads.C4220k90(this, c3124a90), yk0);
        return c3124a90;
    }

    public final com.google.android.gms.internal.ads.C4330l90 b(java.lang.Object obj) {
        return this.f37107f.b(obj, a());
    }

    public final com.google.android.gms.internal.ads.C4330l90 c(java.lang.Class cls, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0) {
        return new com.google.android.gms.internal.ads.C4330l90(this.f37107f, this.f37102a, this.f37103b, this.f37104c, this.f37105d, com.google.android.gms.internal.ads.AbstractC2652Nk0.f(this.f37106e, cls, interfaceC5268tk0, this.f37107f.f37530a));
    }

    public final com.google.android.gms.internal.ads.C4330l90 d(final P4.d dVar) {
        return g(new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.i90
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return dVar;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    public final com.google.android.gms.internal.ads.C4330l90 e(final com.google.android.gms.internal.ads.Y80 y80) {
        return f(new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.g90
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(y80.b(obj));
            }
        });
    }

    public final com.google.android.gms.internal.ads.C4330l90 f(com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0) {
        return g(interfaceC5268tk0, this.f37107f.f37530a);
    }

    public final com.google.android.gms.internal.ads.C4330l90 g(com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.C4330l90(this.f37107f, this.f37102a, this.f37103b, this.f37104c, this.f37105d, com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f37106e, interfaceC5268tk0, executor));
    }

    public final com.google.android.gms.internal.ads.C4330l90 h(java.lang.String str) {
        return new com.google.android.gms.internal.ads.C4330l90(this.f37107f, this.f37102a, str, this.f37104c, this.f37105d, this.f37106e);
    }

    public final com.google.android.gms.internal.ads.C4330l90 i(long j6, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.android.gms.internal.ads.C4330l90(this.f37107f, this.f37102a, this.f37103b, this.f37104c, this.f37105d, com.google.android.gms.internal.ads.AbstractC2652Nk0.o(this.f37106e, j6, timeUnit, this.f37107f.f37531b));
    }
}
