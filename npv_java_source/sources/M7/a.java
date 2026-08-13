package M7;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Q7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E8.n f7039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.G f7040b;

    public a(E8.n nVar, O7.G g6) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "module");
        this.f7039a = nVar;
        this.f7040b = g6;
    }

    @Override // Q7.b
    public java.util.Collection a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        return p097j7.Z.d();
    }

    @Override // Q7.b
    public boolean b(p138n8.c cVar, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        p247y7.AbstractC7350t.f(fVar, "name");
        java.lang.String strG = fVar.g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return (S8.r.V(strG, "Function", false, 2, null) || S8.r.V(strG, "KFunction", false, 2, null) || S8.r.V(strG, "SuspendFunction", false, 2, null) || S8.r.V(strG, "KSuspendFunction", false, 2, null)) && M7.g.f7070c.a().c(cVar, strG) != null;
    }

    @Override // Q7.b
    public O7.InterfaceC1424e c(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        if (bVar.k() || bVar.l()) {
            return null;
        }
        java.lang.String strB = bVar.i().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        if (!S8.r.c0(strB, "Function", false, 2, null)) {
            return null;
        }
        p138n8.c cVarH = bVar.h();
        p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
        M7.g.b bVarC = M7.g.f7070c.a().c(cVarH, strB);
        if (bVarC == null) {
            return null;
        }
        M7.f fVarA = bVarC.a();
        int iB = bVarC.b();
        java.util.List listN = this.f7040b.s0(cVarH).N();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listN) {
            if (obj instanceof L7.b) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        androidx.appcompat.app.D.a(p097j7.AbstractC6879v.k0(arrayList2));
        return new M7.b(this.f7039a, (L7.b) p097j7.AbstractC6879v.i0(arrayList), fVarA, iB);
    }
}
