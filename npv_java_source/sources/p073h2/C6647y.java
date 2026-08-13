package p073h2;

/* JADX INFO: renamed from: h2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6647y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f46301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f46302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.E f46303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p073h2.C6631h f46304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p073h2.C6631h f46305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z8.InterfaceC1869f f46306f;

    /* JADX INFO: renamed from: h2.y$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.C6648z f46307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p073h2.M f46308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final W8.InterfaceC1822z0 f46309c;

        public a(p073h2.C6648z c6648z, p073h2.M m6, W8.InterfaceC1822z0 interfaceC1822z0) {
            p247y7.AbstractC7350t.f(c6648z, "snapshot");
            p247y7.AbstractC7350t.f(interfaceC1822z0, "job");
            this.f46307a = c6648z;
            this.f46308b = m6;
            this.f46309c = interfaceC1822z0;
        }

        public final W8.InterfaceC1822z0 a() {
            return this.f46309c;
        }

        public final p073h2.C6648z b() {
            return this.f46307a;
        }

        public final p073h2.M c() {
            return this.f46308b;
        }
    }

    /* JADX INFO: renamed from: h2.y$b */
    public final class b implements p073h2.InterfaceC6638o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.C6648z f46310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p073h2.C6647y f46311b;

        public b(p073h2.C6647y c6647y, p073h2.C6648z c6648z) {
            p247y7.AbstractC7350t.f(c6648z, "pageFetcherSnapshot");
            this.f46311b = c6647y;
            this.f46310a = c6648z;
        }

        @Override // p073h2.InterfaceC6638o
        public void a(p073h2.Z z6) {
            p247y7.AbstractC7350t.f(z6, "viewportHint");
            this.f46310a.o(z6);
        }
    }

    /* JADX INFO: renamed from: h2.y$c */
    public final class c implements p073h2.X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p073h2.C6631h f46312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p073h2.C6647y f46313b;

        public c(p073h2.C6647y c6647y, p073h2.C6631h c6631h) {
            p247y7.AbstractC7350t.f(c6631h, "retryEventBus");
            this.f46313b = c6647y;
            this.f46312a = c6631h;
        }
    }

    /* JADX INFO: renamed from: h2.y$d */
    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46314G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46315H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p073h2.C6647y f46316I;

        /* JADX INFO: renamed from: h2.y$d$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46317G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f46318H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p073h2.P f46319I;

            a(p073h2.P p6, p127m7.e eVar) {
                super(2, eVar);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0043  */
            /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                Z8.InterfaceC1870g interfaceC1870g;
                h2.O.a aVar;
                java.lang.Boolean boolA;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46317G;
                if (i6 != 0) {
                    if (i6 == 1) {
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f46318H;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                interfaceC1870g = (Z8.InterfaceC1870g) this.f46318H;
                p073h2.P p6 = this.f46319I;
                if (p6 != null) {
                    this.f46318H = interfaceC1870g;
                    this.f46317G = 1;
                    obj = p6.c(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    aVar = null;
                }
                boolA = p147o7.b.a(aVar == h2.O.a.LAUNCH_INITIAL_REFRESH);
                this.f46318H = null;
                this.f46317G = 2;
                if (interfaceC1870g.a(boolA, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
                aVar = (h2.O.a) obj;
                boolA = p147o7.b.a(aVar == h2.O.a.LAUNCH_INITIAL_REFRESH);
                this.f46318H = null;
                this.f46317G = 2;
                if (interfaceC1870g.a(boolA, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
                return ((p073h2.C6647y.d.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6647y.d.a aVar = new p073h2.C6647y.d.a(this.f46319I, eVar);
                aVar.f46318H = obj;
                return aVar;
            }
        }

        /* JADX INFO: renamed from: h2.y$d$b */
        static final class b extends p147o7.l implements p237x7.q {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f46320G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f46321H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46322I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            /* synthetic */ boolean f46323J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p073h2.P f46324K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ p073h2.C6647y f46325L;

            /* JADX INFO: renamed from: h2.y$d$b$a */
            /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {
                a(java.lang.Object obj) {
                    super(0, obj, p073h2.C6647y.class, "refresh", "refresh()V", 0);
                }

                @Override // p237x7.a
                public /* bridge */ /* synthetic */ java.lang.Object b() {
                    s();
                    return p087i7.M.f46721a;
                }

                public final void s() {
                    ((p073h2.C6647y) this.f57287D).l();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p073h2.P p6, p073h2.C6647y c6647y, p127m7.e eVar) {
                super(3, eVar);
                this.f46325L = c6647y;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x007c  */
            /* JADX WARN: Code duplicated, block: B:37:0x0081  */
            /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:58:0x00be  */
            /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
            /* JADX WARN: Instruction removed from duplicated block: B:66:0x00dc, please report this as an issue */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p073h2.C6647y.a aVar;
                p073h2.C6648z c6648zB;
                p073h2.P p6;
                p073h2.L l6;
                p073h2.M mC;
                p073h2.C6648z c6648zB2;
                p073h2.L l10;
                java.util.List listC;
                java.util.List list;
                p073h2.M mC2;
                java.util.List listC2;
                java.lang.Integer numA;
                java.lang.Object objD;
                p073h2.K k6;
                W8.InterfaceC1822z0 interfaceC1822z0A;
                p073h2.C6648z c6648zB3;
                java.lang.Integer numA2;
                p073h2.M mC3;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46321H;
                if (i6 != 0) {
                    if (i6 == 1) {
                        aVar = (p073h2.C6647y.a) this.f46322I;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l10 = (p073h2.L) this.f46320G;
                        aVar = (p073h2.C6647y.a) this.f46322I;
                        p087i7.x.b(obj);
                    }
                    mC = (p073h2.M) obj;
                    l6 = l10;
                    if (mC != null) {
                        listC = mC.c();
                    } else {
                        listC = null;
                    }
                    list = listC;
                    if ((list != null || list.isEmpty()) && aVar != null && (mC2 = aVar.c()) != null && (listC2 = mC2.c()) != null && (!listC2.isEmpty())) {
                    }
                    if (mC != null) {
                        numA = mC.a();
                    } else {
                        numA = null;
                    }
                    if (numA == null) {
                        if (aVar != null || (mC3 = aVar.c()) == null) {
                            numA2 = null;
                        } else {
                            numA2 = mC3.a();
                        }
                        if (numA2 != null) {
                            mC = aVar.c();
                        }
                    }
                    if (mC == null) {
                        objD = this.f46325L.f46302b;
                    } else {
                        objD = l6.d(mC);
                        k6 = p073h2.K.f45981a;
                        if (k6.a(3)) {
                            k6.b(3, "Refresh key " + objD + " returned from PagingSource " + l6, null);
                        }
                    }
                    java.lang.Object obj2 = objD;
                    if (aVar != null && (c6648zB3 = aVar.b()) != null) {
                        c6648zB3.p();
                    }
                    if (aVar != null && (interfaceC1822z0A = aVar.a()) != null) {
                        W8.InterfaceC1822z0.a.a(interfaceC1822z0A, null, 1, null);
                    }
                    return new p073h2.C6647y.a(new p073h2.C6648z(obj2, l6, this.f46325L.f46303c, this.f46325L.f46305e.a(), this.f46324K, mC, new p073h2.C6647y.d.b.a(this.f46325L)), mC, W8.D0.b(null, 1, null));
                }
                p087i7.x.b(obj);
                p073h2.C6647y.a aVar2 = (p073h2.C6647y.a) this.f46322I;
                if (this.f46323J && (p6 = this.f46324K) != null) {
                    p6.e();
                }
                p073h2.C6647y c6647y = this.f46325L;
                p073h2.L lV = (aVar2 == null || (c6648zB = aVar2.b()) == null) ? null : c6648zB.v();
                this.f46322I = aVar2;
                this.f46321H = 1;
                java.lang.Object objH = c6647y.h(lV, this);
                if (objH == objG) {
                    return objG;
                }
                aVar = aVar2;
                obj = objH;
                p073h2.L l11 = (p073h2.L) obj;
                if (aVar == null || (c6648zB2 = aVar.b()) == null) {
                    l6 = l11;
                    mC = null;
                } else {
                    this.f46322I = aVar;
                    this.f46320G = l11;
                    this.f46321H = 2;
                    java.lang.Object objR = c6648zB2.r(this);
                    if (objR == objG) {
                        return objG;
                    }
                    l10 = l11;
                    obj = objR;
                    mC = (p073h2.M) obj;
                    l6 = l10;
                }
                if (mC != null) {
                    listC = mC.c();
                } else {
                    listC = null;
                }
                list = listC;
                mC = list != null ? aVar.c() : aVar.c();
                if (mC != null) {
                    numA = mC.a();
                } else {
                    numA = null;
                }
                if (numA == null) {
                    if (aVar != null) {
                        numA2 = null;
                    } else {
                        numA2 = null;
                    }
                    if (numA2 != null) {
                        mC = aVar.c();
                    }
                }
                if (mC == null) {
                    objD = this.f46325L.f46302b;
                } else {
                    objD = l6.d(mC);
                    k6 = p073h2.K.f45981a;
                    if (k6.a(3)) {
                        k6.b(3, "Refresh key " + objD + " returned from PagingSource " + l6, null);
                    }
                }
                java.lang.Object obj3 = objD;
                if (aVar != null) {
                    c6648zB3.p();
                }
                if (aVar != null) {
                    W8.InterfaceC1822z0.a.a(interfaceC1822z0A, null, 1, null);
                }
                return new p073h2.C6647y.a(new p073h2.C6648z(obj3, l6, this.f46325L.f46303c, this.f46325L.f46305e.a(), this.f46324K, mC, new p073h2.C6647y.d.b.a(this.f46325L)), mC, W8.D0.b(null, 1, null));
            }

            public final java.lang.Object H(p073h2.C6647y.a aVar, boolean z6, p127m7.e eVar) {
                p073h2.C6647y.d.b bVar = new p073h2.C6647y.d.b(this.f46324K, this.f46325L, eVar);
                bVar.f46322I = aVar;
                bVar.f46323J = z6;
                return bVar.B(p087i7.M.f46721a);
            }

            @Override // p237x7.q
            public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return H((p073h2.C6647y.a) obj, ((java.lang.Boolean) obj2).booleanValue(), (p127m7.e) obj3);
            }
        }

        /* JADX INFO: renamed from: h2.y$d$c */
        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46326G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46327H;

            c(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f46326G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                p073h2.AbstractC6646x abstractC6646x = (p073h2.AbstractC6646x) this.f46327H;
                p073h2.K k6 = p073h2.K.f45981a;
                if (k6.a(2)) {
                    k6.b(2, "Sent " + abstractC6646x, null);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p073h2.AbstractC6646x abstractC6646x, p127m7.e eVar) {
                return ((p073h2.C6647y.d.c) x(abstractC6646x, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6647y.d.c cVar = new p073h2.C6647y.d.c(eVar);
                cVar.f46327H = obj;
                return cVar;
            }
        }

        /* JADX INFO: renamed from: h2.y$d$d, reason: collision with other inner class name */
        /* synthetic */ class C0553d implements Z8.InterfaceC1870g, p247y7.InterfaceC7345n {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p073h2.T f46328C;

            C0553d(p073h2.T t6) {
                this.f46328C = t6;
            }

            @Override // p247y7.InterfaceC7345n
            public final p087i7.InterfaceC6663i b() {
                return new p247y7.C7348q(2, this.f46328C, p073h2.T.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p073h2.F f6, p127m7.e eVar) {
                java.lang.Object objH = this.f46328C.h(f6, eVar);
                return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof Z8.InterfaceC1870g) && (obj instanceof p247y7.InterfaceC7345n)) {
                    return p247y7.AbstractC7350t.b(b(), ((p247y7.InterfaceC7345n) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        /* JADX INFO: renamed from: h2.y$d$e */
        public static final class e extends p147o7.l implements p237x7.q {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46329G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f46330H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46331I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p073h2.C6647y f46332J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p073h2.P f46333K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(p127m7.e eVar, p073h2.C6647y c6647y, p073h2.P p6) {
                super(3, eVar);
                this.f46332J = c6647y;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46329G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f46330H;
                    p073h2.C6647y.a aVar = (p073h2.C6647y.a) this.f46331I;
                    Z8.InterfaceC1869f interfaceC1869fG = Z8.AbstractC1871h.G(this.f46332J.j(aVar.b(), aVar.a(), this.f46333K), new p073h2.C6647y.d.c(null));
                    p073h2.C6647y c6647y = this.f46332J;
                    p073h2.F f6 = new p073h2.F(interfaceC1869fG, new p073h2.C6647y.c(c6647y, c6647y.f46305e), new p073h2.C6647y.b(this.f46332J, aVar.b()), null, 8, null);
                    this.f46329G = 1;
                    if (interfaceC1870g.a(f6, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.q
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6647y.d.e eVar2 = new p073h2.C6647y.d.e(eVar, this.f46332J, this.f46333K);
                eVar2.f46330H = interfaceC1870g;
                eVar2.f46331I = obj;
                return eVar2.B(p087i7.M.f46721a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p073h2.O o6, p073h2.C6647y c6647y, p127m7.e eVar) {
            super(2, eVar);
            this.f46316I = c6647y;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46314G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.T t6 = (p073h2.T) this.f46315H;
                Z8.InterfaceC1869f interfaceC1869fD = p073h2.AbstractC6634k.d(Z8.AbstractC1871h.t(p073h2.AbstractC6634k.c(Z8.AbstractC1871h.H(this.f46316I.f46304d.a(), new p073h2.C6647y.d.a(null, null)), null, new p073h2.C6647y.d.b(null, this.f46316I, null))), new p073h2.C6647y.d.e(null, this.f46316I, null));
                p073h2.C6647y.d.C0553d c0553d = new p073h2.C6647y.d.C0553d(t6);
                this.f46314G = 1;
                if (interfaceC1869fD.b(c0553d, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
            return ((p073h2.C6647y.d) x(t6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6647y.d dVar = new p073h2.C6647y.d(null, this.f46316I, eVar);
            dVar.f46315H = obj;
            return dVar;
        }
    }

    /* JADX INFO: renamed from: h2.y$e */
    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f46334F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46335G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46336H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f46338J;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f46336H = obj;
            this.f46338J |= Integer.MIN_VALUE;
            return p073h2.C6647y.this.h(null, this);
        }
    }

    /* JADX INFO: renamed from: h2.y$f */
    /* synthetic */ class f extends p247y7.C7348q implements p237x7.a {
        f(java.lang.Object obj) {
            super(0, obj, p073h2.C6647y.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p073h2.C6647y) this.f57287D).k();
        }
    }

    /* JADX INFO: renamed from: h2.y$g */
    /* synthetic */ class g extends p247y7.C7348q implements p237x7.a {
        g(java.lang.Object obj) {
            super(0, obj, p073h2.C6647y.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p073h2.C6647y) this.f57287D).k();
        }
    }

    /* JADX INFO: renamed from: h2.y$h */
    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46339G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46340H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p073h2.P f46341I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p073h2.C6648z f46342J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p073h2.C6645w f46343K;

        /* JADX INFO: renamed from: h2.y$h$a */
        static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p073h2.T f46344C;

            a(p073h2.T t6) {
                this.f46344C = t6;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p073h2.AbstractC6646x abstractC6646x, p127m7.e eVar) {
                java.lang.Object objH = this.f46344C.h(abstractC6646x, eVar);
                return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: h2.y$h$b */
        public static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46345G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f46346H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1869f f46347I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1869f f46348J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p073h2.C6645w f46349K;

            /* JADX INFO: renamed from: h2.y$h$b$a */
            public static final class a extends p147o7.l implements p237x7.r {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46350G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46351H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46352I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46353J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                final /* synthetic */ p073h2.T f46354K;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                final /* synthetic */ p073h2.C6645w f46355L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(p073h2.T t6, p127m7.e eVar, p073h2.C6645w c6645w) {
                    super(4, eVar);
                    this.f46355L = c6645w;
                    this.f46354K = t6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f46350G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        java.lang.Object obj2 = this.f46351H;
                        java.lang.Object obj3 = this.f46352I;
                        p073h2.EnumC6629f enumC6629f = (p073h2.EnumC6629f) this.f46353J;
                        p073h2.T t6 = this.f46354K;
                        java.lang.Object cVar = (p073h2.AbstractC6646x) obj3;
                        p073h2.C6641s c6641s = (p073h2.C6641s) obj2;
                        if (enumC6629f == p073h2.EnumC6629f.RECEIVER) {
                            cVar = new p073h2.AbstractC6646x.c(this.f46355L.d(), c6641s);
                        } else if (cVar instanceof p073h2.AbstractC6646x.b) {
                            p073h2.AbstractC6646x.b bVar = (p073h2.AbstractC6646x.b) cVar;
                            this.f46355L.b(bVar.k());
                            cVar = p073h2.AbstractC6646x.b.e(bVar, null, null, 0, 0, bVar.k(), c6641s, 15, null);
                        } else if (cVar instanceof p073h2.AbstractC6646x.a) {
                            this.f46355L.c(((p073h2.AbstractC6646x.a) cVar).c(), h2.r.c.f46235b.b());
                        } else {
                            if (!(cVar instanceof p073h2.AbstractC6646x.c)) {
                                throw new p087i7.s();
                            }
                            p073h2.AbstractC6646x.c cVar2 = (p073h2.AbstractC6646x.c) cVar;
                            this.f46355L.b(cVar2.d());
                            cVar = new p073h2.AbstractC6646x.c(cVar2.d(), c6641s);
                        }
                        this.f46350G = 1;
                        if (t6.h(cVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }

                @Override // p237x7.r
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, p073h2.EnumC6629f enumC6629f, p127m7.e eVar) {
                    p073h2.C6647y.h.b.a aVar = new p073h2.C6647y.h.b.a(this.f46354K, eVar, this.f46355L);
                    aVar.f46351H = obj;
                    aVar.f46352I = obj2;
                    aVar.f46353J = enumC6629f;
                    return aVar.B(p087i7.M.f46721a);
                }
            }

            /* JADX INFO: renamed from: h2.y$h$b$b, reason: collision with other inner class name */
            public static final class C0554b extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46356G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ p073h2.T f46357H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ Z8.InterfaceC1869f f46358I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f46359J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                final /* synthetic */ p073h2.Y f46360K;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                final /* synthetic */ int f46361L;

                /* JADX INFO: renamed from: h2.y$h$b$b$a */
                public static final class a implements Z8.InterfaceC1870g {

                    /* JADX INFO: renamed from: C, reason: collision with root package name */
                    final /* synthetic */ p073h2.Y f46362C;

                    /* JADX INFO: renamed from: D, reason: collision with root package name */
                    final /* synthetic */ int f46363D;

                    /* JADX INFO: renamed from: h2.y$h$b$b$a$a, reason: collision with other inner class name */
                    static final class C0555a extends p147o7.d {

                        /* JADX INFO: renamed from: F, reason: collision with root package name */
                        /* synthetic */ java.lang.Object f46364F;

                        /* JADX INFO: renamed from: G, reason: collision with root package name */
                        int f46365G;

                        C0555a(p127m7.e eVar) {
                            super(eVar);
                        }

                        @Override // p147o7.a
                        public final java.lang.Object B(java.lang.Object obj) {
                            this.f46364F = obj;
                            this.f46365G |= Integer.MIN_VALUE;
                            return p073h2.C6647y.h.b.C0554b.a.this.a(null, this);
                        }
                    }

                    public a(p073h2.Y y6, int i6) {
                        this.f46362C = y6;
                        this.f46363D = i6;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // Z8.InterfaceC1870g
                    public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                        p073h2.C6647y.h.b.C0554b.a.C0555a c0555a;
                        if (eVar instanceof p073h2.C6647y.h.b.C0554b.a.C0555a) {
                            c0555a = (p073h2.C6647y.h.b.C0554b.a.C0555a) eVar;
                            int i6 = c0555a.f46365G;
                            if ((i6 & Integer.MIN_VALUE) != 0) {
                                c0555a.f46365G = i6 - Integer.MIN_VALUE;
                            } else {
                                c0555a = new p073h2.C6647y.h.b.C0554b.a.C0555a(eVar);
                            }
                        } else {
                            c0555a = new p073h2.C6647y.h.b.C0554b.a.C0555a(eVar);
                        }
                        java.lang.Object obj2 = c0555a.f46364F;
                        java.lang.Object objG = p137n7.b.g();
                        int i10 = c0555a.f46365G;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                p087i7.x.b(obj2);
                            } else {
                                if (i10 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                p087i7.x.b(obj2);
                            }
                            return p087i7.M.f46721a;
                        }
                        p087i7.x.b(obj2);
                        p073h2.Y y6 = this.f46362C;
                        int i11 = this.f46363D;
                        c0555a.f46365G = 1;
                        if (y6.a(i11, obj, c0555a) == objG) {
                            return objG;
                        }
                        c0555a.f46365G = 2;
                        if (W8.g1.a(c0555a) == objG) {
                            return objG;
                        }
                        return p087i7.M.f46721a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0554b(Z8.InterfaceC1869f interfaceC1869f, java.util.concurrent.atomic.AtomicInteger atomicInteger, p073h2.T t6, p073h2.Y y6, int i6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f46358I = interfaceC1869f;
                    this.f46359J = atomicInteger;
                    this.f46360K = y6;
                    this.f46361L = i6;
                    this.f46357H = t6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f46356G;
                    try {
                        if (i6 == 0) {
                            p087i7.x.b(obj);
                            Z8.InterfaceC1869f interfaceC1869f = this.f46358I;
                            p073h2.C6647y.h.b.C0554b.a aVar = new p073h2.C6647y.h.b.C0554b.a(this.f46360K, this.f46361L);
                            this.f46356G = 1;
                            if (interfaceC1869f.b(aVar, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p087i7.x.b(obj);
                        }
                        if (this.f46359J.decrementAndGet() == 0) {
                            Y8.C.a.a(this.f46357H, null, 1, null);
                        }
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        if (this.f46359J.decrementAndGet() == 0) {
                            Y8.C.a.a(this.f46357H, null, 1, null);
                        }
                        throw th;
                    }
                }

                @Override // p237x7.p
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                    return ((p073h2.C6647y.h.b.C0554b) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new p073h2.C6647y.h.b.C0554b(this.f46358I, this.f46359J, this.f46357H, this.f46360K, this.f46361L, eVar);
                }
            }

            /* JADX INFO: renamed from: h2.y$h$b$c */
            public static final class c extends p247y7.AbstractC7352v implements p237x7.a {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ W8.InterfaceC1819y f46367D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(W8.InterfaceC1819y interfaceC1819y) {
                    super(0);
                    this.f46367D = interfaceC1819y;
                }

                public final void a() {
                    W8.InterfaceC1822z0.a.a(this.f46367D, null, 1, null);
                }

                @Override // p237x7.a
                public /* bridge */ /* synthetic */ java.lang.Object b() {
                    a();
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Z8.InterfaceC1869f interfaceC1869f, Z8.InterfaceC1869f interfaceC1869f2, p127m7.e eVar, p073h2.C6645w c6645w) {
                super(2, eVar);
                this.f46347I = interfaceC1869f;
                this.f46348J = interfaceC1869f2;
                this.f46349K = c6645w;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                int i6 = 0;
                java.lang.Object objG = p137n7.b.g();
                int i10 = this.f46345G;
                if (i10 == 0) {
                    p087i7.x.b(obj);
                    p073h2.T t6 = (p073h2.T) this.f46346H;
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(2);
                    p073h2.Y y6 = new p073h2.Y(new p073h2.C6647y.h.b.a(t6, null, this.f46349K));
                    W8.InterfaceC1819y interfaceC1819yB = W8.D0.b(null, 1, null);
                    Z8.InterfaceC1869f[] interfaceC1869fArr = {this.f46347I, this.f46348J};
                    int i11 = 0;
                    while (i6 < 2) {
                        W8.AbstractC1788i.d(t6, interfaceC1819yB, null, new p073h2.C6647y.h.b.C0554b(interfaceC1869fArr[i6], atomicInteger, t6, y6, i11, null), 2, null);
                        i6++;
                        i11++;
                        interfaceC1869fArr = interfaceC1869fArr;
                    }
                    p073h2.C6647y.h.b.c cVar = new p073h2.C6647y.h.b.c(interfaceC1819yB);
                    this.f46345G = 1;
                    if (t6.m1(cVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
                return ((p073h2.C6647y.h.b) x(t6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6647y.h.b bVar = new p073h2.C6647y.h.b(this.f46347I, this.f46348J, eVar, this.f46349K);
                bVar.f46346H = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p073h2.P p6, p073h2.C6648z c6648z, p073h2.C6645w c6645w, p127m7.e eVar) {
            super(2, eVar);
            this.f46342J = c6648z;
            this.f46343K = c6645w;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46339G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.T t6 = (p073h2.T) this.f46340H;
                Z8.InterfaceC1869f interfaceC1869fA = p073h2.S.a(new p073h2.C6647y.h.b(this.f46341I.getState(), this.f46342J.u(), null, this.f46343K));
                p073h2.C6647y.h.a aVar = new p073h2.C6647y.h.a(t6);
                this.f46339G = 1;
                if (interfaceC1869fA.b(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
            return ((p073h2.C6647y.h) x(t6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6647y.h hVar = new p073h2.C6647y.h(this.f46341I, this.f46342J, this.f46343K, eVar);
            hVar.f46340H = obj;
            return hVar;
        }
    }

    public C6647y(p237x7.l lVar, java.lang.Object obj, p073h2.E e6, p073h2.O o6) {
        p247y7.AbstractC7350t.f(lVar, "pagingSourceFactory");
        p247y7.AbstractC7350t.f(e6, "config");
        this.f46301a = lVar;
        this.f46302b = obj;
        this.f46303c = e6;
        this.f46304d = new p073h2.C6631h(null, 1, null);
        this.f46305e = new p073h2.C6631h(null, 1, null);
        this.f46306f = p073h2.S.a(new p073h2.C6647y.d(o6, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p073h2.L l6, p127m7.e eVar) {
        p073h2.C6647y.e eVar2;
        p073h2.C6647y c6647y;
        if (eVar instanceof p073h2.C6647y.e) {
            eVar2 = (p073h2.C6647y.e) eVar;
            int i6 = eVar2.f46338J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar2.f46338J = i6 - Integer.MIN_VALUE;
            } else {
                eVar2 = new p073h2.C6647y.e(eVar);
            }
        } else {
            eVar2 = new p073h2.C6647y.e(eVar);
        }
        java.lang.Object objL = eVar2.f46336H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = eVar2.f46338J;
        if (i10 == 0) {
            p087i7.x.b(objL);
            p237x7.l lVar = this.f46301a;
            eVar2.f46334F = this;
            eVar2.f46335G = l6;
            eVar2.f46338J = 1;
            objL = lVar.l(eVar2);
            if (objL == objG) {
                return objG;
            }
            c6647y = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l6 = (p073h2.L) eVar2.f46335G;
            c6647y = (p073h2.C6647y) eVar2.f46334F;
            p087i7.x.b(objL);
        }
        p073h2.L l10 = (p073h2.L) objL;
        if (l10 == l6) {
            throw new java.lang.IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
        }
        l10.g(new p073h2.C6647y.f(c6647y));
        if (l6 != null) {
            l6.h(new p073h2.C6647y.g(c6647y));
        }
        if (l6 != null) {
            l6.e();
        }
        p073h2.K k6 = p073h2.K.f45981a;
        if (k6.a(3)) {
            k6.b(3, "Generated new PagingSource " + l10, null);
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z8.InterfaceC1869f j(p073h2.C6648z c6648z, W8.InterfaceC1822z0 interfaceC1822z0, p073h2.P p6) {
        return p6 == null ? c6648z.u() : p073h2.AbstractC6627d.a(interfaceC1822z0, new p073h2.C6647y.h(p6, c6648z, new p073h2.C6645w(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f46304d.b(java.lang.Boolean.FALSE);
    }

    public final Z8.InterfaceC1869f i() {
        return this.f46306f;
    }

    public final void l() {
        this.f46304d.b(java.lang.Boolean.TRUE);
    }
}
