package R7;

/* JADX INFO: renamed from: R7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1505k extends R7.AbstractC1504j implements O7.InterfaceC1433n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final O7.InterfaceC1432m f9623E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final O7.a0 f9624F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1505k(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, O7.a0 a0Var) {
        super(gVar, fVar);
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
        this.f9623E = interfaceC1432m;
        this.f9624F = a0Var;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 4 || i6 == 5 || i6 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 4 || i6 == 5 || i6 == 6) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i6 == 4) {
            objArr[1] = "getOriginal";
        } else if (i6 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i6 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 4 && i6 != 5 && i6 != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1435p a() {
        O7.InterfaceC1435p interfaceC1435p = (O7.InterfaceC1435p) super.a();
        if (interfaceC1435p == null) {
            M(4);
        }
        return interfaceC1435p;
    }

    public O7.InterfaceC1432m b() {
        O7.InterfaceC1432m interfaceC1432m = this.f9623E;
        if (interfaceC1432m == null) {
            M(5);
        }
        return interfaceC1432m;
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = this.f9624F;
        if (a0Var == null) {
            M(6);
        }
        return a0Var;
    }
}
