package R7;

/* JADX INFO: renamed from: R7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1496b extends R7.AbstractC1499e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1496b(E8.n nVar, O7.InterfaceC1432m interfaceC1432m, P7.g gVar, p138n8.f fVar, F8.u0 u0Var, boolean z6, int i6, O7.a0 a0Var, O7.d0 d0Var) {
        super(nVar, interfaceC1432m, gVar, fVar, u0Var, z6, i6, a0Var, d0Var);
        if (nVar == null) {
            M(0);
        }
        if (interfaceC1432m == null) {
            M(1);
        }
        if (gVar == null) {
            M(2);
        }
        if (fVar == null) {
            M(3);
        }
        if (u0Var == null) {
            M(4);
        }
        if (a0Var == null) {
            M(5);
        }
        if (d0Var == null) {
            M(6);
        }
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i6) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // R7.AbstractC1504j
    public java.lang.String toString() {
        java.lang.String str = "";
        java.lang.String str2 = K() ? "reified " : "";
        if (s() != F8.u0.INVARIANT) {
            str = s() + " ";
        }
        return java.lang.String.format("%s%s%s", str2, str, getName());
    }
}
