package I6;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I6.M f5148a = new I6.M();

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5149G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5150H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5151I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f5152J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.q qVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5152J = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p007a7.e eVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5149G;
            if (i6 != 0) {
                if (i6 == 1) {
                    eVar = (p007a7.e) this.f5150H;
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
            eVar = (p007a7.e) this.f5150H;
            java.lang.Object obj2 = this.f5151I;
            p237x7.q qVar = this.f5152J;
            java.lang.Object objB = eVar.b();
            this.f5150H = eVar;
            this.f5149G = 1;
            obj = qVar.j(objB, obj2, this);
            if (obj == objG) {
                return objG;
            }
            U6.b bVar = (U6.b) obj;
            if (bVar != null) {
                this.f5150H = null;
                this.f5149G = 2;
                if (eVar.e(bVar, this) == objG) {
                    return objG;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            I6.M.a aVar = new I6.M.a(this.f5152J, eVar2);
            aVar.f5150H = eVar;
            aVar.f5151I = obj;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    private M() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(qVar, "handler");
        cVar.D().l(O6.g.f8084g.b(), new I6.M.a(qVar, null));
    }
}
