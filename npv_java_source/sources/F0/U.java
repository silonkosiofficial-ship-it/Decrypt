package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends F0.T implements D0.G {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final F0.AbstractC0914d0 f2514R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.util.Map f2516T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private D0.K f2518V;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f2515S = Y0.p.f16221b.a();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final D0.E f2517U = new D0.E(this);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final java.util.Map f2519W = new java.util.LinkedHashMap();

    public U(F0.AbstractC0914d0 abstractC0914d0) {
        this.f2514R = abstractC0914d0;
    }

    private final void N1(long j6) {
        if (!Y0.p.g(t1(), j6)) {
            Q1(j6);
            F0.O.a aVarH = o1().V().H();
            if (aVarH != null) {
                aVarH.v1();
            }
            v1(this.f2514R);
        }
        if (y1()) {
            return;
        }
        i1(q1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(D0.K k6) {
        p087i7.M m6;
        java.util.Map map;
        if (k6 != null) {
            Y0(Y0.u.a(k6.getWidth(), k6.getHeight()));
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        if (m6 == null) {
            Y0(Y0.t.f16230b.a());
        }
        if (!p247y7.AbstractC7350t.b(this.f2518V, k6) && k6 != null && ((((map = this.f2516T) != null && !map.isEmpty()) || (!k6.f().isEmpty())) && !p247y7.AbstractC7350t.b(k6.f(), this.f2516T))) {
            G1().f().m();
            java.util.Map linkedHashMap = this.f2516T;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.f2516T = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(k6.f());
        }
        this.f2518V = k6;
    }

    @Override // F0.T, D0.InterfaceC0896o
    public boolean A0() {
        return true;
    }

    @Override // F0.T
    public void B1() {
        R0(t1(), 0.0f, null);
    }

    public F0.InterfaceC0909b G1() {
        F0.InterfaceC0909b interfaceC0909bC = this.f2514R.o1().V().C();
        p247y7.AbstractC7350t.c(interfaceC0909bC);
        return interfaceC0909bC;
    }

    public final int H1(D0.AbstractC0882a abstractC0882a) {
        java.lang.Integer num = (java.lang.Integer) this.f2519W.get(abstractC0882a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    protected final java.util.Map I1() {
        return this.f2519W;
    }

    public final long J1() {
        return E0();
    }

    public final F0.AbstractC0914d0 K1() {
        return this.f2514R;
    }

    public final D0.E L1() {
        return this.f2517U;
    }

    protected void M1() {
        q1().k();
    }

    public final void O1(long j6) {
        N1(Y0.p.l(j6, u0()));
    }

    public final long P1(F0.U u6, boolean z6) {
        long jA = Y0.p.f16221b.a();
        F0.U uJ2 = this;
        while (!p247y7.AbstractC7350t.b(uJ2, u6)) {
            if (!uJ2.x1() || !z6) {
                jA = Y0.p.l(jA, uJ2.t1());
            }
            F0.AbstractC0914d0 abstractC0914d0P2 = uJ2.f2514R.p2();
            p247y7.AbstractC7350t.c(abstractC0914d0P2);
            uJ2 = abstractC0914d0P2.j2();
            p247y7.AbstractC7350t.c(uJ2);
        }
        return jA;
    }

    public void Q1(long j6) {
        this.f2515S = j6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // D0.X
    public final void R0(long j6, float f6, p237x7.l lVar) {
        N1(j6);
        if (z1()) {
            return;
        }
        M1();
    }

    public abstract int S(int i6);

    public abstract int T(int i6);

    @Override // D0.X, D0.InterfaceC0895n
    public java.lang.Object Z() {
        return this.f2514R.Z();
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f2514R.getDensity();
    }

    @Override // D0.InterfaceC0896o
    public Y0.v getLayoutDirection() {
        return this.f2514R.getLayoutDirection();
    }

    @Override // F0.T
    public F0.T k1() {
        F0.AbstractC0914d0 abstractC0914d0O2 = this.f2514R.o2();
        if (abstractC0914d0O2 != null) {
            return abstractC0914d0O2.j2();
        }
        return null;
    }

    @Override // F0.T
    public D0.InterfaceC0900t m1() {
        return this.f2517U;
    }

    public abstract int n0(int i6);

    @Override // F0.T
    public boolean n1() {
        return this.f2518V != null;
    }

    @Override // F0.T
    public F0.J o1() {
        return this.f2514R.o1();
    }

    @Override // F0.T
    public D0.K q1() {
        D0.K k6 = this.f2518V;
        if (k6 != null) {
            return k6;
        }
        throw new java.lang.IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // F0.T
    public F0.T r1() {
        F0.AbstractC0914d0 abstractC0914d0P2 = this.f2514R.p2();
        if (abstractC0914d0P2 != null) {
            return abstractC0914d0P2.j2();
        }
        return null;
    }

    public abstract int t(int i6);

    @Override // F0.T
    public long t1() {
        return this.f2515S;
    }

    @Override // Y0.n
    public float v0() {
        return this.f2514R.v0();
    }
}
