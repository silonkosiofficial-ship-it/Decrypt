package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5926zj0 {
    static long a(double d6) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f(b(d6), "not a normal value");
        int exponent = java.lang.Math.getExponent(d6);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d6) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d6) {
        return java.lang.Math.getExponent(d6) <= 1023;
    }
}
