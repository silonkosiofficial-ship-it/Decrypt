package p249y9;

/* JADX INFO: loaded from: classes2.dex */
final class x implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.x f57443a = new p249y9.x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57444b = p219v9.l.b("kotlinx.serialization.json.JsonLiteral", v9.d.i.f56035a);

    private x() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57444b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p249y9.w b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p249y9.i iVarL = p249y9.r.d(hVar).l();
        if (iVarL instanceof p249y9.w) {
            return (p249y9.w) iVarL;
        }
        throw p258z9.G.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + p247y7.P.b(iVarL.getClass()), iVarL.toString());
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.w wVar) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(wVar, "value");
        p249y9.r.h(jVar);
        if (wVar.f()) {
            jVar.E(wVar.d());
            return;
        }
        if (wVar.e() != null) {
            jVar.w(wVar.e()).E(wVar.d());
            return;
        }
        java.lang.Long lX = S8.r.x(wVar.d());
        if (lX != null) {
            jVar.D(lX.longValue());
            return;
        }
        p087i7.G gI = S8.N.i(wVar.d());
        if (gI != null) {
            jVar.w(p209u9.a.u(p087i7.G.f46710D).a()).D(gI.q());
            return;
        }
        java.lang.Double dS = S8.r.s(wVar.d());
        if (dS != null) {
            jVar.g(dS.doubleValue());
            return;
        }
        java.lang.Boolean boolT1 = S8.r.t1(wVar.d());
        if (boolT1 != null) {
            jVar.l(boolT1.booleanValue());
        } else {
            jVar.E(wVar.d());
        }
    }
}
