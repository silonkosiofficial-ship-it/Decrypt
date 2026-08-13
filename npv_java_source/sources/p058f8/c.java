package p058f8;

/* JADX INFO: loaded from: classes2.dex */
final class c implements P7.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p138n8.c f45303C;

    public c(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqNameToMatch");
        this.f45303C = cVar;
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        return P7.g.b.b(this, cVar);
    }

    @Override // P7.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p058f8.b j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        if (p247y7.AbstractC7350t.b(cVar, this.f45303C)) {
            return p058f8.b.f45302a;
        }
        return null;
    }

    @Override // P7.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return p097j7.AbstractC6879v.m().iterator();
    }
}
