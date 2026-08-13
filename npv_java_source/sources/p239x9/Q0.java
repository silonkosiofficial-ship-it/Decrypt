package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.Q0 f56969a = new p239x9.Q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56970b = new p239x9.C7323q0("kotlin.uuid.Uuid", v9.d.i.f56035a);

    private Q0() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56970b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public U8.b b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return U8.b.f14617E.c(hVar.o());
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, U8.b bVar) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(bVar, "value");
        jVar.E(bVar.toString());
    }
}
