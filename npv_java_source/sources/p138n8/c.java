package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p138n8.c f51948c = new p138n8.c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.d f51949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p138n8.c f51950b;

    public c(java.lang.String str) {
        if (str == null) {
            a(1);
        }
        this.f51949a = new p138n8.d(str, this);
    }

    public c(p138n8.d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f51949a = dVar;
    }

    private c(p138n8.d dVar, p138n8.c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f51949a = dVar;
        this.f51950b = cVar;
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i10 = 2;
                break;
            case 8:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new java.lang.IllegalStateException(str2);
            case 8:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static p138n8.c k(p138n8.f fVar) {
        if (fVar == null) {
            a(14);
        }
        return new p138n8.c(p138n8.d.m(fVar));
    }

    public java.lang.String b() {
        java.lang.String strB = this.f51949a.b();
        if (strB == null) {
            a(4);
        }
        return strB;
    }

    public p138n8.c c(p138n8.f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new p138n8.c(this.f51949a.c(fVar), this);
    }

    public boolean d() {
        return this.f51949a.e();
    }

    public p138n8.c e() {
        p138n8.c cVar = this.f51950b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (d()) {
            throw new java.lang.IllegalStateException("root");
        }
        p138n8.c cVar2 = new p138n8.c(this.f51949a.g());
        this.f51950b = cVar2;
        return cVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p138n8.c) && this.f51949a.equals(((p138n8.c) obj).f51949a);
    }

    public java.util.List f() {
        java.util.List listH = this.f51949a.h();
        if (listH == null) {
            a(11);
        }
        return listH;
    }

    public p138n8.f g() {
        p138n8.f fVarI = this.f51949a.i();
        if (fVarI == null) {
            a(9);
        }
        return fVarI;
    }

    public p138n8.f h() {
        p138n8.f fVarJ = this.f51949a.j();
        if (fVarJ == null) {
            a(10);
        }
        return fVarJ;
    }

    public int hashCode() {
        return this.f51949a.hashCode();
    }

    public boolean i(p138n8.f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f51949a.k(fVar);
    }

    public p138n8.d j() {
        p138n8.d dVar = this.f51949a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public java.lang.String toString() {
        return this.f51949a.toString();
    }
}
