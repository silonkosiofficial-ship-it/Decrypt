package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 implements p229w9.h, p229w9.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f56927b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56928c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object I(p239x9.B0 b6, p199t9.a aVar, java.lang.Object obj) {
        return (aVar.a().c() || b6.s()) ? b6.K(aVar, obj) : b6.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object J(p239x9.B0 b6, p199t9.a aVar, java.lang.Object obj) {
        return b6.K(aVar, obj);
    }

    private final java.lang.Object b0(java.lang.Object obj, p237x7.a aVar) {
        a0(obj);
        java.lang.Object objB = aVar.b();
        if (!this.f56928c) {
            Z();
        }
        this.f56928c = false;
        return objB;
    }

    @Override // p229w9.h
    public final short A() {
        return U(Z());
    }

    @Override // p229w9.d
    public final java.lang.Object B(p219v9.f fVar, int i6, final p199t9.a aVar, final java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return b0(X(fVar, i6), new p237x7.a() { // from class: x9.z0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.B0.J(this.f57067C, aVar, obj);
            }
        });
    }

    @Override // p229w9.h
    public final float C() {
        return Q(Z());
    }

    @Override // p229w9.d
    public final byte D(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return M(X(fVar, i6));
    }

    @Override // p229w9.d
    public final p229w9.h E(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return R(X(fVar, i6), fVar.h(i6));
    }

    @Override // p229w9.h
    public final double F() {
        return O(Z());
    }

    protected java.lang.Object K(p199t9.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return x(aVar);
    }

    protected abstract boolean L(java.lang.Object obj);

    protected abstract byte M(java.lang.Object obj);

    protected abstract char N(java.lang.Object obj);

    protected abstract double O(java.lang.Object obj);

    protected abstract int P(java.lang.Object obj, p219v9.f fVar);

    protected abstract float Q(java.lang.Object obj);

    protected p229w9.h R(java.lang.Object obj, p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "inlineDescriptor");
        a0(obj);
        return this;
    }

    protected abstract int S(java.lang.Object obj);

    protected abstract long T(java.lang.Object obj);

    protected abstract short U(java.lang.Object obj);

    protected abstract java.lang.String V(java.lang.Object obj);

    protected final java.lang.Object W() {
        return p097j7.AbstractC6879v.v0(this.f56927b);
    }

    protected abstract java.lang.Object X(p219v9.f fVar, int i6);

    public final java.util.ArrayList Y() {
        return this.f56927b;
    }

    protected final java.lang.Object Z() {
        java.util.ArrayList arrayList = this.f56927b;
        java.lang.Object objRemove = arrayList.remove(p097j7.AbstractC6879v.o(arrayList));
        this.f56928c = true;
        return objRemove;
    }

    protected final void a0(java.lang.Object obj) {
        this.f56927b.add(obj);
    }

    @Override // p229w9.d
    public final java.lang.String c(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return V(X(fVar, i6));
    }

    @Override // p229w9.d
    public final boolean d(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return L(X(fVar, i6));
    }

    @Override // p229w9.h
    public final boolean e() {
        return L(Z());
    }

    @Override // p229w9.h
    public final char f() {
        return N(Z());
    }

    @Override // p229w9.d
    public final float g(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return Q(X(fVar, i6));
    }

    @Override // p229w9.d
    public final short h(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return U(X(fVar, i6));
    }

    @Override // p229w9.d
    public final char i(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return N(X(fVar, i6));
    }

    @Override // p229w9.d
    public final double j(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return O(X(fVar, i6));
    }

    @Override // p229w9.h
    public final int k(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        return P(Z(), fVar);
    }

    @Override // p229w9.h
    public final int m() {
        return S(Z());
    }

    @Override // p229w9.h
    public final java.lang.Void n() {
        return null;
    }

    @Override // p229w9.h
    public final java.lang.String o() {
        return V(Z());
    }

    @Override // p229w9.h
    public p229w9.h p(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return R(Z(), fVar);
    }

    @Override // p229w9.h
    public final long q() {
        return T(Z());
    }

    @Override // p229w9.d
    public final int t(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return S(X(fVar, i6));
    }

    @Override // p229w9.d
    public final long u(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return T(X(fVar, i6));
    }

    @Override // p229w9.d
    public /* synthetic */ boolean v() {
        return p229w9.c.b(this);
    }

    @Override // p229w9.d
    public /* synthetic */ int w(p219v9.f fVar) {
        return p229w9.c.a(this, fVar);
    }

    @Override // p229w9.h
    public abstract /* synthetic */ java.lang.Object x(p199t9.a aVar);

    @Override // p229w9.h
    public final byte y() {
        return M(Z());
    }

    @Override // p229w9.d
    public final java.lang.Object z(p219v9.f fVar, int i6, final p199t9.a aVar, final java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return b0(X(fVar, i6), new p237x7.a() { // from class: x9.A0
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p239x9.B0.I(this.f56923C, aVar, obj);
            }
        });
    }
}
