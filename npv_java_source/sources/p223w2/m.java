package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f56192a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final class a implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
        }
    }

    public static final class b implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
        }
    }

    public static final int a(java.lang.String str) {
        if (str == null) {
            return 5;
        }
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (S8.r.c0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (S8.r.c0(upperCase, "CHAR", false, 2, null) || S8.r.c0(upperCase, "CLOB", false, 2, null) || S8.r.c0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (S8.r.c0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (S8.r.c0(upperCase, "REAL", false, 2, null) || S8.r.c0(upperCase, "FLOA", false, 2, null) || S8.r.c0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    private static final java.util.Map b(p243y2.b bVar, java.lang.String str) {
        p243y2.e eVarE = bVar.e("PRAGMA table_info(`" + str + "`)");
        try {
            if (!eVarE.p()) {
                return p097j7.S.h();
            }
            int iA = p223w2.j.a(eVarE, "name");
            int iA2 = p223w2.j.a(eVarE, "type");
            int iA3 = p223w2.j.a(eVarE, "notnull");
            int iA4 = p223w2.j.a(eVarE, "pk");
            int iA5 = p223w2.j.a(eVarE, "dflt_value");
            java.util.Map mapC = p097j7.S.c();
            do {
                java.lang.String strO = eVarE.o(iA);
                mapC.put(strO, new w2.o.a(strO, eVarE.o(iA2), eVarE.getLong(iA3) != 0, (int) eVarE.getLong(iA4), eVarE.isNull(iA5) ? null : eVarE.o(iA5), 2));
            } while (eVarE.p());
            return p097j7.S.b(mapC);
        } finally {
            eVarE.close();
        }
    }

    private static final java.util.List c(p243y2.e eVar) {
        int iA = p223w2.j.a(eVar, "id");
        int iA2 = p223w2.j.a(eVar, "seq");
        int iA3 = p223w2.j.a(eVar, "from");
        int iA4 = p223w2.j.a(eVar, "to");
        java.util.List listC = p097j7.AbstractC6879v.c();
        while (eVar.p()) {
            listC.add(new p223w2.f((int) eVar.getLong(iA), (int) eVar.getLong(iA2), eVar.o(iA3), eVar.o(iA4)));
        }
        return p097j7.AbstractC6879v.K0(p097j7.AbstractC6879v.a(listC));
    }

    private static final java.util.Set d(p243y2.b bVar, java.lang.String str) {
        p243y2.e eVarE = bVar.e("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = p223w2.j.a(eVarE, "id");
            int iA2 = p223w2.j.a(eVarE, "seq");
            int iA3 = p223w2.j.a(eVarE, "table");
            int iA4 = p223w2.j.a(eVarE, "on_delete");
            int iA5 = p223w2.j.a(eVarE, "on_update");
            java.util.List listC = c(eVarE);
            eVarE.a();
            java.util.Set setB = p097j7.Z.b();
            while (eVarE.p()) {
                if (eVarE.getLong(iA2) == 0) {
                    int i6 = (int) eVarE.getLong(iA);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList<p223w2.f> arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : listC) {
                        if (((p223w2.f) obj).i() == i6) {
                            arrayList3.add(obj);
                        }
                    }
                    for (p223w2.f fVar : arrayList3) {
                        arrayList.add(fVar.g());
                        arrayList2.add(fVar.m());
                    }
                    setB.add(new w2.o.c(eVarE.o(iA3), eVarE.o(iA4), eVarE.o(iA5), arrayList, arrayList2));
                }
            }
            return p097j7.Z.a(setB);
        } finally {
            eVarE.close();
        }
    }

    private static final w2.o.d e(p243y2.b bVar, java.lang.String str, boolean z6) {
        p243y2.e eVarE = bVar.e("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = p223w2.j.a(eVarE, "seqno");
            int iA2 = p223w2.j.a(eVarE, "cid");
            int iA3 = p223w2.j.a(eVarE, "name");
            int iA4 = p223w2.j.a(eVarE, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                while (eVarE.p()) {
                    if (((int) eVarE.getLong(iA2)) >= 0) {
                        int i6 = (int) eVarE.getLong(iA);
                        java.lang.String strO = eVarE.o(iA3);
                        java.lang.String str2 = eVarE.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(java.lang.Integer.valueOf(i6), strO);
                        linkedHashMap2.put(java.lang.Integer.valueOf(i6), str2);
                    }
                }
                java.util.List listL0 = p097j7.AbstractC6879v.L0(linkedHashMap.entrySet(), new w2.m.a());
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listL0, 10));
                java.util.Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                }
                java.util.List listT0 = p097j7.AbstractC6879v.T0(arrayList);
                java.util.List listL1 = p097j7.AbstractC6879v.L0(linkedHashMap2.entrySet(), new w2.m.b());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listL1, 10));
                java.util.Iterator it2 = listL1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
                }
                return new w2.o.d(str, z6, listT0, p097j7.AbstractC6879v.T0(arrayList2));
            }
            return null;
        } finally {
            eVarE.close();
        }
    }

    private static final java.util.Set f(p243y2.b bVar, java.lang.String str) {
        p243y2.e eVarE = bVar.e("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = p223w2.j.a(eVarE, "name");
            int iA2 = p223w2.j.a(eVarE, "origin");
            int iA3 = p223w2.j.a(eVarE, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                java.util.Set setB = p097j7.Z.b();
                while (eVarE.p()) {
                    if (p247y7.AbstractC7350t.b("c", eVarE.o(iA2))) {
                        w2.o.d dVarE = e(bVar, eVarE.o(iA), eVarE.getLong(iA3) == 1);
                        if (dVarE == null) {
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                return p097j7.Z.a(setB);
            }
            return null;
        } finally {
            eVarE.close();
        }
    }

    public static final p223w2.o g(p243y2.b bVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        p247y7.AbstractC7350t.f(str, "tableName");
        return new p223w2.o(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }
}
