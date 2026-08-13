package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.y0 f57065a = new p239x9.y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57066b = new p239x9.C7323q0("kotlin.String", v9.d.i.f56035a);

    private y0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57066b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.String b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return hVar.o();
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(str, "value");
        jVar.E(str);
    }
}
