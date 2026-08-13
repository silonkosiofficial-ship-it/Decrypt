package p051f0;

/* JADX INFO: loaded from: classes.dex */
final class w implements java.util.ListIterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p051f0.r f44904C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f44905D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f44906E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f44907F;

    public w(p051f0.r rVar, int i6) {
        this.f44904C = rVar;
        this.f44905D = i6 - 1;
        this.f44907F = rVar.g();
    }

    private final void b() {
        if (this.f44904C.g() != this.f44907F) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        b();
        this.f44904C.add(this.f44905D + 1, obj);
        this.f44906E = -1;
        this.f44905D++;
        this.f44907F = this.f44904C.g();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f44905D < this.f44904C.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f44905D >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i6 = this.f44905D + 1;
        this.f44906E = i6;
        p051f0.s.g(i6, this.f44904C.size());
        java.lang.Object obj = this.f44904C.get(i6);
        this.f44905D = i6;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f44905D + 1;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        p051f0.s.g(this.f44905D, this.f44904C.size());
        int i6 = this.f44905D;
        this.f44906E = i6;
        java.lang.Object obj = this.f44904C.get(i6);
        this.f44905D--;
        return obj;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f44905D;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.f44904C.remove(this.f44905D);
        this.f44905D--;
        this.f44906E = -1;
        this.f44907F = this.f44904C.g();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i6 = this.f44906E;
        if (i6 < 0) {
            p051f0.s.e();
            throw new p087i7.C6665k();
        }
        this.f44904C.set(i6, obj);
        this.f44907F = this.f44904C.g();
    }
}
