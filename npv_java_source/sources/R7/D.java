package R7;

/* JADX INFO: loaded from: classes2.dex */
public class D extends R7.B implements O7.V {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private F8.E f9546O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final O7.V f9547P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(O7.U u6, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, boolean z10, boolean z11, O7.InterfaceC1421b.a aVar, O7.V v6, O7.a0 a0Var) {
        O7.V v10;
        R7.D d10;
        super(d6, abstractC1439u, u6, gVar, p138n8.f.s("<get-" + u6.getName() + ">"), z6, z10, z11, aVar, a0Var);
        if (u6 == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (d6 == null) {
            M(2);
        }
        if (abstractC1439u == null) {
            M(3);
        }
        if (aVar == null) {
            M(4);
        }
        if (a0Var == null) {
            M(5);
        }
        if (v6 != null) {
            d10 = this;
            v10 = v6;
        } else {
            v10 = this;
            d10 = v10;
        }
        d10.f9547P = v10;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 6 || i6 == 7 || i6 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 6 || i6 == 7 || i6 == 8) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i6 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i6 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i6 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public O7.V a() {
        O7.V v6 = this.f9547P;
        if (v6 == null) {
            M(8);
        }
        return v6;
    }

    public void Y0(F8.E e6) {
        if (e6 == null) {
            e6 = K0().getType();
        }
        this.f9546O = e6;
    }

    @Override // O7.InterfaceC1443y, O7.InterfaceC1421b, O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Collection collectionT0 = super.T0(true);
        if (collectionT0 == null) {
            M(6);
        }
        return collectionT0;
    }

    @Override // O7.InterfaceC1420a
    public F8.E l() {
        return this.f9546O;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List n() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(7);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.g(this, obj);
    }
}
