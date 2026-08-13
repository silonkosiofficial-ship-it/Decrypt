package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ej0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2318Ej0 {
    static long a(java.lang.String str, long j6) {
        if (j6 >= 0) {
            return j6;
        }
        throw new java.lang.IllegalArgumentException(str + " (" + j6 + ") must be >= 0");
    }

    static void b(boolean z6) {
        if (!z6) {
            throw new java.lang.ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
