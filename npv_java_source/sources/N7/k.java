package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends B8.AbstractC0820a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N7.k.a f7901f = new N7.k.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(E8.n nVar, p068g8.r rVar, O7.G g6, O7.J j6, Q7.a aVar, Q7.c cVar, B8.l lVar, G8.l lVar2, p238x8.a aVar2) {
        super(nVar, rVar, g6);
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(rVar, "finder");
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        p247y7.AbstractC7350t.f(aVar, "additionalClassPartsProvider");
        p247y7.AbstractC7350t.f(cVar, "platformDependentDeclarationFilter");
        p247y7.AbstractC7350t.f(lVar, "deserializationConfiguration");
        p247y7.AbstractC7350t.f(lVar2, "kotlinTypeChecker");
        p247y7.AbstractC7350t.f(aVar2, "samConversionResolver");
        B8.n nVar2 = new B8.n(this);
        C8.a aVar3 = C8.a.f1375r;
        B8.C0823d c0823d = new B8.C0823d(g6, j6, aVar3);
        B8.w.a aVar4 = B8.w.a.f931a;
        B8.r rVar2 = B8.r.f922a;
        p247y7.AbstractC7350t.e(rVar2, "DO_NOTHING");
        i(new B8.k(nVar, g6, lVar, nVar2, c0823d, this, aVar4, rVar2, W7.c.a.f15396a, B8.s.a.f923a, p097j7.AbstractC6879v.p(new M7.a(nVar, g6), new N7.e(nVar, g6, null, 4, null)), j6, B8.j.f877a.a(), aVar, cVar, aVar3.e(), lVar2, aVar2, null, B8.u.f930a, 262144, null));
    }

    @Override // B8.AbstractC0820a
    protected B8.o d(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.io.InputStream inputStreamC = f().c(cVar);
        if (inputStreamC != null) {
            return C8.c.f1377Q.a(cVar, h(), g(), inputStreamC, false);
        }
        return null;
    }
}
