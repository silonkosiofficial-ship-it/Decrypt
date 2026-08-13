package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static final p058f8.e a(p058f8.e eVar, java.util.Collection collection, boolean z6, boolean z10, boolean z11) {
        p058f8.h hVarD;
        boolean z12;
        p247y7.AbstractC7350t.f(eVar, "<this>");
        p247y7.AbstractC7350t.f(collection, "superQualifiers");
        java.util.Collection collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            p058f8.h hVarB = b((p058f8.e) it.next());
            if (hVarB != null) {
                arrayList.add(hVarB);
            }
        }
        p058f8.h hVarD2 = d(p097j7.AbstractC6879v.Y0(arrayList), b(eVar), z6);
        if (hVarD2 == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                p058f8.h hVarD3 = ((p058f8.e) it2.next()).d();
                if (hVarD3 != null) {
                    arrayList2.add(hVarD3);
                }
            }
            hVarD = d(p097j7.AbstractC6879v.Y0(arrayList2), eVar.d(), z6);
        } else {
            hVarD = hVarD2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            p058f8.f fVarC = ((p058f8.e) it3.next()).c();
            if (fVarC != null) {
                arrayList3.add(fVarC);
            }
        }
        p058f8.f fVar = (p058f8.f) e(p097j7.AbstractC6879v.Y0(arrayList3), p058f8.f.MUTABLE, p058f8.f.READ_ONLY, eVar.c(), z6);
        p058f8.h hVar = null;
        if (hVarD != null && !z11 && (!z10 || hVarD != p058f8.h.NULLABLE)) {
            hVar = hVarD;
        }
        boolean z13 = false;
        if (hVar != p058f8.h.NOT_NULL) {
            z12 = false;
        } else {
            if (!eVar.b()) {
                if (!collection2.isEmpty()) {
                    java.util.Iterator it4 = collection2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((p058f8.e) it4.next()).b()) {
                            }
                        }
                    }
                }
                z12 = false;
            }
            z12 = true;
        }
        if (hVar != null && hVarD2 != hVarD) {
            z13 = true;
        }
        return new p058f8.e(hVar, fVar, z12, z13);
    }

    private static final p058f8.h b(p058f8.e eVar) {
        if (eVar.e()) {
            return null;
        }
        return eVar.d();
    }

    public static final boolean c(F8.o0 o0Var, J8.i iVar) {
        p247y7.AbstractC7350t.f(o0Var, "<this>");
        p247y7.AbstractC7350t.f(iVar, "type");
        p138n8.c cVar = X7.B.f15917v;
        p247y7.AbstractC7350t.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return o0Var.l(iVar, cVar);
    }

    private static final p058f8.h d(java.util.Set set, p058f8.h hVar, boolean z6) {
        p058f8.h hVar2 = p058f8.h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (p058f8.h) e(set, p058f8.h.NOT_NULL, p058f8.h.NULLABLE, hVar, z6);
    }

    private static final java.lang.Object e(java.util.Set set, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean z6) {
        java.util.Set setY0;
        java.lang.Object obj4;
        if (!z6) {
            if (obj3 != null && (setY0 = p097j7.AbstractC6879v.Y0(p097j7.Z.k(set, obj3))) != null) {
                set = setY0;
            }
            return p097j7.AbstractC6879v.H0(set);
        }
        if (set.contains(obj)) {
            obj4 = obj;
        } else {
            obj4 = set.contains(obj2) ? obj2 : null;
        }
        if (p247y7.AbstractC7350t.b(obj4, obj) && p247y7.AbstractC7350t.b(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
