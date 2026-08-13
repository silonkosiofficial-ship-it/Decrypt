package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p097j7.AbstractC6869k implements Y.e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p001a0.d f17018D;

    public p(p001a0.d dVar) {
        this.f17018D = dVar;
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.f17018D.containsKey(obj);
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f17018D.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p001a0.q(this.f17018D.r());
    }
}
