package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p249y9.B f57378a = new p249y9.B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57379b = p219v9.l.d("kotlinx.serialization.json.JsonNull", v9.m.b.f56057a, new p219v9.f[0], null, 8, null);

    private B() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57379b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p249y9.A b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p249y9.r.g(hVar);
        if (hVar.s()) {
            throw new p258z9.C("Expected 'null' literal");
        }
        hVar.n();
        return p249y9.A.INSTANCE;
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p249y9.A a6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(a6, "value");
        p249y9.r.h(jVar);
        jVar.d();
    }
}
