package p019b9;

/* JADX INFO: renamed from: b9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2115b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24350a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.AbstractC2115b.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24351b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.AbstractC2115b.class, java.lang.Object.class, "_prev$volatile");
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    public AbstractC2115b(p019b9.AbstractC2115b abstractC2115b) {
        this._prev$volatile = abstractC2115b;
    }

    private final p019b9.AbstractC2115b d() {
        p019b9.AbstractC2115b abstractC2115bH = h();
        while (abstractC2115bH != null && abstractC2115bH.k()) {
            abstractC2115bH = (p019b9.AbstractC2115b) f24351b.get(abstractC2115bH);
        }
        return abstractC2115bH;
    }

    private final p019b9.AbstractC2115b e() {
        p019b9.AbstractC2115b abstractC2115bF;
        p019b9.AbstractC2115b abstractC2115bF2 = f();
        p247y7.AbstractC7350t.c(abstractC2115bF2);
        while (abstractC2115bF2.k() && (abstractC2115bF = abstractC2115bF2.f()) != null) {
            abstractC2115bF2 = abstractC2115bF;
        }
        return abstractC2115bF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object g() {
        return f24350a.get(this);
    }

    public final void c() {
        f24351b.set(this, null);
    }

    public final p019b9.AbstractC2115b f() {
        java.lang.Object objG = g();
        if (objG == p019b9.AbstractC2114a.f24349a) {
            return null;
        }
        return (p019b9.AbstractC2115b) objG;
    }

    public final p019b9.AbstractC2115b h() {
        return (p019b9.AbstractC2115b) f24351b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f24350a, this, null, p019b9.AbstractC2114a.f24349a);
    }

    public final void n() {
        java.lang.Object obj;
        if (l()) {
            return;
        }
        while (true) {
            p019b9.AbstractC2115b abstractC2115bD = d();
            p019b9.AbstractC2115b abstractC2115bE = e();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24351b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC2115bE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC2115bE, obj, ((p019b9.AbstractC2115b) obj) == null ? null : abstractC2115bD));
            if (abstractC2115bD != null) {
                f24350a.set(abstractC2115bD, abstractC2115bE);
            }
            if (!abstractC2115bE.k() || abstractC2115bE.l()) {
                if (abstractC2115bD == null || !abstractC2115bD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(p019b9.AbstractC2115b abstractC2115b) {
        return androidx.concurrent.futures.b.a(f24350a, this, null, abstractC2115b);
    }
}
