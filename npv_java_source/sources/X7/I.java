package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.I.a f15954a = new X7.I.a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.List f15955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.List f15956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.List f15957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Map f15958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Map f15959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Set f15960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Set f15961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final X7.I.a.C0303a f15962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.util.Map f15963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.Map f15964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.Set f15965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.util.List f15966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final java.util.Map f15967n;

    public static final class a {

        /* JADX INFO: renamed from: X7.I$a$a, reason: collision with other inner class name */
        public static final class C0303a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.String f15968a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final p138n8.f f15969b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final java.lang.String f15970c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.lang.String f15971d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final java.lang.String f15972e;

            public C0303a(java.lang.String str, p138n8.f fVar, java.lang.String str2, java.lang.String str3) {
                p247y7.AbstractC7350t.f(str, "classInternalName");
                p247y7.AbstractC7350t.f(fVar, "name");
                p247y7.AbstractC7350t.f(str2, "parameters");
                p247y7.AbstractC7350t.f(str3, "returnType");
                this.f15968a = str;
                this.f15969b = fVar;
                this.f15970c = str2;
                this.f15971d = str3;
                this.f15972e = p068g8.A.f45591a.k(str, fVar + '(' + str2 + ')' + str3);
            }

            public static /* synthetic */ X7.I.a.C0303a b(X7.I.a.C0303a c0303a, java.lang.String str, p138n8.f fVar, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
                if ((i6 & 1) != 0) {
                    str = c0303a.f15968a;
                }
                if ((i6 & 2) != 0) {
                    fVar = c0303a.f15969b;
                }
                if ((i6 & 4) != 0) {
                    str2 = c0303a.f15970c;
                }
                if ((i6 & 8) != 0) {
                    str3 = c0303a.f15971d;
                }
                return c0303a.a(str, fVar, str2, str3);
            }

            public final X7.I.a.C0303a a(java.lang.String str, p138n8.f fVar, java.lang.String str2, java.lang.String str3) {
                p247y7.AbstractC7350t.f(str, "classInternalName");
                p247y7.AbstractC7350t.f(fVar, "name");
                p247y7.AbstractC7350t.f(str2, "parameters");
                p247y7.AbstractC7350t.f(str3, "returnType");
                return new X7.I.a.C0303a(str, fVar, str2, str3);
            }

            public final p138n8.f c() {
                return this.f15969b;
            }

            public final java.lang.String d() {
                return this.f15972e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof X7.I.a.C0303a)) {
                    return false;
                }
                X7.I.a.C0303a c0303a = (X7.I.a.C0303a) obj;
                return p247y7.AbstractC7350t.b(this.f15968a, c0303a.f15968a) && p247y7.AbstractC7350t.b(this.f15969b, c0303a.f15969b) && p247y7.AbstractC7350t.b(this.f15970c, c0303a.f15970c) && p247y7.AbstractC7350t.b(this.f15971d, c0303a.f15971d);
            }

            public int hashCode() {
                return (((((this.f15968a.hashCode() * 31) + this.f15969b.hashCode()) * 31) + this.f15970c.hashCode()) * 31) + this.f15971d.hashCode();
            }

            public java.lang.String toString() {
                return "NameAndSignature(classInternalName=" + this.f15968a + ", name=" + this.f15969b + ", parameters=" + this.f15970c + ", returnType=" + this.f15971d + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final X7.I.a.C0303a m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            p138n8.f fVarO = p138n8.f.o(str2);
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            return new X7.I.a.C0303a(str, fVarO, str3, str4);
        }

        public final p138n8.f b(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "name");
            return (p138n8.f) f().get(fVar);
        }

        public final java.util.List c() {
            return X7.I.f15956c;
        }

        public final java.util.Set d() {
            return X7.I.f15960g;
        }

        public final java.util.Set e() {
            return X7.I.f15961h;
        }

        public final java.util.Map f() {
            return X7.I.f15967n;
        }

        public final java.util.List g() {
            return X7.I.f15966m;
        }

        public final X7.I.a.C0303a h() {
            return X7.I.f15962i;
        }

        public final java.util.Map i() {
            return X7.I.f15959f;
        }

        public final java.util.Map j() {
            return X7.I.f15964k;
        }

        public final boolean k(p138n8.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "<this>");
            return g().contains(fVar);
        }

        public final X7.I.b l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "builtinSignature");
            if (c().contains(str)) {
                return X7.I.b.ONE_COLLECTION_PARAMETER;
            }
            return ((X7.I.c) p097j7.S.i(i(), str)) == X7.I.c.f15980D ? X7.I.b.OBJECT_PARAMETER_GENERIC : X7.I.b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f15977I = p157p7.b.a(e());

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.String f15978C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final boolean f15979D;

        b(java.lang.String str, boolean z6) {
            this.f15978C = str;
            this.f15979D = z6;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.I.c f15980D = new X7.I.c("NULL", 0, null);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final X7.I.c f15981E = new X7.I.c("INDEX", 1, -1);

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final X7.I.c f15982F = new X7.I.c("FALSE", 2, java.lang.Boolean.FALSE);

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final X7.I.c f15983G = new X7.I.c.a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ X7.I.c[] f15984H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f15985I;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Object f15986C;

        static final class a extends X7.I.c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(java.lang.String str, int i6) {
                p247y7.AbstractC7342k abstractC7342k = null;
                super(str, i6, abstractC7342k, abstractC7342k);
            }
        }

        static {
            X7.I.c[] cVarArrE = e();
            f15984H = cVarArrE;
            f15985I = p157p7.b.a(cVarArrE);
        }

        private c(java.lang.String str, int i6, java.lang.Object obj) {
            super(str, i6);
            this.f15986C = obj;
        }

        public /* synthetic */ c(java.lang.String str, int i6, java.lang.Object obj, p247y7.AbstractC7342k abstractC7342k) {
            this(str, i6, obj);
        }

        private static final /* synthetic */ X7.I.c[] e() {
            return new X7.I.c[]{f15980D, f15981E, f15982F, f15983G};
        }

        public static X7.I.c valueOf(java.lang.String str) {
            return (X7.I.c) java.lang.Enum.valueOf(X7.I.c.class, str);
        }

        public static X7.I.c[] values() {
            return (X7.I.c[]) f15984H.clone();
        }
    }

    static {
        java.util.Set<java.lang.String> setG = p097j7.Z.g("containsAll", "removeAll", "retainAll");
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(setG, 10));
        for (java.lang.String str : setG) {
            X7.I.a aVar = f15954a;
            java.lang.String strM = p228w8.e.BOOLEAN.m();
            p247y7.AbstractC7350t.e(strM, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strM));
        }
        f15955b = arrayList;
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((X7.I.a.C0303a) it.next()).d());
        }
        f15956c = arrayList3;
        java.util.List list = f15955b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((X7.I.a.C0303a) it2.next()).c().g());
        }
        f15957d = arrayList4;
        p068g8.A a6 = p068g8.A.f45591a;
        X7.I.a aVar2 = f15954a;
        java.lang.String strI = a6.i("Collection");
        p228w8.e eVar = p228w8.e.BOOLEAN;
        java.lang.String strM2 = eVar.m();
        p247y7.AbstractC7350t.e(strM2, "getDesc(...)");
        X7.I.a.C0303a c0303aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strM2);
        X7.I.c cVar = X7.I.c.f15982F;
        p087i7.u uVarA = p087i7.B.a(c0303aM, cVar);
        java.lang.String strI2 = a6.i("Collection");
        java.lang.String strM3 = eVar.m();
        p247y7.AbstractC7350t.e(strM3, "getDesc(...)");
        p087i7.u uVarA2 = p087i7.B.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strM3), cVar);
        java.lang.String strI3 = a6.i("Map");
        java.lang.String strM4 = eVar.m();
        p247y7.AbstractC7350t.e(strM4, "getDesc(...)");
        p087i7.u uVarA3 = p087i7.B.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strM4), cVar);
        java.lang.String strI4 = a6.i("Map");
        java.lang.String strM5 = eVar.m();
        p247y7.AbstractC7350t.e(strM5, "getDesc(...)");
        p087i7.u uVarA4 = p087i7.B.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strM5), cVar);
        java.lang.String strI5 = a6.i("Map");
        java.lang.String strM6 = eVar.m();
        p247y7.AbstractC7350t.e(strM6, "getDesc(...)");
        p087i7.u uVarA5 = p087i7.B.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM6), cVar);
        p087i7.u uVarA6 = p087i7.B.a(aVar2.m(a6.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), X7.I.c.f15983G);
        X7.I.a.C0303a c0303aM2 = aVar2.m(a6.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        X7.I.c cVar2 = X7.I.c.f15980D;
        p087i7.u uVarA7 = p087i7.B.a(c0303aM2, cVar2);
        p087i7.u uVarA8 = p087i7.B.a(aVar2.m(a6.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        java.lang.String strI6 = a6.i("List");
        p228w8.e eVar2 = p228w8.e.INT;
        java.lang.String strM7 = eVar2.m();
        p247y7.AbstractC7350t.e(strM7, "getDesc(...)");
        X7.I.a.C0303a c0303aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strM7);
        X7.I.c cVar3 = X7.I.c.f15981E;
        p087i7.u uVarA9 = p087i7.B.a(c0303aM3, cVar3);
        java.lang.String strI7 = a6.i("List");
        java.lang.String strM8 = eVar2.m();
        p247y7.AbstractC7350t.e(strM8, "getDesc(...)");
        java.util.Map mapK = p097j7.S.k(uVarA, uVarA2, uVarA3, uVarA4, uVarA5, uVarA6, uVarA7, uVarA8, uVarA9, p087i7.B.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strM8), cVar3));
        f15958e = mapK;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p097j7.S.d(mapK.size()));
        for (java.util.Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(((X7.I.a.C0303a) entry.getKey()).d(), entry.getValue());
        }
        f15959f = linkedHashMap;
        java.util.Set setJ = p097j7.Z.j(f15958e.keySet(), f15955b);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setJ, 10));
        java.util.Iterator it3 = setJ.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((X7.I.a.C0303a) it3.next()).c());
        }
        f15960g = p097j7.AbstractC6879v.Y0(arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setJ, 10));
        java.util.Iterator it4 = setJ.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((X7.I.a.C0303a) it4.next()).d());
        }
        f15961h = p097j7.AbstractC6879v.Y0(arrayList6);
        X7.I.a aVar3 = f15954a;
        p228w8.e eVar3 = p228w8.e.INT;
        java.lang.String strM9 = eVar3.m();
        p247y7.AbstractC7350t.e(strM9, "getDesc(...)");
        X7.I.a.C0303a c0303aM4 = aVar3.m("java/util/List", "removeAt", strM9, "Ljava/lang/Object;");
        f15962i = c0303aM4;
        p068g8.A a10 = p068g8.A.f45591a;
        java.lang.String strH = a10.h("Number");
        java.lang.String strM10 = p228w8.e.BYTE.m();
        p247y7.AbstractC7350t.e(strM10, "getDesc(...)");
        p087i7.u uVarA10 = p087i7.B.a(aVar3.m(strH, "toByte", "", strM10), p138n8.f.o("byteValue"));
        java.lang.String strH2 = a10.h("Number");
        java.lang.String strM11 = p228w8.e.SHORT.m();
        p247y7.AbstractC7350t.e(strM11, "getDesc(...)");
        p087i7.u uVarA11 = p087i7.B.a(aVar3.m(strH2, "toShort", "", strM11), p138n8.f.o("shortValue"));
        java.lang.String strH3 = a10.h("Number");
        java.lang.String strM12 = eVar3.m();
        p247y7.AbstractC7350t.e(strM12, "getDesc(...)");
        p087i7.u uVarA12 = p087i7.B.a(aVar3.m(strH3, "toInt", "", strM12), p138n8.f.o("intValue"));
        java.lang.String strH4 = a10.h("Number");
        java.lang.String strM13 = p228w8.e.LONG.m();
        p247y7.AbstractC7350t.e(strM13, "getDesc(...)");
        p087i7.u uVarA13 = p087i7.B.a(aVar3.m(strH4, "toLong", "", strM13), p138n8.f.o("longValue"));
        java.lang.String strH5 = a10.h("Number");
        java.lang.String strM14 = p228w8.e.FLOAT.m();
        p247y7.AbstractC7350t.e(strM14, "getDesc(...)");
        p087i7.u uVarA14 = p087i7.B.a(aVar3.m(strH5, "toFloat", "", strM14), p138n8.f.o("floatValue"));
        java.lang.String strH6 = a10.h("Number");
        java.lang.String strM15 = p228w8.e.DOUBLE.m();
        p247y7.AbstractC7350t.e(strM15, "getDesc(...)");
        p087i7.u uVarA15 = p087i7.B.a(aVar3.m(strH6, "toDouble", "", strM15), p138n8.f.o("doubleValue"));
        p087i7.u uVarA16 = p087i7.B.a(c0303aM4, p138n8.f.o("remove"));
        java.lang.String strH7 = a10.h("CharSequence");
        java.lang.String strM16 = eVar3.m();
        p247y7.AbstractC7350t.e(strM16, "getDesc(...)");
        java.lang.String strM17 = p228w8.e.CHAR.m();
        p247y7.AbstractC7350t.e(strM17, "getDesc(...)");
        java.util.Map mapK2 = p097j7.S.k(uVarA10, uVarA11, uVarA12, uVarA13, uVarA14, uVarA15, uVarA16, p087i7.B.a(aVar3.m(strH7, "get", strM16, strM17), p138n8.f.o("charAt")));
        f15963j = mapK2;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p097j7.S.d(mapK2.size()));
        for (java.util.Map.Entry entry2 : mapK2.entrySet()) {
            linkedHashMap2.put(((X7.I.a.C0303a) entry2.getKey()).d(), entry2.getValue());
        }
        f15964k = linkedHashMap2;
        java.util.Map map = f15963j;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(X7.I.a.C0303a.b((X7.I.a.C0303a) entry3.getKey(), null, (p138n8.f) entry3.getValue(), null, null, 13, null).d());
        }
        f15965l = linkedHashSet;
        java.util.Set setKeySet = f15963j.keySet();
        java.util.ArrayList arrayList7 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setKeySet, 10));
        java.util.Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((X7.I.a.C0303a) it5.next()).c());
        }
        f15966m = arrayList7;
        java.util.Set<java.util.Map.Entry> setEntrySet = f15963j.entrySet();
        java.util.ArrayList<p087i7.u> arrayList8 = new java.util.ArrayList(p097j7.AbstractC6879v.x(setEntrySet, 10));
        for (java.util.Map.Entry entry4 : setEntrySet) {
            arrayList8.add(new p087i7.u(((X7.I.a.C0303a) entry4.getKey()).c(), entry4.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(arrayList8, 10)), 16));
        for (p087i7.u uVar : arrayList8) {
            linkedHashMap3.put((p138n8.f) uVar.d(), (p138n8.f) uVar.c());
        }
        f15967n = linkedHashMap3;
    }
}
