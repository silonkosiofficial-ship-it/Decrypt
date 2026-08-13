package p043e2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.AutoCloseable, W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.i f44636C;

    public a(p127m7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f44636C = iVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        W8.D0.f(getCoroutineContext(), null, 1, null);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f44636C;
    }
}
