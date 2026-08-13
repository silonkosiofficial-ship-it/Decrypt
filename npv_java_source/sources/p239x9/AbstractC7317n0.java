package p239x9;

/* JADX INFO: renamed from: x9.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7317n0 {
    public static /* synthetic */ void c(p239x9.AbstractC7317n0 abstractC7317n0, int i6, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i10 & 1) != 0) {
            i6 = abstractC7317n0.d() + 1;
        }
        abstractC7317n0.b(i6);
    }

    public abstract java.lang.Object a();

    public abstract void b(int i6);

    public abstract int d();
}
