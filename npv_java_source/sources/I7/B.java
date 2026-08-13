package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements F7.p, I7.InterfaceC1276l {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f5319F = {p247y7.P.j(new p247y7.G(p247y7.P.b(I7.B.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final O7.f0 f5320C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final I7.F.a f5321D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final I7.C f5322E;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5323a;

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
            f5323a = iArr;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.List upperBounds = I7.B.this.a().getUpperBounds();
            p247y7.AbstractC7350t.e(upperBounds, "getUpperBounds(...)");
            java.util.List list = upperBounds;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new I7.A((F8.E) it.next(), null, 2, null));
            }
            return arrayList;
        }
    }

    public B(I7.C c6, O7.f0 f0Var) {
        I7.C1275k c1275kH;
        java.lang.Object objR0;
        p247y7.AbstractC7350t.f(f0Var, "descriptor");
        this.f5320C = f0Var;
        this.f5321D = I7.F.c(new I7.B.b());
        if (c6 == null) {
            O7.InterfaceC1432m interfaceC1432mB = a().b();
            p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
            if (interfaceC1432mB instanceof O7.InterfaceC1424e) {
                objR0 = h((O7.InterfaceC1424e) interfaceC1432mB);
            } else {
                if (!(interfaceC1432mB instanceof O7.InterfaceC1421b)) {
                    throw new I7.D("Unknown type parameter container: " + interfaceC1432mB);
                }
                O7.InterfaceC1432m interfaceC1432mB2 = ((O7.InterfaceC1421b) interfaceC1432mB).b();
                p247y7.AbstractC7350t.e(interfaceC1432mB2, "getContainingDeclaration(...)");
                if (interfaceC1432mB2 instanceof O7.InterfaceC1424e) {
                    c1275kH = h((O7.InterfaceC1424e) interfaceC1432mB2);
                } else {
                    D8.g gVar = interfaceC1432mB instanceof D8.g ? (D8.g) interfaceC1432mB : null;
                    if (gVar == null) {
                        throw new I7.D("Non-class callable descriptor must be deserialized: " + interfaceC1432mB);
                    }
                    F7.c cVarE = p227w7.a.e(e(gVar));
                    p247y7.AbstractC7350t.d(cVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c1275kH = (I7.C1275k) cVarE;
                }
                objR0 = interfaceC1432mB.r0(new I7.C1269e(c1275kH), p087i7.M.f46721a);
            }
            p247y7.AbstractC7350t.c(objR0);
            c6 = (I7.C) objR0;
        }
        this.f5322E = c6;
    }

    private final java.lang.Class e(D8.g gVar) {
        java.lang.Class clsF;
        D8.f fVarK0 = gVar.k0();
        p068g8.n nVar = fVarK0 instanceof p068g8.n ? (p068g8.n) fVarK0 : null;
        p068g8.t tVarG = nVar != null ? nVar.g() : null;
        T7.f fVar = tVarG instanceof T7.f ? (T7.f) tVarG : null;
        if (fVar != null && (clsF = fVar.f()) != null) {
            return clsF;
        }
        throw new I7.D("Container of deserialized member is not resolved: " + gVar);
    }

    private final I7.C1275k h(O7.InterfaceC1424e interfaceC1424e) {
        java.lang.Class clsQ = I7.M.q(interfaceC1424e);
        I7.C1275k c1275k = (I7.C1275k) (clsQ != null ? p227w7.a.e(clsQ) : null);
        if (c1275k != null) {
            return c1275k;
        }
        throw new I7.D("Type parameter container is not resolved: " + interfaceC1424e.b());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof I7.B) {
            I7.B b6 = (I7.B) obj;
            if (p247y7.AbstractC7350t.b(this.f5322E, b6.f5322E) && p247y7.AbstractC7350t.b(getName(), b6.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // I7.InterfaceC1276l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public O7.f0 a() {
        return this.f5320C;
    }

    @Override // F7.p
    public java.lang.String getName() {
        java.lang.String strG = a().getName().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return strG;
    }

    @Override // F7.p
    public java.util.List getUpperBounds() {
        java.lang.Object objE = this.f5321D.e(this, f5319F[0]);
        p247y7.AbstractC7350t.e(objE, "getValue(...)");
        return (java.util.List) objE;
    }

    public int hashCode() {
        return (this.f5322E.hashCode() * 31) + getName().hashCode();
    }

    @Override // F7.p
    public F7.r s() {
        int i6 = I7.B.a.f5323a[a().s().ordinal()];
        if (i6 == 1) {
            return F7.r.INVARIANT;
        }
        if (i6 == 2) {
            return F7.r.IN;
        }
        if (i6 == 3) {
            return F7.r.OUT;
        }
        throw new p087i7.s();
    }

    public java.lang.String toString() {
        return p247y7.X.f57260H.a(this);
    }
}
