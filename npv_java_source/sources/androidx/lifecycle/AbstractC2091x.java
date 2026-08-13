package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2091x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final java.lang.Object f22852k = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object f22853a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p140o.b f22854b = new p140o.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22855c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile java.lang.Object f22857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile java.lang.Object f22858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.Runnable f22862j;

    /* JADX INFO: renamed from: androidx.lifecycle.x$a */
    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.Object obj;
            synchronized (androidx.lifecycle.AbstractC2091x.this.f22853a) {
                obj = androidx.lifecycle.AbstractC2091x.this.f22858f;
                androidx.lifecycle.AbstractC2091x.this.f22858f = androidx.lifecycle.AbstractC2091x.f22852k;
            }
            androidx.lifecycle.AbstractC2091x.this.n(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$b */
    private class b extends androidx.lifecycle.AbstractC2091x.d {
        b(androidx.lifecycle.A a6) {
            super(a6);
        }

        @Override // androidx.lifecycle.AbstractC2091x.d
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$c */
    class c extends androidx.lifecycle.AbstractC2091x.d implements androidx.lifecycle.InterfaceC2083o {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final androidx.lifecycle.r f22865G;

        c(androidx.lifecycle.r rVar, androidx.lifecycle.A a6) {
            super(a6);
            this.f22865G = rVar;
        }

        @Override // androidx.lifecycle.AbstractC2091x.d
        void b() {
            this.f22865G.u().d(this);
        }

        @Override // androidx.lifecycle.AbstractC2091x.d
        boolean c(androidx.lifecycle.r rVar) {
            return this.f22865G == rVar;
        }

        @Override // androidx.lifecycle.AbstractC2091x.d
        boolean d() {
            return this.f22865G.u().b().g(androidx.lifecycle.AbstractC2079k.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            androidx.lifecycle.AbstractC2079k.b bVarB = this.f22865G.u().b();
            if (bVarB == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
                androidx.lifecycle.AbstractC2091x.this.m(this.f22867C);
                return;
            }
            androidx.lifecycle.AbstractC2079k.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f22865G.u().b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$d */
    private abstract class d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final androidx.lifecycle.A f22867C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f22868D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f22869E = -1;

        d(androidx.lifecycle.A a6) {
            this.f22867C = a6;
        }

        void a(boolean z6) {
            if (z6 == this.f22868D) {
                return;
            }
            this.f22868D = z6;
            androidx.lifecycle.AbstractC2091x.this.c(z6 ? 1 : -1);
            if (this.f22868D) {
                androidx.lifecycle.AbstractC2091x.this.e(this);
            }
        }

        void b() {
        }

        boolean c(androidx.lifecycle.r rVar) {
            return false;
        }

        abstract boolean d();
    }

    public AbstractC2091x() {
        java.lang.Object obj = f22852k;
        this.f22858f = obj;
        this.f22862j = new androidx.lifecycle.AbstractC2091x.a();
        this.f22857e = obj;
        this.f22859g = -1;
    }

    static void b(java.lang.String str) {
        if (p130n.c.g().b()) {
            return;
        }
        throw new java.lang.IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(androidx.lifecycle.AbstractC2091x.d dVar) {
        if (dVar.f22868D) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i6 = dVar.f22869E;
            int i10 = this.f22859g;
            if (i6 >= i10) {
                return;
            }
            dVar.f22869E = i10;
            dVar.f22867C.a(this.f22857e);
        }
    }

    void c(int i6) {
        int i10 = this.f22855c;
        this.f22855c = i6 + i10;
        if (this.f22856d) {
            return;
        }
        this.f22856d = true;
        while (true) {
            try {
                int i11 = this.f22855c;
                if (i10 == i11) {
                    this.f22856d = false;
                    return;
                }
                boolean z6 = i10 == 0 && i11 > 0;
                boolean z10 = i10 > 0 && i11 == 0;
                if (z6) {
                    j();
                } else if (z10) {
                    k();
                }
                i10 = i11;
            } catch (java.lang.Throwable th) {
                this.f22856d = false;
                throw th;
            }
        }
    }

    void e(androidx.lifecycle.AbstractC2091x.d dVar) {
        if (this.f22860h) {
            this.f22861i = true;
            return;
        }
        this.f22860h = true;
        do {
            this.f22861i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                o.b.d dVarF = this.f22854b.f();
                while (dVarF.hasNext()) {
                    d((androidx.lifecycle.AbstractC2091x.d) ((java.util.Map.Entry) dVarF.next()).getValue());
                    if (this.f22861i) {
                        break;
                    }
                }
            }
        } while (this.f22861i);
        this.f22860h = false;
    }

    public java.lang.Object f() {
        java.lang.Object obj = this.f22857e;
        if (obj != f22852k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f22855c > 0;
    }

    public void h(androidx.lifecycle.r rVar, androidx.lifecycle.A a6) {
        b("observe");
        if (rVar.u().b() == androidx.lifecycle.AbstractC2079k.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.AbstractC2091x.c cVar = new androidx.lifecycle.AbstractC2091x.c(rVar, a6);
        androidx.lifecycle.AbstractC2091x.d dVar = (androidx.lifecycle.AbstractC2091x.d) this.f22854b.o(a6, cVar);
        if (dVar != null && !dVar.c(rVar)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        rVar.u().a(cVar);
    }

    public void i(androidx.lifecycle.A a6) {
        b("observeForever");
        androidx.lifecycle.AbstractC2091x.b bVar = new androidx.lifecycle.AbstractC2091x.b(a6);
        androidx.lifecycle.AbstractC2091x.d dVar = (androidx.lifecycle.AbstractC2091x.d) this.f22854b.o(a6, bVar);
        if (dVar instanceof androidx.lifecycle.AbstractC2091x.c) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(java.lang.Object obj) {
        boolean z6;
        synchronized (this.f22853a) {
            z6 = this.f22858f == f22852k;
            this.f22858f = obj;
        }
        if (z6) {
            p130n.c.g().c(this.f22862j);
        }
    }

    public void m(androidx.lifecycle.A a6) {
        b("removeObserver");
        androidx.lifecycle.AbstractC2091x.d dVar = (androidx.lifecycle.AbstractC2091x.d) this.f22854b.s(a6);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(java.lang.Object obj) {
        b("setValue");
        this.f22859g++;
        this.f22857e = obj;
        e(null);
    }
}
