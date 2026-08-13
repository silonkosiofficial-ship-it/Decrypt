package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
final class g implements p210v.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.foundation.g f18976a = new androidx.compose.foundation.g();

    private static final class a extends androidx.compose.ui.d.c implements F0.InterfaceC0932s {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private final p250z.j f18977P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private boolean f18978Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private boolean f18979R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f18980S;

        /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a, reason: collision with other inner class name */
        static final class C0358a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f18981G;

            /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a$a, reason: collision with other inner class name */
            static final class C0359a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ p247y7.M f18983C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ p247y7.M f18984D;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                final /* synthetic */ p247y7.M f18985E;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.g.a f18986F;

                C0359a(p247y7.M m6, p247y7.M m10, p247y7.M m11, androidx.compose.foundation.g.a aVar) {
                    this.f18983C = m6;
                    this.f18984D = m10;
                    this.f18985E = m11;
                    this.f18986F = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x0040  */
                /* JADX WARN: Code duplicated, block: B:29:0x0042  */
                /* JADX WARN: Code duplicated, block: B:32:0x0049  */
                /* JADX WARN: Code duplicated, block: B:33:0x004b  */
                /* JADX WARN: Code duplicated, block: B:36:0x0052  */
                /* JADX WARN: Code duplicated, block: B:37:0x0054  */
                /* JADX WARN: Code duplicated, block: B:40:0x005d  */
                /* JADX WARN: Code duplicated, block: B:43:0x006b  */
                /* JADX WARN: Code duplicated, block: B:46:0x0079  */
                /* JADX WARN: Code duplicated, block: B:47:0x007f  */
                /* JADX WARN: Code duplicated, block: B:49:0x0082  */
                @Override // Z8.InterfaceC1870g
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object a(p250z.i iVar, p127m7.e eVar) {
                    p247y7.M m6;
                    int i6;
                    boolean z6;
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    boolean z13 = true;
                    if (!(iVar instanceof z.n.b)) {
                        if ((iVar instanceof z.n.c) || (iVar instanceof z.n.a)) {
                            m6 = this.f18983C;
                        } else if (iVar instanceof p250z.g) {
                            m6 = this.f18984D;
                        } else {
                            if (!(iVar instanceof p250z.h)) {
                                if (iVar instanceof p250z.d) {
                                    m6 = this.f18985E;
                                } else if (iVar instanceof p250z.e) {
                                    m6 = this.f18985E;
                                }
                                z6 = false;
                                if (this.f18983C.f57252C > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (this.f18984D.f57252C > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (this.f18985E.f57252C > 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (this.f18986F.f18978Q != z10) {
                                    this.f18986F.f18978Q = z10;
                                    z6 = true;
                                }
                                if (this.f18986F.f18979R != z11) {
                                    this.f18986F.f18979R = z11;
                                    z6 = true;
                                }
                                if (this.f18986F.f18980S != z12) {
                                    this.f18986F.f18980S = z12;
                                } else {
                                    z13 = z6;
                                }
                                if (z13) {
                                    F0.AbstractC0933t.a(this.f18986F);
                                }
                                return p087i7.M.f46721a;
                            }
                            m6 = this.f18984D;
                        }
                        i6 = m6.f57252C - 1;
                        m6.f57252C = i6;
                        z6 = false;
                        if (this.f18983C.f57252C > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.f18984D.f57252C > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (this.f18985E.f57252C > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (this.f18986F.f18978Q != z10) {
                            this.f18986F.f18978Q = z10;
                            z6 = true;
                        }
                        if (this.f18986F.f18979R != z11) {
                            this.f18986F.f18979R = z11;
                            z6 = true;
                        }
                        if (this.f18986F.f18980S != z12) {
                            this.f18986F.f18980S = z12;
                        } else {
                            z13 = z6;
                        }
                        if (z13) {
                            F0.AbstractC0933t.a(this.f18986F);
                        }
                        return p087i7.M.f46721a;
                    }
                    m6 = this.f18983C;
                    i6 = m6.f57252C + 1;
                    m6.f57252C = i6;
                    z6 = false;
                    if (this.f18983C.f57252C > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f18984D.f57252C > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f18985E.f57252C > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f18986F.f18978Q != z10) {
                        this.f18986F.f18978Q = z10;
                        z6 = true;
                    }
                    if (this.f18986F.f18979R != z11) {
                        this.f18986F.f18979R = z11;
                        z6 = true;
                    }
                    if (this.f18986F.f18980S != z12) {
                        this.f18986F.f18980S = z12;
                    } else {
                        z13 = z6;
                    }
                    if (z13) {
                        F0.AbstractC0933t.a(this.f18986F);
                    }
                    return p087i7.M.f46721a;
                }
            }

            C0358a(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f18981G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p247y7.M m6 = new p247y7.M();
                    p247y7.M m10 = new p247y7.M();
                    p247y7.M m11 = new p247y7.M();
                    Z8.InterfaceC1869f interfaceC1869fB = androidx.compose.foundation.g.a.this.f18977P.b();
                    androidx.compose.foundation.g.a.C0358a.C0359a c0359a = new androidx.compose.foundation.g.a.C0358a.C0359a(m6, m10, m11, androidx.compose.foundation.g.a.this);
                    this.f18981G = 1;
                    if (interfaceC1869fB.b(c0359a, this) == objG) {
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
                return ((androidx.compose.foundation.g.a.C0358a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return androidx.compose.foundation.g.a.this.new C0358a(eVar);
            }
        }

        public a(p250z.j jVar) {
            this.f18977P = jVar;
        }

        @Override // androidx.compose.ui.d.c
        public void D1() {
            W8.AbstractC1788i.d(t1(), null, null, new androidx.compose.foundation.g.a.C0358a(null), 3, null);
        }

        @Override // F0.InterfaceC0932s
        public /* synthetic */ void m0() {
            F0.r.a(this);
        }

        @Override // F0.InterfaceC0932s
        public void y(p161q0.c cVar) {
            long jA;
            int i6;
            java.lang.Object obj;
            float f6;
            cVar.l1();
            if (this.f18978Q) {
                jA = p141o0.C7016y0.f52264b.a();
                i6 = 14;
                obj = null;
                f6 = 0.3f;
            } else {
                if (!this.f18979R && !this.f18980S) {
                    return;
                }
                jA = p141o0.C7016y0.f52264b.a();
                i6 = 14;
                obj = null;
                f6 = 0.1f;
            }
            p161q0.f.m(cVar, p141o0.C7016y0.m(jA, f6, 0.0f, 0.0f, 0.0f, i6, obj), 0L, cVar.i(), 0.0f, null, null, 0, 122, null);
        }
    }

    private g() {
    }

    @Override // p210v.I
    public F0.InterfaceC0924j a(p250z.j jVar) {
        return new androidx.compose.foundation.g.a(jVar);
    }

    @Override // p210v.G
    public /* synthetic */ p210v.H b(p250z.j jVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        return p210v.F.a(this, jVar, interfaceC1734n, i6);
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
