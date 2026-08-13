package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p001a0.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.f f17013C;

    public h(p001a0.f fVar) {
        this.f17013C = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17013C.clear();
    }

    @Override // p097j7.AbstractC6868j
    public int d() {
        return this.f17013C.size();
    }

    @Override // p001a0.a
    public boolean f(java.util.Map.Entry entry) {
        java.lang.Object obj = this.f17013C.get(entry.getKey());
        if (obj != null) {
            return p247y7.AbstractC7350t.b(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f17013C.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p001a0.i(this.f17013C);
    }

    @Override // p001a0.a
    public boolean o(java.util.Map.Entry entry) {
        return this.f17013C.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean add(java.util.Map.Entry entry) {
        throw new java.lang.UnsupportedOperationException();
    }
}
