package F0;

/* JADX INFO: loaded from: classes.dex */
abstract class B0 {
    public static final void a(int[] iArr, F0.C0938y c0938y) {
        int iH;
        int i6;
        if (!f(iArr)) {
            c0938y.g(h(iArr), i(iArr), d(iArr) - h(iArr));
            return;
        }
        if (!g(iArr)) {
            if (j(iArr)) {
                iH = h(iArr);
                i6 = i(iArr) + 1;
            } else {
                iH = h(iArr) + 1;
            }
            c0938y.g(iH, i6, c(iArr));
        }
        iH = h(iArr);
        i6 = i(iArr);
        c0938y.g(iH, i6, c(iArr));
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    public static final int c(int[] iArr) {
        return java.lang.Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        return e(iArr) - i(iArr) != d(iArr) - h(iArr);
    }

    public static final boolean g(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        return e(iArr) - i(iArr) > d(iArr) - h(iArr);
    }
}
