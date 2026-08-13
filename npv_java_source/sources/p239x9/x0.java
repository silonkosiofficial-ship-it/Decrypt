package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.x0 f57060a = new p239x9.x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57061b = new p239x9.C7323q0("kotlin.Short", v9.d.h.f56034a);

    private x0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57061b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Number) obj).shortValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Short b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Short.valueOf(hVar.A());
    }

    public void g(p229w9.j jVar, short s6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.h(s6);
    }
}
