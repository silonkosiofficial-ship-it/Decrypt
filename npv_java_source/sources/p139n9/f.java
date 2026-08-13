package p139n9;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p139n9.f f52084a = new p139n9.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f52085b = p219v9.l.b("kotlinx.datetime.TimeZone", v9.d.i.f56035a);

    private f() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f52085b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p079h9.o b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p079h9.o.Companion.d(hVar.o());
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p079h9.o oVar) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(oVar, "value");
        jVar.E(oVar.b());
    }
}
