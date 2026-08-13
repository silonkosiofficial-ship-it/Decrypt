package Z;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Z.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f16652E;

    public i(java.lang.Object obj, int i6) {
        super(i6, 1);
        this.f16652E = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        f(d() + 1);
        return this.f16652E;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        c();
        f(d() - 1);
        return this.f16652E;
    }
}
