package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.I0 f56945a = new p239x9.I0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56946b = p239x9.G.a("kotlin.UInt", p209u9.a.C(p247y7.C7349s.f57306a));

    private I0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56946b;
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        return p087i7.E.e(f(hVar));
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((p087i7.E) obj).o());
    }

    public int f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p087i7.E.g(hVar.p(a()).m());
    }

    public void g(p229w9.j jVar, int i6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.w(a()).A(i6);
    }
}
