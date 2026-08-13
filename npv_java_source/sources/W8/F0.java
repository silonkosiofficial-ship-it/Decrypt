package W8;

/* JADX INFO: loaded from: classes2.dex */
public class F0 implements W8.InterfaceC1822z0, W8.InterfaceC1811u, W8.O0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15429C = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.F0.class, java.lang.Object.class, "_state$volatile");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15430D = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.F0.class, java.lang.Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    private static final class a extends W8.C1798n {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private final W8.F0 f15431K;

        public a(p127m7.e eVar, W8.F0 f6) {
            super(eVar, 1);
            this.f15431K = f6;
        }

        @Override // W8.C1798n
        protected java.lang.String O() {
            return "AwaitContinuation";
        }

        @Override // W8.C1798n
        public java.lang.Throwable v(W8.InterfaceC1822z0 interfaceC1822z0) {
            java.lang.Throwable thE;
            java.lang.Object objB0 = this.f15431K.b0();
            if (!(objB0 instanceof W8.F0.c) || (thE = ((W8.F0.c) objB0).e()) == null) {
                return objB0 instanceof W8.A ? ((W8.A) objB0).f15423a : interfaceC1822z0.e0();
            }
            return thE;
        }
    }

    private static final class b extends W8.E0 {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private final W8.F0 f15432G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final W8.F0.c f15433H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final W8.C1809t f15434I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private final java.lang.Object f15435J;

        public b(W8.F0 f6, W8.F0.c cVar, W8.C1809t c1809t, java.lang.Object obj) {
            this.f15432G = f6;
            this.f15433H = cVar;
            this.f15434I = c1809t;
            this.f15435J = obj;
        }

        @Override // W8.E0
        public boolean w() {
            return false;
        }

        @Override // W8.E0
        public void x(java.lang.Throwable th) {
            this.f15432G.M(this.f15433H, this.f15434I, this.f15435J);
        }
    }

    private static final class c implements W8.InterfaceC1814v0 {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15436D = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.F0.c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15437E = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.F0.c.class, java.lang.Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15438F = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.F0.c.class, java.lang.Object.class, "_exceptionsHolder$volatile");

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final W8.K0 f15439C;
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

        public c(W8.K0 k6, boolean z6, java.lang.Throwable th) {
            this.f15439C = k6;
            this._isCompleting$volatile = z6 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final java.util.ArrayList c() {
            return new java.util.ArrayList(4);
        }

        private final java.lang.Object d() {
            return f15438F.get(this);
        }

        private final void o(java.lang.Object obj) {
            f15438F.set(this, obj);
        }

        @Override // W8.InterfaceC1814v0
        public W8.K0 a() {
            return this.f15439C;
        }

        public final void b(java.lang.Throwable th) {
            java.lang.Throwable thE = e();
            if (thE == null) {
                p(th);
                return;
            }
            if (th == thE) {
                return;
            }
            java.lang.Object objD = d();
            if (objD == null) {
                o(th);
                return;
            }
            if (objD instanceof java.lang.Throwable) {
                if (th == objD) {
                    return;
                }
                java.util.ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th);
                o(arrayListC);
                return;
            }
            if (objD instanceof java.util.ArrayList) {
                ((java.util.ArrayList) objD).add(th);
                return;
            }
            throw new java.lang.IllegalStateException(("State is " + objD).toString());
        }

        public final java.lang.Throwable e() {
            return (java.lang.Throwable) f15437E.get(this);
        }

        @Override // W8.InterfaceC1814v0
        public boolean f() {
            return e() == null;
        }

        public final boolean j() {
            return e() != null;
        }

        public final boolean k() {
            return f15436D.get(this) != 0;
        }

        public final boolean l() {
            return d() == W8.G0.f15449e;
        }

        public final java.util.List m(java.lang.Throwable th) {
            java.util.ArrayList arrayListC;
            java.lang.Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof java.lang.Throwable) {
                java.util.ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof java.util.ArrayList)) {
                    throw new java.lang.IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (java.util.ArrayList) objD;
            }
            java.lang.Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th != null && !p247y7.AbstractC7350t.b(th, thE)) {
                arrayListC.add(th);
            }
            o(W8.G0.f15449e);
            return arrayListC;
        }

        public final void n(boolean z6) {
            f15436D.set(this, z6 ? 1 : 0);
        }

        public final void p(java.lang.Throwable th) {
            f15437E.set(this, th);
        }

        public java.lang.String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    static final class d extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f15440E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f15441F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f15442G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f15443H;

        d(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:24:0x006d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0080 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r6.f15442G
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f15441F
                b9.o r1 = (p019b9.C2128o) r1
                java.lang.Object r3 = r6.f15440E
                b9.n r3 = (p019b9.AbstractC2127n) r3
                java.lang.Object r4 = r6.f15443H
                R8.j r4 = (R8.j) r4
                p087i7.x.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                p087i7.x.b(r7)
                goto L86
            L2a:
                p087i7.x.b(r7)
                java.lang.Object r7 = r6.f15443H
                R8.j r7 = (R8.j) r7
                W8.F0 r1 = W8.F0.this
                java.lang.Object r1 = r1.b0()
                boolean r4 = r1 instanceof W8.C1809t
                if (r4 == 0) goto L48
                W8.t r1 = (W8.C1809t) r1
                W8.u r1 = r1.f15532G
                r6.f15442G = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof W8.InterfaceC1814v0
                if (r3 == 0) goto L86
                W8.v0 r1 = (W8.InterfaceC1814v0) r1
                W8.K0 r1 = r1.a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                p247y7.AbstractC7350t.d(r3, r4)
                b9.o r3 = (p019b9.C2128o) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = p247y7.AbstractC7350t.b(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof W8.C1809t
                if (r7 == 0) goto L81
                r7 = r1
                W8.t r7 = (W8.C1809t) r7
                W8.u r7 = r7.f15532G
                r6.f15443H = r4
                r6.f15440E = r3
                r6.f15441F = r1
                r6.f15442G = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                b9.o r1 = r1.m()
                goto L63
            L86:
                i7.M r7 = p087i7.M.f46721a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: W8.F0.d.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(R8.j jVar, p127m7.e eVar) {
            return ((W8.F0.d) x(jVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            W8.F0.d dVar = W8.F0.this.new d(eVar);
            dVar.f15443H = obj;
            return dVar;
        }
    }

    public F0(boolean z6) {
        this._state$volatile = z6 ? W8.G0.f15451g : W8.G0.f15450f;
    }

    private final java.lang.Object B(java.lang.Object obj) {
        java.lang.Object objZ0;
        do {
            java.lang.Object objB0 = b0();
            if (!(objB0 instanceof W8.InterfaceC1814v0) || ((objB0 instanceof W8.F0.c) && ((W8.F0.c) objB0).k())) {
                return W8.G0.f15445a;
            }
            objZ0 = Z0(objB0, new W8.A(O(obj), false, 2, null));
        } while (objZ0 == W8.G0.f15447c);
        return objZ0;
    }

    private final W8.C1809t B0(p019b9.C2128o c2128o) {
        while (c2128o.r()) {
            c2128o = c2128o.n();
        }
        while (true) {
            c2128o = c2128o.m();
            if (!c2128o.r()) {
                if (c2128o instanceof W8.C1809t) {
                    return (W8.C1809t) c2128o;
                }
                if (c2128o instanceof W8.K0) {
                    return null;
                }
            }
        }
    }

    private final void C0(W8.K0 k6, java.lang.Throwable th) throws java.lang.Throwable {
        F0(th);
        k6.h(4);
        java.lang.Object objL = k6.l();
        p247y7.AbstractC7350t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        W8.B b6 = null;
        for (p019b9.C2128o c2128oM = (p019b9.C2128o) objL; !p247y7.AbstractC7350t.b(c2128oM, k6); c2128oM = c2128oM.m()) {
            if ((c2128oM instanceof W8.E0) && ((W8.E0) c2128oM).w()) {
                try {
                    ((W8.E0) c2128oM).x(th);
                } catch (java.lang.Throwable th2) {
                    if (b6 != null) {
                        p087i7.AbstractC6661g.a(b6, th2);
                    } else {
                        b6 = new W8.B("Exception in completion handler " + c2128oM + " for " + this, th2);
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                }
            }
        }
        if (b6 != null) {
            h0(b6);
        }
        E(th);
    }

    private final void D0(W8.K0 k6, java.lang.Throwable th) throws java.lang.Throwable {
        k6.h(1);
        java.lang.Object objL = k6.l();
        p247y7.AbstractC7350t.d(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        W8.B b6 = null;
        for (p019b9.C2128o c2128oM = (p019b9.C2128o) objL; !p247y7.AbstractC7350t.b(c2128oM, k6); c2128oM = c2128oM.m()) {
            if (c2128oM instanceof W8.E0) {
                try {
                    ((W8.E0) c2128oM).x(th);
                } catch (java.lang.Throwable th2) {
                    if (b6 != null) {
                        p087i7.AbstractC6661g.a(b6, th2);
                    } else {
                        b6 = new W8.B("Exception in completion handler " + c2128oM + " for " + this, th2);
                        p087i7.M m6 = p087i7.M.f46721a;
                    }
                }
            }
        }
        if (b6 != null) {
            h0(b6);
        }
    }

    private final boolean E(java.lang.Throwable th) {
        if (k0()) {
            return true;
        }
        boolean z6 = th instanceof java.util.concurrent.CancellationException;
        W8.InterfaceC1807s interfaceC1807sA0 = a0();
        if (interfaceC1807sA0 == null || interfaceC1807sA0 == W8.M0.f15460C) {
            return z6;
        }
        return interfaceC1807sA0.g(th) || z6;
    }

    private final void J0(W8.C1789i0 c1789i0) {
        W8.K0 k6 = new W8.K0();
        java.lang.Object c1812u0 = k6;
        if (!c1789i0.f()) {
            c1812u0 = new W8.C1812u0(k6);
        }
        androidx.concurrent.futures.b.a(f15429C, this, c1789i0, c1812u0);
    }

    private final void L(W8.InterfaceC1814v0 interfaceC1814v0, java.lang.Object obj) throws java.lang.Throwable {
        W8.InterfaceC1807s interfaceC1807sA0 = a0();
        if (interfaceC1807sA0 != null) {
            interfaceC1807sA0.e();
            N0(W8.M0.f15460C);
        }
        W8.A a6 = obj instanceof W8.A ? (W8.A) obj : null;
        java.lang.Throwable th = a6 != null ? a6.f15423a : null;
        if (!(interfaceC1814v0 instanceof W8.E0)) {
            W8.K0 k0A = interfaceC1814v0.a();
            if (k0A != null) {
                D0(k0A, th);
                return;
            }
            return;
        }
        try {
            ((W8.E0) interfaceC1814v0).x(th);
        } catch (java.lang.Throwable th2) {
            h0(new W8.B("Exception in completion handler " + interfaceC1814v0 + " for " + this, th2));
        }
    }

    private final void L0(W8.E0 e6) {
        e6.d(new W8.K0());
        androidx.concurrent.futures.b.a(f15429C, this, e6, e6.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(W8.F0.c cVar, W8.C1809t c1809t, java.lang.Object obj) {
        W8.C1809t c1809tB0 = B0(c1809t);
        if (c1809tB0 == null || !b1(cVar, c1809tB0, obj)) {
            cVar.a().h(2);
            W8.C1809t c1809tB1 = B0(c1809t);
            if (c1809tB1 == null || !b1(cVar, c1809tB1, obj)) {
                u(P(cVar, obj));
            }
        }
    }

    private final java.lang.Throwable O(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.Throwable) {
            java.lang.Throwable th = (java.lang.Throwable) obj;
            return th == null ? new W8.A0(I(), null, this) : th;
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((W8.O0) obj).Y0();
    }

    private final int O0(java.lang.Object obj) {
        if (obj instanceof W8.C1789i0) {
            if (((W8.C1789i0) obj).f()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f15429C, this, obj, W8.G0.f15451g)) {
                return -1;
            }
            I0();
            return 1;
        }
        if (!(obj instanceof W8.C1812u0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f15429C, this, obj, ((W8.C1812u0) obj).a())) {
            return -1;
        }
        I0();
        return 1;
    }

    private final java.lang.Object P(W8.F0.c cVar, java.lang.Object obj) throws java.lang.Throwable {
        boolean zJ;
        java.lang.Throwable thU;
        W8.A a6 = obj instanceof W8.A ? (W8.A) obj : null;
        java.lang.Throwable th = a6 != null ? a6.f15423a : null;
        synchronized (cVar) {
            zJ = cVar.j();
            java.util.List listM = cVar.m(th);
            thU = U(cVar, listM);
            if (thU != null) {
                q(thU, listM);
            }
        }
        if (thU != null && thU != th) {
            obj = new W8.A(thU, false, 2, null);
        }
        if (thU != null && (E(thU) || f0(thU))) {
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((W8.A) obj).c();
        }
        if (!zJ) {
            F0(thU);
        }
        G0(obj);
        androidx.concurrent.futures.b.a(f15429C, this, cVar, W8.G0.g(obj));
        L(cVar, obj);
        return obj;
    }

    private final java.lang.String Q0(java.lang.Object obj) {
        if (!(obj instanceof W8.F0.c)) {
            if (obj instanceof W8.InterfaceC1814v0) {
                return ((W8.InterfaceC1814v0) obj).f() ? "Active" : "New";
            }
            return obj instanceof W8.A ? "Cancelled" : "Completed";
        }
        W8.F0.c cVar = (W8.F0.c) obj;
        if (cVar.j()) {
            return "Cancelling";
        }
        return cVar.k() ? "Completing" : "Active";
    }

    private final java.lang.Throwable T(java.lang.Object obj) {
        W8.A a6 = obj instanceof W8.A ? (W8.A) obj : null;
        if (a6 != null) {
            return a6.f15423a;
        }
        return null;
    }

    public static /* synthetic */ java.util.concurrent.CancellationException T0(W8.F0 f6, java.lang.Throwable th, java.lang.String str, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i6 & 1) != 0) {
            str = null;
        }
        return f6.S0(th, str);
    }

    private final java.lang.Throwable U(W8.F0.c cVar, java.util.List list) {
        java.lang.Object next;
        java.lang.Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new W8.A0(I(), null, this);
            }
            return null;
        }
        java.util.List list2 = list;
        java.util.Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException)));
        java.lang.Throwable th = (java.lang.Throwable) next;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = (java.lang.Throwable) list.get(0);
        if (th2 instanceof W8.Y0) {
            for (java.lang.Object obj2 : list2) {
                java.lang.Throwable th3 = (java.lang.Throwable) obj2;
                if (th3 != th2 && (th3 instanceof W8.Y0)) {
                    obj = obj2;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final boolean V0(W8.InterfaceC1814v0 interfaceC1814v0, java.lang.Object obj) throws java.lang.Throwable {
        if (!androidx.concurrent.futures.b.a(f15429C, this, interfaceC1814v0, W8.G0.g(obj))) {
            return false;
        }
        F0(null);
        G0(obj);
        L(interfaceC1814v0, obj);
        return true;
    }

    private final boolean X0(W8.InterfaceC1814v0 interfaceC1814v0, java.lang.Throwable th) throws java.lang.Throwable {
        W8.K0 k0Y = Y(interfaceC1814v0);
        if (k0Y == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f15429C, this, interfaceC1814v0, new W8.F0.c(k0Y, false, th))) {
            return false;
        }
        C0(k0Y, th);
        return true;
    }

    private final W8.K0 Y(W8.InterfaceC1814v0 interfaceC1814v0) {
        W8.K0 k0A = interfaceC1814v0.a();
        if (k0A != null) {
            return k0A;
        }
        if (interfaceC1814v0 instanceof W8.C1789i0) {
            return new W8.K0();
        }
        if (interfaceC1814v0 instanceof W8.E0) {
            L0((W8.E0) interfaceC1814v0);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + interfaceC1814v0).toString());
    }

    private final java.lang.Object Z0(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof W8.InterfaceC1814v0)) {
            return W8.G0.f15445a;
        }
        if ((!(obj instanceof W8.C1789i0) && !(obj instanceof W8.E0)) || (obj instanceof W8.C1809t) || (obj2 instanceof W8.A)) {
            return a1((W8.InterfaceC1814v0) obj, obj2);
        }
        return V0((W8.InterfaceC1814v0) obj, obj2) ? obj2 : W8.G0.f15447c;
    }

    private final java.lang.Object a1(W8.InterfaceC1814v0 interfaceC1814v0, java.lang.Object obj) throws java.lang.Throwable {
        W8.K0 k0Y = Y(interfaceC1814v0);
        if (k0Y == null) {
            return W8.G0.f15447c;
        }
        W8.F0.c cVar = interfaceC1814v0 instanceof W8.F0.c ? (W8.F0.c) interfaceC1814v0 : null;
        if (cVar == null) {
            cVar = new W8.F0.c(k0Y, false, null);
        }
        p247y7.O o6 = new p247y7.O();
        synchronized (cVar) {
            if (cVar.k()) {
                return W8.G0.f15445a;
            }
            cVar.n(true);
            if (cVar != interfaceC1814v0 && !androidx.concurrent.futures.b.a(f15429C, this, interfaceC1814v0, cVar)) {
                return W8.G0.f15447c;
            }
            boolean zJ = cVar.j();
            W8.A a6 = obj instanceof W8.A ? (W8.A) obj : null;
            if (a6 != null) {
                cVar.b(a6.f15423a);
            }
            java.lang.Throwable thE = zJ ^ true ? cVar.e() : null;
            o6.f57254C = thE;
            p087i7.M m6 = p087i7.M.f46721a;
            if (thE != null) {
                C0(k0Y, thE);
            }
            W8.C1809t c1809tB0 = B0(k0Y);
            if (c1809tB0 != null && b1(cVar, c1809tB0, obj)) {
                return W8.G0.f15446b;
            }
            k0Y.h(2);
            W8.C1809t c1809tB1 = B0(k0Y);
            return (c1809tB1 == null || !b1(cVar, c1809tB1, obj)) ? P(cVar, obj) : W8.G0.f15446b;
        }
    }

    private final boolean b1(W8.F0.c cVar, W8.C1809t c1809t, java.lang.Object obj) {
        while (W8.C0.n(c1809t.f15532G, false, new W8.F0.b(this, cVar, c1809t, obj)) == W8.M0.f15460C) {
            c1809t = B0(c1809t);
            if (c1809t == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean l0() {
        java.lang.Object objB0;
        do {
            objB0 = b0();
            if (!(objB0 instanceof W8.InterfaceC1814v0)) {
                return false;
            }
        } while (O0(objB0) < 0);
        return true;
    }

    private final java.lang.Object m0(p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        W8.AbstractC1802p.a(c1798n, W8.D0.o(this, false, new W8.Q0(c1798n), 1, null));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
    }

    private final java.lang.Object p0(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable thO = null;
        while (true) {
            java.lang.Object objB0 = b0();
            if (objB0 instanceof W8.F0.c) {
                synchronized (objB0) {
                    if (((W8.F0.c) objB0).l()) {
                        return W8.G0.f15448d;
                    }
                    boolean zJ = ((W8.F0.c) objB0).j();
                    if (obj != null || !zJ) {
                        if (thO == null) {
                            thO = O(obj);
                        }
                        ((W8.F0.c) objB0).b(thO);
                    }
                    java.lang.Throwable thE = zJ ^ true ? ((W8.F0.c) objB0).e() : null;
                    if (thE != null) {
                        C0(((W8.F0.c) objB0).a(), thE);
                    }
                    return W8.G0.f15445a;
                }
            }
            if (!(objB0 instanceof W8.InterfaceC1814v0)) {
                return W8.G0.f15448d;
            }
            if (thO == null) {
                thO = O(obj);
            }
            W8.InterfaceC1814v0 interfaceC1814v0 = (W8.InterfaceC1814v0) objB0;
            if (!interfaceC1814v0.f()) {
                java.lang.Object objZ0 = Z0(objB0, new W8.A(thO, false, 2, null));
                if (objZ0 == W8.G0.f15445a) {
                    throw new java.lang.IllegalStateException(("Cannot happen in " + objB0).toString());
                }
                if (objZ0 != W8.G0.f15447c) {
                    return objZ0;
                }
            } else if (X0(interfaceC1814v0, thO)) {
                return W8.G0.f15445a;
            }
        }
    }

    private final void q(java.lang.Throwable th, java.util.List list) {
        if (list.size() <= 1) {
            return;
        }
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Throwable th2 = (java.lang.Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof java.util.concurrent.CancellationException) && setNewSetFromMap.add(th2)) {
                p087i7.AbstractC6661g.a(th, th2);
            }
        }
    }

    private final java.lang.Object w(p127m7.e eVar) {
        W8.F0.a aVar = new W8.F0.a(p137n7.b.d(eVar), this);
        aVar.E();
        W8.AbstractC1802p.a(aVar, W8.D0.o(this, false, new W8.P0(aVar), 1, null));
        java.lang.Object objX = aVar.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX;
    }

    public void A(java.lang.Throwable th) throws java.lang.Throwable {
        z(th);
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return W8.InterfaceC1822z0.a.b(this, obj, pVar);
    }

    @Override // W8.InterfaceC1822z0
    public final W8.InterfaceC1783f0 E0(boolean z6, boolean z10, p237x7.l lVar) {
        return j0(z10, z6 ? new W8.C1818x0(lVar) : new W8.C1820y0(lVar));
    }

    protected void F0(java.lang.Throwable th) {
    }

    protected void G0(java.lang.Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public java.lang.String I() {
        return "Job was cancelled";
    }

    protected void I0() {
    }

    public boolean K(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return z(th) && V();
    }

    public final void M0(W8.E0 e6) {
        java.lang.Object objB0;
        do {
            objB0 = b0();
            if (!(objB0 instanceof W8.E0)) {
                if (!(objB0 instanceof W8.InterfaceC1814v0) || ((W8.InterfaceC1814v0) objB0).a() == null) {
                    return;
                }
                e6.s();
                return;
            }
            if (objB0 != e6) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f15429C, this, objB0, W8.G0.f15451g));
    }

    @Override // W8.InterfaceC1822z0
    public final R8.h N() {
        return R8.k.b(new W8.F0.d(null));
    }

    public final void N0(W8.InterfaceC1807s interfaceC1807s) {
        f15430D.set(this, interfaceC1807s);
    }

    public final java.lang.Object S() throws java.lang.Throwable {
        java.lang.Object objB0 = b0();
        if (!(!(objB0 instanceof W8.InterfaceC1814v0))) {
            throw new java.lang.IllegalStateException("This job has not completed yet".toString());
        }
        if (objB0 instanceof W8.A) {
            throw ((W8.A) objB0).f15423a;
        }
        return W8.G0.h(objB0);
    }

    protected final java.util.concurrent.CancellationException S0(java.lang.Throwable th, java.lang.String str) {
        java.util.concurrent.CancellationException a6 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (a6 == null) {
            if (str == null) {
                str = I();
            }
            a6 = new W8.A0(str, th, this);
        }
        return a6;
    }

    public final java.lang.String U0() {
        return w0() + '{' + Q0(b0()) + '}';
    }

    public boolean V() {
        return true;
    }

    public boolean X() {
        return false;
    }

    @Override // W8.O0
    public java.util.concurrent.CancellationException Y0() {
        java.lang.Throwable thE;
        java.lang.Object objB0 = b0();
        if (objB0 instanceof W8.F0.c) {
            thE = ((W8.F0.c) objB0).e();
        } else if (objB0 instanceof W8.A) {
            thE = ((W8.A) objB0).f15423a;
        } else {
            if (objB0 instanceof W8.InterfaceC1814v0) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + objB0).toString());
            }
            thE = null;
        }
        java.util.concurrent.CancellationException cancellationException = thE instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new W8.A0("Parent job is " + Q0(objB0), thE, this);
    }

    public W8.InterfaceC1822z0 Z() {
        W8.InterfaceC1807s interfaceC1807sA0 = a0();
        if (interfaceC1807sA0 != null) {
            return interfaceC1807sA0.getParent();
        }
        return null;
    }

    public final W8.InterfaceC1807s a0() {
        return (W8.InterfaceC1807s) f15430D.get(this);
    }

    public final java.lang.Object b0() {
        return f15429C.get(this);
    }

    @Override // W8.InterfaceC1822z0
    public final java.util.concurrent.CancellationException e0() {
        java.lang.Object objB0 = b0();
        if (!(objB0 instanceof W8.F0.c)) {
            if (objB0 instanceof W8.InterfaceC1814v0) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objB0 instanceof W8.A) {
                return T0(this, ((W8.A) objB0).f15423a, null, 1, null);
            }
            return new W8.A0(W8.S.a(this) + " has completed normally", null, this);
        }
        java.lang.Throwable thE = ((W8.F0.c) objB0).e();
        if (thE != null) {
            java.util.concurrent.CancellationException cancellationExceptionS0 = S0(thE, W8.S.a(this) + " is cancelling");
            if (cancellationExceptionS0 != null) {
                return cancellationExceptionS0;
            }
        }
        throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // W8.InterfaceC1822z0
    public final W8.InterfaceC1783f0 e1(p237x7.l lVar) {
        return j0(true, new W8.C1820y0(lVar));
    }

    @Override // W8.InterfaceC1822z0
    public boolean f() {
        java.lang.Object objB0 = b0();
        return (objB0 instanceof W8.InterfaceC1814v0) && ((W8.InterfaceC1814v0) objB0).f();
    }

    protected boolean f0(java.lang.Throwable th) {
        return false;
    }

    @Override // W8.InterfaceC1822z0
    public final boolean f1() {
        return !(b0() instanceof W8.InterfaceC1814v0);
    }

    @Override // W8.InterfaceC1822z0
    public final java.lang.Object g0(p127m7.e eVar) {
        if (l0()) {
            java.lang.Object objM0 = m0(eVar);
            return objM0 == p137n7.b.g() ? objM0 : p087i7.M.f46721a;
        }
        W8.C0.l(eVar.getContext());
        return p087i7.M.f46721a;
    }

    @Override // m7.i.b
    public final m7.i.c getKey() {
        return W8.InterfaceC1822z0.f15544h;
    }

    public void h0(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return W8.InterfaceC1822z0.a.c(this, cVar);
    }

    protected final void i0(W8.InterfaceC1822z0 interfaceC1822z0) {
        if (interfaceC1822z0 == null) {
            N0(W8.M0.f15460C);
            return;
        }
        interfaceC1822z0.start();
        W8.InterfaceC1807s interfaceC1807sL1 = interfaceC1822z0.l1(this);
        N0(interfaceC1807sL1);
        if (f1()) {
            interfaceC1807sL1.e();
            N0(W8.M0.f15460C);
        }
    }

    @Override // W8.InterfaceC1822z0
    public final boolean isCancelled() {
        java.lang.Object objB0 = b0();
        return (objB0 instanceof W8.A) || ((objB0 instanceof W8.F0.c) && ((W8.F0.c) objB0).j());
    }

    public final W8.InterfaceC1783f0 j0(boolean z6, W8.E0 e6) {
        boolean z10;
        boolean zB;
        e6.y(this);
        while (true) {
            java.lang.Object objB0 = b0();
            z10 = true;
            if (!(objB0 instanceof W8.C1789i0)) {
                if (!(objB0 instanceof W8.InterfaceC1814v0)) {
                    z10 = false;
                    break;
                }
                W8.InterfaceC1814v0 interfaceC1814v0 = (W8.InterfaceC1814v0) objB0;
                W8.K0 k0A = interfaceC1814v0.a();
                if (k0A == null) {
                    p247y7.AbstractC7350t.d(objB0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    L0((W8.E0) objB0);
                } else {
                    if (e6.w()) {
                        W8.F0.c cVar = interfaceC1814v0 instanceof W8.F0.c ? (W8.F0.c) interfaceC1814v0 : null;
                        java.lang.Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z6) {
                                e6.x(thE);
                            }
                            return W8.M0.f15460C;
                        }
                        zB = k0A.b(e6, 5);
                    } else {
                        zB = k0A.b(e6, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                W8.C1789i0 c1789i0 = (W8.C1789i0) objB0;
                if (!c1789i0.f()) {
                    J0(c1789i0);
                } else if (androidx.concurrent.futures.b.a(f15429C, this, objB0, e6)) {
                    break;
                }
            }
        }
        if (z10) {
            return e6;
        }
        if (z6) {
            java.lang.Object objB1 = b0();
            W8.A a6 = objB1 instanceof W8.A ? (W8.A) objB1 : null;
            e6.x(a6 != null ? a6.f15423a : null);
        }
        return W8.M0.f15460C;
    }

    protected boolean k0() {
        return false;
    }

    @Override // W8.InterfaceC1822z0
    public final W8.InterfaceC1807s l1(W8.InterfaceC1811u interfaceC1811u) {
        W8.C1809t c1809t = new W8.C1809t(interfaceC1811u);
        c1809t.y(this);
        while (true) {
            java.lang.Object objB0 = b0();
            if (objB0 instanceof W8.C1789i0) {
                W8.C1789i0 c1789i0 = (W8.C1789i0) objB0;
                if (!c1789i0.f()) {
                    J0(c1789i0);
                } else if (androidx.concurrent.futures.b.a(f15429C, this, objB0, c1809t)) {
                    break;
                }
            } else {
                java.lang.Throwable thE = null;
                if (!(objB0 instanceof W8.InterfaceC1814v0)) {
                    java.lang.Object objB1 = b0();
                    W8.A a6 = objB1 instanceof W8.A ? (W8.A) objB1 : null;
                    c1809t.x(a6 != null ? a6.f15423a : null);
                    return W8.M0.f15460C;
                }
                W8.K0 k0A = ((W8.InterfaceC1814v0) objB0).a();
                if (k0A != null) {
                    if (!k0A.b(c1809t, 7)) {
                        boolean zB = k0A.b(c1809t, 3);
                        java.lang.Object objB2 = b0();
                        if (objB2 instanceof W8.F0.c) {
                            thE = ((W8.F0.c) objB2).e();
                        } else {
                            W8.A a10 = objB2 instanceof W8.A ? (W8.A) objB2 : null;
                            if (a10 != null) {
                                thE = a10.f15423a;
                            }
                        }
                        c1809t.x(thE);
                        if (zB) {
                            break;
                        }
                        return W8.M0.f15460C;
                    }
                    break;
                }
                p247y7.AbstractC7350t.d(objB0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                L0((W8.E0) objB0);
            }
        }
        return c1809t;
    }

    @Override // W8.InterfaceC1822z0
    public void o(java.util.concurrent.CancellationException cancellationException) throws java.lang.Throwable {
        if (cancellationException == null) {
            cancellationException = new W8.A0(I(), null, this);
        }
        A(cancellationException);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return W8.InterfaceC1822z0.a.f(this, iVar);
    }

    @Override // W8.InterfaceC1811u
    public final void r0(W8.O0 o6) throws java.lang.Throwable {
        z(o6);
    }

    @Override // W8.InterfaceC1822z0
    public final boolean start() {
        int iO0;
        do {
            iO0 = O0(b0());
            if (iO0 == 0) {
                return false;
            }
        } while (iO0 != 1);
        return true;
    }

    public final boolean t0(java.lang.Object obj) {
        java.lang.Object objZ0;
        do {
            objZ0 = Z0(b0(), obj);
            if (objZ0 == W8.G0.f15445a) {
                return false;
            }
            if (objZ0 == W8.G0.f15446b) {
                return true;
            }
        } while (objZ0 == W8.G0.f15447c);
        u(objZ0);
        return true;
    }

    public java.lang.String toString() {
        return U0() + '@' + W8.S.b(this);
    }

    protected void u(java.lang.Object obj) {
    }

    protected final java.lang.Object v(p127m7.e eVar) throws java.lang.Throwable {
        java.lang.Object objB0;
        do {
            objB0 = b0();
            if (!(objB0 instanceof W8.InterfaceC1814v0)) {
                if (objB0 instanceof W8.A) {
                    throw ((W8.A) objB0).f15423a;
                }
                return W8.G0.h(objB0);
            }
        } while (O0(objB0) < 0);
        return w(eVar);
    }

    public final java.lang.Object v0(java.lang.Object obj) {
        java.lang.Object objZ0;
        do {
            objZ0 = Z0(b0(), obj);
            if (objZ0 == W8.G0.f15445a) {
                throw new java.lang.IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, T(obj));
            }
        } while (objZ0 == W8.G0.f15447c);
        return objZ0;
    }

    public java.lang.String w0() {
        return W8.S.a(this);
    }

    public final boolean x(java.lang.Throwable th) {
        return z(th);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return W8.InterfaceC1822z0.a.e(this, cVar);
    }

    public final boolean z(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objP0 = W8.G0.f15445a;
        if (X() && (objP0 = B(obj)) == W8.G0.f15446b) {
            return true;
        }
        if (objP0 == W8.G0.f15445a) {
            objP0 = p0(obj);
        }
        if (objP0 == W8.G0.f15445a || objP0 == W8.G0.f15446b) {
            return true;
        }
        if (objP0 == W8.G0.f15448d) {
            return false;
        }
        u(objP0);
        return true;
    }
}
