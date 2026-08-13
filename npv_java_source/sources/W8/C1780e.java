package W8;

/* JADX INFO: renamed from: W8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1780e extends W8.AbstractC1772a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.Thread f15496F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final W8.AbstractC1791j0 f15497G;

    public C1780e(p127m7.i iVar, java.lang.Thread thread, W8.AbstractC1791j0 abstractC1791j0) {
        super(iVar, true, true);
        this.f15496F = thread;
        this.f15497G = abstractC1791j0;
    }

    @Override // W8.F0
    protected boolean k0() {
        return true;
    }

    public final java.lang.Object k1() throws java.lang.Throwable {
        W8.AbstractC1776c.a();
        try {
            W8.AbstractC1791j0 abstractC1791j0 = this.f15497G;
            if (abstractC1791j0 != null) {
                W8.AbstractC1791j0.F1(abstractC1791j0, false, 1, null);
            }
            while (!java.lang.Thread.interrupted()) {
                try {
                    W8.AbstractC1791j0 abstractC1791j1 = this.f15497G;
                    long jI1 = abstractC1791j1 != null ? abstractC1791j1.I1() : Long.MAX_VALUE;
                    if (f1()) {
                        W8.AbstractC1791j0 abstractC1791j2 = this.f15497G;
                        if (abstractC1791j2 != null) {
                            W8.AbstractC1791j0.A1(abstractC1791j2, false, 1, null);
                        }
                        W8.AbstractC1776c.a();
                        java.lang.Object objH = W8.G0.h(b0());
                        W8.A a6 = objH instanceof W8.A ? (W8.A) objH : null;
                        if (a6 == null) {
                            return objH;
                        }
                        throw a6.f15423a;
                    }
                    W8.AbstractC1776c.a();
                    java.util.concurrent.locks.LockSupport.parkNanos(this, jI1);
                } catch (java.lang.Throwable th) {
                    W8.AbstractC1791j0 abstractC1791j3 = this.f15497G;
                    if (abstractC1791j3 != null) {
                        W8.AbstractC1791j0.A1(abstractC1791j3, false, 1, null);
                    }
                    throw th;
                }
            }
            java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
            x(interruptedException);
            throw interruptedException;
        } catch (java.lang.Throwable th2) {
            W8.AbstractC1776c.a();
            throw th2;
        }
    }

    @Override // W8.F0
    protected void u(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(java.lang.Thread.currentThread(), this.f15496F)) {
            return;
        }
        java.lang.Thread thread = this.f15496F;
        W8.AbstractC1776c.a();
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
