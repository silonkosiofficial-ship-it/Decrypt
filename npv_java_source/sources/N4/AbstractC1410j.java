package N4;

/* JADX INFO: renamed from: N4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1410j {
    static java.lang.Object a(int i6) {
        if (i6 >= 2 && i6 <= 1073741824 && java.lang.Integer.highestOneBit(i6) == i6) {
            if (i6 <= 256) {
                return new byte[i6];
            }
            return i6 <= 65536 ? new short[i6] : new int[i6];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i6);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static int b(int i6, int i10) {
        return i6 & (~i10);
    }

    static int c(int i6, int i10) {
        return i6 & i10;
    }

    static int d(int i6, int i10, int i11) {
        return (i6 & (~i11)) | (i10 & i11);
    }

    static int e(int i6) {
        return (i6 < 32 ? 4 : 2) * (i6 + 1);
    }

    static int f(java.lang.Object obj, java.lang.Object obj2, int i6, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int iC = N4.AbstractC1413m.c(obj);
        int i10 = iC & i6;
        int iH = h(obj3, i10);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i6);
        int i11 = -1;
        while (true) {
            int i12 = iH - 1;
            int i13 = iArr[i12];
            if (b(i13, i6) == iB && M4.f.a(obj, objArr[i12]) && (objArr2 == null || M4.f.a(obj2, objArr2[i12]))) {
                int iC2 = c(i13, i6);
                if (i11 == -1) {
                    i(obj3, i10, iC2);
                } else {
                    iArr[i11] = d(iArr[i11], iC2, i6);
                }
                return i12;
            }
            int iC3 = c(i13, i6);
            if (iC3 == 0) {
                return -1;
            }
            i11 = i12;
            iH = iC3;
        }
    }

    static void g(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
    }

    static int h(java.lang.Object obj, int i6) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i6] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i6] & 65535 : ((int[]) obj)[i6];
    }

    static void i(java.lang.Object obj, int i6, int i10) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i10;
        } else {
            ((int[]) obj)[i6] = i10;
        }
    }

    static int j(int i6) {
        return java.lang.Math.max(4, N4.AbstractC1413m.a(i6 + 1, 1.0d));
    }
}
