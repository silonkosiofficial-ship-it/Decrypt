package R0;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0.r f9284a = U0.q.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q0.b f9285b = new Q0.b(16);

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ R0.F f9287E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(R0.F f6) {
            super(1);
            this.f9287E = f6;
        }

        public final void a(R0.H h6) {
            U0.r rVarB = R0.G.this.b();
            R0.G g6 = R0.G.this;
            R0.F f6 = this.f9287E;
            synchronized (rVarB) {
                try {
                    if (h6.f()) {
                        g6.f9285b.e(f6, h6);
                    } else {
                        g6.f9285b.f(f6);
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((R0.H) obj);
            return p087i7.M.f46721a;
        }
    }

    public final U0.r b() {
        return this.f9284a;
    }

    public final V.G1 c(R0.F f6, p237x7.l lVar) {
        synchronized (this.f9284a) {
            R0.H h6 = (R0.H) this.f9285b.d(f6);
            if (h6 != null) {
                if (h6.f()) {
                    return h6;
                }
            }
            try {
                R0.H h10 = (R0.H) lVar.l(new R0.G.a(f6));
                synchronized (this.f9284a) {
                    try {
                        if (this.f9285b.d(f6) == null && h10.f()) {
                            this.f9285b.e(f6, h10);
                        }
                        p087i7.M m6 = p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return h10;
            } catch (java.lang.Exception e6) {
                throw new java.lang.IllegalStateException("Could not load font", e6);
            }
        }
    }
}
