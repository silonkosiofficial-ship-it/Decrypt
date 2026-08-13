package p059f9;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f45410c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p059f9.i.class, java.lang.Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f45411d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p059f9.i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f45412e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p059f9.i.class, java.lang.Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f45413f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p059f9.i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f45414g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p059f9.i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.q f45416b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final f9.i.a f45417L = new f9.i.a();

        a() {
            super(2, p059f9.j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final p059f9.k s(long j6, p059f9.k kVar) {
            return p059f9.j.h(j6, kVar);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s(((java.lang.Number) obj).longValue(), (p059f9.k) obj2);
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final f9.i.b f45418L = new f9.i.b();

        b() {
            super(2, p059f9.j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final p059f9.k s(long j6, p059f9.k kVar) {
            return p059f9.j.h(j6, kVar);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return s(((java.lang.Number) obj).longValue(), (p059f9.k) obj2);
        }
    }

    public i(int i6, int i10) {
        this.f45415a = i6;
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i6).toString());
        }
        if (i10 < 0 || i10 > i6) {
            throw new java.lang.IllegalArgumentException(("The number of acquired permits should be in 0.." + i6).toString());
        }
        p059f9.k kVar = new p059f9.k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i6 - i10;
        this.f45416b = new p237x7.q() { // from class: f9.h
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return p059f9.i.p(this.f45409C, (java.lang.Throwable) obj, (p087i7.M) obj2, (p127m7.i) obj3);
            }
        };
    }

    private final boolean g(W8.e1 e1Var) {
        java.lang.Object objC;
        p059f9.k kVar = (p059f9.k) f45412e.get(this);
        long andIncrement = f45413f.getAndIncrement(this);
        f9.i.a aVar = f9.i.a.f45417L;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45412e;
        long j6 = andIncrement / ((long) p059f9.j.f45424f);
        loop0: while (true) {
            objC = p019b9.AbstractC2114a.c(kVar, j6, aVar);
            if (!p019b9.B.c(objC)) {
                p019b9.A aB = p019b9.B.b(objC);
                while (true) {
                    p019b9.A a6 = (p019b9.A) atomicReferenceFieldUpdater.get(this);
                    if (a6.f24329c >= aB.f24329c) {
                        break loop0;
                    }
                    if (!aB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a6, aB)) {
                        if (!a6.p()) {
                            break loop0;
                        }
                        a6.n();
                        break loop0;
                    }
                    if (aB.p()) {
                        aB.n();
                    }
                }
            } else {
                break;
            }
        }
        p059f9.k kVar2 = (p059f9.k) p019b9.B.b(objC);
        int i6 = (int) (andIncrement % ((long) p059f9.j.f45424f));
        if (Y8.o.a(kVar2.v(), i6, null, e1Var)) {
            e1Var.b(kVar2, i6);
            return true;
        }
        if (!Y8.o.a(kVar2.v(), i6, p059f9.j.f45420b, p059f9.j.f45421c)) {
            return false;
        }
        if (e1Var instanceof W8.InterfaceC1794l) {
            p247y7.AbstractC7350t.d(e1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((W8.InterfaceC1794l) e1Var).C(p087i7.M.f46721a, this.f45416b);
            return true;
        }
        throw new java.lang.IllegalStateException(("unexpected: " + e1Var).toString());
    }

    private final void h() {
        int i6;
        do {
            i6 = f45414g.get(this);
            if (i6 <= this.f45415a) {
                return;
            }
        } while (!f45414g.compareAndSet(this, i6, this.f45415a));
    }

    private final int i() {
        int andDecrement;
        do {
            andDecrement = f45414g.getAndDecrement(this);
        } while (andDecrement > this.f45415a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M p(p059f9.i iVar, java.lang.Throwable th, p087i7.M m6, p127m7.i iVar2) {
        iVar.q();
        return p087i7.M.f46721a;
    }

    private final boolean s(java.lang.Object obj) {
        if (!(obj instanceof W8.InterfaceC1794l)) {
            throw new java.lang.IllegalStateException(("unexpected: " + obj).toString());
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        W8.InterfaceC1794l interfaceC1794l = (W8.InterfaceC1794l) obj;
        java.lang.Object objS = interfaceC1794l.s(p087i7.M.f46721a, null, this.f45416b);
        if (objS == null) {
            return false;
        }
        interfaceC1794l.J(objS);
        return true;
    }

    private final boolean t() {
        java.lang.Object objC;
        p059f9.k kVar = (p059f9.k) f45410c.get(this);
        long andIncrement = f45411d.getAndIncrement(this);
        long j6 = andIncrement / ((long) p059f9.j.f45424f);
        f9.i.b bVar = f9.i.b.f45418L;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45410c;
        loop0: while (true) {
            objC = p019b9.AbstractC2114a.c(kVar, j6, bVar);
            if (p019b9.B.c(objC)) {
                break;
            }
            p019b9.A aB = p019b9.B.b(objC);
            while (true) {
                p019b9.A a6 = (p019b9.A) atomicReferenceFieldUpdater.get(this);
                if (a6.f24329c >= aB.f24329c) {
                    break loop0;
                }
                if (!aB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a6, aB)) {
                    if (!a6.p()) {
                        break loop0;
                    }
                    a6.n();
                    break loop0;
                }
                if (aB.p()) {
                    aB.n();
                }
            }
        }
        p059f9.k kVar2 = (p059f9.k) p019b9.B.b(objC);
        kVar2.c();
        if (kVar2.f24329c > j6) {
            return false;
        }
        int i6 = (int) (andIncrement % ((long) p059f9.j.f45424f));
        java.lang.Object andSet = kVar2.v().getAndSet(i6, p059f9.j.f45420b);
        if (andSet != null) {
            if (andSet == p059f9.j.f45423e) {
                return false;
            }
            return s(andSet);
        }
        int i10 = p059f9.j.f45419a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (kVar2.v().get(i6) == p059f9.j.f45421c) {
                return true;
            }
        }
        return !Y8.o.a(kVar2.v(), i6, p059f9.j.f45420b, p059f9.j.f45422d);
    }

    protected final void f(W8.InterfaceC1794l interfaceC1794l) {
        while (i() <= 0) {
            p247y7.AbstractC7350t.d(interfaceC1794l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((W8.e1) interfaceC1794l)) {
                return;
            }
        }
        interfaceC1794l.C(p087i7.M.f46721a, this.f45416b);
    }

    public final int j() {
        return java.lang.Math.max(f45414g.get(this), 0);
    }

    public final void q() {
        do {
            int andIncrement = f45414g.getAndIncrement(this);
            if (andIncrement >= this.f45415a) {
                h();
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + this.f45415a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!t());
    }

    public final boolean r() {
        while (true) {
            int i6 = f45414g.get(this);
            if (i6 > this.f45415a) {
                h();
            } else {
                if (i6 <= 0) {
                    return false;
                }
                if (f45414g.compareAndSet(this, i6, i6 - 1)) {
                    return true;
                }
            }
        }
    }
}
