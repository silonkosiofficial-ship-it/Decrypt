package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends U7.p implements U7.h, U7.v, p048e8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f14594a;

    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final U7.l.a f14595L = new U7.l.a();

        a() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "isSynthetic";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(java.lang.reflect.Member.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "isSynthetic()Z";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.reflect.Member member) {
            p247y7.AbstractC7350t.f(member, "p0");
            return java.lang.Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class b extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final U7.l.b f14596L = new U7.l.b();

        b() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(U7.o.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final U7.o l(java.lang.reflect.Constructor constructor) {
            p247y7.AbstractC7350t.f(constructor, "p0");
            return new U7.o(constructor);
        }
    }

    /* synthetic */ class c extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final U7.l.c f14597L = new U7.l.c();

        c() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "isSynthetic";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(java.lang.reflect.Member.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "isSynthetic()Z";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.reflect.Member member) {
            p247y7.AbstractC7350t.f(member, "p0");
            return java.lang.Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class d extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final U7.l.d f14598L = new U7.l.d();

        d() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(U7.r.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final U7.r l(java.lang.reflect.Field field) {
            p247y7.AbstractC7350t.f(field, "p0");
            return new U7.r(field);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final U7.l.e f14599D = new U7.l.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Class cls) {
            java.lang.String simpleName = cls.getSimpleName();
            p247y7.AbstractC7350t.e(simpleName, "getSimpleName(...)");
            return java.lang.Boolean.valueOf(simpleName.length() == 0);
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final U7.l.f f14600D = new U7.l.f();

        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p138n8.f l(java.lang.Class cls) {
            java.lang.String simpleName = cls.getSimpleName();
            if (!p138n8.f.r(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return p138n8.f.o(simpleName);
            }
            return null;
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {
        g() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001c  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.reflect.Method method) {
            boolean z6 = false;
            if (!method.isSynthetic()) {
                if (U7.l.this.F()) {
                    U7.l lVar = U7.l.this;
                    p247y7.AbstractC7350t.c(method);
                    if (!lVar.e0(method)) {
                        z6 = true;
                    }
                } else {
                    z6 = true;
                }
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    /* synthetic */ class h extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final U7.l.h f14602L = new U7.l.h();

        h() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(U7.u.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final U7.u l(java.lang.reflect.Method method) {
            p247y7.AbstractC7350t.f(method, "p0");
            return new U7.u(method);
        }
    }

    public l(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "klass");
        this.f14594a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0(java.lang.reflect.Method method) {
        java.lang.String name = method.getName();
        if (p247y7.AbstractC7350t.b(name, "values")) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (p247y7.AbstractC7350t.b(name, "valueOf")) {
            return java.util.Arrays.equals(method.getParameterTypes(), new java.lang.Class[]{java.lang.String.class});
        }
        return false;
    }

    @Override // p048e8.g
    public boolean F() {
        return this.f14594a.isEnum();
    }

    @Override // U7.v
    public int I() {
        return this.f14594a.getModifiers();
    }

    @Override // p048e8.g
    public boolean J() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Boolean boolF = U7.C1693b.f14569a.f(this.f14594a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // p048e8.g
    public boolean M() {
        return this.f14594a.isInterface();
    }

    @Override // p048e8.s
    public boolean N() {
        return java.lang.reflect.Modifier.isAbstract(I());
    }

    @Override // p048e8.g
    public p048e8.D O() {
        return null;
    }

    @Override // p048e8.g
    public java.util.Collection T() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class[] clsArrC = U7.C1693b.f14569a.c(this.f14594a);
        if (clsArrC == null) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(clsArrC.length);
        for (java.lang.Class cls : clsArrC) {
            arrayList.add(new U7.n(cls));
        }
        return arrayList;
    }

    @Override // p048e8.s
    public boolean W() {
        return java.lang.reflect.Modifier.isStatic(I());
    }

    @Override // p048e8.g
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public java.util.List r() {
        java.lang.reflect.Constructor<?>[] declaredConstructors = this.f14594a.getDeclaredConstructors();
        p247y7.AbstractC7350t.e(declaredConstructors, "getDeclaredConstructors(...)");
        return R8.k.M(R8.k.G(R8.k.x(p097j7.AbstractC6872n.O(declaredConstructors), U7.l.a.f14595L), U7.l.b.f14596L));
    }

    @Override // U7.h
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public java.lang.Class A() {
        return this.f14594a;
    }

    @Override // p048e8.g
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public java.util.List H() {
        java.lang.reflect.Field[] declaredFields = this.f14594a.getDeclaredFields();
        p247y7.AbstractC7350t.e(declaredFields, "getDeclaredFields(...)");
        return R8.k.M(R8.k.G(R8.k.x(p097j7.AbstractC6872n.O(declaredFields), U7.l.c.f14597L), U7.l.d.f14598L));
    }

    @Override // p048e8.g
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public java.util.List Q() {
        java.lang.Class<?>[] declaredClasses = this.f14594a.getDeclaredClasses();
        p247y7.AbstractC7350t.e(declaredClasses, "getDeclaredClasses(...)");
        return R8.k.M(R8.k.H(R8.k.x(p097j7.AbstractC6872n.O(declaredClasses), U7.l.e.f14599D), U7.l.f.f14600D));
    }

    @Override // p048e8.g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public java.util.List S() {
        java.lang.reflect.Method[] declaredMethods = this.f14594a.getDeclaredMethods();
        p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
        return R8.k.M(R8.k.G(R8.k.w(p097j7.AbstractC6872n.O(declaredMethods), new U7.l.g()), U7.l.h.f14602L));
    }

    @Override // p048e8.g
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public U7.l f() {
        java.lang.Class<?> declaringClass = this.f14594a.getDeclaringClass();
        if (declaringClass != null) {
            return new U7.l(declaringClass);
        }
        return null;
    }

    @Override // p048e8.g
    public p138n8.c e() {
        p138n8.c cVarB = U7.d.a(this.f14594a).b();
        p247y7.AbstractC7350t.e(cVarB, "asSingleFqName(...)");
        return cVarB;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof U7.l) && p247y7.AbstractC7350t.b(this.f14594a, ((U7.l) obj).f14594a);
    }

    @Override // p048e8.z
    public java.util.List g() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f14594a.getTypeParameters();
        p247y7.AbstractC7350t.e(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new U7.A(typeVariable));
        }
        return arrayList;
    }

    @Override // p048e8.t
    public p138n8.f getName() {
        java.lang.String simpleName;
        if (this.f14594a.isAnonymousClass()) {
            java.lang.String name = this.f14594a.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            simpleName = S8.r.m1(name, ".", null, 2, null);
        } else {
            simpleName = this.f14594a.getSimpleName();
        }
        p138n8.f fVarO = p138n8.f.o(simpleName);
        p247y7.AbstractC7350t.c(fVarO);
        return fVarO;
    }

    @Override // p048e8.s
    public O7.n0 h() {
        int I10 = I();
        if (java.lang.reflect.Modifier.isPublic(I10)) {
            return O7.m0.h.f8177c;
        }
        if (java.lang.reflect.Modifier.isPrivate(I10)) {
            return O7.m0.e.f8174c;
        }
        if (java.lang.reflect.Modifier.isProtected(I10)) {
            return java.lang.reflect.Modifier.isStatic(I10) ? S7.c.f12616c : S7.b.f12615c;
        }
        return S7.a.f12614c;
    }

    public int hashCode() {
        return this.f14594a.hashCode();
    }

    @Override // p048e8.g
    public java.util.Collection i() {
        java.lang.Object[] objArrD = U7.C1693b.f14569a.d(this.f14594a);
        if (objArrD == null) {
            objArrD = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(objArrD.length);
        for (java.lang.Object obj : objArrD) {
            arrayList.add(new U7.y(obj));
        }
        return arrayList;
    }

    @Override // U7.h, p048e8.InterfaceC6538d
    public U7.e j(p138n8.c cVar) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.lang.reflect.AnnotatedElement annotatedElementA = A();
        if (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null) {
            return null;
        }
        return U7.i.a(declaredAnnotations, cVar);
    }

    @Override // p048e8.InterfaceC6538d
    public /* bridge */ /* synthetic */ p048e8.InterfaceC6535a j(p138n8.c cVar) {
        return j(cVar);
    }

    @Override // p048e8.InterfaceC6538d
    public /* bridge */ /* synthetic */ java.util.Collection k() {
        return k();
    }

    @Override // U7.h, p048e8.InterfaceC6538d
    public java.util.List k() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List listB;
        java.lang.reflect.AnnotatedElement annotatedElementA = A();
        return (annotatedElementA == null || (declaredAnnotations = annotatedElementA.getDeclaredAnnotations()) == null || (listB = U7.i.b(declaredAnnotations)) == null) ? p097j7.AbstractC6879v.m() : listB;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return false;
    }

    @Override // p048e8.s
    public boolean q() {
        return java.lang.reflect.Modifier.isFinal(I());
    }

    @Override // p048e8.g
    public boolean t() {
        return this.f14594a.isAnnotation();
    }

    public java.lang.String toString() {
        return U7.l.class.getName() + ": " + this.f14594a;
    }

    @Override // p048e8.g
    public java.util.Collection u() {
        if (p247y7.AbstractC7350t.b(this.f14594a, java.lang.Object.class)) {
            return p097j7.AbstractC6879v.m();
        }
        p247y7.U u6 = new p247y7.U(2);
        java.lang.reflect.Type genericSuperclass = this.f14594a.getGenericSuperclass();
        u6.a(genericSuperclass != null ? genericSuperclass : java.lang.Object.class);
        java.lang.reflect.Type[] genericInterfaces = this.f14594a.getGenericInterfaces();
        p247y7.AbstractC7350t.e(genericInterfaces, "getGenericInterfaces(...)");
        u6.b(genericInterfaces);
        java.util.List listP = p097j7.AbstractC6879v.p(u6.d(new java.lang.reflect.Type[u6.c()]));
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listP, 10));
        java.util.Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new U7.n((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // p048e8.g
    public boolean w() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Boolean boolE = U7.C1693b.f14569a.e(this.f14594a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // p048e8.g
    public boolean y() {
        return false;
    }
}
