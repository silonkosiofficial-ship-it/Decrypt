package p139n9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p139n9.a f52074a = new p139n9.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f52075b = p219v9.l.b("kotlinx.datetime.FixedOffsetTimeZone", v9.d.i.f56035a);

    private a() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f52075b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p079h9.e b(p229w9.h hVar) throws java.lang.Exception {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        p079h9.o oVarD = p079h9.o.Companion.d(hVar.o());
        if (oVarD instanceof p079h9.e) {
            return (p079h9.e) oVarD;
        }
        throw new p199t9.d("Timezone identifier '" + oVarD + "' does not correspond to a fixed-offset timezone");
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p079h9.e eVar) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(eVar, "value");
        jVar.E(eVar.b());
    }
}
