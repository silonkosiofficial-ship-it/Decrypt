package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.c f51945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p138n8.c f51946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51947c;

    public b(p138n8.c cVar, p138n8.c cVar2, boolean z6) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f51945a = cVar;
        this.f51946b = cVar2;
        this.f51947c = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(p138n8.c cVar, p138n8.f fVar) {
        this(cVar, p138n8.c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
            switch (i6) {
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
            switch (i6) {
                case 13:
                case 14:
                case 15:
                case 16:
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
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i6 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i6 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i6 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i6 != 9) {
            switch (i6) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 5 && i6 != 6 && i6 != 7 && i6 != 9) {
            switch (i6) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p138n8.b e(java.lang.String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    public static p138n8.b f(java.lang.String str, boolean z6) {
        java.lang.String str2;
        if (str == null) {
            a(12);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            java.lang.String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new p138n8.b(new p138n8.c(str2), new p138n8.c(str), z6);
    }

    public static p138n8.b m(p138n8.c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new p138n8.b(cVar.e(), cVar.g());
    }

    public p138n8.c b() {
        if (this.f51945a.d()) {
            p138n8.c cVar = this.f51946b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new p138n8.c(this.f51945a.b() + "." + this.f51946b.b());
    }

    public java.lang.String c() {
        if (this.f51945a.d()) {
            java.lang.String strB = this.f51946b.b();
            if (strB == null) {
                a(13);
            }
            return strB;
        }
        java.lang.String str = this.f51945a.b().replace('.', '/') + "/" + this.f51946b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    public p138n8.b d(p138n8.f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new p138n8.b(h(), this.f51946b.c(fVar), this.f51947c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p138n8.b.class != obj.getClass()) {
            return false;
        }
        p138n8.b bVar = (p138n8.b) obj;
        return this.f51945a.equals(bVar.f51945a) && this.f51946b.equals(bVar.f51946b) && this.f51947c == bVar.f51947c;
    }

    public p138n8.b g() {
        p138n8.c cVarE = this.f51946b.e();
        if (cVarE.d()) {
            return null;
        }
        return new p138n8.b(h(), cVarE, this.f51947c);
    }

    public p138n8.c h() {
        p138n8.c cVar = this.f51945a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f51945a.hashCode() * 31) + this.f51946b.hashCode()) * 31) + java.lang.Boolean.valueOf(this.f51947c).hashCode();
    }

    public p138n8.c i() {
        p138n8.c cVar = this.f51946b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    public p138n8.f j() {
        p138n8.f fVarG = this.f51946b.g();
        if (fVarG == null) {
            a(7);
        }
        return fVarG;
    }

    public boolean k() {
        return this.f51947c;
    }

    public boolean l() {
        return !this.f51946b.e().d();
    }

    public java.lang.String toString() {
        if (!this.f51945a.d()) {
            return c();
        }
        return "/" + c();
    }
}
