package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class G implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.G f57386a = new p249y9.G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57387b = p219v9.l.d("kotlinx.serialization.json.JsonPrimitive", v9.d.i.f56035a, new p219v9.f[0], null, 8, null);

    private G() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57387b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p249y9.F b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p249y9.i iVarL = p249y9.r.d(hVar).l();
        if (iVarL instanceof p249y9.F) {
            return (p249y9.F) iVarL;
        }
        throw p258z9.G.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + p247y7.P.b(iVarL.getClass()), iVarL.toString());
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.F f6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(f6, "value");
        p249y9.r.h(jVar);
        if (f6 instanceof p249y9.A) {
            jVar.t(p249y9.B.f57378a, p249y9.A.INSTANCE);
        } else {
            jVar.t(p249y9.x.f57443a, (p249y9.w) f6);
        }
    }
}
