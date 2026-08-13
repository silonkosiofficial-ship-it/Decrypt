package W8;

/* JADX INFO: renamed from: W8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1791j0 extends W8.J {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f15506E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f15507F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p097j7.C6871m f15508G;

    public static /* synthetic */ void A1(W8.AbstractC1791j0 abstractC1791j0, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        abstractC1791j0.z1(z6);
    }

    private final long B1(boolean z6) {
        return z6 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void F1(W8.AbstractC1791j0 abstractC1791j0, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        abstractC1791j0.E1(z6);
    }

    public final void C1(W8.AbstractC1773a0 abstractC1773a0) {
        p097j7.C6871m c6871m = this.f15508G;
        if (c6871m == null) {
            c6871m = new p097j7.C6871m();
            this.f15508G = c6871m;
        }
        c6871m.g(abstractC1773a0);
    }

    protected long D1() {
        p097j7.C6871m c6871m = this.f15508G;
        return (c6871m == null || c6871m.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void E1(boolean z6) {
        this.f15506E += B1(z6);
        if (z6) {
            return;
        }
        this.f15507F = true;
    }

    public final boolean G1() {
        return this.f15506E >= B1(true);
    }

    public final boolean H1() {
        p097j7.C6871m c6871m = this.f15508G;
        if (c6871m != null) {
            return c6871m.isEmpty();
        }
        return true;
    }

    public abstract long I1();

    public final boolean J1() {
        W8.AbstractC1773a0 abstractC1773a0;
        p097j7.C6871m c6871m = this.f15508G;
        if (c6871m == null || (abstractC1773a0 = (W8.AbstractC1773a0) c6871m.S()) == null) {
            return false;
        }
        abstractC1773a0.run();
        return true;
    }

    public boolean K1() {
        return false;
    }

    public abstract void shutdown();

    @Override // W8.J
    public final W8.J x1(int i6, java.lang.String str) {
        p019b9.AbstractC2125l.a(i6);
        return p019b9.AbstractC2125l.b(this, str);
    }

    public final void z1(boolean z6) {
        long jB1 = this.f15506E - B1(z6);
        this.f15506E = jB1;
        if (jB1 <= 0 && this.f15507F) {
            shutdown();
        }
    }
}
