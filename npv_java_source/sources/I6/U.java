package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I6.U f5160a = new I6.U();

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5161G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5162H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.q f5163I;

        /* JADX INFO: renamed from: I6.U$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0119a extends p247y7.AbstractC7332a implements p237x7.l {
            C0119a(java.lang.Object obj) {
                super(1, obj, p007a7.e.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object l(p127m7.e eVar) {
                return I6.U.a.K((p007a7.e) this.f57274C, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.q qVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5163I = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ java.lang.Object K(p007a7.e eVar, p127m7.e eVar2) {
            java.lang.Object objD = eVar.d(eVar2);
            return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5161G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar = (p007a7.e) this.f5162H;
                p237x7.q qVar = this.f5163I;
                java.lang.Object objB = eVar.b();
                I6.U.a.C0119a c0119a = new I6.U.a.C0119a(eVar);
                this.f5161G = 1;
                if (qVar.j(objB, c0119a, this) == objG) {
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
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            I6.U.a aVar = new I6.U.a(this.f5163I, eVar2);
            aVar.f5162H = eVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    private U() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(qVar, "handler");
        cVar.D().l(O6.g.f8084g.a(), new I6.U.a(qVar, null));
    }
}
