package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U5.f.b f14515c = new U5.f.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final B7.c f14516d = P1.a.b(S5.w.f12573a.b(), new N1.b(U5.f.a.f14519D), null, null, 12, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U5.h f14517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5.h f14518b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final U5.f.a f14519D = new U5.f.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q1.f l(M1.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "ex");
            java.lang.String str = "CorruptionException in settings DataStore in " + S5.v.f12572a.e() + '.';
            return Q1.g.a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f14520a = {p247y7.P.k(new p247y7.I(U5.f.b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final M1.h b(android.content.Context context) {
            return (M1.h) U5.f.f14516d.a(context, f14520a[0]);
        }

        public final U5.f c() {
            java.lang.Object objJ = Q4.n.a(Q4.c.f9032a).j(U5.f.class);
            p247y7.AbstractC7350t.e(objJ, "Firebase.app[SessionsSettings::class.java]");
            return (U5.f) objJ;
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f14521F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f14522G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f14524I;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f14522G = obj;
            this.f14524I |= Integer.MIN_VALUE;
            return U5.f.this.g(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Q4.f fVar, p127m7.i iVar, p127m7.i iVar2, G5.e eVar) {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        p247y7.AbstractC7350t.f(iVar, "blockingDispatcher");
        p247y7.AbstractC7350t.f(iVar2, "backgroundDispatcher");
        p247y7.AbstractC7350t.f(eVar, "firebaseInstallationsApi");
        android.content.Context contextK = fVar.k();
        p247y7.AbstractC7350t.e(contextK, "firebaseApp.applicationContext");
        this(contextK, iVar, iVar2, eVar, S5.A.f12433a.b(fVar));
    }

    public f(U5.h hVar, U5.h hVar2) {
        p247y7.AbstractC7350t.f(hVar, "localOverrideSettings");
        p247y7.AbstractC7350t.f(hVar2, "remoteSettings");
        this.f14517a = hVar;
        this.f14518b = hVar2;
    }

    private f(android.content.Context context, p127m7.i iVar, p127m7.i iVar2, G5.e eVar, S5.C1619b c1619b) {
        this(new U5.b(context), new U5.c(iVar2, eVar, c1619b, new U5.d(c1619b, iVar, null, 4, null), f14515c.b(context)));
    }

    private final boolean e(double d6) {
        return 0.0d <= d6 && d6 <= 1.0d;
    }

    private final boolean f(long j6) {
        return T8.a.N(j6) && T8.a.I(j6);
    }

    public final double b() {
        java.lang.Double d6 = this.f14517a.d();
        if (d6 != null) {
            double dDoubleValue = d6.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        java.lang.Double d10 = this.f14518b.d();
        if (d10 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = d10.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        T8.a aVarC = this.f14517a.c();
        if (aVarC != null) {
            long jT = aVarC.T();
            if (f(jT)) {
                return jT;
            }
        }
        T8.a aVarC2 = this.f14518b.c();
        if (aVarC2 != null) {
            long jT2 = aVarC2.T();
            if (f(jT2)) {
                return jT2;
            }
        }
        T8.a.C0279a c0279a = T8.a.f13312D;
        return T8.c.s(30, T8.d.MINUTES);
    }

    public final boolean d() {
        java.lang.Boolean boolA = this.f14517a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        java.lang.Boolean boolA2 = this.f14518b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(p127m7.e eVar) {
        U5.f.c cVar;
        U5.f fVar;
        if (eVar instanceof U5.f.c) {
            cVar = (U5.f.c) eVar;
            int i6 = cVar.f14524I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f14524I = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new U5.f.c(eVar);
            }
        } else {
            cVar = new U5.f.c(eVar);
        }
        java.lang.Object obj = cVar.f14522G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f14524I;
        if (i10 != 0) {
            if (i10 == 1) {
                fVar = (U5.f) cVar.f14521F;
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
        U5.h hVar = this.f14517a;
        cVar.f14521F = this;
        cVar.f14524I = 1;
        if (hVar.b(cVar) == objG) {
            return objG;
        }
        fVar = this;
        U5.h hVar2 = fVar.f14518b;
        cVar.f14521F = null;
        cVar.f14524I = 2;
        if (hVar2.b(cVar) == objG) {
            return objG;
        }
        return p087i7.M.f46721a;
    }
}
