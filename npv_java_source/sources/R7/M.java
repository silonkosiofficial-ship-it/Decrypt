package R7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M extends R7.AbstractC1505k implements O7.k0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected F8.E f9574G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, F8.E e6, O7.a0 a0Var) {
        super(interfaceC1432m, gVar, fVar, a0Var);
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
        this.f9574G = e6;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // O7.InterfaceC1420a
    public boolean L() {
        return false;
    }

    public void O0(F8.E e6) {
        this.f9574G = e6;
    }

    public java.util.List g() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(8);
        }
        return listEmptyList;
    }

    @Override // O7.i0
    public F8.E getType() {
        F8.E e6 = this.f9574G;
        if (e6 == null) {
            M(4);
        }
        return e6;
    }

    public F8.E l() {
        F8.E type = getType();
        if (type == null) {
            M(10);
        }
        return type;
    }

    public O7.X m0() {
        return null;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List n() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(6);
        }
        return listEmptyList;
    }

    public O7.X v0() {
        return null;
    }
}
