package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2573Lh0 {
    static int a(int i6) {
        return (i6 < 32 ? 4 : 2) * (i6 + 1);
    }

    static int b(java.lang.Object obj, java.lang.Object obj2, int i6, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int iB = com.google.android.gms.internal.ads.AbstractC2903Uh0.b(obj);
        int i10 = iB & i6;
        int iC = c(obj3, i10);
        if (iC != 0) {
            int i11 = ~i6;
            int i12 = iB & i11;
            int i13 = -1;
            while (true) {
                int i14 = iC - 1;
                int i15 = iArr[i14];
                int i16 = i15 & i6;
                if ((i15 & i11) != i12 || !com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj, objArr[i14]) || (objArr2 != null && !com.google.android.gms.internal.ads.AbstractC5700xg0.a(obj2, objArr2[i14]))) {
                    if (i16 == 0) {
                        break;
                    }
                    i13 = i14;
                    iC = i16;
                } else {
                    if (i13 == -1) {
                        e(obj3, i10, i16);
                    } else {
                        iArr[i13] = (iArr[i13] & i11) | (i16 & i6);
                    }
                    return i14;
                }
            }
        }
        return -1;
    }

    static int c(java.lang.Object obj, int i6) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i6] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i6] : ((int[]) obj)[i6];
    }

    static java.lang.Object d(int i6) {
        if (i6 >= 2 && i6 <= 1073741824 && java.lang.Integer.highestOneBit(i6) == i6) {
            if (i6 <= 256) {
                return new byte[i6];
            }
            return i6 <= 65536 ? new short[i6] : new int[i6];
        }
        throw new java.lang.IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i6);
    }

    static void e(java.lang.Object obj, int i6, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i10;
        } else {
            ((int[]) obj)[i6] = i10;
        }
    }
}
