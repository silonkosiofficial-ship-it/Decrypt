package I7;

/* JADX INFO: renamed from: I7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1274j implements F7.b, I7.C {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final I7.F.a f5377C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final I7.F.a f5378D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final I7.F.a f5379E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final I7.F.a f5380F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final I7.F.a f5381G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5382H;

    /* JADX INFO: renamed from: I7.j$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object[] b() {
            int iB;
            java.util.List<F7.j> listC = I7.AbstractC1274j.this.C();
            int size = listC.size() + (I7.AbstractC1274j.this.y() ? 1 : 0);
            if (((java.lang.Boolean) I7.AbstractC1274j.this.f5382H.getValue()).booleanValue()) {
                I7.AbstractC1274j abstractC1274j = I7.AbstractC1274j.this;
                iB = 0;
                for (F7.j jVar : listC) {
                    iB += jVar.j() == F7.j.a.VALUE ? abstractC1274j.B(jVar) : 0;
                }
            } else {
                java.util.List list = listC;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    iB = 0;
                } else {
                    java.util.Iterator it = list.iterator();
                    iB = 0;
                    while (it.hasNext()) {
                        if (((F7.j) it.next()).j() == F7.j.a.VALUE && (iB = iB + 1) < 0) {
                            p097j7.AbstractC6879v.v();
                        }
                    }
                }
            }
            int i6 = (iB + 31) / 32;
            java.lang.Object[] objArr = new java.lang.Object[size + i6 + 1];
            I7.AbstractC1274j abstractC1274j2 = I7.AbstractC1274j.this;
            for (F7.j jVar2 : listC) {
                if (jVar2.n() && !I7.M.l(jVar2.getType())) {
                    objArr[jVar2.getIndex()] = I7.M.g(H7.c.f(jVar2.getType()));
                } else if (jVar2.m()) {
                    objArr[jVar2.getIndex()] = abstractC1274j2.n(jVar2.getType());
                }
            }
            for (int i10 = 0; i10 < i6; i10++) {
                objArr[size + i10] = 0;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: I7.j$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return I7.M.e(I7.AbstractC1274j.this.F());
        }
    }

    /* JADX INFO: renamed from: I7.j$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: I7.j$c$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ O7.X f5386D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O7.X x6) {
                super(0);
                this.f5386D = x6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.Q b() {
                return this.f5386D;
            }
        }

        /* JADX INFO: renamed from: I7.j$c$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ O7.X f5387D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O7.X x6) {
                super(0);
                this.f5387D = x6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.Q b() {
                return this.f5387D;
            }
        }

        /* JADX INFO: renamed from: I7.j$c$c, reason: collision with other inner class name */
        static final class C0125c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ O7.InterfaceC1421b f5388D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f5389E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125c(O7.InterfaceC1421b interfaceC1421b, int i6) {
                super(0);
                this.f5388D = interfaceC1421b;
                this.f5389E = i6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final O7.Q b() {
                java.lang.Object obj = this.f5388D.n().get(this.f5389E);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                return (O7.Q) obj;
            }
        }

        /* JADX INFO: renamed from: I7.j$c$d */
        public static final class d implements java.util.Comparator {
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return p117l7.a.d(((F7.j) obj).getName(), ((F7.j) obj2).getName());
            }
        }

        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.ArrayList b() {
            int i6;
            O7.InterfaceC1421b interfaceC1421bA = I7.AbstractC1274j.this.F();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i10 = 0;
            if (I7.AbstractC1274j.this.E()) {
                i6 = 0;
            } else {
                O7.X xI = I7.M.i(interfaceC1421bA);
                if (xI != null) {
                    arrayList.add(new I7.u(I7.AbstractC1274j.this, 0, F7.j.a.INSTANCE, new I7.AbstractC1274j.c.a(xI)));
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                O7.X xV0 = interfaceC1421bA.v0();
                if (xV0 != null) {
                    arrayList.add(new I7.u(I7.AbstractC1274j.this, i6, F7.j.a.EXTENSION_RECEIVER, new I7.AbstractC1274j.c.b(xV0)));
                    i6++;
                }
            }
            int size = interfaceC1421bA.n().size();
            while (i10 < size) {
                arrayList.add(new I7.u(I7.AbstractC1274j.this, i6, F7.j.a.VALUE, new I7.AbstractC1274j.c.C0125c(interfaceC1421bA, i10)));
                i10++;
                i6++;
            }
            if (I7.AbstractC1274j.this.D() && (interfaceC1421bA instanceof Z7.a) && arrayList.size() > 1) {
                p097j7.AbstractC6879v.B(arrayList, new I7.AbstractC1274j.c.d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: I7.j$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: I7.j$d$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.AbstractC1274j f5391D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(I7.AbstractC1274j abstractC1274j) {
                super(0);
                this.f5391D = abstractC1274j;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.reflect.Type b() {
                java.lang.reflect.Type typeP = this.f5391D.p();
                return typeP == null ? this.f5391D.s().l() : typeP;
            }
        }

        d() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.A b() {
            F8.E eL = I7.AbstractC1274j.this.F().l();
            p247y7.AbstractC7350t.c(eL);
            return new I7.A(eL, new I7.AbstractC1274j.d.a(I7.AbstractC1274j.this));
        }
    }

    /* JADX INFO: renamed from: I7.j$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.a {
        e() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List listG = I7.AbstractC1274j.this.F().g();
            p247y7.AbstractC7350t.e(listG, "getTypeParameters(...)");
            java.util.List<O7.f0> list = listG;
            I7.AbstractC1274j abstractC1274j = I7.AbstractC1274j.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            for (O7.f0 f0Var : list) {
                p247y7.AbstractC7350t.c(f0Var);
                arrayList.add(new I7.B(abstractC1274j, f0Var));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: I7.j$f */
    static final class f extends p247y7.AbstractC7352v implements p237x7.a {
        f() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            java.util.List listC = I7.AbstractC1274j.this.C();
            boolean z6 = false;
            if (!(listC instanceof java.util.Collection) || !listC.isEmpty()) {
                java.util.Iterator it = listC.iterator();
                while (it.hasNext()) {
                    if (I7.M.k(((F7.j) it.next()).getType())) {
                        z6 = true;
                        break;
                    }
                }
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    public AbstractC1274j() {
        I7.F.a aVarC = I7.F.c(new I7.AbstractC1274j.b());
        p247y7.AbstractC7350t.e(aVarC, "lazySoft(...)");
        this.f5377C = aVarC;
        I7.F.a aVarC2 = I7.F.c(new I7.AbstractC1274j.c());
        p247y7.AbstractC7350t.e(aVarC2, "lazySoft(...)");
        this.f5378D = aVarC2;
        I7.F.a aVarC3 = I7.F.c(new I7.AbstractC1274j.d());
        p247y7.AbstractC7350t.e(aVarC3, "lazySoft(...)");
        this.f5379E = aVarC3;
        I7.F.a aVarC4 = I7.F.c(new I7.AbstractC1274j.e());
        p247y7.AbstractC7350t.e(aVarC4, "lazySoft(...)");
        this.f5380F = aVarC4;
        I7.F.a aVarC5 = I7.F.c(new I7.AbstractC1274j.a());
        p247y7.AbstractC7350t.e(aVarC5, "lazySoft(...)");
        this.f5381G = aVarC5;
        this.f5382H = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.AbstractC1274j.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B(F7.j jVar) {
        if (!((java.lang.Boolean) this.f5382H.getValue()).booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        if (!I7.M.k(jVar.getType())) {
            return 1;
        }
        F7.o type = jVar.getType();
        p247y7.AbstractC7350t.d(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        java.util.List listM = J7.k.m(F8.m0.a(((I7.A) type).f()));
        p247y7.AbstractC7350t.c(listM);
        return listM.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object n(F7.o oVar) {
        java.lang.Class clsB = p227w7.a.b(H7.b.b(oVar));
        if (clsB.isArray()) {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(clsB.getComponentType(), 0);
            p247y7.AbstractC7350t.e(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new I7.D("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.reflect.Type p() {
        java.lang.reflect.Type[] lowerBounds;
        if (!y()) {
            return null;
        }
        java.lang.Object objV0 = p097j7.AbstractC6879v.v0(s().m());
        java.lang.reflect.ParameterizedType parameterizedType = objV0 instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) objV0 : null;
        if (!p247y7.AbstractC7350t.b(parameterizedType != null ? parameterizedType.getRawType() : null, p127m7.e.class)) {
            return null;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        p247y7.AbstractC7350t.e(actualTypeArguments, "getActualTypeArguments(...)");
        java.lang.Object objF0 = p097j7.AbstractC6872n.F0(actualTypeArguments);
        java.lang.reflect.WildcardType wildcardType = objF0 instanceof java.lang.reflect.WildcardType ? (java.lang.reflect.WildcardType) objF0 : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (java.lang.reflect.Type) p097j7.AbstractC6872n.Y(lowerBounds);
    }

    /* JADX INFO: renamed from: A */
    public abstract O7.InterfaceC1421b F();

    public java.util.List C() {
        java.lang.Object objB = this.f5378D.b();
        p247y7.AbstractC7350t.e(objB, "invoke(...)");
        return (java.util.List) objB;
    }

    protected final boolean D() {
        return p247y7.AbstractC7350t.b(getName(), "<init>") && t().e().isAnnotation();
    }

    public abstract boolean E();

    @Override // F7.b
    public java.util.List g() {
        java.lang.Object objB = this.f5380F.b();
        p247y7.AbstractC7350t.e(objB, "invoke(...)");
        return (java.util.List) objB;
    }

    public abstract J7.e s();

    public abstract I7.AbstractC1278n t();

    public abstract J7.e x();

    @Override // F7.b
    public java.lang.Object z(java.lang.Object... objArr) throws G7.a {
        p247y7.AbstractC7350t.f(objArr, "args");
        try {
            return s().z(objArr);
        } catch (java.lang.IllegalAccessException e6) {
            throw new G7.a(e6);
        }
    }
}
