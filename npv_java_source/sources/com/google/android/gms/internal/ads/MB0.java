package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class MB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3692fJ0 f29685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.util.SparseArray f29686b;

    public MB0(com.google.android.gms.internal.ads.C3692fJ0 c3692fJ0, android.util.SparseArray sparseArray) {
        this.f29685a = c3692fJ0;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray(c3692fJ0.b());
        for (int i6 = 0; i6 < c3692fJ0.b(); i6++) {
            int iA = c3692fJ0.a(i6);
            com.google.android.gms.internal.ads.LB0 lb0 = (com.google.android.gms.internal.ads.LB0) sparseArray.get(iA);
            lb0.getClass();
            sparseArray2.append(iA, lb0);
        }
        this.f29686b = sparseArray2;
    }

    public final int a(int i6) {
        return this.f29685a.a(i6);
    }

    public final int b() {
        return this.f29685a.b();
    }

    public final com.google.android.gms.internal.ads.LB0 c(int i6) {
        com.google.android.gms.internal.ads.LB0 lb0 = (com.google.android.gms.internal.ads.LB0) this.f29686b.get(i6);
        lb0.getClass();
        return lb0;
    }

    public final boolean d(int i6) {
        return this.f29685a.c(i6);
    }
}
