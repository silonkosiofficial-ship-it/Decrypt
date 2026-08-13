package J7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements J7.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J7.f.d f5783e = new J7.f.d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Member f5784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Type f5785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Class f5786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f5787d;

    public static final class a extends J7.f implements J7.d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.lang.Object f5788f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
            p247y7.AbstractC7350t.f(constructor, "constructor");
            java.lang.Class declaringClass = constructor.getDeclaringClass();
            p247y7.AbstractC7350t.e(declaringClass, "getDeclaringClass(...)");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 2 ? new java.lang.reflect.Type[0] : p097j7.AbstractC6872n.r(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f5788f = obj;
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) n();
            p247y7.U u6 = new p247y7.U(3);
            u6.a(this.f5788f);
            u6.b(objArr);
            u6.a(null);
            return constructor.newInstance(u6.d(new java.lang.Object[u6.c()]));
        }
    }

    public static final class b extends J7.f {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(java.lang.reflect.Constructor constructor) {
            p247y7.AbstractC7350t.f(constructor, "constructor");
            java.lang.Class declaringClass = constructor.getDeclaringClass();
            p247y7.AbstractC7350t.e(declaringClass, "getDeclaringClass(...)");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 1 ? new java.lang.reflect.Type[0] : p097j7.AbstractC6872n.r(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) n();
            p247y7.U u6 = new p247y7.U(2);
            u6.b(objArr);
            u6.a(null);
            return constructor.newInstance(u6.d(new java.lang.Object[u6.c()]));
        }
    }

    public static final class c extends J7.f implements J7.d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.lang.Object f5789f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
            p247y7.AbstractC7350t.f(constructor, "constructor");
            java.lang.Class declaringClass = constructor.getDeclaringClass();
            p247y7.AbstractC7350t.e(declaringClass, "getDeclaringClass(...)");
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f5789f = obj;
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) n();
            p247y7.U u6 = new p247y7.U(2);
            u6.a(this.f5789f);
            u6.b(objArr);
            return constructor.newInstance(u6.d(new java.lang.Object[u6.c()]));
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class e extends J7.f {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(java.lang.reflect.Constructor constructor) {
            p247y7.AbstractC7350t.f(constructor, "constructor");
            java.lang.Class declaringClass = constructor.getDeclaringClass();
            p247y7.AbstractC7350t.e(declaringClass, "getDeclaringClass(...)");
            java.lang.Class declaringClass2 = constructor.getDeclaringClass();
            java.lang.Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            java.lang.Class<?> cls = (declaringClass3 == null || java.lang.reflect.Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            java.lang.reflect.Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            return ((java.lang.reflect.Constructor) n()).newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: J7.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0135f extends J7.f {

        /* JADX INFO: renamed from: J7.f$f$a */
        public static final class a extends J7.f.AbstractC0135f implements J7.d {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final java.lang.Object f5790f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.reflect.Field field, java.lang.Object obj) {
                super(field, false, null);
                p247y7.AbstractC7350t.f(field, "field");
                this.f5790f = obj;
            }

            @Override // J7.f.AbstractC0135f, J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                return ((java.lang.reflect.Field) n()).get(this.f5790f);
            }
        }

        /* JADX INFO: renamed from: J7.f$f$b */
        public static final class b extends J7.f.AbstractC0135f implements J7.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(java.lang.reflect.Field field) {
                super(field, false, null);
                p247y7.AbstractC7350t.f(field, "field");
            }
        }

        /* JADX INFO: renamed from: J7.f$f$c */
        public static final class c extends J7.f.AbstractC0135f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(java.lang.reflect.Field field) {
                super(field, true, null);
                p247y7.AbstractC7350t.f(field, "field");
            }
        }

        /* JADX INFO: renamed from: J7.f$f$d */
        public static final class d extends J7.f.AbstractC0135f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(java.lang.reflect.Field field) {
                super(field, true, null);
                p247y7.AbstractC7350t.f(field, "field");
            }

            @Override // J7.f
            public void a(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                super.a(objArr);
                b(p097j7.AbstractC6872n.Z(objArr));
            }
        }

        /* JADX INFO: renamed from: J7.f$f$e */
        public static final class e extends J7.f.AbstractC0135f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(java.lang.reflect.Field field) {
                super(field, false, null);
                p247y7.AbstractC7350t.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private AbstractC0135f(java.lang.reflect.Field field, boolean z6) {
            java.lang.reflect.Type genericType = field.getGenericType();
            p247y7.AbstractC7350t.e(genericType, "getGenericType(...)");
            super(field, genericType, z6 ? field.getDeclaringClass() : null, new java.lang.reflect.Type[0], null);
        }

        public /* synthetic */ AbstractC0135f(java.lang.reflect.Field field, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
            this(field, z6);
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            return ((java.lang.reflect.Field) n()).get(c() != null ? p097j7.AbstractC6872n.Y(objArr) : null);
        }
    }

    public static abstract class g extends J7.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f5791f;

        public static final class a extends J7.f.g implements J7.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final java.lang.Object f5792g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.reflect.Field field, boolean z6, java.lang.Object obj) {
                super(field, z6, false, null);
                p247y7.AbstractC7350t.f(field, "field");
                this.f5792g = obj;
            }

            @Override // J7.f.g, J7.e
            public java.lang.Object z(java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                ((java.lang.reflect.Field) n()).set(this.f5792g, p097j7.AbstractC6872n.Y(objArr));
                return p087i7.M.f46721a;
            }
        }

        public static final class b extends J7.f.g implements J7.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(java.lang.reflect.Field field, boolean z6) {
                super(field, z6, false, null);
                p247y7.AbstractC7350t.f(field, "field");
            }

            @Override // J7.f.g, J7.e
            public java.lang.Object z(java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                ((java.lang.reflect.Field) n()).set(null, p097j7.AbstractC6872n.x0(objArr));
                return p087i7.M.f46721a;
            }
        }

        public static final class c extends J7.f.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(java.lang.reflect.Field field, boolean z6) {
                super(field, z6, true, null);
                p247y7.AbstractC7350t.f(field, "field");
            }
        }

        public static final class d extends J7.f.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(java.lang.reflect.Field field, boolean z6) {
                super(field, z6, true, null);
                p247y7.AbstractC7350t.f(field, "field");
            }

            @Override // J7.f.g, J7.f
            public void a(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                super.a(objArr);
                b(p097j7.AbstractC6872n.Z(objArr));
            }
        }

        public static final class e extends J7.f.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(java.lang.reflect.Field field, boolean z6) {
                super(field, z6, false, null);
                p247y7.AbstractC7350t.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(java.lang.reflect.Field field, boolean z6, boolean z10) {
            java.lang.Class cls = java.lang.Void.TYPE;
            p247y7.AbstractC7350t.e(cls, "TYPE");
            java.lang.Class<?> declaringClass = z10 ? field.getDeclaringClass() : null;
            java.lang.reflect.Type genericType = field.getGenericType();
            p247y7.AbstractC7350t.e(genericType, "getGenericType(...)");
            super(field, cls, declaringClass, new java.lang.reflect.Type[]{genericType}, null);
            this.f5791f = z6;
        }

        public /* synthetic */ g(java.lang.reflect.Field field, boolean z6, boolean z10, p247y7.AbstractC7342k abstractC7342k) {
            this(field, z6, z10);
        }

        @Override // J7.f
        public void a(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            super.a(objArr);
            if (this.f5791f && p097j7.AbstractC6872n.x0(objArr) == null) {
                throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) throws java.lang.IllegalAccessException {
            p247y7.AbstractC7350t.f(objArr, "args");
            a(objArr);
            ((java.lang.reflect.Field) n()).set(c() != null ? p097j7.AbstractC6872n.Y(objArr) : null, p097j7.AbstractC6872n.x0(objArr));
            return p087i7.M.f46721a;
        }
    }

    public static abstract class h extends J7.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f5793f;

        public static final class a extends J7.f.h implements J7.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final java.lang.Object f5794g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.reflect.Method method, java.lang.Object obj) {
                super(method, false, null, 4, null);
                p247y7.AbstractC7350t.f(method, "method");
                this.f5794g = obj;
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                return d(this.f5794g, objArr);
            }
        }

        public static final class b extends J7.f.h implements J7.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                p247y7.AbstractC7350t.f(method, "method");
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                return d(null, objArr);
            }
        }

        public static final class c extends J7.f.h implements J7.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final java.lang.Object f5795g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(java.lang.reflect.Method method, java.lang.Object obj) {
                p247y7.AbstractC7350t.f(method, "method");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (java.lang.reflect.Type[]) (genericParameterTypes.length <= 1 ? new java.lang.reflect.Type[0] : p097j7.AbstractC6872n.r(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f5795g = obj;
            }

            public final java.lang.Object e() {
                return this.f5795g;
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                p247y7.U u6 = new p247y7.U(2);
                u6.a(this.f5795g);
                u6.b(objArr);
                return d(null, u6.d(new java.lang.Object[u6.c()]));
            }
        }

        public static final class d extends J7.f.h implements J7.d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final java.lang.Object[] f5796g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(java.lang.reflect.Method method, java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(method, "method");
                p247y7.AbstractC7350t.f(objArr, "boundReceiverComponents");
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                p247y7.AbstractC7350t.e(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (java.lang.reflect.Type[]) p097j7.AbstractC6872n.V(genericParameterTypes, objArr.length).toArray(new java.lang.reflect.Type[0]), null);
                this.f5796g = objArr;
            }

            public final java.lang.Object[] e() {
                return this.f5796g;
            }

            public final int f() {
                return this.f5796g.length;
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                p247y7.U u6 = new p247y7.U(2);
                u6.b(this.f5796g);
                u6.b(objArr);
                return d(null, u6.d(new java.lang.Object[u6.c()]));
            }
        }

        public static final class e extends J7.f.h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                p247y7.AbstractC7350t.f(method, "method");
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                return d(objArr[0], objArr.length <= 1 ? new java.lang.Object[0] : p097j7.AbstractC6872n.r(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: J7.f$h$f, reason: collision with other inner class name */
        public static final class C0136f extends J7.f.h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0136f(java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                p247y7.AbstractC7350t.f(method, "method");
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                b(p097j7.AbstractC6872n.Z(objArr));
                return d(null, objArr.length <= 1 ? new java.lang.Object[0] : p097j7.AbstractC6872n.r(objArr, 1, objArr.length));
            }
        }

        public static final class g extends J7.f.h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                p247y7.AbstractC7350t.f(method, "method");
            }

            @Override // J7.e
            public java.lang.Object z(java.lang.Object[] objArr) {
                p247y7.AbstractC7350t.f(objArr, "args");
                a(objArr);
                return d(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(java.lang.reflect.Method method, boolean z6, java.lang.reflect.Type[] typeArr) {
            java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
            p247y7.AbstractC7350t.e(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z6 ? method.getDeclaringClass() : null, typeArr, null);
            this.f5793f = p247y7.AbstractC7350t.b(l(), java.lang.Void.TYPE);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(java.lang.reflect.Method method, boolean z6, java.lang.reflect.Type[] typeArr, int i6, p247y7.AbstractC7342k abstractC7342k) {
            z6 = (i6 & 2) != 0 ? !java.lang.reflect.Modifier.isStatic(method.getModifiers()) : z6;
            if ((i6 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                p247y7.AbstractC7350t.e(typeArr, "getGenericParameterTypes(...)");
            }
            this(method, z6, typeArr, null);
        }

        public /* synthetic */ h(java.lang.reflect.Method method, boolean z6, java.lang.reflect.Type[] typeArr, p247y7.AbstractC7342k abstractC7342k) {
            this(method, z6, typeArr);
        }

        protected final java.lang.Object d(java.lang.Object obj, java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            return this.f5793f ? p087i7.M.f46721a : ((java.lang.reflect.Method) n()).invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    private f(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr) {
        java.util.List listR0;
        this.f5784a = member;
        this.f5785b = type;
        this.f5786c = cls;
        if (cls != null) {
            p247y7.U u6 = new p247y7.U(2);
            u6.a(cls);
            u6.b(typeArr);
            listR0 = p097j7.AbstractC6879v.p(u6.d(new java.lang.reflect.Type[u6.c()]));
            listR0 = listR0 == null ? p097j7.AbstractC6872n.R0(typeArr) : listR0;
        }
        this.f5787d = listR0;
    }

    public /* synthetic */ f(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr, p247y7.AbstractC7342k abstractC7342k) {
        this(member, type, cls, typeArr);
    }

    public void a(java.lang.Object[] objArr) {
        J7.e.a.a(this, objArr);
    }

    protected final void b(java.lang.Object obj) {
        if (obj == null || !this.f5784a.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final java.lang.Class c() {
        return this.f5786c;
    }

    @Override // J7.e
    public final java.lang.reflect.Type l() {
        return this.f5785b;
    }

    @Override // J7.e
    public java.util.List m() {
        return this.f5787d;
    }

    @Override // J7.e
    public final java.lang.reflect.Member n() {
        return this.f5784a;
    }
}
