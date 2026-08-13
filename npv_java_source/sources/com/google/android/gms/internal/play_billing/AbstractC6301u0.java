package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6301u0 {
    static java.lang.Object a(java.lang.Object obj, int i6) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index " + i6);
    }

    static java.lang.Object[] b(java.lang.Object[] objArr, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            a(objArr[i10], i10);
        }
        return objArr;
    }
}
