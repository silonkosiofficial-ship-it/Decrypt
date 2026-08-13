package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements D8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p228w8.d f45680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p228w8.d f45681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.t f45682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f45683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final D8.e f45684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p068g8.t f45685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f45686h;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(p068g8.t tVar, p088i8.l lVar, p108k8.c cVar, B8.t tVar2, boolean z6, D8.e eVar) {
        p247y7.AbstractC7350t.f(tVar, "kotlinClass");
        p247y7.AbstractC7350t.f(lVar, "packageProto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(eVar, "abiStability");
        p228w8.d dVarB = p228w8.d.b(tVar.c());
        p247y7.AbstractC7350t.e(dVarB, "byClassId(...)");
        java.lang.String strE = tVar.b().e();
        p228w8.d dVarD = null;
        if (strE != null && strE.length() > 0) {
            dVarD = p228w8.d.d(strE);
        }
        this(dVarB, dVarD, lVar, cVar, tVar2, z6, eVar, tVar);
    }

    public n(p228w8.d dVar, p228w8.d dVar2, p088i8.l lVar, p108k8.c cVar, B8.t tVar, boolean z6, D8.e eVar, p068g8.t tVar2) {
        java.lang.String string;
        p247y7.AbstractC7350t.f(dVar, "className");
        p247y7.AbstractC7350t.f(lVar, "packageProto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(eVar, "abiStability");
        this.f45680b = dVar;
        this.f45681c = dVar2;
        this.f45682d = tVar;
        this.f45683e = z6;
        this.f45684f = eVar;
        this.f45685g = tVar2;
        p8.i.f fVar = p118l8.a.f50084m;
        p247y7.AbstractC7350t.e(fVar, "packageModuleName");
        java.lang.Integer num = (java.lang.Integer) p108k8.e.a(lVar, fVar);
        this.f45686h = (num == null || (string = cVar.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // O7.a0
    public O7.b0 a() {
        O7.b0 b0Var = O7.b0.f8149a;
        p247y7.AbstractC7350t.e(b0Var, "NO_SOURCE_FILE");
        return b0Var;
    }

    @Override // D8.f
    public java.lang.String c() {
        return "Class '" + d().b().b() + '\'';
    }

    public final p138n8.b d() {
        return new p138n8.b(e().g(), h());
    }

    public p228w8.d e() {
        return this.f45680b;
    }

    public p228w8.d f() {
        return this.f45681c;
    }

    public final p068g8.t g() {
        return this.f45685g;
    }

    public final p138n8.f h() {
        java.lang.String strF = e().f();
        p247y7.AbstractC7350t.e(strF, "getInternalName(...)");
        p138n8.f fVarO = p138n8.f.o(S8.r.l1(strF, '/', null, 2, null));
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return fVarO;
    }

    public java.lang.String toString() {
        return p068g8.n.class.getSimpleName() + ": " + e();
    }
}
