package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends U7.p implements p048e8.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.c f14611a;

    public w(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        this.f14611a = cVar;
    }

    @Override // p048e8.u
    public java.util.Collection E() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // p048e8.u
    public p138n8.c e() {
        return this.f14611a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.w) && p247y7.AbstractC7350t.b(e(), ((U7.w) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // p048e8.InterfaceC6538d
    public p048e8.InterfaceC6535a j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return null;
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.List k() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return false;
    }

    public java.lang.String toString() {
        return U7.w.class.getName() + ": " + e();
    }

    @Override // p048e8.u
    public java.util.Collection x(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.AbstractC6879v.m();
    }
}
