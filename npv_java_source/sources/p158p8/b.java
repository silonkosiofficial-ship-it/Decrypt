package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements p158p8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p158p8.g f52760a = p158p8.g.c();

    private p158p8.p d(p158p8.p pVar) throws p158p8.k {
        if (pVar == null || pVar.d()) {
            return pVar;
        }
        throw e(pVar).a().i(pVar);
    }

    private p158p8.v e(p158p8.p pVar) {
        return pVar instanceof p158p8.a ? ((p158p8.a) pVar).f() : new p158p8.v(pVar);
    }

    @Override // p158p8.r
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p158p8.p b(java.io.InputStream inputStream, p158p8.g gVar) {
        return d(h(inputStream, gVar));
    }

    @Override // p158p8.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p158p8.p c(java.io.InputStream inputStream, p158p8.g gVar) {
        return d(i(inputStream, gVar));
    }

    public p158p8.p h(java.io.InputStream inputStream, p158p8.g gVar) throws p158p8.k {
        try {
            int i6 = inputStream.read();
            if (i6 == -1) {
                return null;
            }
            return i(new p158p8.a.AbstractC0680a.C0681a(inputStream, p158p8.e.A(i6, inputStream)), gVar);
        } catch (java.io.IOException e6) {
            throw new p158p8.k(e6.getMessage());
        }
    }

    public p158p8.p i(java.io.InputStream inputStream, p158p8.g gVar) throws p158p8.k {
        p158p8.e eVarG = p158p8.e.g(inputStream);
        p158p8.p pVar = (p158p8.p) a(eVarG, gVar);
        try {
            eVarG.a(0);
            return pVar;
        } catch (p158p8.k e6) {
            throw e6.i(pVar);
        }
    }
}
