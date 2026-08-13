package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.L0 f56952a = new p239x9.L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56953b = p239x9.G.a("kotlin.ULong", p209u9.a.D(p247y7.C7353w.f57308a));

    private L0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56953b;
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        return p087i7.G.e(f(hVar));
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((p087i7.G) obj).q());
    }

    public long f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p087i7.G.g(hVar.p(a()).q());
    }

    public void g(p229w9.j jVar, long j6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.w(a()).D(j6);
    }
}
