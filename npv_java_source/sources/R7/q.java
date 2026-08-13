package R7;

/* JADX INFO: loaded from: classes2.dex */
public class q extends R7.AbstractC1497c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final O7.InterfaceC1424e f9695E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p257z8.e f9696F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(O7.InterfaceC1424e interfaceC1424e) {
        super(P7.g.f8385d.b());
        if (interfaceC1424e == null) {
            M(0);
        }
        this.f9695E = interfaceC1424e;
        this.f9696F = new p257z8.e(interfaceC1424e, null);
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2) ? 2 : 3];
        if (i6 == 1 || i6 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i6 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i6 == 1) {
            objArr[1] = "getValue";
        } else if (i6 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // O7.InterfaceC1432m
    public O7.InterfaceC1432m b() {
        O7.InterfaceC1424e interfaceC1424e = this.f9695E;
        if (interfaceC1424e == null) {
            M(2);
        }
        return interfaceC1424e;
    }

    @Override // O7.X
    public p257z8.g getValue() {
        p257z8.e eVar = this.f9696F;
        if (eVar == null) {
            M(1);
        }
        return eVar;
    }

    @Override // R7.AbstractC1504j
    public java.lang.String toString() {
        return "class " + this.f9695E.getName() + "::this";
    }
}
