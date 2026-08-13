package A;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f22b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f23c;

    public Q(A.C0788w c0788w, java.lang.String str) {
        this.f22b = str;
        this.f23c = V.A1.d(c0788w, null, 2, null);
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return e().c();
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return e().a();
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return e().d();
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return e().b();
    }

    public final A.C0788w e() {
        return (A.C0788w) this.f23c.getValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A.Q) {
            return p247y7.AbstractC7350t.b(e(), ((A.Q) obj).e());
        }
        return false;
    }

    public final void f(A.C0788w c0788w) {
        this.f23c.setValue(c0788w);
    }

    public int hashCode() {
        return this.f22b.hashCode();
    }

    public java.lang.String toString() {
        return this.f22b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
