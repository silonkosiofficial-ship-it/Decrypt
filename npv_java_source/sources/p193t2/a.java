package p193t2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t2.a.b f54583i = new t2.a.b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h2.L.b.C0533b f54584j = new h2.L.b.C0533b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f54585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p193t2.b f54586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p237x7.q f54587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p143o2.n f54588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p143o2.u f54589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V8.c f54590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V8.a f54591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private W8.InterfaceC1822z0 f54592h;

    /* JADX INFO: renamed from: t2.a$a, reason: collision with other inner class name */
    static final class C0710a extends p247y7.AbstractC7352v implements p237x7.a {
        C0710a() {
            super(0);
        }

        public final void a() {
            W8.InterfaceC1822z0 interfaceC1822z0 = p193t2.a.this.f54592h;
            if (interfaceC1822z0 != null) {
                W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
            }
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54594G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54595H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ h2.L.a f54597J;

        /* JADX INFO: renamed from: t2.a$c$a, reason: collision with other inner class name */
        static final class C0711a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f54598G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p193t2.a f54599H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ h2.L.a f54600I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0711a(p193t2.a aVar, h2.L.a aVar2, p127m7.e eVar) {
                super(2, eVar);
                this.f54599H = aVar;
                this.f54600I = aVar2;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f54598G;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                }
                p087i7.x.b(obj);
                p143o2.u uVar = this.f54599H.f54589e;
                p143o2.n nVar = this.f54599H.f54588d;
                this.f54598G = 1;
                obj = p203u2.a.e(uVar, nVar, this);
                if (obj == objG) {
                    return objG;
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                this.f54599H.h().e(iIntValue);
                h2.L.a aVar = this.f54600I;
                p143o2.u uVar2 = this.f54599H.f54589e;
                p237x7.q qVar = this.f54599H.f54587c;
                this.f54598G = 2;
                obj = p203u2.a.d(aVar, uVar2, iIntValue, qVar, this);
                return obj == objG ? objG : obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p143o2.A a6, p127m7.e eVar) {
                return ((t2.a.c.C0711a) x(a6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new t2.a.c.C0711a(this.f54599H, this.f54600I, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h2.L.a aVar, p127m7.e eVar) {
            super(2, eVar);
            this.f54597J = aVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54594G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p143o2.B b6 = (p143o2.B) this.f54595H;
                o2.B.a aVar = o2.B.a.DEFERRED;
                t2.a.c.C0711a c0711a = new t2.a.c.C0711a(p193t2.a.this, this.f54597J, null);
                this.f54594G = 1;
                obj = b6.c(aVar, c0711a, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p143o2.B b6, p127m7.e eVar) {
            return ((t2.a.c) x(b6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            t2.a.c cVar = p193t2.a.this.new c(this.f54597J, eVar);
            cVar.f54595H = obj;
            return cVar;
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54601F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f54603H;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f54601F = obj;
            this.f54603H |= Integer.MIN_VALUE;
            return p193t2.a.this.j(null, this);
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54604G;

        /* JADX INFO: renamed from: t2.a$e$a, reason: collision with other inner class name */
        static final class C0712a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p193t2.a f54606C;

            C0712a(p193t2.a aVar) {
                this.f54606C = aVar;
            }

            @Override // Z8.InterfaceC1870g
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object a(java.util.Set set, p127m7.e eVar) {
                if (this.f54606C.f54586b.a()) {
                    throw new java.util.concurrent.CancellationException("PagingSource is invalid");
                }
                this.f54606C.f54586b.e();
                return p087i7.M.f46721a;
            }
        }

        e(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54604G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                androidx.room.c cVarR = p193t2.a.this.f54588d.r();
                java.lang.String[] strArr = p193t2.a.this.f54585a;
                Z8.InterfaceC1869f interfaceC1869fG = cVarR.g((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), false);
                t2.a.e.C0712a c0712a = new t2.a.e.C0712a(p193t2.a.this);
                this.f54604G = 1;
                if (interfaceC1869fG.b(c0712a, this) == objG) {
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
            return ((t2.a.e) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p193t2.a.this.new e(eVar);
        }
    }

    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f54607F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f54608G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f54609H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f54611J;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f54609H = obj;
            this.f54611J |= Integer.MIN_VALUE;
            return p193t2.a.this.k(null, 0, this);
        }
    }

    static final class g extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f54612G;

        g(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f54612G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                androidx.room.c cVarR = p193t2.a.this.f54588d.r();
                java.lang.String[] strArr = p193t2.a.this.f54585a;
                java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
                this.f54612G = 1;
                obj = cVarR.p(strArr2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                p193t2.a.this.f54586b.e();
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((t2.a.g) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p193t2.a.this.new g(eVar);
        }
    }

    public a(java.lang.String[] strArr, p193t2.b bVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(strArr, "tables");
        p247y7.AbstractC7350t.f(bVar, "pagingSource");
        p247y7.AbstractC7350t.f(qVar, "convertRows");
        this.f54585a = strArr;
        this.f54586b = bVar;
        this.f54587c = qVar;
        this.f54588d = bVar.j();
        this.f54589e = bVar.l();
        this.f54590f = V8.b.c(-1);
        this.f54591g = V8.b.a(false);
        bVar.g(new p193t2.a.C0710a());
    }

    private final java.lang.Object i(h2.L.a aVar, p127m7.e eVar) {
        return p143o2.o.a(this.f54588d, new t2.a.c(aVar, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(h2.L.a aVar, int i6, p127m7.e eVar) {
        t2.a.f fVar;
        p193t2.a aVar2;
        h2.L.b bVar;
        if (eVar instanceof t2.a.f) {
            fVar = (t2.a.f) eVar;
            int i10 = fVar.f54611J;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f54611J = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new t2.a.f(eVar);
            }
        } else {
            fVar = new t2.a.f(eVar);
        }
        java.lang.Object objD = fVar.f54609H;
        java.lang.Object objG = p137n7.b.g();
        int i11 = fVar.f54611J;
        if (i11 != 0) {
            if (i11 == 1) {
                p193t2.a aVar3 = (p193t2.a) fVar.f54607F;
                p087i7.x.b(objD);
                aVar2 = aVar3;
            } else {
                if (i11 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (h2.L.b) fVar.f54608G;
                aVar2 = (p193t2.a) fVar.f54607F;
                p087i7.x.b(objD);
            }
            if (aVar2.f54586b.a()) {
                return bVar;
            }
            h2.L.b.C0533b c0533b = f54584j;
            p247y7.AbstractC7350t.d(c0533b, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>");
            return c0533b;
        }
        p087i7.x.b(objD);
        p143o2.u uVar = this.f54589e;
        p237x7.q qVar = this.f54587c;
        fVar.f54607F = this;
        fVar.f54611J = 1;
        objD = p203u2.a.d(aVar, uVar, i6, qVar, fVar);
        if (objD == objG) {
            return objG;
        }
        aVar2 = this;
        bVar = (h2.L.b) objD;
        p127m7.i coroutineContext = aVar2.f54588d.q().getCoroutineContext();
        t2.a.g gVar = aVar2.new g(null);
        fVar.f54607F = aVar2;
        fVar.f54608G = bVar;
        fVar.f54611J = 2;
        if (W8.AbstractC1784g.g(coroutineContext, gVar, fVar) == objG) {
            return objG;
        }
        if (aVar2.f54586b.a()) {
            return bVar;
        }
        h2.L.b.C0533b c0533b2 = f54584j;
        p247y7.AbstractC7350t.d(c0533b2, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>");
        return c0533b2;
    }

    public final V8.c h() {
        return this.f54590f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(h2.L.a aVar, p127m7.e eVar) {
        t2.a.d dVar;
        if (eVar instanceof t2.a.d) {
            dVar = (t2.a.d) eVar;
            int i6 = dVar.f54603H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f54603H = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new t2.a.d(eVar);
            }
        } else {
            dVar = new t2.a.d(eVar);
        }
        java.lang.Object objK = dVar.f54601F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar.f54603H;
        try {
            if (i10 == 0) {
                p087i7.x.b(objK);
                if (this.f54591g.a(false, true)) {
                    this.f54592h = W8.AbstractC1788i.d(this.f54588d.q(), null, null, new t2.a.e(null), 3, null);
                }
                int iC = this.f54590f.c();
                if (iC == -1) {
                    dVar.f54603H = 1;
                    objK = i(aVar, dVar);
                    if (objK == objG) {
                        return objG;
                    }
                } else {
                    dVar.f54603H = 2;
                    objK = k(aVar, iC, dVar);
                    if (objK == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(objK);
            }
            return (h2.L.b) objK;
        } catch (java.lang.Exception e6) {
            return new h2.L.b.a(e6);
        }
    }
}
