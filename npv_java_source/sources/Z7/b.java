package Z7;

/* JADX INFO: loaded from: classes2.dex */
public class b extends R7.C1500f implements Z7.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private java.lang.Boolean f16707h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private java.lang.Boolean f16708i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(O7.InterfaceC1424e interfaceC1424e, Z7.b bVar, P7.g gVar, boolean z6, O7.InterfaceC1421b.a aVar, O7.a0 a0Var) {
        super(interfaceC1424e, bVar, gVar, z6, aVar, a0Var);
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
        this.f16707h0 = null;
        this.f16708i0 = null;
    }

    public static Z7.b C1(O7.InterfaceC1424e interfaceC1424e, P7.g gVar, boolean z6, O7.a0 a0Var) {
        if (interfaceC1424e == null) {
            M(4);
        }
        if (gVar == null) {
            M(5);
        }
        if (a0Var == null) {
            M(6);
        }
        return new Z7.b(interfaceC1424e, null, gVar, z6, O7.InterfaceC1421b.a.DECLARATION, a0Var);
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 11 || i6 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 11 || i6 == 18) ? 2 : 3];
        switch (i6) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i6 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i6 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 11 && i6 != 18) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    protected Z7.b B1(O7.InterfaceC1424e interfaceC1424e, Z7.b bVar, O7.InterfaceC1421b.a aVar, O7.a0 a0Var, P7.g gVar) {
        if (interfaceC1424e == null) {
            M(12);
        }
        if (aVar == null) {
            M(13);
        }
        if (a0Var == null) {
            M(14);
        }
        if (gVar == null) {
            M(15);
        }
        return new Z7.b(interfaceC1424e, bVar, gVar, this.f9610g0, aVar, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.C1500f
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public Z7.b U0(O7.InterfaceC1432m interfaceC1432m, O7.InterfaceC1443y interfaceC1443y, O7.InterfaceC1421b.a aVar, p138n8.f fVar, P7.g gVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(7);
        }
        if (aVar == null) {
            M(8);
        }
        if (gVar == null) {
            M(9);
        }
        if (a0Var == null) {
            M(10);
        }
        if (aVar == O7.InterfaceC1421b.a.DECLARATION || aVar == O7.InterfaceC1421b.a.SYNTHESIZED) {
            Z7.b bVarB1 = B1((O7.InterfaceC1424e) interfaceC1432m, (Z7.b) interfaceC1443y, aVar, a0Var, gVar);
            bVarB1.h1(Z0());
            bVarB1.i1(L());
            return bVarB1;
        }
        throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1432m + "\nkind: " + aVar);
    }

    @Override // Z7.a
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public Z7.b n0(F8.E e6, java.util.List list, F8.E e10, p087i7.u uVar) {
        if (list == null) {
            M(16);
        }
        if (e10 == null) {
            M(17);
        }
        Z7.b bVarU0 = U0(b(), null, j(), null, k(), o());
        bVarU0.a1(e6 == null ? null : p178r8.e.i(bVarU0, e6, P7.g.f8385d.b()), m0(), p097j7.AbstractC6879v.m(), g(), Z7.h.a(list, n(), bVarU0), e10, q(), h());
        if (uVar != null) {
            bVarU0.d1((O7.InterfaceC1420a.InterfaceC0196a) uVar.c(), uVar.d());
        }
        return bVarU0;
    }

    @Override // R7.p, O7.InterfaceC1420a
    public boolean L() {
        return this.f16708i0.booleanValue();
    }

    @Override // R7.p
    public boolean Z0() {
        return this.f16707h0.booleanValue();
    }

    @Override // R7.p
    public void h1(boolean z6) {
        this.f16707h0 = java.lang.Boolean.valueOf(z6);
    }

    @Override // R7.p
    public void i1(boolean z6) {
        this.f16708i0 = java.lang.Boolean.valueOf(z6);
    }
}
