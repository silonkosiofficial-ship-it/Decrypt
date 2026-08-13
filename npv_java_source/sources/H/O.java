package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    static final class a extends p247y7.AbstractC7352v implements p237x7.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f3720D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p250z.l f3721E;

        /* JADX INFO: renamed from: H.O$a$a, reason: collision with other inner class name */
        static final class C0081a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f3722D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p250z.l f3723E;

            /* JADX INFO: renamed from: H.O$a$a$a, reason: collision with other inner class name */
            public static final class C0082a implements V.M {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ V.InterfaceC1753w0 f3724a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ p250z.l f3725b;

                public C0082a(V.InterfaceC1753w0 interfaceC1753w0, p250z.l lVar) {
                    this.f3724a = interfaceC1753w0;
                    this.f3725b = lVar;
                }

                @Override // V.M
                public void e() {
                    z.n.b bVar = (z.n.b) this.f3724a.getValue();
                    if (bVar != null) {
                        z.n.a aVar = new z.n.a(bVar);
                        p250z.l lVar = this.f3725b;
                        if (lVar != null) {
                            lVar.a(aVar);
                        }
                        this.f3724a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0081a(V.InterfaceC1753w0 interfaceC1753w0, p250z.l lVar) {
                super(1);
                this.f3722D = interfaceC1753w0;
                this.f3723E = lVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final V.M l(V.N n6) {
                return new H.O.a.C0081a.C0082a(this.f3722D, this.f3723E);
            }
        }

        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f3726G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f3727H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ W8.N f3728I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ V.InterfaceC1753w0 f3729J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p250z.l f3730K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ V.G1 f3731L;

            /* JADX INFO: renamed from: H.O$a$b$a, reason: collision with other inner class name */
            static final class C0083a extends p147o7.l implements p237x7.q {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f3732G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                private /* synthetic */ java.lang.Object f3733H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                /* synthetic */ long f3734I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                final /* synthetic */ W8.N f3735J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                final /* synthetic */ V.InterfaceC1753w0 f3736K;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                final /* synthetic */ p250z.l f3737L;

                /* JADX INFO: renamed from: H.O$a$b$a$a, reason: collision with other inner class name */
                static final class C0084a extends p147o7.l implements p237x7.p {

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    java.lang.Object f3738G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    int f3739H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    final /* synthetic */ V.InterfaceC1753w0 f3740I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    final /* synthetic */ long f3741J;

                    /* JADX INFO: renamed from: K, reason: collision with root package name */
                    final /* synthetic */ p250z.l f3742K;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0084a(V.InterfaceC1753w0 interfaceC1753w0, long j6, p250z.l lVar, p127m7.e eVar) {
                        super(2, eVar);
                        this.f3740I = interfaceC1753w0;
                        this.f3741J = j6;
                        this.f3742K = lVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        V.InterfaceC1753w0 interfaceC1753w0;
                        V.InterfaceC1753w0 interfaceC1753w1;
                        z.n.b bVar;
                        p250z.l lVar;
                        z.n.b bVar2;
                        java.lang.Object objG = p137n7.b.g();
                        int i6 = this.f3739H;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                interfaceC1753w1 = (V.InterfaceC1753w0) this.f3738G;
                                p087i7.x.b(obj);
                            } else {
                                if (i6 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar2 = (z.n.b) this.f3738G;
                                p087i7.x.b(obj);
                            }
                            bVar = bVar2;
                            this.f3740I.setValue(bVar);
                            return p087i7.M.f46721a;
                        }
                        p087i7.x.b(obj);
                        z.n.b bVar3 = (z.n.b) this.f3740I.getValue();
                        if (bVar3 != null) {
                            p250z.l lVar2 = this.f3742K;
                            interfaceC1753w0 = this.f3740I;
                            z.n.a aVar = new z.n.a(bVar3);
                            if (lVar2 != null) {
                                this.f3738G = interfaceC1753w0;
                                this.f3739H = 1;
                                if (lVar2.c(aVar, this) == objG) {
                                    return objG;
                                }
                                interfaceC1753w1 = interfaceC1753w0;
                            }
                            interfaceC1753w0.setValue(null);
                            bVar = new z.n.b(this.f3741J, null);
                            lVar = this.f3742K;
                            if (lVar != null) {
                                this.f3738G = bVar;
                                this.f3739H = 2;
                                if (lVar.c(bVar, this) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                        } else {
                            bVar = new z.n.b(this.f3741J, null);
                            lVar = this.f3742K;
                            if (lVar != null) {
                                this.f3738G = bVar;
                                this.f3739H = 2;
                                if (lVar.c(bVar, this) == objG) {
                                    return objG;
                                }
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                        }
                        this.f3740I.setValue(bVar);
                        return p087i7.M.f46721a;
                        interfaceC1753w0 = interfaceC1753w1;
                        interfaceC1753w0.setValue(null);
                        bVar = new z.n.b(this.f3741J, null);
                        lVar = this.f3742K;
                        if (lVar != null) {
                            this.f3738G = bVar;
                            this.f3739H = 2;
                            if (lVar.c(bVar, this) == objG) {
                                return objG;
                            }
                            bVar2 = bVar;
                            bVar = bVar2;
                        }
                        this.f3740I.setValue(bVar);
                        return p087i7.M.f46721a;
                    }

                    @Override // p237x7.p
                    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                        return ((H.O.a.b.C0083a.C0084a) x(n6, eVar)).B(p087i7.M.f46721a);
                    }

                    @Override // p147o7.a
                    public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                        return new H.O.a.b.C0083a.C0084a(this.f3740I, this.f3741J, this.f3742K, eVar);
                    }
                }

                /* JADX INFO: renamed from: H.O$a$b$a$b, reason: collision with other inner class name */
                static final class C0085b extends p147o7.l implements p237x7.p {

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    java.lang.Object f3743G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    int f3744H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    final /* synthetic */ V.InterfaceC1753w0 f3745I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    final /* synthetic */ boolean f3746J;

                    /* JADX INFO: renamed from: K, reason: collision with root package name */
                    final /* synthetic */ p250z.l f3747K;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0085b(V.InterfaceC1753w0 interfaceC1753w0, boolean z6, p250z.l lVar, p127m7.e eVar) {
                        super(2, eVar);
                        this.f3745I = interfaceC1753w0;
                        this.f3746J = z6;
                        this.f3747K = lVar;
                    }

                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        V.InterfaceC1753w0 interfaceC1753w0;
                        V.InterfaceC1753w0 interfaceC1753w1;
                        java.lang.Object objG = p137n7.b.g();
                        int i6 = this.f3744H;
                        if (i6 == 0) {
                            p087i7.x.b(obj);
                            z.n.b bVar = (z.n.b) this.f3745I.getValue();
                            if (bVar != null) {
                                boolean z6 = this.f3746J;
                                p250z.l lVar = this.f3747K;
                                interfaceC1753w0 = this.f3745I;
                                p250z.i cVar = z6 ? new z.n.c(bVar) : new z.n.a(bVar);
                                if (lVar != null) {
                                    this.f3743G = interfaceC1753w0;
                                    this.f3744H = 1;
                                    if (lVar.c(cVar, this) == objG) {
                                        return objG;
                                    }
                                    interfaceC1753w1 = interfaceC1753w0;
                                }
                                interfaceC1753w0.setValue(null);
                            }
                            return p087i7.M.f46721a;
                        }
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC1753w1 = (V.InterfaceC1753w0) this.f3743G;
                        p087i7.x.b(obj);
                        interfaceC1753w0 = interfaceC1753w1;
                        interfaceC1753w0.setValue(null);
                        return p087i7.M.f46721a;
                    }

                    @Override // p237x7.p
                    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                        return ((H.O.a.b.C0083a.C0085b) x(n6, eVar)).B(p087i7.M.f46721a);
                    }

                    @Override // p147o7.a
                    public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                        return new H.O.a.b.C0083a.C0085b(this.f3745I, this.f3746J, this.f3747K, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0083a(W8.N n6, V.InterfaceC1753w0 interfaceC1753w0, p250z.l lVar, p127m7.e eVar) {
                    super(3, eVar);
                    this.f3735J = n6;
                    this.f3736K = interfaceC1753w0;
                    this.f3737L = lVar;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f3732G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        p230x.t tVar = (p230x.t) this.f3733H;
                        W8.AbstractC1788i.d(this.f3735J, null, null, new H.O.a.b.C0083a.C0084a(this.f3736K, this.f3734I, this.f3737L, null), 3, null);
                        this.f3732G = 1;
                        obj = tVar.j0(this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    W8.AbstractC1788i.d(this.f3735J, null, null, new H.O.a.b.C0083a.C0085b(this.f3736K, ((java.lang.Boolean) obj).booleanValue(), this.f3737L, null), 3, null);
                    return p087i7.M.f46721a;
                }

                public final java.lang.Object H(p230x.t tVar, long j6, p127m7.e eVar) {
                    H.O.a.b.C0083a c0083a = new H.O.a.b.C0083a(this.f3735J, this.f3736K, this.f3737L, eVar);
                    c0083a.f3733H = tVar;
                    c0083a.f3734I = j6;
                    return c0083a.B(p087i7.M.f46721a);
                }

                @Override // p237x7.q
                public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return H((p230x.t) obj, ((p131n0.g) obj2).v(), (p127m7.e) obj3);
                }
            }

            /* JADX INFO: renamed from: H.O$a$b$b, reason: collision with other inner class name */
            static final class C0086b extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ V.G1 f3748D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0086b(V.G1 g6) {
                    super(1);
                    this.f3748D = g6;
                }

                public final void a(long j6) {
                    ((p237x7.l) this.f3748D.getValue()).l(p131n0.g.d(j6));
                }

                @Override // p237x7.l
                public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                    a(((p131n0.g) obj).v());
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(W8.N n6, V.InterfaceC1753w0 interfaceC1753w0, p250z.l lVar, V.G1 g6, p127m7.e eVar) {
                super(2, eVar);
                this.f3728I = n6;
                this.f3729J = interfaceC1753w0;
                this.f3730K = lVar;
                this.f3731L = g6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f3726G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p251z0.K k6 = (p251z0.K) this.f3727H;
                    H.O.a.b.C0083a c0083a = new H.O.a.b.C0083a(this.f3728I, this.f3729J, this.f3730K, null);
                    H.O.a.b.C0086b c0086b = new H.O.a.b.C0086b(this.f3731L);
                    this.f3726G = 1;
                    if (p230x.D.h(k6, c0083a, c0086b, this) == objG) {
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
            public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
                return ((H.O.a.b) x(k6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                H.O.a.b bVar = new H.O.a.b(this.f3728I, this.f3729J, this.f3730K, this.f3731L, eVar);
                bVar.f3727H = obj;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar, p250z.l lVar2) {
            super(3);
            this.f3720D = lVar;
            this.f3721E = lVar2;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(-102778667);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-102778667, i6, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            java.lang.Object objG = interfaceC1734n.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                java.lang.Object c6 = new V.C(V.Q.h(p127m7.j.f51198C, interfaceC1734n));
                interfaceC1734n.K(c6);
                objG = c6;
            }
            W8.N nA = ((V.C) objG).a();
            java.lang.Object objG2 = interfaceC1734n.g();
            if (objG2 == aVar.a()) {
                objG2 = V.A1.d(null, null, 2, null);
                interfaceC1734n.K(objG2);
            }
            V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG2;
            V.G1 g1N = V.v1.n(this.f3720D, interfaceC1734n, 0);
            p250z.l lVar = this.f3721E;
            boolean zS = interfaceC1734n.S(this.f3721E);
            p250z.l lVar2 = this.f3721E;
            java.lang.Object objG3 = interfaceC1734n.g();
            if (zS || objG3 == aVar.a()) {
                objG3 = new H.O.a.C0081a(interfaceC1753w0, lVar2);
                interfaceC1734n.K(objG3);
            }
            V.Q.b(lVar, (p237x7.l) objG3, interfaceC1734n, 0);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.f19586a;
            p250z.l lVar3 = this.f3721E;
            boolean zL = interfaceC1734n.l(nA) | interfaceC1734n.S(this.f3721E) | interfaceC1734n.S(g1N);
            p250z.l lVar4 = this.f3721E;
            java.lang.Object objG4 = interfaceC1734n.g();
            if (zL || objG4 == aVar.a()) {
                java.lang.Object bVar = new H.O.a.b(nA, interfaceC1753w0, lVar4, g1N, null);
                interfaceC1734n.K(bVar);
                objG4 = bVar;
            }
            androidx.compose.ui.d dVarD = p251z0.U.d(aVar2, lVar3, (p237x7.p) objG4);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return dVarD;
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return a((androidx.compose.ui.d) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p250z.l lVar, boolean z6, p237x7.l lVar2) {
        return z6 ? androidx.compose.ui.c.c(dVar, null, new H.O.a(lVar2, lVar), 1, null) : dVar;
    }
}
