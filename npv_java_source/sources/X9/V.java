package X9;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X9.V f16102a = new X9.V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16103b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X9.U f16104c = new X9.U(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference[] f16106e;

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16105d = iHighestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[iHighestOneBit];
        for (int i6 = 0; i6 < iHighestOneBit; i6++) {
            atomicReferenceArr[i6] = new java.util.concurrent.atomic.AtomicReference();
        }
        f16106e = atomicReferenceArr;
    }

    private V() {
    }

    private final java.util.concurrent.atomic.AtomicReference a() {
        return f16106e[(int) (java.lang.Thread.currentThread().getId() & (((long) f16105d) - 1))];
    }

    public static final void b(X9.U u6) {
        p247y7.AbstractC7350t.f(u6, "segment");
        if (u6.f16100f != null || u6.f16101g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (u6.f16098d) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReferenceA = f16102a.a();
        X9.U u10 = f16104c;
        X9.U u11 = (X9.U) atomicReferenceA.getAndSet(u10);
        if (u11 == u10) {
            return;
        }
        int i6 = u11 != null ? u11.f16097c : 0;
        if (i6 >= f16103b) {
            atomicReferenceA.set(u11);
            return;
        }
        u6.f16100f = u11;
        u6.f16096b = 0;
        u6.f16097c = i6 + 8192;
        atomicReferenceA.set(u6);
    }

    public static final X9.U c() {
        java.util.concurrent.atomic.AtomicReference atomicReferenceA = f16102a.a();
        X9.U u6 = f16104c;
        X9.U u10 = (X9.U) atomicReferenceA.getAndSet(u6);
        if (u10 == u6) {
            return new X9.U();
        }
        if (u10 == null) {
            atomicReferenceA.set(null);
            return new X9.U();
        }
        atomicReferenceA.set(u10.f16100f);
        u10.f16100f = null;
        u10.f16097c = 0;
        return u10;
    }
}
