package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class RU implements com.google.android.gms.internal.ads.VT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5517vz f31272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5681xU f31273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f31274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.GC f31275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f31276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YN f31277f;

    public RU(com.google.android.gms.internal.ads.AbstractC5517vz abstractC5517vz, com.google.android.gms.internal.ads.C5681xU c5681xU, com.google.android.gms.internal.ads.GC gc, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.YN yn) {
        this.f31272a = abstractC5517vz;
        this.f31273b = c5681xU;
        this.f31275d = gc;
        this.f31276e = scheduledExecutorService;
        this.f31274c = yk0;
        this.f31277f = yn;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final boolean a(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.InterfaceC3726fi interfaceC3726fiA = c3558e70.f34898a.f34012a.a();
        boolean zA = this.f31273b.a(c3558e70, r60);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Rb)).booleanValue()) {
            this.f31277f.b().put("has_dbl", interfaceC3726fiA != null ? "1" : "0");
            this.f31277f.b().put("crdb", true == zA ? "1" : "0");
        }
        return interfaceC3726fiA != null && zA;
    }

    @Override // com.google.android.gms.internal.ads.VT
    public final P4.d b(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        return this.f31274c.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.OU
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f30506a.c(c3558e70, r60);
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC2777Qy c(final com.google.android.gms.internal.ads.C3558e70 c3558e70, final com.google.android.gms.internal.ads.R60 r60) {
        return this.f31272a.b(new com.google.android.gms.internal.ads.C5540wA(c3558e70, r60, null), new com.google.android.gms.internal.ads.C2667Nz(c3558e70.f34898a.f34012a.a(), new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.PU
            @Override // java.lang.Runnable
            public final void run() {
                this.f30725C.f(c3558e70, r60);
            }
        })).a();
    }

    final /* synthetic */ void f(com.google.android.gms.internal.ads.C3558e70 c3558e70, com.google.android.gms.internal.ads.R60 r60) {
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(this.f31273b.b(c3558e70, r60), r60.f31151R, java.util.concurrent.TimeUnit.SECONDS, this.f31276e), new com.google.android.gms.internal.ads.QU(this), this.f31274c);
    }
}
