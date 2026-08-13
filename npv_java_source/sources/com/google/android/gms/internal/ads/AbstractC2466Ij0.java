package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2466Ij0 extends com.google.android.gms.internal.ads.AbstractC2503Jj0 {
    static /* bridge */ /* synthetic */ int a(int[] iArr, int i6, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i6) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int b(long j6) {
        int i6 = (int) j6;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.h(((long) i6) == j6, "Out of range: %s", j6);
        return i6;
    }

    public static int c(int i6, int i10, int i11) {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.j(true, "min (%s) must be less than or equal to max (%s)", i10, 1073741823);
        int[] iArr = {i6, i10};
        int i12 = iArr[0];
        for (char c6 = 1; c6 < 2; c6 = 2) {
            int i13 = iArr[1];
            if (i13 > i12) {
                i12 = i13;
            }
        }
        int[] iArr2 = {i12, 1073741823};
        int i14 = iArr2[0];
        for (char c10 = 1; c10 < 2; c10 = 2) {
            int i15 = iArr2[1];
            if (i15 < i14) {
                i14 = i15;
            }
        }
        return i14;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.j(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int e(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static java.lang.Integer f(java.lang.String str, int i6) {
        java.lang.Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i10 = cCharAt == '-' ? 1 : 0;
            if (i10 != str.length()) {
                int i11 = i10 + 1;
                int iA = com.google.android.gms.internal.ads.AbstractC2540Kj0.a(str.charAt(i10));
                if (iA >= 0 && iA < 10) {
                    long j6 = -iA;
                    while (true) {
                        if (i11 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j6 != Long.MIN_VALUE) {
                                    lValueOf = java.lang.Long.valueOf(-j6);
                                    break;
                                }
                                break;
                            }
                            lValueOf = java.lang.Long.valueOf(j6);
                            break;
                        }
                        int i12 = i11 + 1;
                        int iA2 = com.google.android.gms.internal.ads.AbstractC2540Kj0.a(str.charAt(i11));
                        if (iA2 >= 0 && iA2 < 10 && j6 >= -922337203685477580L) {
                            long j10 = j6 * 10;
                            long j11 = iA2;
                            if (j10 >= Long.MIN_VALUE + j11) {
                                j6 = j10 - j11;
                                i11 = i12;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(lValueOf.intValue());
    }

    public static java.util.List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? java.util.Collections.emptyList() : new com.google.android.gms.internal.ads.C2429Hj0(iArr, 0, length);
    }

    public static int[] h(java.util.Collection collection) {
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            java.lang.Object obj = array[i6];
            obj.getClass();
            iArr[i6] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }
}
