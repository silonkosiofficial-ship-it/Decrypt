package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I6.N f5153a = new I6.N();

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5154G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5155H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.q f5156I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.q qVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5156I = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [a7.e] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Object objG = p137n7.b.g();
            ?? r6 = this.f5154G;
            try {
                if (r6 == 0) {
                    p087i7.x.b(obj);
                    p007a7.e eVar = (p007a7.e) this.f5155H;
                    this.f5155H = eVar;
                    this.f5154G = 1;
                    java.lang.Object objD = eVar.d(this);
                    r6 = eVar;
                    if (objD == objG) {
                        return objG;
                    }
                } else {
                    if (r6 != 1) {
                        if (r6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                        java.lang.Throwable th = (java.lang.Throwable) obj;
                        if (th != null) {
                            throw th;
                        }
                        return p087i7.M.f46721a;
                    }
                    p007a7.e eVar2 = (p007a7.e) this.f5155H;
                    p087i7.x.b(obj);
                    r6 = eVar2;
                }
            } catch (java.lang.Throwable th2) {
                p237x7.q qVar = this.f5156I;
                O6.b bVarE = I6.AbstractC1260p.e((O6.d) r6.b());
                this.f5155H = null;
                this.f5154G = 2;
                obj = qVar.j(bVarE, th2, this);
                if (obj == objG) {
                    return objG;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            I6.N.a aVar = new I6.N.a(this.f5156I, eVar2);
            aVar.f5155H = eVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    private N() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(qVar, "handler");
        cVar.D().l(O6.g.f8084g.a(), new I6.N.a(qVar, null));
    }
}
