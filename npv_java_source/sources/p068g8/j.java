package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g8.j.a f45669b = new g8.j.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f45670c = p097j7.Z.c(p078h8.a.EnumC0561a.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Set f45671d = p097j7.Z.g(p078h8.a.EnumC0561a.FILE_FACADE, p078h8.a.EnumC0561a.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p128m8.e f45672e = new p128m8.e(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p128m8.e f45673f = new p128m8.e(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p128m8.e f45674g = new p128m8.e(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B8.k f45675a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p128m8.e a() {
            return p068g8.j.f45674g;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final g8.j.b f45676D = new g8.j.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            return p097j7.AbstractC6879v.m();
        }
    }

    private final D8.e c(p068g8.t tVar) {
        if (!d().g().b()) {
            if (tVar.b().j()) {
                return D8.e.FIR_UNSTABLE;
            }
            if (tVar.b().k()) {
                return D8.e.IR_UNSTABLE;
            }
        }
        return D8.e.STABLE;
    }

    private final B8.t e(p068g8.t tVar) {
        if (g() || tVar.b().d().h(f())) {
            return null;
        }
        return new B8.t(tVar.b().d(), p128m8.e.f51215i, f(), f().k(tVar.b().d().j()), tVar.e(), tVar.c());
    }

    private final p128m8.e f() {
        return P8.c.a(d().g());
    }

    private final boolean g() {
        return d().g().e();
    }

    private final boolean h(p068g8.t tVar) {
        return !d().g().c() && tVar.b().i() && p247y7.AbstractC7350t.b(tVar.b().d(), f45673f);
    }

    private final boolean i(p068g8.t tVar) {
        return (d().g().f() && (tVar.b().i() || p247y7.AbstractC7350t.b(tVar.b().d(), f45672e))) || h(tVar);
    }

    private final java.lang.String[] k(p068g8.t tVar, java.util.Set set) {
        p078h8.a aVarB = tVar.b();
        java.lang.String[] strArrA = aVarB.a();
        if (strArrA == null) {
            strArrA = aVarB.b();
        }
        if (strArrA == null || !set.contains(aVarB.c())) {
            return null;
        }
        return strArrA;
    }

    public final p248y8.h b(O7.K k6, p068g8.t tVar) {
        p087i7.u uVarM;
        p247y7.AbstractC7350t.f(k6, "descriptor");
        p247y7.AbstractC7350t.f(tVar, "kotlinClass");
        java.lang.String[] strArrK = k(tVar, f45671d);
        if (strArrK == null) {
            return null;
        }
        java.lang.String[] strArrG = tVar.b().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                uVarM = p128m8.i.m(strArrK, strArrG);
            } catch (p158p8.k e6) {
                throw new java.lang.IllegalStateException("Could not read data from " + tVar.e(), e6);
            }
        } catch (java.lang.Throwable th) {
            if (g() || tVar.b().d().h(f())) {
                throw th;
            }
            uVarM = null;
        }
        if (uVarM == null) {
            return null;
        }
        p128m8.f fVar = (p128m8.f) uVarM.a();
        p088i8.l lVar = (p088i8.l) uVarM.b();
        p068g8.n nVar = new p068g8.n(tVar, lVar, fVar, e(tVar), i(tVar), c(tVar));
        return new D8.i(k6, lVar, fVar, tVar.b().d(), nVar, d(), "scope for " + nVar + " in " + k6, g8.j.b.f45676D);
    }

    public final B8.k d() {
        B8.k kVar = this.f45675a;
        if (kVar != null) {
            return kVar;
        }
        p247y7.AbstractC7350t.p("components");
        return null;
    }

    public final B8.C0826g j(p068g8.t tVar) {
        java.lang.String[] strArrG;
        p087i7.u uVarI;
        p247y7.AbstractC7350t.f(tVar, "kotlinClass");
        java.lang.String[] strArrK = k(tVar, f45670c);
        if (strArrK == null || (strArrG = tVar.b().g()) == null) {
            return null;
        }
        try {
            try {
                uVarI = p128m8.i.i(strArrK, strArrG);
            } catch (p158p8.k e6) {
                throw new java.lang.IllegalStateException("Could not read data from " + tVar.e(), e6);
            }
        } catch (java.lang.Throwable th) {
            if (g() || tVar.b().d().h(f())) {
                throw th;
            }
            uVarI = null;
        }
        if (uVarI == null) {
            return null;
        }
        return new B8.C0826g((p128m8.f) uVarI.a(), (p088i8.c) uVarI.b(), tVar.b().d(), new p068g8.v(tVar, e(tVar), i(tVar), c(tVar)));
    }

    public final O7.InterfaceC1424e l(p068g8.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "kotlinClass");
        B8.C0826g c0826gJ = j(tVar);
        if (c0826gJ == null) {
            return null;
        }
        return d().f().d(tVar.c(), c0826gJ);
    }

    public final void m(B8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<set-?>");
        this.f45675a = kVar;
    }

    public final void n(p068g8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "components");
        m(hVar.a());
    }
}
