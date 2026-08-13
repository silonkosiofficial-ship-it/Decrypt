package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15253b;

    public static final class A extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.A f15254c = new W.d.A();

        /* JADX WARN: Illegal instructions before constructor call */
        private A() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.W0();
        }
    }

    public static final class B extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.B f15255c = new W.d.B();

        private B() {
            super(1, 0, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            int iB = eVar.b(W.d.q.a(0));
            int iE0 = c1727k1.e0();
            int iC0 = c1727k1.c0();
            int iD1 = c1727k1.d1(iC0);
            int iC1 = c1727k1.c1(iC0);
            for (int iMax = java.lang.Math.max(iD1, iC1 - iB); iMax < iC1; iMax++) {
                java.lang.Object obj = c1727k1.f14908c[c1727k1.R(iMax)];
                if (obj instanceof V.C1697a1) {
                    y6.a(((V.C1697a1) obj).b(), iE0 - iMax, -1, -1);
                } else if (obj instanceof V.R0) {
                    ((V.R0) obj).x();
                }
            }
            c1727k1.k1(iB);
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "count" : super.e(i6);
        }
    }

    public static final class C extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C f15256c = new W.d.C();

        private C() {
            super(1, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            int iF;
            int iE0;
            java.lang.Object objA = eVar.a(W.d.t.a(0));
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(1));
            int iB = eVar.b(W.d.q.a(0));
            if (objA instanceof V.C1697a1) {
                y6.d(((V.C1697a1) objA).b());
            }
            int iF2 = c1727k1.F(c1704d);
            java.lang.Object objR0 = c1727k1.R0(iF2, iB, objA);
            if (!(objR0 instanceof V.C1697a1)) {
                if (objR0 instanceof V.R0) {
                    ((V.R0) objR0).x();
                    return;
                }
                return;
            }
            int iE1 = c1727k1.e0() - c1727k1.a1(iF2, iB);
            V.C1697a1 c1697a1 = (V.C1697a1) objR0;
            V.C1704d c1704dA = c1697a1.a();
            if (c1704dA == null || !c1704dA.b()) {
                iF = -1;
                iE0 = -1;
            } else {
                iF = c1727k1.F(c1704dA);
                iE0 = c1727k1.e0() - c1727k1.b1(iF);
            }
            y6.a(c1697a1.b(), iE1, iF, iE0);
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "groupSlotIndex" : super.e(i6);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "value";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "anchor" : super.f(i6);
        }
    }

    public static final class D extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.D f15257c = new W.d.D();

        /* JADX WARN: Illegal instructions before constructor call */
        private D() {
            int i6 = 1;
            super(0, i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.o1(eVar.a(W.d.t.a(0)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "data" : super.f(i6);
        }
    }

    public static final class E extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.E f15258c = new W.d.E();

        private E() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            ((p237x7.p) eVar.a(W.d.t.a(1))).u(interfaceC1713g.b(), eVar.a(W.d.t.a(0)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "value";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "block" : super.f(i6);
        }
    }

    public static final class F extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.F f15259c = new W.d.F();

        /* JADX WARN: Illegal instructions before constructor call */
        private F() {
            int i6 = 1;
            super(i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            java.lang.Object objA = eVar.a(W.d.t.a(0));
            int iB = eVar.b(W.d.q.a(0));
            if (objA instanceof V.C1697a1) {
                y6.d(((V.C1697a1) objA).b());
            }
            java.lang.Object objS0 = c1727k1.S0(iB, objA);
            if (objS0 instanceof V.C1697a1) {
                y6.a(((V.C1697a1) objS0).b(), c1727k1.e0() - c1727k1.a1(c1727k1.a0(), iB), -1, -1);
            } else if (objS0 instanceof V.R0) {
                ((V.R0) objS0).x();
            }
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "groupSlotIndex" : super.e(i6);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "value" : super.f(i6);
        }
    }

    public static final class G extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.G f15260c = new W.d.G();

        private G() {
            super(1, 0, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            int iB = eVar.b(W.d.q.a(0));
            for (int i6 = 0; i6 < iB; i6++) {
                interfaceC1713g.g();
            }
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "count" : super.e(i6);
        }
    }

    public static final class H extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.H f15261c = new W.d.H();

        /* JADX WARN: Illegal instructions before constructor call */
        private H() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            java.lang.Object objB = interfaceC1713g.b();
            p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((V.InterfaceC1728l) objB).p();
        }
    }

    /* JADX INFO: renamed from: W.d$a, reason: case insensitive filesystem */
    public static final class C1760a extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1760a f15262c = new W.d.C1760a();

        private C1760a() {
            super(1, 0, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.D(eVar.b(W.d.q.a(0)));
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "distance" : super.e(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$b, reason: case insensitive filesystem */
    public static final class C1761b extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1761b f15263c = new W.d.C1761b();

        private C1761b() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(0));
            java.lang.Object objA = eVar.a(W.d.t.a(1));
            if (objA instanceof V.C1697a1) {
                y6.d(((V.C1697a1) objA).b());
            }
            c1727k1.G(c1704d, objA);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "anchor";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "value" : super.f(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$c, reason: case insensitive filesystem */
    public static final class C1762c extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1762c f15264c = new W.d.C1762c();

        private C1762c() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            p031d0.d dVar = (p031d0.d) eVar.a(W.d.t.a(1));
            int iA = dVar != null ? dVar.a() : 0;
            W.a aVar = (W.a) eVar.a(W.d.t.a(0));
            if (iA > 0) {
                interfaceC1713g = new V.C1757y0(interfaceC1713g, iA);
            }
            aVar.b(interfaceC1713g, c1727k1, y6);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "changes";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "effectiveNodeIndex" : super.f(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$d, reason: collision with other inner class name */
    public static final class C0292d extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C0292d f15265c = new W.d.C0292d();

        private C0292d() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            int iA = ((p031d0.d) eVar.a(W.d.t.a(0))).a();
            java.util.List list = (java.util.List) eVar.a(W.d.t.a(1));
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.Object obj = list.get(i6);
                p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i10 = iA + i6;
                interfaceC1713g.c(i10, obj);
                interfaceC1713g.h(i10, obj);
            }
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "effectiveNodeIndex";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "nodes" : super.f(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$e, reason: case insensitive filesystem */
    public static final class C1763e extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1763e f15266c = new W.d.C1763e();

        private C1763e() {
            super(0, 4, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.C1738o0 c1738o0 = (V.C1738o0) eVar.a(W.d.t.a(2));
            V.AbstractC1744s abstractC1744s = (V.AbstractC1744s) eVar.a(W.d.t.a(1));
            abstractC1744s.l(c1738o0);
            V.AbstractC1741q.s("Could not resolve state for movable content");
            throw new p087i7.C6665k();
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "resolvedState";
            }
            if (W.d.t.b(i6, W.d.t.a(1))) {
                return "resolvedCompositionContext";
            }
            if (W.d.t.b(i6, W.d.t.a(2))) {
                return "from";
            }
            return W.d.t.b(i6, W.d.t.a(3)) ? "to" : super.f(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$f, reason: case insensitive filesystem */
    public static final class C1764f extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1764f f15267c = new W.d.C1764f();

        /* JADX WARN: Illegal instructions before constructor call */
        private C1764f() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.AbstractC1741q.t(c1727k1, y6);
        }
    }

    /* JADX INFO: renamed from: W.d$g, reason: case insensitive filesystem */
    public static final class C1765g extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1765g f15268c = new W.d.C1765g();

        private C1765g() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            p031d0.d dVar = (p031d0.d) eVar.a(W.d.t.a(0));
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(1));
            p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.b(W.f.d(c1727k1, c1704d, interfaceC1713g));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "effectiveNodeIndexOut";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "anchor" : super.f(i6);
        }
    }

    /* JADX INFO: renamed from: W.d$h, reason: case insensitive filesystem */
    public static final class C1766h extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.C1766h f15269c = new W.d.C1766h();

        /* JADX WARN: Illegal instructions before constructor call */
        private C1766h() {
            int i6 = 1;
            super(0, i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (java.lang.Object obj : (java.lang.Object[]) eVar.a(W.d.t.a(0))) {
                interfaceC1713g.d(obj);
            }
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "nodes" : super.f(i6);
        }
    }

    public static final class i extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.i f15270c = new W.d.i();

        private i() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            ((p237x7.l) eVar.a(W.d.t.a(0))).l((V.r) eVar.a(W.d.t.a(1)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "anchor";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "composition" : super.f(i6);
        }
    }

    public static final class j extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.j f15271c = new W.d.j();

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.T();
        }
    }

    public static final class k extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.k f15272c = new W.d.k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            W.f.e(c1727k1, interfaceC1713g, 0);
            c1727k1.T();
        }
    }

    public static final class l extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.l f15273c = new W.d.l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i6 = 1;
            super(0, i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.W((V.C1704d) eVar.a(W.d.t.a(0)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "anchor" : super.f(i6);
        }
    }

    public static final class m extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.m f15274c = new W.d.m();

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.V(0);
        }
    }

    public static final class n extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.n f15275c = new W.d.n();

        private n() {
            super(1, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            java.lang.Object objB = ((p237x7.a) eVar.a(W.d.t.a(0))).b();
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(1));
            int iB = eVar.b(W.d.q.a(0));
            p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c1727k1.s1(c1704d, objB);
            interfaceC1713g.h(iB, objB);
            interfaceC1713g.d(objB);
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "insertIndex" : super.e(i6);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "factory";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "groupAnchor" : super.f(i6);
        }
    }

    public static final class o extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.o f15276c = new W.d.o();

        private o() {
            super(0, 2, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.C1718h1 c1718h1 = (V.C1718h1) eVar.a(W.d.t.a(1));
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(0));
            c1727k1.I();
            c1727k1.v0(c1718h1, c1704d.d(c1718h1), false);
            c1727k1.U();
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "anchor";
            }
            return W.d.t.b(i6, W.d.t.a(1)) ? "from" : super.f(i6);
        }
    }

    public static final class p extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.p f15277c = new W.d.p();

        private p() {
            super(0, 3, 1, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.C1718h1 c1718h1 = (V.C1718h1) eVar.a(W.d.t.a(1));
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(0));
            W.c cVar = (W.c) eVar.a(W.d.t.a(2));
            V.C1727k1 c1727k1V = c1718h1.V();
            try {
                cVar.d(interfaceC1713g, c1727k1V, y6);
                p087i7.M m6 = p087i7.M.f46721a;
                c1727k1V.L(true);
                c1727k1.I();
                c1727k1.v0(c1718h1, c1704d.d(c1718h1), false);
                c1727k1.U();
            } catch (java.lang.Throwable th) {
                c1727k1V.L(false);
                throw th;
            }
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            if (W.d.t.b(i6, W.d.t.a(0))) {
                return "anchor";
            }
            if (W.d.t.b(i6, W.d.t.a(1))) {
                return "from";
            }
            return W.d.t.b(i6, W.d.t.a(2)) ? "fixups" : super.f(i6);
        }
    }

    public static final class q {
        public static int a(int i6) {
            return i6;
        }

        public static final boolean b(int i6, int i10) {
            return i6 == i10;
        }
    }

    public static final class r extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.r f15278c = new W.d.r();

        private r() {
            super(1, 0, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.w0(eVar.b(W.d.q.a(0)));
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "offset" : super.e(i6);
        }
    }

    public static final class s extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.s f15279c = new W.d.s();

        private s() {
            super(3, 0, 2, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            interfaceC1713g.f(eVar.b(W.d.q.a(0)), eVar.b(W.d.q.a(1)), eVar.b(W.d.q.a(2)));
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            if (W.d.q.b(i6, W.d.q.a(0))) {
                return "from";
            }
            if (W.d.q.b(i6, W.d.q.a(1))) {
                return "to";
            }
            return W.d.q.b(i6, W.d.q.a(2)) ? "count" : super.e(i6);
        }
    }

    public static final class t {
        public static int a(int i6) {
            return i6;
        }

        public static final boolean b(int i6, int i10) {
            return i6 == i10;
        }
    }

    public static final class u extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.u f15280c = new W.d.u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i6 = 1;
            super(i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.C1704d c1704d = (V.C1704d) eVar.a(W.d.t.a(0));
            int iB = eVar.b(W.d.q.a(0));
            interfaceC1713g.g();
            p247y7.AbstractC7350t.d(interfaceC1713g, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            interfaceC1713g.c(iB, c1727k1.B0(c1704d));
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            return W.d.q.b(i6, W.d.q.a(0)) ? "insertIndex" : super.e(i6);
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "groupAnchor" : super.f(i6);
        }
    }

    public static final class v extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.v f15281c = new W.d.v();

        /* JADX WARN: Illegal instructions before constructor call */
        private v() {
            int i6 = 1;
            super(0, i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            y6.d((V.Z0) eVar.a(W.d.t.a(0)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "value" : super.f(i6);
        }
    }

    public static final class w extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.w f15282c = new W.d.w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            V.AbstractC1741q.K(c1727k1, y6);
        }
    }

    public static final class x extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.x f15283c = new W.d.x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i6 = 2;
            super(i6, 0, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            interfaceC1713g.a(eVar.b(W.d.q.a(0)), eVar.b(W.d.q.a(1)));
        }

        @Override // W.d
        public java.lang.String e(int i6) {
            if (W.d.q.b(i6, W.d.q.a(0))) {
                return "removeIndex";
            }
            return W.d.q.b(i6, W.d.q.a(1)) ? "count" : super.e(i6);
        }
    }

    public static final class y extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.y f15284c = new W.d.y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i6 = 0;
            super(i6, i6, 3, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            c1727k1.O0();
        }
    }

    public static final class z extends W.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final W.d.z f15285c = new W.d.z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i6 = 1;
            super(0, i6, i6, null);
        }

        @Override // W.d
        public void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6) {
            y6.e((p237x7.a) eVar.a(W.d.t.a(0)));
        }

        @Override // W.d
        public java.lang.String f(int i6) {
            return W.d.t.b(i6, W.d.t.a(0)) ? "effect" : super.f(i6);
        }
    }

    private d(int i6, int i10) {
        this.f15252a = i6;
        this.f15253b = i10;
    }

    public /* synthetic */ d(int i6, int i10, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this((i11 & 1) != 0 ? 0 : i6, (i11 & 2) != 0 ? 0 : i10, null);
    }

    public /* synthetic */ d(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, i10);
    }

    public abstract void a(W.e eVar, V.InterfaceC1713g interfaceC1713g, V.C1727k1 c1727k1, V.Y0 y6);

    public final int b() {
        return this.f15252a;
    }

    public final java.lang.String c() {
        java.lang.String strC = p247y7.P.b(getClass()).c();
        return strC == null ? "" : strC;
    }

    public final int d() {
        return this.f15253b;
    }

    public java.lang.String e(int i6) {
        return "IntParameter(" + i6 + ')';
    }

    public java.lang.String f(int i6) {
        return "ObjectParameter(" + i6 + ')';
    }

    public java.lang.String toString() {
        return c();
    }
}
