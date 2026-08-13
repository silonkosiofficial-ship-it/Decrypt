package F8;

/* JADX INFO: loaded from: classes2.dex */
public class k0 extends F8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.u0 f2944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F8.E f2945b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(F8.E e6) {
        this(F8.u0.INVARIANT, e6);
        if (e6 == null) {
            c(2);
        }
    }

    public k0(F8.u0 u0Var, F8.E e6) {
        if (u0Var == null) {
            c(0);
        }
        if (e6 == null) {
            c(1);
        }
        this.f2944a = u0Var;
        this.f2945b = e6;
    }

    private static /* synthetic */ void c(int i6) {
        java.lang.String str = (i6 == 4 || i6 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 4 || i6 == 5) ? 2 : 3];
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i6 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i6 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i6 == 3) {
            objArr[2] = "replaceType";
        } else if (i6 != 4 && i6 != 5) {
            if (i6 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 4 && i6 != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // F8.i0
    public F8.u0 a() {
        F8.u0 u0Var = this.f2944a;
        if (u0Var == null) {
            c(4);
        }
        return u0Var;
    }

    @Override // F8.i0
    public boolean b() {
        return false;
    }

    @Override // F8.i0
    public F8.E getType() {
        F8.E e6 = this.f2945b;
        if (e6 == null) {
            c(5);
        }
        return e6;
    }

    @Override // F8.i0
    public F8.i0 v(G8.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new F8.k0(this.f2944a, gVar.a(this.f2945b));
    }
}
