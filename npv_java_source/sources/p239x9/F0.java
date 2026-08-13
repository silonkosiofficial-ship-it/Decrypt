package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.F0 f56936a = new p239x9.F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56937b = p239x9.G.a("kotlin.UByte", p209u9.a.y(p247y7.C7336e.f57284a));

    private F0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56937b;
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        return p087i7.C.e(f(hVar));
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((p087i7.C) obj).o());
    }

    public byte f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return p087i7.C.g(hVar.p(a()).y());
    }

    public void g(p229w9.j jVar, byte b6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.w(a()).j(b6);
    }
}
