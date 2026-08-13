package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5816yj0 {
    static {
        java.lang.Math.log(2.0d);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int a(double d6, java.math.RoundingMode roundingMode) {
        boolean z6 = false;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.f(d6 > 0.0d && com.google.android.gms.internal.ads.AbstractC5926zj0.b(d6), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(d6);
        if (java.lang.Math.getExponent(d6) < -1022) {
            return a(d6 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (com.google.android.gms.internal.ads.AbstractC5706xj0.f39905a[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.AbstractC2318Ej0.b(d(d6));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z6 = !d(d6);
                if (z6) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                if (exponent < 0) {
                    z6 = true;
                }
                z6 &= !d(d6);
                if (z6) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                if (exponent >= 0) {
                    z6 = true;
                }
                z6 &= !d(d6);
                if (z6) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = java.lang.Double.longBitsToDouble((java.lang.Double.doubleToRawLongBits(d6) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z6 = true;
                }
                if (z6) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new java.lang.AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0099, please report this as an issue */
    public static long b(double d6, java.math.RoundingMode roundingMode) {
        double dRint;
        long j6;
        long j10;
        boolean z6;
        if (!com.google.android.gms.internal.ads.AbstractC5926zj0.b(d6)) {
            throw new java.lang.ArithmeticException("input is infinite or NaN");
        }
        switch (com.google.android.gms.internal.ads.AbstractC5706xj0.f39905a[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.ads.AbstractC2318Ej0.b(c(d6));
                dRint = d6;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 2:
                if (d6 >= 0.0d || c(d6)) {
                    dRint = d6;
                } else {
                    j6 = (long) d6;
                    j10 = -1;
                    dRint = j6 + j10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 3:
                if (d6 <= 0.0d || c(d6)) {
                    dRint = d6;
                } else {
                    j6 = (long) d6;
                    j10 = 1;
                    dRint = j6 + j10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 4:
                dRint = d6;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 5:
                if (c(d6)) {
                    dRint = d6;
                } else {
                    dRint = ((long) d6) + ((long) (d6 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 6:
                dRint = java.lang.Math.rint(d6);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 7:
                dRint = java.lang.Math.rint(d6);
                if (java.lang.Math.abs(d6 - dRint) == 0.5d) {
                    dRint = java.lang.Math.copySign(0.5d, d6) + d6;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            case 8:
                dRint = java.lang.Math.rint(d6);
                if (java.lang.Math.abs(d6 - dRint) == 0.5d) {
                    dRint = d6;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new java.lang.ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + java.lang.String.valueOf(roundingMode));
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean c(double d6) {
        if (com.google.android.gms.internal.ads.AbstractC5926zj0.b(d6)) {
            return d6 == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(com.google.android.gms.internal.ads.AbstractC5926zj0.a(d6)) <= java.lang.Math.getExponent(d6);
        }
        return false;
    }

    public static boolean d(double d6) {
        if (d6 > 0.0d && com.google.android.gms.internal.ads.AbstractC5926zj0.b(d6)) {
            long jA = com.google.android.gms.internal.ads.AbstractC5926zj0.a(d6);
            if ((jA & ((-1) + jA)) == 0) {
                return true;
            }
        }
        return false;
    }
}
