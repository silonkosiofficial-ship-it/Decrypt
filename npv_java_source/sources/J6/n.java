package J6;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J6.n f5754a = new J6.n();

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5755G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f5756H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5757I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.s f5758J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.s sVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5758J = sVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p007a7.e eVar;
            p017b7.a aVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5756H;
            if (i6 != 0) {
                if (i6 == 1) {
                    aVar = (p017b7.a) this.f5755G;
                    eVar = (p007a7.e) this.f5757I;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            p007a7.e eVar2 = (p007a7.e) this.f5757I;
            Q6.d dVar = (Q6.d) eVar2.c();
            p017b7.a aVarA = dVar.a();
            java.lang.Object objB = dVar.b();
            if (!(objB instanceof io.ktor.utils.io.d)) {
                return p087i7.M.f46721a;
            }
            p237x7.s sVar = this.f5758J;
            J6.m mVar = new J6.m();
            Q6.c cVarE = ((D6.b) eVar2.b()).e();
            this.f5757I = eVar2;
            this.f5755G = aVarA;
            this.f5756H = 1;
            java.lang.Object objV = sVar.v(mVar, cVarE, objB, aVarA, this);
            if (objV == objG) {
                return objG;
            }
            eVar = eVar2;
            obj = objV;
            aVar = aVarA;
            if (obj == null) {
                return p087i7.M.f46721a;
            }
            if (!(obj instanceof U6.a) && !aVar.a().d(obj)) {
                throw new java.lang.IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + aVar);
            }
            Q6.d dVar2 = new Q6.d(aVar, obj);
            this.f5757I = null;
            this.f5755G = null;
            this.f5756H = 2;
            if (eVar.e(dVar2, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.d dVar, p127m7.e eVar2) {
            J6.n.a aVar = new J6.n.a(this.f5758J, eVar2);
            aVar.f5757I = eVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    private n() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.s sVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(sVar, "handler");
        cVar.H().l(Q6.f.f9096g.c(), new J6.n.a(sVar, null));
    }
}
