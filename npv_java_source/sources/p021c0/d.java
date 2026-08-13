package p021c0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p021c0.d f24403a = new p021c0.d();

    private d() {
    }

    public static final void a(int i6, int i10) {
        if (i6 < 0 || i6 >= i10) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i6 + ", size: " + i10);
        }
    }

    public static final void b(int i6, int i10) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IndexOutOfBoundsException("index: " + i6 + ", size: " + i10);
        }
    }

    public static final void c(int i6, int i10, int i11) {
        if (i6 < 0 || i10 > i11) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i6 + ", toIndex: " + i10 + ", size: " + i11);
        }
        if (i6 <= i10) {
            return;
        }
        throw new java.lang.IllegalArgumentException("fromIndex: " + i6 + " > toIndex: " + i10);
    }
}
