package R7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N extends R7.M {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f9575H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected E8.j f9576I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected p237x7.a f9577J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, F8.E e6, boolean z6, O7.a0 a0Var) {
        super(interfaceC1432m, gVar, fVar, e6, a0Var);
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (fVar == null) {
            M(2);
        }
        if (a0Var == null) {
            M(3);
        }
        this.f9575H = z6;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i6 == 1) {
            objArr[0] = "annotations";
        } else if (i6 == 2) {
            objArr[0] = "name";
        } else if (i6 == 3) {
            objArr[0] = "source";
        } else if (i6 == 4 || i6 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i6 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i6 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void T0(E8.j jVar, p237x7.a aVar) {
        if (aVar == null) {
            M(5);
        }
        this.f9577J = aVar;
        if (jVar == null) {
            jVar = (E8.j) aVar.b();
        }
        this.f9576I = jVar;
    }

    public void U0(p237x7.a aVar) {
        if (aVar == null) {
            M(4);
        }
        T0(null, aVar);
    }

    @Override // O7.k0
    public p198t8.g d0() {
        E8.j jVar = this.f9576I;
        if (jVar != null) {
            return (p198t8.g) jVar.b();
        }
        return null;
    }

    @Override // O7.k0
    public boolean t0() {
        return this.f9575H;
    }
}
