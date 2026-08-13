package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class QZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4322l50 f31014a;

    QZ(com.google.android.gms.internal.ads.C4322l50 c4322l50) {
        this.f31014a = c4322l50;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        com.google.android.gms.internal.ads.C4322l50 c4322l50 = this.f31014a;
        if (c4322l50 == null) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.PZ(null));
        }
        java.lang.String strA = c4322l50.a();
        return V3.r.b(strA) ? com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.PZ(null)) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.PZ(strA));
    }
}
