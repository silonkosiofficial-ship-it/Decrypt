package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends W8.AbstractC1805q0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f44332F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f44333G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final long f44334H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f44335I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p039d9.a f44336J = A1();

    public f(int i6, int i10, long j6, java.lang.String str) {
        this.f44332F = i6;
        this.f44333G = i10;
        this.f44334H = j6;
        this.f44335I = str;
    }

    private final p039d9.a A1() {
        return new p039d9.a(this.f44332F, this.f44333G, this.f44334H, this.f44335I);
    }

    public final void B1(java.lang.Runnable runnable, boolean z6, boolean z10) {
        this.f44336J.D(runnable, z6, z10);
    }

    @Override // W8.J
    public void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        p039d9.a.H(this.f44336J, runnable, false, false, 6, null);
    }

    @Override // W8.J
    public void u1(p127m7.i iVar, java.lang.Runnable runnable) {
        p039d9.a.H(this.f44336J, runnable, false, true, 2, null);
    }

    @Override // W8.AbstractC1805q0
    public java.util.concurrent.Executor z1() {
        return this.f44336J;
    }
}
