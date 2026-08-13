package Y8;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Y8.j {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f16507F = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Y8.h.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f16508G = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Y8.h.class, "receivers$volatile");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f16509H = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Y8.h.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f16510I = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(Y8.h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16511J = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Y8.h.class, java.lang.Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16512K = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Y8.h.class, java.lang.Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16513L = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Y8.h.class, java.lang.Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16514M = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Y8.h.class, java.lang.Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16515N = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Y8.h.class, java.lang.Object.class, "closeHandler$volatile");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f16516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p237x7.l f16517D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.q f16518E;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements Y8.l, W8.e1 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.Object f16519C = Y8.i.f16547p;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private W8.C1798n f16520D;

        public a() {
        }

        private final java.lang.Object f(Y8.p pVar, int i6, long j6, p127m7.e eVar) {
            java.lang.Boolean boolA;
            Y8.h hVar = Y8.h.this;
            W8.C1798n c1798nB = W8.AbstractC1802p.b(p137n7.b.d(eVar));
            try {
                this.f16520D = c1798nB;
                java.lang.Object objH1 = hVar.h1(pVar, i6, j6, this);
                if (objH1 != Y8.i.f16544m) {
                    p237x7.q qVarI = null;
                    if (objH1 == Y8.i.f16546o) {
                        if (j6 < hVar.l0()) {
                            pVar.c();
                        }
                        Y8.p pVar2 = (Y8.p) Y8.h.f0().get(hVar);
                        while (true) {
                            if (hVar.u0()) {
                                h();
                                break;
                            }
                            long andIncrement = Y8.h.g0().getAndIncrement(hVar);
                            int i10 = Y8.i.f16533b;
                            long j10 = andIncrement / ((long) i10);
                            int i11 = (int) (andIncrement % ((long) i10));
                            if (pVar2.f24329c != j10) {
                                Y8.p pVarW = hVar.W(j10, pVar2);
                                if (pVarW != null) {
                                    pVar2 = pVarW;
                                }
                            }
                            java.lang.Object objH2 = hVar.h1(pVar2, i11, andIncrement, this);
                            if (objH2 == Y8.i.f16544m) {
                                hVar.P0(this, pVar2, i11);
                                break;
                            }
                            if (objH2 == Y8.i.f16546o) {
                                if (andIncrement < hVar.l0()) {
                                    pVar2.c();
                                }
                            } else {
                                if (objH2 == Y8.i.f16545n) {
                                    throw new java.lang.IllegalStateException("unexpected".toString());
                                }
                                pVar2.c();
                                this.f16519C = objH2;
                                this.f16520D = null;
                                boolA = p147o7.b.a(true);
                                p237x7.l lVar = hVar.f16517D;
                                if (lVar != null) {
                                    qVarI = hVar.I(lVar, objH2);
                                }
                            }
                        }
                    } else {
                        pVar.c();
                        this.f16519C = objH1;
                        this.f16520D = null;
                        boolA = p147o7.b.a(true);
                        p237x7.l lVar2 = hVar.f16517D;
                        if (lVar2 != null) {
                            qVarI = hVar.I(lVar2, objH1);
                        }
                    }
                    c1798nB.C(boolA, qVarI);
                    break;
                }
                hVar.P0(this, pVar, i6);
                java.lang.Object objX = c1798nB.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(eVar);
                }
                return objX;
            } catch (java.lang.Throwable th) {
                c1798nB.Q();
                throw th;
            }
        }

        private final boolean g() throws java.lang.Throwable {
            this.f16519C = Y8.i.z();
            java.lang.Throwable thB0 = Y8.h.this.b0();
            if (thB0 == null) {
                return false;
            }
            throw p019b9.C.a(thB0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            java.lang.Object objA;
            W8.C1798n c1798n = this.f16520D;
            p247y7.AbstractC7350t.c(c1798n);
            this.f16520D = null;
            this.f16519C = Y8.i.z();
            java.lang.Throwable thB0 = Y8.h.this.b0();
            if (thB0 == null) {
                i7.w.a aVar = p087i7.w.f46751D;
                objA = java.lang.Boolean.FALSE;
            } else {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objA = p087i7.x.a(thB0);
            }
            c1798n.t(p087i7.w.b(objA));
        }

        @Override // Y8.l
        public java.lang.Object a(p127m7.e eVar) throws java.lang.Throwable {
            boolean zG = true;
            if (this.f16519C == Y8.i.f16547p || this.f16519C == Y8.i.z()) {
                Y8.h hVar = Y8.h.this;
                Y8.p pVar = (Y8.p) Y8.h.f0().get(hVar);
                while (!hVar.u0()) {
                    long andIncrement = Y8.h.g0().getAndIncrement(hVar);
                    int i6 = Y8.i.f16533b;
                    long j6 = andIncrement / ((long) i6);
                    int i10 = (int) (andIncrement % ((long) i6));
                    if (pVar.f24329c != j6) {
                        Y8.p pVarW = hVar.W(j6, pVar);
                        if (pVarW == null) {
                            continue;
                        } else {
                            pVar = pVarW;
                        }
                    }
                    java.lang.Object objH1 = hVar.h1(pVar, i10, andIncrement, null);
                    if (objH1 == Y8.i.f16544m) {
                        throw new java.lang.IllegalStateException("unreachable".toString());
                    }
                    if (objH1 == Y8.i.f16546o) {
                        if (andIncrement < hVar.l0()) {
                            pVar.c();
                        }
                    } else {
                        if (objH1 == Y8.i.f16545n) {
                            return f(pVar, i10, andIncrement, eVar);
                        }
                        pVar.c();
                        this.f16519C = objH1;
                    }
                }
                zG = g();
            }
            return p147o7.b.a(zG);
        }

        @Override // W8.e1
        public void b(p019b9.A a6, int i6) {
            W8.C1798n c1798n = this.f16520D;
            if (c1798n != null) {
                c1798n.b(a6, i6);
            }
        }

        public final boolean i(java.lang.Object obj) {
            W8.C1798n c1798n = this.f16520D;
            p247y7.AbstractC7350t.c(c1798n);
            this.f16520D = null;
            this.f16519C = obj;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            Y8.h hVar = Y8.h.this;
            p237x7.l lVar = hVar.f16517D;
            return Y8.i.B(c1798n, bool, lVar != null ? hVar.I(lVar, obj) : null);
        }

        public final void j() {
            java.lang.Object objA;
            W8.C1798n c1798n = this.f16520D;
            p247y7.AbstractC7350t.c(c1798n);
            this.f16520D = null;
            this.f16519C = Y8.i.z();
            java.lang.Throwable thB0 = Y8.h.this.b0();
            if (thB0 == null) {
                i7.w.a aVar = p087i7.w.f46751D;
                objA = java.lang.Boolean.FALSE;
            } else {
                i7.w.a aVar2 = p087i7.w.f46751D;
                objA = p087i7.x.a(thB0);
            }
            c1798n.t(p087i7.w.b(objA));
        }

        @Override // Y8.l
        public java.lang.Object next() throws java.lang.Throwable {
            java.lang.Object obj = this.f16519C;
            if (obj == Y8.i.f16547p) {
                throw new java.lang.IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f16519C = Y8.i.f16547p;
            if (obj != Y8.i.z()) {
                return obj;
            }
            throw p019b9.C.a(Y8.h.this.e0());
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.q {
        b(java.lang.Object obj) {
            super(3, obj, Y8.h.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            s((java.lang.Throwable) obj, obj2, (p127m7.i) obj3);
            return p087i7.M.f46721a;
        }

        public final void s(java.lang.Throwable th, java.lang.Object obj, p127m7.i iVar) {
            ((Y8.h) this.f57287D).F0(th, obj, iVar);
        }
    }

    /* synthetic */ class c extends p247y7.C7348q implements p237x7.q {
        c(java.lang.Object obj) {
            super(3, obj, Y8.h.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            s((java.lang.Throwable) obj, ((Y8.n) obj2).l(), (p127m7.i) obj3);
            return p087i7.M.f46721a;
        }

        public final void s(java.lang.Throwable th, java.lang.Object obj, p127m7.i iVar) {
            ((Y8.h) this.f57287D).E0(th, obj, iVar);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16522F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f16524H;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16522F = obj;
            this.f16524H |= Integer.MIN_VALUE;
            java.lang.Object objS0 = Y8.h.S0(Y8.h.this, this);
            return objS0 == p137n7.b.g() ? objS0 : Y8.n.b(objS0);
        }
    }

    static final class e extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16525F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16526G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f16527H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        long f16528I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16529J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f16531L;

        e(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16529J = obj;
            this.f16531L |= Integer.MIN_VALUE;
            java.lang.Object objT0 = Y8.h.this.T0(null, 0, 0L, this);
            return objT0 == p137n7.b.g() ? objT0 : Y8.n.b(objT0);
        }
    }

    public h(int i6, p237x7.l lVar) {
        this.f16516C = i6;
        this.f16517D = lVar;
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("Invalid channel capacity: " + i6 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = Y8.i.A(i6);
        this.completedExpandBuffersAndPauseFlag$volatile = Z();
        Y8.p pVar = new Y8.p(0L, null, this, 3);
        this.sendSegment$volatile = pVar;
        this.receiveSegment$volatile = pVar;
        if (y0()) {
            pVar = Y8.i.f16532a;
            p247y7.AbstractC7350t.d(pVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar;
        this.f16518E = lVar != null ? new p237x7.q() { // from class: Y8.e
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                Y8.h hVar = this.f16502C;
                androidx.appcompat.app.D.a(obj);
                return Y8.h.N0(hVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = Y8.i.f16550s;
    }

    private final void A0() {
        long j6;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16507F;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, Y8.i.w(1152921504606846975L & j6, 1)));
    }

    private final void B0() {
        long j6;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16507F;
        do {
            j6 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, Y8.i.w(1152921504606846975L & j6, 3)));
    }

    private final void C0() {
        long j6;
        long j10;
        int i6;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16507F;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j6 >> 60);
            if (i10 == 0) {
                j10 = j6 & 1152921504606846975L;
                i6 = 2;
            } else {
                if (i10 != 1) {
                    return;
                }
                j10 = j6 & 1152921504606846975L;
                i6 = 3;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, Y8.i.w(j10, i6)));
    }

    private final void D0(long j6, Y8.p pVar) {
        Y8.p pVar2;
        Y8.p pVar3;
        while (pVar.f24329c < j6 && (pVar3 = (Y8.p) pVar.f()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.k() || (pVar2 = (Y8.p) pVar.f()) == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16513L;
                while (true) {
                    p019b9.A a6 = (p019b9.A) atomicReferenceFieldUpdater.get(this);
                    if (a6.f24329c >= pVar.f24329c) {
                        return;
                    }
                    if (!pVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a6, pVar)) {
                        if (a6.p()) {
                            a6.n();
                            return;
                        }
                        return;
                    } else if (pVar.p()) {
                        pVar.n();
                    }
                }
            } else {
                pVar = pVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(java.lang.Throwable th, java.lang.Object obj, p127m7.i iVar) {
        p237x7.l lVar = this.f16517D;
        p247y7.AbstractC7350t.c(lVar);
        java.lang.Object objF = Y8.n.f(obj);
        p247y7.AbstractC7350t.c(objF);
        p019b9.w.a(lVar, objF, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(java.lang.Throwable th, java.lang.Object obj, p127m7.i iVar) {
        p237x7.l lVar = this.f16517D;
        p247y7.AbstractC7350t.c(lVar);
        p019b9.w.a(lVar, obj, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F7.f H(p237x7.l lVar) {
        return new Y8.h.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(W8.InterfaceC1794l interfaceC1794l) {
        i7.w.a aVar = p087i7.w.f46751D;
        interfaceC1794l.t(p087i7.w.b(Y8.n.b(Y8.n.f16556b.a(b0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p237x7.q I(final p237x7.l lVar, final java.lang.Object obj) {
        return new p237x7.q() { // from class: Y8.f
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return Y8.h.J(lVar, obj, (java.lang.Throwable) obj2, obj3, (p127m7.i) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(W8.InterfaceC1794l interfaceC1794l) {
        i7.w.a aVar = p087i7.w.f46751D;
        interfaceC1794l.t(p087i7.w.b(p087i7.x.a(e0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M J(p237x7.l lVar, java.lang.Object obj, java.lang.Throwable th, java.lang.Object obj2, p127m7.i iVar) {
        p019b9.w.a(lVar, obj, iVar);
        return p087i7.M.f46721a;
    }

    private final java.lang.Object J0(java.lang.Object obj, p127m7.e eVar) {
        java.lang.Throwable thI0;
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        p237x7.l lVar = this.f16517D;
        if (lVar == null || (thI0 = p019b9.w.c(lVar, obj, null, 2, null)) == null) {
            thI0 = i0();
        } else {
            p087i7.AbstractC6661g.a(thI0, i0());
        }
        i7.w.a aVar = p087i7.w.f46751D;
        c1798n.t(p087i7.w.b(p087i7.x.a(thI0)));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F7.f K(p237x7.l lVar) {
        return new Y8.h.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(java.lang.Object obj, W8.InterfaceC1794l interfaceC1794l) {
        p237x7.l lVar = this.f16517D;
        if (lVar != null) {
            p019b9.w.a(lVar, obj, interfaceC1794l.getContext());
        }
        java.lang.Throwable thI0 = i0();
        i7.w.a aVar = p087i7.w.f46751D;
        interfaceC1794l.t(p087i7.w.b(p087i7.x.a(thI0)));
    }

    private final boolean L(long j6) {
        return j6 < Z() || j6 < h0() + ((long) this.f16516C);
    }

    private final void N(Y8.p pVar, long j6) {
        java.lang.Object objB = p019b9.AbstractC2123j.b(null, 1, null);
        loop0: while (pVar != null) {
            for (int i6 = Y8.i.f16533b - 1; -1 < i6; i6--) {
                if ((pVar.f24329c * ((long) Y8.i.f16533b)) + ((long) i6) < j6) {
                    break loop0;
                }
                while (true) {
                    java.lang.Object objB2 = pVar.B(i6);
                    if (objB2 != null && objB2 != Y8.i.f16536e) {
                        if (!(objB2 instanceof Y8.D)) {
                            if (!(objB2 instanceof W8.e1)) {
                                break;
                            }
                            if (pVar.v(i6, objB2, Y8.i.z())) {
                                objB = p019b9.AbstractC2123j.c(objB, objB2);
                                pVar.C(i6, true);
                                break;
                                break;
                            }
                        } else {
                            if (pVar.v(i6, objB2, Y8.i.z())) {
                                objB2 = ((Y8.D) objB2).f16496a;
                                objB = p019b9.AbstractC2123j.c(objB, objB2);
                                pVar.C(i6, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar.v(i6, objB2, Y8.i.z())) {
                            pVar.t();
                            break;
                        }
                    }
                }
            }
            pVar = (Y8.p) pVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof java.util.ArrayList)) {
                W0((W8.e1) objB);
                return;
            }
            p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            java.util.ArrayList arrayList = (java.util.ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                W0((W8.e1) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.q N0(final Y8.h hVar, final p049e9.a aVar, java.lang.Object obj, final java.lang.Object obj2) {
        return new p237x7.q(obj2, hVar, aVar) { // from class: Y8.g

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public final /* synthetic */ java.lang.Object f16505C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public final /* synthetic */ Y8.h f16506D;

            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return Y8.h.O0(this.f16505C, this.f16506D, null, (java.lang.Throwable) obj3, obj4, (p127m7.i) obj5);
            }
        };
    }

    private final Y8.p O() {
        java.lang.Object obj = f16513L.get(this);
        Y8.p pVar = (Y8.p) f16511J.get(this);
        if (pVar.f24329c > ((Y8.p) obj).f24329c) {
            obj = pVar;
        }
        Y8.p pVar2 = (Y8.p) f16512K.get(this);
        if (pVar2.f24329c > ((Y8.p) obj).f24329c) {
            obj = pVar2;
        }
        return (Y8.p) p019b9.AbstractC2114a.b((p019b9.AbstractC2115b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M O0(java.lang.Object obj, Y8.h hVar, p049e9.a aVar, java.lang.Throwable th, java.lang.Object obj2, p127m7.i iVar) {
        if (obj != Y8.i.z()) {
            p019b9.w.a(hVar.f16517D, obj, aVar.getContext());
        }
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(W8.e1 e1Var, Y8.p pVar, int i6) {
        M0();
        e1Var.b(pVar, i6);
    }

    private final void Q(long j6) {
        V0(R(j6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(W8.e1 e1Var, Y8.p pVar, int i6) {
        e1Var.b(pVar, i6 + Y8.i.f16533b);
    }

    private final Y8.p R(long j6) {
        Y8.p pVarO = O();
        if (x0()) {
            long jZ0 = z0(pVarO);
            if (jZ0 != -1) {
                T(jZ0);
            }
        }
        N(pVarO, j6);
        return pVarO;
    }

    static /* synthetic */ java.lang.Object R0(Y8.h hVar, p127m7.e eVar) throws java.lang.Throwable {
        Y8.p pVar = (Y8.p) f0().get(hVar);
        while (!hVar.u0()) {
            long andIncrement = g0().getAndIncrement(hVar);
            int i6 = Y8.i.f16533b;
            long j6 = andIncrement / ((long) i6);
            int i10 = (int) (andIncrement % ((long) i6));
            if (pVar.f24329c != j6) {
                Y8.p pVarW = hVar.W(j6, pVar);
                if (pVarW == null) {
                    continue;
                } else {
                    pVar = pVarW;
                }
            }
            java.lang.Object objH1 = hVar.h1(pVar, i10, andIncrement, null);
            if (objH1 == Y8.i.f16544m) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (objH1 != Y8.i.f16546o) {
                if (objH1 == Y8.i.f16545n) {
                    return hVar.U0(pVar, i10, andIncrement, eVar);
                }
                pVar.c();
                return objH1;
            }
            if (andIncrement < hVar.l0()) {
                pVar.c();
            }
        }
        throw p019b9.C.a(hVar.e0());
    }

    private final void S() {
        m();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    static /* synthetic */ java.lang.Object S0(Y8.h hVar, p127m7.e eVar) {
        Y8.h.d dVar;
        if (eVar instanceof Y8.h.d) {
            dVar = (Y8.h.d) eVar;
            int i6 = dVar.f16524H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f16524H = i6 - Integer.MIN_VALUE;
            } else {
                dVar = hVar.new d(eVar);
            }
        } else {
            dVar = hVar.new d(eVar);
        }
        Y8.h.d dVar2 = dVar;
        java.lang.Object obj = dVar2.f16522F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar2.f16524H;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return ((Y8.n) obj).l();
        }
        p087i7.x.b(obj);
        Y8.p pVar = (Y8.p) f0().get(hVar);
        while (!hVar.u0()) {
            long andIncrement = g0().getAndIncrement(hVar);
            int i11 = Y8.i.f16533b;
            long j6 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (pVar.f24329c != j6) {
                Y8.p pVarW = hVar.W(j6, pVar);
                if (pVarW == null) {
                    continue;
                } else {
                    pVar = pVarW;
                }
            }
            java.lang.Object objH1 = hVar.h1(pVar, i12, andIncrement, null);
            if (objH1 == Y8.i.f16544m) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (objH1 != Y8.i.f16546o) {
                if (objH1 != Y8.i.f16545n) {
                    pVar.c();
                    return Y8.n.f16556b.c(objH1);
                }
                dVar2.f16524H = 1;
                java.lang.Object objT0 = hVar.T0(pVar, i12, andIncrement, dVar2);
                return objT0 == objG ? objG : objT0;
            }
            if (andIncrement < hVar.l0()) {
                pVar.c();
            }
        }
        return Y8.n.f16556b.a(hVar.b0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object T0(Y8.p pVar, int i6, long j6, p127m7.e eVar) {
        Y8.h.e eVar2;
        Y8.n nVarB;
        p237x7.q qVar;
        if (eVar instanceof Y8.h.e) {
            eVar2 = (Y8.h.e) eVar;
            int i10 = eVar2.f16531L;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f16531L = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new Y8.h.e(eVar);
            }
        } else {
            eVar2 = new Y8.h.e(eVar);
        }
        java.lang.Object objX = eVar2.f16529J;
        java.lang.Object objG = p137n7.b.g();
        int i11 = eVar2.f16531L;
        if (i11 == 0) {
            p087i7.x.b(objX);
            eVar2.f16525F = this;
            eVar2.f16526G = pVar;
            eVar2.f16527H = i6;
            eVar2.f16528I = j6;
            eVar2.f16531L = 1;
            W8.C1798n c1798nB = W8.AbstractC1802p.b(p137n7.b.d(eVar2));
            try {
                p247y7.AbstractC7350t.d(c1798nB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                Y8.A a6 = new Y8.A(c1798nB);
                java.lang.Object objH1 = h1(pVar, i6, j6, a6);
                if (objH1 != Y8.i.f16544m) {
                    if (objH1 == Y8.i.f16546o) {
                        if (j6 < l0()) {
                            pVar.c();
                        }
                        Y8.p pVar2 = (Y8.p) f0().get(this);
                        while (true) {
                            if (u0()) {
                                H0(c1798nB);
                                break;
                            }
                            long andIncrement = g0().getAndIncrement(this);
                            int i12 = Y8.i.f16533b;
                            long j10 = andIncrement / ((long) i12);
                            int i13 = (int) (andIncrement % ((long) i12));
                            if (pVar2.f24329c != j10) {
                                Y8.p pVarW = W(j10, pVar2);
                                if (pVarW != null) {
                                    pVar2 = pVarW;
                                }
                            }
                            java.lang.Object objH2 = h1(pVar2, i13, andIncrement, a6);
                            if (objH2 == Y8.i.f16544m) {
                                P0(a6, pVar2, i13);
                                break;
                            }
                            if (objH2 == Y8.i.f16546o) {
                                if (andIncrement < l0()) {
                                    pVar2.c();
                                }
                            } else {
                                if (objH2 == Y8.i.f16545n) {
                                    throw new java.lang.IllegalStateException("unexpected".toString());
                                }
                                pVar2.c();
                                nVarB = Y8.n.b(Y8.n.f16556b.c(objH2));
                                p237x7.l lVar = this.f16517D;
                                qVar = (p237x7.q) (lVar != null ? K(lVar) : null);
                            }
                        }
                    } else {
                        pVar.c();
                        nVarB = Y8.n.b(Y8.n.f16556b.c(objH1));
                        p237x7.l lVar2 = this.f16517D;
                        qVar = (p237x7.q) (lVar2 != null ? K(lVar2) : null);
                    }
                    c1798nB.C(nVarB, qVar);
                    break;
                }
                P0(a6, pVar, i6);
                objX = c1798nB.x();
                if (objX == p137n7.b.g()) {
                    p147o7.h.c(eVar2);
                }
                if (objX == objG) {
                    return objG;
                }
            } catch (java.lang.Throwable th) {
                c1798nB.Q();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(objX);
        }
        return ((Y8.n) objX).l();
    }

    private final void U() {
        if (y0()) {
            return;
        }
        Y8.p pVar = (Y8.p) f16513L.get(this);
        while (true) {
            long andIncrement = f16509H.getAndIncrement(this);
            int i6 = Y8.i.f16533b;
            long j6 = andIncrement / ((long) i6);
            long jL0 = l0();
            long j10 = pVar.f24329c;
            if (jL0 <= andIncrement) {
                if (j10 < j6 && pVar.f() != null) {
                    D0(j6, pVar);
                }
                p0(this, 0L, 1, null);
                return;
            }
            if (j10 != j6) {
                Y8.p pVarV = V(j6, pVar, andIncrement);
                if (pVarV == null) {
                    continue;
                } else {
                    pVar = pVarV;
                }
            }
            boolean zF1 = f1(pVar, (int) (andIncrement % ((long) i6)), andIncrement);
            p0(this, 0L, 1, null);
            if (zF1) {
                return;
            }
        }
    }

    private final java.lang.Object U0(Y8.p pVar, int i6, long j6, p127m7.e eVar) {
        p237x7.q qVar;
        W8.C1798n c1798nB = W8.AbstractC1802p.b(p137n7.b.d(eVar));
        try {
            java.lang.Object objH1 = h1(pVar, i6, j6, c1798nB);
            if (objH1 != Y8.i.f16544m) {
                if (objH1 == Y8.i.f16546o) {
                    if (j6 < l0()) {
                        pVar.c();
                    }
                    Y8.p pVar2 = (Y8.p) f0().get(this);
                    while (true) {
                        if (u0()) {
                            I0(c1798nB);
                            break;
                        }
                        long andIncrement = g0().getAndIncrement(this);
                        int i10 = Y8.i.f16533b;
                        long j10 = andIncrement / ((long) i10);
                        int i11 = (int) (andIncrement % ((long) i10));
                        if (pVar2.f24329c != j10) {
                            Y8.p pVarW = W(j10, pVar2);
                            if (pVarW != null) {
                                pVar2 = pVarW;
                            }
                        }
                        objH1 = h1(pVar2, i11, andIncrement, c1798nB);
                        if (objH1 == Y8.i.f16544m) {
                            W8.C1798n c1798n = c1798nB instanceof W8.e1 ? c1798nB : null;
                            if (c1798n == null) {
                                break;
                            }
                            P0(c1798n, pVar2, i11);
                            break;
                        }
                        if (objH1 == Y8.i.f16546o) {
                            if (andIncrement < l0()) {
                                pVar2.c();
                            }
                        } else {
                            if (objH1 == Y8.i.f16545n) {
                                throw new java.lang.IllegalStateException("unexpected".toString());
                            }
                            pVar2.c();
                            p237x7.l lVar = this.f16517D;
                            qVar = (p237x7.q) (lVar != null ? H(lVar) : null);
                        }
                    }
                } else {
                    pVar.c();
                    p237x7.l lVar2 = this.f16517D;
                    qVar = (p237x7.q) (lVar2 != null ? H(lVar2) : null);
                }
                c1798nB.C(objH1, qVar);
                break;
            }
            P0(c1798nB, pVar, i6);
            java.lang.Object objX = c1798nB.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX;
        } catch (java.lang.Throwable th) {
            c1798nB.Q();
            throw th;
        }
    }

    private final Y8.p V(long j6, Y8.p pVar, long j10) {
        java.lang.Object objC;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16513L;
        p237x7.p pVar2 = (p237x7.p) Y8.i.y();
        loop0: while (true) {
            objC = p019b9.AbstractC2114a.c(pVar, j6, pVar2);
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
        if (p019b9.B.c(objC)) {
            S();
            D0(j6, pVar);
        } else {
            Y8.p pVar3 = (Y8.p) p019b9.B.b(objC);
            if (pVar3.f24329c <= j6) {
                return pVar3;
            }
            long j11 = pVar3.f24329c;
            int i6 = Y8.i.f16533b;
            if (f16509H.compareAndSet(this, j10 + 1, j11 * ((long) i6))) {
                o0((pVar3.f24329c * ((long) i6)) - j10);
                return null;
            }
        }
        p0(this, 0L, 1, null);
        return null;
    }

    private final void V0(Y8.p pVar) {
        p237x7.l lVar = this.f16517D;
        p019b9.S sB = null;
        java.lang.Object objB = p019b9.AbstractC2123j.b(null, 1, null);
        loop0: do {
            for (int i6 = Y8.i.f16533b - 1; -1 < i6; i6--) {
                long j6 = (pVar.f24329c * ((long) Y8.i.f16533b)) + ((long) i6);
                while (true) {
                    java.lang.Object objB2 = pVar.B(i6);
                    if (objB2 == Y8.i.f16540i) {
                        break loop0;
                    }
                    if (objB2 == Y8.i.f16535d) {
                        if (j6 < h0()) {
                            break loop0;
                        }
                        if (pVar.v(i6, objB2, Y8.i.z())) {
                            if (lVar != null) {
                                sB = p019b9.w.b(lVar, pVar.A(i6), sB);
                            }
                            pVar.w(i6);
                        }
                    } else if (objB2 == Y8.i.f16536e || objB2 == null) {
                        if (pVar.v(i6, objB2, Y8.i.z())) {
                        }
                    } else if ((objB2 instanceof W8.e1) || (objB2 instanceof Y8.D)) {
                        if (j6 < h0()) {
                            break loop0;
                        }
                        W8.e1 e1Var = objB2 instanceof Y8.D ? ((Y8.D) objB2).f16496a : (W8.e1) objB2;
                        if (pVar.v(i6, objB2, Y8.i.z())) {
                            if (lVar != null) {
                                sB = p019b9.w.b(lVar, pVar.A(i6), sB);
                            }
                            objB = p019b9.AbstractC2123j.c(objB, e1Var);
                            pVar.w(i6);
                        }
                    } else if (objB2 == Y8.i.f16538g || objB2 == Y8.i.f16537f) {
                        break loop0;
                    } else if (objB2 != Y8.i.f16538g) {
                    }
                    pVar.t();
                }
            }
            pVar = (Y8.p) pVar.h();
        } while (pVar != null);
        if (objB != null) {
            if (objB instanceof java.util.ArrayList) {
                p247y7.AbstractC7350t.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                java.util.ArrayList arrayList = (java.util.ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    X0((W8.e1) arrayList.get(size));
                }
            } else {
                X0((W8.e1) objB);
            }
        }
        if (sB != null) {
            throw sB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y8.p W(long j6, Y8.p pVar) {
        java.lang.Object objC;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16512K;
        p237x7.p pVar2 = (p237x7.p) Y8.i.y();
        loop0: while (true) {
            objC = p019b9.AbstractC2114a.c(pVar, j6, pVar2);
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
        if (p019b9.B.c(objC)) {
            S();
            if (pVar.f24329c * ((long) Y8.i.f16533b) >= l0()) {
                return null;
            }
        } else {
            pVar = (Y8.p) p019b9.B.b(objC);
            if (!y0() && j6 <= Z() / ((long) Y8.i.f16533b)) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16513L;
                while (true) {
                    p019b9.A a10 = (p019b9.A) atomicReferenceFieldUpdater2.get(this);
                    if (a10.f24329c >= pVar.f24329c || !pVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, a10, pVar)) {
                        if (!a10.p()) {
                            break;
                        }
                        a10.n();
                        break;
                    }
                    if (pVar.p()) {
                        pVar.n();
                    }
                }
            }
            long j10 = pVar.f24329c;
            if (j10 <= j6) {
                return pVar;
            }
            int i6 = Y8.i.f16533b;
            l1(j10 * ((long) i6));
            if (pVar.f24329c * ((long) i6) >= l0()) {
                return null;
            }
        }
        pVar.c();
        return null;
    }

    private final void W0(W8.e1 e1Var) {
        Y0(e1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y8.p X(long j6, Y8.p pVar) {
        java.lang.Object objC;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16511J;
        p237x7.p pVar2 = (p237x7.p) Y8.i.y();
        loop0: while (true) {
            objC = p019b9.AbstractC2114a.c(pVar, j6, pVar2);
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
        if (p019b9.B.c(objC)) {
            S();
            if (pVar.f24329c * ((long) Y8.i.f16533b) >= h0()) {
                return null;
            }
        } else {
            pVar = (Y8.p) p019b9.B.b(objC);
            long j10 = pVar.f24329c;
            if (j10 <= j6) {
                return pVar;
            }
            int i6 = Y8.i.f16533b;
            n1(j10 * ((long) i6));
            if (pVar.f24329c * ((long) i6) >= h0()) {
                return null;
            }
        }
        pVar.c();
        return null;
    }

    private final void X0(W8.e1 e1Var) {
        Y0(e1Var, false);
    }

    private final void Y0(W8.e1 e1Var, boolean z6) {
        p127m7.e eVar;
        java.lang.Object objB;
        if (e1Var instanceof W8.InterfaceC1794l) {
            eVar = (p127m7.e) e1Var;
            i7.w.a aVar = p087i7.w.f46751D;
            objB = p087i7.x.a(z6 ? e0() : i0());
        } else {
            if (!(e1Var instanceof Y8.A)) {
                if (e1Var instanceof Y8.h.a) {
                    ((Y8.h.a) e1Var).j();
                    return;
                }
                throw new java.lang.IllegalStateException(("Unexpected waiter: " + e1Var).toString());
            }
            eVar = ((Y8.A) e1Var).f16495C;
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = Y8.n.b(Y8.n.f16556b.a(b0()));
        }
        eVar.t(p087i7.w.b(objB));
    }

    private final long Z() {
        return f16509H.get(this);
    }

    static /* synthetic */ java.lang.Object Z0(Y8.h hVar, java.lang.Object obj, p127m7.e eVar) {
        Y8.p pVar = (Y8.p) j0().get(hVar);
        while (true) {
            long andIncrement = k0().getAndIncrement(hVar);
            long j6 = 1152921504606846975L & andIncrement;
            boolean zW0 = hVar.w0(andIncrement);
            int i6 = Y8.i.f16533b;
            long j10 = j6 / ((long) i6);
            int i10 = (int) (j6 % ((long) i6));
            if (pVar.f24329c != j10) {
                Y8.p pVarX = hVar.X(j10, pVar);
                if (pVarX != null) {
                    pVar = pVarX;
                } else if (zW0) {
                    java.lang.Object objJ0 = hVar.J0(obj, eVar);
                    if (objJ0 != p137n7.b.g()) {
                        break;
                    }
                    return objJ0;
                }
            }
            int iJ1 = hVar.j1(pVar, i10, obj, j6, null, zW0);
            if (iJ1 == 0) {
                pVar.c();
                break;
            }
            if (iJ1 != 1) {
                if (iJ1 == 2) {
                    if (!zW0) {
                        break;
                    }
                    pVar.t();
                    java.lang.Object objJ1 = hVar.J0(obj, eVar);
                    if (objJ1 != p137n7.b.g()) {
                        break;
                    }
                    return objJ1;
                }
                if (iJ1 == 3) {
                    java.lang.Object objA1 = hVar.a1(pVar, i10, obj, j6, eVar);
                    if (objA1 != p137n7.b.g()) {
                        break;
                    }
                    return objA1;
                }
                if (iJ1 == 4) {
                    if (j6 < hVar.h0()) {
                        pVar.c();
                    }
                    java.lang.Object objJ2 = hVar.J0(obj, eVar);
                    if (objJ2 != p137n7.b.g()) {
                        break;
                    }
                    return objJ2;
                }
                if (iJ1 == 5) {
                    pVar.c();
                }
            } else {
                break;
            }
        }
        return p087i7.M.f46721a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    private final java.lang.Object a1(Y8.p pVar, int i6, java.lang.Object obj, long j6, p127m7.e eVar) {
        java.lang.Object objB;
        java.lang.Object objX;
        Y8.p pVar2;
        W8.C1798n c1798nB = W8.AbstractC1802p.b(p137n7.b.d(eVar));
        try {
            int iJ1 = j1(pVar, i6, obj, j6, c1798nB, false);
            if (iJ1 == 0) {
                pVar.c();
                i7.w.a aVar = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.M.f46721a);
            } else {
                if (iJ1 != 1) {
                    if (iJ1 != 2) {
                        if (iJ1 != 4) {
                            if (iJ1 != 5) {
                                throw new java.lang.IllegalStateException("unexpected".toString());
                            }
                            pVar.c();
                            Y8.p pVar3 = (Y8.p) j0().get(this);
                            while (true) {
                                long andIncrement = k0().getAndIncrement(this);
                                long j10 = andIncrement & 1152921504606846975L;
                                boolean zW0 = w0(andIncrement);
                                int i10 = Y8.i.f16533b;
                                long j11 = j10 / ((long) i10);
                                int i11 = (int) (j10 % ((long) i10));
                                if (pVar3.f24329c != j11) {
                                    Y8.p pVarX = X(j11, pVar3);
                                    if (pVarX != null) {
                                        pVar2 = pVarX;
                                    } else if (zW0) {
                                    }
                                } else {
                                    pVar2 = pVar3;
                                }
                                Y8.p pVar4 = pVar2;
                                int iJ2 = j1(pVar2, i11, obj, j10, c1798nB, zW0);
                                if (iJ2 == 0) {
                                    pVar4.c();
                                    i7.w.a aVar2 = p087i7.w.f46751D;
                                    objB = p087i7.w.b(p087i7.M.f46721a);
                                } else if (iJ2 == 1) {
                                    i7.w.a aVar3 = p087i7.w.f46751D;
                                    objB = p087i7.w.b(p087i7.M.f46721a);
                                } else if (iJ2 == 2) {
                                    if (!zW0) {
                                        W8.C1798n c1798n = c1798nB instanceof W8.e1 ? c1798nB : null;
                                        if (c1798n == null) {
                                            break;
                                        }
                                        Q0(c1798n, pVar4, i11);
                                        break;
                                    }
                                    pVar4.t();
                                } else {
                                    if (iJ2 == 3) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    if (iJ2 != 4) {
                                        if (iJ2 == 5) {
                                            pVar4.c();
                                        }
                                        pVar3 = pVar4;
                                    } else if (j10 < h0()) {
                                        pVar4.c();
                                    }
                                }
                            }
                        } else if (j6 < h0()) {
                            pVar.c();
                        }
                        K0(obj, c1798nB);
                        break;
                    } else {
                        Q0(c1798nB, pVar, i6);
                    }
                    objX = c1798nB.x();
                    if (objX == p137n7.b.g()) {
                        p147o7.h.c(eVar);
                    }
                    if (objX == p137n7.b.g()) {
                        return objX;
                    }
                    return p087i7.M.f46721a;
                }
                i7.w.a aVar4 = p087i7.w.f46751D;
                objB = p087i7.w.b(p087i7.M.f46721a);
            }
            c1798nB.t(objB);
            objX = c1798nB.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            if (objX == p137n7.b.g()) {
                return objX;
            }
            return p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            c1798nB.Q();
            throw th;
        }
    }

    private final boolean b1(long j6) {
        if (w0(j6)) {
            return false;
        }
        return !L(j6 & 1152921504606846975L);
    }

    private final boolean c1(java.lang.Object obj, java.lang.Object obj2) {
        W8.InterfaceC1794l interfaceC1794l;
        F7.f fVarH = null;
        if (obj instanceof Y8.A) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            interfaceC1794l = ((Y8.A) obj).f16495C;
            obj2 = Y8.n.b(Y8.n.f16556b.c(obj2));
            p237x7.l lVar = this.f16517D;
            if (lVar != null) {
                fVarH = K(lVar);
            }
        } else {
            if (obj instanceof Y8.h.a) {
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                return ((Y8.h.a) obj).i(obj2);
            }
            if (!(obj instanceof W8.InterfaceC1794l)) {
                throw new java.lang.IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            interfaceC1794l = (W8.InterfaceC1794l) obj;
            p237x7.l lVar2 = this.f16517D;
            if (lVar2 != null) {
                fVarH = H(lVar2);
            }
        }
        return Y8.i.B(interfaceC1794l, obj2, (p237x7.q) fVarH);
    }

    private final boolean d1(java.lang.Object obj, Y8.p pVar, int i6) {
        if (obj instanceof W8.InterfaceC1794l) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return Y8.i.C((W8.InterfaceC1794l) obj, p087i7.M.f46721a, null, 2, null);
        }
        throw new java.lang.IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Throwable e0() {
        java.lang.Throwable thB0 = b0();
        return thB0 == null ? new Y8.t("Channel was closed") : thB0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f0() {
        return f16512K;
    }

    private final boolean f1(Y8.p pVar, int i6, long j6) {
        java.lang.Object objB = pVar.B(i6);
        if (!(objB instanceof W8.e1) || j6 < f16508G.get(this) || !pVar.v(i6, objB, Y8.i.f16538g)) {
            return g1(pVar, i6, j6);
        }
        if (d1(objB, pVar, i6)) {
            pVar.F(i6, Y8.i.f16535d);
            return true;
        }
        pVar.F(i6, Y8.i.f16541j);
        pVar.C(i6, false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater g0() {
        return f16508G;
    }

    private final boolean g1(Y8.p pVar, int i6, long j6) {
        while (true) {
            java.lang.Object objB = pVar.B(i6);
            if (objB instanceof W8.e1) {
                if (j6 < f16508G.get(this)) {
                    if (pVar.v(i6, objB, new Y8.D((W8.e1) objB))) {
                        return true;
                    }
                } else if (pVar.v(i6, objB, Y8.i.f16538g)) {
                    if (d1(objB, pVar, i6)) {
                        pVar.F(i6, Y8.i.f16535d);
                        return true;
                    }
                    pVar.F(i6, Y8.i.f16541j);
                    pVar.C(i6, false);
                    return false;
                }
            } else {
                if (objB == Y8.i.f16541j) {
                    return false;
                }
                if (objB == null) {
                    if (pVar.v(i6, objB, Y8.i.f16536e)) {
                        return true;
                    }
                } else {
                    if (objB == Y8.i.f16535d || objB == Y8.i.f16539h || objB == Y8.i.f16540i || objB == Y8.i.f16542k || objB == Y8.i.z()) {
                        return true;
                    }
                    if (objB != Y8.i.f16537f) {
                        throw new java.lang.IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object h1(Y8.p pVar, int i6, long j6, java.lang.Object obj) {
        java.lang.Object objB = pVar.B(i6);
        if (objB == null) {
            if (j6 >= (f16507F.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return Y8.i.f16545n;
                }
                if (pVar.v(i6, objB, obj)) {
                    U();
                    return Y8.i.f16544m;
                }
            }
        } else if (objB == Y8.i.f16535d && pVar.v(i6, objB, Y8.i.f16540i)) {
            U();
            return pVar.D(i6);
        }
        return i1(pVar, i6, j6, obj);
    }

    private final java.lang.Object i1(Y8.p pVar, int i6, long j6, java.lang.Object obj) {
        while (true) {
            java.lang.Object objB = pVar.B(i6);
            if (objB == null || objB == Y8.i.f16536e) {
                if (j6 < (f16507F.get(this) & 1152921504606846975L)) {
                    if (pVar.v(i6, objB, Y8.i.f16539h)) {
                        U();
                        return Y8.i.f16546o;
                    }
                } else {
                    if (obj == null) {
                        return Y8.i.f16545n;
                    }
                    if (pVar.v(i6, objB, obj)) {
                        U();
                        return Y8.i.f16544m;
                    }
                }
            } else {
                if (objB != Y8.i.f16535d) {
                    if (objB != Y8.i.f16541j && objB != Y8.i.f16539h) {
                        if (objB == Y8.i.z()) {
                            U();
                            return Y8.i.f16546o;
                        }
                        if (objB != Y8.i.f16538g && pVar.v(i6, objB, Y8.i.f16537f)) {
                            boolean z6 = objB instanceof Y8.D;
                            if (z6) {
                                objB = ((Y8.D) objB).f16496a;
                            }
                            if (d1(objB, pVar, i6)) {
                                pVar.F(i6, Y8.i.f16540i);
                                U();
                                return pVar.D(i6);
                            }
                            pVar.F(i6, Y8.i.f16541j);
                            pVar.C(i6, false);
                            if (z6) {
                                U();
                            }
                            return Y8.i.f16546o;
                        }
                    }
                    return Y8.i.f16546o;
                }
                if (pVar.v(i6, objB, Y8.i.f16540i)) {
                    U();
                    return pVar.D(i6);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater j0() {
        return f16511J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j1(Y8.p pVar, int i6, java.lang.Object obj, long j6, java.lang.Object obj2, boolean z6) {
        pVar.G(i6, obj);
        if (z6) {
            return k1(pVar, i6, obj, j6, obj2, z6);
        }
        java.lang.Object objB = pVar.B(i6);
        if (objB == null) {
            if (L(j6)) {
                if (pVar.v(i6, null, Y8.i.f16535d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.v(i6, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof W8.e1) {
            pVar.w(i6);
            if (c1(objB, obj)) {
                pVar.F(i6, Y8.i.f16540i);
                L0();
                return 0;
            }
            if (pVar.x(i6, Y8.i.f16542k) != Y8.i.f16542k) {
                pVar.C(i6, true);
            }
            return 5;
        }
        return k1(pVar, i6, obj, j6, obj2, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater k0() {
        return f16507F;
    }

    private final int k1(Y8.p pVar, int i6, java.lang.Object obj, long j6, java.lang.Object obj2, boolean z6) {
        while (true) {
            java.lang.Object objB = pVar.B(i6);
            if (objB == null) {
                if (!L(j6) || z6) {
                    if (z6) {
                        if (pVar.v(i6, null, Y8.i.f16541j)) {
                            pVar.C(i6, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.v(i6, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.v(i6, null, Y8.i.f16535d)) {
                    return 1;
                }
            } else {
                if (objB != Y8.i.f16536e) {
                    if (objB == Y8.i.f16542k) {
                        pVar.w(i6);
                        return 5;
                    }
                    if (objB == Y8.i.f16539h) {
                        pVar.w(i6);
                        return 5;
                    }
                    p019b9.D dZ = Y8.i.z();
                    pVar.w(i6);
                    if (objB == dZ) {
                        S();
                        return 4;
                    }
                    if (objB instanceof Y8.D) {
                        objB = ((Y8.D) objB).f16496a;
                    }
                    if (c1(objB, obj)) {
                        pVar.F(i6, Y8.i.f16540i);
                        L0();
                        return 0;
                    }
                    if (pVar.x(i6, Y8.i.f16542k) != Y8.i.f16542k) {
                        pVar.C(i6, true);
                    }
                    return 5;
                }
                if (pVar.v(i6, objB, Y8.i.f16535d)) {
                    return 1;
                }
            }
        }
    }

    private final void l1(long j6) {
        long j10;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16508G;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= j6) {
                return;
            }
        } while (!f16508G.compareAndSet(this, j10, j6));
    }

    private final void n1(long j6) {
        long j10;
        long j11;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16507F;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = 1152921504606846975L & j10;
            if (j11 >= j6) {
                return;
            }
        } while (!f16507F.compareAndSet(this, j10, Y8.i.w(j11, (int) (j10 >> 60))));
    }

    private final void o0(long j6) {
        if ((f16510I.addAndGet(this, j6) & 4611686018427387904L) != 0) {
            while ((f16510I.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void p0(Y8.h hVar, long j6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i6 & 1) != 0) {
            j6 = 1;
        }
        hVar.o0(j6);
    }

    private final void q0() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16515N;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? Y8.i.f16548q : Y8.i.f16549r));
        if (obj == null) {
            return;
        }
        ((p237x7.l) obj).l(b0());
    }

    private final boolean r0(Y8.p pVar, int i6, long j6) {
        java.lang.Object objB;
        do {
            objB = pVar.B(i6);
            if (objB != null && objB != Y8.i.f16536e) {
                if (objB == Y8.i.f16535d) {
                    return true;
                }
                if (objB == Y8.i.f16541j || objB == Y8.i.z() || objB == Y8.i.f16540i || objB == Y8.i.f16539h) {
                    return false;
                }
                if (objB == Y8.i.f16538g) {
                    return true;
                }
                return objB != Y8.i.f16537f && j6 == h0();
            }
        } while (!pVar.v(i6, objB, Y8.i.f16539h));
        U();
        return false;
    }

    private final boolean t0(long j6, boolean z6) {
        int i6 = (int) (j6 >> 60);
        if (i6 == 0 || i6 == 1) {
            return false;
        }
        if (i6 == 2) {
            R(j6 & 1152921504606846975L);
            if (z6 && n0()) {
                return false;
            }
        } else {
            if (i6 != 3) {
                throw new java.lang.IllegalStateException(("unexpected close status: " + i6).toString());
            }
            Q(j6 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean v0(long j6) {
        return t0(j6, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0(long j6) {
        return t0(j6, false);
    }

    private final boolean y0() {
        long jZ = Z();
        return jZ == 0 || jZ == Long.MAX_VALUE;
    }

    private final long z0(Y8.p pVar) {
        do {
            int i6 = Y8.i.f16533b;
            while (true) {
                i6--;
                if (-1 < i6) {
                    long j6 = (pVar.f24329c * ((long) Y8.i.f16533b)) + ((long) i6);
                    if (j6 >= h0()) {
                        while (true) {
                            java.lang.Object objB = pVar.B(i6);
                            if (objB != null && objB != Y8.i.f16536e) {
                                if (objB != Y8.i.f16535d) {
                                    break;
                                }
                                return j6;
                            }
                            if (pVar.v(i6, objB, Y8.i.z())) {
                                pVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            pVar = (Y8.p) pVar.h();
        } while (pVar != null);
        return -1L;
    }

    protected void G0() {
    }

    protected void L0() {
    }

    public boolean M(java.lang.Throwable th) {
        if (th == null) {
            th = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        return P(th, true);
    }

    protected void M0() {
    }

    protected boolean P(java.lang.Throwable th, boolean z6) {
        if (z6) {
            A0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f16514M, this, Y8.i.f16550s, th);
        if (z6) {
            B0();
        } else {
            C0();
        }
        S();
        G0();
        if (zA) {
            q0();
        }
        return zA;
    }

    protected final void T(long j6) {
        p019b9.S sC;
        Y8.p pVar = (Y8.p) f16512K.get(this);
        while (true) {
            long j10 = f16508G.get(this);
            if (j6 < java.lang.Math.max(((long) this.f16516C) + j10, Z())) {
                return;
            }
            if (f16508G.compareAndSet(this, j10, j10 + 1)) {
                int i6 = Y8.i.f16533b;
                long j11 = j10 / ((long) i6);
                int i10 = (int) (j10 % ((long) i6));
                if (pVar.f24329c != j11) {
                    Y8.p pVarW = W(j11, pVar);
                    if (pVarW == null) {
                        continue;
                    } else {
                        pVar = pVarW;
                    }
                }
                java.lang.Object objH1 = h1(pVar, i10, j10, null);
                if (objH1 != Y8.i.f16546o) {
                    pVar.c();
                    p237x7.l lVar = this.f16517D;
                    if (lVar != null && (sC = p019b9.w.c(lVar, objH1, null, 2, null)) != null) {
                        throw sC;
                    }
                } else if (j10 < l0()) {
                    pVar.c();
                }
            }
        }
    }

    @Override // Y8.B
    public java.lang.Object a() {
        Y8.p pVar;
        long j6 = f16508G.get(this);
        long j10 = f16507F.get(this);
        if (v0(j10)) {
            return Y8.n.f16556b.a(b0());
        }
        if (j6 >= (j10 & 1152921504606846975L)) {
            return Y8.n.f16556b.b();
        }
        java.lang.Object obj = Y8.i.f16542k;
        Y8.p pVar2 = (Y8.p) f0().get(this);
        while (!u0()) {
            long andIncrement = g0().getAndIncrement(this);
            int i6 = Y8.i.f16533b;
            long j11 = andIncrement / ((long) i6);
            int i10 = (int) (andIncrement % ((long) i6));
            if (pVar2.f24329c != j11) {
                Y8.p pVarW = W(j11, pVar2);
                if (pVarW == null) {
                    continue;
                } else {
                    pVar = pVarW;
                }
            } else {
                pVar = pVar2;
            }
            java.lang.Object objH1 = h1(pVar, i10, andIncrement, obj);
            if (objH1 == Y8.i.f16544m) {
                W8.e1 e1Var = obj instanceof W8.e1 ? (W8.e1) obj : null;
                if (e1Var != null) {
                    P0(e1Var, pVar, i10);
                }
                o1(andIncrement);
                pVar.t();
                return Y8.n.f16556b.b();
            }
            if (objH1 != Y8.i.f16546o) {
                if (objH1 == Y8.i.f16545n) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                pVar.c();
                return Y8.n.f16556b.c(objH1);
            }
            if (andIncrement < l0()) {
                pVar.c();
            }
            pVar2 = pVar;
        }
        return Y8.n.f16556b.a(b0());
    }

    @Override // Y8.B
    public java.lang.Object b(p127m7.e eVar) {
        return R0(this, eVar);
    }

    protected final java.lang.Throwable b0() {
        return (java.lang.Throwable) f16514M.get(this);
    }

    @Override // Y8.C
    public boolean c(java.lang.Throwable th) {
        return P(th, false);
    }

    @Override // Y8.C
    public void d(p237x7.l lVar) {
        if (androidx.concurrent.futures.b.a(f16515N, this, null, lVar)) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16515N;
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != Y8.i.f16548q) {
                if (obj == Y8.i.f16549r) {
                    throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new java.lang.IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f16515N, this, Y8.i.f16548q, Y8.i.f16549r));
        lVar.l(b0());
    }

    protected final java.lang.Object e1(java.lang.Object obj) {
        Y8.p pVar;
        java.lang.Object obj2 = Y8.i.f16535d;
        Y8.p pVar2 = (Y8.p) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zW0 = w0(andIncrement);
            int i6 = Y8.i.f16533b;
            long j10 = j6 / ((long) i6);
            int i10 = (int) (j6 % ((long) i6));
            if (pVar2.f24329c != j10) {
                Y8.p pVarX = X(j10, pVar2);
                if (pVarX != null) {
                    pVar = pVarX;
                } else if (zW0) {
                    return Y8.n.f16556b.a(i0());
                }
            } else {
                pVar = pVar2;
            }
            int iJ1 = j1(pVar, i10, obj, j6, obj2, zW0);
            if (iJ1 == 0) {
                pVar.c();
                return Y8.n.f16556b.c(p087i7.M.f46721a);
            }
            if (iJ1 == 1) {
                return Y8.n.f16556b.c(p087i7.M.f46721a);
            }
            if (iJ1 == 2) {
                if (zW0) {
                    pVar.t();
                    return Y8.n.f16556b.a(i0());
                }
                W8.e1 e1Var = obj2 instanceof W8.e1 ? (W8.e1) obj2 : null;
                if (e1Var != null) {
                    Q0(e1Var, pVar, i10);
                }
                T((pVar.f24329c * ((long) i6)) + ((long) i10));
                return Y8.n.f16556b.c(p087i7.M.f46721a);
            }
            if (iJ1 == 3) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            if (iJ1 == 4) {
                if (j6 < h0()) {
                    pVar.c();
                }
                return Y8.n.f16556b.a(i0());
            }
            if (iJ1 == 5) {
                pVar.c();
            }
            pVar2 = pVar;
        }
    }

    @Override // Y8.C
    public java.lang.Object h(java.lang.Object obj, p127m7.e eVar) {
        return Z0(this, obj, eVar);
    }

    public final long h0() {
        return f16508G.get(this);
    }

    protected final java.lang.Throwable i0() {
        java.lang.Throwable thB0 = b0();
        return thB0 == null ? new Y8.u("Channel was closed") : thB0;
    }

    @Override // Y8.B
    public Y8.l iterator() {
        return new Y8.h.a();
    }

    @Override // Y8.C
    public java.lang.Object j(java.lang.Object obj) {
        Y8.p pVar;
        if (b1(f16507F.get(this))) {
            return Y8.n.f16556b.b();
        }
        java.lang.Object obj2 = Y8.i.f16541j;
        Y8.p pVar2 = (Y8.p) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zW0 = w0(andIncrement);
            int i6 = Y8.i.f16533b;
            long j10 = j6 / ((long) i6);
            int i10 = (int) (j6 % ((long) i6));
            if (pVar2.f24329c != j10) {
                Y8.p pVarX = X(j10, pVar2);
                if (pVarX != null) {
                    pVar = pVarX;
                } else if (zW0) {
                    break;
                }
            } else {
                pVar = pVar2;
            }
            int iJ1 = j1(pVar, i10, obj, j6, obj2, zW0);
            if (iJ1 == 0) {
                pVar.c();
            } else if (iJ1 != 1) {
                if (iJ1 == 2) {
                    if (zW0) {
                        pVar.t();
                        break;
                    }
                    W8.e1 e1Var = obj2 instanceof W8.e1 ? (W8.e1) obj2 : null;
                    if (e1Var != null) {
                        Q0(e1Var, pVar, i10);
                    }
                    pVar.t();
                    return Y8.n.f16556b.b();
                }
                if (iJ1 == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (iJ1 == 4) {
                    if (j6 >= h0()) {
                        break;
                    }
                    pVar.c();
                    break;
                }
                if (iJ1 == 5) {
                    pVar.c();
                }
                pVar2 = pVar;
            }
            return Y8.n.f16556b.c(p087i7.M.f46721a);
        }
        return Y8.n.f16556b.a(i0());
    }

    @Override // Y8.B
    public java.lang.Object l(p127m7.e eVar) {
        return S0(this, eVar);
    }

    public final long l0() {
        return f16507F.get(this) & 1152921504606846975L;
    }

    @Override // Y8.C
    public boolean m() {
        return w0(f16507F.get(this));
    }

    public final boolean n0() {
        while (true) {
            Y8.p pVarW = (Y8.p) f16512K.get(this);
            long jH0 = h0();
            if (l0() <= jH0) {
                return false;
            }
            int i6 = Y8.i.f16533b;
            long j6 = jH0 / ((long) i6);
            if (pVarW.f24329c == j6 || (pVarW = W(j6, pVarW)) != null) {
                pVarW.c();
                if (r0(pVarW, (int) (jH0 % ((long) i6)), jH0)) {
                    return true;
                }
                f16508G.compareAndSet(this, jH0, 1 + jH0);
            } else if (((Y8.p) f16512K.get(this)).f24329c < j6) {
                return false;
            }
        }
    }

    @Override // Y8.B
    public final void o(java.util.concurrent.CancellationException cancellationException) {
        M(cancellationException);
    }

    public final void o1(long j6) {
        long j10;
        long j11;
        if (y0()) {
            return;
        }
        while (Z() <= j6) {
        }
        int i6 = Y8.i.f16534c;
        for (int i10 = 0; i10 < i6; i10++) {
            long jZ = Z();
            if (jZ == (f16510I.get(this) & 4611686018427387903L) && jZ == Z()) {
                return;
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f16510I;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, Y8.i.v(j10 & 4611686018427387903L, true)));
        while (true) {
            long jZ2 = Z();
            long j12 = f16510I.get(this);
            long j13 = j12 & 4611686018427387903L;
            boolean z6 = (4611686018427387904L & j12) != 0;
            if (jZ2 == j13 && jZ2 == Z()) {
                break;
            } else if (!z6) {
                f16510I.compareAndSet(this, j12, Y8.i.v(j13, true));
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16510I;
        do {
            j11 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, Y8.i.v(j11 & 4611686018427387903L, false)));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9 A[LOOP:2: B:27:0x00c4->B:82:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba A[EDGE_INSN: B:93:0x01ba->B:77:0x01ba BREAK  A[LOOP:2: B:27:0x00c4->B:82:0x01d9], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0107, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x017b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x019b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String toString() {
        int i6;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Object next;
        Y8.p pVar;
        long jH0;
        long jL0;
        int i10;
        int i11;
        long j6;
        java.lang.Object objB;
        java.lang.Object objA;
        java.lang.String string;
        java.lang.String str;
        long j10;
        java.lang.Object next2;
        long j11;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i12 = (int) (f16507F.get(this) >> 60);
        if (i12 != 2) {
            str2 = i12 == 3 ? "cancelled," : "closed,";
            sb.append("capacity=" + this.f16516C + ',');
            sb.append("data=[");
            i6 = 0;
            java.util.List listP = p097j7.AbstractC6879v.p(f16512K.get(this), f16511J.get(this), f16513L.get(this));
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listP) {
                if (((Y8.p) obj) != Y8.i.f16532a) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            if (it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            next = it.next();
            if (it.hasNext()) {
                j10 = ((Y8.p) next).f24329c;
                do {
                    next2 = it.next();
                    j11 = ((Y8.p) next2).f24329c;
                    if (j10 > j11) {
                        next = next2;
                        j10 = j11;
                    }
                } while (it.hasNext());
            }
            pVar = (Y8.p) next;
            jH0 = h0();
            jL0 = l0();
            loop2: while (true) {
                i10 = Y8.i.f16533b;
                for (i11 = i6; i11 < i10; i11++) {
                    j6 = (pVar.f24329c * ((long) Y8.i.f16533b)) + ((long) i11);
                    if (j6 < jL0 && j6 >= jH0) {
                        break loop2;
                    }
                    objB = pVar.B(i11);
                    objA = pVar.A(i11);
                    if (objB instanceof W8.InterfaceC1794l) {
                        if (j6 >= jH0 && j6 >= jL0) {
                            string = "receive";
                        } else if (j6 < jL0 || j6 < jH0) {
                            string = "cont";
                        } else {
                            string = "send";
                        }
                    } else if (objB instanceof Y8.A) {
                        string = "receiveCatching";
                    } else if (objB instanceof Y8.D) {
                        string = "EB(" + objB + ')';
                    } else if (!p247y7.AbstractC7350t.b(objB, Y8.i.f16537f) || p247y7.AbstractC7350t.b(objB, Y8.i.f16538g)) {
                        string = "resuming_sender";
                    } else {
                        if (objB != null && !p247y7.AbstractC7350t.b(objB, Y8.i.f16536e) && !p247y7.AbstractC7350t.b(objB, Y8.i.f16540i) && !p247y7.AbstractC7350t.b(objB, Y8.i.f16539h) && !p247y7.AbstractC7350t.b(objB, Y8.i.f16542k) && !p247y7.AbstractC7350t.b(objB, Y8.i.f16541j) && !p247y7.AbstractC7350t.b(objB, Y8.i.z())) {
                            string = objB.toString();
                        }
                    }
                    if (objA != null) {
                        str = '(' + string + ',' + objA + "),";
                    } else {
                        str = string + ',';
                    }
                    sb.append(str);
                }
                pVar = (Y8.p) pVar.f();
                if (pVar == null) {
                    break;
                }
                i6 = 0;
            }
            if (S8.r.z1(sb) == ',') {
                p247y7.AbstractC7350t.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("capacity=" + this.f16516C + ',');
        sb.append("data=[");
        i6 = 0;
        java.util.List listP2 = p097j7.AbstractC6879v.p(f16512K.get(this), f16511J.get(this), f16513L.get(this));
        arrayList = new java.util.ArrayList();
        while (r2.hasNext()) {
            if (((Y8.p) obj) != Y8.i.f16532a) {
                arrayList.add(obj);
            }
        }
        it = arrayList.iterator();
        if (it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        next = it.next();
        if (it.hasNext()) {
            j10 = ((Y8.p) next).f24329c;
            do {
                next2 = it.next();
                j11 = ((Y8.p) next2).f24329c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        pVar = (Y8.p) next;
        jH0 = h0();
        jL0 = l0();
        loop2: while (true) {
            i10 = Y8.i.f16533b;
            while (i11 < i10) {
                j6 = (pVar.f24329c * ((long) Y8.i.f16533b)) + ((long) i11);
                if (j6 < jL0) {
                }
                objB = pVar.B(i11);
                objA = pVar.A(i11);
                if (objB instanceof W8.InterfaceC1794l) {
                    if (j6 >= jH0) {
                        if (j6 < jL0) {
                            string = "cont";
                        } else {
                            string = "cont";
                        }
                    } else if (j6 < jL0) {
                        string = "cont";
                    } else {
                        string = "cont";
                    }
                } else if (objB instanceof Y8.A) {
                    string = "receiveCatching";
                } else if (objB instanceof Y8.D) {
                    string = "EB(" + objB + ')';
                } else {
                    if (p247y7.AbstractC7350t.b(objB, Y8.i.f16537f)) {
                        string = "resuming_sender";
                    } else {
                        string = "resuming_sender";
                    }
                }
                if (objA != null) {
                    str = '(' + string + ',' + objA + "),";
                } else {
                    str = string + ',';
                }
                sb.append(str);
            }
            pVar = (Y8.p) pVar.f();
            if (pVar == null) {
                break;
                break;
            }
            i6 = 0;
        }
        if (S8.r.z1(sb) == ',') {
            p247y7.AbstractC7350t.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u0() {
        return v0(f16507F.get(this));
    }

    protected boolean x0() {
        return false;
    }
}
