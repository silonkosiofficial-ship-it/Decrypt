package p097j7;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Iterator f49290C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f49291D;

    public N(java.util.Iterator it) {
        p247y7.AbstractC7350t.f(it, "iterator");
        this.f49290C = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p097j7.L next() {
        int i6 = this.f49291D;
        this.f49291D = i6 + 1;
        if (i6 < 0) {
            p097j7.AbstractC6879v.w();
        }
        return new p097j7.L(i6, this.f49290C.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49290C.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
