package p011b0;

/* JADX INFO: loaded from: classes.dex */
public class c implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object f24003C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f24004D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f24005E;

    public c(java.lang.Object obj, java.util.Map map) {
        this.f24003C = obj;
        this.f24004D = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24005E < this.f24004D.size();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        java.lang.Object obj = this.f24003C;
        this.f24005E++;
        java.lang.Object obj2 = this.f24004D.get(obj);
        if (obj2 != null) {
            this.f24003C = ((p011b0.a) obj2).c();
            return obj;
        }
        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
