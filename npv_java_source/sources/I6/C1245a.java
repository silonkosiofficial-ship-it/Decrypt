package I6;

/* JADX INFO: renamed from: I6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245a implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I6.C1245a f5164a = new I6.C1245a();

    /* JADX INFO: renamed from: I6.a$a, reason: collision with other inner class name */
    static final class C0120a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5165G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5166H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5167I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f5168J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0120a(p237x7.p pVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5168J = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p007a7.e eVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5165G;
            if (i6 != 0) {
                if (i6 == 1) {
                    eVar = (p007a7.e) this.f5166H;
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
            eVar = (p007a7.e) this.f5166H;
            Q6.c cVar = (Q6.c) this.f5167I;
            p237x7.p pVar = this.f5168J;
            this.f5166H = eVar;
            this.f5165G = 1;
            obj = pVar.u(cVar, this);
            if (obj == objG) {
                return objG;
            }
            Q6.c cVar2 = (Q6.c) obj;
            if (cVar2 != null) {
                this.f5166H = null;
                this.f5165G = 2;
                if (eVar.e(cVar2, this) == objG) {
                    return objG;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.c cVar, p127m7.e eVar2) {
            I6.C1245a.C0120a c0120a = new I6.C1245a.C0120a(this.f5168J, eVar2);
            c0120a.f5166H = eVar;
            c0120a.f5167I = cVar;
            return c0120a.B(p087i7.M.f46721a);
        }
    }

    private C1245a() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.p pVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(pVar, "handler");
        cVar.y().l(Q6.b.f9086g.a(), new I6.C1245a.C0120a(pVar, null));
    }
}
