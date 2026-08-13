package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static p127m7.i b(p127m7.i iVar, p127m7.i iVar2) {
            p247y7.AbstractC7350t.f(iVar2, "context");
            return iVar2 == p127m7.j.f51198C ? iVar : (p127m7.i) iVar2.D(iVar, new p237x7.p() { // from class: m7.h
                @Override // p237x7.p
                public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                    return m7.i.a.c((p127m7.i) obj, (m7.i.b) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p127m7.i c(p127m7.i iVar, m7.i.b bVar) {
            p127m7.d dVar;
            p247y7.AbstractC7350t.f(iVar, "acc");
            p247y7.AbstractC7350t.f(bVar, "element");
            p127m7.i iVarY0 = iVar.y0(bVar.getKey());
            p127m7.j jVar = p127m7.j.f51198C;
            if (iVarY0 == jVar) {
                return bVar;
            }
            m7.f.b bVar2 = p127m7.f.f51196A;
            p127m7.f fVar = (p127m7.f) iVarY0.i(bVar2);
            if (fVar == null) {
                dVar = new p127m7.d(iVarY0, bVar);
            } else {
                p127m7.i iVarY1 = iVarY0.y0(bVar2);
                if (iVarY1 == jVar) {
                    return new p127m7.d(bVar, fVar);
                }
                dVar = new p127m7.d(new p127m7.d(iVarY1, bVar), fVar);
            }
            return dVar;
        }
    }

    public interface b extends p127m7.i {

        public static final class a {
            public static java.lang.Object a(m7.i.b bVar, java.lang.Object obj, p237x7.p pVar) {
                p247y7.AbstractC7350t.f(pVar, "operation");
                return pVar.u(obj, bVar);
            }

            public static m7.i.b b(m7.i.b bVar, m7.i.c cVar) {
                p247y7.AbstractC7350t.f(cVar, "key");
                if (!p247y7.AbstractC7350t.b(bVar.getKey(), cVar)) {
                    return null;
                }
                p247y7.AbstractC7350t.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static p127m7.i c(m7.i.b bVar, m7.i.c cVar) {
                p247y7.AbstractC7350t.f(cVar, "key");
                return p247y7.AbstractC7350t.b(bVar.getKey(), cVar) ? p127m7.j.f51198C : bVar;
            }

            public static p127m7.i d(m7.i.b bVar, p127m7.i iVar) {
                p247y7.AbstractC7350t.f(iVar, "context");
                return m7.i.a.b(bVar, iVar);
            }
        }

        m7.i.c getKey();

        @Override // p127m7.i
        m7.i.b i(m7.i.c cVar);
    }

    public interface c {
    }

    java.lang.Object D(java.lang.Object obj, p237x7.p pVar);

    m7.i.b i(m7.i.c cVar);

    p127m7.i o0(p127m7.i iVar);

    p127m7.i y0(m7.i.c cVar);
}
