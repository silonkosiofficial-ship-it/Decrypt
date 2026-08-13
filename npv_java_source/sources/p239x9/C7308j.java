package p239x9;

/* JADX INFO: renamed from: x9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7308j implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C7308j f57005a = new p239x9.C7308j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57006b = new p239x9.C7323q0("kotlin.Byte", v9.d.b.f56028a);

    private C7308j() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57006b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Number) obj).byteValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Byte b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Byte.valueOf(hVar.y());
    }

    public void g(p229w9.j jVar, byte b6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.j(b6);
    }
}
