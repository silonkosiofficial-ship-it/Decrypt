package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends W8.J implements W8.X {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ W8.X f24387E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final W8.J f24388F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.String f24389G;

    /* JADX WARN: Multi-variable type inference failed */
    public v(W8.J j6, java.lang.String str) {
        W8.X x6 = j6 instanceof W8.X ? (W8.X) j6 : null;
        this.f24387E = x6 == null ? W8.U.a() : x6;
        this.f24388F = j6;
        this.f24389G = str;
    }

    @Override // W8.X
    public W8.InterfaceC1783f0 m1(long j6, java.lang.Runnable runnable, p127m7.i iVar) {
        return this.f24387E.m1(j6, runnable, iVar);
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        this.f24388F.t1(iVar, runnable);
    }

    @Override // W8.J
    public java.lang.String toString() {
        return this.f24389G;
    }

    @Override // W8.J
    public void u1(p127m7.i iVar, java.lang.Runnable runnable) {
        this.f24388F.u1(iVar, runnable);
    }

    @Override // W8.J
    public boolean v1(p127m7.i iVar) {
        return this.f24388F.v1(iVar);
    }

    @Override // W8.X
    public void x0(long j6, W8.InterfaceC1794l interfaceC1794l) {
        this.f24387E.x0(j6, interfaceC1794l);
    }
}
