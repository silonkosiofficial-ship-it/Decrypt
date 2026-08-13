package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f5337a = new p138n8.c("kotlin.jvm.JvmStatic");

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5338a;

        static {
            int[] iArr = new int[L7.h.values().length];
            try {
                iArr[L7.h.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[L7.h.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[L7.h.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[L7.h.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[L7.h.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[L7.h.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[L7.h.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[L7.h.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            f5338a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v12, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v14, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object a(p198t8.b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I7.M.a(t8.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final I7.AbstractC1274j b(java.lang.Object obj) {
        I7.AbstractC1274j abstractC1274j = obj instanceof I7.AbstractC1274j ? (I7.AbstractC1274j) obj : null;
        if (abstractC1274j != null) {
            return abstractC1274j;
        }
        I7.o oVarC = c(obj);
        return oVarC != null ? oVarC : d(obj);
    }

    public static final I7.o c(java.lang.Object obj) {
        I7.o oVar = obj instanceof I7.o ? (I7.o) obj : null;
        if (oVar != null) {
            return oVar;
        }
        p247y7.AbstractC7347p abstractC7347p = obj instanceof p247y7.AbstractC7347p ? (p247y7.AbstractC7347p) obj : null;
        F7.b bVarA = abstractC7347p != null ? abstractC7347p.a() : null;
        if (bVarA instanceof I7.o) {
            return (I7.o) bVarA;
        }
        return null;
    }

    public static final I7.y d(java.lang.Object obj) {
        I7.y yVar = obj instanceof I7.y ? (I7.y) obj : null;
        if (yVar != null) {
            return yVar;
        }
        p247y7.J j6 = obj instanceof p247y7.J ? (p247y7.J) obj : null;
        F7.b bVarA = j6 != null ? j6.a() : null;
        if (bVarA instanceof I7.y) {
            return (I7.y) bVarA;
        }
        return null;
    }

    public static final java.util.List e(P7.a aVar) {
        java.lang.annotation.Annotation annotationP;
        p247y7.AbstractC7350t.f(aVar, "<this>");
        P7.g<P7.c> gVarK = aVar.k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (P7.c cVar : gVarK) {
            O7.a0 a0VarO = cVar.o();
            if (a0VarO instanceof T7.b) {
                annotationP = ((T7.b) a0VarO).d();
            } else if (a0VarO instanceof T7.l.a) {
                U7.p pVarB = ((T7.l.a) a0VarO).b();
                U7.e eVar = pVarB instanceof U7.e ? (U7.e) pVarB : null;
                annotationP = eVar != null ? eVar.X() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return s(arrayList);
    }

    public static final java.lang.Class f(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0).getClass();
    }

    public static final java.lang.Object g(java.lang.reflect.Type type) {
        p247y7.AbstractC7350t.f(type, "type");
        if (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isPrimitive()) {
            return null;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Boolean.TYPE)) {
            return java.lang.Boolean.FALSE;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Character.TYPE)) {
            return (char) 0;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Byte.TYPE)) {
            return (byte) 0;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Short.TYPE)) {
            return (short) 0;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Integer.TYPE)) {
            return 0;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Long.TYPE)) {
            return 0L;
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (p247y7.AbstractC7350t.b(type, java.lang.Void.TYPE)) {
            throw new java.lang.IllegalStateException("Parameter with void type is illegal");
        }
        throw new java.lang.UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final O7.InterfaceC1420a h(java.lang.Class cls, p158p8.p pVar, p108k8.c cVar, p108k8.g gVar, p108k8.a aVar, p237x7.p pVar2) {
        java.util.List listN0;
        p247y7.AbstractC7350t.f(cls, "moduleAnchor");
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(pVar2, "createDescriptor");
        T7.k kVarA = I7.E.a(cls);
        if (pVar instanceof p088i8.i) {
            listN0 = ((p088i8.i) pVar).m0();
        } else {
            if (!(pVar instanceof p088i8.n)) {
                throw new java.lang.IllegalStateException(("Unsupported message: " + pVar).toString());
            }
            listN0 = ((p088i8.n) pVar).n0();
        }
        java.util.List list = listN0;
        B8.k kVarA2 = kVarA.a();
        O7.G gB = kVarA.b();
        p108k8.h hVarB = p108k8.h.f49817b.b();
        p247y7.AbstractC7350t.c(list);
        return (O7.InterfaceC1420a) pVar2.u(new B8.x(new B8.m(kVarA2, cVar, gB, gVar, hVarB, aVar, null, null, list)), pVar);
    }

    public static final O7.X i(O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "<this>");
        if (interfaceC1420a.m0() == null) {
            return null;
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1420a.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((O7.InterfaceC1424e) interfaceC1432mB).S0();
    }

    public static final p138n8.c j() {
        return f5337a;
    }

    public static final boolean k(F7.o oVar) {
        F8.E eF;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        I7.A a6 = oVar instanceof I7.A ? (I7.A) oVar : null;
        return (a6 == null || (eF = a6.f()) == null || !p178r8.h.i(eF)) ? false : true;
    }

    public static final boolean l(F7.o oVar) {
        F8.E eF;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        I7.A a6 = oVar instanceof I7.A ? (I7.A) oVar : null;
        return (a6 == null || (eF = a6.f()) == null || !p178r8.h.c(eF)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final java.lang.Class m(java.lang.ClassLoader classLoader, java.lang.String str, java.lang.String str2, int i6) {
        if (p247y7.AbstractC7350t.b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return java.lang.Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i6 > 0) {
            for (int i10 = 0; i10 < i6; i10++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(S8.r.Q(str2, '.', '$', false, 4, null));
        if (i6 > 0) {
            sb.append(";");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return T7.e.a(classLoader, string);
    }

    private static final java.lang.Class n(java.lang.ClassLoader classLoader, p138n8.b bVar, int i6) {
        N7.c cVar = N7.c.f7820a;
        p138n8.d dVarJ = bVar.b().j();
        p247y7.AbstractC7350t.e(dVarJ, "toUnsafe(...)");
        p138n8.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        java.lang.String strB = bVar.h().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strB2 = bVar.i().b();
        p247y7.AbstractC7350t.e(strB2, "asString(...)");
        return m(classLoader, strB, strB2, i6);
    }

    static /* synthetic */ java.lang.Class o(java.lang.ClassLoader classLoader, p138n8.b bVar, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return n(classLoader, bVar, i6);
    }

    private static final java.lang.annotation.Annotation p(P7.c cVar) {
        O7.InterfaceC1424e interfaceC1424eI = p218v8.c.i(cVar);
        java.lang.Class clsQ = interfaceC1424eI != null ? q(interfaceC1424eI) : null;
        if (!(clsQ instanceof java.lang.Class)) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        java.util.Set<java.util.Map.Entry> setEntrySet = cVar.a().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : setEntrySet) {
            p138n8.f fVar = (p138n8.f) entry.getKey();
            p198t8.g gVar = (p198t8.g) entry.getValue();
            java.lang.ClassLoader classLoader = clsQ.getClassLoader();
            p247y7.AbstractC7350t.e(classLoader, "getClassLoader(...)");
            java.lang.Object objR = r(gVar, classLoader);
            p087i7.u uVarA = objR != null ? p087i7.B.a(fVar.g(), objR) : null;
            if (uVarA != null) {
                arrayList.add(uVarA);
            }
        }
        return (java.lang.annotation.Annotation) J7.c.e(clsQ, p097j7.S.q(arrayList), null, 4, null);
    }

    public static final java.lang.Class q(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
        O7.a0 a0VarO = interfaceC1424e.o();
        p247y7.AbstractC7350t.e(a0VarO, "getSource(...)");
        if (a0VarO instanceof p068g8.v) {
            p068g8.t tVarD = ((p068g8.v) a0VarO).d();
            p247y7.AbstractC7350t.d(tVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((T7.f) tVarD).f();
        }
        if (a0VarO instanceof T7.l.a) {
            U7.p pVarB = ((T7.l.a) a0VarO).b();
            p247y7.AbstractC7350t.d(pVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((U7.l) pVarB).A();
        }
        p138n8.b bVarK = p218v8.c.k(interfaceC1424e);
        if (bVarK == null) {
            return null;
        }
        return n(U7.d.f(interfaceC1424e.getClass()), bVarK, 0);
    }

    private static final java.lang.Object r(p198t8.g gVar, java.lang.ClassLoader classLoader) {
        if (gVar instanceof p198t8.C7156a) {
            return p((P7.c) ((p198t8.C7156a) gVar).b());
        }
        if (gVar instanceof p198t8.b) {
            return a((p198t8.b) gVar, classLoader);
        }
        if (gVar instanceof p198t8.j) {
            p087i7.u uVar = (p087i7.u) ((p198t8.j) gVar).b();
            p138n8.b bVar = (p138n8.b) uVar.a();
            p138n8.f fVar = (p138n8.f) uVar.b();
            java.lang.Class clsO = o(classLoader, bVar, 0, 4, null);
            if (clsO != null) {
                return I7.L.a(clsO, fVar.g());
            }
        } else if (gVar instanceof p198t8.p) {
            t8.p.b bVar2 = (t8.p.b) ((p198t8.p) gVar).b();
            if (bVar2 instanceof t8.p.b.C0714b) {
                t8.p.b.C0714b c0714b = (t8.p.b.C0714b) bVar2;
                return n(classLoader, c0714b.b(), c0714b.a());
            }
            if (!(bVar2 instanceof t8.p.b.a)) {
                throw new p087i7.s();
            }
            O7.InterfaceC1427h interfaceC1427hW = ((t8.p.b.a) bVar2).a().W0().w();
            O7.InterfaceC1424e interfaceC1424e = interfaceC1427hW instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hW : null;
            if (interfaceC1424e != null) {
                return q(interfaceC1424e);
            }
        } else {
            if (!(gVar instanceof p198t8.k ? true : gVar instanceof p198t8.r)) {
                return gVar.b();
            }
        }
        return null;
    }

    private static final java.util.List s(java.util.List list) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.util.List listE;
        java.util.List<java.lang.annotation.Annotation> list2 = list;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (p247y7.AbstractC7350t.b(p227w7.a.b(p227w7.a.a((java.lang.annotation.Annotation) it.next())).getSimpleName(), "Container")) {
                    list = new java.util.ArrayList();
                    for (java.lang.annotation.Annotation annotation : list2) {
                        java.lang.Class clsB = p227w7.a.b(p227w7.a.a(annotation));
                        if (!p247y7.AbstractC7350t.b(clsB.getSimpleName(), "Container") || com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a.wuzl(clsB, p247y7.S.class) == null) {
                            listE = p097j7.AbstractC6879v.e(annotation);
                        } else {
                            java.lang.Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                            p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listE = p097j7.AbstractC6872n.d((java.lang.annotation.Annotation[]) objInvoke);
                        }
                        p097j7.AbstractC6879v.C(list, listE);
                    }
                    break;
                }
            }
        }
        return list;
    }
}
