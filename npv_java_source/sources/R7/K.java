package R7;

/* JADX INFO: loaded from: classes2.dex */
public class K extends R7.AbstractC1499e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p237x7.l f9562M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final java.util.List f9563N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f9564O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private K(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, boolean z6, F8.u0 u0Var, p138n8.f fVar, int i6, O7.a0 a0Var, p237x7.l lVar, O7.d0 d0Var, E8.n nVar) {
        super(nVar, interfaceC1432m, gVar, fVar, u0Var, z6, i6, a0Var, d0Var);
        if (interfaceC1432m == null) {
            M(19);
        }
        if (gVar == null) {
            M(20);
        }
        if (u0Var == null) {
            M(21);
        }
        if (fVar == null) {
            M(22);
        }
        if (a0Var == null) {
            M(23);
        }
        if (d0Var == null) {
            M(24);
        }
        if (nVar == null) {
            M(25);
        }
        this.f9563N = new java.util.ArrayList(1);
        this.f9564O = false;
        this.f9562M = lVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = (i6 == 5 || i6 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 5 || i6 == 28) ? 2 : 3];
        switch (i6) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i6 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i6 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i6) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 5 && i6 != 28) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private void W0() {
        if (this.f9564O) {
            return;
        }
        throw new java.lang.IllegalStateException("Type parameter descriptor is not initialized: " + d1());
    }

    private void X0() {
        if (this.f9564O) {
            throw new java.lang.IllegalStateException("Type parameter descriptor is already initialized: " + d1());
        }
    }

    public static R7.K Y0(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, boolean z6, F8.u0 u0Var, p138n8.f fVar, int i6, O7.a0 a0Var, E8.n nVar) {
        if (interfaceC1432m == null) {
            M(6);
        }
        if (gVar == null) {
            M(7);
        }
        if (u0Var == null) {
            M(8);
        }
        if (fVar == null) {
            M(9);
        }
        if (a0Var == null) {
            M(10);
        }
        if (nVar == null) {
            M(11);
        }
        return Z0(interfaceC1432m, gVar, z6, u0Var, fVar, i6, a0Var, null, O7.d0.a.f8153a, nVar);
    }

    public static R7.K Z0(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, boolean z6, F8.u0 u0Var, p138n8.f fVar, int i6, O7.a0 a0Var, p237x7.l lVar, O7.d0 d0Var, E8.n nVar) {
        if (interfaceC1432m == null) {
            M(12);
        }
        if (gVar == null) {
            M(13);
        }
        if (u0Var == null) {
            M(14);
        }
        if (fVar == null) {
            M(15);
        }
        if (a0Var == null) {
            M(16);
        }
        if (d0Var == null) {
            M(17);
        }
        if (nVar == null) {
            M(18);
        }
        return new R7.K(interfaceC1432m, gVar, z6, u0Var, fVar, i6, a0Var, lVar, d0Var, nVar);
    }

    public static O7.f0 a1(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, boolean z6, F8.u0 u0Var, p138n8.f fVar, int i6, E8.n nVar) {
        if (interfaceC1432m == null) {
            M(0);
        }
        if (gVar == null) {
            M(1);
        }
        if (u0Var == null) {
            M(2);
        }
        if (fVar == null) {
            M(3);
        }
        if (nVar == null) {
            M(4);
        }
        R7.K kY0 = Y0(interfaceC1432m, gVar, z6, u0Var, fVar, i6, O7.a0.f8143a, nVar);
        kY0.V0(p218v8.c.j(interfaceC1432m).y());
        kY0.e1();
        return kY0;
    }

    private void b1(F8.E e6) {
        if (F8.G.a(e6)) {
            return;
        }
        this.f9563N.add(e6);
    }

    private java.lang.String d1() {
        return getName() + " declared in " + p178r8.f.m(b());
    }

    @Override // R7.AbstractC1499e
    protected void T0(F8.E e6) {
        if (e6 == null) {
            M(27);
        }
        p237x7.l lVar = this.f9562M;
        if (lVar == null) {
            return;
        }
        lVar.l(e6);
    }

    @Override // R7.AbstractC1499e
    protected java.util.List U0() {
        W0();
        java.util.List list = this.f9563N;
        if (list == null) {
            M(28);
        }
        return list;
    }

    public void V0(F8.E e6) {
        if (e6 == null) {
            M(26);
        }
        X0();
        b1(e6);
    }

    public boolean c1() {
        return this.f9564O;
    }

    public void e1() {
        X0();
        this.f9564O = true;
    }
}
