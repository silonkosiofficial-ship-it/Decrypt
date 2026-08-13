package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0.k.a f44821e = new f0.k.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44822f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p051f0.n f44823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44826d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(p237x7.p pVar) {
            synchronized (p051f0.p.I()) {
                p051f0.p.f44853h = p097j7.AbstractC6879v.z0(p051f0.p.f44853h, pVar);
                p087i7.M m6 = p087i7.M.f46721a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(p237x7.l lVar) {
            synchronized (p051f0.p.I()) {
                p051f0.p.f44854i = p097j7.AbstractC6879v.z0(p051f0.p.f44854i, lVar);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p051f0.p.B();
        }

        public final p051f0.k c() {
            return p051f0.p.H();
        }

        public final p051f0.k d() {
            return (p051f0.k) p051f0.p.f44847b.a();
        }

        public final boolean e() {
            return p051f0.p.f44847b.a() != null;
        }

        public final p051f0.k f(p051f0.k kVar) {
            if (kVar instanceof p051f0.C) {
                p051f0.C c6 = (p051f0.C) kVar;
                if (c6.U() == V.AbstractC1701c.a()) {
                    c6.X(null);
                    return kVar;
                }
            }
            if (kVar instanceof p051f0.D) {
                p051f0.D d6 = (p051f0.D) kVar;
                if (d6.C() == V.AbstractC1701c.a()) {
                    d6.F(null);
                    return kVar;
                }
            }
            p051f0.k kVarE = p051f0.p.E(kVar, null, false, 6, null);
            kVarE.l();
            return kVarE;
        }

        public final void g() {
            p051f0.p.H().o();
        }

        public final java.lang.Object h(p237x7.l lVar, p237x7.l lVar2, p237x7.a aVar) {
            p051f0.k c6;
            if (lVar == null && lVar2 == null) {
                return aVar.b();
            }
            p051f0.k kVar = (p051f0.k) p051f0.p.f44847b.a();
            if (kVar instanceof p051f0.C) {
                p051f0.C c10 = (p051f0.C) kVar;
                if (c10.U() == V.AbstractC1701c.a()) {
                    p237x7.l lVarH = c10.h();
                    p237x7.l lVarK = c10.k();
                    try {
                        ((p051f0.C) kVar).X(p051f0.p.L(lVar, lVarH, false, 4, null));
                        ((p051f0.C) kVar).Y(p051f0.p.M(lVar2, lVarK));
                        return aVar.b();
                    } finally {
                        c10.X(lVarH);
                        c10.Y(lVarK);
                    }
                }
            }
            if (kVar == null || (kVar instanceof p051f0.C6541c)) {
                c6 = new p051f0.C(kVar instanceof p051f0.C6541c ? (p051f0.C6541c) kVar : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.b();
                }
                c6 = kVar.x(lVar);
            }
            try {
                p051f0.k kVarL = c6.l();
                try {
                    java.lang.Object objB = aVar.b();
                    c6.s(kVarL);
                    c6.d();
                    return objB;
                } catch (java.lang.Throwable th) {
                    c6.s(kVarL);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                c6.d();
                throw th2;
            }
        }

        public final p051f0.f i(final p237x7.p pVar) {
            p051f0.p.A(p051f0.p.f44846a);
            synchronized (p051f0.p.I()) {
                p051f0.p.f44853h = p097j7.AbstractC6879v.D0(p051f0.p.f44853h, pVar);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            return new p051f0.f() { // from class: f0.j
                @Override // p051f0.f
                public final void e() {
                    f0.k.a.j(pVar);
                }
            };
        }

        public final p051f0.f k(final p237x7.l lVar) {
            synchronized (p051f0.p.I()) {
                p051f0.p.f44854i = p097j7.AbstractC6879v.D0(p051f0.p.f44854i, lVar);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p051f0.p.B();
            return new p051f0.f() { // from class: f0.i
                @Override // p051f0.f
                public final void e() {
                    f0.k.a.l(lVar);
                }
            };
        }

        public final void m(p051f0.k kVar, p051f0.k kVar2, p237x7.l lVar) {
            if (kVar != kVar2) {
                kVar2.s(kVar);
                kVar2.d();
            } else if (kVar instanceof p051f0.C) {
                ((p051f0.C) kVar).X(lVar);
            } else {
                if (kVar instanceof p051f0.D) {
                    ((p051f0.D) kVar).F(lVar);
                    return;
                }
                throw new java.lang.IllegalStateException(("Non-transparent snapshot was reused: " + kVar).toString());
            }
        }

        public final void n() {
            boolean z6;
            synchronized (p051f0.p.I()) {
                p170r.L lE = ((p051f0.C6539a) p051f0.p.f44855j.get()).E();
                z6 = false;
                if (lE != null && lE.e()) {
                    z6 = true;
                }
            }
            if (z6) {
                p051f0.p.B();
            }
        }

        public final p051f0.C6541c o(p237x7.l lVar, p237x7.l lVar2) {
            p051f0.C6541c c6541cQ;
            p051f0.k kVarH = p051f0.p.H();
            p051f0.C6541c c6541c = kVarH instanceof p051f0.C6541c ? (p051f0.C6541c) kVarH : null;
            if (c6541c == null || (c6541cQ = c6541c.Q(lVar, lVar2)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return c6541cQ;
        }

        public final p051f0.k p(p237x7.l lVar) {
            return p051f0.p.H().x(lVar);
        }
    }

    private k(int i6, p051f0.n nVar) {
        this.f44823a = nVar;
        this.f44824b = i6;
        this.f44826d = i6 != 0 ? p051f0.p.c0(i6, g()) : -1;
    }

    public /* synthetic */ k(int i6, p051f0.n nVar, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, nVar);
    }

    public final void b() {
        synchronized (p051f0.p.I()) {
            c();
            r();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public void c() {
        p051f0.p.f44849d = p051f0.p.f44849d.C(f());
    }

    public void d() {
        this.f44825c = true;
        synchronized (p051f0.p.I()) {
            q();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    public final boolean e() {
        return this.f44825c;
    }

    public int f() {
        return this.f44824b;
    }

    public p051f0.n g() {
        return this.f44823a;
    }

    public abstract p237x7.l h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract p237x7.l k();

    public p051f0.k l() {
        p051f0.k kVar = (p051f0.k) p051f0.p.f44847b.a();
        p051f0.p.f44847b.b(this);
        return kVar;
    }

    public abstract void m(p051f0.k kVar);

    public abstract void n(p051f0.k kVar);

    public abstract void o();

    public abstract void p(p051f0.y yVar);

    public final void q() {
        int i6 = this.f44826d;
        if (i6 >= 0) {
            p051f0.p.Y(i6);
            this.f44826d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(p051f0.k kVar) {
        p051f0.p.f44847b.b(kVar);
    }

    public final void t(boolean z6) {
        this.f44825c = z6;
    }

    public void u(int i6) {
        this.f44824b = i6;
    }

    public void v(p051f0.n nVar) {
        this.f44823a = nVar;
    }

    public void w(int i6) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract p051f0.k x(p237x7.l lVar);

    public final int y() {
        int i6 = this.f44826d;
        this.f44826d = -1;
        return i6;
    }

    public final void z() {
        if (!this.f44825c) {
            return;
        }
        V.I0.a("Cannot use a disposed snapshot");
    }
}
