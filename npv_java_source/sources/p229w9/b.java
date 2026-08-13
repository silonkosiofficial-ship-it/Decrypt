package p229w9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements p229w9.j, p229w9.f {
    @Override // p229w9.j
    public void A(int i6) {
        H(java.lang.Integer.valueOf(i6));
    }

    @Override // p229w9.f
    public final void B(p219v9.f fVar, int i6, long j6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            D(j6);
        }
    }

    @Override // p229w9.f
    public final void C(p219v9.f fVar, int i6, char c6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            p(c6);
        }
    }

    @Override // p229w9.j
    public void D(long j6) {
        H(java.lang.Long.valueOf(j6));
    }

    @Override // p229w9.j
    public void E(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        H(str);
    }

    public boolean F(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return true;
    }

    public /* synthetic */ void G(p199t9.e eVar, java.lang.Object obj) {
        p229w9.i.c(this, eVar, obj);
    }

    public void H(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "value");
        throw new p199t9.d("Non-serializable " + p247y7.P.b(obj.getClass()) + " is not supported by " + p247y7.P.b(getClass()) + " encoder");
    }

    @Override // p229w9.j
    public p229w9.f a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this;
    }

    @Override // p229w9.f
    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
    }

    @Override // p229w9.f
    public final void c(p219v9.f fVar, int i6, short s6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            h(s6);
        }
    }

    @Override // p229w9.j
    public void d() {
        throw new p199t9.d("'null' is not supported by default");
    }

    @Override // p229w9.f
    public final void e(p219v9.f fVar, int i6, float f6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            n(f6);
        }
    }

    @Override // p229w9.f
    public final void f(p219v9.f fVar, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            l(z6);
        }
    }

    @Override // p229w9.j
    public void g(double d6) {
        H(java.lang.Double.valueOf(d6));
    }

    @Override // p229w9.j
    public void h(short s6) {
        H(java.lang.Short.valueOf(s6));
    }

    @Override // p229w9.j
    public void i(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "enumDescriptor");
        H(java.lang.Integer.valueOf(i6));
    }

    @Override // p229w9.j
    public void j(byte b6) {
        H(java.lang.Byte.valueOf(b6));
    }

    @Override // p229w9.j
    public /* synthetic */ p229w9.f k(p219v9.f fVar, int i6) {
        return p229w9.i.a(this, fVar, i6);
    }

    @Override // p229w9.j
    public void l(boolean z6) {
        H(java.lang.Boolean.valueOf(z6));
    }

    @Override // p229w9.f
    public final void m(p219v9.f fVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            A(i10);
        }
    }

    @Override // p229w9.j
    public void n(float f6) {
        H(java.lang.Float.valueOf(f6));
    }

    @Override // p229w9.f
    public /* synthetic */ boolean o(p219v9.f fVar, int i6) {
        return p229w9.e.a(this, fVar, i6);
    }

    @Override // p229w9.j
    public void p(char c6) {
        H(java.lang.Character.valueOf(c6));
    }

    @Override // p229w9.j
    public /* synthetic */ void q() {
        p229w9.i.b(this);
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
        if (F(fVar, i6)) {
            j(b6);
        }
    }

    @Override // p229w9.j
    public /* synthetic */ void t(p199t9.e eVar, java.lang.Object obj) {
        p229w9.i.d(this, eVar, obj);
    }

    @Override // p229w9.f
    public final p229w9.j u(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return F(fVar, i6) ? w(fVar.h(i6)) : p239x9.W.f56977a;
    }

    @Override // p229w9.f
    public final void v(p219v9.f fVar, int i6, double d6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        if (F(fVar, i6)) {
            g(d6);
        }
    }

    @Override // p229w9.j
    public p229w9.j w(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return this;
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
        if (F(fVar, i6)) {
            E(str);
        }
    }
}
