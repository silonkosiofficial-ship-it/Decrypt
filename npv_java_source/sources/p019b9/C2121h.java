package p019b9;

/* JADX INFO: renamed from: b9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2121h extends W8.AbstractC1773a0 implements p147o7.e, p127m7.e {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24355J = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2121h.class, java.lang.Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final W8.J f24356F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p127m7.e f24357G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public java.lang.Object f24358H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final java.lang.Object f24359I;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    public C2121h(W8.J j6, p127m7.e eVar) {
        super(-1);
        this.f24356F = j6;
        this.f24357G = eVar;
        this.f24358H = p019b9.AbstractC2122i.f24360a;
        this.f24359I = p019b9.K.g(getContext());
    }

    private final W8.C1798n n() {
        java.lang.Object obj = f24355J.get(this);
        if (obj instanceof W8.C1798n) {
            return (W8.C1798n) obj;
        }
        return null;
    }

    @Override // W8.AbstractC1773a0
    public p127m7.e c() {
        return this;
    }

    @Override // p147o7.e
    public p147o7.e e() {
        p127m7.e eVar = this.f24357G;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return this.f24357G.getContext();
    }

    @Override // W8.AbstractC1773a0
    public java.lang.Object i() {
        java.lang.Object obj = this.f24358H;
        this.f24358H = p019b9.AbstractC2122i.f24360a;
        return obj;
    }

    public final void j() {
        while (f24355J.get(this) == p019b9.AbstractC2122i.f24361b) {
        }
    }

    public final W8.C1798n l() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24355J;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f24355J.set(this, p019b9.AbstractC2122i.f24361b);
                return null;
            }
            if (obj instanceof W8.C1798n) {
                if (androidx.concurrent.futures.b.a(f24355J, this, obj, p019b9.AbstractC2122i.f24361b)) {
                    return (W8.C1798n) obj;
                }
            } else if (obj != p019b9.AbstractC2122i.f24361b && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(p127m7.i iVar, java.lang.Object obj) {
        this.f24358H = obj;
        this.f15482E = 1;
        this.f24356F.u1(iVar, this);
    }

    public final boolean p() {
        return f24355J.get(this) != null;
    }

    public final boolean q(java.lang.Throwable th) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24355J;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            p019b9.D d6 = p019b9.AbstractC2122i.f24361b;
            if (p247y7.AbstractC7350t.b(obj, d6)) {
                if (androidx.concurrent.futures.b.a(f24355J, this, d6, th)) {
                    return true;
                }
            } else {
                if (obj instanceof java.lang.Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f24355J, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        W8.C1798n c1798nN = n();
        if (c1798nN != null) {
            c1798nN.q();
        }
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        java.lang.Object objB = W8.C.b(obj);
        if (this.f24356F.v1(getContext())) {
            this.f24358H = objB;
            this.f15482E = 0;
            this.f24356F.t1(getContext(), this);
            return;
        }
        W8.AbstractC1791j0 abstractC1791j0B = W8.X0.f15476a.b();
        if (abstractC1791j0B.G1()) {
            this.f24358H = objB;
            this.f15482E = 0;
            abstractC1791j0B.C1(this);
            return;
        }
        abstractC1791j0B.E1(true);
        try {
            p127m7.i context = getContext();
            java.lang.Object objI = p019b9.K.i(context, this.f24359I);
            try {
                this.f24357G.t(obj);
                p087i7.M m6 = p087i7.M.f46721a;
                p019b9.K.f(context, objI);
                while (abstractC1791j0B.J1()) {
                }
            } catch (java.lang.Throwable th) {
                p019b9.K.f(context, objI);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                h(th2);
            } finally {
                abstractC1791j0B.z1(true);
            }
        }
    }

    public java.lang.String toString() {
        return "DispatchedContinuation[" + this.f24356F + ", " + W8.S.c(this.f24357G) + ']';
    }

    public final java.lang.Throwable u(W8.InterfaceC1794l interfaceC1794l) {
        p019b9.D d6;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24355J;
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            d6 = p019b9.AbstractC2122i.f24361b;
            if (obj != d6) {
                if (obj instanceof java.lang.Throwable) {
                    if (androidx.concurrent.futures.b.a(f24355J, this, obj, null)) {
                        return (java.lang.Throwable) obj;
                    }
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f24355J, this, d6, interfaceC1794l));
        return null;
    }
}
