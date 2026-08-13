package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p097j7.AbstractC6860b implements Y.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.d f17019C;

    public r(p001a0.d dVar) {
        this.f17019C = dVar;
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.f17019C.containsValue(obj);
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f17019C.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new p001a0.s(this.f17019C.r());
    }
}
