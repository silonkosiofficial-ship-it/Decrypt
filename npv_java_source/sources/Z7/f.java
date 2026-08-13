package Z7;

/* JADX INFO: loaded from: classes2.dex */
public class f extends R7.C implements Z7.a {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final boolean f16723e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final p087i7.u f16724f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private F8.E f16725g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, p138n8.f fVar, O7.a0 a0Var, O7.U u6, O7.InterfaceC1421b.a aVar, boolean z10, p087i7.u uVar) {
        super(interfaceC1432m, u6, gVar, d6, abstractC1439u, z6, fVar, aVar, a0Var, false, false, false, false, false, false);
        if (interfaceC1432m == null) {
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
        if (fVar == null) {
            M(4);
        }
        if (a0Var == null) {
            M(5);
        }
        if (aVar == null) {
            M(6);
        }
        this.f16725g0 = null;
        this.f16723e0 = z10;
        this.f16724f0 = uVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = i6 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 21 ? 3 : 2];
        switch (i6) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i6 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i6) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 21) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static Z7.f o1(O7.InterfaceC1432m interfaceC1432m, P7.g gVar, O7.D d6, O7.AbstractC1439u abstractC1439u, boolean z6, p138n8.f fVar, O7.a0 a0Var, boolean z10) {
        if (interfaceC1432m == null) {
            M(7);
        }
        if (gVar == null) {
            M(8);
        }
        if (d6 == null) {
            M(9);
        }
        if (abstractC1439u == null) {
            M(10);
        }
        if (fVar == null) {
            M(11);
        }
        if (a0Var == null) {
            M(12);
        }
        return new Z7.f(interfaceC1432m, gVar, d6, abstractC1439u, z6, fVar, a0Var, null, O7.InterfaceC1421b.a.DECLARATION, z10, null);
    }

    @Override // R7.C, O7.InterfaceC1420a
    public java.lang.Object D(O7.InterfaceC1420a.InterfaceC0196a interfaceC0196a) {
        p087i7.u uVar = this.f16724f0;
        if (uVar == null || !((O7.InterfaceC1420a.InterfaceC0196a) uVar.c()).equals(interfaceC0196a)) {
            return null;
        }
        return this.f16724f0.d();
    }

    @Override // R7.C, O7.k0
    public boolean F() {
        F8.E type = getType();
        return this.f16723e0 && O7.C1429j.a(type) && (!p058f8.r.i(type) || L7.g.v0(type));
    }

    @Override // R7.M, O7.InterfaceC1420a
    public boolean L() {
        return false;
    }

    @Override // R7.C
    protected R7.C Y0(O7.InterfaceC1432m interfaceC1432m, O7.D d6, O7.AbstractC1439u abstractC1439u, O7.U u6, O7.InterfaceC1421b.a aVar, p138n8.f fVar, O7.a0 a0Var) {
        if (interfaceC1432m == null) {
            M(13);
        }
        if (d6 == null) {
            M(14);
        }
        if (abstractC1439u == null) {
            M(15);
        }
        if (aVar == null) {
            M(16);
        }
        if (fVar == null) {
            M(17);
        }
        if (a0Var == null) {
            M(18);
        }
        return new Z7.f(interfaceC1432m, k(), d6, abstractC1439u, t0(), fVar, a0Var, u6, aVar, this.f16723e0, this.f16724f0);
    }

    @Override // R7.C
    public void i1(F8.E e6) {
        if (e6 == null) {
            M(22);
        }
        this.f16725g0 = e6;
    }

    @Override // Z7.a
    public Z7.a n0(F8.E e6, java.util.List list, F8.E e10, p087i7.u uVar) {
        R7.D d6;
        R7.E e11;
        if (list == null) {
            M(19);
        }
        if (e10 == null) {
            M(20);
        }
        O7.U uA = a() == this ? null : a();
        Z7.f fVar = new Z7.f(b(), k(), q(), h(), t0(), getName(), o(), uA, j(), this.f16723e0, uVar);
        R7.D d10 = d();
        if (d10 != null) {
            d6 = d;
            R7.D d11 = new R7.D(fVar, d10.k(), d10.q(), d10.h(), d10.b0(), d10.C(), d10.m(), j(), uA == null ? null : uA.d(), d10.o());
            d6.V0(d10.l0());
            d6.Y0(e10);
        } else {
            d6 = null;
        }
        O7.W wI = i();
        if (wI != null) {
            R7.E e12 = new R7.E(fVar, wI.k(), wI.q(), wI.h(), wI.b0(), wI.C(), wI.m(), j(), uA == null ? null : uA.i(), wI.o());
            e12.V0(e12.l0());
            e12.Z0((O7.j0) wI.n().get(0));
            e11 = e12;
        } else {
            e11 = null;
        }
        fVar.e1(d6, e11, z0(), w0());
        fVar.j1(f1());
        p237x7.a aVar = this.f9577J;
        if (aVar != null) {
            fVar.T0(this.f9576I, aVar);
        }
        fVar.G0(f());
        fVar.k1(e10, g(), m0(), e6 == null ? null : p178r8.e.i(this, e6, P7.g.f8385d.b()), p097j7.AbstractC6879v.m());
        return fVar;
    }
}
