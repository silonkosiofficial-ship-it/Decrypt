package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class Y implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.Y f56982a = new p239x9.Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f56983b = p239x9.X.f56979a;

    private Y() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f56983b;
    }

    @Override // p199t9.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.lang.Void b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        throw new p199t9.d("'kotlin.Nothing' does not have instances");
    }

    @Override // p199t9.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(p229w9.j jVar, java.lang.Void r6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        p247y7.AbstractC7350t.f(r6, "value");
        throw new p199t9.d("'kotlin.Nothing' cannot be serialized");
    }
}
