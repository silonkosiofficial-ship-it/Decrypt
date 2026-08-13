package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p068g8.j f13293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T7.g f13294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f13295c;

    public a(p068g8.j jVar, T7.g gVar) {
        p247y7.AbstractC7350t.f(jVar, "resolver");
        p247y7.AbstractC7350t.f(gVar, "kotlinClassFinder");
        this.f13293a = jVar;
        this.f13294b = gVar;
        this.f13295c = new j$.util.concurrent.ConcurrentHashMap();
    }

    public final p248y8.h a(T7.f fVar) {
        java.util.Collection collectionE;
        p247y7.AbstractC7350t.f(fVar, "fileClass");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f13295c;
        p138n8.b bVarC = fVar.c();
        java.lang.Object obj = concurrentHashMap.get(bVarC);
        if (obj == null) {
            p138n8.c cVarH = fVar.c().h();
            p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
            if (fVar.b().c() == p078h8.a.EnumC0561a.MULTIFILE_CLASS) {
                java.util.List listF = fVar.b().f();
                collectionE = new java.util.ArrayList();
                java.util.Iterator it = listF.iterator();
                while (it.hasNext()) {
                    p138n8.b bVarM = p138n8.b.m(p228w8.d.d((java.lang.String) it.next()).e());
                    p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
                    p068g8.t tVarB = p068g8.s.b(this.f13294b, bVarM, P8.c.a(this.f13293a.d().g()));
                    if (tVarB != null) {
                        collectionE.add(tVarB);
                    }
                }
            } else {
                collectionE = p097j7.AbstractC6879v.e(fVar);
            }
            R7.C1507m c1507m = new R7.C1507m(this.f13293a.d().q(), cVarH);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it2 = collectionE.iterator();
            while (it2.hasNext()) {
                p248y8.h hVarB = this.f13293a.b(c1507m, (p068g8.t) it2.next());
                if (hVarB != null) {
                    arrayList.add(hVarB);
                }
            }
            java.util.List listT0 = p097j7.AbstractC6879v.T0(arrayList);
            p248y8.h hVarA = p248y8.b.f57309d.a("package " + cVarH + " (" + fVar + ')', listT0);
            java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarC, hVarA);
            obj = objPutIfAbsent == null ? hVarA : objPutIfAbsent;
        }
        p247y7.AbstractC7350t.e(obj, "getOrPut(...)");
        return (p248y8.h) obj;
    }
}
