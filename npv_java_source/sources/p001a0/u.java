package p001a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f17029C = p001a0.t.f17020e.a().p();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17030D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f17031E;

    public final java.lang.Object b() {
        p021c0.a.a(f());
        return this.f17029C[this.f17031E];
    }

    public final p001a0.t c() {
        p021c0.a.a(h());
        java.lang.Object obj = this.f17029C[this.f17031E];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (p001a0.t) obj;
    }

    protected final java.lang.Object[] d() {
        return this.f17029C;
    }

    protected final int e() {
        return this.f17031E;
    }

    public final boolean f() {
        return this.f17031E < this.f17030D;
    }

    public final boolean h() {
        p021c0.a.a(this.f17031E >= this.f17030D);
        return this.f17031E < this.f17029C.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void k() {
        p021c0.a.a(f());
        this.f17031E += 2;
    }

    public final void l() {
        p021c0.a.a(h());
        this.f17031E++;
    }

    public final void m(java.lang.Object[] objArr, int i6) {
        o(objArr, i6, 0);
    }

    public final void o(java.lang.Object[] objArr, int i6, int i10) {
        this.f17029C = objArr;
        this.f17030D = i6;
        this.f17031E = i10;
    }

    protected final void p(int i6) {
        this.f17031E = i6;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
