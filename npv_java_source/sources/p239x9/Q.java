package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class Q implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.Q f56967a = new p239x9.Q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56968b = new p239x9.C7323q0("kotlin.Long", v9.d.g.f56033a);

    private Q() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56968b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Number) obj).longValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Long b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Long.valueOf(hVar.q());
    }

    public void g(p229w9.j jVar, long j6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.D(j6);
    }
}
