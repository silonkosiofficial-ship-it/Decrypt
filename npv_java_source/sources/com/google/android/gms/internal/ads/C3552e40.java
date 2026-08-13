package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3552e40 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2914Uq f34874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f34877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f34878e;

    C3552e40(com.google.android.gms.internal.ads.C2914Uq c2914Uq, boolean z6, boolean z10, com.google.android.gms.internal.ads.C2511Jq c2511Jq, com.google.android.gms.internal.ads.Yk0 yk0, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f34874a = c2914Uq;
        this.f34875b = z6;
        this.f34876c = z10;
        this.f34878e = yk0;
        this.f34877d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        if ((!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25389Q6)).booleanValue() || !this.f34876c) && this.f34875b) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.e(com.google.android.gms.internal.ads.AbstractC2652Nk0.o(com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(null), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.c40
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return new com.google.android.gms.internal.ads.C3662f40((java.lang.String) obj);
                }
            }, this.f34878e), ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2754Qg.f31030b.e()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f34877d), java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.d40
                @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f34632a.c((java.lang.Exception) obj);
                }
            }, this.f34878e);
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C3662f40(null));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C3662f40 c(java.lang.Exception exc) {
        this.f34874a.x(exc, "TrustlessTokenSignal");
        return new com.google.android.gms.internal.ads.C3662f40(null);
    }
}
