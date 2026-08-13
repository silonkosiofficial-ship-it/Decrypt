package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends I7.AbstractC1274j implements F7.k {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final I7.y.b f5523O = new I7.y.b(null);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final java.lang.Object f5524P = new java.lang.Object();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final I7.AbstractC1278n f5525I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.lang.String f5526J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final java.lang.String f5527K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final java.lang.Object f5528L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5529M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final I7.F.a f5530N;

    public static abstract class a extends I7.AbstractC1274j implements F7.f, F7.k.a {
        @Override // I7.AbstractC1274j
        public boolean E() {
            return a().E();
        }

        public abstract O7.T F();

        /* JADX INFO: renamed from: G */
        public abstract I7.y a();

        @Override // I7.AbstractC1274j
        public I7.AbstractC1278n t() {
            return a().t();
        }

        @Override // I7.AbstractC1274j
        public J7.e x() {
            return null;
        }

        @Override // F7.b
        public boolean y() {
            return F().y();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static abstract class c extends I7.y.a implements F7.k.b {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f5531K = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.y.c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final I7.F.a f5532I = I7.F.c(new I7.y.c.b());

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f5533J = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.y.c.a());

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {
            a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final J7.e b() {
                return I7.z.b(I7.y.c.this, true);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {
            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.V b() {
                O7.V vD = I7.y.c.this.a().F().d();
                return vD == null ? p178r8.e.d(I7.y.c.this.a().F(), P7.g.f8385d.b()) : vD;
            }
        }

        @Override // I7.y.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public O7.V F() {
            java.lang.Object objE = this.f5532I.e(this, f5531K[0]);
            p247y7.AbstractC7350t.e(objE, "getValue(...)");
            return (O7.V) objE;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof I7.y.c) && p247y7.AbstractC7350t.b(a(), ((I7.y.c) obj).a());
        }

        @Override // F7.b
        public java.lang.String getName() {
            return "<get-" + a().getName() + '>';
        }

        public int hashCode() {
            return a().hashCode();
        }

        @Override // I7.AbstractC1274j
        public J7.e s() {
            return (J7.e) this.f5533J.getValue();
        }

        public java.lang.String toString() {
            return "getter of " + a();
        }
    }

    public static abstract class d extends I7.y.a implements F7.g.a {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        static final /* synthetic */ F7.k[] f5536K = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.y.d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private final I7.F.a f5537I = I7.F.c(new I7.y.d.b());

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private final p087i7.InterfaceC6668n f5538J = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.y.d.a());

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {
            a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final J7.e b() {
                return I7.z.b(I7.y.d.this, false);
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.a {
            b() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.W b() {
                O7.W wI = I7.y.d.this.a().F().i();
                if (wI != null) {
                    return wI;
                }
                O7.U uF = I7.y.d.this.a().F();
                P7.g.a aVar = P7.g.f8385d;
                return p178r8.e.e(uF, aVar.b(), aVar.b());
            }
        }

        @Override // I7.y.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public O7.W F() {
            java.lang.Object objE = this.f5537I.e(this, f5536K[0]);
            p247y7.AbstractC7350t.e(objE, "getValue(...)");
            return (O7.W) objE;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof I7.y.d) && p247y7.AbstractC7350t.b(a(), ((I7.y.d) obj).a());
        }

        @Override // F7.b
        public java.lang.String getName() {
            return "<set-" + a().getName() + '>';
        }

        public int hashCode() {
            return a().hashCode();
        }

        @Override // I7.AbstractC1274j
        public J7.e s() {
            return (J7.e) this.f5538J.getValue();
        }

        public java.lang.String toString() {
            return "setter of " + a();
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.U b() {
            return I7.y.this.t().o(I7.y.this.getName(), I7.y.this.L());
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Field b() {
            java.lang.Class<?> enclosingClass;
            I7.AbstractC1273i abstractC1273iF = I7.I.f5334a.f(I7.y.this.F());
            if (!(abstractC1273iF instanceof I7.AbstractC1273i.c)) {
                if (abstractC1273iF instanceof I7.AbstractC1273i.a) {
                    return ((I7.AbstractC1273i.a) abstractC1273iF).b();
                }
                if ((abstractC1273iF instanceof I7.AbstractC1273i.b) || (abstractC1273iF instanceof I7.AbstractC1273i.d)) {
                    return null;
                }
                throw new p087i7.s();
            }
            I7.AbstractC1273i.c cVar = (I7.AbstractC1273i.c) abstractC1273iF;
            O7.U uB = cVar.b();
            m8.d.a aVarD = p128m8.i.d(p128m8.i.f51228a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
            if (aVarD == null) {
                return null;
            }
            I7.y yVar = I7.y.this;
            if (X7.k.e(uB) || p128m8.i.f(cVar.e())) {
                enclosingClass = yVar.t().e().getEnclosingClass();
            } else {
                O7.InterfaceC1432m interfaceC1432mB = uB.b();
                enclosingClass = interfaceC1432mB instanceof O7.InterfaceC1424e ? I7.M.q((O7.InterfaceC1424e) interfaceC1432mB) : yVar.t().e();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(aVarD.c());
            } catch (java.lang.NoSuchFieldException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        java.lang.String strG = u6.getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        this(abstractC1278n, strG, I7.I.f5334a.f(u6).a(), u6, p247y7.AbstractC7337f.f57285I);
    }

    private y(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, O7.U u6, java.lang.Object obj) {
        this.f5525I = abstractC1278n;
        this.f5526J = str;
        this.f5527K = str2;
        this.f5528L = obj;
        this.f5529M = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.y.f());
        I7.F.a aVarB = I7.F.b(u6, new I7.y.e());
        p247y7.AbstractC7350t.e(aVarB, "lazySoft(...)");
        this.f5530N = aVarB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this(abstractC1278n, str, str2, null, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
    }

    @Override // I7.AbstractC1274j
    public boolean E() {
        return !p247y7.AbstractC7350t.b(this.f5528L, p247y7.AbstractC7337f.f57285I);
    }

    protected final java.lang.reflect.Member F() {
        if (!F().T()) {
            return null;
        }
        I7.AbstractC1273i abstractC1273iF = I7.I.f5334a.f(F());
        if (abstractC1273iF instanceof I7.AbstractC1273i.c) {
            I7.AbstractC1273i.c cVar = (I7.AbstractC1273i.c) abstractC1273iF;
            if (cVar.f().E()) {
                l8.a.c cVarZ = cVar.f().z();
                if (!cVarZ.z() || !cVarZ.y()) {
                    return null;
                }
                return t().n(cVar.d().getString(cVarZ.x()), cVar.d().getString(cVarZ.w()));
            }
        }
        return K();
    }

    public final java.lang.Object G() {
        return J7.k.g(this.f5528L, F());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final java.lang.Object H(java.lang.reflect.Member member, java.lang.Object obj, java.lang.Object obj2) throws G7.b {
        try {
            java.lang.Object obj3 = f5524P;
            if ((obj == obj3 || obj2 == obj3) && F().v0() == null) {
                throw new java.lang.RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            java.lang.Object objG = E() ? G() : obj;
            if (objG == obj3) {
                objG = null;
            }
            if (!E()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            java.lang.reflect.AccessibleObject accessibleObject = member instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(H7.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof java.lang.reflect.Field) {
                return ((java.lang.reflect.Field) member).get(objG);
            }
            if (!(member instanceof java.lang.reflect.Method)) {
                throw new java.lang.AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((java.lang.reflect.Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((java.lang.reflect.Method) member).invoke(null, null);
            }
            if (length == 1) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) member;
                if (objG == null) {
                    java.lang.Class<?> cls = ((java.lang.reflect.Method) member).getParameterTypes()[0];
                    p247y7.AbstractC7350t.e(cls, "get(...)");
                    objG = I7.M.g(cls);
                }
                return method.invoke(null, objG);
            }
            if (length != 2) {
                throw new java.lang.AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) member;
            if (obj == null) {
                java.lang.Class<?> cls2 = ((java.lang.reflect.Method) member).getParameterTypes()[1];
                p247y7.AbstractC7350t.e(cls2, "get(...)");
                obj = I7.M.g(cls2);
            }
            return method2.invoke(null, objG, obj);
        } catch (java.lang.IllegalAccessException e6) {
            throw new G7.b(e6);
        }
    }

    @Override // I7.AbstractC1274j
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public O7.U F() {
        java.lang.Object objB = this.f5530N.b();
        p247y7.AbstractC7350t.e(objB, "invoke(...)");
        return (O7.U) objB;
    }

    /* JADX INFO: renamed from: J */
    public abstract I7.y.c d();

    public final java.lang.reflect.Field K() {
        return (java.lang.reflect.Field) this.f5529M.getValue();
    }

    public final java.lang.String L() {
        return this.f5527K;
    }

    public boolean equals(java.lang.Object obj) {
        I7.y yVarD = I7.M.d(obj);
        return yVarD != null && p247y7.AbstractC7350t.b(t(), yVarD.t()) && p247y7.AbstractC7350t.b(getName(), yVarD.getName()) && p247y7.AbstractC7350t.b(this.f5527K, yVarD.f5527K) && p247y7.AbstractC7350t.b(this.f5528L, yVarD.f5528L);
    }

    @Override // F7.b
    public java.lang.String getName() {
        return this.f5526J;
    }

    public int hashCode() {
        return (((t().hashCode() * 31) + getName().hashCode()) * 31) + this.f5527K.hashCode();
    }

    @Override // I7.AbstractC1274j
    public J7.e s() {
        return d().s();
    }

    @Override // I7.AbstractC1274j
    public I7.AbstractC1278n t() {
        return this.f5525I;
    }

    public java.lang.String toString() {
        return I7.H.f5329a.g(F());
    }

    @Override // I7.AbstractC1274j
    public J7.e x() {
        return d().x();
    }

    @Override // F7.b
    public boolean y() {
        return false;
    }
}
