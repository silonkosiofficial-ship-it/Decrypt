package I;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends F0.AbstractC0927m implements F0.v0, p121m0.b {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p237x7.a f4919R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f4920S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final p251z0.W f4921T = (p251z0.W) T1(p251z0.U.a(new I.a.C0113a(null)));

    /* JADX INFO: renamed from: I.a$a, reason: collision with other inner class name */
    static final class C0113a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f4922G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f4923H;

        /* JADX INFO: renamed from: I.a$a$a, reason: collision with other inner class name */
        static final class C0114a extends p147o7.k implements p237x7.p {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            java.lang.Object f4925E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f4926F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f4927G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f4928H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ I.a f4929I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0114a(I.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f4929I = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:41:0x00e9 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:46:0x0104  */
            /* JADX WARN: Code duplicated, block: B:56:0x0123  */
            /* JADX WARN: Code duplicated, block: B:58:0x0138  */
            /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
            /* JADX WARN: Code duplicated, block: B:94:0x011d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:95:0x0119 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e7 -> B:42:0x00ea). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x017e -> B:69:0x0181). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 453
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: I.a.C0113a.C0114a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
                return ((I.a.C0113a.C0114a) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                I.a.C0113a.C0114a c0114a = new I.a.C0113a.C0114a(this.f4929I, eVar);
                c0114a.f4928H = obj;
                return c0114a;
            }
        }

        C0113a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f4922G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f4923H;
                I.a.C0113a.C0114a c0114a = new I.a.C0113a.C0114a(I.a.this, null);
                this.f4922G = 1;
                if (p230x.q.c(k6, c0114a, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((I.a.C0113a) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            I.a.C0113a c0113a = I.a.this.new C0113a(eVar);
            c0113a.f4923H = obj;
            return c0113a;
        }
    }

    public a(p237x7.a aVar) {
        this.f4919R = aVar;
    }

    @Override // p121m0.b
    public void R0(p121m0.n nVar) {
        this.f4920S = nVar.g();
    }

    public final p237x7.a a2() {
        return this.f4919R;
    }

    public final void b2(p237x7.a aVar) {
        this.f4919R = aVar;
    }

    @Override // F0.v0
    public /* synthetic */ void f1() {
        F0.u0.c(this);
    }

    @Override // F0.v0
    public void g0() {
        this.f4921T.g0();
    }

    @Override // F0.v0
    public /* synthetic */ boolean n0() {
        return F0.u0.a(this);
    }

    @Override // F0.v0
    public /* synthetic */ void t0() {
        F0.u0.b(this);
    }

    @Override // F0.v0
    public void w0(p251z0.C7380p c7380p, p251z0.r rVar, long j6) {
        this.f4921T.w0(c7380p, rVar, j6);
    }
}
