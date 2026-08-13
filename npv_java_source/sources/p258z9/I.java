package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p258z9.C7412z.a f57672a = new p258z9.C7412z.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p258z9.C7412z.a f57673b = new p258z9.C7412z.a();

    private static final java.util.Map b(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b) {
        java.lang.String lowerCase;
        java.lang.String[] strArrNames;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean zD = d(abstractC7358b, fVar);
        n(fVar, abstractC7358b);
        int iE = fVar.e();
        for (int i6 = 0; i6 < iE; i6++) {
            java.util.List listG = fVar.g(i6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listG) {
                if (obj instanceof p249y9.y) {
                    arrayList.add(obj);
                }
            }
            p249y9.y yVar = (p249y9.y) p097j7.AbstractC6879v.I0(arrayList);
            if (yVar != null && (strArrNames = yVar.names()) != null) {
                for (java.lang.String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(java.util.Locale.ROOT);
                        p247y7.AbstractC7350t.e(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i6);
                }
            }
            if (zD) {
                lowerCase = fVar.f(i6).toLowerCase(java.util.Locale.ROOT);
                p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i6);
            }
        }
        return linkedHashMap.isEmpty() ? p097j7.S.h() : linkedHashMap;
    }

    private static final void c(java.util.Map map, p219v9.f fVar, java.lang.String str, int i6) {
        java.lang.String str2 = p247y7.AbstractC7350t.b(fVar.j(), v9.m.b.f56057a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, java.lang.Integer.valueOf(i6));
            return;
        }
        throw new p258z9.F("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i6) + " is already one of the names for " + str2 + ' ' + fVar.f(((java.lang.Number) p097j7.S.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(p249y9.AbstractC7358b abstractC7358b, p219v9.f fVar) {
        return abstractC7358b.e().h() && p247y7.AbstractC7350t.b(fVar.j(), v9.m.b.f56057a);
    }

    public static final java.util.Map e(final p249y9.AbstractC7358b abstractC7358b, final p219v9.f fVar) {
        p247y7.AbstractC7350t.f(abstractC7358b, "<this>");
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return (java.util.Map) p249y9.H.a(abstractC7358b).b(fVar, f57672a, new p237x7.a() { // from class: z9.H
            @Override // p237x7.a
            public final java.lang.Object b() {
                return p258z9.I.f(fVar, abstractC7358b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map f(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b) {
        return b(fVar, abstractC7358b);
    }

    public static final p258z9.C7412z.a g() {
        return f57672a;
    }

    public static final java.lang.String h(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b, int i6) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        n(fVar, abstractC7358b);
        return fVar.f(i6);
    }

    public static final int i(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b, java.lang.String str) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(str, "name");
        if (d(abstractC7358b, fVar)) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
            return l(fVar, abstractC7358b, lowerCase);
        }
        n(fVar, abstractC7358b);
        int iD = fVar.d(str);
        return (iD == -3 && abstractC7358b.e().o()) ? l(fVar, abstractC7358b, str) : iD;
    }

    public static final int j(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "suffix");
        int i6 = i(fVar, abstractC7358b, str);
        if (i6 != -3) {
            return i6;
        }
        throw new p199t9.d(fVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int k(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b, java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, abstractC7358b, str, str2);
    }

    private static final int l(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b, java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) e(abstractC7358b, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        if (!abstractC7358b.e().k()) {
            java.util.List listK = fVar.k();
            if (!(listK instanceof java.util.Collection) || !listK.isEmpty()) {
                java.util.Iterator it = listK.iterator();
                while (it.hasNext()) {
                    if (((java.lang.annotation.Annotation) it.next()) instanceof p249y9.t) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final p249y9.z n(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        if (!p247y7.AbstractC7350t.b(fVar.j(), v9.n.a.f56058a)) {
            return null;
        }
        abstractC7358b.e().l();
        return null;
    }
}
