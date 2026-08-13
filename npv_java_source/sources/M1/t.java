package M1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W8.N f6957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.p f6958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y8.j f6959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M1.C1349a f6960d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f6961D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M1.t f6962E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f6963F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar, M1.t tVar, p237x7.p pVar) {
            super(1);
            this.f6961D = lVar;
            this.f6962E = tVar;
            this.f6963F = pVar;
        }

        public final void a(java.lang.Throwable th) {
            p087i7.M m6;
            this.f6961D.l(th);
            this.f6962E.f6959c.c(th);
            do {
                java.lang.Object objF = Y8.n.f(this.f6962E.f6959c.a());
                if (objF != null) {
                    this.f6963F.u(objF, th);
                    m6 = p087i7.M.f46721a;
                } else {
                    m6 = null;
                }
            } while (m6 != null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f6964G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f6965H;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x005c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r5.f6965H
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p087i7.x.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f6964G
                x7.p r1 = (p237x7.p) r1
                p087i7.x.b(r6)
                goto L51
            L22:
                p087i7.x.b(r6)
                M1.t r6 = M1.t.this
                M1.a r6 = M1.t.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                M1.t r6 = M1.t.this
                W8.N r6 = M1.t.d(r6)
                W8.O.g(r6)
                M1.t r6 = M1.t.this
                x7.p r1 = M1.t.a(r6)
                M1.t r6 = M1.t.this
                Y8.j r6 = M1.t.b(r6)
                r5.f6964G = r1
                r5.f6965H = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r4 = 0
                r5.f6964G = r4
                r5.f6965H = r2
                java.lang.Object r6 = r1.u(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                M1.t r6 = M1.t.this
                M1.a r6 = M1.t.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                i7.M r6 = p087i7.M.f46721a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: M1.t.b.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((M1.t.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return M1.t.this.new b(eVar);
        }
    }

    public t(W8.N n6, p237x7.l lVar, p237x7.p pVar, p237x7.p pVar2) {
        p247y7.AbstractC7350t.f(n6, "scope");
        p247y7.AbstractC7350t.f(lVar, "onComplete");
        p247y7.AbstractC7350t.f(pVar, "onUndeliveredElement");
        p247y7.AbstractC7350t.f(pVar2, "consumeMessage");
        this.f6957a = n6;
        this.f6958b = pVar2;
        this.f6959c = Y8.m.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f6960d = new M1.C1349a(0);
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) n6.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.e1(new M1.t.a(lVar, this, pVar));
        }
    }

    public final void e(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objJ = this.f6959c.j(obj);
        if (objJ instanceof Y8.n.a) {
            java.lang.Throwable thE = Y8.n.e(objJ);
            if (thE != null) {
                throw thE;
            }
            throw new Y8.u("Channel was closed normally");
        }
        if (!Y8.n.j(objJ)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f6960d.c() == 0) {
            W8.AbstractC1788i.d(this.f6957a, null, null, new M1.t.b(null), 3, null);
        }
    }
}
