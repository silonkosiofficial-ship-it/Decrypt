package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements com.google.firebase.sessions.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S5.B.a f12435g = new S5.B.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f12436h = java.lang.Math.random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.f f12437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G5.e f12438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U5.f f12439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S5.InterfaceC1625h f12440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p127m7.i f12441f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f12442G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f12443H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f12444I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f12445J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        java.lang.Object f12446K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        java.lang.Object f12447L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f12448M;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ S5.y f12450O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(S5.y yVar, p127m7.e eVar) {
            super(2, eVar);
            this.f12450O = yVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0096  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            S5.s sVar;
            S5.B b6;
            S5.A a6;
            Q4.f fVar;
            S5.y yVar;
            U5.f fVar2;
            java.lang.Object objC;
            S5.A a10;
            S5.B b10;
            U5.f fVar3;
            Q4.f fVar4;
            S5.y yVar2;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12448M;
            if (i6 != 0) {
                if (i6 == 1) {
                    p087i7.x.b(obj);
                } else if (i6 == 2) {
                    p087i7.x.b(obj);
                    sVar = (S5.s) obj;
                    b6 = S5.B.this;
                    a6 = S5.A.f12433a;
                    fVar = b6.f12437b;
                    yVar = this.f12450O;
                    fVar2 = S5.B.this.f12439d;
                    T5.a aVar = T5.a.f12957a;
                    this.f12442G = sVar;
                    this.f12443H = b6;
                    this.f12444I = a6;
                    this.f12445J = fVar;
                    this.f12446K = yVar;
                    this.f12447L = fVar2;
                    this.f12448M = 3;
                    objC = aVar.c(this);
                    if (objC == objG) {
                        return objG;
                    }
                    a10 = a6;
                    b10 = b6;
                    fVar3 = fVar2;
                    fVar4 = fVar;
                    obj = objC;
                    yVar2 = yVar;
                } else {
                    if (i6 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    U5.f fVar5 = (U5.f) this.f12447L;
                    S5.y yVar3 = (S5.y) this.f12446K;
                    Q4.f fVar6 = (Q4.f) this.f12445J;
                    S5.A a11 = (S5.A) this.f12444I;
                    S5.B b11 = (S5.B) this.f12443H;
                    sVar = (S5.s) this.f12442G;
                    p087i7.x.b(obj);
                    b10 = b11;
                    fVar3 = fVar5;
                    a10 = a11;
                    yVar2 = yVar3;
                    fVar4 = fVar6;
                }
                b10.g(a10.a(fVar4, yVar2, fVar3, (java.util.Map) obj, sVar.b(), sVar.a()));
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            S5.B b12 = S5.B.this;
            this.f12448M = 1;
            obj = b12.i(this);
            if (obj == objG) {
                return objG;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                S5.s.a aVar2 = S5.s.f12555c;
                G5.e eVar = S5.B.this.f12438c;
                this.f12448M = 2;
                obj = aVar2.a(eVar, this);
                if (obj == objG) {
                    return objG;
                }
                sVar = (S5.s) obj;
                b6 = S5.B.this;
                a6 = S5.A.f12433a;
                fVar = b6.f12437b;
                yVar = this.f12450O;
                fVar2 = S5.B.this.f12439d;
                T5.a aVar3 = T5.a.f12957a;
                this.f12442G = sVar;
                this.f12443H = b6;
                this.f12444I = a6;
                this.f12445J = fVar;
                this.f12446K = yVar;
                this.f12447L = fVar2;
                this.f12448M = 3;
                objC = aVar3.c(this);
                if (objC == objG) {
                    return objG;
                }
                a10 = a6;
                b10 = b6;
                fVar3 = fVar2;
                fVar4 = fVar;
                obj = objC;
                yVar2 = yVar;
                b10.g(a10.a(fVar4, yVar2, fVar3, (java.util.Map) obj, sVar.b(), sVar.a()));
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S5.B.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return S5.B.this.new b(this.f12450O, eVar);
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f12451F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f12452G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f12454I;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f12452G = obj;
            this.f12454I |= Integer.MIN_VALUE;
            return S5.B.this.i(this);
        }
    }

    public B(Q4.f fVar, G5.e eVar, U5.f fVar2, S5.InterfaceC1625h interfaceC1625h, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        p247y7.AbstractC7350t.f(eVar, "firebaseInstallations");
        p247y7.AbstractC7350t.f(fVar2, "sessionSettings");
        p247y7.AbstractC7350t.f(interfaceC1625h, "eventGDTLogger");
        p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
        this.f12437b = fVar;
        this.f12438c = eVar;
        this.f12439d = fVar2;
        this.f12440e = interfaceC1625h;
        this.f12441f = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(S5.z zVar) {
        try {
            this.f12440e.a(zVar);
        } catch (java.lang.RuntimeException e6) {
        }
    }

    private final boolean h() {
        return f12436h <= this.f12439d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(p127m7.e eVar) {
        S5.B.c cVar;
        S5.B b6;
        if (eVar instanceof S5.B.c) {
            cVar = (S5.B.c) eVar;
            int i6 = cVar.f12454I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f12454I = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new S5.B.c(eVar);
            }
        } else {
            cVar = new S5.B.c(eVar);
        }
        java.lang.Object obj = cVar.f12452G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f12454I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            U5.f fVar = this.f12439d;
            cVar.f12451F = this;
            cVar.f12454I = 1;
            if (fVar.g(cVar) == objG) {
                return objG;
            }
            b6 = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b6 = (S5.B) cVar.f12451F;
            p087i7.x.b(obj);
        }
        return (b6.f12439d.d() && b6.h()) ? p147o7.b.a(true) : p147o7.b.a(false);
    }

    @Override // com.google.firebase.sessions.b
    public void a(S5.y yVar) {
        p247y7.AbstractC7350t.f(yVar, "sessionDetails");
        W8.AbstractC1788i.d(W8.O.a(this.f12441f), null, null, new S5.B.b(yVar, null), 3, null);
    }
}
