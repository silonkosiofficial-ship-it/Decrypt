package W8;

/* JADX INFO: loaded from: classes2.dex */
final class Z0 extends p019b9.z implements java.lang.Runnable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f15480G;

    public Z0(long j6, p127m7.e eVar) {
        super(eVar.getContext(), eVar);
        this.f15480G = j6;
    }

    @Override // java.lang.Runnable
    public void run() {
        x(W8.a1.a(this.f15480G, W8.Y.b(getContext()), this));
    }

    @Override // W8.AbstractC1772a, W8.F0
    public java.lang.String w0() {
        return super.w0() + "(timeMillis=" + this.f15480G + ')';
    }
}
