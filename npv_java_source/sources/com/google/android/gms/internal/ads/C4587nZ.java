package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4587nZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f37613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2914Uq f37614b;

    C4587nZ(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.C2914Uq c2914Uq) {
        this.f37613a = executor;
        this.f37614b = c2914Uq;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25451W2)).booleanValue() ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.C4697oZ(null)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f37614b.l(), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.mZ
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new com.google.android.gms.internal.ads.C4697oZ(arrayList);
            }
        }, this.f37613a);
    }
}
