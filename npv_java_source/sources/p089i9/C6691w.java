package p089i9;

/* JADX INFO: renamed from: i9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6691w implements p089i9.InterfaceC6677h, p089i9.N, p129m9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p089i9.C6690v f47580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p089i9.C6692x f47581b;

    public C6691w(p089i9.C6690v c6690v, p089i9.C6692x c6692x) {
        p247y7.AbstractC7350t.f(c6690v, "date");
        p247y7.AbstractC7350t.f(c6692x, "time");
        this.f47580a = c6690v;
        this.f47581b = c6692x;
    }

    public /* synthetic */ C6691w(p089i9.C6690v c6690v, p089i9.C6692x c6692x, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new p089i9.C6690v(null, null, null, null, 15, null) : c6690v, (i6 & 2) != 0 ? new p089i9.C6692x(null, null, null, null, null, null, 63, null) : c6692x);
    }

    @Override // p089i9.N
    public java.lang.Integer A() {
        return this.f47581b.A();
    }

    @Override // p089i9.N
    public void C(java.lang.Integer num) {
        this.f47581b.C(num);
    }

    @Override // p089i9.N
    public java.lang.Integer a() {
        return this.f47581b.a();
    }

    @Override // p089i9.N
    public java.lang.Integer b() {
        return this.f47581b.b();
    }

    @Override // p129m9.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p089i9.C6691w e() {
        return new p089i9.C6691w(this.f47580a.e(), this.f47581b.e());
    }

    @Override // p089i9.N
    public void d(p099j9.a aVar) {
        this.f47581b.d(aVar);
    }

    @Override // p089i9.N
    public p089i9.EnumC6676g f() {
        return this.f47581b.f();
    }

    @Override // p089i9.N
    public void g(p089i9.EnumC6676g enumC6676g) {
        this.f47581b.g(enumC6676g);
    }

    public final void h(p079h9.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "dateTime");
        this.f47580a.b(jVar.g());
        this.f47581b.h(jVar.n());
    }

    @Override // p089i9.N
    public void i(java.lang.Integer num) {
        this.f47581b.i(num);
    }

    @Override // p089i9.N
    public void j(java.lang.Integer num) {
        this.f47581b.j(num);
    }

    @Override // p089i9.InterfaceC6677h
    public void k(java.lang.Integer num) {
        this.f47580a.k(num);
    }

    public final p079h9.j l() {
        return new p079h9.j(this.f47580a.c(), this.f47581b.k());
    }

    @Override // p089i9.N
    public void m(java.lang.Integer num) {
        this.f47581b.m(num);
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer n() {
        return this.f47580a.n();
    }

    @Override // p089i9.InterfaceC6677h
    public void o(java.lang.Integer num) {
        this.f47580a.o(num);
    }

    @Override // p089i9.N
    public p099j9.a p() {
        return this.f47581b.p();
    }

    @Override // p089i9.N
    public java.lang.Integer q() {
        return this.f47581b.q();
    }

    @Override // p089i9.N
    public java.lang.Integer r() {
        return this.f47581b.r();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer s() {
        return this.f47580a.s();
    }

    @Override // p089i9.InterfaceC6677h
    public void t(java.lang.Integer num) {
        this.f47580a.t(num);
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer v() {
        return this.f47580a.v();
    }

    @Override // p089i9.InterfaceC6677h
    public java.lang.Integer w() {
        return this.f47580a.w();
    }

    @Override // p089i9.N
    public void x(java.lang.Integer num) {
        this.f47581b.x(num);
    }

    @Override // p089i9.InterfaceC6677h
    public void y(java.lang.Integer num) {
        this.f47580a.y(num);
    }
}
