package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.ktor.utils.io.d, io.ktor.utils.io.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f47596g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.utils.io.a.class, java.lang.Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f47597h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.utils.io.a.class, java.lang.Object.class, "_closedCause");
    volatile /* synthetic */ java.lang.Object _closedCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p149o9.a f47599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f47600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p149o9.a f47601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p149o9.a f47602f;
    private volatile int flushBufferSize;
    volatile /* synthetic */ java.lang.Object suspensionSlot;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    private interface InterfaceC0605a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final io.ktor.utils.io.a.InterfaceC0605a.b f47603a = io.ktor.utils.io.a.InterfaceC0605a.b.f47605a;

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$a, reason: collision with other inner class name */
        public static final class C0606a implements io.ktor.utils.io.a.InterfaceC0605a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.lang.Throwable f47604b;

            public C0606a(java.lang.Throwable th) {
                this.f47604b = th;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof io.ktor.utils.io.a.InterfaceC0605a.C0606a) && p247y7.AbstractC7350t.b(this.f47604b, ((io.ktor.utils.io.a.InterfaceC0605a.C0606a) obj).f47604b);
            }

            public final java.lang.Throwable f() {
                return this.f47604b;
            }

            public int hashCode() {
                java.lang.Throwable th = this.f47604b;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public java.lang.String toString() {
                return "Closed(cause=" + this.f47604b + ')';
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ io.ktor.utils.io.a.InterfaceC0605a.b f47605a = new io.ktor.utils.io.a.InterfaceC0605a.b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final io.ktor.utils.io.a.InterfaceC0605a.C0606a f47606b = new io.ktor.utils.io.a.InterfaceC0605a.C0606a(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final java.lang.Object f47607c;

            static {
                i7.w.a aVar = p087i7.w.f46751D;
                f47607c = p087i7.w.b(p087i7.M.f46721a);
            }

            private b() {
            }

            public final io.ktor.utils.io.a.InterfaceC0605a.C0606a a() {
                return f47606b;
            }

            public final java.lang.Object b() {
                return f47607c;
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$c */
        public static final class c implements io.ktor.utils.io.a.InterfaceC0605a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final io.ktor.utils.io.a.InterfaceC0605a.c f47608b = new io.ktor.utils.io.a.InterfaceC0605a.c();

            private c() {
            }

            public boolean equals(java.lang.Object obj) {
                return this == obj || (obj instanceof io.ktor.utils.io.a.InterfaceC0605a.c);
            }

            public int hashCode() {
                return -231472095;
            }

            public java.lang.String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$d */
        public static final class d implements io.ktor.utils.io.a.InterfaceC0605a.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final p127m7.e f47609b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private java.lang.Throwable f47610c;

            public d(p127m7.e eVar) {
                p247y7.AbstractC7350t.f(eVar, "continuation");
                this.f47609b = eVar;
                if (io.ktor.utils.io.c.a()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("ReadTask 0x");
                    java.lang.String string = java.lang.Integer.toString(e().hashCode(), S8.AbstractC1628a.a(16));
                    p247y7.AbstractC7350t.e(string, "toString(...)");
                    sb.append(string);
                    java.lang.Throwable th = new java.lang.Throwable(sb.toString());
                    p087i7.AbstractC6661g.b(th);
                    f(th);
                }
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public java.lang.String a() {
                return "read";
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public void b(java.lang.Throwable th) {
                io.ktor.utils.io.a.InterfaceC0605a.e.C0607a.b(this, th);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public void c() {
                io.ktor.utils.io.a.InterfaceC0605a.e.C0607a.a(this);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public java.lang.Throwable d() {
                return this.f47610c;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public p127m7.e e() {
                return this.f47609b;
            }

            public void f(java.lang.Throwable th) {
                this.f47610c = th;
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e */
        public interface e extends io.ktor.utils.io.a.InterfaceC0605a {

            /* JADX INFO: renamed from: io.ktor.utils.io.a$a$e$a, reason: collision with other inner class name */
            public static final class C0607a {
                public static void a(io.ktor.utils.io.a.InterfaceC0605a.e eVar) {
                    eVar.e().t(io.ktor.utils.io.a.InterfaceC0605a.f47603a.b());
                }

                public static void b(io.ktor.utils.io.a.InterfaceC0605a.e eVar, java.lang.Throwable th) {
                    java.lang.Object objB;
                    p127m7.e eVarE = eVar.e();
                    if (th != null) {
                        i7.w.a aVar = p087i7.w.f46751D;
                        objB = p087i7.w.b(p087i7.x.a(th));
                    } else {
                        objB = io.ktor.utils.io.a.InterfaceC0605a.f47603a.b();
                    }
                    eVarE.t(objB);
                }
            }

            java.lang.String a();

            void b(java.lang.Throwable th);

            void c();

            java.lang.Throwable d();

            p127m7.e e();
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.a$a$f */
        public static final class f implements io.ktor.utils.io.a.InterfaceC0605a.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final p127m7.e f47611b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private java.lang.Throwable f47612c;

            public f(p127m7.e eVar) {
                p247y7.AbstractC7350t.f(eVar, "continuation");
                this.f47611b = eVar;
                if (io.ktor.utils.io.c.a()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("WriteTask 0x");
                    java.lang.String string = java.lang.Integer.toString(e().hashCode(), S8.AbstractC1628a.a(16));
                    p247y7.AbstractC7350t.e(string, "toString(...)");
                    sb.append(string);
                    java.lang.Throwable th = new java.lang.Throwable(sb.toString());
                    p087i7.AbstractC6661g.b(th);
                    f(th);
                }
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public java.lang.String a() {
                return "write";
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public void b(java.lang.Throwable th) {
                io.ktor.utils.io.a.InterfaceC0605a.e.C0607a.b(this, th);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public void c() {
                io.ktor.utils.io.a.InterfaceC0605a.e.C0607a.a(this);
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public java.lang.Throwable d() {
                return this.f47612c;
            }

            @Override // io.ktor.utils.io.a.InterfaceC0605a.e
            public p127m7.e e() {
                return this.f47611b;
            }

            public void f(java.lang.Throwable th) {
                this.f47612c = th;
            }
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f47613F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f47614G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f47615H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f47616I;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f47618K;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f47616I = obj;
            this.f47618K |= Integer.MIN_VALUE;
            return io.ktor.utils.io.a.this.f(0, this);
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f47619F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f47620G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f47621H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f47623J;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f47621H = obj;
            this.f47623J |= Integer.MIN_VALUE;
            return io.ktor.utils.io.a.this.g(this);
        }
    }

    static final class d extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f47624F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f47625G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f47627I;

        d(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f47625G = obj;
            this.f47627I |= Integer.MIN_VALUE;
            return io.ktor.utils.io.a.this.e(this);
        }
    }

    public a(boolean z6) {
        this.f47598b = z6;
        this.f47599c = new p149o9.a();
        this.f47600d = new java.lang.Object();
        this.suspensionSlot = io.ktor.utils.io.a.InterfaceC0605a.c.f47608b;
        this.f47601e = new p149o9.a();
        this.f47602f = new p149o9.a();
        this._closedCause = null;
    }

    public /* synthetic */ a(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6);
    }

    private final void l(java.lang.Throwable th) {
        io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a = (io.ktor.utils.io.a.InterfaceC0605a) f47596g.getAndSet(this, th != null ? new io.ktor.utils.io.a.InterfaceC0605a.C0606a(th) : io.ktor.utils.io.a.InterfaceC0605a.f47603a.a());
        if (interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.e) {
            ((io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a).b(th);
        }
    }

    private final void o() {
        synchronized (this.f47600d) {
            this.f47599c.t(this.f47601e);
            this.flushBufferSize = 0;
            p087i7.M m6 = p087i7.M.f46721a;
        }
        io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a = (io.ktor.utils.io.a.InterfaceC0605a) this.suspensionSlot;
        if ((interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.f) && androidx.concurrent.futures.b.a(f47596g, this, interfaceC0605a, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
            ((io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a).c();
        }
    }

    @Override // io.ktor.utils.io.d
    public java.lang.Throwable a() {
        io.ktor.utils.io.n nVar = (io.ktor.utils.io.n) this._closedCause;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.g
    public boolean b() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.g
    public p149o9.p c() throws java.lang.Throwable {
        java.lang.Throwable thA = a();
        if (thA != null) {
            throw thA;
        }
        if (b()) {
            throw new java.io.IOException("Channel is closed for write");
        }
        return this.f47602f;
    }

    @Override // io.ktor.utils.io.d
    public p149o9.q d() throws java.lang.Throwable {
        java.lang.Throwable thA = a();
        if (thA != null) {
            throw thA;
        }
        if (this.f47601e.j()) {
            o();
        }
        return this.f47601e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.g
    public java.lang.Object e(p127m7.e eVar) {
        io.ktor.utils.io.a.d dVar;
        io.ktor.utils.io.a aVar;
        if (eVar instanceof io.ktor.utils.io.a.d) {
            dVar = (io.ktor.utils.io.a.d) eVar;
            int i6 = dVar.f47627I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f47627I = i6 - Integer.MIN_VALUE;
            } else {
                dVar = new io.ktor.utils.io.a.d(eVar);
            }
        } else {
            dVar = new io.ktor.utils.io.a.d(eVar);
        }
        java.lang.Object obj = dVar.f47625G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = dVar.f47627I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            try {
                i7.w.a aVar2 = p087i7.w.f46751D;
                dVar.f47624F = this;
                dVar.f47627I = 1;
                if (g(dVar) == objG) {
                    return objG;
                }
                aVar = this;
            } catch (java.lang.Throwable th) {
                th = th;
                aVar = this;
                i7.w.a aVar3 = p087i7.w.f46751D;
                p087i7.w.b(p087i7.x.a(th));
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.ktor.utils.io.a) dVar.f47624F;
            try {
                p087i7.x.b(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                i7.w.a aVar4 = p087i7.w.f46751D;
                p087i7.w.b(p087i7.x.a(th));
            }
        }
        p087i7.w.b(p087i7.M.f46721a);
        if (!androidx.concurrent.futures.b.a(f47597h, aVar, null, io.ktor.utils.io.o.a())) {
            return p087i7.M.f46721a;
        }
        aVar.l(null);
        return p087i7.M.f46721a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.d
    public java.lang.Object f(int i6, p127m7.e eVar) throws java.lang.Throwable {
        io.ktor.utils.io.a.b bVar;
        io.ktor.utils.io.a aVar;
        io.ktor.utils.io.a aVar2;
        java.lang.Object objX;
        if (eVar instanceof io.ktor.utils.io.a.b) {
            bVar = (io.ktor.utils.io.a.b) eVar;
            int i10 = bVar.f47618K;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f47618K = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new io.ktor.utils.io.a.b(eVar);
            }
        } else {
            bVar = new io.ktor.utils.io.a.b(eVar);
        }
        java.lang.Object obj = bVar.f47616I;
        java.lang.Object objG = p137n7.b.g();
        int i11 = bVar.f47618K;
        if (i11 == 0) {
            p087i7.x.b(obj);
            io.ktor.utils.io.f.g(this);
            if (this.f47601e.r() >= i6) {
                return p147o7.b.a(true);
            }
            aVar = this;
            aVar2 = aVar;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i6 = bVar.f47615H;
            aVar = (io.ktor.utils.io.a) bVar.f47614G;
            aVar2 = (io.ktor.utils.io.a) bVar.f47613F;
            p087i7.x.b(obj);
        }
        do {
            long j6 = i6;
            if (((long) aVar2.flushBufferSize) + aVar2.f47601e.r() >= j6 || aVar2._closedCause != null) {
                if (aVar2.f47601e.r() < 1048576) {
                    aVar2.o();
                }
                return p147o7.b.a(aVar2.f47601e.r() >= j6);
            }
            bVar.f47613F = aVar2;
            bVar.f47614G = aVar;
            bVar.f47615H = i6;
            bVar.f47618K = 1;
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(bVar), 1);
            c1798n.E();
            io.ktor.utils.io.a.InterfaceC0605a.e dVar = new io.ktor.utils.io.a.InterfaceC0605a.d(c1798n);
            io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a = (io.ktor.utils.io.a.InterfaceC0605a) aVar.suspensionSlot;
            boolean z6 = interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.C0606a;
            if (z6 || androidx.concurrent.futures.b.a(f47596g, aVar, interfaceC0605a, dVar)) {
                if (interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.d) {
                    io.ktor.utils.io.a.InterfaceC0605a.e eVar2 = (io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a;
                    eVar2.b(new io.ktor.utils.io.p(dVar.a(), eVar2.d()));
                } else if (interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.e) {
                    ((io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a).c();
                } else if (z6) {
                    dVar.b(((io.ktor.utils.io.a.InterfaceC0605a.C0606a) interfaceC0605a).f());
                } else if (!p247y7.AbstractC7350t.b(interfaceC0605a, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
                    throw new p087i7.s();
                }
                if (((long) aVar2.flushBufferSize) + aVar2.f47601e.r() >= j6 || aVar2._closedCause != null) {
                    io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a2 = (io.ktor.utils.io.a.InterfaceC0605a) aVar.suspensionSlot;
                    if ((interfaceC0605a2 instanceof io.ktor.utils.io.a.InterfaceC0605a.d) && androidx.concurrent.futures.b.a(f47596g, aVar, interfaceC0605a2, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
                        dVar = (io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a2;
                        dVar.c();
                    }
                }
            } else {
                dVar.c();
            }
            objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(bVar);
            }
        } while (objX != objG);
        return objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.g
    public java.lang.Object g(p127m7.e eVar) throws java.lang.Throwable {
        io.ktor.utils.io.a.c cVar;
        io.ktor.utils.io.a aVar;
        io.ktor.utils.io.a aVar2;
        if (eVar instanceof io.ktor.utils.io.a.c) {
            cVar = (io.ktor.utils.io.a.c) eVar;
            int i6 = cVar.f47623J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f47623J = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new io.ktor.utils.io.a.c(eVar);
            }
        } else {
            cVar = new io.ktor.utils.io.a.c(eVar);
        }
        java.lang.Object obj = cVar.f47621H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f47623J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            io.ktor.utils.io.f.g(this);
            m();
            if (this.flushBufferSize < 1048576) {
                return p087i7.M.f46721a;
            }
            aVar = this;
            aVar2 = aVar;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.ktor.utils.io.a) cVar.f47620G;
            aVar2 = (io.ktor.utils.io.a) cVar.f47619F;
            p087i7.x.b(obj);
        }
        while (aVar2.flushBufferSize >= 1048576 && aVar2._closedCause == null) {
            cVar.f47619F = aVar2;
            cVar.f47620G = aVar;
            cVar.f47623J = 1;
            W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(cVar), 1);
            c1798n.E();
            io.ktor.utils.io.a.InterfaceC0605a.e fVar = new io.ktor.utils.io.a.InterfaceC0605a.f(c1798n);
            io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a = (io.ktor.utils.io.a.InterfaceC0605a) aVar.suspensionSlot;
            boolean z6 = interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.C0606a;
            if (z6 || androidx.concurrent.futures.b.a(f47596g, aVar, interfaceC0605a, fVar)) {
                if (interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.f) {
                    io.ktor.utils.io.a.InterfaceC0605a.e eVar2 = (io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a;
                    eVar2.b(new io.ktor.utils.io.p(fVar.a(), eVar2.d()));
                } else if (interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.e) {
                    ((io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a).c();
                } else if (z6) {
                    fVar.b(((io.ktor.utils.io.a.InterfaceC0605a.C0606a) interfaceC0605a).f());
                } else if (!p247y7.AbstractC7350t.b(interfaceC0605a, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
                    throw new p087i7.s();
                }
                if (aVar2.flushBufferSize < 1048576 || aVar2._closedCause != null) {
                    io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a2 = (io.ktor.utils.io.a.InterfaceC0605a) aVar.suspensionSlot;
                    if ((interfaceC0605a2 instanceof io.ktor.utils.io.a.InterfaceC0605a.f) && androidx.concurrent.futures.b.a(f47596g, aVar, interfaceC0605a2, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
                        fVar = (io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a2;
                        fVar.c();
                    }
                }
            } else {
                fVar.c();
            }
            java.lang.Object objX = c1798n.x();
            if (objX == p137n7.b.g()) {
                p147o7.h.c(cVar);
            }
            if (objX == objG) {
                return objG;
            }
        }
        return p087i7.M.f46721a;
    }

    @Override // io.ktor.utils.io.d
    public boolean h() {
        return a() != null || (b() && this.flushBufferSize == 0 && this.f47601e.j());
    }

    @Override // io.ktor.utils.io.d
    public void k(java.lang.Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        io.ktor.utils.io.n nVar = new io.ktor.utils.io.n(th);
        androidx.concurrent.futures.b.a(f47597h, this, null, nVar);
        l(nVar.a());
    }

    public void m() {
        if (this.f47602f.j()) {
            return;
        }
        synchronized (this.f47600d) {
            int iR = (int) this.f47602f.r();
            this.f47599c.X(this.f47602f);
            this.flushBufferSize += iR;
            p087i7.M m6 = p087i7.M.f46721a;
        }
        io.ktor.utils.io.a.InterfaceC0605a interfaceC0605a = (io.ktor.utils.io.a.InterfaceC0605a) this.suspensionSlot;
        if ((interfaceC0605a instanceof io.ktor.utils.io.a.InterfaceC0605a.d) && androidx.concurrent.futures.b.a(f47596g, this, interfaceC0605a, io.ktor.utils.io.a.InterfaceC0605a.c.f47608b)) {
            ((io.ktor.utils.io.a.InterfaceC0605a.e) interfaceC0605a).c();
        }
    }

    public final boolean n() {
        return this.f47598b;
    }

    public java.lang.String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
