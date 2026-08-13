package aa;

/* JADX INFO: renamed from: aa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1887a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p059f9.a f17246a = p059f9.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f17247b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: aa.a$a, reason: collision with other inner class name */
    static final class C0333a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f17248G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f17249H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f17250I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f17251J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f17252K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f17253L;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f17255N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p237x7.l f17256O;

        /* JADX INFO: renamed from: aa.a$a$a, reason: collision with other inner class name */
        static final class C0334a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f17257G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p237x7.l f17258H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0334a(p237x7.l lVar, p127m7.e eVar) {
                super(2, eVar);
                this.f17258H = lVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f17257G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p237x7.l lVar = this.f17258H;
                    this.f17257G = 1;
                    obj = lVar.l(this);
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((aa.C1887a.C0333a.C0334a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new aa.C1887a.C0333a.C0334a(this.f17258H, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0333a(java.lang.Object obj, p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f17255N = obj;
            this.f17256O = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            W8.N n6;
            p059f9.a aVar;
            aa.C1887a c1887a;
            p237x7.l lVar;
            java.lang.Object obj2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17252K;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        lVar = (p237x7.l) this.f17251J;
                        obj2 = this.f17250I;
                        c1887a = (aa.C1887a) this.f17249H;
                        aVar = (p059f9.a) this.f17248G;
                        n6 = (W8.N) this.f17253L;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                }
                p087i7.x.b(obj);
                n6 = (W8.N) this.f17253L;
                aVar = aa.C1887a.this.f17246a;
                c1887a = aa.C1887a.this;
                java.lang.Object obj3 = this.f17255N;
                lVar = this.f17256O;
                this.f17253L = n6;
                this.f17248G = aVar;
                this.f17249H = c1887a;
                this.f17250I = obj3;
                this.f17251J = lVar;
                this.f17252K = 1;
                if (aVar.c(null, this) == objG) {
                    return objG;
                }
                obj2 = obj3;
                W8.V vB = (W8.V) c1887a.f17247b.get(obj2);
                if (vB == null || vB.isCancelled()) {
                    vB = W8.AbstractC1788i.b(n6, null, W8.P.LAZY, new aa.C1887a.C0333a.C0334a(lVar, null), 1, null);
                    c1887a.f17247b.put(obj2, vB);
                }
                aVar.d(null);
                this.f17253L = null;
                this.f17248G = null;
                this.f17249H = null;
                this.f17250I = null;
                this.f17251J = null;
                this.f17252K = 2;
                obj = vB.d1(this);
                return obj == objG ? objG : obj;
            } catch (java.lang.Throwable th) {
                aVar.d(null);
                throw th;
            }
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((aa.C1887a.C0333a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            aa.C1887a.C0333a c0333a = aa.C1887a.this.new C0333a(this.f17255N, this.f17256O, eVar);
            c0333a.f17253L = obj;
            return c0333a;
        }
    }

    public final java.lang.Object c(java.lang.Object obj, p237x7.l lVar, p127m7.e eVar) {
        return W8.O.f(new aa.C1887a.C0333a(obj, lVar, null), eVar);
    }
}
