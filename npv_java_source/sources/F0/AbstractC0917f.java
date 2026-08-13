package F0;

/* JADX INFO: renamed from: F0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0917f {
    public static int[] a(int[] iArr) {
        return iArr;
    }

    public static final int b(int[] iArr, int i6) {
        return iArr[i6 + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i6, int i10) {
        iArr[i6 + c(iArr)] = i10;
    }
}
