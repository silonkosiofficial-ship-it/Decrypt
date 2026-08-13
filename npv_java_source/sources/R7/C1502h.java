package R7;

/* JADX INFO: renamed from: R7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1502h extends R7.AbstractC1501g {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final O7.D f9614K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final O7.EnumC1425f f9615L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final F8.e0 f9616M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p248y8.h f9617N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private java.util.Set f9618O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private O7.InterfaceC1423d f9619P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502h(O7.InterfaceC1432m interfaceC1432m, p138n8.f fVar, O7.D d6, O7.EnumC1425f enumC1425f, java.util.Collection collection, O7.a0 a0Var, boolean z6, E8.n nVar) {
        super(nVar, interfaceC1432m, fVar, a0Var, z6);
        if (interfaceC1432m == null) {
            J0(0);
        }
        if (fVar == null) {
            J0(1);
        }
        if (d6 == null) {
            J0(2);
        }
        if (enumC1425f == null) {
            J0(3);
        }
        if (collection == null) {
            J0(4);
        }
        if (a0Var == null) {
            J0(5);
        }
        if (nVar == null) {
            J0(6);
        }
        this.f9614K = d6;
        this.f9615L = enumC1425f;
        this.f9616M = new F8.C0950k(this, java.util.Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void J0(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 12:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i6) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(str2);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1428i
    public java.util.List A() {
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (listEmptyList == null) {
            J0(18);
        }
        return listEmptyList;
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
            J0(12);
        }
        p248y8.h hVar = this.f9617N;
        if (hVar == null) {
            J0(13);
        }
        return hVar;
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
        return false;
    }

    public final void T0(p248y8.h hVar, java.util.Set set, O7.InterfaceC1423d interfaceC1423d) {
        if (hVar == null) {
            J0(7);
        }
        if (set == null) {
            J0(8);
        }
        this.f9617N = hVar;
        this.f9618O = set;
        this.f9619P = interfaceC1423d;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1423d X() {
        return this.f9619P;
    }

    @Override // O7.InterfaceC1424e
    public p248y8.h Y() {
        y8.h.b bVar = y8.h.b.f57356b;
        if (bVar == null) {
            J0(14);
        }
        return bVar;
    }

    @Override // O7.InterfaceC1424e
    public O7.InterfaceC1424e a0() {
        return null;
    }

    @Override // O7.InterfaceC1424e, O7.InterfaceC1436q, O7.C
    public O7.AbstractC1439u h() {
        O7.AbstractC1439u abstractC1439u = O7.AbstractC1438t.f8186e;
        if (abstractC1439u == null) {
            J0(17);
        }
        return abstractC1439u;
    }

    @Override // O7.InterfaceC1424e
    public O7.EnumC1425f j() {
        O7.EnumC1425f enumC1425f = this.f9615L;
        if (enumC1425f == null) {
            J0(15);
        }
        return enumC1425f;
    }

    @Override // P7.a
    public P7.g k() {
        P7.g gVarB = P7.g.f8385d.b();
        if (gVarB == null) {
            J0(9);
        }
        return gVarB;
    }

    @Override // O7.InterfaceC1424e
    public boolean m() {
        return false;
    }

    @Override // O7.InterfaceC1427h
    public F8.e0 p() {
        F8.e0 e0Var = this.f9616M;
        if (e0Var == null) {
            J0(10);
        }
        return e0Var;
    }

    @Override // O7.InterfaceC1424e, O7.C
    public O7.D q() {
        O7.D d6 = this.f9614K;
        if (d6 == null) {
            J0(16);
        }
        return d6;
    }

    @Override // O7.InterfaceC1424e
    public java.util.Collection r() {
        java.util.Set set = this.f9618O;
        if (set == null) {
            J0(11);
        }
        return set;
    }

    public java.lang.String toString() {
        return "class " + getName();
    }
}
