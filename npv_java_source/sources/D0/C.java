package D0;

/* JADX INFO: loaded from: classes.dex */
public final class C implements V.InterfaceC1728l {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final F0.J f1738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private V.AbstractC1744s f1739D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private D0.k0 f1740E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f1741F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f1742G;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f1751P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f1752Q;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.HashMap f1743H = new java.util.HashMap();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.HashMap f1744I = new java.util.HashMap();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final D0.C.c f1745J = new D0.C.c();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final D0.C.b f1746K = new D0.C.b();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.util.HashMap f1747L = new java.util.HashMap();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final D0.k0.a f1748M = new D0.k0.a(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.util.Map f1749N = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final X.b f1750O = new X.b(new java.lang.Object[16], 0);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final java.lang.String f1753R = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Object f1754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p237x7.p f1755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V.InterfaceC1700b1 f1756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private V.InterfaceC1753w0 f1759f;

        public a(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1700b1 interfaceC1700b1) {
            this.f1754a = obj;
            this.f1755b = pVar;
            this.f1756c = interfaceC1700b1;
            this.f1759f = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);
        }

        public /* synthetic */ a(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1700b1 interfaceC1700b1, int i6, p247y7.AbstractC7342k abstractC7342k) {
            this(obj, pVar, (i6 & 4) != 0 ? null : interfaceC1700b1);
        }

        public final boolean a() {
            return ((java.lang.Boolean) this.f1759f.getValue()).booleanValue();
        }

        public final V.InterfaceC1700b1 b() {
            return this.f1756c;
        }

        public final p237x7.p c() {
            return this.f1755b;
        }

        public final boolean d() {
            return this.f1757d;
        }

        public final boolean e() {
            return this.f1758e;
        }

        public final java.lang.Object f() {
            return this.f1754a;
        }

        public final void g(boolean z6) {
            this.f1759f.setValue(java.lang.Boolean.valueOf(z6));
        }

        public final void h(V.InterfaceC1753w0 interfaceC1753w0) {
            this.f1759f = interfaceC1753w0;
        }

        public final void i(V.InterfaceC1700b1 interfaceC1700b1) {
            this.f1756c = interfaceC1700b1;
        }

        public final void j(p237x7.p pVar) {
            this.f1755b = pVar;
        }

        public final void k(boolean z6) {
            this.f1757d = z6;
        }

        public final void l(boolean z6) {
            this.f1758e = z6;
        }

