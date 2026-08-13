package p167q7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    private static final int a(int i6, int i10, int i11) {
        return c(c(i6, i11) - c(i10, i11), i11);
    }

    public static final int b(int i6, int i10, int i11) {
        if (i11 > 0) {
            return i6 >= i10 ? i10 : i10 - a(i10, i6, i11);
        }
        if (i11 < 0) {
            return i6 <= i10 ? i10 : i10 + a(i6, i10, -i11);
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    private static final int c(int i6, int i10) {
        int i11 = i6 % i10;
        return i11 >= 0 ? i11 : i11 + i10;
    }
}
