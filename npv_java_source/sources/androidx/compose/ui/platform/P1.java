package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class P1 implements V.r, androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f19953C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V.r f19954D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f19955E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.lifecycle.AbstractC2079k f19956F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p237x7.p f19957G = androidx.compose.ui.platform.C1960n0.f20150a.a();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.p f19959E;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.P1$a$a, reason: collision with other inner class name */
        static final class C0380a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.P1 f19960D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.p f19961E;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.P1$a$a$a, reason: collision with other inner class name */
            static final class C0381a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f19962G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.platform.P1 f19963H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0381a(androidx.compose.ui.platform.P1 p6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f19963H = p6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f19962G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        androidx.compose.ui.platform.r rVarG = this.f19963H.G();
                        this.f19962G = 1;
                        if (rVarG.b0(this) == objG) {
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
                    return ((androidx.compose.ui.platform.P1.a.C0380a.C0381a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new androidx.compose.ui.platform.P1.a.C0380a.C0381a(this.f19963H, eVar);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.P1$a$a$b */
            static final class b extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f19964G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.platform.P1 f19965H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(androidx.compose.ui.platform.P1 p6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f19965H = p6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f19964G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        androidx.compose.ui.platform.r rVarG = this.f19965H.G();
                        this.f19964G = 1;
                        if (rVarG.c0(this) == objG) {
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
                    return ((androidx.compose.ui.platform.P1.a.C0380a.b) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new androidx.compose.ui.platform.P1.a.C0380a.b(this.f19965H, eVar);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.P1$a$a$c */
            static final class c extends p247y7.AbstractC7352v implements p237x7.p {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.platform.P1 f19966D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p237x7.p f19967E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(androidx.compose.ui.platform.P1 p6, p237x7.p pVar) {
                    super(2);
                    this.f19966D = p6;
                    this.f19967E = pVar;
                }

                public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                    if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                        interfaceC1734n.A();
                        return;
                    }
                    if (V.AbstractC1741q.H()) {
                        V.AbstractC1741q.Q(-1193460702, i6, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    androidx.compose.ui.platform.T.a(this.f19966D.G(), this.f19967E, interfaceC1734n, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0380a(androidx.compose.ui.platform.P1 p6, p237x7.p pVar) {
                super(2);
                this.f19960D = p6;
                this.f19961E = pVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(-2000640158, i6, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                }
                java.lang.Object tag = this.f19960D.G().getTag(p071h0.l.f45815K);
                java.util.Set set = p247y7.W.o(tag) ? (java.util.Set) tag : null;
                if (set == null) {
                    java.lang.Object parent = this.f19960D.G().getParent();
                    android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                    java.lang.Object tag2 = view != null ? view.getTag(p071h0.l.f45815K) : null;
                    set = p247y7.W.o(tag2) ? (java.util.Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC1734n.k());
                    interfaceC1734n.a();
                }
                androidx.compose.ui.platform.r rVarG = this.f19960D.G();
                boolean zL = interfaceC1734n.l(this.f19960D);
                androidx.compose.ui.platform.P1 p6 = this.f19960D;
                java.lang.Object objG = interfaceC1734n.g();
                if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                    objG = new androidx.compose.ui.platform.P1.a.C0380a.C0381a(p6, null);
                    interfaceC1734n.K(objG);
                }
                V.Q.e(rVarG, (p237x7.p) objG, interfaceC1734n, 0);
                androidx.compose.ui.platform.r rVarG2 = this.f19960D.G();
                boolean zL2 = interfaceC1734n.l(this.f19960D);
                androidx.compose.ui.platform.P1 p10 = this.f19960D;
                java.lang.Object objG2 = interfaceC1734n.g();
                if (zL2 || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    objG2 = new androidx.compose.ui.platform.P1.a.C0380a.b(p10, null);
                    interfaceC1734n.K(objG2);
                }
                V.Q.e(rVarG2, (p237x7.p) objG2, interfaceC1734n, 0);
                V.AbstractC1756y.a(p061g0.d.a().d(set), p031d0.c.e(-1193460702, true, new androidx.compose.ui.platform.P1.a.C0380a.c(this.f19960D, this.f19961E), interfaceC1734n, 54), interfaceC1734n, V.P0.f14698i | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar) {
            super(1);
            this.f19959E = pVar;
        }

        public final void a(androidx.compose.ui.platform.r.b bVar) {
            if (androidx.compose.ui.platform.P1.this.f19955E) {
                return;
            }
            androidx.lifecycle.AbstractC2079k abstractC2079kU = bVar.a().u();
            androidx.compose.ui.platform.P1.this.f19957G = this.f19959E;
            if (androidx.compose.ui.platform.P1.this.f19956F == null) {
                androidx.compose.ui.platform.P1.this.f19956F = abstractC2079kU;
                abstractC2079kU.a(androidx.compose.ui.platform.P1.this);
            } else if (abstractC2079kU.b().g(androidx.lifecycle.AbstractC2079k.b.CREATED)) {
                androidx.compose.ui.platform.P1.this.F().h(p031d0.c.c(-2000640158, true, new androidx.compose.ui.platform.P1.a.C0380a(androidx.compose.ui.platform.P1.this, this.f19959E)));
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((androidx.compose.ui.platform.r.b) obj);
            return p087i7.M.f46721a;
        }
    }

    public P1(androidx.compose.ui.platform.r rVar, V.r rVar2) {
        this.f19953C = rVar;
        this.f19954D = rVar2;
    }

    public final V.r F() {
        return this.f19954D;
    }

    public final androidx.compose.ui.platform.r G() {
        return this.f19953C;
    }

    @Override // V.r
    public void e() {
        if (!this.f19955E) {
            this.f19955E = true;
            this.f19953C.getView().setTag(p071h0.l.f45816L, null);
            androidx.lifecycle.AbstractC2079k abstractC2079k = this.f19956F;
            if (abstractC2079k != null) {
                abstractC2079k.d(this);
            }
        }
        this.f19954D.e();
    }

    @Override // V.r
    public void h(p237x7.p pVar) {
        this.f19953C.setOnViewTreeOwnersAvailable(new androidx.compose.ui.platform.P1.a(pVar));
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_DESTROY) {
            e();
        } else {
            if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_CREATE || this.f19955E) {
                return;
            }
            h(this.f19957G);
        }
    }
}
