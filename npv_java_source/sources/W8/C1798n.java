package W8;

/* JADX INFO: renamed from: W8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1798n extends W8.AbstractC1773a0 implements W8.InterfaceC1794l, p147o7.e, W8.e1 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f15520H = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(W8.C1798n.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15521I = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.C1798n.class, java.lang.Object.class, "_state$volatile");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15522J = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(W8.C1798n.class, java.lang.Object.class, "_parentHandle$volatile");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p127m7.e f15523F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p127m7.i f15524G;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    public C1798n(p127m7.e eVar, int i6) {
        super(i6);
        this.f15523F = eVar;
        this.f15524G = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = W8.C1778d.f15491a;
    }

    private final W8.InterfaceC1783f0 H() {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) getContext().i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 == null) {
            return null;
        }
        W8.InterfaceC1783f0 interfaceC1783f0O = W8.D0.o(interfaceC1822z0, false, new W8.r(this), 1, null);
        androidx.concurrent.futures.b.a(f15522J, this, null, interfaceC1783f0O);
        return interfaceC1783f0O;
    }

    private final void I(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15521I;
        while (true) {
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W8.C1778d) {
                if (androidx.concurrent.futures.b.a(f15521I, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof W8.InterfaceC1792k) || (obj2 instanceof p019b9.A)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof W8.A) {
                    W8.A a6 = (W8.A) obj2;
                    if (!a6.c()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof W8.C1804q) {
                        if (!(obj2 instanceof W8.A)) {
                            a6 = null;
                        }
                        java.lang.Throwable th = a6 != null ? a6.f15423a : null;
                        if (obj instanceof W8.InterfaceC1792k) {
                            m((W8.InterfaceC1792k) obj, th);
                            return;
                        } else {
                            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((p019b9.A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof W8.C1821z) {
                    W8.C1821z c1821z = (W8.C1821z) obj2;
                    if (c1821z.f15540b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof p019b9.A) {
                        return;
                    }
                    p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    W8.InterfaceC1792k interfaceC1792k = (W8.InterfaceC1792k) obj;
                    if (c1821z.c()) {
                        m(interfaceC1792k, c1821z.f15543e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f15521I, this, obj2, W8.C1821z.b(c1821z, null, interfaceC1792k, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof p019b9.A) {
                        return;
                    }
                    p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f15521I, this, obj2, new W8.C1821z(obj2, (W8.InterfaceC1792k) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean M() {
        if (W8.AbstractC1775b0.c(this.f15482E)) {
            p127m7.e eVar = this.f15523F;
            p247y7.AbstractC7350t.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((p019b9.C2121h) eVar).p()) {
                return true;
            }
        }
        return false;
    }

    private final void N(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M T(p237x7.l lVar, java.lang.Throwable th, java.lang.Object obj, p127m7.i iVar) {
        lVar.l(th);
        return p087i7.M.f46721a;
    }

    public static /* synthetic */ void V(W8.C1798n c1798n, java.lang.Object obj, int i6, p237x7.q qVar, int i10, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i10 & 4) != 0) {
            qVar = null;
        }
        c1798n.U(obj, i6, qVar);
    }

    private final java.lang.Object W(W8.N0 n6, java.lang.Object obj, int i6, p237x7.q qVar, java.lang.Object obj2) {
        if (obj instanceof W8.A) {
            return obj;
        }
        if (!W8.AbstractC1775b0.b(i6) && obj2 == null) {
            return obj;
        }
        if (qVar == null && !(n6 instanceof W8.InterfaceC1792k) && obj2 == null) {
            return obj;
        }
        return new W8.C1821z(obj, n6 instanceof W8.InterfaceC1792k ? (W8.InterfaceC1792k) n6 : null, qVar, obj2, null, 16, null);
    }

    private final boolean X() {
        int i6;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15520H;
        do {
            i6 = atomicIntegerFieldUpdater.get(this);
            int i10 = i6 >> 29;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!f15520H.compareAndSet(this, i6, 1073741824 + (536870911 & i6)));
        return true;
    }

    private final p019b9.D Y(java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar) {
        java.lang.Object obj3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15521I;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof W8.N0)) {
                if ((obj3 instanceof W8.C1821z) && obj2 != null && ((W8.C1821z) obj3).f15542d == obj2) {
                    return W8.AbstractC1800o.f15527a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f15521I, this, obj3, W((W8.N0) obj3, obj, this.f15482E, qVar, obj2)));
        r();
        return W8.AbstractC1800o.f15527a;
    }

    private final boolean Z() {
        int i6;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15520H;
        do {
            i6 = atomicIntegerFieldUpdater.get(this);
            int i10 = i6 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!f15520H.compareAndSet(this, i6, 536870912 + (536870911 & i6)));
        return true;
    }

    private final java.lang.Void l(java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(p019b9.A a6, java.lang.Throwable th) {
        int i6 = f15520H.get(this) & 536870911;
        if (i6 == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            a6.s(i6, th, getContext());
        } catch (java.lang.Throwable th2) {
            W8.L.a(getContext(), new W8.B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean p(java.lang.Throwable th) {
        if (!M()) {
            return false;
        }
        p127m7.e eVar = this.f15523F;
        p247y7.AbstractC7350t.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((p019b9.C2121h) eVar).q(th);
    }

    private final void r() {
        if (M()) {
            return;
        }
        q();
    }

    private final void u(int i6) {
        if (X()) {
            return;
        }
        W8.AbstractC1775b0.a(this, i6);
    }

    private final W8.InterfaceC1783f0 w() {
        return (W8.InterfaceC1783f0) f15522J.get(this);
    }

    private final java.lang.String z() {
        java.lang.Object objY = y();
        if (objY instanceof W8.N0) {
            return "Active";
        }
        return objY instanceof W8.C1804q ? "Cancelled" : "Completed";
    }

    @Override // W8.InterfaceC1794l
    public void C(java.lang.Object obj, p237x7.q qVar) {
        U(obj, this.f15482E, qVar);
    }

    public void E() {
        W8.InterfaceC1783f0 interfaceC1783f0H = H();
        if (interfaceC1783f0H != null && L()) {
            interfaceC1783f0H.e();
            f15522J.set(this, W8.M0.f15460C);
        }
    }

    @Override // W8.InterfaceC1794l
    public void F(W8.J j6, java.lang.Object obj) {
        p127m7.e eVar = this.f15523F;
        p019b9.C2121h c2121h = eVar instanceof p019b9.C2121h ? (p019b9.C2121h) eVar : null;
        V(this, obj, (c2121h != null ? c2121h.f24356F : null) == j6 ? 4 : this.f15482E, null, 4, null);
    }

    @Override // W8.InterfaceC1794l
    public void G(p237x7.l lVar) {
        W8.AbstractC1802p.c(this, new W8.InterfaceC1792k.a(lVar));
    }

    @Override // W8.InterfaceC1794l
    public void J(java.lang.Object obj) {
        u(this.f15482E);
    }

    public final void K(W8.InterfaceC1792k interfaceC1792k) {
        I(interfaceC1792k);
    }

    public boolean L() {
        return !(y() instanceof W8.N0);
    }

    protected java.lang.String O() {
        return "CancellableContinuation";
    }

    public final void P(java.lang.Throwable th) {
        if (p(th)) {
            return;
        }
        k(th);
        r();
    }

    public final void Q() {
        java.lang.Throwable thU;
        p127m7.e eVar = this.f15523F;
        p019b9.C2121h c2121h = eVar instanceof p019b9.C2121h ? (p019b9.C2121h) eVar : null;
        if (c2121h == null || (thU = c2121h.u(this)) == null) {
            return;
        }
        q();
        k(thU);
    }

    public final boolean R() {
        java.lang.Object obj = f15521I.get(this);
        if ((obj instanceof W8.C1821z) && ((W8.C1821z) obj).f15542d != null) {
            q();
            return false;
        }
        f15520H.set(this, 536870911);
        f15521I.set(this, W8.C1778d.f15491a);
        return true;
    }

    public void S(java.lang.Object obj, final p237x7.l lVar) {
        U(obj, this.f15482E, lVar != null ? new p237x7.q() { // from class: W8.m
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return W8.C1798n.T(lVar, (java.lang.Throwable) obj2, obj3, (p127m7.i) obj4);
            }
        } : null);
    }

    public final void U(java.lang.Object obj, int i6, p237x7.q qVar) {
        java.lang.Object obj2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15521I;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof W8.N0)) {
                if (obj2 instanceof W8.C1804q) {
                    W8.C1804q c1804q = (W8.C1804q) obj2;
                    if (c1804q.e()) {
                        if (qVar != null) {
                            n(qVar, c1804q.f15423a, obj);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new p087i7.C6665k();
            }
        } while (!androidx.concurrent.futures.b.a(f15521I, this, obj2, W((W8.N0) obj2, obj, i6, qVar, null)));
        r();
        u(i6);
    }

    @Override // W8.AbstractC1773a0
    public void a(java.lang.Object obj, java.lang.Throwable th) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15521I;
        while (true) {
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W8.N0) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof W8.A) {
                return;
            }
            if (obj2 instanceof W8.C1821z) {
                W8.C1821z c1821z = (W8.C1821z) obj2;
                if (!(!c1821z.c())) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f15521I, this, obj2, W8.C1821z.b(c1821z, null, null, null, null, th, 15, null))) {
                    c1821z.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f15521I, this, obj2, new W8.C1821z(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // W8.e1
    public void b(p019b9.A a6, int i6) {
        int i10;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15520H;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i6));
        I(a6);
    }

    @Override // W8.AbstractC1773a0
    public final p127m7.e c() {
        return this.f15523F;
    }

    @Override // W8.AbstractC1773a0
    public java.lang.Throwable d(java.lang.Object obj) {
        java.lang.Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // p147o7.e
    public p147o7.e e() {
        p127m7.e eVar = this.f15523F;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // W8.InterfaceC1794l
    public boolean f() {
        return y() instanceof W8.N0;
    }

    @Override // W8.AbstractC1773a0
    public java.lang.Object g(java.lang.Object obj) {
        return obj instanceof W8.C1821z ? ((W8.C1821z) obj).f15539a : obj;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return this.f15524G;
    }

    @Override // W8.AbstractC1773a0
    public java.lang.Object i() {
        return y();
    }

    @Override // W8.InterfaceC1794l
    public boolean isCancelled() {
        return y() instanceof W8.C1804q;
    }

    @Override // W8.InterfaceC1794l
    public boolean k(java.lang.Throwable th) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15521I;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof W8.N0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f15521I, this, obj, new W8.C1804q(this, th, (obj instanceof W8.InterfaceC1792k) || (obj instanceof p019b9.A))));
        W8.N0 n6 = (W8.N0) obj;
        if (n6 instanceof W8.InterfaceC1792k) {
            m((W8.InterfaceC1792k) obj, th);
        } else if (n6 instanceof p019b9.A) {
            o((p019b9.A) obj, th);
        }
        r();
        u(this.f15482E);
        return true;
    }

    public final void m(W8.InterfaceC1792k interfaceC1792k, java.lang.Throwable th) {
        try {
            interfaceC1792k.a(th);
        } catch (java.lang.Throwable th2) {
            W8.L.a(getContext(), new W8.B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(p237x7.q qVar, java.lang.Throwable th, java.lang.Object obj) {
        try {
            qVar.j(th, obj, getContext());
        } catch (java.lang.Throwable th2) {
            W8.L.a(getContext(), new W8.B("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void q() {
        W8.InterfaceC1783f0 interfaceC1783f0W = w();
        if (interfaceC1783f0W == null) {
            return;
        }
        interfaceC1783f0W.e();
        f15522J.set(this, W8.M0.f15460C);
    }

    @Override // W8.InterfaceC1794l
    public java.lang.Object s(java.lang.Object obj, java.lang.Object obj2, p237x7.q qVar) {
        return Y(obj, obj2, qVar);
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        V(this, W8.C.c(obj, this), this.f15482E, null, 4, null);
    }

    public java.lang.String toString() {
        return O() + '(' + W8.S.c(this.f15523F) + "){" + z() + "}@" + W8.S.b(this);
    }

    public java.lang.Throwable v(W8.InterfaceC1822z0 interfaceC1822z0) {
        return interfaceC1822z0.e0();
    }

    public final java.lang.Object x() {
        W8.InterfaceC1822z0 interfaceC1822z0;
        boolean zM = M();
        if (Z()) {
            if (w() == null) {
                H();
            }
            if (zM) {
                Q();
            }
            return p137n7.b.g();
        }
        if (zM) {
            Q();
        }
        java.lang.Object objY = y();
        if (objY instanceof W8.A) {
            throw ((W8.A) objY).f15423a;
        }
        if (!W8.AbstractC1775b0.b(this.f15482E) || (interfaceC1822z0 = (W8.InterfaceC1822z0) getContext().i(W8.InterfaceC1822z0.f15544h)) == null || interfaceC1822z0.f()) {
            return g(objY);
        }
        java.util.concurrent.CancellationException cancellationExceptionE0 = interfaceC1822z0.e0();
        a(objY, cancellationExceptionE0);
        throw cancellationExceptionE0;
    }

    public final java.lang.Object y() {
        return f15521I.get(this);
    }
}
