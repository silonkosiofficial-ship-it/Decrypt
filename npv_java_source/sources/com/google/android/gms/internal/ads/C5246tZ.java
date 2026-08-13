package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5246tZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C2914Uq f38966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    H3.b f38967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f38968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f38969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.content.Context f38970e;

    C5246tZ(android.content.Context context, com.google.android.gms.internal.ads.C2914Uq c2914Uq, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.Yk0 yk0) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25506b3)).booleanValue()) {
            this.f38967b = H3.a.a(context);
        }
        this.f38970e = context;
        this.f38966a = c2914Uq;
        this.f38968c = scheduledExecutorService;
        this.f38969d = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25462X2)).booleanValue()) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25517c3)).booleanValue()) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25473Y2)).booleanValue()) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(com.google.android.gms.internal.ads.AbstractC2861Te0.a(this.f38967b.a(), null), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.qZ
                        @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                        public final java.lang.Object apply(java.lang.Object obj) {
                            H3.c cVar = (H3.c) obj;
                            return new com.google.android.gms.internal.ads.C5356uZ(cVar.a(), cVar.b());
                        }
                    }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                }
                p115l4.AbstractC6931l abstractC6931lA = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25506b3)).booleanValue() ? com.google.android.gms.internal.ads.S70.a(this.f38970e) : this.f38967b.a();
                if (abstractC6931lA == null) {
                    return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5356uZ(null, -1));
                }
                P4.d dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.n(com.google.android.gms.internal.ads.AbstractC2861Te0.a(abstractC6931lA, null), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.rZ
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        H3.c cVar = (H3.c) obj;
                        return cVar == null ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5356uZ(null, -1)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5356uZ(cVar.a(), cVar.b()));
                    }
                }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25484Z2)).booleanValue()) {
                    dVarN = com.google.android.gms.internal.ads.AbstractC2652Nk0.o(dVarN, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25495a3)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f38968c);
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.e(dVarN, java.lang.Exception.class, new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.sZ
                    @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
                    public final java.lang.Object apply(java.lang.Object obj) {
                        this.f38770a.f38966a.x((java.lang.Exception) obj, "AppSetIdInfoSignal");
                        return new com.google.android.gms.internal.ads.C5356uZ(null, -1);
                    }
                }, this.f38969d);
            }
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C5356uZ(null, -1));
    }
}
