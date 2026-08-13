package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.O0 f56962a = new p239x9.O0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56963b = p239x9.G.a("kotlin.UShort", p209u9.a.E(p247y7.T.f57257a));

    private O0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56963b;
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        return p087i7.J.e(f(hVar));
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((p087i7.J) obj).o());
    }

    public short f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p087i7.J.g(hVar.p(a()).A());
    }

    public void g(p229w9.j jVar, short s6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.w(a()).h(s6);
    }
}
