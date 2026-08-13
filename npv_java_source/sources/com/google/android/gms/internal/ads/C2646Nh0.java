package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2646Nh0 extends com.google.android.gms.internal.ads.AbstractC2794Rh0 {
    C2646Nh0() {
        super(null);
    }

    static final com.google.android.gms.internal.ads.AbstractC2794Rh0 j(int i6) {
        if (i6 < 0) {
            return com.google.android.gms.internal.ads.AbstractC2794Rh0.f31338b;
        }
        return i6 > 0 ? com.google.android.gms.internal.ads.AbstractC2794Rh0.f31339c : com.google.android.gms.internal.ads.AbstractC2794Rh0.f31337a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2794Rh0
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2794Rh0
    public final com.google.android.gms.internal.ads.AbstractC2794Rh0 b(int i6, int i10) {
        return j(java.lang.Integer.compare(i6, i10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2794Rh0
    public final com.google.android.gms.internal.ads.AbstractC2794Rh0 c(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2794Rh0
    public final com.google.android.gms.internal.ads.AbstractC2794Rh0 d(boolean z6, boolean z10) {
        return j(java.lang.Boolean.compare(z6, z10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2794Rh0
    public final com.google.android.gms.internal.ads.AbstractC2794Rh0 e(boolean z6, boolean z10) {
        return j(java.lang.Boolean.compare(z10, z6));
    }
}
