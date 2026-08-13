package F7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2809a;

        static {
            int[] iArr = new int[F7.r.values().length];
            try {
                iArr[F7.r.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[F7.r.INVARIANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[F7.r.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2809a = iArr;
        }
    }

    /* synthetic */ class b extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final F7.u.b f2810L = new F7.u.b();

        b() {
            super(1, java.lang.Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Class l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type c(F7.o oVar, boolean z6) {
        F7.d dVarB = oVar.b();
        if (dVarB instanceof F7.p) {
            return new F7.t((F7.p) dVarB);
        }
        if (!(dVarB instanceof F7.c)) {
            throw new java.lang.UnsupportedOperationException("Unsupported type classifier: " + oVar);
        }
        F7.c cVar = (F7.c) dVarB;
        java.lang.Class clsC = z6 ? p227w7.a.c(cVar) : p227w7.a.b(cVar);
        java.util.List listA = oVar.a();
        if (listA.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listA);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        F7.q qVar = (F7.q) p097j7.AbstractC6879v.I0(listA);
        if (qVar == null) {
            throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: " + oVar);
        }
        F7.r rVarA = qVar.a();
        F7.o oVarB = qVar.b();
        int i6 = rVarA == null ? -1 : F7.u.a.f2809a[rVarA.ordinal()];
        if (i6 == -1 || i6 == 1) {
            return clsC;
        }
        if (i6 != 2 && i6 != 3) {
            throw new p087i7.s();
        }
        p247y7.AbstractC7350t.c(oVarB);
        java.lang.reflect.Type typeD = d(oVarB, false, 1, null);
        return typeD instanceof java.lang.Class ? clsC : new F7.a(typeD);
    }

    static /* synthetic */ java.lang.reflect.Type d(F7.o oVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        return c(oVar, z6);
    }

    private static final java.lang.reflect.Type e(java.lang.Class cls, java.util.List list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((F7.q) it.next()));
            }
            return new F7.s(cls, null, arrayList);
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            java.util.List list3 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
            java.util.Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((F7.q) it2.next()));
            }
            return new F7.s(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        java.lang.reflect.Type typeE = e(declaringClass, list.subList(length, list.size()));
        java.util.List listSubList = list.subList(0, length);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listSubList, 10));
        java.util.Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((F7.q) it3.next()));
        }
        return new F7.s(cls, typeE, arrayList3);
    }

    public static final java.lang.reflect.Type f(F7.o oVar) {
        java.lang.reflect.Type typeC;
        p247y7.AbstractC7350t.f(oVar, "<this>");
        return (!(oVar instanceof p247y7.InterfaceC7351u) || (typeC = ((p247y7.InterfaceC7351u) oVar).c()) == null) ? d(oVar, false, 1, null) : typeC;
    }

    private static final java.lang.reflect.Type g(F7.q qVar) {
        F7.r rVarD = qVar.d();
        if (rVarD == null) {
            return F7.v.f2811c.a();
        }
        F7.o oVarC = qVar.c();
        p247y7.AbstractC7350t.c(oVarC);
        int i6 = F7.u.a.f2809a[rVarD.ordinal()];
        if (i6 == 1) {
            return new F7.v(null, c(oVarC, true));
        }
        if (i6 == 2) {
            return c(oVarC, true);
        }
        if (i6 == 3) {
            return new F7.v(c(oVarC, true), null);
        }
        throw new p087i7.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String h(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.Class)) {
            return type.toString();
        }
        java.lang.Class cls = (java.lang.Class) type;
        if (!cls.isArray()) {
            java.lang.String name = cls.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            return name;
        }
        R8.h hVarN = R8.k.n(type, F7.u.b.f2810L);
        return ((java.lang.Class) R8.k.F(hVarN)).getName() + S8.r.N("[]", R8.k.u(hVarN));
    }
}