        public final void m(java.lang.Object obj) {
            this.f1754a = obj;
        }
    }

    private final class b implements D0.j0, D0.M {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final /* synthetic */ D0.C.c f1760C;

        public b() {
            this.f1760C = D0.C.this.f1745J;
        }

        @Override // D0.InterfaceC0896o
        public boolean A0() {
            return this.f1760C.A0();
        }

        @Override // Y0.e
        public float B0(float f6) {
            return this.f1760C.B0(f6);
        }

        @Override // Y0.e
        public int K0(long j6) {
            return this.f1760C.K0(j6);
        }

        @Override // Y0.n
        public long O(float f6) {
            return this.f1760C.O(f6);
        }

        @Override // D0.M
        public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
            return this.f1760C.O0(i6, i10, map, lVar, lVar2);
        }

        @Override // Y0.e
        public long P(long j6) {
            return this.f1760C.P(j6);
        }

        @Override // Y0.e
        public int S0(float f6) {
            return this.f1760C.S0(f6);
        }

        @Override // Y0.n
        public float X(long j6) {
            return this.f1760C.X(j6);
        }

        @Override // Y0.e
        public long b1(long j6) {
            return this.f1760C.b1(j6);
        }

        @Override // D0.j0
        public java.util.List c1(java.lang.Object obj, p237x7.p pVar) {
            F0.J j6 = (F0.J) D0.C.this.f1744I.get(obj);
            java.util.List listG = j6 != null ? j6.G() : null;
            return listG != null ? listG : D0.C.this.F(obj, pVar);
        }

        @Override // D0.M
        public D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
            return this.f1760C.f0(i6, i10, map, lVar);
        }

        @Override // Y0.e
        public float g1(long j6) {
            return this.f1760C.g1(j6);
        }

        @Override // Y0.e
        public float getDensity() {
            return this.f1760C.getDensity();
        }

        @Override // D0.InterfaceC0896o
        public Y0.v getLayoutDirection() {
            return this.f1760C.getLayoutDirection();
        }

        @Override // Y0.e
        public long k0(float f6) {
            return this.f1760C.k0(f6);
        }

        @Override // Y0.e
        public float o0(int i6) {
            return this.f1760C.o0(i6);
        }

        @Override // Y0.e
        public float q0(float f6) {
            return this.f1760C.q0(f6);
        }

        @Override // Y0.n
        public float v0() {
            return this.f1760C.v0();
        }
    }

    private final class c implements D0.j0 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private Y0.v f1762C = Y0.v.Rtl;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private float f1763D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private float f1764E;

        public static final class a implements D0.K {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ java.util.Map f1768c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p237x7.l f1769d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ D0.C.c f1770e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ D0.C f1771f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p237x7.l f1772g;

            a(int i6, int i10, java.util.Map map, p237x7.l lVar, D0.C.c cVar, D0.C c6, p237x7.l lVar2) {
                this.f1766a = i6;
                this.f1767b = i10;
                this.f1768c = map;
                this.f1769d = lVar;
                this.f1770e = cVar;
                this.f1771f = c6;
                this.f1772g = lVar2;
            }

            @Override // D0.K
            public java.util.Map f() {
                return this.f1768c;
            }

            @Override // D0.K
            public int getHeight() {
                return this.f1767b;
            }

            @Override // D0.K
            public int getWidth() {
                return this.f1766a;
            }

            @Override // D0.K
            public void k() {
                F0.U uJ2;
                if (!this.f1770e.A0() || (uJ2 = this.f1771f.f1738C.P().j2()) == null) {
                    this.f1772g.l(this.f1771f.f1738C.P().s1());
                } else {
                    this.f1772g.l(uJ2.s1());
                }
            }

            @Override // D0.K
            public p237x7.l l() {
                return this.f1769d;
            }
        }

        public c() {
        }

        @Override // D0.InterfaceC0896o
        public boolean A0() {
            return D0.C.this.f1738C.X() == F0.J.e.LookaheadLayingOut || D0.C.this.f1738C.X() == F0.J.e.LookaheadMeasuring;
        }

        @Override // Y0.e
        public /* synthetic */ float B0(float f6) {
            return Y0.d.g(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ int K0(long j6) {
            return Y0.d.a(this, j6);
        }

        @Override // Y0.n
        public /* synthetic */ long O(float f6) {
            return Y0.m.b(this, f6);
        }

        @Override // D0.M
        public D0.K O0(int i6, int i10, java.util.Map map, p237x7.l lVar, p237x7.l lVar2) {
            if (!((i6 & (-16777216)) == 0 && ((-16777216) & i10) == 0)) {
                C0.a.b("Size(" + i6 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new D0.C.c.a(i6, i10, map, lVar, this, D0.C.this, lVar2);
        }

        @Override // Y0.e
        public /* synthetic */ long P(long j6) {
            return Y0.d.e(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ int S0(float f6) {
            return Y0.d.b(this, f6);
        }

        @Override // Y0.n
        public /* synthetic */ float X(long j6) {
            return Y0.m.a(this, j6);
        }

        @Override // Y0.e
        public /* synthetic */ long b1(long j6) {
            return Y0.d.h(this, j6);
        }

        @Override // D0.j0
        public java.util.List c1(java.lang.Object obj, p237x7.p pVar) {
            return D0.C.this.K(obj, pVar);
        }

        public void f(float f6) {
            this.f1763D = f6;
        }

        @Override // D0.M
        public /* synthetic */ D0.K f0(int i6, int i10, java.util.Map map, p237x7.l lVar) {
            return D0.L.a(this, i6, i10, map, lVar);
        }

        @Override // Y0.e
        public /* synthetic */ float g1(long j6) {
            return Y0.d.f(this, j6);
        }

        @Override // Y0.e
        public float getDensity() {
            return this.f1763D;
        }

        @Override // D0.InterfaceC0896o
        public Y0.v getLayoutDirection() {
            return this.f1762C;
        }

        public void k(float f6) {
            this.f1764E = f6;
        }

        @Override // Y0.e
        public /* synthetic */ long k0(float f6) {
            return Y0.d.i(this, f6);
        }

        @Override // Y0.e
        public /* synthetic */ float o0(int i6) {
            return Y0.d.d(this, i6);
        }

        @Override // Y0.e
        public /* synthetic */ float q0(float f6) {
            return Y0.d.c(this, f6);
        }

        public void s(Y0.v vVar) {
            this.f1762C = vVar;
        }

        @Override // Y0.n
        public float v0() {
            return this.f1764E;
        }
    }

    public static final class d extends F0.J.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1774c;

        public static final class a implements D0.K {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ D0.K f1775a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ D0.C f1776b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1777c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ D0.K f1778d;

            public a(D0.K k6, D0.C c6, int i6, D0.K k10) {
                this.f1776b = c6;
                this.f1777c = i6;
                this.f1778d = k10;
                this.f1775a = k6;
            }

            @Override // D0.K
            public java.util.Map f() {
                return this.f1775a.f();
            }

            @Override // D0.K
            public int getHeight() {
                return this.f1775a.getHeight();
            }

            @Override // D0.K
            public int getWidth() {
                return this.f1775a.getWidth();
            }

            @Override // D0.K
            public void k() {
                this.f1776b.f1742G = this.f1777c;
                this.f1778d.k();
                this.f1776b.y();
            }

            @Override // D0.K
            public p237x7.l l() {
                return this.f1775a.l();
            }
        }

        public static final class b implements D0.K {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ D0.K f1779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ D0.C f1780b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1781c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ D0.K f1782d;

            public b(D0.K k6, D0.C c6, int i6, D0.K k10) {
                this.f1780b = c6;
                this.f1781c = i6;
                this.f1782d = k10;
                this.f1779a = k6;
            }

            @Override // D0.K
            public java.util.Map f() {
                return this.f1779a.f();
            }

            @Override // D0.K
            public int getHeight() {
                return this.f1779a.getHeight();
            }

            @Override // D0.K
            public int getWidth() {
                return this.f1779a.getWidth();
            }

            @Override // D0.K
            public void k() {
                this.f1780b.f1741F = this.f1781c;
                this.f1782d.k();
                D0.C c6 = this.f1780b;
                c6.x(c6.f1741F);
            }

            @Override // D0.K
            public p237x7.l l() {
                return this.f1779a.l();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p237x7.p pVar, java.lang.String str) {
            super(str);
            this.f1774c = pVar;
        }

        @Override // D0.I
        public D0.K b(D0.M m6, java.util.List list, long j6) {
            D0.C.this.f1745J.s(m6.getLayoutDirection());
            D0.C.this.f1745J.f(m6.getDensity());
            D0.C.this.f1745J.k(m6.v0());
            if (m6.A0() || D0.C.this.f1738C.b0() == null) {
                D0.C.this.f1741F = 0;
                D0.K k6 = (D0.K) this.f1774c.u(D0.C.this.f1745J, Y0.C1859b.a(j6));
                return new D0.C.d.b(k6, D0.C.this, D0.C.this.f1741F, k6);
            }
            D0.C.this.f1742G = 0;
            D0.K k10 = (D0.K) this.f1774c.u(D0.C.this.f1746K, Y0.C1859b.a(j6));
            return new D0.C.d.a(k10, D0.C.this, D0.C.this.f1742G, k10);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.util.Map.Entry entry) {
            boolean z6;
            java.lang.Object key = entry.getKey();
            D0.i0.a aVar = (D0.i0.a) entry.getValue();
            int iV = D0.C.this.f1750O.v(key);
            if (iV < 0 || iV >= D0.C.this.f1742G) {
                aVar.e();
                z6 = true;
            } else {
                z6 = false;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    public static final class f implements D0.i0.a {
        f() {
        }

        @Override // D0.i0.a
        public /* synthetic */ int b() {
            return D0.h0.a(this);
        }

        @Override // D0.i0.a
        public void e() {
        }

        @Override // D0.i0.a
        public /* synthetic */ void f(java.lang.Object obj, p237x7.l lVar) {
            D0.h0.c(this, obj, lVar);
        }

        @Override // D0.i0.a
        public /* synthetic */ void g(int i6, long j6) {
            D0.h0.b(this, i6, j6);
        }
    }

    public static final class g implements D0.i0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1785b;

        g(java.lang.Object obj) {
            this.f1785b = obj;
        }

        @Override // D0.i0.a
        public int b() {
            java.util.List listH;
            F0.J j6 = (F0.J) D0.C.this.f1747L.get(this.f1785b);
            if (j6 == null || (listH = j6.H()) == null) {
                return 0;
            }
            return listH.size();
        }

        @Override // D0.i0.a
        public void e() {
            D0.C.this.B();
            F0.J j6 = (F0.J) D0.C.this.f1747L.remove(this.f1785b);
            if (j6 != null) {
                if (D0.C.this.f1752Q <= 0) {
                    throw new java.lang.IllegalStateException("No pre-composed items to dispose".toString());
                }
                int iIndexOf = D0.C.this.f1738C.M().indexOf(j6);
                if (iIndexOf < D0.C.this.f1738C.M().size() - D0.C.this.f1752Q) {
                    throw new java.lang.IllegalStateException("Item is not in pre-composed item range".toString());
                }
                D0.C.this.f1751P++;
                D0.C.this.f1752Q--;
                int size = (D0.C.this.f1738C.M().size() - D0.C.this.f1752Q) - D0.C.this.f1751P;
                D0.C.this.D(iIndexOf, size, 1);
                D0.C.this.x(size);
            }
        }

        @Override // D0.i0.a
        public void f(java.lang.Object obj, p237x7.l lVar) {
            F0.C0910b0 c0910b0K0;
            androidx.compose.ui.d.c cVarK;
            F0.J j6 = (F0.J) D0.C.this.f1747L.get(this.f1785b);
            if (j6 == null || (c0910b0K0 = j6.k0()) == null || (cVarK = c0910b0K0.k()) == null) {
                return;
            }
            F0.F0.e(cVarK, obj, lVar);
        }

        @Override // D0.i0.a
        public void g(int i6, long j6) {
            F0.J j10 = (F0.J) D0.C.this.f1747L.get(this.f1785b);
            if (j10 == null || !j10.K0()) {
                return;
            }
            int size = j10.H().size();
            if (i6 < 0 || i6 >= size) {
                throw new java.lang.IndexOutOfBoundsException("Index (" + i6 + ") is out of bound of [0, " + size + ')');
            }
            if (!(!j10.k())) {
                throw new java.lang.IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
            F0.J j11 = D0.C.this.f1738C;
            j11.f2353P = true;
            F0.N.b(j10).l((F0.J) j10.H().get(i6), j6);
            j11.f2353P = false;
        }
    }

    static final class h extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.C.a f1786D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1787E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(D0.C.a aVar, p237x7.p pVar) {
            super(2);
            this.f1786D = aVar;
            this.f1787E = pVar;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1750409193, i6, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
            }
            boolean zA = this.f1786D.a();
            p237x7.p pVar = this.f1787E;
            interfaceC1734n.w(207, java.lang.Boolean.valueOf(zA));
            boolean zD = interfaceC1734n.d(zA);
            interfaceC1734n.T(-869707859);
            if (zA) {
                pVar.u(interfaceC1734n, 0);
            } else {
                interfaceC1734n.p(zD);
            }
            interfaceC1734n.J();
            interfaceC1734n.e();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(F0.J j6, D0.k0 k0Var) {
        this.f1738C = j6;
        this.f1740E = k0Var;
    }

    private final java.lang.Object A(int i6) {
        java.lang.Object obj = this.f1743H.get((F0.J) this.f1738C.M().get(i6));
        p247y7.AbstractC7350t.c(obj);
        return ((D0.C.a) obj).f();
    }

    private final void C(boolean z6) {
        this.f1752Q = 0;
        this.f1747L.clear();
        int size = this.f1738C.M().size();
        if (this.f1751P != size) {
            this.f1751P = size;
            f0.k.a aVar = p051f0.k.f44821e;
            p051f0.k kVarD = aVar.d();
            p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
            p051f0.k kVarF = aVar.f(kVarD);
            for (int i6 = 0; i6 < size; i6++) {
                try {
                    F0.J j6 = (F0.J) this.f1738C.M().get(i6);
                    D0.C.a aVar2 = (D0.C.a) this.f1743H.get(j6);
                    if (aVar2 != null && aVar2.a()) {
                        H(j6);
                        if (z6) {
                            V.InterfaceC1700b1 interfaceC1700b1B = aVar2.b();
                            if (interfaceC1700b1B != null) {
                                interfaceC1700b1B.deactivate();
                            }
                            aVar2.h(V.A1.d(java.lang.Boolean.FALSE, null, 2, null));
                        } else {
                            aVar2.g(false);
                        }
                        aVar2.m(D0.g0.f1844a);
                    }
                } catch (java.lang.Throwable th) {
                    aVar.m(kVarD, kVarF, lVarH);
                    throw th;
                }
            }
            p087i7.M m6 = p087i7.M.f46721a;
            aVar.m(kVarD, kVarF, lVarH);
            this.f1744I.clear();
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i6, int i10, int i11) {
        F0.J j6 = this.f1738C;
        j6.f2353P = true;
        this.f1738C.e1(i6, i10, i11);
        j6.f2353P = false;
    }

    static /* synthetic */ void E(D0.C c6, int i6, int i10, int i11, int i12, java.lang.Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        c6.D(i6, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List F(java.lang.Object obj, p237x7.p pVar) {
        if (this.f1750O.t() < this.f1742G) {
            throw new java.lang.IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        int iT = this.f1750O.t();
        int i6 = this.f1742G;
        if (iT == i6) {
            this.f1750O.d(obj);
        } else {
            this.f1750O.J(i6, obj);
        }
        this.f1742G++;
        if (!this.f1747L.containsKey(obj)) {
            this.f1749N.put(obj, G(obj, pVar));
            if (this.f1738C.X() == F0.J.e.LayingOut) {
                this.f1738C.p1(true);
            } else {
                F0.J.s1(this.f1738C, true, false, false, 6, null);
            }
        }
        F0.J j6 = (F0.J) this.f1747L.get(obj);
        if (j6 == null) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.List listO1 = j6.d0().o1();
        int size = listO1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((F0.O.b) listO1.get(i10)).y1();
        }
        return listO1;
    }

    private final void H(F0.J j6) {
        F0.O.b bVarD0 = j6.d0();
        F0.J.g gVar = F0.J.g.NotUsed;
        bVarD0.L1(gVar);
        F0.O.a aVarA0 = j6.a0();
        if (aVarA0 != null) {
            aVarA0.E1(gVar);
        }
    }

    private final void L(F0.J j6, D0.C.a aVar) {
        f0.k.a aVar2 = p051f0.k.f44821e;
        p051f0.k kVarD = aVar2.d();
        p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
        p051f0.k kVarF = aVar2.f(kVarD);
        try {
            F0.J j10 = this.f1738C;
            j10.f2353P = true;
            p237x7.p pVarC = aVar.c();
            V.InterfaceC1700b1 interfaceC1700b1B = aVar.b();
            V.AbstractC1744s abstractC1744s = this.f1739D;
            if (abstractC1744s == null) {
                throw new java.lang.IllegalStateException("parent composition reference not set".toString());
            }
            aVar.i(N(interfaceC1700b1B, j6, aVar.e(), abstractC1744s, p031d0.c.c(-1750409193, true, new D0.C.h(aVar, pVarC))));
            aVar.l(false);
            j10.f2353P = false;
            p087i7.M m6 = p087i7.M.f46721a;
            aVar2.m(kVarD, kVarF, lVarH);
        } catch (java.lang.Throwable th) {
            aVar2.m(kVarD, kVarF, lVarH);
            throw th;
        }
    }

    private final void M(F0.J j6, java.lang.Object obj, p237x7.p pVar) {
        java.util.HashMap map = this.f1743H;
        java.lang.Object aVar = map.get(j6);
        if (aVar == null) {
            aVar = new D0.C.a(obj, D0.C0888g.f1841a.a(), null, 4, null);
            map.put(j6, aVar);
        }
        D0.C.a aVar2 = (D0.C.a) aVar;
        V.InterfaceC1700b1 interfaceC1700b1B = aVar2.b();
        boolean zS = interfaceC1700b1B != null ? interfaceC1700b1B.s() : true;
        if (aVar2.c() != pVar || zS || aVar2.d()) {
            aVar2.j(pVar);
            L(j6, aVar2);
            aVar2.k(false);
        }
    }

    private final V.InterfaceC1700b1 N(V.InterfaceC1700b1 interfaceC1700b1, F0.J j6, boolean z6, V.AbstractC1744s abstractC1744s, p237x7.p pVar) {
        if (interfaceC1700b1 == null || interfaceC1700b1.l()) {
            interfaceC1700b1 = androidx.compose.ui.platform.S1.a(j6, abstractC1744s);
        }
        if (z6) {
            interfaceC1700b1.t(pVar);
        } else {
            interfaceC1700b1.h(pVar);
        }
        return interfaceC1700b1;
    }

    private final F0.J O(java.lang.Object obj) {
        int i6;
        if (this.f1751P == 0) {
            return null;
        }
        int size = this.f1738C.M().size() - this.f1752Q;
        int i10 = size - this.f1751P;
        int i11 = size - 1;
        int i12 = i11;
        while (true) {
            if (i12 < i10) {
                i6 = -1;
                break;
            }
            if (p247y7.AbstractC7350t.b(A(i12), obj)) {
                i6 = i12;
                break;
            }
            i12--;
        }
        if (i6 == -1) {
            while (true) {
                if (i11 < i10) {
                    i12 = i11;
                    break;
                }
                java.lang.Object obj2 = this.f1743H.get((F0.J) this.f1738C.M().get(i11));
                p247y7.AbstractC7350t.c(obj2);
                D0.C.a aVar = (D0.C.a) obj2;
                if (aVar.f() == D0.g0.f1844a || this.f1740E.a(obj, aVar.f())) {
                    aVar.m(obj);
                    i12 = i11;
                    i6 = i12;
                    break;
                }
                i11--;
            }
        }
        if (i6 == -1) {
            return null;
        }
        if (i12 != i10) {
            D(i12, i10, 1);
        }
        this.f1751P--;
        F0.J j6 = (F0.J) this.f1738C.M().get(i10);
        java.lang.Object obj3 = this.f1743H.get(j6);
        p247y7.AbstractC7350t.c(obj3);
        D0.C.a aVar2 = (D0.C.a) obj3;
        aVar2.h(V.A1.d(java.lang.Boolean.TRUE, null, 2, null));
        aVar2.l(true);
        aVar2.k(true);
        return j6;
    }

    private final F0.J v(int i6) {
        F0.J j6 = new F0.J(true, 0, 2, null);
        F0.J j10 = this.f1738C;
        j10.f2353P = true;
        this.f1738C.B0(i6, j6);
        j10.f2353P = false;
        return j6;
    }

    private final void w() {
        F0.J j6 = this.f1738C;
        j6.f2353P = true;
        java.util.Iterator it = this.f1743H.values().iterator();
        while (it.hasNext()) {
            V.InterfaceC1700b1 interfaceC1700b1B = ((D0.C.a) it.next()).b();
            if (interfaceC1700b1B != null) {
                interfaceC1700b1B.e();
            }
        }
        this.f1738C.m1();
        j6.f2353P = false;
        this.f1743H.clear();
        this.f1744I.clear();
        this.f1752Q = 0;
        this.f1751P = 0;
        this.f1747L.clear();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        p097j7.AbstractC6879v.H(this.f1749N.entrySet(), new D0.C.e());
    }

    public final void B() {
        int size = this.f1738C.M().size();
        if (this.f1743H.size() != size) {
            throw new java.lang.IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f1743H.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f1751P) - this.f1752Q >= 0) {
            if (this.f1747L.size() == this.f1752Q) {
                return;
            }
            throw new java.lang.IllegalArgumentException(("Incorrect state. Precomposed children " + this.f1752Q + ". Map size " + this.f1747L.size()).toString());
        }
        throw new java.lang.IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f1751P + ". Precomposed children " + this.f1752Q).toString());
    }

    public final D0.i0.a G(java.lang.Object obj, p237x7.p pVar) {
        if (!this.f1738C.K0()) {
            return new D0.C.f();
        }
        B();
        if (!this.f1744I.containsKey(obj)) {
            this.f1749N.remove(obj);
            java.util.HashMap map = this.f1747L;
            java.lang.Object objO = map.get(obj);
            if (objO == null) {
                objO = O(obj);
                if (objO != null) {
                    D(this.f1738C.M().indexOf(objO), this.f1738C.M().size(), 1);
                } else {
                    objO = v(this.f1738C.M().size());
                }
                this.f1752Q++;
                map.put(obj, objO);
            }
            M((F0.J) objO, obj, pVar);
        }
        return new D0.C.g(obj);
    }

    public final void I(V.AbstractC1744s abstractC1744s) {
        this.f1739D = abstractC1744s;
    }

    public final void J(D0.k0 k0Var) {
        if (this.f1740E != k0Var) {
            this.f1740E = k0Var;
            C(false);
            F0.J.w1(this.f1738C, false, false, false, 7, null);
        }
    }

    public final java.util.List K(java.lang.Object obj, p237x7.p pVar) {
        B();
        F0.J.e eVarX = this.f1738C.X();
        F0.J.e eVar = F0.J.e.Measuring;
        if (!(eVarX == eVar || eVarX == F0.J.e.LayingOut || eVarX == F0.J.e.LookaheadMeasuring || eVarX == F0.J.e.LookaheadLayingOut)) {
            C0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        java.util.HashMap map = this.f1744I;
        java.lang.Object obj2 = map.get(obj);
        if (obj2 == null) {
            obj2 = (F0.J) this.f1747L.remove(obj);
            if (obj2 != null) {
                if (!(this.f1752Q > 0)) {
                    C0.a.b("Check failed.");
                }
                this.f1752Q--;
            } else {
                F0.J jO = O(obj);
                if (jO == null) {
                    jO = v(this.f1741F);
                }
                obj2 = jO;
            }
            map.put(obj, obj2);
        }
        F0.J j6 = (F0.J) obj2;
        if (p097j7.AbstractC6879v.l0(this.f1738C.M(), this.f1741F) != j6) {
            int iIndexOf = this.f1738C.M().indexOf(j6);
            int i6 = this.f1741F;
            if (iIndexOf < i6) {
                throw new java.lang.IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i6 != iIndexOf) {
                E(this, iIndexOf, i6, 0, 4, null);
            }
        }
        this.f1741F++;
        M(j6, obj, pVar);
        return (eVarX == eVar || eVarX == F0.J.e.LayingOut) ? j6.G() : j6.F();
    }

    @Override // V.InterfaceC1728l
    public void f() {
        w();
    }

    @Override // V.InterfaceC1728l
    public void i() {
        C(true);
    }

    @Override // V.InterfaceC1728l
    public void p() {
        C(false);
    }

    public final D0.I u(p237x7.p pVar) {
        return new D0.C.d(pVar, this.f1753R);
    }

    public final void x(int i6) {
        boolean z6 = false;
        this.f1751P = 0;
        int size = (this.f1738C.M().size() - this.f1752Q) - 1;
        if (i6 <= size) {
            this.f1748M.clear();
            if (i6 <= size) {
                int i10 = i6;
                while (true) {
                    this.f1748M.add(A(i10));
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f1740E.b(this.f1748M);
            f0.k.a aVar = p051f0.k.f44821e;
            p051f0.k kVarD = aVar.d();
            p237x7.l lVarH = kVarD != null ? kVarD.h() : null;
            p051f0.k kVarF = aVar.f(kVarD);
            boolean z10 = false;
            while (size >= i6) {
                try {
                    F0.J j6 = (F0.J) this.f1738C.M().get(size);
                    java.lang.Object obj = this.f1743H.get(j6);
                    p247y7.AbstractC7350t.c(obj);
                    D0.C.a aVar2 = (D0.C.a) obj;
                    java.lang.Object objF = aVar2.f();
                    if (this.f1748M.contains(objF)) {
                        this.f1751P++;
                        if (aVar2.a()) {
                            H(j6);
                            aVar2.g(false);
                            z10 = true;
                        }
                    } else {
                        F0.J j10 = this.f1738C;
                        j10.f2353P = true;
                        this.f1743H.remove(j6);
                        V.InterfaceC1700b1 interfaceC1700b1B = aVar2.b();
                        if (interfaceC1700b1B != null) {
                            interfaceC1700b1B.e();
                        }
                        this.f1738C.n1(size, 1);
                        j10.f2353P = false;
                    }
                    this.f1744I.remove(objF);
                    size--;
                } catch (java.lang.Throwable th) {
                    aVar.m(kVarD, kVarF, lVarH);
                    throw th;
                }
            }
            p087i7.M m6 = p087i7.M.f46721a;
            aVar.m(kVarD, kVarF, lVarH);
            z6 = z10;
        }
        if (z6) {
            p051f0.k.f44821e.n();
        }
        B();
    }

    public final void z() {
        if (this.f1751P != this.f1738C.M().size()) {
            java.util.Iterator it = this.f1743H.entrySet().iterator();
            while (it.hasNext()) {
                ((D0.C.a) ((java.util.Map.Entry) it.next()).getValue()).k(true);
            }
            if (this.f1738C.e0()) {
                return;
            }
            F0.J.w1(this.f1738C, false, false, false, 7, null);
        }
    }
}
