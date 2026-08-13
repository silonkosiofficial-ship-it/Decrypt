package R7;

/* JADX INFO: loaded from: classes2.dex */
public class F extends R7.AbstractC1497c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final O7.InterfaceC1432m f9550E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p257z8.g f9551F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(O7.InterfaceC1432m interfaceC1432m, p257z8.g gVar, P7.g gVar2) {
        this(interfaceC1432m, gVar, gVar2, p138n8.h.f51971h);
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (gVar2 == null) {
            M(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O7.InterfaceC1432m interfaceC1432m, p257z8.g gVar, P7.g gVar2, p138n8.f fVar) {
        super(gVar2, fVar);
        if (interfaceC1432m == null) {
            M(3);
        }
        if (gVar == null) {
            M(4);
        }
        if (gVar2 == null) {
            M(5);
        }
        if (fVar == null) {
            M(6);
        }
        this.f9550E = interfaceC1432m;
        this.f9551F = gVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 7 || i6 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 7 || i6 == 8) ? 2 : 3];
        switch (i6) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i6 == 7) {
            objArr[1] = "getValue";
        } else if (i6 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i6) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 7 && i6 != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        O7.InterfaceC1432m interfaceC1432m = this.f9550E;
        if (interfaceC1432m == null) {
            M(8);
        }
        return interfaceC1432m;
    }

    @Override // O7.X
    public p257z8.g getValue() {
        p257z8.g gVar = this.f9551F;
        if (gVar == null) {
            M(7);
        }
        return gVar;
    }
}
