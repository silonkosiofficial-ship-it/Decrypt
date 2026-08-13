package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements M1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M1.h f8758a;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f8759G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f8760H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f8761I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f8761I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f8759G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Q1.f fVar = (Q1.f) this.f8760H;
                p237x7.p pVar = this.f8761I;
                this.f8759G = 1;
                obj = pVar.u(fVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            Q1.f fVar2 = (Q1.f) obj;
            p247y7.AbstractC7350t.d(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((Q1.c) fVar2).f();
            return fVar2;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Q1.f fVar, p127m7.e eVar) {
            return ((Q1.d.a) x(fVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            Q1.d.a aVar = new Q1.d.a(this.f8761I, eVar);
            aVar.f8760H = obj;
            return aVar;
        }
    }

    public d(M1.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "delegate");
        this.f8758a = hVar;
    }

    @Override // M1.h
    public java.lang.Object a(p237x7.p pVar, p127m7.e eVar) {
        return this.f8758a.a(new Q1.d.a(pVar, null), eVar);
    }

    @Override // M1.h
    public Z8.InterfaceC1869f getData() {
        return this.f8758a.getData();
    }
}
