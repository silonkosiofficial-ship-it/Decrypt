package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2281Dj0 {
    public static long a(long j6, long j10) {
        long j11 = j6 + j10;
        if (((j6 ^ j10) < 0) || ((j6 ^ j11) >= 0)) {
            return j11;
        }
        throw new java.lang.ArithmeticException("overflow: checkedAdd(" + j6 + ", " + j10 + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r8 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b(long r8, long r10, java.math.RoundingMode r12) {
        /*
            r12.getClass()
            long r0 = r8 / r10
            long r2 = r10 * r0
            long r2 = r8 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L55
        L10:
            long r8 = r8 ^ r10
            int[] r6 = com.google.android.gms.internal.ads.AbstractC2244Cj0.f26286a
            int r7 = r12.ordinal()
            r6 = r6[r7]
            r7 = 63
            long r8 = r8 >> r7
            int r8 = (int) r8
            r8 = r8 | 1
            switch(r6) {
                case 1: goto L51;
                case 2: goto L55;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L22;
            }
        L22:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L28:
            long r2 = java.lang.Math.abs(r2)
            long r9 = java.lang.Math.abs(r10)
            long r9 = r9 - r2
            long r2 = r2 - r9
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L46
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r12 == r9) goto L4e
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_EVEN
            if (r12 != r9) goto L55
            r9 = 1
            long r9 = r9 & r0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L55
            goto L4e
        L46:
            if (r9 <= 0) goto L55
            goto L4e
        L49:
            if (r8 <= 0) goto L55
            goto L4e
        L4c:
            if (r8 >= 0) goto L55
        L4e:
            long r8 = (long) r8
            long r0 = r0 + r8
            return r0
        L51:
            r8 = 0
            com.google.android.gms.internal.ads.AbstractC2318Ej0.b(r8)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2281Dj0.b(long, long, java.math.RoundingMode):long");
    }

    public static long c(long j6, long j10) {
        com.google.android.gms.internal.ads.AbstractC2318Ej0.a("a", j6);
        com.google.android.gms.internal.ads.AbstractC2318Ej0.a("b", j10);
        if (j6 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j6;
        }
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j6);
        long jNumberOfTrailingZeros = j6 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            jNumberOfTrailingZeros = j14 >> java.lang.Long.numberOfTrailingZeros(j14);
            j11 += j13;
        }
        return jNumberOfTrailingZeros << java.lang.Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long d(long j6, long j10) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j6) + java.lang.Long.numberOfLeadingZeros(~j6) + java.lang.Long.numberOfLeadingZeros(j10) + java.lang.Long.numberOfLeadingZeros(~j10);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        long j11 = ((j6 ^ j10) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j10 == Long.MIN_VALUE) & (j6 < 0))) {
            return j11;
        }
        long j12 = j6 * j10;
        return (j6 == 0 || j12 / j6 == j10) ? j12 : j11;
    }
}
