package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p009a9.g {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p237x7.q f17175G;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17176G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f17177H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f17179J;

        /* JADX INFO: renamed from: a9.i$a$a, reason: collision with other inner class name */
        static final class C0328a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.O f17180C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ W8.N f17181D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p009a9.i f17182E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f17183F;

            /* JADX INFO: renamed from: a9.i$a$a$a, reason: collision with other inner class name */
            static final class C0329a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f17184G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ p009a9.i f17185H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ Z8.InterfaceC1870g f17186I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                final /* synthetic */ java.lang.Object f17187J;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0329a(p009a9.i iVar, Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
                    super(2, eVar);
                    this.f17185H = iVar;
                    this.f17186I = interfaceC1870g;
                    this.f17187J = obj;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f17184G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        p237x7.q qVar = this.f17185H.f17175G;
                        Z8.InterfaceC1870g interfaceC1870g = this.f17186I;
                        java.lang.Object obj2 = this.f17187J;
                        this.f17184G = 1;
                        if (qVar.j(interfaceC1870g, obj2, this) == objG) {
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
                    return ((a9.i.a.C0328a.C0329a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new a9.i.a.C0328a.C0329a(this.f17185H, this.f17186I, this.f17187J, eVar);
                }
            }

            /* JADX INFO: renamed from: a9.i$a$a$b */
            static final class b extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f17188F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f17189G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                java.lang.Object f17190H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                /* synthetic */ java.lang.Object f17191I;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                int f17193K;

                b(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f17191I = obj;
                    this.f17193K |= Integer.MIN_VALUE;
                    return a9.i.a.C0328a.this.a(null, this);
                }
            }

            C0328a(p247y7.O o6, W8.N n6, p009a9.i iVar, Z8.InterfaceC1870g interfaceC1870g) {
                this.f17180C = o6;
                this.f17181D = n6;
                this.f17182E = iVar;
                this.f17183F = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                a9.i.a.C0328a.b bVar;
                a9.i.a.C0328a c0328a;
                if (eVar instanceof a9.i.a.C0328a.b) {
                    bVar = (a9.i.a.C0328a.b) eVar;
                    int i6 = bVar.f17193K;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        bVar.f17193K = i6 - Integer.MIN_VALUE;
                    } else {
                        bVar = new a9.i.a.C0328a.b(eVar);
                    }
                } else {
                    bVar = new a9.i.a.C0328a.b(eVar);
                }
                java.lang.Object obj2 = bVar.f17191I;
                java.lang.Object objG = p137n7.b.g();
                int i10 = bVar.f17193K;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) this.f17180C.f57254C;
                    if (interfaceC1822z0 != null) {
                        interfaceC1822z0.o(new p009a9.k());
                        bVar.f17188F = this;
                        bVar.f17189G = obj;
                        bVar.f17190H = interfaceC1822z0;
                        bVar.f17193K = 1;
                        if (interfaceC1822z0.g0(bVar) == objG) {
                            return objG;
                        }
                    }
                    c0328a = this;
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f17189G;
                    c0328a = (a9.i.a.C0328a) bVar.f17188F;
                    p087i7.x.b(obj2);
                }
                c0328a.f17180C.f57254C = W8.AbstractC1788i.d(c0328a.f17181D, null, W8.P.UNDISPATCHED, new a9.i.a.C0328a.C0329a(c0328a.f17182E, c0328a.f17183F, obj, null), 1, null);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            super(2, eVar);
            this.f17179J = interfaceC1870g;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17176G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f17177H;
                p247y7.O o6 = new p247y7.O();
                p009a9.i iVar = p009a9.i.this;
                Z8.InterfaceC1869f interfaceC1869f = iVar.f17171F;
                a9.i.a.C0328a c0328a = new a9.i.a.C0328a(o6, n6, iVar, this.f17179J);
                this.f17176G = 1;
                if (interfaceC1869f.b(c0328a, this) == objG) {
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
            return ((a9.i.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.i.a aVar = p009a9.i.this.new a(this.f17179J, eVar);
            aVar.f17177H = obj;
            return aVar;
        }
    }

    public i(p237x7.q qVar, Z8.InterfaceC1869f interfaceC1869f, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(interfaceC1869f, iVar, i6, enumC1863d);
        this.f17175G = qVar;
    }

    public /* synthetic */ i(p237x7.q qVar, Z8.InterfaceC1869f interfaceC1869f, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(qVar, interfaceC1869f, (i10 & 4) != 0 ? p127m7.j.f51198C : iVar, (i10 & 8) != 0 ? -2 : i6, (i10 & 16) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    @Override // p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new p009a9.i(this.f17175G, this.f17171F, iVar, i6, enumC1863d);
    }

    @Override // p009a9.g
    protected java.lang.Object t(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new a9.i.a(interfaceC1870g, null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }
}
