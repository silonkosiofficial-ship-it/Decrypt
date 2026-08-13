package T6;

/* JADX INFO: renamed from: T6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663k implements T6.G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T6.C1663k f13178c = new T6.C1663k();

    private C1663k() {
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
    public void e(p237x7.p pVar) {
        T6.G.b.a(this, pVar);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof T6.G) && ((T6.G) obj).isEmpty();
    }

    @Override // W6.y
    public boolean isEmpty() {
        return true;
    }

    @Override // W6.y
    public java.util.Set names() {
        return p097j7.Z.d();
    }

    public java.lang.String toString() {
        return "Parameters " + a();
    }
}
