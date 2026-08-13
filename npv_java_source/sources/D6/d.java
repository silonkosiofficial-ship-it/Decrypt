package D6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f1930F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f1931G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f1932H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f1931G = obj;
            this.f1932H |= Integer.MIN_VALUE;
            return D6.d.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(D6.b bVar, p127m7.e eVar) {
        D6.d.a aVar;
        if (eVar instanceof D6.d.a) {
            aVar = (D6.d.a) eVar;
            int i6 = aVar.f1932H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f1932H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new D6.d.a(eVar);
            }
        } else {
            aVar = new D6.d.a(eVar);
        }
        java.lang.Object objF = aVar.f1931G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f1932H;
        if (i10 == 0) {
            p087i7.x.b(objF);
            io.ktor.utils.io.d dVarB = bVar.e().b();
            aVar.f1930F = bVar;
            aVar.f1932H = 1;
            objF = io.ktor.utils.io.f.f(dVarB, aVar);
            if (objF == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (D6.b) aVar.f1930F;
            p087i7.x.b(objF);
        }
        return new D6.e(bVar.c(), bVar.d(), bVar.e(), p149o9.r.a((p149o9.q) objF));
    }
}
