package p200u;

/* JADX INFO: renamed from: u.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7179l implements V.G1 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p200u.x0 f54951C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54952D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p200u.r f54953E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f54954F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f54955G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f54956H;

    public C7179l(p200u.x0 x0Var, java.lang.Object obj, p200u.r rVar, long j6, long j10, boolean z6) {
        p200u.r rVarE;
        this.f54951C = x0Var;
        this.f54952D = V.A1.d(obj, null, 2, null);
        this.f54953E = (rVar == null || (rVarE = p200u.AbstractC7191s.e(rVar)) == null) ? p200u.AbstractC7181m.i(x0Var, obj) : rVarE;
        this.f54954F = j6;
        this.f54955G = j10;
        this.f54956H = z6;
    }

    public /* synthetic */ C7179l(p200u.x0 x0Var, java.lang.Object obj, p200u.r rVar, long j6, long j10, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(x0Var, obj, (i6 & 4) != 0 ? null : rVar, (i6 & 8) != 0 ? Long.MIN_VALUE : j6, (i6 & 16) != 0 ? Long.MIN_VALUE : j10, (i6 & 32) != 0 ? false : z6);
    }

    public final long e() {
        return this.f54955G;
    }

    public final long g() {
        return this.f54954F;
    }

    @Override // V.G1
    public java.lang.Object getValue() {
        return this.f54952D.getValue();
    }

    public final p200u.x0 n() {
        return this.f54951C;
    }

    public final java.lang.Object o() {
        return this.f54951C.b().l(this.f54953E);
    }

    public final p200u.r q() {
        return this.f54953E;
    }

    public final boolean r() {
        return this.f54956H;
    }

    public final void s(long j6) {
        this.f54955G = j6;
    }

    public final void t(long j6) {
        this.f54954F = j6;
    }

    public java.lang.String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + o() + ", isRunning=" + this.f54956H + ", lastFrameTimeNanos=" + this.f54954F + ", finishedTimeNanos=" + this.f54955G + ')';
    }

    public final void u(boolean z6) {
        this.f54956H = z6;
    }

    public void v(java.lang.Object obj) {
        this.f54952D.setValue(obj);
    }

    public final void w(p200u.r rVar) {
        this.f54953E = rVar;
    }
}
