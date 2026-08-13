package p170r;

/* JADX INFO: renamed from: r.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7035j implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f53382C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f53383D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f53384E;

    public AbstractC7035j(int i6) {
        this.f53382C = i6;
    }

    protected abstract java.lang.Object b(int i6);

    protected abstract void c(int i6);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53383D < this.f53382C;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object objB = b(this.f53383D);
        this.f53383D++;
        this.f53384E = true;
        return objB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f53384E) {
            p180s.d.b("Call next() before removing an element.");
        }
        int i6 = this.f53383D - 1;
        this.f53383D = i6;
        c(i6);
        this.f53382C--;
        this.f53384E = false;
    }
}
