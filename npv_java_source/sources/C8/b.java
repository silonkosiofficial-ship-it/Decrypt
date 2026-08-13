package C8;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements L7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C8.d f1376b = new C8.d();

    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "loadResource";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(C8.d.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.io.InputStream l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "p0");
            return ((C8.d) this.f57287D).a(str);
        }
    }

    @Override // L7.a
    public O7.L a(E8.n nVar, O7.G g6, java.lang.Iterable iterable, Q7.c cVar, Q7.a aVar, boolean z6) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "builtInsModule");
        p247y7.AbstractC7350t.f(iterable, "classDescriptorFactories");
        p247y7.AbstractC7350t.f(cVar, "platformDependentDeclarationFilter");
        p247y7.AbstractC7350t.f(aVar, "additionalClassPartsProvider");
        return b(nVar, g6, L7.j.f6300F, iterable, cVar, aVar, z6, new C8.b.a(this.f1376b));
    }

    public final O7.L b(E8.n nVar, O7.G g6, java.util.Set set, java.lang.Iterable iterable, Q7.c cVar, Q7.a aVar, boolean z6, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(set, "packageFqNames");
        p247y7.AbstractC7350t.f(iterable, "classDescriptorFactories");
        p247y7.AbstractC7350t.f(cVar, "platformDependentDeclarationFilter");
        p247y7.AbstractC7350t.f(aVar, "additionalClassPartsProvider");
        p247y7.AbstractC7350t.f(lVar, "loadResource");
        java.util.Set<p138n8.c> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(set2, 10));
        for (p138n8.c cVar2 : set2) {
            java.lang.String strR = C8.a.f1375r.r(cVar2);
            java.io.InputStream inputStream = (java.io.InputStream) lVar.l(strR);
            if (inputStream == null) {
                throw new java.lang.IllegalStateException("Resource not found in classpath: " + strR);
            }
            arrayList.add(C8.c.f1377Q.a(cVar2, nVar, g6, inputStream, z6));
        }
        O7.M m6 = new O7.M(arrayList);
        O7.J j6 = new O7.J(nVar, g6);
        B8.l.a aVar2 = B8.l.a.f901a;
        B8.n nVar2 = new B8.n(m6);
        C8.a aVar3 = C8.a.f1375r;
        B8.C0823d c0823d = new B8.C0823d(g6, j6, aVar3);
        B8.w.a aVar4 = B8.w.a.f931a;
        B8.r rVar = B8.r.f922a;
        p247y7.AbstractC7350t.e(rVar, "DO_NOTHING");
        B8.k kVar = new B8.k(nVar, g6, aVar2, nVar2, c0823d, m6, aVar4, rVar, W7.c.a.f15396a, B8.s.a.f923a, iterable, j6, B8.j.f877a.a(), aVar, cVar, aVar3.e(), null, new p238x8.b(nVar, p097j7.AbstractC6879v.m()), null, null, 851968, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C8.c) it.next()).U0(kVar);
        }
        return m6;
    }
}
