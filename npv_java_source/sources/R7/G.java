package R7;

/* JADX INFO: loaded from: classes2.dex */
public class G extends R7.p implements O7.Z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected G(O7.InterfaceC1432m interfaceC1432m, O7.Z z6, P7.g gVar, p138n8.f fVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        super(interfaceC1432m, z6, gVar, fVar, aVar, a0Var);
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (fVar == null) {
            M(2);
        }
        if (aVar == null) {
            M(3);
        }
        if (a0Var == null) {
            M(4);
        }
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 13 || i6 == 18 || i6 == 23 || i6 == 24 || i6 == 29 || i6 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 13 || i6 == 18 || i6 == 23 || i6 == 24 || i6 == 29 || i6 == 30) ? 2 : 3];
        switch (i6) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i6 == 13 || i6 == 18 || i6 == 23) {
            objArr[1] = "initialize";
        } else if (i6 == 24) {
            objArr[1] = "getOriginal";
        } else if (i6 == 29) {
            objArr[1] = "copy";
        } else if (i6 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i6) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 13 && i6 != 18 && i6 != 23 && i6 != 24 && i6 != 29 && i6 != 30) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static R7.G u1(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(5);
        }
        if (gVar == null) {
            M(6);
        }
        if (fVar == null) {
            M(7);
        }
        if (aVar == null) {
            M(8);
        }
        if (a0Var == null) {
            M(9);
        }
        return new R7.G(interfaceC1432m, null, gVar, fVar, aVar, a0Var);
    }

    @Override // R7.p
    protected R7.p U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(25);
        }
        if (aVar == null) {
            M(26);
        }
        if (gVar == null) {
            M(27);
        }
        if (a0Var == null) {
            M(28);
        }
        O7.Z z6 = (O7.Z) interfaceC1443y;
        if (fVar == null) {
            fVar = getName();
        }
        return new R7.G(interfaceC1432m, z6, gVar, fVar, aVar, a0Var);
    }

    @Override // O7.InterfaceC1421b
    /* JADX INFO: renamed from: t1 */
    public O7.Z i0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.InterfaceC1421b.a aVar, boolean z6) {
        O7.Z z10 = (O7.Z) super.T0(interfaceC1432m, d6, abstractC1439u, aVar, z6);
        if (z10 == null) {
            M(29);
        }
        return z10;
    }

    @Override // R7.p, R7.AbstractC1505k, R7.AbstractC1504j, O7.InterfaceC1432m
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public O7.Z a() {
        O7.Z z6 = (O7.Z) super.a();
        if (z6 == null) {
            M(24);
        }
        return z6;
    }

    @Override // R7.p
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public R7.G a1(O7.X x6, O7.X x10, java.util.List list, java.util.List list2, java.util.List list3, F8.E e6, O7.D d6, O7.AbstractC1439u abstractC1439u) {
        if (list == null) {
            M(14);
        }
        if (list2 == null) {
            M(15);
        }
        if (list3 == null) {
            M(16);
        }
        if (abstractC1439u == null) {
            M(17);
        }
        R7.G gX1 = x1(x6, x10, list, list2, list3, e6, d6, abstractC1439u, null);
        if (gX1 == null) {
            M(18);
        }
        return gX1;
    }

    public R7.G x1(O7.X x6, O7.X x10, java.util.List list, java.util.List list2, java.util.List list3, F8.E e6, O7.D d6, O7.AbstractC1439u abstractC1439u, java.util.Map map) {
        if (list == null) {
            M(19);
        }
        if (list2 == null) {
            M(20);
        }
        if (list3 == null) {
            M(21);
        }
        if (abstractC1439u == null) {
            M(22);
        }
        super.a1(x6, x10, list, list2, list3, e6, d6, abstractC1439u);
        if (map != null && !map.isEmpty()) {
            this.f9667f0 = new java.util.LinkedHashMap(map);
        }
        return this;
    }

    @Override // R7.p, O7.InterfaceC1443y, O7.Z
    public O7.InterfaceC1443y.a z() {
        O7.InterfaceC1443y.a aVarZ = super.z();
        if (aVarZ == null) {
            M(30);
        }
        return aVarZ;
    }
}
