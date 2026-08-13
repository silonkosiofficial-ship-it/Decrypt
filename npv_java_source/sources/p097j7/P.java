package p097j7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P implements java.util.Iterator, p256z7.a {
    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
