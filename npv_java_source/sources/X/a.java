package X;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseArray f15548a;

    public a(int i6) {
        this(new android.util.SparseArray(i6));
    }

    public /* synthetic */ a(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 10 : i6);
    }

    private a(android.util.SparseArray sparseArray) {
        this.f15548a = sparseArray;
    }

    public final java.lang.Object a(int i6) {
        return this.f15548a.get(i6);
    }

    public final void b(int i6, java.lang.Object obj) {
        this.f15548a.put(i6, obj);
    }
}
