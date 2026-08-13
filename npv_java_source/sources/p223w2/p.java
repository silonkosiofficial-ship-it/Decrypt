package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(((w2.o.a) obj).f56200a, ((w2.o.a) obj2).f56200a);
        }
    }

    public static final class b implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(((w2.o.d) obj).f56213a, ((w2.o.d) obj2).f56213a);
        }
    }

    private static final boolean a(java.lang.String str) {
        if (str.length() == 0) {
            return false;
        }
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < str.length()) {
            char cCharAt = str.charAt(i6);
            int i12 = i11 + 1;
            if (i11 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i10++;
            } else if (cCharAt == ')' && (i10 = i10 - 1) == 0 && i11 != str.length() - 1) {
                return false;
            }
            i6++;
            i11 = i12;
        }
        return i10 == 0;
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "current");
        if (p247y7.AbstractC7350t.b(str, str2)) {
            return true;
        }
        if (!a(str)) {
            return false;
        }
        java.lang.String strSubstring = str.substring(1, str.length() - 1);
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return p247y7.AbstractC7350t.b(S8.r.u1(strSubstring).toString(), str2);
    }

    public static final boolean c(w2.o.a aVar, java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        p247y7.AbstractC7350t.f(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof w2.o.a)) {
            return false;
        }
        w2.o.a aVar2 = (w2.o.a) obj;
        if (aVar.a() != aVar2.a() || !p247y7.AbstractC7350t.b(aVar.f56200a, aVar2.f56200a) || aVar.f56202c != aVar2.f56202c) {
            return false;
        }
        if (aVar.f56205f == 1 && aVar2.f56205f == 2 && (str3 = aVar.f56204e) != null && !b(str3, aVar2.f56204e)) {
            return false;
        }
        if (aVar.f56205f == 2 && aVar2.f56205f == 1 && (str2 = aVar2.f56204e) != null && !b(str2, aVar.f56204e)) {
            return false;
        }
        int i6 = aVar.f56205f;
        return (i6 == 0 || i6 != aVar2.f56205f || ((str = aVar.f56204e) == null ? aVar2.f56204e == null : b(str, aVar2.f56204e))) && aVar.f56206g == aVar2.f56206g;
    }

    public static final boolean d(w2.o.c cVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof w2.o.c)) {
            return false;
        }
        w2.o.c cVar2 = (w2.o.c) obj;
        if (p247y7.AbstractC7350t.b(cVar.f56207a, cVar2.f56207a) && p247y7.AbstractC7350t.b(cVar.f56208b, cVar2.f56208b) && p247y7.AbstractC7350t.b(cVar.f56209c, cVar2.f56209c) && p247y7.AbstractC7350t.b(cVar.f56210d, cVar2.f56210d)) {
            return p247y7.AbstractC7350t.b(cVar.f56211e, cVar2.f56211e);
        }
        return false;
    }

    public static final boolean e(w2.o.d dVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof w2.o.d)) {
            return false;
        }
        w2.o.d dVar2 = (w2.o.d) obj;
        if (dVar.f56214b == dVar2.f56214b && p247y7.AbstractC7350t.b(dVar.f56215c, dVar2.f56215c) && p247y7.AbstractC7350t.b(dVar.f56216d, dVar2.f56216d)) {
            return S8.r.V(dVar.f56213a, "index_", false, 2, null) ? S8.r.V(dVar2.f56213a, "index_", false, 2, null) : p247y7.AbstractC7350t.b(dVar.f56213a, dVar2.f56213a);
        }
        return false;
    }

    public static final boolean f(p223w2.o oVar, java.lang.Object obj) {
        java.util.Set set;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        if (oVar == obj) {
            return true;
        }
        if (!(obj instanceof p223w2.o)) {
            return false;
        }
        p223w2.o oVar2 = (p223w2.o) obj;
        if (!p247y7.AbstractC7350t.b(oVar.f56195a, oVar2.f56195a) || !p247y7.AbstractC7350t.b(oVar.f56196b, oVar2.f56196b) || !p247y7.AbstractC7350t.b(oVar.f56197c, oVar2.f56197c)) {
            return false;
        }
        java.util.Set set2 = oVar.f56198d;
        if (set2 == null || (set = oVar2.f56198d) == null) {
            return true;
        }
        return p247y7.AbstractC7350t.b(set2, set);
    }

    public static final java.lang.String g(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "collection");
        if (!(!collection.isEmpty())) {
            return " }";
        }
        return S8.r.k(p097j7.AbstractC6879v.r0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(w2.o.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        return (((((aVar.f56200a.hashCode() * 31) + aVar.f56206g) * 31) + (aVar.f56202c ? 1231 : 1237)) * 31) + aVar.f56203d;
    }

    public static final int i(w2.o.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        return (((((((cVar.f56207a.hashCode() * 31) + cVar.f56208b.hashCode()) * 31) + cVar.f56209c.hashCode()) * 31) + cVar.f56210d.hashCode()) * 31) + cVar.f56211e.hashCode();
    }

    public static final int j(w2.o.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        return ((((((S8.r.V(dVar.f56213a, "index_", false, 2, null) ? -1184239155 : dVar.f56213a.hashCode()) * 31) + (dVar.f56214b ? 1 : 0)) * 31) + dVar.f56215c.hashCode()) * 31) + dVar.f56216d.hashCode();
    }

    public static final int k(p223w2.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "<this>");
        return (((oVar.f56195a.hashCode() * 31) + oVar.f56196b.hashCode()) * 31) + oVar.f56197c.hashCode();
    }

    private static final void l(java.util.Collection collection) {
        S8.r.k(p097j7.AbstractC6879v.r0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        S8.r.k(" }", null, 1, null);
    }

    private static final void m(java.util.Collection collection) {
        S8.r.k(p097j7.AbstractC6879v.r0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        S8.r.k("},", null, 1, null);
    }

    public static final java.lang.String n(w2.o.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n            |Column {\n            |   name = '");
        sb.append(aVar.f56200a);
        sb.append("',\n            |   type = '");
        sb.append(aVar.f56201b);
        sb.append("',\n            |   affinity = '");
        sb.append(aVar.f56206g);
        sb.append("',\n            |   notNull = '");
        sb.append(aVar.f56202c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(aVar.f56203d);
        sb.append("',\n            |   defaultValue = '");
        java.lang.String str = aVar.f56204e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return S8.r.k(S8.r.q(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final java.lang.String o(w2.o.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(cVar.f56207a);
        sb.append("',\n            |   onDelete = '");
        sb.append(cVar.f56208b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(cVar.f56209c);
        sb.append("',\n            |   columnNames = {");
        m(p097j7.AbstractC6879v.K0(cVar.f56210d));
        p087i7.M m6 = p087i7.M.f46721a;
        sb.append(m6);
        sb.append("\n            |   referenceColumnNames = {");
        l(p097j7.AbstractC6879v.K0(cVar.f56211e));
        sb.append(m6);
        sb.append("\n            |}\n        ");
        return S8.r.k(S8.r.q(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final java.lang.String p(w2.o.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n            |Index {\n            |   name = '");
        sb.append(dVar.f56213a);
        sb.append("',\n            |   unique = '");
        sb.append(dVar.f56214b);
        sb.append("',\n            |   columns = {");
        m(dVar.f56215c);
        p087i7.M m6 = p087i7.M.f46721a;
        sb.append(m6);
        sb.append("\n            |   orders = {");
        l(dVar.f56216d);
        sb.append(m6);
        sb.append("\n            |}\n        ");
        return S8.r.k(S8.r.q(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final java.lang.String q(p223w2.o oVar) {
        java.util.List listM;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n            |TableInfo {\n            |    name = '");
        sb.append(oVar.f56195a);
        sb.append("',\n            |    columns = {");
        sb.append(g(p097j7.AbstractC6879v.L0(oVar.f56196b.values(), new w2.p.a())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(g(oVar.f56197c));
        sb.append("\n            |    indices = {");
        java.util.Set set = oVar.f56198d;
        if (set == null || (listM = p097j7.AbstractC6879v.L0(set, new w2.p.b())) == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        sb.append(g(listM));
        sb.append("\n            |}\n        ");
        return S8.r.q(sb.toString(), null, 1, null);
    }
}
