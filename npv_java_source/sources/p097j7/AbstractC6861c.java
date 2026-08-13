package p097j7;

/* JADX INFO: renamed from: j7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6861c implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f49296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object f49297D;

    private final boolean e() {
        this.f49296C = 3;
        b();
        return this.f49296C == 1;
    }

    protected abstract void b();

    protected final void c() {
        this.f49296C = 2;
    }

    protected final void d(java.lang.Object obj) {
        this.f49297D = obj;
        this.f49296C = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i6 = this.f49296C;
        if (i6 == 0) {
            return e();
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i6 = this.f49296C;
        if (i6 != 1 && (i6 == 2 || !e())) {
            throw new java.util.NoSuchElementException();
        }
        this.f49296C = 0;
        return this.f49297D;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
