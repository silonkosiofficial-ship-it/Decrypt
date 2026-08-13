package p073h2;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6625b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.C6632i f46084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z8.x f46085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z8.C f46086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W8.InterfaceC1822z0 f46087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z8.InterfaceC1869f f46088e;

    /* JADX INFO: renamed from: h2.b$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46089G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46090H;

        /* JADX INFO: renamed from: h2.b$a$a, reason: collision with other inner class name */
        static final class C0537a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46092G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46093H;

            C0537a(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p137n7.b.g();
                if (this.f46092G != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return p147o7.b.a(((p097j7.L) this.f46093H) != null);
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p097j7.L l6, p127m7.e eVar) {
                return ((p073h2.C6625b.a.C0537a) x(l6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6625b.a.C0537a c0537a = new p073h2.C6625b.a.C0537a(eVar);
                c0537a.f46093H = obj;
                return c0537a;
            }
        }

        /* JADX INFO: renamed from: h2.b$a$b, reason: collision with other inner class name */
        static final class C0538b implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.M f46094C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46095D;

            /* JADX INFO: renamed from: h2.b$a$b$a, reason: collision with other inner class name */
            static final class C0539a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f46096F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f46097G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46098H;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f46100J;

                C0539a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46098H = obj;
                    this.f46100J |= Integer.MIN_VALUE;
                    return p073h2.C6625b.a.C0538b.this.a(null, this);
                }
            }

            C0538b(p247y7.M m6, Z8.InterfaceC1870g interfaceC1870g) {
                this.f46094C = m6;
                this.f46095D = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p097j7.L l6, p127m7.e eVar) {
                p073h2.C6625b.a.C0538b.C0539a c0539a;
                p073h2.C6625b.a.C0538b c0538b;
                if (eVar instanceof p073h2.C6625b.a.C0538b.C0539a) {
                    c0539a = (p073h2.C6625b.a.C0538b.C0539a) eVar;
                    int i6 = c0539a.f46100J;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0539a.f46100J = i6 - Integer.MIN_VALUE;
                    } else {
                        c0539a = new p073h2.C6625b.a.C0538b.C0539a(eVar);
                    }
                } else {
                    c0539a = new p073h2.C6625b.a.C0538b.C0539a(eVar);
                }
                java.lang.Object obj = c0539a.f46098H;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0539a.f46100J;
                if (i10 == 0) {
                    p087i7.x.b(obj);
                    p247y7.AbstractC7350t.c(l6);
                    if (l6.c() > this.f46094C.f57252C) {
                        Z8.InterfaceC1870g interfaceC1870g = this.f46095D;
                        java.lang.Object objD = l6.d();
                        c0539a.f46096F = this;
                        c0539a.f46097G = l6;
                        c0539a.f46100J = 1;
                        if (interfaceC1870g.a(objD, c0539a) == objG) {
                            return objG;
                        }
                        c0538b = this;
                    }
                    return p087i7.M.f46721a;
                }
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l6 = (p097j7.L) c0539a.f46097G;
                c0538b = (p073h2.C6625b.a.C0538b) c0539a.f46096F;
                p087i7.x.b(obj);
                c0538b.f46094C.f57252C = l6.c();
                return p087i7.M.f46721a;
            }
        }

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46089G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f46090H;
                p247y7.M m6 = new p247y7.M();
                m6.f57252C = Integer.MIN_VALUE;
                Z8.InterfaceC1869f interfaceC1869fM = Z8.AbstractC1871h.M(p073h2.C6625b.this.f46086c, new p073h2.C6625b.a.C0537a(null));
                p073h2.C6625b.a.C0538b c0538b = new p073h2.C6625b.a.C0538b(m6, interfaceC1870g);
                this.f46089G = 1;
                if (interfaceC1869fM.b(c0538b, this) == objG) {
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
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.C6625b.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6625b.a aVar = p073h2.C6625b.this.new a(eVar);
            aVar.f46090H = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: h2.b$b, reason: collision with other inner class name */
    static final class C0540b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46101G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46102H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p073h2.C6625b f46103I;

        /* JADX INFO: renamed from: h2.b$b$a */
        static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p073h2.C6625b f46104C;

            /* JADX INFO: renamed from: h2.b$b$a$a, reason: collision with other inner class name */
            static final class C0541a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f46105F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f46106G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46107H;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f46109J;

                C0541a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46107H = obj;
                    this.f46109J |= Integer.MIN_VALUE;
                    return p073h2.C6625b.C0540b.a.this.a(null, this);
                }
            }

            a(p073h2.C6625b c6625b) {
                this.f46104C = c6625b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(p097j7.L l6, p127m7.e eVar) {
                p073h2.C6625b.C0540b.a.C0541a c0541a;
                p073h2.C6625b.C0540b.a aVar;
                if (eVar instanceof p073h2.C6625b.C0540b.a.C0541a) {
                    c0541a = (p073h2.C6625b.C0540b.a.C0541a) eVar;
                    int i6 = c0541a.f46109J;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0541a.f46109J = i6 - Integer.MIN_VALUE;
                    } else {
                        c0541a = new p073h2.C6625b.C0540b.a.C0541a(eVar);
                    }
                } else {
                    c0541a = new p073h2.C6625b.C0540b.a.C0541a(eVar);
                }
                java.lang.Object obj = c0541a.f46107H;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0541a.f46109J;
                if (i10 != 0) {
                    if (i10 == 1) {
                        l6 = (p097j7.L) c0541a.f46106G;
                        aVar = (p073h2.C6625b.C0540b.a) c0541a.f46105F;
                        p087i7.x.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                Z8.x xVar = this.f46104C.f46085b;
                c0541a.f46105F = this;
                c0541a.f46106G = l6;
                c0541a.f46109J = 1;
                if (xVar.a(l6, c0541a) == objG) {
                    return objG;
                }
                aVar = this;
                p073h2.C6632i c6632i = aVar.f46104C.f46084a;
                c0541a.f46105F = null;
                c0541a.f46106G = null;
                c0541a.f46109J = 2;
                if (c6632i.c(l6, c0541a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0540b(Z8.InterfaceC1869f interfaceC1869f, p073h2.C6625b c6625b, p127m7.e eVar) {
            super(2, eVar);
            this.f46102H = interfaceC1869f;
            this.f46103I = c6625b;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46101G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1869f interfaceC1869fO = Z8.AbstractC1871h.O(this.f46102H);
                p073h2.C6625b.C0540b.a aVar = new p073h2.C6625b.C0540b.a(this.f46103I);
                this.f46101G = 1;
                if (interfaceC1869fO.b(aVar, this) == objG) {
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
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((p073h2.C6625b.C0540b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new p073h2.C6625b.C0540b(this.f46102H, this.f46103I, eVar);
        }
    }

    /* JADX INFO: renamed from: h2.b$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {
        c() {
            super(1);
        }

        public final void a(java.lang.Throwable th) {
            p073h2.C6625b.this.f46085b.n(null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: h2.b$d */
    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46111G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f46112H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46113I;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0056->B:24:?, LOOP_END, SYNTHETIC] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            Z8.InterfaceC1870g interfaceC1870g2;
            java.util.Iterator it;
            p097j7.L l6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46112H;
            if (i6 != 0) {
                if (i6 == 1) {
                    interfaceC1870g = (Z8.InterfaceC1870g) this.f46113I;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) this.f46111G;
                    interfaceC1870g2 = (Z8.InterfaceC1870g) this.f46113I;
                    p087i7.x.b(obj);
                }
                while (it.hasNext()) {
                    l6 = (p097j7.L) it.next();
                    this.f46113I = interfaceC1870g2;
                    this.f46111G = it;
                    this.f46112H = 2;
                    if (interfaceC1870g2.a(l6, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            interfaceC1870g = (Z8.InterfaceC1870g) this.f46113I;
            p073h2.C6632i c6632i = p073h2.C6625b.this.f46084a;
            this.f46113I = interfaceC1870g;
            this.f46112H = 1;
            obj = c6632i.b(this);
            if (obj == objG) {
                return objG;
            }
            p073h2.C6625b.this.f46087d.start();
            interfaceC1870g2 = interfaceC1870g;
            it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                l6 = (p097j7.L) it.next();
                this.f46113I = interfaceC1870g2;
                this.f46111G = it;
                this.f46112H = 2;
                if (interfaceC1870g2.a(l6, this) == objG) {
                    return objG;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.C6625b.d) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.C6625b.d dVar = p073h2.C6625b.this.new d(eVar);
            dVar.f46113I = obj;
            return dVar;
        }
    }

    public C6625b(Z8.InterfaceC1869f interfaceC1869f, W8.N n6) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "src");
        p247y7.AbstractC7350t.f(n6, "scope");
        this.f46084a = new p073h2.C6632i();
        Z8.x xVarA = Z8.E.a(1, Integer.MAX_VALUE, Y8.EnumC1863d.SUSPEND);
        this.f46085b = xVarA;
        this.f46086c = Z8.AbstractC1871h.I(xVarA, new p073h2.C6625b.d(null));
        W8.InterfaceC1822z0 interfaceC1822z0D = W8.AbstractC1788i.d(n6, null, W8.P.LAZY, new p073h2.C6625b.C0540b(interfaceC1869f, this, null), 1, null);
        interfaceC1822z0D.e1(new p073h2.C6625b.c());
        this.f46087d = interfaceC1822z0D;
        this.f46088e = Z8.AbstractC1871h.x(new p073h2.C6625b.a(null));
    }

    public final void e() {
        W8.InterfaceC1822z0.a.a(this.f46087d, null, 1, null);
    }

    public final p073h2.AbstractC6646x.b f() {
        return this.f46084a.a();
    }

    public final Z8.InterfaceC1869f g() {
        return this.f46088e;
    }
}
