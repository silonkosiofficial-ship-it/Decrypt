package W8;

/* JADX INFO: renamed from: W8.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1793k0 extends W8.AbstractC1795l0 implements W8.X {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15510H = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.AbstractC1793k0.class, java.lang.Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15511I = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.AbstractC1793k0.class, java.lang.Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15512J = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.AbstractC1793k0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    /* JADX INFO: renamed from: W8.k0$a */
    private final class a extends W8.AbstractC1793k0.c {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final W8.InterfaceC1794l f15513E;

        public a(long j6, W8.InterfaceC1794l interfaceC1794l) {
            super(j6);
            this.f15513E = interfaceC1794l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15513E.F(W8.AbstractC1793k0.this, p087i7.M.f46721a);
        }

        @Override // W8.AbstractC1793k0.c
        public java.lang.String toString() {
            return super.toString() + this.f15513E;
        }
    }

    /* JADX INFO: renamed from: W8.k0$b */
    private static final class b extends W8.AbstractC1793k0.c {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final java.lang.Runnable f15515E;

        public b(long j6, java.lang.Runnable runnable) {
            super(j6);
            this.f15515E = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15515E.run();
        }

        @Override // W8.AbstractC1793k0.c
        public java.lang.String toString() {
            return super.toString() + this.f15515E;
        }
    }

    /* JADX INFO: renamed from: W8.k0$c */
    public static abstract class c implements java.lang.Runnable, java.lang.Comparable, W8.InterfaceC1783f0, p019b9.P {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public long f15516C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f15517D = -1;
        private volatile java.lang.Object _heap;

        public c(long j6) {
            this.f15516C = j6;
        }

        @Override // W8.InterfaceC1783f0
        public final void e() {
            synchronized (this) {
                try {
                    java.lang.Object obj = this._heap;
                    if (obj == W8.AbstractC1799n0.f15525a) {
                        return;
                    }
                    W8.AbstractC1793k0.d dVar = obj instanceof W8.AbstractC1793k0.d ? (W8.AbstractC1793k0.d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = W8.AbstractC1799n0.f15525a;
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p019b9.P
        public int getIndex() {
            return this.f15517D;
        }

        @Override // p019b9.P
        public p019b9.O i() {
            java.lang.Object obj = this._heap;
            if (obj instanceof p019b9.O) {
                return (p019b9.O) obj;
            }
            return null;
        }

        @Override // p019b9.P
        public void m(p019b9.O o6) {
            if (this._heap == W8.AbstractC1799n0.f15525a) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = o6;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(W8.AbstractC1793k0.c cVar) {
            long j6 = this.f15516C - cVar.f15516C;
            if (j6 > 0) {
                return 1;
            }
            return j6 < 0 ? -1 : 0;
        }

        public final int o(long j6, W8.AbstractC1793k0.d dVar, W8.AbstractC1793k0 abstractC1793k0) {
            synchronized (this) {
                if (this._heap == W8.AbstractC1799n0.f15525a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        W8.AbstractC1793k0.c cVar = (W8.AbstractC1793k0.c) dVar.b();
                        if (abstractC1793k0.f1()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f15518c = j6;
                        } else {
                            long j10 = cVar.f15516C;
                            if (j10 - j6 < 0) {
                                j6 = j10;
                            }
                            if (j6 - dVar.f15518c > 0) {
                                dVar.f15518c = j6;
                            }
                        }
                        long j11 = this.f15516C;
                        long j12 = dVar.f15518c;
                        if (j11 - j12 < 0) {
                            this.f15516C = j12;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean q(long j6) {
            return j6 - this.f15516C >= 0;
        }

        @Override // p019b9.P
        public void setIndex(int i6) {
            this.f15517D = i6;
        }

        public java.lang.String toString() {
            return "Delayed[nanos=" + this.f15516C + ']';
        }
    }

    /* JADX INFO: renamed from: W8.k0$d */
    public static final class d extends p019b9.O {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15518c;

        public d(long j6) {
            this.f15518c = j6;
        }
    }

    private final void P1() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15510H;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f15510H, this, null, W8.AbstractC1799n0.f15526b)) {
                    return;
                }
            } else if (obj instanceof p019b9.C2130q) {
                ((p019b9.C2130q) obj).d();
                return;
            } else {
                if (obj == W8.AbstractC1799n0.f15526b) {
                    return;
                }
                p019b9.C2130q c2130q = new p019b9.C2130q(8, true);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c2130q.a((java.lang.Runnable) obj);
                if (androidx.concurrent.futures.b.a(f15510H, this, obj, c2130q)) {
                    return;
                }
            }
        }
    }

    private final java.lang.Runnable Q1() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15510H;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof p019b9.C2130q) {
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                p019b9.C2130q c2130q = (p019b9.C2130q) obj;
                java.lang.Object objM = c2130q.m();
                if (objM != p019b9.C2130q.f24379h) {
                    return (java.lang.Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f15510H, this, obj, c2130q.l());
            } else {
                if (obj == W8.AbstractC1799n0.f15526b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f15510H, this, obj, null)) {
                    p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (java.lang.Runnable) obj;
                }
            }
        }
    }

    private final void S1() {
        p019b9.P pI;
        W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        W8.AbstractC1776c.a();
        long jNanoTime = java.lang.System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    p019b9.P pB = dVar.b();
                    pI = null;
                    if (pB != null) {
                        W8.AbstractC1793k0.c cVar = (W8.AbstractC1793k0.c) pB;
                        if (cVar.q(jNanoTime) ? T1(cVar) : false) {
                            pI = dVar.i(0);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } while (((W8.AbstractC1793k0.c) pI) != null);
    }

    private final boolean T1(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15510H;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f15510H, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof p019b9.C2130q) {
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                p019b9.C2130q c2130q = (p019b9.C2130q) obj;
                int iA = c2130q.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f15510H, this, obj, c2130q.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == W8.AbstractC1799n0.f15526b) {
                    return false;
                }
                p019b9.C2130q c2130q2 = new p019b9.C2130q(8, true);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c2130q2.a((java.lang.Runnable) obj);
                c2130q2.a(runnable);
                if (androidx.concurrent.futures.b.a(f15510H, this, obj, c2130q2)) {
                    return true;
                }
            }
        }
    }

    private final void Y1() {
        W8.AbstractC1793k0.c cVar;
        W8.AbstractC1776c.a();
        long jNanoTime = java.lang.System.nanoTime();
        while (true) {
            W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
            if (dVar == null || (cVar = (W8.AbstractC1793k0.c) dVar.j()) == null) {
                return;
            } else {
                M1(jNanoTime, cVar);
            }
        }
    }

    private final int b2(long j6, W8.AbstractC1793k0.c cVar) {
        if (f1()) {
            return 1;
        }
        W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f15511I, this, null, new W8.AbstractC1793k0.d(j6));
            java.lang.Object obj = f15511I.get(this);
            p247y7.AbstractC7350t.c(obj);
            dVar = (W8.AbstractC1793k0.d) obj;
        }
        return cVar.o(j6, dVar, this);
    }

    private final void d2(boolean z6) {
        f15512J.set(this, z6 ? 1 : 0);
    }

    private final boolean e2(W8.AbstractC1793k0.c cVar) {
        W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
        return (dVar != null ? (W8.AbstractC1793k0.c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f1() {
        return f15512J.get(this) != 0;
    }

    @Override // W8.AbstractC1791j0
    protected long D1() {
        W8.AbstractC1793k0.c cVar;
        if (super.D1() == 0) {
            return 0L;
        }
        java.lang.Object obj = f15510H.get(this);
        if (obj != null) {
            if (!(obj instanceof p019b9.C2130q)) {
                return obj == W8.AbstractC1799n0.f15526b ? Long.MAX_VALUE : 0L;
            }
            if (!((p019b9.C2130q) obj).j()) {
                return 0L;
            }
        }
        W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
        if (dVar == null || (cVar = (W8.AbstractC1793k0.c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j6 = cVar.f15516C;
        W8.AbstractC1776c.a();
        return E7.j.e(j6 - java.lang.System.nanoTime(), 0L);
    }

    @Override // W8.AbstractC1791j0
    public long I1() {
        if (J1()) {
            return 0L;
        }
        S1();
        java.lang.Runnable runnableQ1 = Q1();
        if (runnableQ1 == null) {
            return D1();
        }
        runnableQ1.run();
        return 0L;
    }

    public void R1(java.lang.Runnable runnable) {
        S1();
        if (T1(runnable)) {
            N1();
        } else {
            W8.T.f15472K.R1(runnable);
        }
    }

    protected boolean X1() {
        if (!H1()) {
            return false;
        }
        W8.AbstractC1793k0.d dVar = (W8.AbstractC1793k0.d) f15511I.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        java.lang.Object obj = f15510H.get(this);
        if (obj != null) {
            if (obj instanceof p019b9.C2130q) {
                return ((p019b9.C2130q) obj).j();
            }
            if (obj != W8.AbstractC1799n0.f15526b) {
                return false;
            }
        }
        return true;
    }

    protected final void Z1() {
        f15510H.set(this, null);
        f15511I.set(this, null);
    }

    public final void a2(long j6, W8.AbstractC1793k0.c cVar) {
        int iB2 = b2(j6, cVar);
        if (iB2 == 0) {
            if (e2(cVar)) {
                N1();
            }
        } else if (iB2 == 1) {
            M1(j6, cVar);
        } else if (iB2 != 2) {
            throw new java.lang.IllegalStateException("unexpected result".toString());
        }
    }

    protected final W8.InterfaceC1783f0 c2(long j6, java.lang.Runnable runnable) {
        long jC = W8.AbstractC1799n0.c(j6);
        if (jC >= 4611686018427387903L) {
            return W8.M0.f15460C;
        }
        W8.AbstractC1776c.a();
        long jNanoTime = java.lang.System.nanoTime();
        W8.AbstractC1793k0.b bVar = new W8.AbstractC1793k0.b(jC + jNanoTime, runnable);
        a2(jNanoTime, bVar);
        return bVar;
    }

    public W8.InterfaceC1783f0 m1(long j6, java.lang.Runnable runnable, p127m7.i iVar) {
        return W8.X.a.a(this, j6, runnable, iVar);
    }

    @Override // W8.AbstractC1791j0
    public void shutdown() {
        W8.X0.f15476a.c();
        d2(true);
        P1();
        while (I1() <= 0) {
        }
        Y1();
    }

    @Override // W8.J
    public final void t1(p127m7.i iVar, java.lang.Runnable runnable) {
        R1(runnable);
    }

    @Override // W8.X
    public void x0(long j6, W8.InterfaceC1794l interfaceC1794l) {
        long jC = W8.AbstractC1799n0.c(j6);
        if (jC < 4611686018427387903L) {
            W8.AbstractC1776c.a();
            long jNanoTime = java.lang.System.nanoTime();
            W8.AbstractC1793k0.a aVar = new W8.AbstractC1793k0.a(jC + jNanoTime, interfaceC1794l);
            a2(jNanoTime, aVar);
            W8.AbstractC1802p.a(interfaceC1794l, aVar);
        }
    }
}
