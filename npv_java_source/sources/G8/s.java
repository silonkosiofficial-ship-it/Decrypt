package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 7 || i6 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 7 || i6 == 10) ? 2 : 3];
        switch (i6) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i6 == 7) {
            objArr[1] = "getOutType";
        } else if (i6 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i6) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 7 && i6 != 10) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static F8.E b(F8.E e6, F8.E e10) {
        if (e6 == null) {
            a(0);
        }
        if (e10 == null) {
            a(1);
        }
        return c(e6, e10, new G8.r());
    }

    public static F8.E c(F8.E e6, F8.E e10, G8.t tVar) {
        if (e6 == null) {
            a(2);
        }
        if (e10 == null) {
            a(3);
        }
        if (tVar == null) {
            a(4);
        }
        return G8.v.d(e6, e10, tVar);
    }
}
