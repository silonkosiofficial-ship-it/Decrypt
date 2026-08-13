package p019b9;

/* JADX INFO: renamed from: b9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2130q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p019b9.C2130q.a f24376e = new p019b9.C2130q.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f24377f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p019b9.C2130q.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f24378g = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p019b9.C2130q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p019b9.D f24379h = new p019b9.D("REMOVE_FROZEN");
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f24383d;

    /* JADX INFO: renamed from: b9.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final int a(long j6) {
            return (j6 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j6, int i6) {
            return d(j6, 1073741823L) | ((long) i6);
        }

        public final long c(long j6, int i6) {
            return d(j6, 1152921503533105152L) | (((long) i6) << 30);
        }

        public final long d(long j6, long j10) {
            return j6 & (~j10);
        }
    }

    /* JADX INFO: renamed from: b9.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24384a;

        public b(int i6) {
            this.f24384a = i6;
        }
    }

    public C2130q(int i6, boolean z6) {
        this.f24380a = i6;
        this.f24381b = z6;
        int i10 = i6 - 1;
        this.f24382c = i10;
        this.f24383d = new java.util.concurrent.atomic.AtomicReferenceArray(i6);
        if (i10 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if ((i6 & i10) != 0) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final p019b9.C2130q b(long j6) {
        p019b9.C2130q c2130q = new p019b9.C2130q(this.f24380a * 2, this.f24381b);
        int i6 = (int) (1073741823 & j6);
        int i10 = (int) ((1152921503533105152L & j6) >> 30);
        while (true) {
            int i11 = this.f24382c;
            if ((i6 & i11) == (i11 & i10)) {
                f24378g.set(c2130q, f24376e.d(j6, 1152921504606846976L));
                return c2130q;
            }
            java.lang.Object bVar = f().get(this.f24382c & i6);
            if (bVar == null) {
                bVar = new p019b9.C2130q.b(i6);
            }
            c2130q.f().set(c2130q.f24382c & i6, bVar);
            i6++;
        }
    }

    private final p019b9.C2130q c(long j6) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24377f;
        while (true) {
            p019b9.C2130q c2130q = (p019b9.C2130q) atomicReferenceFieldUpdater.get(this);
            if (c2130q != null) {
                return c2130q;
            }
            androidx.concurrent.futures.b.a(f24377f, this, null, b(j6));
        }
    }

    private final p019b9.C2130q e(int i6, java.lang.Object obj) {
        java.lang.Object obj2 = f().get(this.f24382c & i6);
        if (!(obj2 instanceof p019b9.C2130q.b) || ((p019b9.C2130q.b) obj2).f24384a != i6) {
            return null;
        }
        f().set(i6 & this.f24382c, obj);
        return this;
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f() {
        return this.f24383d;
    }

    private final long k() {
        long j6;
        long j10;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f24378g;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                return j6;
            }
            j10 = j6 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j10));
        return j10;
    }

    private final p019b9.C2130q n(int i6, int i10) {
        long j6;
        int i11;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f24378g;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            i11 = (int) (1073741823 & j6);
            if ((1152921504606846976L & j6) != 0) {
                return l();
            }
        } while (!f24378g.compareAndSet(this, j6, f24376e.b(j6, i10)));
        f().set(this.f24382c & i11, null);
        return null;
    }

    public final int a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f24378g;
        while (true) {
            long j6 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j6) != 0) {
                return f24376e.a(j6);
            }
            int i6 = (int) (1073741823 & j6);
            int i10 = (int) ((1152921503533105152L & j6) >> 30);
            int i11 = this.f24382c;
            if (((i10 + 2) & i11) == (i6 & i11)) {
                return 1;
            }
            if (!this.f24381b && f().get(i10 & i11) != null) {
                int i12 = this.f24380a;
                if (i12 < 1024 || ((i10 - i6) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            } else if (f24378g.compareAndSet(this, j6, f24376e.c(j6, (i10 + 1) & 1073741823))) {
                f().set(i10 & i11, obj);
                p019b9.C2130q c2130qE = this;
                while ((f24378g.get(c2130qE) & 1152921504606846976L) != 0 && (c2130qE = c2130qE.l().e(i10, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j6;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f24378g;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j6 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j6 = f24378g.get(this);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    public final boolean j() {
        long j6 = f24378g.get(this);
        return ((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30));
    }

    public final p019b9.C2130q l() {
        return c(k());
    }

    public final java.lang.Object m() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f24378g;
        while (true) {
            long j6 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j6) != 0) {
                return f24379h;
            }
            int i6 = (int) (1073741823 & j6);
            int i10 = this.f24382c;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i10) == (i10 & i6)) {
                return null;
            }
            java.lang.Object obj = f().get(this.f24382c & i6);
            if (obj == null) {
                if (this.f24381b) {
                    return null;
                }
            } else {
                if (obj instanceof p019b9.C2130q.b) {
                    return null;
                }
                int i11 = (i6 + 1) & 1073741823;
                if (f24378g.compareAndSet(this, j6, f24376e.b(j6, i11))) {
                    f().set(this.f24382c & i6, null);
                    return obj;
                }
                if (this.f24381b) {
                    p019b9.C2130q c2130qN = this;
                    do {
                        c2130qN = c2130qN.n(i6, i11);
                    } while (c2130qN != null);
                    return obj;
                }
            }
        }
    }
}
