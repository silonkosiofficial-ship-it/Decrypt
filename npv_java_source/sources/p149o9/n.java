package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p149o9.n f52587a = new p149o9.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52588b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p149o9.k f52589c = p149o9.k.f52579h.b(new byte[0], 0, 0, null, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f52592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f52593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f52594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReferenceArray f52595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReferenceArray f52596j;

    static {
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f52590d = iHighestOneBit;
        int iD = E7.j.d(iHighestOneBit / 2, 1);
        f52591e = iD;
        java.lang.String str = p247y7.AbstractC7350t.b(java.lang.System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        f52592f = str;
        java.lang.String property = java.lang.System.getProperty("kotlinx.io.pool.size.bytes", str);
        p247y7.AbstractC7350t.e(property, "getProperty(...)");
        java.lang.Integer numV = S8.r.v(property);
        int iD2 = numV != null ? E7.j.d(numV.intValue(), 0) : 0;
        f52593g = iD2;
        f52594h = E7.j.d(iD2 / iD, 8192);
        f52595i = new java.util.concurrent.atomic.AtomicReferenceArray(iHighestOneBit);
        f52596j = new java.util.concurrent.atomic.AtomicReferenceArray(iD);
    }

    private n() {
    }

    private final int a(long j6) {
        return (int) (j6 & java.lang.Thread.currentThread().getId());
    }

    private final int b() {
        return a(((long) f52590d) - 1);
    }

    private final int c() {
        return a(((long) f52591e) - 1);
    }

    public static final void d(p149o9.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "segment");
        if (kVar.e() != null || kVar.g() != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        p149o9.l lVarC = kVar.c();
        if (lVarC != null && lVarC.c()) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f52595i;
        int iB = f52587a.b();
        kVar.s(0);
        kVar.f52584e = true;
        while (true) {
            p149o9.k kVar2 = (p149o9.k) atomicReferenceArray.get(iB);
            if (kVar2 != f52589c) {
                int iD = kVar2 != null ? kVar2.d() : 0;
                if (iD >= f52588b) {
                    if (f52593g > 0) {
                        e(kVar);
                        return;
                    }
                    return;
                } else {
                    kVar.r(kVar2);
                    kVar.q(iD + 8192);
                    if (Y8.o.a(atomicReferenceArray, iB, kVar2, kVar)) {
                        return;
                    }
                }
            }
        }
    }

    private static final void e(p149o9.k kVar) {
        kVar.s(0);
        kVar.f52584e = true;
        int iC = f52587a.c();
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f52596j;
        int i6 = 0;
        while (true) {
            p149o9.k kVar2 = (p149o9.k) atomicReferenceArray.get(iC);
            if (kVar2 != f52589c) {
                int iD = (kVar2 != null ? kVar2.d() : 0) + 8192;
                if (iD > f52594h) {
                    int i10 = f52591e;
                    if (i6 >= i10) {
                        return;
                    }
                    i6++;
                    iC = (iC + 1) & (i10 - 1);
                } else {
                    kVar.r(kVar2);
                    kVar.q(iD);
                    if (Y8.o.a(atomicReferenceArray, iC, kVar2, kVar)) {
                        return;
                    }
                }
            }
        }
    }

    public static final p149o9.k f() {
        p149o9.k kVar;
        p149o9.k kVar2;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f52595i;
        int iB = f52587a.b();
        do {
            kVar = f52589c;
            kVar2 = (p149o9.k) atomicReferenceArray.getAndSet(iB, kVar);
        } while (p247y7.AbstractC7350t.b(kVar2, kVar));
        if (kVar2 == null) {
            atomicReferenceArray.set(iB, null);
            return f52593g > 0 ? g() : p149o9.k.f52579h.a();
        }
        atomicReferenceArray.set(iB, kVar2.e());
        kVar2.r(null);
        kVar2.q(0);
        return kVar2;
    }

    private static final p149o9.k g() {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f52596j;
        int iC = f52587a.c();
        int i6 = 0;
        while (true) {
            p149o9.k kVar = f52589c;
            p149o9.k kVar2 = (p149o9.k) atomicReferenceArray.getAndSet(iC, kVar);
            if (!p247y7.AbstractC7350t.b(kVar2, kVar)) {
                if (kVar2 != null) {
                    atomicReferenceArray.set(iC, kVar2.e());
                    kVar2.r(null);
                    kVar2.q(0);
                    return kVar2;
                }
                atomicReferenceArray.set(iC, null);
                int i10 = f52591e;
                if (i6 >= i10) {
                    return p149o9.k.f52579h.a();
                }
                iC = (iC + 1) & (i10 - 1);
                i6++;
            }
        }
    }

    public static final p149o9.l h() {
        return new p149o9.j();
    }
}
