package p057f7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements p057f7.c {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f45287H = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p057f7.b.class, "top");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45288C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f45289D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f45290E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReferenceArray f45291F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int[] f45292G;
    private volatile /* synthetic */ long top;

    public b(int i6) {
        this.f45288C = i6;
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException(("capacity should be positive but it is " + i6).toString());
        }
        if (i6 > 536870911) {
            throw new java.lang.IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i6).toString());
        }
        this.top = 0L;
        int iHighestOneBit = java.lang.Integer.highestOneBit((i6 * 4) - 1) * 2;
        this.f45289D = iHighestOneBit;
        this.f45290E = java.lang.Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.f45291F = new java.util.concurrent.atomic.AtomicReferenceArray(iHighestOneBit + 1);
        this.f45292G = new int[iHighestOneBit + 1];
    }

    private final int f() {
        long j6;
        long j10;
        int i6;
        do {
            j6 = this.top;
            if (j6 == 0) {
                return 0;
            }
            j10 = ((j6 >> 32) & 4294967295L) + 1;
            i6 = (int) (4294967295L & j6);
            if (i6 == 0) {
                return 0;
            }
        } while (!f45287H.compareAndSet(this, j6, (j10 << 32) | ((long) this.f45292G[i6])));
        return i6;
    }

    private final java.lang.Object g() {
        int iF = f();
        if (iF == 0) {
            return null;
        }
        return this.f45291F.getAndSet(iF, null);
    }

    protected void a(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "instance");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        f7.c.a.a(this);
    }

    @Override // p057f7.c
    public final void e() {
        while (true) {
            java.lang.Object objG = g();
            if (objG == null) {
                return;
            } else {
                a(objG);
            }
        }
    }
}
