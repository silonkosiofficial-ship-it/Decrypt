package R7;

/* JADX INFO: renamed from: R7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1497c extends R7.AbstractC1504j implements O7.X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1497c(P7.g gVar) {
        super(gVar, p138n8.h.f51971h);
        if (gVar == null) {
            M(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1497c(P7.g gVar, p138n8.f fVar) {
        super(gVar, fVar);
        if (gVar == null) {
            M(1);
        }
        if (fVar == null) {
            M(2);
        }
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
            case 11:
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
            case 11:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i6) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public O7.Q a() {
        return this;
    }

    @Override // O7.InterfaceC1420a
    public boolean L() {
        return false;
    }

    @Override // O7.c0
    public O7.X c(F8.n0 n0Var) {
        F8.E type;
        F8.u0 u0Var;
        if (n0Var == null) {
            M(3);
        }
        if (n0Var.k()) {
            return this;
        }
        if (b() instanceof O7.InterfaceC1424e) {
            type = getType();
            u0Var = F8.u0.OUT_VARIANCE;
        } else {
            type = getType();
            u0Var = F8.u0.INVARIANT;
        }
        F8.E eP = n0Var.p(type, u0Var);
        if (eP == null) {
            return null;
        }
        return eP == getType() ? this : new R7.F(b(), new p257z8.i(eP), k());
    }

    @Override // O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Set setEmptySet = java.util.Collections.emptySet();
        if (setEmptySet == null) {
            M(8);
        }
        return setEmptySet;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List g() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(5);
        }
        return listEmptyList;
    }

    @Override // O7.i0
    public F8.E getType() {
        F8.E type = getValue().getType();
        if (type == null) {
            M(6);
        }
        return type;
    }

    @Override // O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8187f;
        if (abstractC1439u == null) {
            M(9);
        }
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1420a
    public F8.E l() {
        return getType();
    }

    @Override // O7.InterfaceC1420a
    public O7.X m0() {
        return null;
    }

    @Override // O7.InterfaceC1420a
    public java.util.List n() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            M(7);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1435p
    public O7.a0 o() {
        O7.a0 a0Var = O7.a0.f8143a;
        if (a0Var == null) {
            M(11);
        }
        return a0Var;
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.f(this, obj);
    }

    @Override // O7.InterfaceC1420a
    public O7.X v0() {
        return null;
    }
}
