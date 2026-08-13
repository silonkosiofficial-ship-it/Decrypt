package J6;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements J6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J6.k f5742a = new J6.k();

    public static final class a implements W8.N {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final I6.S f5743C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p127m7.i f5744D;

        public a(I6.S s6, p127m7.i iVar) {
            p247y7.AbstractC7350t.f(s6, "httpSendSender");
            p247y7.AbstractC7350t.f(iVar, "coroutineContext");
            this.f5743C = s6;
            this.f5744D = iVar;
        }

        public final java.lang.Object a(O6.d dVar, p127m7.e eVar) {
            return this.f5743C.a(dVar, eVar);
        }

        @Override // W8.N
        public p127m7.i getCoroutineContext() {
            return this.f5744D;
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5745G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5746H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5747I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f5748J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ C6.c f5749K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.q qVar, C6.c cVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5748J = qVar;
            this.f5749K = cVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5745G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                I6.S s6 = (I6.S) this.f5746H;
                O6.d dVar = (O6.d) this.f5747I;
                p237x7.q qVar = this.f5748J;
                J6.k.a aVar = new J6.k.a(s6, this.f5749K.getCoroutineContext());
                this.f5746H = null;
                this.f5745G = 1;
                obj = qVar.j(aVar, dVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return obj;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(I6.S s6, O6.d dVar, p127m7.e eVar) {
            J6.k.b bVar = new J6.k.b(this.f5748J, this.f5749K, eVar);
            bVar.f5746H = s6;
            bVar.f5747I = dVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    private k() {
    }

    @Override // J6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(C6.c cVar, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(qVar, "handler");
        ((I6.E) I6.AbstractC1262s.b(cVar, I6.E.f5103c)).d(new J6.k.b(qVar, cVar, null));
    }
}
