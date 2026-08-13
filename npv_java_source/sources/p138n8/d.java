package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p138n8.f f51951e = p138n8.f.s("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.regex.Pattern f51952f = java.util.regex.Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p237x7.l f51953g = new n8.d.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient p138n8.c f51955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient p138n8.d f51956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient p138n8.f f51957d;

    static class a implements p237x7.l {
        a() {
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p138n8.f l(java.lang.String str) {
            return p138n8.f.n(str);
        }
    }

    public d(java.lang.String str) {
        if (str == null) {
            a(2);
        }
        this.f51954a = str;
    }

    d(java.lang.String str, p138n8.c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f51954a = str;
        this.f51955b = cVar;
    }

    private d(java.lang.String str, p138n8.d dVar, p138n8.f fVar) {
        if (str == null) {
            a(3);
        }
        this.f51954a = str;
        this.f51956c = dVar;
        this.f51957d = fVar;
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str;
        int i10;
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i10 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i10 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i10];
        if (i6 != 1) {
            switch (i6) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i6) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i6) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new java.lang.IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    private void d() {
        int iLastIndexOf = this.f51954a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f51957d = p138n8.f.n(this.f51954a.substring(iLastIndexOf + 1));
            this.f51956c = new p138n8.d(this.f51954a.substring(0, iLastIndexOf));
        } else {
            this.f51957d = p138n8.f.n(this.f51954a);
            this.f51956c = p138n8.c.f51948c.j();
        }
    }

    public static p138n8.d m(p138n8.f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new p138n8.d(fVar.g(), p138n8.c.f51948c.j(), fVar);
    }

    public java.lang.String b() {
        java.lang.String str = this.f51954a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public p138n8.d c(p138n8.f fVar) {
        java.lang.String strG;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strG = fVar.g();
        } else {
            strG = this.f51954a + "." + fVar.g();
        }
        return new p138n8.d(strG, this, fVar);
    }

    public boolean e() {
        return this.f51954a.isEmpty();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p138n8.d) && this.f51954a.equals(((p138n8.d) obj).f51954a);
    }

    public boolean f() {
        return this.f51955b != null || b().indexOf(60) < 0;
    }

    public p138n8.d g() {
        p138n8.d dVar = this.f51956c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new java.lang.IllegalStateException("root");
        }
        d();
        p138n8.d dVar2 = this.f51956c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    public java.util.List h() {
        java.util.List listEmptyList = e() ? java.util.Collections.emptyList() : p097j7.AbstractC6872n.B0(f51952f.split(this.f51954a), f51953g);
        if (listEmptyList == null) {
            a(14);
        }
        return listEmptyList;
    }

    public int hashCode() {
        return this.f51954a.hashCode();
    }

    public p138n8.f i() {
        p138n8.f fVar = this.f51957d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new java.lang.IllegalStateException("root");
        }
        d();
        p138n8.f fVar2 = this.f51957d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public p138n8.f j() {
        if (e()) {
            p138n8.f fVar = f51951e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        p138n8.f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(p138n8.f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f51954a.indexOf(46);
        java.lang.String strG = fVar.g();
        java.lang.String str = this.f51954a;
        if (iIndexOf == -1) {
            iIndexOf = java.lang.Math.max(str.length(), strG.length());
        }
        return str.regionMatches(0, strG, 0, iIndexOf);
    }

    public p138n8.c l() {
        p138n8.c cVar = this.f51955b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        p138n8.c cVar2 = new p138n8.c(this);
        this.f51955b = cVar2;
        return cVar2;
    }

    public java.lang.String toString() {
        java.lang.String strG = e() ? f51951e.g() : this.f51954a;
        if (strG == null) {
            a(18);
        }
        return strG;
    }
}
