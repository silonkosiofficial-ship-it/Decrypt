package p089i9;

/* JADX INFO: renamed from: i9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6680k implements p089i9.InterfaceC6677h, p089i9.N, p089i9.V, p129m9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p089i9.C6690v f47554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p089i9.C6692x f47555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p089i9.C6693y f47556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f47557d;

    public C6680k(p089i9.C6690v c6690v, p089i9.C6692x c6692x, p089i9.C6693y c6693y, java.lang.String str) {
        p247y7.AbstractC7350t.f(c6690v, "date");
        p247y7.AbstractC7350t.f(c6692x, "time");
        p247y7.AbstractC7350t.f(c6693y, "offset");
        this.f47554a = c6690v;
        this.f47555b = c6692x;
        this.f47556c = c6693y;
        this.f47557d = str;
    }

    public /* synthetic */ C6680k(p089i9.C6690v c6690v, p089i9.C6692x c6692x, p089i9.C6693y c6693y, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        if ((i6 & 1) != 0) {
            c6690v = new p089i9.C6690v(null, null, null, null, 15, null);
        }
        if ((i6 & 2) != 0) {
            c6692x = new p089i9.C6692x(null, null, null, null, null, null, 63, null);
        }
        this(c6690v, c6692x, (i6 & 4) != 0 ? new p089i9.C6693y(null, null, null, null, 15, null) : c6693y, (i6 & 8) != 0 ? null : str);
    }

    @Override // p089i9.N
    public java.lang.Integer A() {
        return this.f47555b.A();
    }

    @Override // p089i9.V
    public void B(java.lang.Integer num) {
        this.f47556c.B(num);
    }

    @Override // p089i9.N
    public void C(java.lang.Integer num) {
        this.f47555b.C(num);
    }

    @Override // p089i9.V
    public void D(java.lang.Integer num) {
        this.f47556c.D(num);
    }

    @Override // p089i9.V
    public void E(java.lang.Integer num) {
        this.f47556c.E(num);
    }

    @Override // p129m9.c
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public p089i9.C6680k e() {
        return new p089i9.C6680k(this.f47554a.e(), this.f47555b.e(), this.f47556c.e(), this.f47557d);
    }

    public final p089i9.C6690v G() {
        return this.f47554a;
    }

    public final p089i9.C6693y H() {
        return this.f47556c;
    }

    public final p089i9.C6692x I() {
        return this.f47555b;
    }

    public final java.lang.String J() {
        return this.f47557d;
    }

    public final void K(java.lang.String str) {
        this.f47557d = str;
    }

    @Override // p089i9.N
    public java.lang.Integer a() {
        return this.f47555b.a();
    }

    @Override // p089i9.N
    public java.lang.Integer b() {
        return this.f47555b.b();
    }

    @Override // p089i9.V
    public java.lang.Boolean c() {
        return this.f47556c.c();
    }

    @Override // p089i9.N
    public void d(p099j9.a aVar) {
        this.f47555b.d(aVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.C6680k) {
            p089i9.C6680k c6680k = (p089i9.C6680k) obj;
            if (p247y7.AbstractC7350t.b(c6680k.f47554a, this.f47554a) && p247y7.AbstractC7350t.b(c6680k.f47555b, this.f47555b) && p247y7.AbstractC7350t.b(c6680k.f47556c, this.f47556c) && p247y7.AbstractC7350t.b(c6680k.f47557d, this.f47557d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p089i9.N
    public p089i9.EnumC6676g f() {
        return this.f47555b.f();
    }

    @Override // p089i9.N
    public void g(p089i9.EnumC6676g enumC6676g) {
        this.f47555b.g(enumC6676g);
    }

    @Override // p089i9.V
    public java.lang.Integer h() {
        return this.f47556c.h();
    }

    public int hashCode() {
        int iHashCode = (this.f47554a.hashCode() ^ this.f47555b.hashCode()) ^ this.f47556c.hashCode();
        java.lang.String str = this.f47557d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // p089i9.N
    public void i(java.lang.Integer num) {
        this.f47555b.i(num);
    }

    @Override // p089i9.N
    public void j(java.lang.Integer num) {
        this.f47555b.j(num);
    }

    @Override // p089i9.InterfaceC6677h
    public void k(java.lang.Integer num) {
        this.f47554a.k(num);
    }

    @Override // p089i9.V
    public java.lang.Integer l() {
        return this.f47556c.l();
    }

    @Override // p089i9.N
    public void m(java.lang.Integer num) {
        this.f47555b.m(num);
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer n() {
        return this.f47554a.n();
    }

    @Override // p089i9.InterfaceC6677h
    public void o(java.lang.Integer num) {
        this.f47554a.o(num);
    }

    @Override // p089i9.N
    public p099j9.a p() {
        return this.f47555b.p();
    }

    @Override // p089i9.N
    public java.lang.Integer q() {
        return this.f47555b.q();
    }

    @Override // p089i9.N
    public java.lang.Integer r() {
        return this.f47555b.r();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer s() {
        return this.f47554a.s();
    }

    @Override // p089i9.InterfaceC6677h
    public void t(java.lang.Integer num) {
        this.f47554a.t(num);
    }

    @Override // p089i9.V
    public java.lang.Integer u() {
        return this.f47556c.u();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer v() {
        return this.f47554a.v();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer w() {
        return this.f47554a.w();
    }

    @Override // p089i9.N
    public void x(java.lang.Integer num) {
        this.f47555b.x(num);
    }

    @Override // p089i9.InterfaceC6677h
    public void y(java.lang.Integer num) {
        this.f47554a.y(num);
    }

    @Override // p089i9.V
    public void z(java.lang.Boolean bool) {
        this.f47556c.z(bool);
    }
}
