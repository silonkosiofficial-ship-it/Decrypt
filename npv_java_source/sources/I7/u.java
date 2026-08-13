package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements F7.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f5498f = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.u.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(I7.u.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I7.AbstractC1274j f5499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F7.j.a f5501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I7.F.a f5502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I7.F.a f5503e;

    private static final class a implements java.lang.reflect.Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Type[] f5504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5505b;

        public a(java.lang.reflect.Type[] typeArr) {
            p247y7.AbstractC7350t.f(typeArr, "types");
            this.f5504a = typeArr;
            this.f5505b = java.util.Arrays.hashCode(typeArr);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof I7.u.a) && java.util.Arrays.equals(this.f5504a, ((I7.u.a) obj).f5504a);
        }

        @Override // java.lang.reflect.Type
        public java.lang.String getTypeName() {
            return p097j7.AbstractC6872n.w0(this.f5504a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f5505b;
        }

        public java.lang.String toString() {
            return getTypeName();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return I7.M.e(I7.u.this.e());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.Type b() {
            O7.Q qE = I7.u.this.e();
            if ((qE instanceof O7.X) && p247y7.AbstractC7350t.b(I7.M.i(I7.u.this.d().F()), qE) && I7.u.this.d().F().j() == O7.InterfaceC1421b.a.FAKE_OVERRIDE) {
                O7.InterfaceC1432m interfaceC1432mB = I7.u.this.d().F().b();
                p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                java.lang.Class clsQ = I7.M.q((O7.InterfaceC1424e) interfaceC1432mB);
                if (clsQ != null) {
                    return clsQ;
                }
                throw new I7.D("Cannot determine receiver Java type of inherited declaration: " + qE);
            }
            J7.e eVarS = I7.u.this.d().s();
            if (eVarS instanceof J7.j) {
                java.util.List listJ0 = p097j7.AbstractC6879v.J0(eVarS.m(), ((J7.j) eVarS).b(I7.u.this.getIndex()));
                I7.u uVar = I7.u.this;
                java.lang.reflect.Type[] typeArr = (java.lang.reflect.Type[]) listJ0.toArray(new java.lang.reflect.Type[0]);
                return uVar.c((java.lang.reflect.Type[]) java.util.Arrays.copyOf(typeArr, typeArr.length));
            }
            if (!(eVarS instanceof J7.j.b)) {
                return (java.lang.reflect.Type) eVarS.m().get(I7.u.this.getIndex());
            }
            I7.u uVar2 = I7.u.this;
            java.lang.Class[] clsArr = (java.lang.Class[]) ((java.util.Collection) ((J7.j.b) eVarS).b().get(I7.u.this.getIndex())).toArray(new java.lang.Class[0]);
            return uVar2.c((java.lang.reflect.Type[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        }
    }

    public u(I7.AbstractC1274j abstractC1274j, int i6, F7.j.a aVar, p237x7.a aVar2) {
        p247y7.AbstractC7350t.f(abstractC1274j, "callable");
        p247y7.AbstractC7350t.f(aVar, "kind");
        p247y7.AbstractC7350t.f(aVar2, "computeDescriptor");
        this.f5499a = abstractC1274j;
        this.f5500b = i6;
        this.f5501c = aVar;
        this.f5502d = I7.F.c(aVar2);
        this.f5503e = I7.F.c(new I7.u.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.reflect.Type c(java.lang.reflect.Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new I7.u.a(typeArr) : (java.lang.reflect.Type) p097j7.AbstractC6872n.F0(typeArr);
        }
        throw new p227w7.b("Expected at least 1 type for compound type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.Q e() {
        java.lang.Object objE = this.f5502d.e(this, f5498f[0]);
        p247y7.AbstractC7350t.e(objE, "getValue(...)");
        return (O7.Q) objE;
    }

    public final I7.AbstractC1274j d() {
        return this.f5499a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof I7.u) {
            I7.u uVar = (I7.u) obj;
            if (p247y7.AbstractC7350t.b(this.f5499a, uVar.f5499a) && getIndex() == uVar.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // F7.j
    public int getIndex() {
        return this.f5500b;
    }

    @Override // F7.j
    public java.lang.String getName() {
        O7.Q qE = e();
        O7.j0 j0Var = qE instanceof O7.j0 ? (O7.j0) qE : null;
        if (j0Var == null || j0Var.b().L()) {
            return null;
        }
        p138n8.f name = j0Var.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        if (name.q()) {
            return null;
        }
        return name.g();
    }

    @Override // F7.j
    public F7.o getType() {
        F8.E type = e().getType();
        p247y7.AbstractC7350t.e(type, "getType(...)");
        return new I7.A(type, new I7.u.c());
    }

    public int hashCode() {
        return (this.f5499a.hashCode() * 31) + getIndex();
    }

    @Override // F7.j
    public F7.j.a j() {
        return this.f5501c;
    }

    @Override // F7.j
    public boolean m() {
        O7.Q qE = e();
        return (qE instanceof O7.j0) && ((O7.j0) qE).u0() != null;
    }

    @Override // F7.j
    public boolean n() {
        O7.Q qE = e();
        O7.j0 j0Var = qE instanceof O7.j0 ? (O7.j0) qE : null;
        if (j0Var != null) {
            return p218v8.c.c(j0Var);
        }
        return false;
    }

    public java.lang.String toString() {
        return I7.H.f5329a.f(this);
    }
}
