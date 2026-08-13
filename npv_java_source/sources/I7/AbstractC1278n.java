package I7;

/* JADX INFO: renamed from: I7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1278n implements p247y7.InterfaceC7339h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final I7.AbstractC1278n.a f5446C = new I7.AbstractC1278n.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final java.lang.Class f5447D = p247y7.AbstractC7342k.class;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final S8.o f5448E = new S8.o("<v#(\\d+)>");

    /* JADX INFO: renamed from: I7.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final S8.o a() {
            return I7.AbstractC1278n.f5448E;
        }
    }

    /* JADX INFO: renamed from: I7.n$b */
    public abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f5449c = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.AbstractC1278n.b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I7.F.a f5450a;

        /* JADX INFO: renamed from: I7.n$b$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.AbstractC1278n f5452D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(I7.AbstractC1278n abstractC1278n) {
                super(0);
                this.f5452D = abstractC1278n;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T7.k b() {
                return I7.E.a(this.f5452D.e());
            }
        }

        public b() {
            this.f5450a = I7.F.c(new I7.AbstractC1278n.b.a(I7.AbstractC1278n.this));
        }

        public final T7.k a() {
            java.lang.Object objE = this.f5450a.e(this, f5449c[0]);
            p247y7.AbstractC7350t.e(objE, "getValue(...)");
            return (T7.k) objE;
        }
    }

    /* JADX INFO: renamed from: I7.n$c */
    protected enum c {
        DECLARED,
        INHERITED;


        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f5456F = p157p7.b.a(e());

        public final boolean g(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "member");
            return interfaceC1421b.j().e() == (this == DECLARED);
        }
    }

    /* JADX INFO: renamed from: I7.n$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1278n.d f5457D = new I7.AbstractC1278n.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "descriptor");
            return p168q8.c.f53162j.q(interfaceC1443y) + " | " + I7.I.f5334a.g(interfaceC1443y).a();
        }
    }

    /* JADX INFO: renamed from: I7.n$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1278n.e f5458D = new I7.AbstractC1278n.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(O7.U u6) {
            p247y7.AbstractC7350t.f(u6, "descriptor");
            return p168q8.c.f53162j.q(u6) + " | " + I7.I.f5334a.f(u6).a();
        }
    }

    /* JADX INFO: renamed from: I7.n$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1278n.f f5459D = new I7.AbstractC1278n.f();

        f() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer u(O7.AbstractC1439u abstractC1439u, O7.AbstractC1439u abstractC1439u2) {
            java.lang.Integer numD = O7.AbstractC1438t.d(abstractC1439u, abstractC1439u2);
            return java.lang.Integer.valueOf(numD == null ? 0 : numD.intValue());
        }
    }

    /* JADX INFO: renamed from: I7.n$g */
    public static final class g extends I7.C1269e {
        g(I7.AbstractC1278n abstractC1278n) {
            super(abstractC1278n);
        }

        @Override // R7.AbstractC1506l, O7.InterfaceC1434o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public I7.AbstractC1274j e(O7.InterfaceC1431l interfaceC1431l, p087i7.M m6) {
            p247y7.AbstractC7350t.f(interfaceC1431l, "descriptor");
            p247y7.AbstractC7350t.f(m6, "data");
            throw new java.lang.IllegalStateException("No constructors should appear here: " + interfaceC1431l);
        }
    }

    private final java.lang.Class A(java.lang.String str, int i6, int i10) throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass;
        java.lang.String str2;
        char cCharAt = str.charAt(i6);
        if (cCharAt == 'L') {
            java.lang.ClassLoader classLoaderF = U7.d.f(e());
            java.lang.String strSubstring = str.substring(i6 + 1, i10 - 1);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            clsLoadClass = classLoaderF.loadClass(S8.r.Q(strSubstring, '/', '.', false, 4, null));
            str2 = "loadClass(...)";
        } else {
            if (cCharAt == '[') {
                return I7.M.f(A(str, i6 + 1, i10));
            }
            if (cCharAt != 'V') {
                if (cCharAt == 'Z') {
                    return java.lang.Boolean.TYPE;
                }
                if (cCharAt == 'C') {
                    return java.lang.Character.TYPE;
                }
                if (cCharAt == 'B') {
                    return java.lang.Byte.TYPE;
                }
                if (cCharAt == 'S') {
                    return java.lang.Short.TYPE;
                }
                if (cCharAt == 'I') {
                    return java.lang.Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return java.lang.Float.TYPE;
                }
                if (cCharAt == 'J') {
                    return java.lang.Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return java.lang.Double.TYPE;
                }
                throw new I7.D("Unknown type prefix in the method signature: " + str);
            }
            clsLoadClass = java.lang.Void.TYPE;
            str2 = "TYPE";
        }
        p247y7.AbstractC7350t.e(clsLoadClass, str2);
        return clsLoadClass;
    }

    private final java.lang.reflect.Constructor B(java.lang.Class cls, java.util.List list) {
        try {
            java.lang.Class[] clsArr = (java.lang.Class[]) list.toArray(new java.lang.Class[0]);
            return cls.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private final java.lang.reflect.Method C(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            if (p247y7.AbstractC7350t.b(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
            for (java.lang.reflect.Method method : declaredMethods) {
                if (p247y7.AbstractC7350t.b(method.getName(), str) && p247y7.AbstractC7350t.b(method.getReturnType(), cls2) && java.util.Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    private final void i(java.util.List list, java.lang.String str, boolean z6) {
        java.lang.Class<java.lang.Object> cls;
        java.util.List listX = x(str);
        list.addAll(listX);
        int size = (listX.size() + 31) / 32;
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            p247y7.AbstractC7350t.e(cls2, "TYPE");
            list.add(cls2);
        }
        if (z6) {
            cls = f5447D;
            list.remove(cls);
            p247y7.AbstractC7350t.e(cls, "DEFAULT_CONSTRUCTOR_MARKER");
        } else {
            cls = java.lang.Object.class;
        }
        list.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(p237x7.p pVar, java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(pVar, "$tmp0");
        return ((java.lang.Number) pVar.u(obj, obj2)).intValue();
    }

    private final java.util.List x(java.lang.String str) {
        int iO0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = 1;
        while (str.charAt(i6) != ')') {
            int i10 = i6;
            while (str.charAt(i10) == '[') {
                i10++;
            }
            char cCharAt = str.charAt(i10);
            if (S8.r.b0("VZCBSIFJD", cCharAt, false, 2, null)) {
                iO0 = i10 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new I7.D("Unknown type prefix in the method signature: " + str);
                }
                iO0 = S8.r.o0(str, ';', i6, false, 4, null) + 1;
            }
            arrayList.add(A(str, i6, iO0));
            i6 = iO0;
        }
        return arrayList;
    }

    private final java.lang.Class y(java.lang.String str) {
        return A(str, S8.r.o0(str, ')', 0, false, 6, null) + 1, str.length());
    }

    private final java.lang.reflect.Method z(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2, boolean z6) {
        java.lang.reflect.Method methodZ;
        if (z6) {
            clsArr[0] = cls;
        }
        java.lang.reflect.Method methodC = C(cls, str, clsArr, cls2);
        if (methodC != null) {
            return methodC;
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null && (methodZ = z(superclass, str, clsArr, cls2, z6)) != null) {
            return methodZ;
        }
        java.lang.Class<?>[] interfaces = cls.getInterfaces();
        p247y7.AbstractC7350t.e(interfaces, "getInterfaces(...)");
        for (java.lang.Class<?> cls3 : interfaces) {
            p247y7.AbstractC7350t.c(cls3);
            java.lang.reflect.Method methodZ2 = z(cls3, str, clsArr, cls2, z6);
            if (methodZ2 != null) {
                return methodZ2;
            }
            if (z6) {
                java.lang.Class clsA = T7.e.a(U7.d.f(cls3), cls3.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr[0] = cls3;
                    java.lang.reflect.Method methodC2 = C(clsA, str, clsArr, cls2);
                    if (methodC2 != null) {
                        return methodC2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final java.lang.reflect.Constructor j(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "desc");
        return B(e(), x(str));
    }

    public final java.lang.reflect.Constructor k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "desc");
        java.lang.Class clsE = e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i(arrayList, str, true);
        p087i7.M m6 = p087i7.M.f46721a;
        return B(clsE, arrayList);
    }

    public final java.lang.reflect.Method l(java.lang.String str, java.lang.String str2, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "desc");
        if (p247y7.AbstractC7350t.b(str, "<init>")) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z6) {
            arrayList.add(e());
        }
        i(arrayList, str2, false);
        return z(v(), str + "$default", (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]), y(str2), z6);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
    public final O7.InterfaceC1443y m(java.lang.String str, java.lang.String str2) {
        java.util.List listR;
        java.util.ArrayList arrayList;
        java.lang.String strA;
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        if (p247y7.AbstractC7350t.b(str, "<init>")) {
            listR = p097j7.AbstractC6879v.T0(q());
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listR) {
                O7.InterfaceC1431l interfaceC1431l = (O7.InterfaceC1431l) obj;
                if (interfaceC1431l.G()) {
                    O7.InterfaceC1428i interfaceC1428iB = interfaceC1431l.b();
                    p247y7.AbstractC7350t.e(interfaceC1428iB, "getContainingDeclaration(...)");
                    if (p178r8.h.d(interfaceC1428iB)) {
                        java.lang.String strA2 = I7.I.f5334a.g(interfaceC1431l).a();
                        if (!S8.r.V(strA2, "constructor-impl", false, 2, null) || !S8.r.J(strA2, ")V", false, 2, null)) {
                            throw new java.lang.IllegalArgumentException(("Invalid signature of " + interfaceC1431l + ": " + strA2).toString());
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(S8.r.K0(strA2, "V"));
                        O7.InterfaceC1428i interfaceC1428iB2 = interfaceC1431l.b();
                        p247y7.AbstractC7350t.e(interfaceC1428iB2, "getContainingDeclaration(...)");
                        sb.append(J7.k.t(interfaceC1428iB2));
                        strA = sb.toString();
                    } else {
                        strA = I7.I.f5334a.g(interfaceC1431l).a();
                    }
                } else {
                    strA = I7.I.f5334a.g(interfaceC1431l).a();
                }
                if (p247y7.AbstractC7350t.b(strA, str2)) {
                    arrayList.add(obj);
                }
            }
        } else {
            p138n8.f fVarO = p138n8.f.o(str);
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            listR = r(fVarO);
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listR) {
                if (p247y7.AbstractC7350t.b(I7.I.f5334a.g((O7.InterfaceC1443y) obj2).a(), str2)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (O7.InterfaceC1443y) p097j7.AbstractC6879v.G0(arrayList);
        }
        java.lang.String strR0 = p097j7.AbstractC6879v.r0(listR, "\n", null, null, 0, null, I7.AbstractC1278n.d.f5457D, 30, null);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Function '");
        sb2.append(str);
        sb2.append("' (JVM signature: ");
        sb2.append(str2);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strR0.length() == 0 ? " no members found" : '\n' + strR0);
        throw new I7.D(sb2.toString());
    }

    public final java.lang.reflect.Method n(java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Method methodZ;
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "desc");
        if (p247y7.AbstractC7350t.b(str, "<init>")) {
            return null;
        }
        java.lang.Class[] clsArr = (java.lang.Class[]) x(str2).toArray(new java.lang.Class[0]);
        java.lang.Class clsY = y(str2);
        java.lang.reflect.Method methodZ2 = z(v(), str, clsArr, clsY, false);
        if (methodZ2 != null) {
            return methodZ2;
        }
        if (!v().isInterface() || (methodZ = z(java.lang.Object.class, str, clsArr, clsY, false)) == null) {
            return null;
        }
        return methodZ;
    }

    public final O7.U o(java.lang.String str, java.lang.String str2) {
        java.lang.Object objG0;
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        S8.InterfaceC1639l interfaceC1639lC = f5448E.c(str2);
        if (interfaceC1639lC != null) {
            java.lang.String str3 = (java.lang.String) interfaceC1639lC.a().a().b().get(1);
            O7.U uT = t(java.lang.Integer.parseInt(str3));
            if (uT != null) {
                return uT;
            }
            throw new I7.D("Local property #" + str3 + " not found in " + e());
        }
        p138n8.f fVarO = p138n8.f.o(str);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        java.util.Collection collectionW = w(fVarO);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionW) {
            if (p247y7.AbstractC7350t.b(I7.I.f5334a.f((O7.U) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new I7.D("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() != 1) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj2 : arrayList) {
                O7.AbstractC1439u abstractC1439uH = ((O7.U) obj2).h();
                java.lang.Object arrayList2 = linkedHashMap.get(abstractC1439uH);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(abstractC1439uH, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj2);
            }
            java.util.Collection collectionValues = p097j7.S.g(linkedHashMap, new I7.C1277m(I7.AbstractC1278n.f.f5459D)).values();
            p247y7.AbstractC7350t.e(collectionValues, "<get-values>(...)");
            java.util.List list = (java.util.List) p097j7.AbstractC6879v.s0(collectionValues);
            if (list.size() != 1) {
                p138n8.f fVarO2 = p138n8.f.o(str);
                p247y7.AbstractC7350t.e(fVarO2, "identifier(...)");
                java.lang.String strR0 = p097j7.AbstractC6879v.r0(w(fVarO2), "\n", null, null, 0, null, I7.AbstractC1278n.e.f5458D, 30, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Property '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(this);
                sb.append(':');
                sb.append(strR0.length() == 0 ? " no members found" : '\n' + strR0);
                throw new I7.D(sb.toString());
            }
            p247y7.AbstractC7350t.c(list);
            objG0 = p097j7.AbstractC6879v.i0(list);
        } else {
            objG0 = p097j7.AbstractC6879v.G0(arrayList);
        }
        return (O7.U) objG0;
    }

    public abstract java.util.Collection q();

    public abstract java.util.Collection r(p138n8.f fVar);

    public abstract O7.U t(int i6);

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    protected final java.util.Collection u(p248y8.h hVar, I7.AbstractC1278n.c cVar) {
        I7.AbstractC1274j abstractC1274j;
        p247y7.AbstractC7350t.f(hVar, "scope");
        p247y7.AbstractC7350t.f(cVar, "belonginess");
        I7.AbstractC1278n.g gVar = new I7.AbstractC1278n.g(this);
        java.util.Collection<O7.InterfaceC1432m> collectionA = y8.k.a.a(hVar, null, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (O7.InterfaceC1432m interfaceC1432m : collectionA) {
            if (interfaceC1432m instanceof O7.InterfaceC1421b) {
                O7.InterfaceC1421b interfaceC1421b = (O7.InterfaceC1421b) interfaceC1432m;
                if (p247y7.AbstractC7350t.b(interfaceC1421b.h(), O7.AbstractC1438t.f8189h) || !cVar.g(interfaceC1421b)) {
                    abstractC1274j = null;
                } else {
                    abstractC1274j = (I7.AbstractC1274j) interfaceC1432m.r0(gVar, p087i7.M.f46721a);
                }
            } else {
                abstractC1274j = null;
            }
            if (abstractC1274j != null) {
                arrayList.add(abstractC1274j);
            }
        }
        return p097j7.AbstractC6879v.T0(arrayList);
    }

    protected java.lang.Class v() {
        java.lang.Class clsG = U7.d.g(e());
        return clsG == null ? e() : clsG;
    }

    public abstract java.util.Collection w(p138n8.f fVar);
}
