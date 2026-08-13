package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5637x30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2914Uq f39769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f39770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39771c;

    C5637x30(java.lang.String str, com.google.android.gms.internal.ads.C2746Qc c2746Qc, com.google.android.gms.internal.ads.C2914Uq c2914Uq, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f39769a = c2914Uq;
        this.f39770b = scheduledExecutorService;
        this.f39771c = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25462X2)).booleanValue()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25517c3)).booleanValue()) {
                P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2861Te0.a(p115l4.AbstractC6934o.e(null), null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.u30
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        H3.c cVar = (H3.c) obj;
                        return cVar == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5747y30(null, -1)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5747y30(cVar.a(), cVar.b()));
                    }
                }, this.f39771c);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC4710og.f37847a.e()).booleanValue()) {
                    dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarN, ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC4710og.f37848b.e()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f39770b);
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.e(dVarN, java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.w30
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return this.f39514a.c((java.lang.Exception) obj);
                    }
                }, this.f39771c);
            }
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5747y30(null, -1));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C5747y30 c(java.lang.Exception exc) {
        this.f39769a.x(exc, "AppSetIdInfoGmscoreSignal");
        return new com.google.android.gms.internal.ads.C5747y30(null, -1);
    }
}
