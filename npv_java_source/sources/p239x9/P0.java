package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements p199t9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p239x9.P0 f56965b = new p239x9.P0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p239x9.C7295c0 f56966a = new p239x9.C7295c0("kotlin.Unit", p087i7.M.f46721a);

    private P0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return this.f56966a.a();
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        f(hVar);
        return p087i7.M.f46721a;
    }

    public void f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        this.f56966a.b(hVar);
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, p087i7.M m6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(m6, "value");
        this.f56966a.e(jVar, m6);
    }
}
