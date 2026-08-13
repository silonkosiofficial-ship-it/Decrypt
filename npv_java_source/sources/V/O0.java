package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0 extends V.AbstractC1752w {
    public O0(p237x7.a aVar) {
        super(aVar, null);
    }

    private final V.M1 f(V.P0 p6) {
        if (!p6.i()) {
            if (p6.c() != null) {
                return new V.F(p6.c());
            }
            return p6.f() != null ? new V.P(p6.f()) : new V.I1(p6.d());
        }
        V.InterfaceC1753w0 interfaceC1753w0F = p6.f();
        if (interfaceC1753w0F == null) {
            java.lang.Object objG = p6.g();
            V.u1 u1VarE = p6.e();
            if (u1VarE == null) {
                u1VarE = V.v1.p();
            }
            interfaceC1753w0F = V.v1.h(objG, u1VarE);
        }
        return new V.P(interfaceC1753w0F);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 V.M1) = (r5v5 V.M1), (r5v6 V.M1) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // V.AbstractC1752w
    public V.M1 b(V.P0 p6, V.M1 m6) {
        V.F f6;
        V.M1 m10;
        V.I1 i6;
        V.P p10;
        V.M1 m11 = null;
        m11 = null;
        m11 = null;
        m11 = null;
        m11 = null;
        if (m6 instanceof V.P) {
            if (p6.i()) {
                p10 = (V.P) m6;
                p10.b().setValue(p6.d());
            }
        } else if (m6 instanceof V.I1) {
            if (p6.j()) {
                i6 = (V.I1) m6;
                if (p247y7.AbstractC7350t.b(p6.d(), i6.b())) {
                    m10 = f6;
                    m10 = i6;
                    m11 = m10;
                }
            }
        } else if (m6 instanceof V.F) {
            f6 = (V.F) m6;
            if (p6.c() == f6.b()) {
                m10 = f6;
                m10 = i6;
                m11 = m10;
            }
        }
        if (m11 == null) {
            m11 = p10;
            return f(p6);
        }
        m11 = p10;
        return m11;
    }

    public abstract V.P0 c(java.lang.Object obj);

    public final V.P0 d(java.lang.Object obj) {
        return c(obj);
    }

    public final V.P0 e(java.lang.Object obj) {
        return c(obj).h();
    }
}
