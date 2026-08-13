package p229w9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements p229w9.h, p229w9.d {
    @Override // p229w9.h
    public abstract short A();

    @Override // p229w9.d
    public java.lang.Object B(p219v9.f fVar, int i6, p199t9.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return G(aVar, obj);
    }

    @Override // p229w9.h
    public float C() {
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.Float");
        return ((java.lang.Float) objH).floatValue();
    }

    @Override // p229w9.d
    public final byte D(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return y();
    }

    @Override // p229w9.d
    public p229w9.h E(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return p(fVar.h(i6));
    }

    @Override // p229w9.h
    public double F() {
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.Double");
        return ((java.lang.Double) objH).doubleValue();
    }

    public java.lang.Object G(p199t9.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return x(aVar);
    }

    public java.lang.Object H() {
        throw new p199t9.d(p247y7.P.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p229w9.h
    public p229w9.d a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this;
    }

    @Override // p229w9.d
    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
    }

    @Override // p229w9.d
    public final java.lang.String c(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return o();
    }

    @Override // p229w9.d
    public final boolean d(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return e();
    }

    @Override // p229w9.h
    public boolean e() {
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) objH).booleanValue();
    }

    @Override // p229w9.h
    public char f() {
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.Char");
        return ((java.lang.Character) objH).charValue();
    }

    @Override // p229w9.d
    public final float g(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return C();
    }

    @Override // p229w9.d
    public final short h(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return A();
    }

    @Override // p229w9.d
    public final char i(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return f();
    }

    @Override // p229w9.d
    public final double j(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return F();
    }

    @Override // p229w9.h
    public int k(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) objH).intValue();
    }

    @Override // p229w9.h
    public abstract int m();

    @Override // p229w9.h
    public java.lang.Void n() {
        return null;
    }

    @Override // p229w9.h
    public java.lang.String o() {
        java.lang.Object objH = H();
        p247y7.AbstractC7350t.d(objH, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) objH;
    }

    @Override // p229w9.h
    public p229w9.h p(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this;
    }

    @Override // p229w9.h
    public abstract long q();

    @Override // p229w9.h
    public boolean s() {
        return true;
    }

    @Override // p229w9.d
    public final int t(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return m();
    }

    @Override // p229w9.d
    public final long u(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return q();
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
    public /* synthetic */ java.lang.Object x(p199t9.a aVar) {
        return p229w9.g.a(this, aVar);
    }

    @Override // p229w9.h
    public abstract byte y();

    @Override // p229w9.d
    public final java.lang.Object z(p219v9.f fVar, int i6, p199t9.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        return (aVar.a().c() || s()) ? G(aVar, obj) : n();
    }
}
