package G6;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends H9.G implements W8.N {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final H9.x f3109C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final H9.F.a f3110D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p127m7.i f3111E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final W8.InterfaceC1813v f3112F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final W8.InterfaceC1813v f3113G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Y8.j f3114H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final W8.InterfaceC1813v f3115I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Y8.C f3116J;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f3117G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f3118H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f3119I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f3120J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ H9.z f3122L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H9.z zVar, p127m7.e eVar) {
            super(2, eVar);
            this.f3122L = zVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x008b A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:28:0x0095 A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[Catch: all -> 0x001e, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #4 {all -> 0x001e, blocks: (B:7:0x001a, B:24:0x0083, B:26:0x008b, B:28:0x0095, B:21:0x0074, B:29:0x00a9, B:31:0x00ad, B:32:0x00bc, B:34:0x00c0, B:37:0x00d0, B:43:0x00e3, B:44:0x00e8), top: B:66:0x001a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0080 -> B:24:0x0083). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: G6.o.a.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Y8.InterfaceC1862c interfaceC1862c, p127m7.e eVar) {
            return ((G6.o.a) x(interfaceC1862c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            G6.o.a aVar = G6.o.this.new a(this.f3122L, eVar);
            aVar.f3120J = obj;
            return aVar;
        }
    }

    public o(H9.x xVar, H9.F.a aVar, H9.z zVar, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(xVar, "engine");
        p247y7.AbstractC7350t.f(aVar, "webSocketFactory");
        p247y7.AbstractC7350t.f(zVar, "engineRequest");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        this.f3109C = xVar;
        this.f3110D = aVar;
        this.f3111E = iVar;
        this.f3112F = W8.AbstractC1817x.b(null, 1, null);
        this.f3113G = W8.AbstractC1817x.b(null, 1, null);
        this.f3114H = Y8.m.b(0, null, null, 7, null);
        this.f3115I = W8.AbstractC1817x.b(null, 1, null);
        this.f3116J = Y8.AbstractC1861b.b(this, null, 0, null, null, new G6.o.a(zVar, null), 15, null);
    }

    @Override // H9.G
    public void a(H9.F f6, int i6, java.lang.String str) {
        java.lang.Object objValueOf;
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(str, "reason");
        super.a(f6, i6, str);
        short s6 = (short) i6;
        this.f3115I.R0(new p067g7.a(s6, str));
        Y8.C.a.a(this.f3114H, null, 1, null);
        Y8.C cJ = j();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WebSocket session closed with code ");
        p067g7.a.EnumC0512a enumC0512aA = p067g7.a.EnumC0512a.f45550D.a(s6);
        if (enumC0512aA == null || (objValueOf = enumC0512aA.toString()) == null) {
            objValueOf = java.lang.Integer.valueOf(i6);
        }
        sb.append(objValueOf);
        sb.append('.');
        cJ.c(new java.util.concurrent.CancellationException(sb.toString()));
    }

    @Override // H9.G
    public void b(H9.F f6, int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(str, "reason");
        super.b(f6, i6, str);
        short s6 = (short) i6;
        this.f3115I.R0(new p067g7.a(s6, str));
        try {
            Y8.q.b(j(), new p067g7.b.C0514b(new p067g7.a(s6, str)));
        } catch (java.lang.Throwable unused) {
        }
        Y8.C.a.a(this.f3114H, null, 1, null);
    }

    @Override // H9.G
    public void c(H9.F f6, java.lang.Throwable th, H9.B b6) {
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(th, "t");
        super.c(f6, th, b6);
        java.lang.Integer numValueOf = b6 != null ? java.lang.Integer.valueOf(b6.o()) : null;
        int iM0 = T6.C.f12998E.U().m0();
        if (numValueOf != null && numValueOf.intValue() == iM0) {
            this.f3113G.R0(b6);
            Y8.C.a.a(this.f3114H, null, 1, null);
            Y8.C.a.a(j(), null, 1, null);
        } else {
            this.f3113G.g(th);
            this.f3115I.g(th);
            this.f3114H.c(th);
            j().c(th);
        }
    }

    @Override // H9.G
    public void d(H9.F f6, X9.C1839g c1839g) {
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(c1839g, "bytes");
        super.d(f6, c1839g);
        Y8.q.b(this.f3114H, new g7.b.a(true, c1839g.N()));
    }

    @Override // H9.G
    public void e(H9.F f6, java.lang.String str) {
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(str, "text");
        super.e(f6, str);
        Y8.j jVar = this.f3114H;
        byte[] bytes = str.getBytes(S8.C1631d.f12624b);
        p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
        Y8.q.b(jVar, new g7.b.d(true, bytes));
    }

    @Override // H9.G
    public void f(H9.F f6, H9.B b6) {
        p247y7.AbstractC7350t.f(f6, "webSocket");
        p247y7.AbstractC7350t.f(b6, "response");
        super.f(f6, b6);
        this.f3113G.R0(b6);
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f3111E;
    }

    public final W8.InterfaceC1813v i() {
        return this.f3113G;
    }

    public Y8.C j() {
        return this.f3116J;
    }

    public final void k() {
        this.f3112F.R0(this);
    }
}
