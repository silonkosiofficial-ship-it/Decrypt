package P9;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements java.io.Closeable {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final P9.f.b f8553e0 = new P9.f.b(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final P9.m f8554f0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f8555C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final P9.f.c f8556D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Map f8557E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f8558F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8559G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f8560H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f8561I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final L9.e f8562J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final L9.d f8563K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final L9.d f8564L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final L9.d f8565M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final P9.l f8566N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f8567O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f8568P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f8569Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f8570R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f8571S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f8572T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final P9.m f8573U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private P9.m f8574V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private long f8575W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f8576X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f8577Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f8578Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final java.net.Socket f8579a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final P9.j f8580b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final P9.f.d f8581c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final java.util.Set f8582d0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final L9.e f8584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public java.net.Socket f8585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.String f8586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public X9.InterfaceC1838f f8587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public X9.InterfaceC1837e f8588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private P9.f.c f8589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private P9.l f8590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8591i;

        public a(boolean z6, L9.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "taskRunner");
            this.f8583a = z6;
            this.f8584b = eVar;
            this.f8589g = P9.f.c.f8593b;
            this.f8590h = P9.l.f8695b;
        }

        public final P9.f a() {
            return new P9.f(this);
        }

        public final boolean b() {
            return this.f8583a;
        }

        public final java.lang.String c() {
            java.lang.String str = this.f8586d;
            if (str != null) {
                return str;
            }
            p247y7.AbstractC7350t.p("connectionName");
            return null;
        }

        public final P9.f.c d() {
            return this.f8589g;
        }

        public final int e() {
            return this.f8591i;
        }

        public final P9.l f() {
            return this.f8590h;
        }

        public final X9.InterfaceC1837e g() {
            X9.InterfaceC1837e interfaceC1837e = this.f8588f;
            if (interfaceC1837e != null) {
                return interfaceC1837e;
            }
            p247y7.AbstractC7350t.p("sink");
            return null;
        }

        public final java.net.Socket h() {
            java.net.Socket socket = this.f8585c;
            if (socket != null) {
                return socket;
            }
            p247y7.AbstractC7350t.p("socket");
            return null;
        }

        public final X9.InterfaceC1838f i() {
            X9.InterfaceC1838f interfaceC1838f = this.f8587e;
            if (interfaceC1838f != null) {
                return interfaceC1838f;
            }
            p247y7.AbstractC7350t.p("source");
            return null;
        }

        public final L9.e j() {
            return this.f8584b;
        }

        public final P9.f.a k(P9.f.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "listener");
            this.f8589g = cVar;
            return this;
        }

        public final P9.f.a l(int i6) {
            this.f8591i = i6;
            return this;
        }

        public final void m(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<set-?>");
            this.f8586d = str;
        }

        public final void n(X9.InterfaceC1837e interfaceC1837e) {
            p247y7.AbstractC7350t.f(interfaceC1837e, "<set-?>");
            this.f8588f = interfaceC1837e;
        }

        public final void o(java.net.Socket socket) {
            p247y7.AbstractC7350t.f(socket, "<set-?>");
            this.f8585c = socket;
        }

        public final void p(X9.InterfaceC1838f interfaceC1838f) {
            p247y7.AbstractC7350t.f(interfaceC1838f, "<set-?>");
            this.f8587e = interfaceC1838f;
        }

        public final P9.f.a q(java.net.Socket socket, java.lang.String str, X9.InterfaceC1838f interfaceC1838f, X9.InterfaceC1837e interfaceC1837e) {
            java.lang.StringBuilder sb;
            p247y7.AbstractC7350t.f(socket, "socket");
            p247y7.AbstractC7350t.f(str, "peerName");
            p247y7.AbstractC7350t.f(interfaceC1838f, "source");
            p247y7.AbstractC7350t.f(interfaceC1837e, "sink");
            o(socket);
            if (this.f8583a) {
                sb = new java.lang.StringBuilder();
                sb.append(I9.d.f5555i);
                sb.append(' ');
            } else {
                sb = new java.lang.StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            m(sb.toString());
            p(interfaceC1838f);
            n(interfaceC1837e);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final P9.m a() {
            return P9.f.f8554f0;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final P9.f.c.b f8592a = new P9.f.c.b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final P9.f.c f8593b = new P9.f.c.a();

        public static final class a extends P9.f.c {
            a() {
            }

            @Override // P9.f.c
            public void b(P9.i iVar) {
                p247y7.AbstractC7350t.f(iVar, "stream");
                iVar.d(P9.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        public void a(P9.f fVar, P9.m mVar) {
            p247y7.AbstractC7350t.f(fVar, "connection");
            p247y7.AbstractC7350t.f(mVar, "settings");
        }

        public abstract void b(P9.i iVar);
    }

    public final class d implements P9.h.c, p237x7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final P9.h f8594C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ P9.f f8595D;

        public static final class a extends L9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ P9.f f8596e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p247y7.O f8597f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.String str, boolean z6, P9.f fVar, p247y7.O o6) {
                super(str, z6);
                this.f8596e = fVar;
                this.f8597f = o6;
            }

            @Override // L9.a
            public long f() {
                this.f8596e.E0().a(this.f8596e, (P9.m) this.f8597f.f57254C);
                return -1L;
            }
        }

        public static final class b extends L9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ P9.f f8598e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ P9.i f8599f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(java.lang.String str, boolean z6, P9.f fVar, P9.i iVar) {
                super(str, z6);
                this.f8598e = fVar;
                this.f8599f = iVar;
            }

            @Override // L9.a
            public long f() {
                try {
                    this.f8598e.E0().b(this.f8599f);
                    return -1L;
                } catch (java.io.IOException e6) {
                    Q9.k.f9149a.g().j("Http2Connection.Listener failure for " + this.f8598e.y0(), 4, e6);
                    try {
                        this.f8599f.d(P9.b.PROTOCOL_ERROR, e6);
                        return -1L;
                    } catch (java.io.IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends L9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ P9.f f8600e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f8601f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f8602g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(java.lang.String str, boolean z6, P9.f fVar, int i6, int i10) {
                super(str, z6);
                this.f8600e = fVar;
                this.f8601f = i6;
                this.f8602g = i10;
            }

            @Override // L9.a
            public long f() {
                this.f8600e.H1(true, this.f8601f, this.f8602g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: P9.f$d$d, reason: collision with other inner class name */
        public static final class C0203d extends L9.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ P9.f.d f8603e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f8604f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ P9.m f8605g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0203d(java.lang.String str, boolean z6, P9.f.d dVar, boolean z10, P9.m mVar) {
                super(str, z6);
                this.f8603e = dVar;
                this.f8604f = z10;
                this.f8605g = mVar;
            }

            @Override // L9.a
            public long f() {
                this.f8603e.x(this.f8604f, this.f8605g);
                return -1L;
            }
        }

        public d(P9.f fVar, P9.h hVar) {
            p247y7.AbstractC7350t.f(hVar, "reader");
            this.f8595D = fVar;
            this.f8594C = hVar;
        }

        @Override // P9.h.c
        public void a() {
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() throws java.lang.Throwable {
            y();
            return p087i7.M.f46721a;
        }

        @Override // P9.h.c
        public void e(int i6, P9.b bVar, X9.C1839g c1839g) {
            int i10;
            java.lang.Object[] array;
            p247y7.AbstractC7350t.f(bVar, "errorCode");
            p247y7.AbstractC7350t.f(c1839g, "debugData");
            c1839g.I();
            P9.f fVar = this.f8595D;
            synchronized (fVar) {
                array = fVar.Y0().values().toArray(new P9.i[0]);
                fVar.f8561I = true;
                p087i7.M m6 = p087i7.M.f46721a;
            }
            for (P9.i iVar : (P9.i[]) array) {
                if (iVar.j() > i6 && iVar.t()) {
                    iVar.y(P9.b.REFUSED_STREAM);
                    this.f8595D.x1(iVar.j());
                }
            }
        }

        @Override // P9.h.c
        public void f(boolean z6, int i6, int i10, java.util.List list) {
            p247y7.AbstractC7350t.f(list, "headerBlock");
            if (this.f8595D.w1(i6)) {
                this.f8595D.t1(i6, list, z6);
                return;
            }
            P9.f fVar = this.f8595D;
            synchronized (fVar) {
                P9.i iVarR0 = fVar.R0(i6);
                if (iVarR0 != null) {
                    p087i7.M m6 = p087i7.M.f46721a;
                    iVarR0.x(I9.d.O(list), z6);
                    return;
                }
                if (fVar.f8561I) {
                    return;
                }
                if (i6 <= fVar.z0()) {
                    return;
                }
                if (i6 % 2 == fVar.H0() % 2) {
                    return;
                }
                P9.i iVar = new P9.i(i6, fVar, false, z6, I9.d.O(list));
                fVar.z1(i6);
                fVar.Y0().put(java.lang.Integer.valueOf(i6), iVar);
                fVar.f8562J.i().i(new P9.f.d.b(fVar.y0() + '[' + i6 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // P9.h.c
        public void g(int i6, long j6) {
            java.lang.Object obj;
            if (i6 == 0) {
                P9.f fVar = this.f8595D;
                synchronized (fVar) {
                    fVar.f8578Z = fVar.c1() + j6;
                    p247y7.AbstractC7350t.d(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    p087i7.M m6 = p087i7.M.f46721a;
                    obj = fVar;
                }
            } else {
                P9.i iVarR0 = this.f8595D.R0(i6);
                if (iVarR0 == null) {
                    return;
                }
                synchronized (iVarR0) {
                    iVarR0.a(j6);
                    p087i7.M m10 = p087i7.M.f46721a;
                    obj = iVarR0;
                }
            }
        }

        @Override // P9.h.c
        public void k(boolean z6, P9.m mVar) {
            p247y7.AbstractC7350t.f(mVar, "settings");
            this.f8595D.f8563K.i(new P9.f.d.C0203d(this.f8595D.y0() + " applyAndAckSettings", true, this, z6, mVar), 0L);
        }

        @Override // P9.h.c
        public void m(int i6, P9.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "errorCode");
            if (this.f8595D.w1(i6)) {
                this.f8595D.v1(i6, bVar);
                return;
            }
            P9.i iVarX1 = this.f8595D.x1(i6);
            if (iVarX1 != null) {
                iVarX1.y(bVar);
            }
        }

        @Override // P9.h.c
        public void n(boolean z6, int i6, X9.InterfaceC1838f interfaceC1838f, int i10) {
            p247y7.AbstractC7350t.f(interfaceC1838f, "source");
            if (this.f8595D.w1(i6)) {
                this.f8595D.m1(i6, interfaceC1838f, i10, z6);
                return;
            }
            P9.i iVarR0 = this.f8595D.R0(i6);
            if (iVarR0 == null) {
                this.f8595D.J1(i6, P9.b.PROTOCOL_ERROR);
                long j6 = i10;
                this.f8595D.E1(j6);
                interfaceC1838f.skip(j6);
                return;
            }
            iVarR0.w(interfaceC1838f, i10);
            if (z6) {
                iVarR0.x(I9.d.f5548b, true);
            }
        }

        @Override // P9.h.c
        public void p(boolean z6, int i6, int i10) {
            if (!z6) {
                this.f8595D.f8563K.i(new P9.f.d.c(this.f8595D.y0() + " ping", true, this.f8595D, i6, i10), 0L);
                return;
            }
            P9.f fVar = this.f8595D;
            synchronized (fVar) {
                try {
                    if (i6 == 1) {
                        fVar.f8568P++;
                    } else if (i6 != 2) {
                        if (i6 == 3) {
                            fVar.f8571S++;
                            p247y7.AbstractC7350t.d(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        p087i7.M m6 = p087i7.M.f46721a;
                    } else {
                        fVar.f8570R++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // P9.h.c
        public void s(int i6, int i10, int i11, boolean z6) {
        }

        @Override // P9.h.c
        public void t(int i6, int i10, java.util.List list) {
            p247y7.AbstractC7350t.f(list, "requestHeaders");
            this.f8595D.u1(i10, list);
        }

        public final void x(boolean z6, P9.m mVar) {
            long jC;
            int i6;
            P9.i[] iVarArr;
            p247y7.AbstractC7350t.f(mVar, "settings");
            p247y7.O o6 = new p247y7.O();
            P9.j jVarD1 = this.f8595D.d1();
            P9.f fVar = this.f8595D;
            synchronized (jVarD1) {
                synchronized (fVar) {
                    try {
                        P9.m mVarP0 = fVar.P0();
                        if (!z6) {
                            P9.m mVar2 = new P9.m();
                            mVar2.g(mVarP0);
                            mVar2.g(mVar);
                            mVar = mVar2;
                        }
                        o6.f57254C = mVar;
                        jC = ((long) mVar.c()) - ((long) mVarP0.c());
                        iVarArr = (jC == 0 || fVar.Y0().isEmpty()) ? null : (P9.i[]) fVar.Y0().values().toArray(new P9.i[0]);
                        fVar.A1((P9.m) o6.f57254C);
                        fVar.f8565M.i(new P9.f.d.a(fVar.y0() + " onSettings", true, fVar, o6), 0L);
                        p087i7.M m6 = p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                try {
                    fVar.d1().a((P9.m) o6.f57254C);
                } catch (java.io.IOException e6) {
                    fVar.u0(e6);
                }
                p087i7.M m10 = p087i7.M.f46721a;
            }
            if (iVarArr != null) {
                for (P9.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        p087i7.M m11 = p087i7.M.f46721a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [P9.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [P9.h, java.io.Closeable] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void y() throws java.lang.Throwable {
            P9.b bVar;
            P9.b bVar2 = P9.b.INTERNAL_ERROR;
            java.io.IOException e6 = null;
            try {
                try {
                    this.f8594C.g(this);
                    while (this.f8594C.f(false, this)) {
                    }
                    P9.b bVar3 = P9.b.NO_ERROR;
                    try {
                        this.f8595D.s0(bVar3, P9.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (java.io.IOException e10) {
                        e6 = e10;
                        P9.b bVar4 = P9.b.PROTOCOL_ERROR;
                        P9.f fVar = this.f8595D;
                        fVar.s0(bVar4, bVar4, e6);
                        bVar = fVar;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    this.f8595D.s0(bVar, bVar2, e6);
                    I9.d.m(this.f8594C);
                    throw th;
                }
            } catch (java.io.IOException e11) {
                e6 = e11;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f8595D.s0(bVar, bVar2, e6);
                I9.d.m(this.f8594C);
                throw th;
            }
            bVar2 = this.f8594C;
            I9.d.m(bVar2);
        }
    }

    public static final class e extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ X9.C1836d f8608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8610i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(java.lang.String str, boolean z6, P9.f fVar, int i6, X9.C1836d c1836d, int i10, boolean z10) {
            super(str, z6);
            this.f8606e = fVar;
            this.f8607f = i6;
            this.f8608g = c1836d;
            this.f8609h = i10;
            this.f8610i = z10;
        }

        @Override // L9.a
        public long f() {
            try {
                boolean zD = this.f8606e.f8566N.d(this.f8607f, this.f8608g, this.f8609h, this.f8610i);
                if (zD) {
                    this.f8606e.d1().N(this.f8607f, P9.b.CANCEL);
                }
                if (!zD && !this.f8610i) {
                    return -1L;
                }
                synchronized (this.f8606e) {
                    this.f8606e.f8582d0.remove(java.lang.Integer.valueOf(this.f8607f));
                }
                return -1L;
            } catch (java.io.IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: P9.f$f, reason: collision with other inner class name */
    public static final class C0204f extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ java.util.List f8613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8614h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0204f(java.lang.String str, boolean z6, P9.f fVar, int i6, java.util.List list, boolean z10) {
            super(str, z6);
            this.f8611e = fVar;
            this.f8612f = i6;
            this.f8613g = list;
            this.f8614h = z10;
        }

        @Override // L9.a
        public long f() {
            boolean zC = this.f8611e.f8566N.c(this.f8612f, this.f8613g, this.f8614h);
            if (zC) {
                try {
                    this.f8611e.d1().N(this.f8612f, P9.b.CANCEL);
                } catch (java.io.IOException unused) {
                    return -1L;
                }
            }
            if (!zC && !this.f8614h) {
                return -1L;
            }
            synchronized (this.f8611e) {
                this.f8611e.f8582d0.remove(java.lang.Integer.valueOf(this.f8612f));
            }
            return -1L;
        }
    }

    public static final class g extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ java.util.List f8617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(java.lang.String str, boolean z6, P9.f fVar, int i6, java.util.List list) {
            super(str, z6);
            this.f8615e = fVar;
            this.f8616f = i6;
            this.f8617g = list;
        }

        @Override // L9.a
        public long f() {
            if (!this.f8615e.f8566N.b(this.f8616f, this.f8617g)) {
                return -1L;
            }
            try {
                this.f8615e.d1().N(this.f8616f, P9.b.CANCEL);
                synchronized (this.f8615e) {
                    this.f8615e.f8582d0.remove(java.lang.Integer.valueOf(this.f8616f));
                }
                return -1L;
            } catch (java.io.IOException unused) {
                return -1L;
            }
        }
    }

    public static final class h extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ P9.b f8620g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(java.lang.String str, boolean z6, P9.f fVar, int i6, P9.b bVar) {
            super(str, z6);
            this.f8618e = fVar;
            this.f8619f = i6;
            this.f8620g = bVar;
        }

        @Override // L9.a
        public long f() {
            this.f8618e.f8566N.a(this.f8619f, this.f8620g);
            synchronized (this.f8618e) {
                this.f8618e.f8582d0.remove(java.lang.Integer.valueOf(this.f8619f));
                p087i7.M m6 = p087i7.M.f46721a;
            }
            return -1L;
        }
    }

    public static final class i extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8621e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(java.lang.String str, boolean z6, P9.f fVar) {
            super(str, z6);
            this.f8621e = fVar;
        }

        @Override // L9.a
        public long f() {
            this.f8621e.H1(false, 2, 0);
            return -1L;
        }
    }

    public static final class j extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f8623f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(java.lang.String str, P9.f fVar, long j6) {
            super(str, false, 2, null);
            this.f8622e = fVar;
            this.f8623f = j6;
        }

        @Override // L9.a
        public long f() {
            boolean z6;
            synchronized (this.f8622e) {
                if (this.f8622e.f8568P < this.f8622e.f8567O) {
                    z6 = true;
                } else {
                    this.f8622e.f8567O++;
                    z6 = false;
                }
            }
            P9.f fVar = this.f8622e;
            if (z6) {
                fVar.u0(null);
                return -1L;
            }
            fVar.H1(false, 1, 0);
            return this.f8623f;
        }
    }

    public static final class k extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ P9.b f8626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(java.lang.String str, boolean z6, P9.f fVar, int i6, P9.b bVar) {
            super(str, z6);
            this.f8624e = fVar;
            this.f8625f = i6;
            this.f8626g = bVar;
        }

        @Override // L9.a
        public long f() {
            try {
                this.f8624e.I1(this.f8625f, this.f8626g);
                return -1L;
            } catch (java.io.IOException e6) {
                this.f8624e.u0(e6);
                return -1L;
            }
        }
    }

    public static final class l extends L9.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ P9.f f8627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f8629g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(java.lang.String str, boolean z6, P9.f fVar, int i6, long j6) {
            super(str, z6);
            this.f8627e = fVar;
            this.f8628f = i6;
            this.f8629g = j6;
        }

        @Override // L9.a
        public long f() {
            try {
                this.f8627e.d1().e0(this.f8628f, this.f8629g);
                return -1L;
            } catch (java.io.IOException e6) {
                this.f8627e.u0(e6);
                return -1L;
            }
        }
    }

    static {
        P9.m mVar = new P9.m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f8554f0 = mVar;
    }

    public f(P9.f.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "builder");
        boolean zB = aVar.b();
        this.f8555C = zB;
        this.f8556D = aVar.d();
        this.f8557E = new java.util.LinkedHashMap();
        java.lang.String strC = aVar.c();
        this.f8558F = strC;
        this.f8560H = aVar.b() ? 3 : 2;
        L9.e eVarJ = aVar.j();
        this.f8562J = eVarJ;
        L9.d dVarI = eVarJ.i();
        this.f8563K = dVarI;
        this.f8564L = eVarJ.i();
        this.f8565M = eVarJ.i();
        this.f8566N = aVar.f();
        P9.m mVar = new P9.m();
        if (aVar.b()) {
            mVar.h(7, 16777216);
        }
        this.f8573U = mVar;
        P9.m mVar2 = f8554f0;
        this.f8574V = mVar2;
        this.f8578Z = mVar2.c();
        this.f8579a0 = aVar.h();
        this.f8580b0 = new P9.j(aVar.g(), zB);
        this.f8581c0 = new P9.f.d(this, new P9.h(aVar.i(), zB));
        this.f8582d0 = new java.util.LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(aVar.e());
            dVarI.i(new P9.f.j(strC + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void D1(P9.f fVar, boolean z6, L9.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        if ((i6 & 2) != 0) {
            eVar = L9.e.f6461i;
        }
        fVar.C1(z6, eVar);
    }

    private final P9.i f1(int i6, java.util.List list, boolean z6) {
        int i10;
        P9.i iVar;
        boolean z10;
        boolean z11 = !z6;
        synchronized (this.f8580b0) {
            try {
                synchronized (this) {
                    try {
                        if (this.f8560H > 1073741823) {
                            B1(P9.b.REFUSED_STREAM);
                        }
                        if (this.f8561I) {
                            throw new P9.a();
                        }
                        i10 = this.f8560H;
                        this.f8560H = i10 + 2;
                        iVar = new P9.i(i10, this, z11, false, null);
                        z10 = !z6 || this.f8577Y >= this.f8578Z || iVar.r() >= iVar.q();
                        if (iVar.u()) {
                            this.f8557E.put(java.lang.Integer.valueOf(i10), iVar);
                        }
                        p087i7.M m6 = p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (i6 == 0) {
                    this.f8580b0.s(z11, i10, list);
                } else {
                    if (!(true ^ this.f8555C)) {
                        throw new java.lang.IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                    }
                    this.f8580b0.H(i6, i10, list);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f8580b0.flush();
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(java.io.IOException iOException) {
        P9.b bVar = P9.b.PROTOCOL_ERROR;
        s0(bVar, bVar, iOException);
    }

    public final void A1(P9.m mVar) {
        p247y7.AbstractC7350t.f(mVar, "<set-?>");
        this.f8574V = mVar;
    }

    public final void B1(P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "statusCode");
        synchronized (this.f8580b0) {
            p247y7.M m6 = new p247y7.M();
            synchronized (this) {
                if (this.f8561I) {
                    return;
                }
                this.f8561I = true;
                int i6 = this.f8559G;
                m6.f57252C = i6;
                p087i7.M m10 = p087i7.M.f46721a;
                this.f8580b0.r(i6, bVar, I9.d.f5547a);
            }
        }
    }

    public final void C1(boolean z6, L9.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "taskRunner");
        if (z6) {
            this.f8580b0.f();
            this.f8580b0.R(this.f8573U);
            int iC = this.f8573U.c();
            if (iC != 65535) {
                this.f8580b0.e0(0, iC - 65535);
            }
        }
        eVar.i().i(new L9.c(this.f8558F, true, this.f8581c0), 0L);
    }

    public final P9.f.c E0() {
        return this.f8556D;
    }

    public final synchronized void E1(long j6) {
        long j10 = this.f8575W + j6;
        this.f8575W = j10;
        long j11 = j10 - this.f8576X;
        if (j11 >= this.f8573U.c() / 2) {
            K1(0, j11);
            this.f8576X += j11;
        }
    }

    public final void F1(int i6, boolean z6, X9.C1836d c1836d, long j6) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j6 == 0) {
            this.f8580b0.g(z6, i6, c1836d, 0);
            return;
        }
        while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f8577Y;
                            j11 = this.f8578Z;
                            if (j10 >= j11) {
                                if (!this.f8557E.containsKey(java.lang.Integer.valueOf(i6))) {
                                    throw new java.io.IOException("stream closed");
                                }
                                p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                            throw new java.io.InterruptedIOException();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = java.lang.Math.min((int) java.lang.Math.min(j6, j11 - j10), this.f8580b0.y());
                j12 = iMin;
                this.f8577Y += j12;
                p087i7.M m6 = p087i7.M.f46721a;
            }
            j6 -= j12;
            this.f8580b0.g(z6 && j6 == 0, i6, c1836d, iMin);
        }
    }

    public final void G1(int i6, boolean z6, java.util.List list) {
        p247y7.AbstractC7350t.f(list, "alternating");
        this.f8580b0.s(z6, i6, list);
    }

    public final int H0() {
        return this.f8560H;
    }

    public final void H1(boolean z6, int i6, int i10) {
        try {
            this.f8580b0.D(z6, i6, i10);
        } catch (java.io.IOException e6) {
            u0(e6);
        }
    }

    public final void I1(int i6, P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "statusCode");
        this.f8580b0.N(i6, bVar);
    }

    public final void J1(int i6, P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        this.f8563K.i(new P9.f.k(this.f8558F + '[' + i6 + "] writeSynReset", true, this, i6, bVar), 0L);
    }

    public final P9.m K0() {
        return this.f8573U;
    }

    public final void K1(int i6, long j6) {
        this.f8563K.i(new P9.f.l(this.f8558F + '[' + i6 + "] windowUpdate", true, this, i6, j6), 0L);
    }

    public final P9.m P0() {
        return this.f8574V;
    }

    public final synchronized P9.i R0(int i6) {
        return (P9.i) this.f8557E.get(java.lang.Integer.valueOf(i6));
    }

    public final java.util.Map Y0() {
        return this.f8557E;
    }

    public final long c1() {
        return this.f8578Z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s0(P9.b.NO_ERROR, P9.b.CANCEL, null);
    }

    public final P9.j d1() {
        return this.f8580b0;
    }

    public final synchronized boolean e1(long j6) {
        if (this.f8561I) {
            return false;
        }
        return this.f8570R >= this.f8569Q || j6 < this.f8572T;
    }

    public final void flush() {
        this.f8580b0.flush();
    }

    public final P9.i l1(java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(list, "requestHeaders");
        return f1(0, list, z6);
    }

    public final void m1(int i6, X9.InterfaceC1838f interfaceC1838f, int i10, boolean z6) {
        p247y7.AbstractC7350t.f(interfaceC1838f, "source");
        X9.C1836d c1836d = new X9.C1836d();
        long j6 = i10;
        interfaceC1838f.q(j6);
        interfaceC1838f.b0(c1836d, j6);
        this.f8564L.i(new P9.f.e(this.f8558F + '[' + i6 + "] onData", true, this, i6, c1836d, i10, z6), 0L);
    }

    public final void s0(P9.b bVar, P9.b bVar2, java.io.IOException iOException) {
        int i6;
        java.lang.Object[] array;
        p247y7.AbstractC7350t.f(bVar, "connectionCode");
        p247y7.AbstractC7350t.f(bVar2, "streamCode");
        if (I9.d.f5554h && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError("Thread " + java.lang.Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            B1(bVar);
        } catch (java.io.IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f8557E.isEmpty()) {
                    array = this.f8557E.values().toArray(new P9.i[0]);
                    this.f8557E.clear();
                } else {
                    array = null;
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        P9.i[] iVarArr = (P9.i[]) array;
        if (iVarArr != null) {
            for (P9.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (java.io.IOException unused2) {
                }
            }
        }
        try {
            this.f8580b0.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            this.f8579a0.close();
        } catch (java.io.IOException unused4) {
        }
        this.f8563K.n();
        this.f8564L.n();
        this.f8565M.n();
    }

    public final void t1(int i6, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(list, "requestHeaders");
        this.f8564L.i(new P9.f.C0204f(this.f8558F + '[' + i6 + "] onHeaders", true, this, i6, list, z6), 0L);
    }

    public final void u1(int i6, java.util.List list) {
        p247y7.AbstractC7350t.f(list, "requestHeaders");
        synchronized (this) {
            if (this.f8582d0.contains(java.lang.Integer.valueOf(i6))) {
                J1(i6, P9.b.PROTOCOL_ERROR);
                return;
            }
            this.f8582d0.add(java.lang.Integer.valueOf(i6));
            this.f8564L.i(new P9.f.g(this.f8558F + '[' + i6 + "] onRequest", true, this, i6, list), 0L);
        }
    }

    public final void v1(int i6, P9.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "errorCode");
        this.f8564L.i(new P9.f.h(this.f8558F + '[' + i6 + "] onReset", true, this, i6, bVar), 0L);
    }

    public final boolean w1(int i6) {
        return i6 != 0 && (i6 & 1) == 0;
    }

    public final boolean x0() {
        return this.f8555C;
    }

    public final synchronized P9.i x1(int i6) {
        P9.i iVar;
        iVar = (P9.i) this.f8557E.remove(java.lang.Integer.valueOf(i6));
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final java.lang.String y0() {
        return this.f8558F;
    }

    public final void y1() {
        synchronized (this) {
            long j6 = this.f8570R;
            long j10 = this.f8569Q;
            if (j6 < j10) {
                return;
            }
            this.f8569Q = j10 + 1;
            this.f8572T = java.lang.System.nanoTime() + ((long) 1000000000);
            p087i7.M m6 = p087i7.M.f46721a;
            this.f8563K.i(new P9.f.i(this.f8558F + " ping", true, this), 0L);
        }
    }

    public final int z0() {
        return this.f8559G;
    }

    public final void z1(int i6) {
        this.f8559G = i6;
    }
}
