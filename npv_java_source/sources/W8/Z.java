package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends p019b9.z {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15479G = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.Z.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public Z(p127m7.i iVar, p127m7.e eVar) {
        super(iVar, eVar);
    }

    private final boolean o1() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15479G;
        do {
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!f15479G.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean p1() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15479G;
        do {
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!f15479G.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p019b9.z, W8.AbstractC1772a
    protected void g1(java.lang.Object obj) {
        if (o1()) {
            return;
        }
        p019b9.AbstractC2122i.b(p137n7.b.d(this.f24391F), W8.C.a(obj, this.f24391F));
    }

    public final java.lang.Object k1() {
        if (p1()) {
            return p137n7.b.g();
        }
        java.lang.Object objH = W8.G0.h(b0());
        if (objH instanceof W8.A) {
            throw ((W8.A) objH).f15423a;
        }
        return objH;
    }

    @Override // p019b9.z, W8.F0
    protected void u(java.lang.Object obj) {
        g1(obj);
    }
}
