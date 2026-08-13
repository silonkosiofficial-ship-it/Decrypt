package p228w8;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    BOOLEAN(L7.h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(L7.h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(L7.h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(L7.h.SHORT, "short", "S", "java.lang.Short"),
    INT(L7.h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(L7.h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(L7.h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(L7.h.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final java.util.Set f56279O = new java.util.HashSet();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final java.util.Map f56280P = new java.util.HashMap();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final java.util.Map f56281Q = new java.util.EnumMap(L7.h.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final java.util.Map f56282R = new java.util.HashMap();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final L7.h f56284C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f56285D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f56286E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p138n8.c f56287F;

    static {
        for (p228w8.e eVar : values()) {
            f56279O.add(eVar.q());
            f56280P.put(eVar.n(), eVar);
            f56281Q.put(eVar.o(), eVar);
            f56282R.put(eVar.m(), eVar);
        }
    }

    e(L7.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (hVar == null) {
            e(6);
        }
        if (str == null) {
            e(7);
        }
        if (str2 == null) {
            e(8);
        }
        if (str3 == null) {
            e(9);
        }
        this.f56284C = hVar;
        this.f56285D = str;
        this.f56286E = str2;
        this.f56287F = new p138n8.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void e(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 2 && i6 != 4) {
            switch (i6) {
                case 10:
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 2 && i6 != 4) {
            switch (i6) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i10 = 2;
                    break;
                default:
                    i10 = 3;
                    break;
            }
        } else {
            i10 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i6 != 2 && i6 != 4) {
            switch (i6) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i6) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 2 && i6 != 4) {
            switch (i6) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p228w8.e g(L7.h hVar) {
        if (hVar == null) {
            e(3);
        }
        p228w8.e eVar = (p228w8.e) f56281Q.get(hVar);
        if (eVar == null) {
            e(4);
        }
        return eVar;
    }

    public static p228w8.e i(java.lang.String str) {
        if (str == null) {
            e(1);
        }
        p228w8.e eVar = (p228w8.e) f56280P.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new java.lang.AssertionError("Non-primitive type name passed: " + str);
    }

    public java.lang.String m() {
        java.lang.String str = this.f56286E;
        if (str == null) {
            e(12);
        }
        return str;
    }

    public java.lang.String n() {
        java.lang.String str = this.f56285D;
        if (str == null) {
            e(11);
        }
        return str;
    }

    public L7.h o() {
        L7.h hVar = this.f56284C;
        if (hVar == null) {
            e(10);
        }
        return hVar;
    }

    public p138n8.c q() {
        p138n8.c cVar = this.f56287F;
        if (cVar == null) {
            e(13);
        }
        return cVar;
    }
}
