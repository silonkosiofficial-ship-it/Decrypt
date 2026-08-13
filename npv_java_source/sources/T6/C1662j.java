package T6;

/* JADX INFO: renamed from: T6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1662j implements T6.InterfaceC1668p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T6.C1662j f13177c = new T6.C1662j();

    private C1662j() {
    }

    @Override // W6.y
    public java.util.Set a() {
        return p097j7.Z.d();
    }

    @Override // W6.y
    public boolean b() {
        return true;
    }

    @Override // W6.y
    public java.util.List c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return null;
    }

    @Override // W6.y
    public java.lang.String d(java.lang.String str) {
        return T6.InterfaceC1668p.b.b(this, str);
    }

    @Override // W6.y
    public void e(p237x7.p pVar) {
        T6.InterfaceC1668p.b.a(this, pVar);
    }

    @Override // W6.y
    public java.util.Set names() {
        return p097j7.Z.d();
    }

    public java.lang.String toString() {
        return "Headers " + a();
    }
}
