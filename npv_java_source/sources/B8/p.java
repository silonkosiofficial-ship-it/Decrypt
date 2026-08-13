package B8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends B8.o {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p108k8.a f913J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final D8.f f914K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p108k8.d f915L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final B8.z f916M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p088i8.m f917N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private p248y8.h f918O;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.a0 l(p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "it");
            D8.f fVar = B8.p.this.f914K;
            if (fVar != null) {
                return fVar;
            }
            O7.a0 a0Var = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
            return a0Var;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Collection b() {
            java.util.Collection collectionB = B8.p.this.O0().b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionB) {
                p138n8.b bVar = (p138n8.b) obj;
                if (!bVar.l() && !B8.i.f870c.a().contains(bVar)) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p138n8.b) it.next()).j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p138n8.c cVar, E8.n nVar, O7.G g6, p088i8.m mVar, p108k8.a aVar, D8.f fVar) {
        super(cVar, nVar, g6);
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(mVar, "proto");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        this.f913J = aVar;
        this.f914K = fVar;
        p088i8.p pVarO = mVar.O();
        p247y7.AbstractC7350t.e(pVarO, "getStrings(...)");
        p088i8.o oVarN = mVar.N();
        p247y7.AbstractC7350t.e(oVarN, "getQualifiedNames(...)");
        p108k8.d dVar = new p108k8.d(pVarO, oVarN);
        this.f915L = dVar;
        this.f916M = new B8.z(mVar, dVar, aVar, new B8.p.a());
        this.f917N = mVar;
    }

    @Override // B8.o
    public void U0(B8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "components");
        p088i8.m mVar = this.f917N;
        if (mVar == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f917N = null;
        p088i8.l lVarM = mVar.M();
        p247y7.AbstractC7350t.e(lVarM, "getPackage(...)");
        this.f918O = new D8.i(this, lVarM, this.f915L, this.f913J, this.f914K, kVar, "scope of " + this, new B8.p.b());
    }

    @Override // B8.o
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public B8.z O0() {
        return this.f916M;
    }

    @Override // O7.K
    public p248y8.h u() {
        p248y8.h hVar = this.f918O;
        if (hVar != null) {
            return hVar;
        }
        p247y7.AbstractC7350t.p("_memberScope");
        return null;
    }
}
