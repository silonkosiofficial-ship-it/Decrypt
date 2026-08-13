package M1;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f6983G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f6984H;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f6983G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                M1.r rVar = (M1.r) this.f6984H;
                this.f6983G = 1;
                obj = rVar.b(this);
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

        public final java.lang.Object H(M1.r rVar, boolean z6, p127m7.e eVar) {
            M1.y.a aVar = new M1.y.a(eVar);
            aVar.f6984H = rVar;
            return aVar.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((M1.r) obj, ((java.lang.Boolean) obj2).booleanValue(), (p127m7.e) obj3);
        }
    }

    public static final java.lang.Object a(M1.x xVar, p127m7.e eVar) {
        return xVar.a(new M1.y.a(null), eVar);
    }
}
