package R7;

/* JADX INFO: renamed from: R7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1501g extends R7.AbstractC1495a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final O7.InterfaceC1432m f9611H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final O7.a0 f9612I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final boolean f9613J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1501g(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, p138n8.f fVar, O7.a0 a0Var, boolean z6) {
        super(nVar, fVar);
        if (nVar == null) {
            J0(0);
        }
        if (interfaceC1432m == null) {
            J0(1);
        }
        if (fVar == null) {
            J0(2);
        }
        if (a0Var == null) {
            J0(3);
        }
        this.f9611H = interfaceC1432m;
        this.f9612I = a0Var;
        this.f9613J = z6;
    }

    private static /* synthetic */ void J0(int i6) {
        java.lang.String str = (i6 == 4 || i6 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 4 || i6 == 5) ? 2 : 3];
        if (i6 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i6 == 2) {
            objArr[0] = "name";
        } else if (i6 == 3) {
            objArr[0] = "source";
        } else if (i6 == 4 || i6 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i6 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i6 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i6 != 4 && i6 != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 4 && i6 != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public boolean C() {
        return this.f9613J;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1433n, O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        O7.InterfaceC1432m interfaceC1432m = this.f9611H;
        if (interfaceC1432m == null) {
            J0(4);
        }
        return interfaceC1432m;
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = this.f9612I;
        if (a0Var == null) {
            J0(5);
        }
        return a0Var;
    }
}
