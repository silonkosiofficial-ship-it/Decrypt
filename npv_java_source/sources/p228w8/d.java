package p228w8;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f56269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p138n8.c f56270b;

    private d(java.lang.String str) {
        if (str == null) {
            a(5);
        }
        this.f56269a = str;
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 3 || i6 == 6 || i6 == 7 || i6 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 3 || i6 == 6 || i6 == 7 || i6 == 8) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i6 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i6 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i6 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i6 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i6) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 3 && i6 != 6 && i6 != 7 && i6 != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p228w8.d b(p138n8.b bVar) {
        if (bVar == null) {
            a(1);
        }
        p138n8.c cVarH = bVar.h();
        java.lang.String strReplace = bVar.i().b().replace('.', '$');
        if (cVarH.d()) {
            return new p228w8.d(strReplace);
        }
        return new p228w8.d(cVarH.b().replace('.', '/') + "/" + strReplace);
    }

    public static p228w8.d c(p138n8.c cVar) {
        if (cVar == null) {
            a(2);
        }
        p228w8.d dVar = new p228w8.d(cVar.b().replace('.', '/'));
        dVar.f56270b = cVar;
        return dVar;
    }

    public static p228w8.d d(java.lang.String str) {
        if (str == null) {
            a(0);
        }
        return new p228w8.d(str);
    }

    public p138n8.c e() {
        return new p138n8.c(this.f56269a.replace('/', '.'));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f56269a.equals(((p228w8.d) obj).f56269a);
    }

    public java.lang.String f() {
        java.lang.String str = this.f56269a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    public p138n8.c g() {
        int iLastIndexOf = this.f56269a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new p138n8.c(this.f56269a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        p138n8.c cVar = p138n8.c.f51948c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f56269a.hashCode();
    }

    public java.lang.String toString() {
        return this.f56269a;
    }
}
