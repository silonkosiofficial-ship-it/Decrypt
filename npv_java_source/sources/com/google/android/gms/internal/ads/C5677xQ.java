package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5677xQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3811gR f39849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f39850d;

    public C5677xQ(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.Yk0 yk1, com.google.android.gms.internal.ads.C3811gR c3811gR, com.google.android.gms.internal.ads.Uy0 uy0) {
        this.f39847a = yk0;
        this.f39848b = yk1;
        this.f39849c = c3811gR;
        this.f39850d = uy0;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.BR a(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return (com.google.android.gms.internal.ads.BR) this.f39849c.c(c2730Po).get(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }

    final /* synthetic */ P4.d b(final com.google.android.gms.internal.ads.C2730Po c2730Po, int i6, com.google.android.gms.internal.ads.AR ar) {
        android.os.Bundle bundle;
        if (c2730Po != null && (bundle = c2730Po.f30805O) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(((com.google.android.gms.internal.ads.BinderC3812gS) this.f39850d.b()).p6(c2730Po, i6), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.tQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.BR((java.io.InputStream) obj, c2730Po));
            }
        }, this.f39848b);
    }

    public final P4.d c(final com.google.android.gms.internal.ads.C2730Po c2730Po) {
        java.lang.String str = c2730Po.f30796F;
        p174r3.v.t();
        P4.d dVarG = p214v3.E0.d(str) ? com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AR(1)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.f(this.f39847a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.uQ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39156a.a(c2730Po);
            }
        }), java.util.concurrent.ExecutionException.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.vQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                java.lang.Throwable cause = (java.util.concurrent.ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(cause);
            }
        }, this.f39848b);
        final int callingUid = android.os.Binder.getCallingUid();
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVarG, com.google.android.gms.internal.ads.AR.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.wQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f39599a.b(c2730Po, callingUid, (com.google.android.gms.internal.ads.AR) obj);
            }
        }, this.f39848b);
    }
}
