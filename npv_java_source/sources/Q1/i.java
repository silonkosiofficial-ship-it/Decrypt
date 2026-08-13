package Q1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f8765G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f8766H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f8767I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f8767I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f8765G;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q1.c cVar = (Q1.c) this.f8766H;
                p087i7.x.b(obj);
                return cVar;
            }
            p087i7.x.b(obj);
            Q1.c cVarC = ((Q1.f) this.f8766H).c();
            p237x7.p pVar = this.f8767I;
            this.f8766H = cVarC;
            this.f8765G = 1;
            return pVar.u(cVarC, this) == objG ? objG : cVarC;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Q1.f fVar, p127m7.e eVar) {
            return ((Q1.i.a) x(fVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            Q1.i.a aVar = new Q1.i.a(this.f8767I, eVar);
            aVar.f8766H = obj;
            return aVar;
        }
    }

    public static final java.lang.Object a(M1.h hVar, p237x7.p pVar, p127m7.e eVar) {
        return hVar.a(new Q1.i.a(pVar, null), eVar);
    }
}
