package R7;

/* JADX INFO: loaded from: classes2.dex */
public class y extends R7.AbstractC1501g {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final O7.EnumC1425f f9731K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final boolean f9732L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private O7.D f9733M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private O7.AbstractC1439u f9734N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private F8.e0 f9735O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private java.util.List f9736P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final java.util.Collection f9737Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final E8.n f9738R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O7.InterfaceC1432m interfaceC1432m, O7.EnumC1425f enumC1425f, boolean z6, boolean z10, p138n8.f fVar, O7.a0 a0Var, E8.n nVar) {
        super(nVar, interfaceC1432m, fVar, a0Var, z10);
        if (interfaceC1432m == null) {
            J0(0);
        }
        if (enumC1425f == null) {
            J0(1);
        }
        if (fVar == null) {
            J0(2);
        }
        if (a0Var == null) {
            J0(3);
        }
        if (nVar == null) {
            J0(4);
        }
        this.f9737Q = new java.util.ArrayList();
        this.f9738R = nVar;
        this.f9731K = enumC1425f;
        this.f9732L = z6;
    }

    private static /* synthetic */ void J0(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        java.util.List list = this.f9736P;
        if (list == null) {
            J0(15);
        }
        return list;
    }

    @Override // O7.InterfaceC1424e
    public boolean E() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean I() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public O7.h0 I0() {
        return null;
    }

    @Override // O7.C
    public boolean N0() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection O() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(19);
        }
        return listEmptyList;
    }

    @Override // O7.InterfaceC1424e
    public boolean P() {
        return false;
    }

    @Override // R7.t
    public p248y8.h Q(G8.g gVar) {
        if (gVar == null) {
            J0(16);
        }
        y8.h.b bVar = y8.h.b.f57356b;
        if (bVar == null) {
            J0(17);
        }
        return bVar;
    }

    @Override // O7.C
    public boolean R() {
        return false;
    }

    @Override // O7.InterfaceC1424e
    public boolean R0() {
        return false;
    }

    @Override // O7.InterfaceC1428i
    public boolean S() {
        return this.f9732L;
    }

    public void T0() {
        this.f9735O = new F8.C0950k(this, this.f9736P, this.f9737Q, this.f9738R);
        java.util.Iterator it = r().iterator();
        while (it.hasNext()) {
            ((R7.C1500f) ((O7.InterfaceC1443y) it.next())).p1(w());
        }
    }

    @Override // O7.InterfaceC1424e
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public java.util.Set r() {
        java.util.Set setEmptySet = java.util.Collections.emptySet();
        if (setEmptySet == null) {
            J0(13);
        }
        return setEmptySet;
    }

    public void V0(O7.D d6) {
        if (d6 == null) {
            J0(6);
        }
        this.f9733M = d6;
    }

    public void W0(java.util.List list) {
        if (list == null) {
            J0(14);
        }
        if (this.f9736P == null) {
            this.f9736P = new java.util.ArrayList(list);
            return;
        }
        throw new java.lang.IllegalStateException("Type parameters are already set for " + getName());
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return null;
    }

    public void X0(O7.AbstractC1439u abstractC1439u) {
        if (abstractC1439u == null) {
            J0(9);
        }
        this.f9734N = abstractC1439u;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h Y() {
        y8.h.b bVar = y8.h.b.f57356b;
        if (bVar == null) {
            J0(18);
        }
        return bVar;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return null;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = this.f9734N;
        if (abstractC1439u == null) {
            J0(10);
        }
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        O7.EnumC1425f enumC1425f = this.f9731K;
        if (enumC1425f == null) {
            J0(8);
        }
        return enumC1425f;
    }

    @Override // P7.a
    public P7.g k() {
        P7.g gVarB = P7.g.f8385d.b();
        if (gVarB == null) {
            J0(5);
        }
        return gVarB;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return false;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        F8.e0 e0Var = this.f9735O;
        if (e0Var == null) {
            J0(11);
        }
        return e0Var;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        O7.D d6 = this.f9733M;
        if (d6 == null) {
            J0(7);
        }
        return d6;
    }

    public java.lang.String toString() {
        return R7.AbstractC1504j.Q(this);
    }
}
