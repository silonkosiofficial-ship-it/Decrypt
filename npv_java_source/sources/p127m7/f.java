package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends m7.i.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final m7.f.b f51196A = m7.f.b.f51197C;

    public static final class a {
        public static m7.i.b a(p127m7.f fVar, m7.i.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "key");
            if (!(cVar instanceof p127m7.b)) {
                if (p127m7.f.f51196A != cVar) {
                    return null;
                }
                p247y7.AbstractC7350t.d(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            p127m7.b bVar = (p127m7.b) cVar;
            if (!bVar.a(fVar.getKey())) {
                return null;
            }
            m7.i.b bVarB = bVar.b(fVar);
            if (bVarB instanceof m7.i.b) {
                return bVarB;
            }
            return null;
        }

        public static p127m7.i b(p127m7.f fVar, m7.i.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "key");
            if (!(cVar instanceof p127m7.b)) {
                return p127m7.f.f51196A == cVar ? p127m7.j.f51198C : fVar;
            }
            p127m7.b bVar = (p127m7.b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : p127m7.j.f51198C;
        }
    }

    public static final class b implements m7.i.c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        static final /* synthetic */ m7.f.b f51197C = new m7.f.b();

        private b() {
        }
    }

    void H(p127m7.e eVar);

    p127m7.e q0(p127m7.e eVar);
}
