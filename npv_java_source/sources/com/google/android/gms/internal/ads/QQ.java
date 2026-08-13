package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f30987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4469mR f30990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Uy0 f30991e;

    public QQ(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.Yk0 yk1, com.google.android.gms.internal.ads.C4469mR c4469mR, com.google.android.gms.internal.ads.Uy0 uy0) {
        this.f30987a = scheduledExecutorService;
        this.f30988b = yk0;
        this.f30989c = yk1;
        this.f30990d = c4469mR;
        this.f30991e = uy0;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.BR a(com.google.android.gms.internal.ads.C2730Po c2730Po) {
        return (com.google.android.gms.internal.ads.BR) this.f30990d.c(c2730Po).get(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }

    final /* synthetic */ P4.d b(final com.google.android.gms.internal.ads.C2730Po c2730Po, int i6, java.lang.Throwable th) {
        android.os.Bundle bundle;
        if (c2730Po != null && (bundle = c2730Po.f30805O) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(((com.google.android.gms.internal.ads.BinderC3812gS) this.f30991e.b()).q6(c2730Po, i6), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.NQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.BR((java.io.InputStream) obj, c2730Po));
            }
        }, this.f30988b);
    }

    public final P4.d c(final com.google.android.gms.internal.ads.C2730Po c2730Po) {
        P4.d dVarH0;
        java.lang.String str = c2730Po.f30796F;
        p174r3.v.t();
        if (p214v3.E0.d(str)) {
            dVarH0 = com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.AR(1));
        } else {
            dVarH0 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25638n7)).booleanValue() ? this.f30989c.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.OQ
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f30496a.a(c2730Po);
                }
            }) : this.f30990d.c(c2730Po);
        }
        final int callingUid = android.os.Binder.getCallingUid();
        return (com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.f((com.google.android.gms.internal.ads.AbstractC2283Dk0) com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2283Dk0.D(dVarH0), ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25747y5)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.f30987a), java.lang.Throwable.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.PQ
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f30713a.b(c2730Po, callingUid, (java.lang.Throwable) obj);
            }
        }, this.f30988b);
    }
}
