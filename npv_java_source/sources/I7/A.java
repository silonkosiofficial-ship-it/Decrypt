package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements p247y7.InterfaceC7351u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f5306e = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.A.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), p247y7.P.j(new p247y7.G(p247y7.P.b(I7.A.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.E f5307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I7.F.a f5308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I7.F.a f5309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I7.F.a f5310d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.a f5312E;

        /* JADX INFO: renamed from: I7.A$a$a, reason: collision with other inner class name */
        static final class C0122a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.A f5313D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f5314E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p087i7.InterfaceC6668n f5315F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0122a(I7.A a6, int i6, p087i7.InterfaceC6668n interfaceC6668n) {
                super(0);
                this.f5313D = a6;
                this.f5314E = i6;
                this.f5315F = interfaceC6668n;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.reflect.Type b() {
                java.lang.reflect.Type genericComponentType;
                java.lang.reflect.Type typeC = this.f5313D.c();
                if (typeC instanceof java.lang.Class) {
                    java.lang.Class cls = (java.lang.Class) typeC;
                    genericComponentType = cls.isArray() ? cls.getComponentType() : java.lang.Object.class;
                } else if (typeC instanceof java.lang.reflect.GenericArrayType) {
                    if (this.f5314E != 0) {
                        throw new I7.D("Array type has been queried for a non-0th argument: " + this.f5313D);
                    }
                    genericComponentType = ((java.lang.reflect.GenericArrayType) typeC).getGenericComponentType();
                } else {
                    if (!(typeC instanceof java.lang.reflect.ParameterizedType)) {
                        throw new I7.D("Non-generic type has been queried for arguments: " + this.f5313D);
                    }
                    genericComponentType = (java.lang.reflect.Type) I7.A.a.f(this.f5315F).get(this.f5314E);
                    if (genericComponentType instanceof java.lang.reflect.WildcardType) {
                        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) genericComponentType;
                        java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
                        p247y7.AbstractC7350t.e(lowerBounds, "getLowerBounds(...)");
                        java.lang.reflect.Type type = (java.lang.reflect.Type) p097j7.AbstractC6872n.Z(lowerBounds);
                        if (type == null) {
                            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                            p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
                            genericComponentType = (java.lang.reflect.Type) p097j7.AbstractC6872n.Y(upperBounds);
                        } else {
                            genericComponentType = type;
                        }
                    }
                }
                p247y7.AbstractC7350t.c(genericComponentType);
                return genericComponentType;
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5316a;

            static {
                int[] iArr = new int[F8.u0.values().length];
                try {
                    iArr[F8.u0.INVARIANT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[F8.u0.IN_VARIANCE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[F8.u0.OUT_VARIANCE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                f5316a = iArr;
            }
        }

        static final class c extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ I7.A f5317D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(I7.A a6) {
                super(0);
                this.f5317D = a6;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List b() {
                java.lang.reflect.Type typeC = this.f5317D.c();
                p247y7.AbstractC7350t.c(typeC);
                return U7.d.d(typeC);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.a aVar) {
            super(0);
            this.f5312E = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.util.List f(p087i7.InterfaceC6668n interfaceC6668n) {
            return (java.util.List) interfaceC6668n.getValue();
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            F7.q qVarD;
            java.util.List listU0 = I7.A.this.f().U0();
            if (listU0.isEmpty()) {
                return p097j7.AbstractC6879v.m();
            }
            p087i7.InterfaceC6668n interfaceC6668nA = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.A.a.c(I7.A.this));
            java.util.List list = listU0;
            p237x7.a aVar = this.f5312E;
            I7.A a6 = I7.A.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            int i6 = 0;
            for (java.lang.Object obj : list) {
                int i10 = i6 + 1;
                if (i6 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                F8.i0 i0Var = (F8.i0) obj;
                if (i0Var.b()) {
                    qVarD = F7.q.f2794c.c();
                } else {
                    F8.E type = i0Var.getType();
                    p247y7.AbstractC7350t.e(type, "getType(...)");
                    I7.A a10 = new I7.A(type, aVar == null ? null : new I7.A.a.C0122a(a6, i6, interfaceC6668nA));
                    int i11 = I7.A.a.b.f5316a[i0Var.a().ordinal()];
                    if (i11 == 1) {
                        qVarD = F7.q.f2794c.d(a10);
                    } else if (i11 == 2) {
                        qVarD = F7.q.f2794c.a(a10);
                    } else {
                        if (i11 != 3) {
                            throw new p087i7.s();
                        }
                        qVarD = F7.q.f2794c.b(a10);
                    }
                }
                arrayList.add(qVarD);
                i6 = i10;
            }
            return arrayList;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F7.d b() {
            I7.A a6 = I7.A.this;
            return a6.e(a6.f());
        }
    }

    public A(F8.E e6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(e6, "type");
        this.f5307a = e6;
        I7.F.a aVarC = null;
        I7.F.a aVar2 = aVar instanceof I7.F.a ? (I7.F.a) aVar : null;
        if (aVar2 != null) {
            aVarC = aVar2;
        } else if (aVar != null) {
            aVarC = I7.F.c(aVar);
        }
        this.f5308b = aVarC;
        this.f5309c = I7.F.c(new I7.A.b());
        this.f5310d = I7.F.c(new I7.A.a(aVar));
    }

    public /* synthetic */ A(F8.E e6, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(e6, (i6 & 2) != 0 ? null : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F7.d e(F8.E e6) {
        F8.E type;
        O7.InterfaceC1427h interfaceC1427hW = e6.W0().w();
        if (!(interfaceC1427hW instanceof O7.InterfaceC1424e)) {
            if (interfaceC1427hW instanceof O7.f0) {
                return new I7.B(null, (O7.f0) interfaceC1427hW);
            }
            if (!(interfaceC1427hW instanceof O7.e0)) {
                return null;
            }
            throw new p087i7.t("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        java.lang.Class clsQ = I7.M.q((O7.InterfaceC1424e) interfaceC1427hW);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (F8.q0.l(e6)) {
                return new I7.C1275k(clsQ);
            }
            java.lang.Class clsE = U7.d.e(clsQ);
            if (clsE != null) {
                clsQ = clsE;
            }
            return new I7.C1275k(clsQ);
        }
        F8.i0 i0Var = (F8.i0) p097j7.AbstractC6879v.I0(e6.U0());
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return new I7.C1275k(clsQ);
        }
        F7.d dVarE = e(type);
        if (dVarE != null) {
            return new I7.C1275k(I7.M.f(p227w7.a.b(H7.b.a(dVarE))));
        }
        throw new I7.D("Cannot determine classifier for array element type: " + this);
    }

    @Override // F7.o
    public java.util.List a() {
        java.lang.Object objE = this.f5310d.e(this, f5306e[1]);
        p247y7.AbstractC7350t.e(objE, "getValue(...)");
        return (java.util.List) objE;
    }

    @Override // F7.o
    public F7.d b() {
        return (F7.d) this.f5309c.e(this, f5306e[0]);
    }

    @Override // p247y7.InterfaceC7351u
    public java.lang.reflect.Type c() {
        I7.F.a aVar = this.f5308b;
        if (aVar != null) {
            return (java.lang.reflect.Type) aVar.b();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof I7.A) {
            I7.A a6 = (I7.A) obj;
            if (p247y7.AbstractC7350t.b(this.f5307a, a6.f5307a) && p247y7.AbstractC7350t.b(b(), a6.b()) && p247y7.AbstractC7350t.b(a(), a6.a())) {
                return true;
            }
        }
        return false;
    }

    public final F8.E f() {
        return this.f5307a;
    }

    public int hashCode() {
        int iHashCode = this.f5307a.hashCode() * 31;
        F7.d dVarB = b();
        return ((iHashCode + (dVarB != null ? dVarB.hashCode() : 0)) * 31) + a().hashCode();
    }

    public java.lang.String toString() {
        return I7.H.f5329a.h(this.f5307a);
    }
}
