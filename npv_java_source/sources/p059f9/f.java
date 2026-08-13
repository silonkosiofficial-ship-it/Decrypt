package p059f9;

/* JADX INFO: loaded from: classes2.dex */
public class f extends p059f9.i implements p059f9.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f45402i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p059f9.f.class, java.lang.Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p237x7.q f45403h;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements W8.InterfaceC1794l, W8.e1 {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final W8.C1798n f45404C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final java.lang.Object f45405D;

        public a(W8.C1798n c1798n, java.lang.Object obj) {
            this.f45404C = c1798n;
            this.f45405D = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M e(p059f9.f fVar, f9.f.a aVar, java.lang.Throwable th) {
            fVar.d(aVar.f45405D);
            return p087i7.M.f46721a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M i(p059f9.f fVar, f9.f.a aVar, java.lang.Throwable th, p087i7.M m6, p127m7.i iVar) {
            p059f9.f.x().set(fVar, aVar.f45405D);
            fVar.d(aVar.f45405D);
            return p087i7.M.f46721a;
        }

        @Override // W8.InterfaceC1794l
        public void G(p237x7.l lVar) {
            this.f45404C.G(lVar);
        }

        @Override // W8.InterfaceC1794l
        public void J(java.lang.Object obj) {
            this.f45404C.J(obj);
        }

        @Override // W8.e1
        public void b(p019b9.A a6, int i6) {
            this.f45404C.b(a6, i6);
        }

        @Override // W8.InterfaceC1794l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void C(p087i7.M m6, p237x7.q qVar) {
            p059f9.f.x().set(p059f9.f.this, this.f45405D);
            W8.C1798n c1798n = this.f45404C;
            final p059f9.f fVar = p059f9.f.this;
            c1798n.S(m6, new p237x7.l() { // from class: f9.e
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return f9.f.a.e(fVar, this, (java.lang.Throwable) obj);
                }
            });
        }

        @Override // W8.InterfaceC1794l
        public boolean f() {
            return this.f45404C.f();
        }

        @Override // W8.InterfaceC1794l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void F(W8.J j6, p087i7.M m6) {
            this.f45404C.F(j6, m6);
        }

        @Override // p127m7.e
        public p127m7.i getContext() {
            return this.f45404C.getContext();
        }

        @Override // W8.InterfaceC1794l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public java.lang.Object s(p087i7.M m6, java.lang.Object obj, p237x7.q qVar) {
            final p059f9.f fVar = p059f9.f.this;
            java.lang.Object objS = this.f45404C.s(m6, obj, new p237x7.q() { // from class: f9.d
                @Override // p237x7.q
                public final java.lang.Object j(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return f9.f.a.i(fVar, this, (java.lang.Throwable) obj2, (p087i7.M) obj3, (p127m7.i) obj4);
                }
            });
            if (objS != null) {
                p059f9.f.x().set(p059f9.f.this, this.f45405D);
            }
            return objS;
        }

        @Override // W8.InterfaceC1794l
        public boolean isCancelled() {
            return this.f45404C.isCancelled();
        }

        @Override // W8.InterfaceC1794l
        public boolean k(java.lang.Throwable th) {
            return this.f45404C.k(th);
        }

        @Override // p127m7.e
        public void t(java.lang.Object obj) {
            this.f45404C.t(obj);
        }
    }

    public f(boolean z6) {
        super(1, z6 ? 1 : 0);
        this.owner$volatile = z6 ? null : p059f9.g.f45407a;
        this.f45403h = new p237x7.q() { // from class: f9.b
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                p059f9.f fVar = this.f45395C;
                androidx.appcompat.app.D.a(obj);
                return p059f9.f.B(fVar, null, obj2, obj3);
            }
        };
    }

    private final java.lang.Object A(java.lang.Object obj, p127m7.e eVar) {
        W8.C1798n c1798nB = W8.AbstractC1802p.b(p137n7.b.d(eVar));
        try {
            f(new f9.f.a(c1798nB, obj));
            java.lang.Object objX = c1798nB.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(eVar);
            }
            return objX == p137n7.b.g() ? objX : p087i7.M.f46721a;
        } catch (java.lang.Throwable th) {
            c1798nB.Q();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p237x7.q B(final p059f9.f fVar, p049e9.a aVar, final java.lang.Object obj, java.lang.Object obj2) {
        return new p237x7.q() { // from class: f9.c
            @Override // p237x7.q
            public final java.lang.Object j(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return p059f9.f.C(this.f45396C, obj, (java.lang.Throwable) obj3, obj4, (p127m7.i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M C(p059f9.f fVar, java.lang.Object obj, java.lang.Throwable th, java.lang.Object obj2, p127m7.i iVar) {
        fVar.d(obj);
        return p087i7.M.f46721a;
    }

    private final int D(java.lang.Object obj) {
        while (!r()) {
            if (obj == null) {
                return 1;
            }
            int iY = y(obj);
            if (iY == 1) {
                return 2;
            }
            if (iY == 2) {
                return 1;
            }
        }
        f45402i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater x() {
        return f45402i;
    }

    private final int y(java.lang.Object obj) {
        while (b()) {
            java.lang.Object obj2 = f45402i.get(this);
            if (obj2 != p059f9.g.f45407a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ java.lang.Object z(p059f9.f fVar, java.lang.Object obj, p127m7.e eVar) {
        java.lang.Object objA;
        return (!fVar.a(obj) && (objA = fVar.A(obj, eVar)) == p137n7.b.g()) ? objA : p087i7.M.f46721a;
    }

    @Override // p059f9.a
    public boolean a(java.lang.Object obj) {
        int iD = D(obj);
        if (iD == 0) {
            return true;
        }
        if (iD == 1) {
            return false;
        }
        if (iD != 2) {
            throw new java.lang.IllegalStateException("unexpected".toString());
        }
        throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p059f9.a
    public boolean b() {
        return j() == 0;
    }

    @Override // p059f9.a
    public java.lang.Object c(java.lang.Object obj, p127m7.e eVar) {
        return z(this, obj, eVar);
    }

    @Override // p059f9.a
    public void d(java.lang.Object obj) {
        while (b()) {
            java.lang.Object obj2 = f45402i.get(this);
            if (obj2 != p059f9.g.f45407a) {
                if (obj2 != obj && obj != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f45402i, this, obj2, p059f9.g.f45407a)) {
                    q();
                    return;
                }
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked".toString());
    }

    public java.lang.String toString() {
        return "Mutex@" + W8.S.b(this) + "[isLocked=" + b() + ",owner=" + f45402i.get(this) + ']';
    }
}
