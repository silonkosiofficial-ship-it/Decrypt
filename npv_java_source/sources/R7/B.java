package R7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends R7.AbstractC1505k implements O7.T {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f9505G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f9506H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final O7.D f9507I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final O7.U f9508J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f9509K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final O7.InterfaceC1421b.a f9510L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private O7.AbstractC1439u f9511M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private O7.InterfaceC1443y f9512N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O7.D d6, O7.AbstractC1439u abstractC1439u, O7.U u6, P7.g gVar, p138n8.f fVar, boolean z6, boolean z10, boolean z11, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        super(u6.b(), gVar, fVar, a0Var);
        if (d6 == null) {
            M(0);
        }
        if (abstractC1439u == null) {
            M(1);
        }
        if (u6 == null) {
            M(2);
        }
        if (gVar == null) {
            M(3);
        }
        if (fVar == null) {
            M(4);
        }
        if (a0Var == null) {
            M(5);
        }
        this.f9512N = null;
        this.f9507I = d6;
        this.f9511M = abstractC1439u;
        this.f9508J = u6;
        this.f9505G = z6;
        this.f9506H = z10;
        this.f9509K = z11;
        this.f9510L = aVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = 2;
                break;
            case 7:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i6) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(str2);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // O7.InterfaceC1420a
    public java.util.List A0() {
        java.util.List listA0 = K0().A0();
        if (listA0 == null) {
            M(14);
        }
        return listA0;
    }

    @Override // O7.C
    public boolean C() {
        return this.f9506H;
    }

    @Override // O7.InterfaceC1420a
    public java.lang.Object D(O7.InterfaceC1420a.InterfaceC0196a interfaceC0196a) {
        return null;
    }

    @Override // O7.InterfaceC1443y
    public boolean F0() {
        return false;
    }

    @Override // O7.InterfaceC1421b
    public void G0(java.util.Collection collection) {
        if (collection == null) {
            M(16);
        }
    }

    @Override // O7.T
    public O7.U K0() {
        O7.U u6 = this.f9508J;
        if (u6 == null) {
            M(13);
        }
        return u6;
    }

    @Override // O7.InterfaceC1420a
    public boolean L() {
        return false;
    }

    @Override // O7.InterfaceC1443y
    public boolean L0() {
        return false;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1421b
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public O7.T i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // O7.InterfaceC1443y
    public boolean Q0() {
        return false;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    protected java.util.Collection T0(boolean z6) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (O7.U u6 : K0().f()) {
            O7.c0 c0VarD = z6 ? u6.d() : u6.i();
            if (c0VarD != null) {
                arrayList.add(c0VarD);
            }
        }
        return arrayList;
    }

    public void U0(boolean z6) {
        this.f9505G = z6;
    }

    @Override // O7.InterfaceC1443y
    public boolean V() {
        return false;
    }

    public void V0(O7.InterfaceC1443y interfaceC1443y) {
        this.f9512N = interfaceC1443y;
    }

    @Override // O7.InterfaceC1443y
    public boolean W() {
        return false;
    }

    public void W0(O7.AbstractC1439u abstractC1439u) {
        this.f9511M = abstractC1439u;
    }

    @Override // O7.T
    public boolean b0() {
        return this.f9505G;
    }

    @Override // O7.c0
    public O7.InterfaceC1443y c(F8.n0 n0Var) {
        if (n0Var == null) {
            M(7);
        }
        return this;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List g() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(9);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = this.f9511M;
        if (abstractC1439u == null) {
            M(11);
        }
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1421b
    public O7.InterfaceC1421b.a j() {
        O7.InterfaceC1421b.a aVar = this.f9510L;
        if (aVar == null) {
            M(6);
        }
        return aVar;
    }

    @Override // O7.InterfaceC1443y
    public O7.InterfaceC1443y l0() {
        return this.f9512N;
    }

    @Override // O7.InterfaceC1443y
    public boolean m() {
        return this.f9509K;
    }

    @Override // O7.InterfaceC1420a
    public O7.X m0() {
        return K0().m0();
    }

    @Override // O7.C
    public O7.D q() {
        O7.D d6 = this.f9507I;
        if (d6 == null) {
            M(10);
        }
        return d6;
    }

    @Override // O7.InterfaceC1420a
    public O7.X v0() {
        return K0().v0();
    }

    @Override // O7.InterfaceC1443y
    public boolean y() {
        return false;
    }
}
