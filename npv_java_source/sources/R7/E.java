package R7;

/* JADX INFO: loaded from: classes2.dex */
public class E extends R7.B implements O7.W {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private O7.j0 f9548O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final O7.W f9549P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(O7.U u6, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, boolean z10, boolean z11, O7.InterfaceC1421b.a aVar, O7.W w6, O7.a0 a0Var) {
        O7.W w10;
        R7.E e6;
        super(d6, abstractC1439u, u6, gVar, p138n8.f.s("<set-" + u6.getName() + ">"), z6, z10, z11, aVar, a0Var);
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
        if (w6 != null) {
            e6 = this;
            w10 = w6;
        } else {
            w10 = this;
            e6 = w10;
        }
        e6.f9549P = w10;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i6) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i6) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static R7.L X0(O7.W w6, F8.E e6, P7.g gVar) {
        if (w6 == null) {
            M(7);
        }
        if (e6 == null) {
            M(8);
        }
        if (gVar == null) {
            M(9);
        }
        return new R7.L(w6, null, 0, gVar, p138n8.h.f51977n, e6, false, false, false, null, O7.a0.f8143a);
    }

    @Override // R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public O7.W a() {
        O7.W w6 = this.f9549P;
        if (w6 == null) {
            M(13);
        }
        return w6;
    }

    public void Z0(O7.j0 j0Var) {
        if (j0Var == null) {
            M(6);
        }
        this.f9548O = j0Var;
    }

    @Override // O7.InterfaceC1443y, O7.InterfaceC1421b, O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Collection collectionT0 = super.T0(false);
        if (collectionT0 == null) {
            M(10);
        }
        return collectionT0;
    }

    @Override // O7.InterfaceC1420a
    public F8.E l() {
        F8.M mZ = p218v8.c.j(this).Z();
        if (mZ == null) {
            M(12);
        }
        return mZ;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List n() {
        O7.j0 j0Var = this.f9548O;
        if (j0Var == null) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(j0Var);
        if (listSingletonList == null) {
            M(11);
        }
        return listSingletonList;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.a(this, obj);
    }
}
