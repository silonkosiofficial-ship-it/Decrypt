package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Zv0 {
    Zv0() {
    }

    public static final java.util.List a(java.lang.Object obj, long j6) {
        com.google.android.gms.internal.ads.Sv0 sv0 = (com.google.android.gms.internal.ads.Sv0) com.google.android.gms.internal.ads.Sw0.p(obj, j6);
        if (sv0.c()) {
            return sv0;
        }
        int size = sv0.size();
        com.google.android.gms.internal.ads.Sv0 sv0K = sv0.k(size == 0 ? 10 : size + size);
        com.google.android.gms.internal.ads.Sw0.D(obj, j6, sv0K);
        return sv0K;
    }
}
