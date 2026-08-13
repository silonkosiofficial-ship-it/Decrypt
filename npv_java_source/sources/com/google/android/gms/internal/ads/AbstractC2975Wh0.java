package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2975Wh0 {
    AbstractC2975Wh0() {
    }

    static int b(int i6, int i10) {
        if (i10 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i10 <= i6) {
            return i6;
        }
        int i11 = i6 + (i6 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = java.lang.Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public abstract com.google.android.gms.internal.ads.AbstractC2975Wh0 a(java.lang.Object obj);
}
