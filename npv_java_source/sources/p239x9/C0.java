package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 implements p229w9.j, p229w9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f56931a = new java.util.ArrayList();

    private final boolean F(p219v9.f fVar, int i6) {
        X(V(fVar, i6));
        return true;
    }

    @Override // p229w9.j
    public final void A(int i6) {
        O(W(), i6);
    }

    @Override // p229w9.f
    public final void B(p219v9.f fVar, int i6, long j6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        P(V(fVar, i6), j6);
    }

    @Override // p229w9.f
    public final void C(p219v9.f fVar, int i6, char c6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        J(V(fVar, i6), c6);
    }

    @Override // p229w9.j
    public final void D(long j6) {
        P(W(), j6);
    }

    @Override // p229w9.j
    public final void E(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        R(W(), str);
    }

    public /* synthetic */ void G(p199t9.e eVar, java.lang.Object obj) {
        p229w9.i.c(this, eVar, obj);
    }

    protected abstract void H(java.lang.Object obj, boolean z6);

    protected abstract void I(java.lang.Object obj, byte b6);

    protected abstract void J(java.lang.Object obj, char c6);

    protected abstract void K(java.lang.Object obj, double d6);

    protected abstract void L(java.lang.Object obj, p219v9.f fVar, int i6);

    protected abstract void M(java.lang.Object obj, float f6);

    protected p229w9.j N(java.lang.Object obj, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "inlineDescriptor");
        X(obj);
        return this;
    }

    protected abstract void O(java.lang.Object obj, int i6);

    protected abstract void P(java.lang.Object obj, long j6);

    protected abstract void Q(java.lang.Object obj, short s6);

    protected abstract void R(java.lang.Object obj, java.lang.String str);

    protected abstract void S(p219v9.f fVar);

    protected final java.lang.Object T() {
        return p097j7.AbstractC6879v.t0(this.f56931a);
    }

    protected final java.lang.Object U() {
        return p097j7.AbstractC6879v.v0(this.f56931a);
    }

    protected abstract java.lang.Object V(p219v9.f fVar, int i6);

    protected final java.lang.Object W() {
        if (!(!this.f56931a.isEmpty())) {
            throw new p199t9.d("No tag in stack for requested element");
        }
        java.util.ArrayList arrayList = this.f56931a;
        return arrayList.remove(p097j7.AbstractC6879v.o(arrayList));
    }

    protected final void X(java.lang.Object obj) {
        this.f56931a.add(obj);
    }

    @Override // p229w9.f
    public final void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (!this.f56931a.isEmpty()) {
            W();
        }
        S(fVar);
    }

    @Override // p229w9.f
    public final void c(p219v9.f fVar, int i6, short s6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        Q(V(fVar, i6), s6);
    }

    @Override // p229w9.f
    public final void e(p219v9.f fVar, int i6, float f6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        M(V(fVar, i6), f6);
    }

    @Override // p229w9.f
    public final void f(p219v9.f fVar, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        H(V(fVar, i6), z6);
    }

    @Override // p229w9.j
    public final void g(double d6) {
        K(W(), d6);
    }

    @Override // p229w9.j
    public final void h(short s6) {
        Q(W(), s6);
    }

    @Override // p229w9.j
    public final void i(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        L(W(), fVar, i6);
    }

    @Override // p229w9.j
    public final void j(byte b6) {
        I(W(), b6);
    }

    @Override // p229w9.j
    public /* synthetic */ p229w9.f k(p219v9.f fVar, int i6) {
        return p229w9.i.a(this, fVar, i6);
    }

    @Override // p229w9.j
    public final void l(boolean z6) {
        H(W(), z6);
    }

    @Override // p229w9.f
    public final void m(p219v9.f fVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        O(V(fVar, i6), i10);
    }

    @Override // p229w9.j
    public final void n(float f6) {
        M(W(), f6);
    }

    @Override // p229w9.j
    public final void p(char c6) {
        J(W(), c6);
    }

    @Override // p229w9.f
    public void r(p219v9.f fVar, int i6, p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (F(fVar, i6)) {
            t(eVar, obj);
        }
    }

    @Override // p229w9.f
    public final void s(p219v9.f fVar, int i6, byte b6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        I(V(fVar, i6), b6);
    }

    @Override // p229w9.j
    public abstract /* synthetic */ void t(p199t9.e eVar, java.lang.Object obj);

    @Override // p229w9.f
    public final p229w9.j u(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return N(V(fVar, i6), fVar.h(i6));
    }

    @Override // p229w9.f
    public final void v(p219v9.f fVar, int i6, double d6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        K(V(fVar, i6), d6);
    }

    @Override // p229w9.j
    public p229w9.j w(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return N(W(), fVar);
    }

    @Override // p229w9.f
    public void x(p219v9.f fVar, int i6, p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (F(fVar, i6)) {
            G(eVar, obj);
        }
    }

    @Override // p229w9.f
    public final void y(p219v9.f fVar, int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(str, "value");
        R(V(fVar, i6), str);
    }
}
