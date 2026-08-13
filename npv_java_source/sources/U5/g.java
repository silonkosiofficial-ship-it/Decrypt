package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U5.g.b f14525c = new U5.g.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Q1.f.a f14526d = Q1.h.a("firebase_sessions_enabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Q1.f.a f14527e = Q1.h.c("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Q1.f.a f14528f = Q1.h.e("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Q1.f.a f14529g = Q1.h.e("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Q1.f.a f14530h = Q1.h.f("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M1.h f14531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U5.e f14532b;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f14533G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f14534H;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            U5.g gVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f14534H;
            if (i6 == 0) {
                p087i7.x.b(obj);
                U5.g gVar2 = U5.g.this;
                Z8.InterfaceC1869f data = gVar2.f14531a.getData();
                this.f14533G = gVar2;
                this.f14534H = 1;
                java.lang.Object objU = Z8.AbstractC1871h.u(data, this);
                if (objU == objG) {
                    return objG;
                }
                gVar = gVar2;
                obj = objU;
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (U5.g) this.f14533G;
                p087i7.x.b(obj);
            }
            gVar.l(((Q1.f) obj).d());
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((U5.g.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return U5.g.this.new a(eVar);
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14536F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f14538H;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f14536F = obj;
            this.f14538H |= Integer.MIN_VALUE;
            return U5.g.this.h(null, null, this);
        }
    }

    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14539G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14540H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f14541I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Q1.f.a f14542J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ U5.g f14543K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(java.lang.Object obj, Q1.f.a aVar, U5.g gVar, p127m7.e eVar) {
            super(2, eVar);
            this.f14541I = obj;
            this.f14542J = aVar;
            this.f14543K = gVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f14539G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            Q1.c cVar = (Q1.c) this.f14540H;
            java.lang.Object obj2 = this.f14541I;
            if (obj2 != null) {
                cVar.i(this.f14542J, obj2);
            } else {
                cVar.h(this.f14542J);
            }
            this.f14543K.l(cVar);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Q1.c cVar, p127m7.e eVar) {
            return ((U5.g.d) x(cVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            U5.g.d dVar = new U5.g.d(this.f14541I, this.f14542J, this.f14543K, eVar);
            dVar.f14540H = obj;
            return dVar;
        }
    }

    public g(M1.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "dataStore");
        this.f14531a = hVar;
        W8.AbstractC1786h.b(null, new U5.g.a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(Q1.f.a aVar, java.lang.Object obj, p127m7.e eVar) {
        U5.g.c cVar;
        if (eVar instanceof U5.g.c) {
            cVar = (U5.g.c) eVar;
            int i6 = cVar.f14538H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f14538H = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new U5.g.c(eVar);
            }
        } else {
            cVar = new U5.g.c(eVar);
        }
        java.lang.Object obj2 = cVar.f14536F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f14538H;
        try {
            if (i10 == 0) {
                p087i7.x.b(obj2);
                M1.h hVar = this.f14531a;
                U5.g.d dVar = new U5.g.d(obj, aVar, this, null);
                cVar.f14538H = 1;
                if (Q1.i.a(hVar, dVar, cVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj2);
            }
        } catch (java.io.IOException e6) {
            java.lang.String str = "Failed to update cache config value: " + e6;
        }
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Q1.f fVar) {
        this.f14532b = new U5.e((java.lang.Boolean) fVar.b(f14526d), (java.lang.Double) fVar.b(f14527e), (java.lang.Integer) fVar.b(f14528f), (java.lang.Integer) fVar.b(f14529g), (java.lang.Long) fVar.b(f14530h));
    }

    public final boolean d() {
        U5.e eVar = this.f14532b;
        U5.e eVar2 = null;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("sessionConfigs");
            eVar = null;
        }
        java.lang.Long lB = eVar.b();
        U5.e eVar3 = this.f14532b;
        if (eVar3 == null) {
            p247y7.AbstractC7350t.p("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        java.lang.Integer numA = eVar2.a();
        return lB == null || numA == null || (java.lang.System.currentTimeMillis() - lB.longValue()) / ((long) 1000) >= ((long) numA.intValue());
    }

    public final java.lang.Integer e() {
        U5.e eVar = this.f14532b;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final java.lang.Double f() {
        U5.e eVar = this.f14532b;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final java.lang.Boolean g() {
        U5.e eVar = this.f14532b;
        if (eVar == null) {
            p247y7.AbstractC7350t.p("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final java.lang.Object i(java.lang.Double d6, p127m7.e eVar) {
        java.lang.Object objH = h(f14527e, d6, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    public final java.lang.Object j(java.lang.Integer num, p127m7.e eVar) {
        java.lang.Object objH = h(f14529g, num, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    public final java.lang.Object k(java.lang.Long l6, p127m7.e eVar) {
        java.lang.Object objH = h(f14530h, l6, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    public final java.lang.Object m(java.lang.Integer num, p127m7.e eVar) {
        java.lang.Object objH = h(f14528f, num, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }

    public final java.lang.Object n(java.lang.Boolean bool, p127m7.e eVar) {
        java.lang.Object objH = h(f14526d, bool, eVar);
        return objH == p137n7.b.g() ? objH : p087i7.M.f46721a;
    }
}
