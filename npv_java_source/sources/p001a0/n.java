package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p097j7.AbstractC6869k implements Y.e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p001a0.d f17017D;

    public n(p001a0.d dVar) {
        this.f17017D = dVar;
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return g((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f17017D.size();
    }

    public boolean g(java.util.Map.Entry entry) {
        if (!(entry instanceof java.util.Map.Entry)) {
            return false;
        }
        java.lang.Object obj = this.f17017D.get(entry.getKey());
        if (obj != null) {
            return p247y7.AbstractC7350t.b(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f17017D.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p001a0.o(this.f17017D.r());
    }
}
