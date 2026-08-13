package p239x9;

/* JADX INFO: renamed from: x9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7302g implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C7302g f56997a = new p239x9.C7302g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56998b = new p239x9.C7323q0("kotlin.Boolean", v9.d.a.f56027a);

    private C7302g() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56998b;
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((java.lang.Boolean) obj).booleanValue());
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return java.lang.Boolean.valueOf(hVar.e());
    }

    public void g(p229w9.j jVar, boolean z6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.l(z6);
    }
}
