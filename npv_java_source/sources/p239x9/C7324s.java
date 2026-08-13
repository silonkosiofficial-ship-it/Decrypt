package p239x9;

/* JADX INFO: renamed from: x9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7324s implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C7324s f57035a = new p239x9.C7324s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57036b = new p239x9.C7323q0("kotlin.Double", p219v9.d.C0737d.f56030a);

    private C7324s() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57036b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Number) obj).doubleValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Double b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Double.valueOf(hVar.F());
    }

    public void g(p229w9.j jVar, double d6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.g(d6);
    }
}
