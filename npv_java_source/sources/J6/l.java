package J6;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J6.l f5750a = new J6.l();

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5751G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5752H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f5753I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5753I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5751G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar = (p007a7.e) this.f5752H;
                p237x7.p pVar = this.f5753I;
                java.lang.Object objB = eVar.b();
                this.f5751G = 1;
                if (pVar.u(objB, this) == objG) {
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

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            J6.l.a aVar = new J6.l.a(this.f5753I, eVar2);
            aVar.f5752H = eVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    private l() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(pVar, "handler");
        cVar.D().l(O6.g.f8084g.a(), new J6.l.a(pVar, null));
    }
}
