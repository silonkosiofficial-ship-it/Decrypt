package p239x9;

/* JADX INFO: renamed from: x9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7325t implements p199t9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p239x9.C7325t f57039a = new p239x9.C7325t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v9.f f57040b = new p239x9.C7323q0("kotlin.time.Duration", v9.d.i.f56035a);

    private C7325t() {
    }

    @Override // p199t9.b, p199t9.e, p199t9.a
    public p219v9.f a() {
        return f57040b;
    }

    @Override // p199t9.a
    public /* bridge */ /* synthetic */ java.lang.Object b(p229w9.h hVar) {
        return T8.a.o(f(hVar));
    }

    @Override // p199t9.e
    public /* bridge */ /* synthetic */ void e(p229w9.j jVar, java.lang.Object obj) {
        g(jVar, ((T8.a) obj).T());
    }

    public long f(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return T8.a.f13312D.d(hVar.o());
    }

    public void g(p229w9.j jVar, long j6) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        jVar.E(T8.a.P(j6));
    }
}
