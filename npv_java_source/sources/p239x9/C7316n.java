package p239x9;

/* JADX INFO: renamed from: x9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7316n implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C7316n f57024a = new p239x9.C7316n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57025b = new p239x9.C7323q0("kotlin.Char", v9.d.c.f56029a);

    private C7316n() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57025b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Character) obj).charValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Character b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Character.valueOf(hVar.f());
    }

    public void g(p229w9.j jVar, char c6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.p(c6);
    }
}
