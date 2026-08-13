package p097j7;

/* JADX INFO: renamed from: j7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6878u implements java.util.Iterator, p256z7.a {
    public abstract char b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
