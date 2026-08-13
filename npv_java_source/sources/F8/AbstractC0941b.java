package F8;

/* JADX INFO: renamed from: F8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0941b extends F8.AbstractC0945f implements F8.e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0941b(E8.n nVar) {
        super(nVar);
        if (nVar == null) {
            p(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void p(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 3 || i6 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 3 || i6 == 4) ? 2 : 3];
        if (i6 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i6 == 2) {
            objArr[0] = "classifier";
        } else if (i6 == 3 || i6 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i6 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i6 == 3 || i6 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i6 != 1) {
            if (i6 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i6 != 3 && i6 != 4) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 3 && i6 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // F8.AbstractC0951l
    protected boolean d(O7.InterfaceC1427h interfaceC1427h) {
        if (interfaceC1427h == null) {
            p(2);
        }
        return (interfaceC1427h instanceof O7.InterfaceC1424e) && b(q(), interfaceC1427h);
    }

    @Override // F8.AbstractC0945f
    protected F8.E h() {
        if (L7.g.u0(q())) {
            return null;
        }
        return t().i();
    }

    @Override // F8.AbstractC0945f
    protected java.util.Collection i(boolean z6) {
        O7.InterfaceC1432m interfaceC1432mB = q().b();
        if (!(interfaceC1432mB instanceof O7.InterfaceC1424e)) {
            java.util.List listEmptyList = java.util.Collections.emptyList();
            if (listEmptyList == null) {
                p(3);
            }
            return listEmptyList;
        }
        P8.f fVar = new P8.f();
        O7.InterfaceC1424e interfaceC1424e = (O7.InterfaceC1424e) interfaceC1432mB;
        fVar.add(interfaceC1424e.w());
        O7.InterfaceC1424e interfaceC1424eA0 = interfaceC1424e.a0();
        if (z6 && interfaceC1424eA0 != null) {
            fVar.add(interfaceC1424eA0.w());
        }
        return fVar;
    }

    public abstract O7.InterfaceC1424e q();

    @Override // F8.e0
    public L7.g t() {
        L7.g gVarJ = p218v8.c.j(q());
        if (gVarJ == null) {
            p(1);
        }
        return gVarJ;
    }
}
