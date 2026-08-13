package R7;

/* JADX INFO: renamed from: R7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1504j extends P7.b implements O7.InterfaceC1432m {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p138n8.f f9622D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1504j(P7.g gVar, p138n8.f fVar) {
        super(gVar);
        if (gVar == null) {
            M(0);
        }
        if (fVar == null) {
            M(1);
        }
        this.f9622D = fVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i6 == 2) {
            objArr[1] = "getName";
        } else if (i6 == 3) {
            objArr[1] = "getOriginal";
        } else if (i6 == 5 || i6 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i6 != 2 && i6 != 3) {
            if (i6 == 4) {
                objArr[2] = "toString";
            } else if (i6 != 5 && i6 != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 2 && i6 != 3 && i6 != 5 && i6 != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static java.lang.String Q(O7.InterfaceC1432m interfaceC1432m) {
        if (interfaceC1432m == null) {
            M(4);
        }
        try {
            java.lang.String str = p168q8.c.f53162j.q(interfaceC1432m) + "[" + interfaceC1432m.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(interfaceC1432m)) + "]";
            if (str == null) {
                M(5);
            }
            return str;
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = interfaceC1432m.getClass().getSimpleName() + " " + interfaceC1432m.getName();
            if (str2 == null) {
                M(6);
            }
            return str2;
        }
    }

    public O7.InterfaceC1432m a() {
        return this;
    }

    @Override // O7.I
    public p138n8.f getName() {
        p138n8.f fVar = this.f9622D;
        if (fVar == null) {
            M(2);
        }
        return fVar;
    }

    public java.lang.String toString() {
        return Q(this);
    }
}
