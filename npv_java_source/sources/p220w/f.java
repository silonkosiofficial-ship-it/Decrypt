package p220w;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final int a(int i6, int i10, boolean z6) {
        return f(i6, i10, !z6);
    }

    public static final int b(int i6, int i10, int i11, boolean z6) {
        if (i10 >= i11) {
            return f(i10, i11, z6);
        }
        if (g(i6, i10, i11, z6)) {
            return e(i6, i10, z6);
        }
        return h(i6, i10, i11, z6) ? d(i6, i10, z6) : a(i10, i11, z6);
    }

    public static /* synthetic */ int c(int i6, int i10, int i11, boolean z6, int i12, java.lang.Object obj) {
        if ((i12 & 8) != 0) {
            z6 = true;
        }
        return b(i6, i10, i11, z6);
    }

    private static final int d(int i6, int i10, boolean z6) {
        return e(i6, i10, !z6);
    }

    private static final int e(int i6, int i10, boolean z6) {
        return z6 ? i6 : i6 - i10;
    }

    private static final int f(int i6, int i10, boolean z6) {
        if (z6) {
            return 0;
        }
        return i10 - i6;
    }

    private static final boolean g(int i6, int i10, int i11, boolean z6) {
        return h(i6, i10, i11, !z6);
    }

    private static final boolean h(int i6, int i10, int i11, boolean z6) {
        if (z6) {
            if (i10 > i6) {
                return false;
            }
        } else if (i11 - i10 <= i6) {
            return false;
        }
        return true;
    }
}
