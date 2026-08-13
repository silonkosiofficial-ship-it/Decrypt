package p139n9;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p139n9.c f52078a = new p139n9.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f52079b = p219v9.l.b("kotlinx.datetime.LocalDate", v9.d.i.f56035a);

    private c() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f52079b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p079h9.h b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return h9.h.a.b(p079h9.h.Companion, hVar.o(), null, 2, null);
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p079h9.h hVar) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(hVar, "value");
        jVar.E(hVar.toString());
    }
}
