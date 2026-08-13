package V;

/* JADX INFO: renamed from: V.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1724j1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(int[] iArr, int i6) {
        int i10 = i6 * 5;
        if (i10 >= iArr.length) {
            return iArr.length;
        }
        return E(iArr[i10 + 1] >> 29) + iArr[i10 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int i6) {
        switch (i6) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.C1704d G(java.util.ArrayList arrayList, int i6, int i10) {
        int iU = U(arrayList, i6, i10);
        if (iU >= 0) {
            return (V.C1704d) arrayList.get(iU);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(int[] iArr, int i6, int i10, boolean z6, boolean z10, boolean z11, int i11, int i12) {
        int i13 = z6 ? 1073741824 : 0;
        int i14 = z10 ? 536870912 : 0;
        int i15 = z11 ? 268435456 : 0;
        int i16 = i6 * 5;
        iArr[i16] = i10;
        iArr[i16 + 1] = i13 | i14 | i15;
        iArr[i16 + 2] = i11;
        iArr[i16 + 3] = 0;
        iArr[i16 + 4] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(int[] iArr, int i6) {
        return (iArr[(i6 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(int[] iArr, int i6) {
        return iArr[i6 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(java.util.ArrayList arrayList, int i6, int i10) {
        int iU = U(arrayList, i6, i10);
        return iU >= 0 ? iU : -(iU + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(int[] iArr, int i6) {
        int i10 = i6 * 5;
        return iArr[i10 + 4] + E(iArr[i10 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(int[] iArr, int i6) {
        return iArr[(i6 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(java.util.ArrayList arrayList, int i6, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iA = ((V.C1704d) arrayList.get(i12)).a();
            if (iA < 0) {
                iA += i10;
            }
            int iG = p247y7.AbstractC7350t.g(iA, i6);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(int[] iArr, int i6) {
        int i10 = i6 * 5;
        return iArr[i10 + 4] + E(iArr[i10 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(int[] iArr, int i6, boolean z6) {
        int i10 = (i6 * 5) + 1;
        if (z6) {
            iArr[i10] = iArr[i10] | 67108864;
        } else {
            iArr[i10] = iArr[i10] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(int[] iArr, int i6, int i10) {
        iArr[(i6 * 5) + 4] = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(int[] iArr, int i6, int i10) {
        V.AbstractC1741q.O(i10 >= 0);
        iArr[(i6 * 5) + 3] = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(int[] iArr, int i6, boolean z6) {
        int i10 = (i6 * 5) + 1;
        if (z6) {
            iArr[i10] = iArr[i10] | 134217728;
        } else {
            iArr[i10] = iArr[i10] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(int[] iArr, int i6, int i10) {
        V.AbstractC1741q.O(i10 >= 0 && i10 < 67108863);
        int i11 = (i6 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(int[] iArr, int i6, int i10) {
        iArr[(i6 * 5) + 2] = i10;
    }
}
