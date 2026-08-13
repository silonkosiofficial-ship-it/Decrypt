package C9;

/* JADX INFO: renamed from: C9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0862p {

    /* JADX INFO: renamed from: C9.p$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1503G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ C9.v f1504H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.r f1505I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.Y f1506J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9.v vVar, androidx.lifecycle.r rVar, androidx.lifecycle.Y y6, p127m7.e eVar) {
            super(2, eVar);
            this.f1504H = vVar;
            this.f1505I = rVar;
            this.f1506J = y6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f1503G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            this.f1504H.d(this.f1505I, this.f1506J);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((C9.AbstractC0862p.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new C9.AbstractC0862p.a(this.f1504H, this.f1505I, this.f1506J, eVar);
        }
    }

    /* JADX INFO: renamed from: C9.p$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1507G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ C9.v f1508H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.String f1509I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.l f1510J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9.v vVar, java.lang.String str, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f1508H = vVar;
            this.f1509I = str;
            this.f1510J = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f1507G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            C9.v vVar = this.f1508H;
            C9.H h6 = new C9.H(this.f1509I);
            this.f1510J.l(h6);
            vVar.f(h6.b());
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((C9.AbstractC0862p.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new C9.AbstractC0862p.b(this.f1508H, this.f1509I, this.f1510J, eVar);
        }
    }

    /* JADX INFO: renamed from: C9.p$c */
    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1511G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ p041e0.d f1512H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.G1 f1513I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p041e0.d dVar, V.G1 g6, p127m7.e eVar) {
            super(2, eVar);
            this.f1512H = dVar;
            this.f1513I = g6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            C9.P pQ;
            p137n7.b.g();
            if (this.f1511G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            C9.C0853g c0853gN = C9.AbstractC0862p.n(this.f1513I);
            if (((c0853gN != null ? c0853gN.k() : null) instanceof D9.a) && ((pQ = c0853gN.q()) == null || !(pQ instanceof C9.C0856j) || !p247y7.AbstractC7350t.b(((C9.C0856j) pQ).b(), this.f1512H))) {
                c0853gN.x(new C9.C0856j(this.f1512H));
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((C9.AbstractC0862p.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new C9.AbstractC0862p.c(this.f1512H, this.f1513I, eVar);
        }
    }

    /* JADX INFO: renamed from: C9.p$d */
    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f1514G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1515H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f1516I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1742q0 f1517J;

        /* JADX INFO: renamed from: C9.p$d$a */
        static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1742q0 f1518C;

            a(V.InterfaceC1742q0 interfaceC1742q0) {
                this.f1518C = interfaceC1742q0;
            }

            @Override // Z8.InterfaceC1870g
            public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                return b(((java.lang.Number) obj).floatValue(), eVar);
            }

            public final java.lang.Object b(float f6, p127m7.e eVar) {
                C9.AbstractC0862p.i(this.f1518C, f6);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(V.InterfaceC1753w0 interfaceC1753w0, V.InterfaceC1742q0 interfaceC1742q0, p127m7.e eVar) {
            super(2, eVar);
            this.f1516I = interfaceC1753w0;
            this.f1517J = interfaceC1742q0;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f1514G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Z8.InterfaceC1869f interfaceC1869f = (Z8.InterfaceC1869f) this.f1515H;
                    C9.AbstractC0862p.k(this.f1516I, true);
                    C9.AbstractC0862p.i(this.f1517J, 0.0f);
                    C9.AbstractC0862p.d.a aVar = new C9.AbstractC0862p.d.a(this.f1517J);
                    this.f1514G = 1;
                    if (interfaceC1869f.b(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                if (C9.AbstractC0862p.h(this.f1517J) != 1.0f) {
                    C9.AbstractC0862p.i(this.f1517J, 1.0f);
                }
            } catch (java.util.concurrent.CancellationException unused) {
                C9.AbstractC0862p.k(this.f1516I, false);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
            return ((C9.AbstractC0862p.d) x(interfaceC1869f, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            C9.AbstractC0862p.d dVar = new C9.AbstractC0862p.d(this.f1516I, this.f1517J, eVar);
            dVar.f1515H = obj;
            return dVar;
        }
    }

    /* JADX INFO: renamed from: C9.p$e */
    static final class e implements p237x7.q {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ V.G1 f1519C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f1520D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ C9.v f1521E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ E9.a f1522F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1742q0 f1523G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f1524H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ V.G1 f1525I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p041e0.d f1526J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ V.G1 f1527K;

        /* JADX INFO: renamed from: C9.p$e$a */
        static final class a implements p237x7.r {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p041e0.d f1528C;

            a(p041e0.d dVar) {
                this.f1528C = dVar;
            }

            public final void a(p190t.InterfaceC7154b interfaceC7154b, C9.C0853g c0853g, V.InterfaceC1734n interfaceC1734n, int i6) {
                p247y7.AbstractC7350t.f(interfaceC7154b, "$this$AnimatedContent");
                p247y7.AbstractC7350t.f(c0853g, "entry");
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-1482595155, i6, -1, "moe.tlaster.precompose.navigation.NavHost.<anonymous>.<anonymous>.<anonymous> (NavHost.kt:251)");
                }
                C9.AbstractC0862p.r(interfaceC7154b, this.f1528C, c0853g, interfaceC1734n, ((i6 << 3) & 896) | (i6 & 14));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            }

            @Override // p237x7.r
            public /* bridge */ /* synthetic */ java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                a((p190t.InterfaceC7154b) obj, (C9.C0853g) obj2, (V.InterfaceC1734n) obj3, ((java.lang.Number) obj4).intValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: C9.p$e$b */
        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f1529G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ C9.v f1530H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p230x.AbstractC7281a f1531I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1742q0 f1532J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f1533K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ V.G1 f1534L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f1535M;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C9.v vVar, p230x.AbstractC7281a abstractC7281a, V.InterfaceC1742q0 interfaceC1742q0, V.InterfaceC1753w0 interfaceC1753w0, V.G1 g6, V.InterfaceC1753w0 interfaceC1753w1, p127m7.e eVar) {
                super(2, eVar);
                this.f1530H = vVar;
                this.f1532J = interfaceC1742q0;
                this.f1533K = interfaceC1753w0;
                this.f1534L = g6;
                this.f1535M = interfaceC1753w1;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f1529G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    if (C9.AbstractC0862p.h(this.f1532J) == 1.0f) {
                        p200u.C7170g0 c7170g0N = C9.AbstractC0862p.e.n(this.f1533K);
                        C9.C0853g c0853gP = C9.AbstractC0862p.p(this.f1534L);
                        p247y7.AbstractC7350t.c(c0853gP);
                        this.f1529G = 1;
                        if (p200u.C7170g0.B(c7170g0N, c0853gP, null, this, 2, null) == objG) {
                            return objG;
                        }
                        C9.AbstractC0862p.k(this.f1535M, false);
                        this.f1530H.c();
                        C9.AbstractC0862p.i(this.f1532J, 0.0f);
                    } else if (C9.AbstractC0862p.h(this.f1532J) >= 0.0f) {
                        p200u.C7170g0 c7170g0N2 = C9.AbstractC0862p.e.n(this.f1533K);
                        float fH = C9.AbstractC0862p.h(this.f1532J);
                        C9.C0853g c0853gP2 = C9.AbstractC0862p.p(this.f1534L);
                        p247y7.AbstractC7350t.c(c0853gP2);
                        this.f1529G = 3;
                        if (c7170g0N2.O(fH, c0853gP2, this) == objG) {
                            return objG;
                        }
                    } else if (C9.AbstractC0862p.h(this.f1532J) == -1.0f) {
                        p200u.C7170g0 c7170g0N3 = C9.AbstractC0862p.e.n(this.f1533K);
                        C9.C0853g c0853gP3 = C9.AbstractC0862p.p(this.f1534L);
                        p247y7.AbstractC7350t.c(c0853gP3);
                        this.f1529G = 4;
                        if (c7170g0N3.O(0.0f, c0853gP3, this) == objG) {
                            return objG;
                        }
                        C9.AbstractC0862p.k(this.f1535M, false);
                        C9.AbstractC0862p.i(this.f1532J, 0.0f);
                    }
                } else if (i6 == 1) {
                    p087i7.x.b(obj);
                    C9.AbstractC0862p.k(this.f1535M, false);
                    this.f1530H.c();
                    C9.AbstractC0862p.i(this.f1532J, 0.0f);
                } else if (i6 == 2 || i6 == 3) {
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                    C9.AbstractC0862p.k(this.f1535M, false);
                    C9.AbstractC0862p.i(this.f1532J, 0.0f);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((C9.AbstractC0862p.e.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new C9.AbstractC0862p.e.b(this.f1530H, this.f1531I, this.f1532J, this.f1533K, this.f1534L, this.f1535M, eVar);
            }
        }

        /* JADX INFO: renamed from: C9.p$e$c */
        static final class c implements p237x7.r {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p041e0.d f1536C;

            c(p041e0.d dVar) {
                this.f1536C = dVar;
            }

            public final void a(p190t.InterfaceC7154b interfaceC7154b, C9.C0853g c0853g, V.InterfaceC1734n interfaceC1734n, int i6) {
                p247y7.AbstractC7350t.f(interfaceC7154b, "$this$AnimatedContent");
                p247y7.AbstractC7350t.f(c0853g, "entry");
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(2075206384, i6, -1, "moe.tlaster.precompose.navigation.NavHost.<anonymous>.<anonymous>.<anonymous> (NavHost.kt:260)");
                }
                C9.AbstractC0862p.r(interfaceC7154b, this.f1536C, c0853g, interfaceC1734n, ((i6 << 3) & 896) | (i6 & 14));
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            }

            @Override // p237x7.r
            public /* bridge */ /* synthetic */ java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                a((p190t.InterfaceC7154b) obj, (C9.C0853g) obj2, (V.InterfaceC1734n) obj3, ((java.lang.Number) obj4).intValue());
                return p087i7.M.f46721a;
            }
        }

        e(V.G1 g6, C9.O o6, V.G1 g10, C9.v vVar, E9.a aVar, V.InterfaceC1742q0 interfaceC1742q0, V.InterfaceC1753w0 interfaceC1753w0, V.G1 g11, p041e0.d dVar, V.G1 g12) {
            this.f1519C = g6;
            this.f1520D = g10;
            this.f1521E = vVar;
            this.f1522F = aVar;
            this.f1523G = interfaceC1742q0;
            this.f1524H = interfaceC1753w0;
            this.f1525I = g11;
            this.f1526J = dVar;
            this.f1527K = g12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p200u.C7170g0 n(V.InterfaceC1753w0 interfaceC1753w0) {
            return (p200u.C7170g0) interfaceC1753w0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p190t.k p(E9.a aVar, C9.v vVar, V.G1 g6, androidx.compose.animation.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "<this>");
            E9.a aVarH = ((C9.C0853g) ((!vVar.b().a((C9.C0853g) dVar.b()) || x(g6)) ? dVar.b() : dVar.d())).h();
            if (aVarH != null) {
                aVar = aVarH;
            }
            return (!vVar.b().a((C9.C0853g) dVar.b()) || x(g6)) ? new p190t.k(aVar.e(), aVar.b(), aVar.a(), null) : new p190t.k(aVar.f(), aVar.d(), aVar.c(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object s(C9.C0853g c0853g) {
            p247y7.AbstractC7350t.f(c0853g, "it");
            return c0853g.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean t(V.InterfaceC1753w0 interfaceC1753w0, V.InterfaceC1742q0 interfaceC1742q0, V.G1 g6, V.G1 g10) {
            if (!C9.AbstractC0862p.j(interfaceC1753w0) || C9.AbstractC0862p.h(interfaceC1742q0) == 0.0f || C9.AbstractC0862p.p(g6) == null) {
                return false;
            }
            C9.C0853g c0853gN = C9.AbstractC0862p.n(g10);
            if (c0853gN != null) {
                c0853gN.k();
            }
            return true;
        }

        private static final boolean x(V.G1 g6) {
            return ((java.lang.Boolean) g6.getValue()).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object y(C9.C0853g c0853g) {
            p247y7.AbstractC7350t.f(c0853g, "it");
            return c0853g.m();
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            m((A.InterfaceC0773g) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
            return p087i7.M.f46721a;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v17 ??, still in use, count: 1, list:
              (r11v17 ?? I:java.lang.Object) from 0x0132: INVOKE (r24v0 ?? I:V.n), (r11v17 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final void m(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v17 ??, still in use, count: 1, list:
              (r11v17 ?? I:java.lang.Object) from 0x0132: INVOKE (r24v0 ?? I:V.n), (r11v17 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
    }

    /* JADX INFO: renamed from: C9.p$f */
    static final class f implements p237x7.p {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ C9.C0853g f1537C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p190t.InterfaceC7154b f1538D;

        /* JADX INFO: renamed from: C9.p$f$a */
        static final class a implements p237x7.p {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ C9.C0853g f1539C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p190t.InterfaceC7154b f1540D;

            a(C9.C0853g c0853g, p190t.InterfaceC7154b interfaceC7154b) {
                this.f1539C = c0853g;
                this.f1540D = interfaceC7154b;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-748964020, i6, -1, "moe.tlaster.precompose.navigation.NavHostContent.<anonymous>.<anonymous> (NavHost.kt:277)");
                }
                C9.AbstractC0862p.e(this.f1539C, this.f1540D, interfaceC1734n, 0);
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

        f(C9.C0853g c0853g, p190t.InterfaceC7154b interfaceC7154b) {
            this.f1537C = c0853g;
            this.f1538D = interfaceC7154b;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                interfaceC1734n.A();
                return;
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1752964084, i6, -1, "moe.tlaster.precompose.navigation.NavHostContent.<anonymous> (NavHost.kt:273)");
            }
            V.AbstractC1756y.b(new V.P0[]{p003a2.a.a().d(this.f1537C), p033d2.a.f44287a.b(this.f1537C)}, p031d0.c.e(-748964020, true, new C9.AbstractC0862p.f.a(this.f1537C, this.f1538D), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
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

    /* JADX INFO: renamed from: C9.p$g */
    public static final class g implements V.M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9.C0853g f1541a;

        public g(C9.C0853g c0853g) {
            this.f1541a = c0853g;
        }

        @Override // V.M
        public void e() {
            this.f1541a.s();
        }
    }

    public static final /* synthetic */ C9.C0853g A(V.G1 g6) {
        return o(g6);
    }

    public static final /* synthetic */ C9.C0853g B(V.G1 g6) {
        return p(g6);
    }

    public static final /* synthetic */ C9.C0853g C(V.G1 g6) {
        return q(g6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final C9.C0853g c0853g, final p190t.InterfaceC7154b interfaceC7154b, V.InterfaceC1734n interfaceC1734n, final int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1763524084);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(c0853g) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(interfaceC7154b) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-1763524084, i10, -1, "moe.tlaster.precompose.navigation.ComposeContent (NavHost.kt:298)");
            }
            c0853g.k();
            D9.c cVarK = c0853g.k();
            D9.a aVar = cVarK instanceof D9.a ? (D9.a) cVarK : null;
            p237x7.r rVarA = aVar != null ? aVar.a() : null;
            if (rVarA != null) {
                rVarA.o(interfaceC7154b, c0853g, interfaceC1734nR, java.lang.Integer.valueOf(((i10 >> 3) & 14) | ((i10 << 3) & 112)));
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p237x7.p() { // from class: C9.o
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return C9.AbstractC0862p.f(c0853g, interfaceC7154b, i6, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M f(C9.C0853g c0853g, p190t.InterfaceC7154b interfaceC7154b, int i6, V.InterfaceC1734n interfaceC1734n, int i10) {
        e(c0853g, interfaceC7154b, interfaceC1734n, V.S0.a(i6 | 1));
        return p087i7.M.f46721a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:102:0x017d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0185  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x0218  */
    /* JADX WARN: Code duplicated, block: B:122:0x0220  */
    /* JADX WARN: Code duplicated, block: B:125:0x0273  */
    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x0309  */
    /* JADX WARN: Code duplicated, block: B:143:0x0318  */
    /* JADX WARN: Code duplicated, block: B:145:0x032c  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[PHI: r8 r16 r17
  0x00f3: PHI (r8v6 int) = (r8v2 int), (r8v8 int) binds: [B:93:0x0135, B:81:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r16v4 androidx.compose.ui.d) = (r16v1 androidx.compose.ui.d), (r16v5 androidx.compose.ui.d) binds: [B:93:0x0135, B:81:0x00ee] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r17v3 E9.a) = (r17v0 E9.a), (r17v4 E9.a) binds: [B:93:0x0135, B:81:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0137  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void g(final C9.v vVar, final java.lang.String str, androidx.compose.ui.d dVar, E9.a aVar, C9.O o6, final p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, final int i6, final int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        int i12;
        C9.O o10;
        int i13;
        int i14;
        androidx.compose.ui.d dVar3;
        E9.a aVar2;
        int i15;
        androidx.compose.ui.d dVar4;
        C9.O o11;
        java.lang.Object objG;
        androidx.lifecycle.r rVar;
        p041e0.d dVarA;
        androidx.lifecycle.Y yA;
        boolean zL;
        java.lang.Object objG2;
        int i16;
        boolean z6;
        boolean z10;
        boolean z11;
        java.lang.Object objG3;
        java.lang.Boolean bool;
        V.G1 g1A;
        boolean zS;
        java.lang.Object objG4;
        V.G1 g1A2;
        V.G1 g1A3;
        V.G1 g1A4;
        java.lang.Object objG5;
        V.InterfaceC1734n.a aVar3;
        V.InterfaceC1742q0 interfaceC1742q0;
        java.lang.Object objG6;
        V.InterfaceC1753w0 interfaceC1753w0;
        java.lang.Object objG7;
        final androidx.compose.ui.d dVar5;
        final E9.a aVar4;
        final C9.O o12;
        V.InterfaceC1709e1 interfaceC1709e1X;
        int i17;
        boolean zL2;
        E9.a aVar5 = aVar;
        p247y7.AbstractC7350t.f(vVar, "navigator");
        p247y7.AbstractC7350t.f(str, "initialRoute");
        p247y7.AbstractC7350t.f(lVar, "builder");
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(399974704);
        if ((i10 & 1) != 0) {
            i11 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i11 = (interfaceC1734nR.l(vVar) ? 4 : 2) | i6;
        } else {
            i11 = i6;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i6 & 48) == 0) {
            i11 |= interfaceC1734nR.S(str) ? 32 : 16;
        }
        int i18 = i10 & 4;
        if (i18 == 0) {
            if ((i6 & 384) == 0) {
                dVar2 = dVar;
                i11 |= interfaceC1734nR.S(dVar2) ? 256 : 128;
            }
            if ((i6 & 3072) == 0) {
                if ((i10 & 8) != 0) {
                    i17 = 1024;
                } else {
                    if ((i6 & 4096) == 0) {
                        zL2 = interfaceC1734nR.S(aVar5);
                    } else {
                        zL2 = interfaceC1734nR.l(aVar5);
                    }
                    if (zL2) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                }
                i11 |= i17;
            }
            i12 = i10 & 16;
            if (i12 != 0) {
                if ((i6 & 24576) == 0) {
                    o10 = o6;
                    if (interfaceC1734nR.S(o10)) {
                        i13 = 16384;
                    } else {
                        i13 = 8192;
                    }
                    i11 |= i13;
                }
                if ((i10 & 32) != 0) {
                    i11 |= 196608;
                } else if ((i6 & 196608) == 0) {
                    if (interfaceC1734nR.l(lVar)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i11 |= i14;
                }
                if ((74899 & i11) == 74898 || !interfaceC1734nR.u()) {
                    interfaceC1734nR.q();
                    if ((i6 & 1) != 0 || interfaceC1734nR.G()) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.f19586a;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i10 & 8) != 0) {
                            interfaceC1734nR.T(121438666);
                            objG = interfaceC1734nR.g();
                            if (objG == V.InterfaceC1734n.f14931a.a()) {
                                objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                                interfaceC1734nR.K(objG);
                            }
                            aVar5 = (E9.a) objG;
                            interfaceC1734nR.J();
                            i11 &= -7169;
                        }
                        aVar2 = aVar5;
                        i15 = i11;
                        dVar4 = dVar3;
                        if (i12 != 0) {
                            o11 = null;
                        }
                        interfaceC1734nR.R();
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                        }
                        rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                        dVarA = p041e0.f.a(interfaceC1734nR, 0);
                        yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                        if (yA != null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        interfaceC1734nR.T(121456347);
                        zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                        objG2 = interfaceC1734nR.g();
                        if (zL || objG2 == V.InterfaceC1734n.f14931a.a()) {
                            objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                            interfaceC1734nR.K(objG2);
                        }
                        interfaceC1734nR.J();
                        V.Q.e(bool2, (p237x7.p) objG2, interfaceC1734nR, 6);
                        interfaceC1734nR.T(121462239);
                        boolean zL3 = interfaceC1734nR.l(vVar);
                        i16 = i15 & 112;
                        if (i16 == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z12 = zL3 | z6;
                        if ((458752 & i15) == 131072) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z12 | z10;
                        objG3 = interfaceC1734nR.g();
                        if (z11 || objG3 == V.InterfaceC1734n.f14931a.a()) {
                            objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                            interfaceC1734nR.K(objG3);
                        }
                        interfaceC1734nR.J();
                        V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                        Z8.InterfaceC1869f interfaceC1869fC = vVar.b().c();
                        bool = java.lang.Boolean.FALSE;
                        V.G1 g1A5 = V.v1.a(interfaceC1869fC, bool, null, interfaceC1734nR, 48, 2);
                        g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                        C9.C0853g c0853gN = n(g1A);
                        interfaceC1734nR.T(121473321);
                        zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                        objG4 = interfaceC1734nR.g();
                        if (zS || objG4 == V.InterfaceC1734n.f14931a.a()) {
                            objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                            interfaceC1734nR.K(objG4);
                        }
                        interfaceC1734nR.J();
                        V.Q.d(c0853gN, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                        g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                        g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                        g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                        interfaceC1734nR.T(121498258);
                        objG5 = interfaceC1734nR.g();
                        aVar3 = V.InterfaceC1734n.f14931a;
                        if (objG5 == aVar3.a()) {
                            objG5 = V.J0.a(0.0f);
                            interfaceC1734nR.K(objG5);
                        }
                        interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                        interfaceC1734nR.J();
                        interfaceC1734nR.T(121500336);
                        objG6 = interfaceC1734nR.g();
                        if (objG6 == aVar3.a()) {
                            objG6 = V.A1.d(bool, null, 2, null);
                            interfaceC1734nR.K(objG6);
                        }
                        interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                        interfaceC1734nR.J();
                        boolean zM = m(g1A5);
                        interfaceC1734nR.T(121502989);
                        objG7 = interfaceC1734nR.g();
                        if (objG7 == aVar3.a()) {
                            objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                            interfaceC1734nR.K(objG7);
                        }
                        interfaceC1734nR.J();
                        C9.AbstractC0850d.d(zM, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                        if (o(g1A2) == null || q(g1A4) != null) {
                            A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                        }
                        if (V.AbstractC1741q.H()) {
                            V.AbstractC1741q.P();
                        }
                        dVar5 = dVar4;
                        aVar4 = aVar2;
                        o12 = o11;
                    } else {
                        interfaceC1734nR.A();
                        if ((i10 & 8) != 0) {
                            i11 &= -7169;
                        }
                        aVar2 = aVar5;
                        i15 = i11;
                        dVar4 = dVar2;
                    }
                    o11 = o10;
                    interfaceC1734nR.R();
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                    }
                    rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                    dVarA = p041e0.f.a(interfaceC1734nR, 0);
                    yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                    if (yA != null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                    interfaceC1734nR.T(121456347);
                    zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                    objG2 = interfaceC1734nR.g();
                    if (zL) {
                        objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                        interfaceC1734nR.K(objG2);
                    } else {
                        objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                        interfaceC1734nR.K(objG2);
                    }
                    interfaceC1734nR.J();
                    V.Q.e(bool3, (p237x7.p) objG2, interfaceC1734nR, 6);
                    interfaceC1734nR.T(121462239);
                    boolean zL4 = interfaceC1734nR.l(vVar);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z13 = zL4 | z6;
                    if ((458752 & i15) == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z13 | z10;
                    objG3 = interfaceC1734nR.g();
                    if (z11) {
                        objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                        interfaceC1734nR.K(objG3);
                    } else {
                        objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                        interfaceC1734nR.K(objG3);
                    }
                    interfaceC1734nR.J();
                    V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                    Z8.InterfaceC1869f interfaceC1869fC2 = vVar.b().c();
                    bool = java.lang.Boolean.FALSE;
                    V.G1 g1A6 = V.v1.a(interfaceC1869fC2, bool, null, interfaceC1734nR, 48, 2);
                    g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                    C9.C0853g c0853gN2 = n(g1A);
                    interfaceC1734nR.T(121473321);
                    zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                    objG4 = interfaceC1734nR.g();
                    if (zS) {
                        objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                        interfaceC1734nR.K(objG4);
                    } else {
                        objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                        interfaceC1734nR.K(objG4);
                    }
                    interfaceC1734nR.J();
                    V.Q.d(c0853gN2, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                    g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                    g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                    g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                    interfaceC1734nR.T(121498258);
                    objG5 = interfaceC1734nR.g();
                    aVar3 = V.InterfaceC1734n.f14931a;
                    if (objG5 == aVar3.a()) {
                        objG5 = V.J0.a(0.0f);
                        interfaceC1734nR.K(objG5);
                    }
                    interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                    interfaceC1734nR.J();
                    interfaceC1734nR.T(121500336);
                    objG6 = interfaceC1734nR.g();
                    if (objG6 == aVar3.a()) {
                        objG6 = V.A1.d(bool, null, 2, null);
                        interfaceC1734nR.K(objG6);
                    }
                    interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                    interfaceC1734nR.J();
                    boolean zM2 = m(g1A6);
                    interfaceC1734nR.T(121502989);
                    objG7 = interfaceC1734nR.g();
                    if (objG7 == aVar3.a()) {
                        objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                        interfaceC1734nR.K(objG7);
                    }
                    interfaceC1734nR.J();
                    C9.AbstractC0850d.d(zM2, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                    if (o(g1A2) == null) {
                        A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                    } else {
                        A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.P();
                    }
                    dVar5 = dVar4;
                    aVar4 = aVar2;
                    o12 = o11;
                } else {
                    interfaceC1734nR.A();
                    aVar4 = aVar5;
                    dVar5 = dVar2;
                    o12 = o10;
                }
                interfaceC1709e1X = interfaceC1734nR.x();
                if (interfaceC1709e1X != null) {
                    interfaceC1709e1X.a(new p237x7.p(str, dVar5, aVar4, o12, lVar, i6, i10) { // from class: C9.l

                        /* JADX INFO: renamed from: D, reason: collision with root package name */
                        public final /* synthetic */ java.lang.String f1489D;

                        /* JADX INFO: renamed from: E, reason: collision with root package name */
                        public final /* synthetic */ androidx.compose.ui.d f1490E;

                        /* JADX INFO: renamed from: F, reason: collision with root package name */
                        public final /* synthetic */ E9.a f1491F;

                        /* JADX INFO: renamed from: G, reason: collision with root package name */
                        public final /* synthetic */ p237x7.l f1492G;

                        /* JADX INFO: renamed from: H, reason: collision with root package name */
                        public final /* synthetic */ int f1493H;

                        /* JADX INFO: renamed from: I, reason: collision with root package name */
                        public final /* synthetic */ int f1494I;

                        {
                            this.f1492G = lVar;
                            this.f1493H = i6;
                            this.f1494I = i10;
                        }

                        @Override // p237x7.p
                        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                            return C9.AbstractC0862p.l(this.f1488C, this.f1489D, this.f1490E, this.f1491F, null, this.f1492G, this.f1493H, this.f1494I, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                }
            }
            i11 |= 24576;
            o10 = o6;
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(lVar)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i11 |= i14;
            }
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                }
                rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                dVarA = p041e0.f.a(interfaceC1734nR, 0);
                yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                if (yA != null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                interfaceC1734nR.T(121456347);
                zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                objG2 = interfaceC1734nR.g();
                if (zL) {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                }
                interfaceC1734nR.J();
                V.Q.e(bool4, (p237x7.p) objG2, interfaceC1734nR, 6);
                interfaceC1734nR.T(121462239);
                boolean zL5 = interfaceC1734nR.l(vVar);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z14 = zL5 | z6;
                if ((458752 & i15) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z14 | z10;
                objG3 = interfaceC1734nR.g();
                if (z11) {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                }
                interfaceC1734nR.J();
                V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                Z8.InterfaceC1869f interfaceC1869fC3 = vVar.b().c();
                bool = java.lang.Boolean.FALSE;
                V.G1 g1A7 = V.v1.a(interfaceC1869fC3, bool, null, interfaceC1734nR, 48, 2);
                g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                C9.C0853g c0853gN3 = n(g1A);
                interfaceC1734nR.T(121473321);
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                objG4 = interfaceC1734nR.g();
                if (zS) {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                }
                interfaceC1734nR.J();
                V.Q.d(c0853gN3, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                interfaceC1734nR.T(121498258);
                objG5 = interfaceC1734nR.g();
                aVar3 = V.InterfaceC1734n.f14931a;
                if (objG5 == aVar3.a()) {
                    objG5 = V.J0.a(0.0f);
                    interfaceC1734nR.K(objG5);
                }
                interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                interfaceC1734nR.J();
                interfaceC1734nR.T(121500336);
                objG6 = interfaceC1734nR.g();
                if (objG6 == aVar3.a()) {
                    objG6 = V.A1.d(bool, null, 2, null);
                    interfaceC1734nR.K(objG6);
                }
                interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                interfaceC1734nR.J();
                boolean zM3 = m(g1A7);
                interfaceC1734nR.T(121502989);
                objG7 = interfaceC1734nR.g();
                if (objG7 == aVar3.a()) {
                    objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                    interfaceC1734nR.K(objG7);
                }
                interfaceC1734nR.J();
                C9.AbstractC0850d.d(zM3, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                if (o(g1A2) == null) {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                } else {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar5 = dVar4;
                aVar4 = aVar2;
                o12 = o11;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                }
                rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                dVarA = p041e0.f.a(interfaceC1734nR, 0);
                yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                if (yA != null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                java.lang.Boolean bool5 = java.lang.Boolean.TRUE;
                interfaceC1734nR.T(121456347);
                zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                objG2 = interfaceC1734nR.g();
                if (zL) {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                }
                interfaceC1734nR.J();
                V.Q.e(bool5, (p237x7.p) objG2, interfaceC1734nR, 6);
                interfaceC1734nR.T(121462239);
                boolean zL6 = interfaceC1734nR.l(vVar);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z15 = zL6 | z6;
                if ((458752 & i15) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z15 | z10;
                objG3 = interfaceC1734nR.g();
                if (z11) {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                }
                interfaceC1734nR.J();
                V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                Z8.InterfaceC1869f interfaceC1869fC4 = vVar.b().c();
                bool = java.lang.Boolean.FALSE;
                V.G1 g1A8 = V.v1.a(interfaceC1869fC4, bool, null, interfaceC1734nR, 48, 2);
                g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                C9.C0853g c0853gN4 = n(g1A);
                interfaceC1734nR.T(121473321);
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                objG4 = interfaceC1734nR.g();
                if (zS) {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                }
                interfaceC1734nR.J();
                V.Q.d(c0853gN4, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                interfaceC1734nR.T(121498258);
                objG5 = interfaceC1734nR.g();
                aVar3 = V.InterfaceC1734n.f14931a;
                if (objG5 == aVar3.a()) {
                    objG5 = V.J0.a(0.0f);
                    interfaceC1734nR.K(objG5);
                }
                interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                interfaceC1734nR.J();
                interfaceC1734nR.T(121500336);
                objG6 = interfaceC1734nR.g();
                if (objG6 == aVar3.a()) {
                    objG6 = V.A1.d(bool, null, 2, null);
                    interfaceC1734nR.K(objG6);
                }
                interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                interfaceC1734nR.J();
                boolean zM4 = m(g1A8);
                interfaceC1734nR.T(121502989);
                objG7 = interfaceC1734nR.g();
                if (objG7 == aVar3.a()) {
                    objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                    interfaceC1734nR.K(objG7);
                }
                interfaceC1734nR.J();
                C9.AbstractC0850d.d(zM4, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                if (o(g1A2) == null) {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                } else {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar5 = dVar4;
                aVar4 = aVar2;
                o12 = o11;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new p237x7.p(str, dVar5, aVar4, o12, lVar, i6, i10) { // from class: C9.l

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f1489D;

                    /* JADX INFO: renamed from: E, reason: collision with root package name */
                    public final /* synthetic */ androidx.compose.ui.d f1490E;

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    public final /* synthetic */ E9.a f1491F;

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    public final /* synthetic */ p237x7.l f1492G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    public final /* synthetic */ int f1493H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    public final /* synthetic */ int f1494I;

                    {
                        this.f1492G = lVar;
                        this.f1493H = i6;
                        this.f1494I = i10;
                    }

                    @Override // p237x7.p
                    public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                        return C9.AbstractC0862p.l(this.f1488C, this.f1489D, this.f1490E, this.f1491F, null, this.f1492G, this.f1493H, this.f1494I, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }
        i11 |= 384;
        dVar2 = dVar;
        if ((i6 & 3072) == 0) {
            if ((i10 & 8) != 0) {
                i17 = 1024;
            } else {
                if ((i6 & 4096) == 0) {
                    zL2 = interfaceC1734nR.S(aVar5);
                } else {
                    zL2 = interfaceC1734nR.l(aVar5);
                }
                if (zL2) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
            }
            i11 |= i17;
        }
        i12 = i10 & 16;
        if (i12 != 0) {
            if ((i6 & 24576) == 0) {
                o10 = o6;
                if (interfaceC1734nR.S(o10)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i11 |= i13;
            }
            if ((i10 & 32) != 0) {
                i11 |= 196608;
            } else if ((i6 & 196608) == 0) {
                if (interfaceC1734nR.l(lVar)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i11 |= i14;
            }
            if ((74899 & i11) == 74898) {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                }
                rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                dVarA = p041e0.f.a(interfaceC1734nR, 0);
                yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                if (yA != null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                java.lang.Boolean bool6 = java.lang.Boolean.TRUE;
                interfaceC1734nR.T(121456347);
                zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                objG2 = interfaceC1734nR.g();
                if (zL) {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                }
                interfaceC1734nR.J();
                V.Q.e(bool6, (p237x7.p) objG2, interfaceC1734nR, 6);
                interfaceC1734nR.T(121462239);
                boolean zL7 = interfaceC1734nR.l(vVar);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z16 = zL7 | z6;
                if ((458752 & i15) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z16 | z10;
                objG3 = interfaceC1734nR.g();
                if (z11) {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                }
                interfaceC1734nR.J();
                V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                Z8.InterfaceC1869f interfaceC1869fC5 = vVar.b().c();
                bool = java.lang.Boolean.FALSE;
                V.G1 g1A9 = V.v1.a(interfaceC1869fC5, bool, null, interfaceC1734nR, 48, 2);
                g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                C9.C0853g c0853gN5 = n(g1A);
                interfaceC1734nR.T(121473321);
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                objG4 = interfaceC1734nR.g();
                if (zS) {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                }
                interfaceC1734nR.J();
                V.Q.d(c0853gN5, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                interfaceC1734nR.T(121498258);
                objG5 = interfaceC1734nR.g();
                aVar3 = V.InterfaceC1734n.f14931a;
                if (objG5 == aVar3.a()) {
                    objG5 = V.J0.a(0.0f);
                    interfaceC1734nR.K(objG5);
                }
                interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                interfaceC1734nR.J();
                interfaceC1734nR.T(121500336);
                objG6 = interfaceC1734nR.g();
                if (objG6 == aVar3.a()) {
                    objG6 = V.A1.d(bool, null, 2, null);
                    interfaceC1734nR.K(objG6);
                }
                interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                interfaceC1734nR.J();
                boolean zM5 = m(g1A9);
                interfaceC1734nR.T(121502989);
                objG7 = interfaceC1734nR.g();
                if (objG7 == aVar3.a()) {
                    objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                    interfaceC1734nR.K(objG7);
                }
                interfaceC1734nR.J();
                C9.AbstractC0850d.d(zM5, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                if (o(g1A2) == null) {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                } else {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar5 = dVar4;
                aVar4 = aVar2;
                o12 = o11;
            } else {
                interfaceC1734nR.q();
                if ((i6 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.f19586a;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i10 & 8) != 0) {
                        interfaceC1734nR.T(121438666);
                        objG = interfaceC1734nR.g();
                        if (objG == V.InterfaceC1734n.f14931a.a()) {
                            objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                            interfaceC1734nR.K(objG);
                        }
                        aVar5 = (E9.a) objG;
                        interfaceC1734nR.J();
                        i11 &= -7169;
                    }
                    aVar2 = aVar5;
                    i15 = i11;
                    dVar4 = dVar3;
                    if (i12 != 0) {
                        o11 = null;
                    } else {
                        o11 = o10;
                    }
                }
                interfaceC1734nR.R();
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
                }
                rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
                dVarA = p041e0.f.a(interfaceC1734nR, 0);
                yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
                if (yA != null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                java.lang.Boolean bool7 = java.lang.Boolean.TRUE;
                interfaceC1734nR.T(121456347);
                zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
                objG2 = interfaceC1734nR.g();
                if (zL) {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                } else {
                    objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                    interfaceC1734nR.K(objG2);
                }
                interfaceC1734nR.J();
                V.Q.e(bool7, (p237x7.p) objG2, interfaceC1734nR, 6);
                interfaceC1734nR.T(121462239);
                boolean zL8 = interfaceC1734nR.l(vVar);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z17 = zL8 | z6;
                if ((458752 & i15) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z17 | z10;
                objG3 = interfaceC1734nR.g();
                if (z11) {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                } else {
                    objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                    interfaceC1734nR.K(objG3);
                }
                interfaceC1734nR.J();
                V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
                Z8.InterfaceC1869f interfaceC1869fC6 = vVar.b().c();
                bool = java.lang.Boolean.FALSE;
                V.G1 g1A10 = V.v1.a(interfaceC1869fC6, bool, null, interfaceC1734nR, 48, 2);
                g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
                C9.C0853g c0853gN6 = n(g1A);
                interfaceC1734nR.T(121473321);
                zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
                objG4 = interfaceC1734nR.g();
                if (zS) {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                } else {
                    objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                    interfaceC1734nR.K(objG4);
                }
                interfaceC1734nR.J();
                V.Q.d(c0853gN6, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
                g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
                g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
                g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
                interfaceC1734nR.T(121498258);
                objG5 = interfaceC1734nR.g();
                aVar3 = V.InterfaceC1734n.f14931a;
                if (objG5 == aVar3.a()) {
                    objG5 = V.J0.a(0.0f);
                    interfaceC1734nR.K(objG5);
                }
                interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
                interfaceC1734nR.J();
                interfaceC1734nR.T(121500336);
                objG6 = interfaceC1734nR.g();
                if (objG6 == aVar3.a()) {
                    objG6 = V.A1.d(bool, null, 2, null);
                    interfaceC1734nR.K(objG6);
                }
                interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
                interfaceC1734nR.J();
                boolean zM6 = m(g1A10);
                interfaceC1734nR.T(121502989);
                objG7 = interfaceC1734nR.g();
                if (objG7 == aVar3.a()) {
                    objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                    interfaceC1734nR.K(objG7);
                }
                interfaceC1734nR.J();
                C9.AbstractC0850d.d(zM6, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
                if (o(g1A2) == null) {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                } else {
                    A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
                dVar5 = dVar4;
                aVar4 = aVar2;
                o12 = o11;
            }
            interfaceC1709e1X = interfaceC1734nR.x();
            if (interfaceC1709e1X != null) {
                interfaceC1709e1X.a(new p237x7.p(str, dVar5, aVar4, o12, lVar, i6, i10) { // from class: C9.l

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f1489D;

                    /* JADX INFO: renamed from: E, reason: collision with root package name */
                    public final /* synthetic */ androidx.compose.ui.d f1490E;

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    public final /* synthetic */ E9.a f1491F;

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    public final /* synthetic */ p237x7.l f1492G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    public final /* synthetic */ int f1493H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    public final /* synthetic */ int f1494I;

                    {
                        this.f1492G = lVar;
                        this.f1493H = i6;
                        this.f1494I = i10;
                    }

                    @Override // p237x7.p
                    public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                        return C9.AbstractC0862p.l(this.f1488C, this.f1489D, this.f1490E, this.f1491F, null, this.f1492G, this.f1493H, this.f1494I, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }
        i11 |= 24576;
        o10 = o6;
        if ((i10 & 32) != 0) {
            i11 |= 196608;
        } else if ((i6 & 196608) == 0) {
            if (interfaceC1734nR.l(lVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i11 |= i14;
        }
        if ((74899 & i11) == 74898) {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i10 & 8) != 0) {
                    interfaceC1734nR.T(121438666);
                    objG = interfaceC1734nR.g();
                    if (objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                        interfaceC1734nR.K(objG);
                    }
                    aVar5 = (E9.a) objG;
                    interfaceC1734nR.J();
                    i11 &= -7169;
                }
                aVar2 = aVar5;
                i15 = i11;
                dVar4 = dVar3;
                if (i12 != 0) {
                    o11 = null;
                } else {
                    o11 = o10;
                }
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i10 & 8) != 0) {
                    interfaceC1734nR.T(121438666);
                    objG = interfaceC1734nR.g();
                    if (objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                        interfaceC1734nR.K(objG);
                    }
                    aVar5 = (E9.a) objG;
                    interfaceC1734nR.J();
                    i11 &= -7169;
                }
                aVar2 = aVar5;
                i15 = i11;
                dVar4 = dVar3;
                if (i12 != 0) {
                    o11 = null;
                } else {
                    o11 = o10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
            }
            rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
            dVarA = p041e0.f.a(interfaceC1734nR, 0);
            yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
            if (yA != null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            java.lang.Boolean bool8 = java.lang.Boolean.TRUE;
            interfaceC1734nR.T(121456347);
            zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
            objG2 = interfaceC1734nR.g();
            if (zL) {
                objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                interfaceC1734nR.K(objG2);
            }
            interfaceC1734nR.J();
            V.Q.e(bool8, (p237x7.p) objG2, interfaceC1734nR, 6);
            interfaceC1734nR.T(121462239);
            boolean zL9 = interfaceC1734nR.l(vVar);
            i16 = i15 & 112;
            if (i16 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z18 = zL9 | z6;
            if ((458752 & i15) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z18 | z10;
            objG3 = interfaceC1734nR.g();
            if (z11) {
                objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                interfaceC1734nR.K(objG3);
            } else {
                objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                interfaceC1734nR.K(objG3);
            }
            interfaceC1734nR.J();
            V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
            Z8.InterfaceC1869f interfaceC1869fC7 = vVar.b().c();
            bool = java.lang.Boolean.FALSE;
            V.G1 g1A11 = V.v1.a(interfaceC1869fC7, bool, null, interfaceC1734nR, 48, 2);
            g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
            C9.C0853g c0853gN7 = n(g1A);
            interfaceC1734nR.T(121473321);
            zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
            objG4 = interfaceC1734nR.g();
            if (zS) {
                objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                interfaceC1734nR.K(objG4);
            } else {
                objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                interfaceC1734nR.K(objG4);
            }
            interfaceC1734nR.J();
            V.Q.d(c0853gN7, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
            g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
            g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
            g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
            interfaceC1734nR.T(121498258);
            objG5 = interfaceC1734nR.g();
            aVar3 = V.InterfaceC1734n.f14931a;
            if (objG5 == aVar3.a()) {
                objG5 = V.J0.a(0.0f);
                interfaceC1734nR.K(objG5);
            }
            interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
            interfaceC1734nR.J();
            interfaceC1734nR.T(121500336);
            objG6 = interfaceC1734nR.g();
            if (objG6 == aVar3.a()) {
                objG6 = V.A1.d(bool, null, 2, null);
                interfaceC1734nR.K(objG6);
            }
            interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
            interfaceC1734nR.J();
            boolean zM7 = m(g1A11);
            interfaceC1734nR.T(121502989);
            objG7 = interfaceC1734nR.g();
            if (objG7 == aVar3.a()) {
                objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                interfaceC1734nR.K(objG7);
            }
            interfaceC1734nR.J();
            C9.AbstractC0850d.d(zM7, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
            if (o(g1A2) == null) {
                A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
            } else {
                A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar5 = dVar4;
            aVar4 = aVar2;
            o12 = o11;
        } else {
            interfaceC1734nR.q();
            if ((i6 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i10 & 8) != 0) {
                    interfaceC1734nR.T(121438666);
                    objG = interfaceC1734nR.g();
                    if (objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                        interfaceC1734nR.K(objG);
                    }
                    aVar5 = (E9.a) objG;
                    interfaceC1734nR.J();
                    i11 &= -7169;
                }
                aVar2 = aVar5;
                i15 = i11;
                dVar4 = dVar3;
                if (i12 != 0) {
                    o11 = null;
                } else {
                    o11 = o10;
                }
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.f19586a;
                } else {
                    dVar3 = dVar2;
                }
                if ((i10 & 8) != 0) {
                    interfaceC1734nR.T(121438666);
                    objG = interfaceC1734nR.g();
                    if (objG == V.InterfaceC1734n.f14931a.a()) {
                        objG = E9.b.a((63 & 1) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 0.9f, 0L, 5, null)) : null, (63 & 2) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 0.9f, 0L, 5, null)) : null, (63 & 4) != 0 ? androidx.compose.animation.f.q(null, 0.0f, 3, null).c(androidx.compose.animation.f.u(null, 1.1f, 0L, 5, null)) : null, (63 & 8) != 0 ? androidx.compose.animation.f.o(null, 0.0f, 3, null).c(androidx.compose.animation.f.s(null, 1.1f, 0L, 5, null)) : null, (63 & 16) != 0 ? 0.0f : 0.0f, (63 & 32) == 0 ? 0.0f : 0.0f);
                        interfaceC1734nR.K(objG);
                    }
                    aVar5 = (E9.a) objG;
                    interfaceC1734nR.J();
                    i11 &= -7169;
                }
                aVar2 = aVar5;
                i15 = i11;
                dVar4 = dVar3;
                if (i12 != 0) {
                    o11 = null;
                } else {
                    o11 = o10;
                }
            }
            interfaceC1734nR.R();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(399974704, i15, -1, "moe.tlaster.precompose.navigation.NavHost (NavHost.kt:71)");
            }
            rVar = (androidx.lifecycle.r) interfaceC1734nR.n(p003a2.a.a());
            dVarA = p041e0.f.a(interfaceC1734nR, 0);
            yA = p033d2.a.f44287a.a(interfaceC1734nR, p033d2.a.f44289c);
            if (yA != null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            java.lang.Boolean bool9 = java.lang.Boolean.TRUE;
            interfaceC1734nR.T(121456347);
            zL = interfaceC1734nR.l(vVar) | interfaceC1734nR.l(rVar) | interfaceC1734nR.l(yA);
            objG2 = interfaceC1734nR.g();
            if (zL) {
                objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                interfaceC1734nR.K(objG2);
            } else {
                objG2 = new C9.AbstractC0862p.a(vVar, rVar, yA, null);
                interfaceC1734nR.K(objG2);
            }
            interfaceC1734nR.J();
            V.Q.e(bool9, (p237x7.p) objG2, interfaceC1734nR, 6);
            interfaceC1734nR.T(121462239);
            boolean zL10 = interfaceC1734nR.l(vVar);
            i16 = i15 & 112;
            if (i16 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z19 = zL10 | z6;
            if ((458752 & i15) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z19 | z10;
            objG3 = interfaceC1734nR.g();
            if (z11) {
                objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                interfaceC1734nR.K(objG3);
            } else {
                objG3 = new C9.AbstractC0862p.b(vVar, str, lVar, null);
                interfaceC1734nR.K(objG3);
            }
            interfaceC1734nR.J();
            V.Q.d(lVar, str, (p237x7.p) objG3, interfaceC1734nR, ((i15 >> 15) & 14) | i16);
            Z8.InterfaceC1869f interfaceC1869fC8 = vVar.b().c();
            bool = java.lang.Boolean.FALSE;
            V.G1 g1A12 = V.v1.a(interfaceC1869fC8, bool, null, interfaceC1734nR, 48, 2);
            g1A = V.v1.a(vVar.b().d(), null, null, interfaceC1734nR, 48, 2);
            C9.C0853g c0853gN8 = n(g1A);
            interfaceC1734nR.T(121473321);
            zS = interfaceC1734nR.S(g1A) | interfaceC1734nR.l(dVarA);
            objG4 = interfaceC1734nR.g();
            if (zS) {
                objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                interfaceC1734nR.K(objG4);
            } else {
                objG4 = new C9.AbstractC0862p.c(dVarA, g1A, null);
                interfaceC1734nR.K(objG4);
            }
            interfaceC1734nR.J();
            V.Q.d(c0853gN8, dVarA, (p237x7.p) objG4, interfaceC1734nR, 0);
            g1A2 = V.v1.a(vVar.b().h(), null, null, interfaceC1734nR, 48, 2);
            g1A3 = V.v1.a(vVar.b().k(), null, null, interfaceC1734nR, 48, 2);
            g1A4 = V.v1.a(vVar.b().e(), null, null, interfaceC1734nR, 48, 2);
            interfaceC1734nR.T(121498258);
            objG5 = interfaceC1734nR.g();
            aVar3 = V.InterfaceC1734n.f14931a;
            if (objG5 == aVar3.a()) {
                objG5 = V.J0.a(0.0f);
                interfaceC1734nR.K(objG5);
            }
            interfaceC1742q0 = (V.InterfaceC1742q0) objG5;
            interfaceC1734nR.J();
            interfaceC1734nR.T(121500336);
            objG6 = interfaceC1734nR.g();
            if (objG6 == aVar3.a()) {
                objG6 = V.A1.d(bool, null, 2, null);
                interfaceC1734nR.K(objG6);
            }
            interfaceC1753w0 = (V.InterfaceC1753w0) objG6;
            interfaceC1734nR.J();
            boolean zM8 = m(g1A12);
            interfaceC1734nR.T(121502989);
            objG7 = interfaceC1734nR.g();
            if (objG7 == aVar3.a()) {
                objG7 = new C9.AbstractC0862p.d(interfaceC1753w0, interfaceC1742q0, null);
                interfaceC1734nR.K(objG7);
            }
            interfaceC1734nR.J();
            C9.AbstractC0850d.d(zM8, (p237x7.p) objG7, interfaceC1734nR, 0, 0);
            if (o(g1A2) == null) {
                A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
            } else {
                A.AbstractC0772f.a(dVar4, null, false, p031d0.c.e(-1785984417, true, new C9.AbstractC0862p.e(g1A2, o11, g1A3, vVar, aVar2, interfaceC1742q0, interfaceC1753w0, g1A, dVarA, g1A4), interfaceC1734nR, 54), interfaceC1734nR, ((i15 >> 6) & 14) | 3072, 6);
            }
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            dVar5 = dVar4;
            aVar4 = aVar2;
            o12 = o11;
        }
        interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p237x7.p(str, dVar5, aVar4, o12, lVar, i6, i10) { // from class: C9.l

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f1489D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f1490E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                public final /* synthetic */ E9.a f1491F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                public final /* synthetic */ p237x7.l f1492G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                public final /* synthetic */ int f1493H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                public final /* synthetic */ int f1494I;

                {
                    this.f1492G = lVar;
                    this.f1493H = i6;
                    this.f1494I = i10;
                }

                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return C9.AbstractC0862p.l(this.f1488C, this.f1489D, this.f1490E, this.f1491F, null, this.f1492G, this.f1493H, this.f1494I, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(V.InterfaceC1742q0 interfaceC1742q0) {
        return interfaceC1742q0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(V.InterfaceC1742q0 interfaceC1742q0, float f6) {
        interfaceC1742q0.h(f6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(V.InterfaceC1753w0 interfaceC1753w0) {
        return ((java.lang.Boolean) interfaceC1753w0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(V.InterfaceC1753w0 interfaceC1753w0, boolean z6) {
        interfaceC1753w0.setValue(java.lang.Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M l(C9.v vVar, java.lang.String str, androidx.compose.ui.d dVar, E9.a aVar, C9.O o6, p237x7.l lVar, int i6, int i10, V.InterfaceC1734n interfaceC1734n, int i11) {
        g(vVar, str, dVar, aVar, o6, lVar, interfaceC1734n, V.S0.a(i6 | 1), i10);
        return p087i7.M.f46721a;
    }

    private static final boolean m(V.G1 g6) {
        return ((java.lang.Boolean) g6.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9.C0853g n(V.G1 g6) {
        return (C9.C0853g) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9.C0853g o(V.G1 g6) {
        return (C9.C0853g) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9.C0853g p(V.G1 g6) {
        return (C9.C0853g) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9.C0853g q(V.G1 g6) {
        return (C9.C0853g) g6.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final p190t.InterfaceC7154b interfaceC7154b, final p041e0.d dVar, final C9.C0853g c0853g, V.InterfaceC1734n interfaceC1734n, final int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(140306317);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(interfaceC7154b) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(dVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(c0853g) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(140306317, i10, -1, "moe.tlaster.precompose.navigation.NavHostContent (NavHost.kt:271)");
            }
            dVar.d(c0853g.m(), p031d0.c.e(-1752964084, true, new C9.AbstractC0862p.f(c0853g, interfaceC7154b), interfaceC1734nR, 54), interfaceC1734nR, ((i10 << 3) & 896) | 48);
            interfaceC1734nR.T(-1784117660);
            boolean zL = interfaceC1734nR.l(c0853g);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new p237x7.l() { // from class: C9.m
                    @Override // p237x7.l
                    public final java.lang.Object l(java.lang.Object obj) {
                        return C9.AbstractC0862p.s(c0853g, (V.N) obj);
                    }
                };
                interfaceC1734nR.K(objG);
            }
            interfaceC1734nR.J();
            V.Q.b(c0853g, (p237x7.l) objG, interfaceC1734nR, (i10 >> 6) & 14);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new p237x7.p() { // from class: C9.n
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return C9.AbstractC0862p.t(interfaceC7154b, dVar, c0853g, i6, (V.InterfaceC1734n) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V.M s(C9.C0853g c0853g, V.N n6) {
        p247y7.AbstractC7350t.f(n6, "$this$DisposableEffect");
        c0853g.d();
        return new C9.AbstractC0862p.g(c0853g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M t(p190t.InterfaceC7154b interfaceC7154b, p041e0.d dVar, C9.C0853g c0853g, int i6, V.InterfaceC1734n interfaceC1734n, int i10) {
        r(interfaceC7154b, dVar, c0853g, interfaceC1734n, V.S0.a(i6 | 1));
        return p087i7.M.f46721a;
    }

    public static final /* synthetic */ float v(V.InterfaceC1742q0 interfaceC1742q0) {
        return h(interfaceC1742q0);
    }

    public static final /* synthetic */ boolean x(V.InterfaceC1753w0 interfaceC1753w0) {
        return j(interfaceC1753w0);
    }

    public static final /* synthetic */ C9.C0853g z(V.G1 g6) {
        return n(g6);
    }
}
