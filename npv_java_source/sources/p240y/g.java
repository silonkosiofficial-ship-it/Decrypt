package p240y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p230x.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p240y.i f57079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.B f57080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p200u.InterfaceC7175j f57081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p071h0.k f57082d = androidx.compose.foundation.gestures.d.e();

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f57083F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57084G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f57086I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57084G = obj;
            this.f57086I |= Integer.MIN_VALUE;
            return p240y.g.this.h(null, 0.0f, null, this);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f57087G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f57088H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ float f57090J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.l f57091K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p230x.w f57092L;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.L f57093D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.l f57094E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p247y7.L l6, p237x7.l lVar) {
                super(1);
                this.f57093D = l6;
                this.f57094E = lVar;
            }

            public final void a(float f6) {
                p247y7.L l6 = this.f57093D;
                float f10 = l6.f57251C - f6;
                l6.f57251C = f10;
                this.f57094E.l(java.lang.Float.valueOf(f10));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((java.lang.Number) obj).floatValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: y.g$b$b, reason: collision with other inner class name */
        static final class C0753b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p247y7.L f57095D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p237x7.l f57096E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0753b(p247y7.L l6, p237x7.l lVar) {
                super(1);
                this.f57095D = l6;
                this.f57096E = lVar;
            }

            public final void a(float f6) {
                p247y7.L l6 = this.f57095D;
                float f10 = l6.f57251C - f6;
                l6.f57251C = f10;
                this.f57096E.l(java.lang.Float.valueOf(f10));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((java.lang.Number) obj).floatValue());
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f6, p237x7.l lVar, p230x.w wVar, p127m7.e eVar) {
            super(2, eVar);
            this.f57090J = f6;
            this.f57091K = lVar;
            this.f57092L = wVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p247y7.L l6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f57088H;
            if (i6 != 0) {
                if (i6 == 1) {
                    l6 = (p247y7.L) this.f57087G;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
            }
            p087i7.x.b(obj);
            float fA = p240y.g.this.f57079a.a(this.f57090J, p200u.D.a(p240y.g.this.f57080b, 0.0f, this.f57090J));
            if (!(!java.lang.Float.isNaN(fA))) {
                throw new java.lang.IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.".toString());
            }
            l6 = new p247y7.L();
            float fAbs = java.lang.Math.abs(fA) * java.lang.Math.signum(this.f57090J);
            l6.f57251C = fAbs;
            this.f57091K.l(p147o7.b.b(fAbs));
            p240y.g gVar = p240y.g.this;
            p230x.w wVar = this.f57092L;
            float f6 = l6.f57251C;
            float f10 = this.f57090J;
            y.g.b.C0753b c0753b = new y.g.b.C0753b(l6, this.f57091K);
            this.f57087G = l6;
            this.f57088H = 1;
            obj = gVar.k(wVar, f6, f10, c0753b, this);
            if (obj == objG) {
                return objG;
            }
            p200u.C7179l c7179l = (p200u.C7179l) obj;
            float fB = p240y.g.this.f57079a.b(((java.lang.Number) c7179l.o()).floatValue());
            if (!(true ^ java.lang.Float.isNaN(fB))) {
                throw new java.lang.IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.".toString());
            }
            l6.f57251C = fB;
            p230x.w wVar2 = this.f57092L;
            p200u.C7179l c7179lG = p200u.AbstractC7181m.g(c7179l, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            p200u.InterfaceC7175j interfaceC7175j = p240y.g.this.f57081c;
            y.g.b.a aVar = new y.g.b.a(l6, this.f57091K);
            this.f57087G = null;
            this.f57088H = 2;
            obj = p240y.h.h(wVar2, fB, fB, c7179lG, interfaceC7175j, aVar, this);
            return obj == objG ? objG : obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((y.g.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p240y.g.this.new b(this.f57090J, this.f57091K, this.f57092L, eVar);
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57097F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f57099H;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57097F = obj;
            this.f57099H |= Integer.MIN_VALUE;
            return p240y.g.this.a(null, 0.0f, null, this);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f57100F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f57102H;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f57100F = obj;
            this.f57102H |= Integer.MIN_VALUE;
            return p240y.g.this.k(null, 0.0f, 0.0f, null, this);
        }
    }

    public g(p240y.i iVar, p200u.B b6, p200u.InterfaceC7175j interfaceC7175j) {
        this.f57079a = iVar;
        this.f57080b = b6;
        this.f57081c = interfaceC7175j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p230x.w wVar, float f6, p237x7.l lVar, p127m7.e eVar) {
        y.g.a aVar;
        if (eVar instanceof y.g.a) {
            aVar = (y.g.a) eVar;
            int i6 = aVar.f57086I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f57086I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new y.g.a(eVar);
            }
        } else {
            aVar = new y.g.a(eVar);
        }
        java.lang.Object objG = aVar.f57084G;
        java.lang.Object objG2 = p137n7.b.g();
        int i10 = aVar.f57086I;
        if (i10 == 0) {
            p087i7.x.b(objG);
            p071h0.k kVar = this.f57082d;
            y.g.b bVar = new y.g.b(f6, lVar, wVar, null);
            aVar.f57083F = lVar;
            aVar.f57086I = 1;
            objG = W8.AbstractC1784g.g(kVar, bVar, aVar);
            if (objG == objG2) {
                return objG2;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (p237x7.l) aVar.f57083F;
            p087i7.x.b(objG);
        }
        p240y.a aVar2 = (p240y.a) objG;
        lVar.l(p147o7.b.b(0.0f));
        return aVar2;
    }

    private final boolean i(float f6, float f10) {
        return java.lang.Math.abs(p200u.D.a(this.f57080b, 0.0f, f10)) >= java.lang.Math.abs(f6);
    }

    private final java.lang.Object j(p230x.w wVar, float f6, float f10, p237x7.l lVar, p127m7.e eVar) {
        return p240y.h.i(wVar, f6, f10, i(f6, f10) ? new p240y.c(this.f57080b) : new p240y.l(this.f57081c), lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final java.lang.Object k(p230x.w wVar, float f6, float f10, p237x7.l lVar, p127m7.e eVar) {
        y.g.d dVar;
        if (eVar instanceof y.g.d) {
            dVar = (y.g.d) eVar;
            int i6 = dVar.f57102H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f57102H = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new y.g.d(eVar);
            }
        } else {
            dVar = new y.g.d(eVar);
        }
        y.g.d dVar2 = dVar;
        java.lang.Object objJ = dVar2.f57100F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar2.f57102H;
        if (i10 == 0) {
            p087i7.x.b(objJ);
            if (java.lang.Math.abs(f6) == 0.0f || java.lang.Math.abs(f10) == 0.0f) {
                return p200u.AbstractC7181m.c(f6, f10, 0L, 0L, false, 28, null);
            }
            dVar2.f57102H = 1;
            objJ = j(wVar, f6, f10, lVar, dVar2);
            if (objJ == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(objJ);
        }
        return ((p240y.a) objJ).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p230x.F
    public java.lang.Object a(p230x.w wVar, float f6, p237x7.l lVar, p127m7.e eVar) {
        y.g.c cVar;
        if (eVar instanceof y.g.c) {
            cVar = (y.g.c) eVar;
            int i6 = cVar.f57099H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f57099H = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new y.g.c(eVar);
            }
        } else {
            cVar = new y.g.c(eVar);
        }
        java.lang.Object objH = cVar.f57097F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f57099H;
        if (i10 == 0) {
            p087i7.x.b(objH);
            cVar.f57099H = 1;
            objH = h(wVar, f6, lVar, cVar);
            if (objH == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(objH);
        }
        p240y.a aVar = (p240y.a) objH;
        return p147o7.b.b(((java.lang.Number) aVar.a()).floatValue() != 0.0f ? ((java.lang.Number) aVar.b().o()).floatValue() : 0.0f);
    }

    @Override // p230x.p
    public /* synthetic */ java.lang.Object b(p230x.w wVar, float f6, p127m7.e eVar) {
        return p230x.E.a(this, wVar, f6, eVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p240y.g)) {
            return false;
        }
        p240y.g gVar = (p240y.g) obj;
        return p247y7.AbstractC7350t.b(gVar.f57081c, this.f57081c) && p247y7.AbstractC7350t.b(gVar.f57080b, this.f57080b) && p247y7.AbstractC7350t.b(gVar.f57079a, this.f57079a);
    }

    public int hashCode() {
        return (((this.f57081c.hashCode() * 31) + this.f57080b.hashCode()) * 31) + this.f57079a.hashCode();
    }
}
