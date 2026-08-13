package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C f56929a = new p239x9.C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56930b = new p239x9.C7323q0("kotlin.Float", v9.d.e.f56031a);

    private C() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56930b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Number) obj).floatValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Float b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Float.valueOf(hVar.C());
    }

    public void g(p229w9.j jVar, float f6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.n(f6);
    }
}
