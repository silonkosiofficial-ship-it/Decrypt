package p173r2;

/* JADX INFO: loaded from: classes.dex */
final class d implements p143o2.B, p163q2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p173r2.a f53814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o2.B.a f53815b;

    private final class a implements p143o2.A, p163q2.j {
        public a() {
        }

        @Override // p143o2.k
        public java.lang.Object b(java.lang.String str, p237x7.l lVar, p127m7.e eVar) {
            return p173r2.d.this.b(str, lVar, eVar);
        }

        @Override // p163q2.j
        public p243y2.b d() {
            return p173r2.d.this.d();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53817a;

        static {
            int[] iArr = new int[o2.B.a.values().length];
            try {
                iArr[o2.B.a.DEFERRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[o2.B.a.IMMEDIATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[o2.B.a.EXCLUSIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f53817a = iArr;
        }
    }

    static final class c extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f53818F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f53819G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f53820H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f53822J;

        c(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f53820H = obj;
            this.f53822J |= Integer.MIN_VALUE;
            return p173r2.d.this.f(null, null, this);
        }
    }

    public d(p173r2.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "delegate");
        this.f53814a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(o2.B.a aVar, p237x7.p pVar, p127m7.e eVar) throws java.lang.Throwable {
        r2.d.c cVar;
        p173r2.d dVar;
        java.lang.Throwable th;
        p253z2.d dVar2;
        if (eVar instanceof r2.d.c) {
            cVar = (r2.d.c) eVar;
            int i6 = cVar.f53822J;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.f53822J = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new r2.d.c(eVar);
            }
        } else {
            cVar = new r2.d.c(eVar);
        }
        java.lang.Object obj = cVar.f53820H;
        java.lang.Object objG = p137n7.b.g();
        int i10 = cVar.f53822J;
        if (i10 == 0) {
            p087i7.x.b(obj);
            p253z2.d dVarA = this.f53814a.a();
            if (!dVarA.V0()) {
                this.f53815b = aVar;
            }
            int i11 = r2.d.b.f53817a[aVar.ordinal()];
            if (i11 == 1) {
                dVarA.S();
            } else if (i11 == 2) {
                dVarA.l0();
            } else if (i11 == 3) {
                dVarA.u();
            }
            try {
                java.lang.Object aVar2 = new r2.d.a();
                cVar.f53818F = this;
                cVar.f53819G = dVarA;
                cVar.f53822J = 1;
                java.lang.Object objU = pVar.u(aVar2, cVar);
                if (objU == objG) {
                    return objG;
                }
                dVar = this;
                obj = objU;
                dVar2 = dVarA;
            } catch (java.lang.Throwable th2) {
                dVar = this;
                th = th2;
                dVar2 = dVarA;
                dVar2.B0();
                if (!dVar2.V0()) {
                    dVar.f53815b = null;
                }
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (p253z2.d) cVar.f53819G;
            dVar = (p173r2.d) cVar.f53818F;
            try {
                p087i7.x.b(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                dVar2.B0();
                if (!dVar2.V0()) {
                    dVar.f53815b = null;
                }
                throw th;
            }
        }
        dVar2.i0();
        dVar2.B0();
        if (!dVar2.V0()) {
            dVar.f53815b = null;
        }
        return obj;
    }

    @Override // p143o2.B
    public java.lang.Object a(p127m7.e eVar) {
        return p147o7.b.a(this.f53814a.a().V0());
    }

    @Override // p143o2.k
    public java.lang.Object b(java.lang.String str, p237x7.l lVar, p127m7.e eVar) {
        p173r2.e eVarE = this.f53814a.e(str);
        try {
            return lVar.l(eVarE);
        } finally {
            eVarE.close();
        }
    }

    @Override // p143o2.B
    public java.lang.Object c(o2.B.a aVar, p237x7.p pVar, p127m7.e eVar) {
        return f(aVar, pVar, eVar);
    }

    @Override // p163q2.j
    public p243y2.b d() {
        return this.f53814a;
    }
}
