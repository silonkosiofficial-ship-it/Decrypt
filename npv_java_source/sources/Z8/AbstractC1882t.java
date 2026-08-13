package Z8;

/* JADX INFO: renamed from: Z8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1882t {

    /* JADX INFO: renamed from: Z8.t$a */
    public static final class a implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16918C;

        public a(p247y7.O o6) {
            this.f16918C = o6;
        }

        @Override // Z8.InterfaceC1870g
        public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            this.f16918C.f57254C = obj;
            throw new p009a9.C1884a(this);
        }
    }

    /* JADX INFO: renamed from: Z8.t$b */
    public static final class b implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16919C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16920D;

        /* JADX INFO: renamed from: Z8.t$b$a */
        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f16921F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16922G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16923H;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16925J;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16922G = obj;
                this.f16923H |= Integer.MIN_VALUE;
                return Z8.AbstractC1882t.b.this.a(null, this);
            }
        }

        public b(p237x7.p pVar, p247y7.O o6) {
            this.f16919C = pVar;
            this.f16920D = o6;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.AbstractC1882t.b.a aVar;
            Z8.AbstractC1882t.b bVar;
            if (eVar instanceof Z8.AbstractC1882t.b.a) {
                aVar = (Z8.AbstractC1882t.b.a) eVar;
                int i6 = aVar.f16923H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16923H = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.AbstractC1882t.b.a(eVar);
                }
            } else {
                aVar = new Z8.AbstractC1882t.b.a(eVar);
            }
            java.lang.Object objU = aVar.f16922G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16923H;
            if (i10 == 0) {
                p087i7.x.b(objU);
                p237x7.p pVar = this.f16919C;
                aVar.f16921F = this;
                aVar.f16925J = obj;
                aVar.f16923H = 1;
                p247y7.r.a(6);
                objU = pVar.u(obj, aVar);
                p247y7.r.a(7);
                if (objU == objG) {
                    return objG;
                }
                bVar = this;
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f16925J;
                bVar = (Z8.AbstractC1882t.b) aVar.f16921F;
                p087i7.x.b(objU);
            }
            if (!((java.lang.Boolean) objU).booleanValue()) {
                return p087i7.M.f46721a;
            }
            bVar.f16920D.f57254C = obj;
            throw new p009a9.C1884a(bVar);
        }
    }

    /* JADX INFO: renamed from: Z8.t$c */
    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16926F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16927G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16928H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f16929I;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16928H = obj;
            this.f16929I |= Integer.MIN_VALUE;
            return Z8.AbstractC1871h.u(null, this);
        }
    }

    /* JADX INFO: renamed from: Z8.t$d */
    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16930F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16931G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f16932H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16933I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f16934J;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16933I = obj;
            this.f16934J |= Integer.MIN_VALUE;
            return Z8.AbstractC1871h.v(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Z8.t$e */
    public static final class e implements Z8.InterfaceC1870g {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ p237x7.p f16935C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.O f16936D;

        /* JADX INFO: renamed from: Z8.t$e$a */
        public static final class a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f16937F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            /* synthetic */ java.lang.Object f16938G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f16939H;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            java.lang.Object f16941J;

            public a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f16938G = obj;
                this.f16939H |= Integer.MIN_VALUE;
                return Z8.AbstractC1882t.e.this.a(null, this);
            }
        }

        public e(p237x7.p pVar, p247y7.O o6) {
            this.f16935C = pVar;
            this.f16936D = o6;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // Z8.InterfaceC1870g
        public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
            Z8.AbstractC1882t.e.a aVar;
            Z8.AbstractC1882t.e eVar2;
            if (eVar instanceof Z8.AbstractC1882t.e.a) {
                aVar = (Z8.AbstractC1882t.e.a) eVar;
                int i6 = aVar.f16939H;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.f16939H = i6 - Integer.MIN_VALUE;
                } else {
                    aVar = new Z8.AbstractC1882t.e.a(eVar);
                }
            } else {
                aVar = new Z8.AbstractC1882t.e.a(eVar);
            }
            java.lang.Object objU = aVar.f16938G;
            java.lang.Object objG = p137n7.b.g();
            int i10 = aVar.f16939H;
            if (i10 == 0) {
                p087i7.x.b(objU);
                p237x7.p pVar = this.f16935C;
                aVar.f16937F = this;
                aVar.f16941J = obj;
                aVar.f16939H = 1;
                p247y7.r.a(6);
                objU = pVar.u(obj, aVar);
                p247y7.r.a(7);
                if (objU == objG) {
                    return objG;
                }
                eVar2 = this;
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f16941J;
                eVar2 = (Z8.AbstractC1882t.e) aVar.f16937F;
                p087i7.x.b(objU);
            }
            if (!((java.lang.Boolean) objU).booleanValue()) {
                return p087i7.M.f46721a;
            }
            eVar2.f16936D.f57254C = obj;
            throw new p009a9.C1884a(eVar2);
        }
    }

    /* JADX INFO: renamed from: Z8.t$f */
    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16942F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16943G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16944H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f16945I;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16944H = obj;
            this.f16945I |= Integer.MIN_VALUE;
            return Z8.AbstractC1871h.w(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(Z8.InterfaceC1869f interfaceC1869f, p127m7.e eVar) {
        Z8.AbstractC1882t.c cVar;
        p247y7.O o6;
        p009a9.C1884a e6;
        Z8.InterfaceC1870g interfaceC1870g;
        if (eVar instanceof Z8.AbstractC1882t.c) {
            cVar = (Z8.AbstractC1882t.c) eVar;
            int i6 = cVar.f16929I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f16929I = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new Z8.AbstractC1882t.c(eVar);
            }
        } else {
            cVar = new Z8.AbstractC1882t.c(eVar);
        }
        java.lang.Object obj = cVar.f16928H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f16929I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.O o10 = new p247y7.O();
            o10.f57254C = p009a9.t.f17223a;
            Z8.InterfaceC1870g aVar = new Z8.AbstractC1882t.a(o10);
            try {
                cVar.f16926F = o10;
                cVar.f16927G = aVar;
                cVar.f16929I = 1;
                if (interfaceC1869f.b(aVar, cVar) == objG) {
                    return objG;
                }
                o6 = o10;
            } catch (p009a9.C1884a e10) {
                o6 = o10;
                e6 = e10;
                interfaceC1870g = aVar;
                p009a9.p.a(e6, interfaceC1870g);
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1870g = (Z8.AbstractC1882t.a) cVar.f16927G;
            o6 = (p247y7.O) cVar.f16926F;
            try {
                p087i7.x.b(obj);
            } catch (p009a9.C1884a e11) {
                e6 = e11;
                p009a9.p.a(e6, interfaceC1870g);
            }
        }
        java.lang.Object obj2 = o6.f57254C;
        if (obj2 != p009a9.t.f17223a) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar, p127m7.e eVar) {
        Z8.AbstractC1882t.d dVar;
        p237x7.p pVar2;
        p247y7.O o6;
        p009a9.C1884a e6;
        Z8.InterfaceC1870g interfaceC1870g;
        if (eVar instanceof Z8.AbstractC1882t.d) {
            dVar = (Z8.AbstractC1882t.d) eVar;
            int i6 = dVar.f16934J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f16934J = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new Z8.AbstractC1882t.d(eVar);
            }
        } else {
            dVar = new Z8.AbstractC1882t.d(eVar);
        }
        java.lang.Object obj = dVar.f16933I;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar.f16934J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.O o10 = new p247y7.O();
            o10.f57254C = p009a9.t.f17223a;
            Z8.InterfaceC1870g bVar = new Z8.AbstractC1882t.b(pVar, o10);
            try {
                dVar.f16930F = pVar;
                dVar.f16931G = o10;
                dVar.f16932H = bVar;
                dVar.f16934J = 1;
                if (interfaceC1869f.b(bVar, dVar) == objG) {
                    return objG;
                }
                pVar2 = pVar;
                o6 = o10;
            } catch (p009a9.C1884a e10) {
                pVar2 = pVar;
                o6 = o10;
                e6 = e10;
                interfaceC1870g = bVar;
                p009a9.p.a(e6, interfaceC1870g);
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1870g = (Z8.AbstractC1882t.b) dVar.f16932H;
            o6 = (p247y7.O) dVar.f16931G;
            pVar2 = (p237x7.p) dVar.f16930F;
            try {
                p087i7.x.b(obj);
            } catch (p009a9.C1884a e11) {
                e6 = e11;
                p009a9.p.a(e6, interfaceC1870g);
            }
        }
        java.lang.Object obj2 = o6.f57254C;
        if (obj2 != p009a9.t.f17223a) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(Z8.InterfaceC1869f interfaceC1869f, p237x7.p pVar, p127m7.e eVar) {
        Z8.AbstractC1882t.f fVar;
        p247y7.O o6;
        p009a9.C1884a e6;
        Z8.InterfaceC1870g interfaceC1870g;
        if (eVar instanceof Z8.AbstractC1882t.f) {
            fVar = (Z8.AbstractC1882t.f) eVar;
            int i6 = fVar.f16945I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.f16945I = i6 - Integer.MIN_VALUE;
            } else {
                fVar = new Z8.AbstractC1882t.f(eVar);
            }
        } else {
            fVar = new Z8.AbstractC1882t.f(eVar);
        }
        java.lang.Object obj = fVar.f16944H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = fVar.f16945I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p247y7.O o10 = new p247y7.O();
            Z8.InterfaceC1870g eVar2 = new Z8.AbstractC1882t.e(pVar, o10);
            try {
                fVar.f16942F = o10;
                fVar.f16943G = eVar2;
                fVar.f16945I = 1;
                if (interfaceC1869f.b(eVar2, fVar) == objG) {
                    return objG;
                }
                o6 = o10;
            } catch (p009a9.C1884a e10) {
                o6 = o10;
                e6 = e10;
                interfaceC1870g = eVar2;
                p009a9.p.a(e6, interfaceC1870g);
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1870g = (Z8.AbstractC1882t.e) fVar.f16943G;
            o6 = (p247y7.O) fVar.f16942F;
            try {
                p087i7.x.b(obj);
            } catch (p009a9.C1884a e11) {
                e6 = e11;
                p009a9.p.a(e6, interfaceC1870g);
            }
        }
        return o6.f57254C;
    }
}
