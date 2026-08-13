package R7;

/* JADX INFO: renamed from: R7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1500f extends R7.p implements O7.InterfaceC1423d {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected final boolean f9610g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C1500f(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1431l interfaceC1431l, P7.g gVar, boolean z6, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        super(interfaceC1424e, interfaceC1431l, gVar, p138n8.h.f51972i, aVar, a0Var);
        if (interfaceC1424e == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (aVar == null) {
            M(2);
        }
        if (a0Var == null) {
            M(3);
        }
        this.f9610g0 = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static /* synthetic */ void M(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 21 && i6 != 27) {
            switch (i6) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 21 && i6 != 27) {
            switch (i6) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i6 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i6 != 27) {
            switch (i6) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 21 && i6 != 27) {
            switch (i6) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private java.util.List t1() {
        O7.InterfaceC1424e interfaceC1424eB = b();
        if (interfaceC1424eB.P0().isEmpty()) {
            java.util.List listEmptyList = java.util.Collections.emptyList();
            if (listEmptyList == null) {
                M(16);
            }
            return listEmptyList;
        }
        java.util.List listP0 = interfaceC1424eB.P0();
        if (listP0 == null) {
            M(15);
        }
        return listP0;
    }

    public static R7.C1500f w1(O7.InterfaceC1424e interfaceC1424e, P7.g gVar, boolean z6, O7.a0 a0Var) {
        if (interfaceC1424e == null) {
            M(4);
        }
        if (gVar == null) {
            M(5);
        }
        if (a0Var == null) {
            M(6);
        }
        return new R7.C1500f(interfaceC1424e, null, gVar, z6, O7.InterfaceC1421b.a.DECLARATION, a0Var);
    }

    public R7.C1500f A1(java.util.List list, O7.AbstractC1439u abstractC1439u, java.util.List list2) {
        if (list == null) {
            M(10);
        }
        if (abstractC1439u == null) {
            M(11);
        }
        if (list2 == null) {
            M(12);
        }
        super.a1(null, u1(), t1(), list2, list, null, O7.D.FINAL, abstractC1439u);
        return this;
    }

    @Override // O7.InterfaceC1431l
    public boolean G() {
        return this.f9610g0;
    }

    @Override // R7.p, O7.InterfaceC1421b
    public void G0(java.util.Collection collection) {
        if (collection == null) {
            M(22);
        }
    }

    @Override // O7.InterfaceC1431l
    public O7.InterfaceC1424e H() {
        O7.InterfaceC1424e interfaceC1424eB = b();
        if (interfaceC1424eB == null) {
            M(18);
        }
        return interfaceC1424eB;
    }

    @Override // R7.p, R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    public O7.InterfaceC1423d a() {
        O7.InterfaceC1423d interfaceC1423d = (O7.InterfaceC1423d) super.a();
        if (interfaceC1423d == null) {
            M(19);
        }
        return interfaceC1423d;
    }

    @Override // R7.p, O7.InterfaceC1443y, O7.c0
    public O7.InterfaceC1423d c(F8.n0 n0Var) {
        if (n0Var == null) {
            M(20);
        }
        return (O7.InterfaceC1423d) super.c(n0Var);
    }

    @Override // R7.p, O7.InterfaceC1443y, O7.InterfaceC1421b, O7.InterfaceC1420a
    public java.util.Collection f() {
        java.util.Set setEmptySet = java.util.Collections.emptySet();
        if (setEmptySet == null) {
            M(21);
        }
        return setEmptySet;
    }

    @Override // R7.p, O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        return interfaceC1434o.e(this, obj);
    }

    public O7.X u1() {
        O7.InterfaceC1424e interfaceC1424eB = b();
        if (!interfaceC1424eB.S()) {
            return null;
        }
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1424eB.b();
        if (interfaceC1432mB instanceof O7.InterfaceC1424e) {
            return ((O7.InterfaceC1424e) interfaceC1432mB).S0();
        }
        return null;
    }

    @Override // O7.InterfaceC1421b
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1423d i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6) {
        O7.InterfaceC1423d interfaceC1423d = (O7.InterfaceC1423d) super.T0(interfaceC1432m, d6, abstractC1439u, aVar, z6);
        if (interfaceC1423d == null) {
            M(27);
        }
        return interfaceC1423d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.p
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public R7.C1500f U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(23);
        }
        if (aVar == null) {
            M(24);
        }
        if (gVar == null) {
            M(25);
        }
        if (a0Var == null) {
            M(26);
        }
        O7.InterfaceC1421b.a aVar2 = O7.InterfaceC1421b.a.DECLARATION;
        if (aVar == aVar2 || aVar == O7.InterfaceC1421b.a.SYNTHESIZED) {
            return new R7.C1500f((O7.InterfaceC1424e) interfaceC1432m, this, gVar, this.f9610g0, aVar2, a0Var);
        }
        throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1432m + "\nkind: " + aVar);
    }

    @Override // R7.AbstractC1505k, O7.InterfaceC1432m
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e b() {
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) super.b();
        if (interfaceC1424e == null) {
            M(17);
        }
        return interfaceC1424e;
    }

    public R7.C1500f z1(java.util.List list, O7.AbstractC1439u abstractC1439u) {
        if (list == null) {
            M(13);
        }
        if (abstractC1439u == null) {
            M(14);
        }
        A1(list, abstractC1439u, b().A());
        return this;
    }
}
