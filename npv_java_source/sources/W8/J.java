package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J extends p127m7.a implements p127m7.f {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final W8.J.a f15454D = new W8.J.a(null);

    public static final class a extends p127m7.b {
        private a() {
            super(p127m7.f.f51196A, new p237x7.l() { // from class: W8.I
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return W8.J.a.d((m7.i.b) obj);
                }
            });
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final W8.J d(m7.i.b bVar) {
            if (bVar instanceof W8.J) {
                return (W8.J) bVar;
            }
            return null;
        }
    }

    public J() {
        super(p127m7.f.f51196A);
    }

    public static /* synthetic */ W8.J y1(W8.J j6, int i6, java.lang.String str, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return j6.x1(i6, str);
    }

    @Override // p127m7.f
    public final void H(p127m7.e eVar) {
        p247y7.AbstractC7350t.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((p019b9.C2121h) eVar).r();
    }

    @Override // p127m7.a, m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return m7.f.a.a(this, cVar);
    }

    @Override // p127m7.f
    public final p127m7.e q0(p127m7.e eVar) {
        return new p019b9.C2121h(this, eVar);
    }

    public abstract void t1(p127m7.i iVar, java.lang.Runnable runnable);

    public java.lang.String toString() {
        return W8.S.a(this) + '@' + W8.S.b(this);
    }

    public void u1(p127m7.i iVar, java.lang.Runnable runnable) {
        t1(iVar, runnable);
    }

    public boolean v1(p127m7.i iVar) {
        return true;
    }

    public /* synthetic */ W8.J w1(int i6) {
        return x1(i6, null);
    }

    public W8.J x1(int i6, java.lang.String str) {
        p019b9.AbstractC2125l.a(i6);
        return new p019b9.C2124k(this, i6, str);
    }

    @Override // p127m7.a, p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return m7.f.a.b(this, cVar);
    }
}
