package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p128m8.b f51203a = new p128m8.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f51204b = p097j7.AbstractC6879v.r0(p097j7.AbstractC6879v.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f51205c;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List listP = p097j7.AbstractC6879v.p("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = p167q7.c.b(0, listP.size() - 1, 2);
        if (iB >= 0) {
            int i6 = 0;
            while (true) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String str = f51204b;
                sb.append(str);
                sb.append('/');
                sb.append((java.lang.String) listP.get(i6));
                int i10 = i6 + 1;
                linkedHashMap.put(sb.toString(), listP.get(i10));
                linkedHashMap.put(str + '/' + ((java.lang.String) listP.get(i6)) + "Array", '[' + ((java.lang.String) listP.get(i10)));
                if (i6 == iB) {
                    break;
                } else {
                    i6 += 2;
                }
            }
        }
        linkedHashMap.put(f51204b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (java.lang.String str2 : p097j7.AbstractC6879v.p("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (java.lang.String str3 : p097j7.AbstractC6879v.p("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i11 = 0; i11 < 23; i11++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.String str4 = f51204b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i11);
            a(linkedHashMap, "Function" + i11, sb2.toString());
            a(linkedHashMap, "reflect/KFunction" + i11, str4 + "/reflect/KFunction");
        }
        for (java.lang.String str5 : p097j7.AbstractC6879v.p("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f51204b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f51205c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(java.util.Map map, java.lang.String str, java.lang.String str2) {
        map.put(f51204b + '/' + str, 'L' + str2 + ';');
    }

    public static final java.lang.String b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "classId");
        java.lang.String str2 = (java.lang.String) f51205c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + S8.r.Q(str, '.', '$', false, 4, null) + ';';
    }
}
