package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51958a;

        static {
            int[] iArr = new int[p138n8.k.values().length];
            try {
                iArr[p138n8.k.BEGINNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p138n8.k.AFTER_DOT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p138n8.k.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f51958a = iArr;
        }
    }

    public static final java.lang.Object a(p138n8.c cVar, java.util.Map map) {
        java.lang.Object next;
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(map, "values");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            p138n8.c cVar2 = (p138n8.c) entry.getKey();
            if (p247y7.AbstractC7350t.b(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((p138n8.c) ((java.util.Map.Entry) next).getKey(), cVar).b().length();
                do {
                    java.lang.Object next2 = it.next();
                    int length2 = g((p138n8.c) ((java.util.Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(p138n8.c cVar, p138n8.c cVar2) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(cVar2, "packageName");
        return p247y7.AbstractC7350t.b(f(cVar), cVar2);
    }

    private static final boolean c(java.lang.String str, java.lang.String str2) {
        return S8.r.V(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(p138n8.c cVar, p138n8.c cVar2) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(cVar2, "packageName");
        if (p247y7.AbstractC7350t.b(cVar, cVar2) || cVar2.d()) {
            return true;
        }
        java.lang.String strB = cVar.b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strB2 = cVar2.b();
        p247y7.AbstractC7350t.e(strB2, "asString(...)");
        return c(strB, strB2);
    }

    public static final boolean e(java.lang.String str) {
        if (str == null) {
            return false;
        }
        p138n8.k kVar = p138n8.k.BEGINNING;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            int i10 = n8.e.a.f51958a[kVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (!java.lang.Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = p138n8.k.MIDDLE;
            } else if (i10 != 3) {
                continue;
            } else if (cCharAt == '.') {
                kVar = p138n8.k.AFTER_DOT;
            } else if (!java.lang.Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return kVar != p138n8.k.AFTER_DOT;
    }

    public static final p138n8.c f(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final p138n8.c g(p138n8.c cVar, p138n8.c cVar2) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(cVar2, "prefix");
        if (!d(cVar, cVar2) || cVar2.d()) {
            return cVar;
        }
        if (p247y7.AbstractC7350t.b(cVar, cVar2)) {
            p138n8.c cVar3 = p138n8.c.f51948c;
            p247y7.AbstractC7350t.e(cVar3, "ROOT");
            return cVar3;
        }
        java.lang.String strB = cVar.b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strSubstring = strB.substring(cVar2.b().length() + 1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return new p138n8.c(strSubstring);
    }
}
