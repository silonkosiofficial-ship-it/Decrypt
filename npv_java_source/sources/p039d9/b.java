package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends W8.AbstractC1805q0 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final p039d9.b f44328F = new p039d9.b();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final W8.J f44329G = W8.J.y1(p039d9.k.f44346E, p019b9.G.e("kotlinx.coroutines.io.parallelism", E7.j.d(64, p019b9.E.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        t1(p127m7.j.f51198C, runnable);
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        f44329G.t1(iVar, runnable);
    }

    @Override // W8.J
    public java.lang.String toString() {
        return "Dispatchers.IO";
    }

    @Override // W8.J
    public void u1(p127m7.i iVar, java.lang.Runnable runnable) {
        f44329G.u1(iVar, runnable);
    }

    @Override // W8.J
    public W8.J x1(int i6, java.lang.String str) {
        return p039d9.k.f44346E.x1(i6, str);
    }

    @Override // W8.AbstractC1805q0
    public java.util.concurrent.Executor z1() {
        return this;
    }
}
