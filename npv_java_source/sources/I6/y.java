package I6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set f5284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fa.d f5285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final S6.a f5286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final J6.b f5287d;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final I6.y.a f5288L = new I6.y.a();

        a() {
            super(0, I6.w.class, "<init>", "<init>()V", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final I6.w b() {
            return new I6.w();
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5289G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5290H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5291I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f5292J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f5293K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ J6.d f5294L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, boolean z10, J6.d dVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5292J = z6;
            this.f5293K = z10;
            this.f5294L = dVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            O6.d dVar;
            J6.k.a aVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5289G;
            if (i6 != 0) {
                if (i6 == 1) {
                    O6.d dVar2 = (O6.d) this.f5291I;
                    aVar = (J6.k.a) this.f5290H;
                    p087i7.x.b(obj);
                    dVar = dVar2;
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
            }
            p087i7.x.b(obj);
            J6.k.a aVar2 = (J6.k.a) this.f5290H;
            O6.d dVar3 = (O6.d) this.f5291I;
            this.f5290H = aVar2;
            this.f5291I = dVar3;
            this.f5289G = 1;
            java.lang.Object objA = aVar2.a(dVar3, this);
            if (objA == objG) {
                return objG;
            }
            dVar = dVar3;
            aVar = aVar2;
            obj = objA;
            D6.b bVar = (D6.b) obj;
            if (this.f5292J && !I6.y.f5284a.contains(bVar.d().u0())) {
                return bVar;
            }
            boolean z6 = this.f5293K;
            C6.c cVarB = this.f5294L.b();
            this.f5290H = null;
            this.f5291I = null;
            this.f5289G = 2;
            obj = I6.y.c(aVar, dVar, bVar, z6, cVarB, this);
            return obj == objG ? objG : obj;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(J6.k.a aVar, O6.d dVar, p127m7.e eVar) {
            I6.y.b bVar = new I6.y.b(this.f5292J, this.f5293K, this.f5294L, eVar);
            bVar.f5290H = aVar;
            bVar.f5291I = dVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f5295F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5296G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f5297H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f5298I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f5299J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f5300K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        java.lang.Object f5301L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        java.lang.Object f5302M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        boolean f5303N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5304O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f5305P;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f5304O = obj;
            this.f5305P |= Integer.MIN_VALUE;
            return I6.y.c(null, null, null, false, null, this);
        }
    }

    static {
        T6.A.a aVar = T6.A.f12975b;
        f5284a = p097j7.Z.g(aVar.a(), aVar.b());
        f5285b = Z6.a.a("io.ktor.client.plugins.HttpRedirect");
        f5286c = new S6.a();
        f5287d = J6.i.b("HttpRedirect", I6.y.a.f5288L, new p237x7.l() { // from class: I6.x
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.y.b((J6.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M b(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        dVar.f(J6.k.f5742a, new I6.y.b(((I6.w) dVar.e()).b(), ((I6.w) dVar.e()).a(), dVar, null));
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x010c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0115  */
    /* JADX WARN: Code duplicated, block: B:30:0x0157  */
    /* JADX WARN: Code duplicated, block: B:33:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0197  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0197 -> B:35:0x019e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(J6.k.a r18, O6.d r19, D6.b r20, boolean r21, C6.c r22, p127m7.e r23) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.y.c(J6.k$a, O6.d, D6.b, boolean, C6.c, m7.e):java.lang.Object");
    }

    public static final J6.b f() {
        return f5287d;
    }

    private static final boolean g(T6.C c6) {
        int iM0 = c6.m0();
        T6.C.a aVar = T6.C.f12998E;
        return iM0 == aVar.r().m0() || iM0 == aVar.j().m0() || iM0 == aVar.R().m0() || iM0 == aVar.E().m0() || iM0 == aVar.N().m0();
    }
}
