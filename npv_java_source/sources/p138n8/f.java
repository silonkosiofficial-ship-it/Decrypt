package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f51959C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f51960D;

    private f(java.lang.String str, boolean z6) {
        if (str == null) {
            e(0);
        }
        this.f51959C = str;
        this.f51960D = z6;
    }

    private static /* synthetic */ void e(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) ? 2 : 3];
        if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i6 == 1) {
            objArr[1] = "asString";
        } else if (i6 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i6 == 3 || i6 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p138n8.f n(java.lang.String str) {
        if (str == null) {
            e(9);
        }
        return str.startsWith("<") ? s(str) : o(str);
    }

    public static p138n8.f o(java.lang.String str) {
        if (str == null) {
            e(5);
        }
        return new p138n8.f(str, false);
    }

    public static boolean r(java.lang.String str) {
        if (str == null) {
            e(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static p138n8.f s(java.lang.String str) {
        if (str == null) {
            e(8);
        }
        if (str.startsWith("<")) {
            return new p138n8.f(str, true);
        }
        throw new java.lang.IllegalArgumentException("special name must start with '<': " + str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p138n8.f)) {
            return false;
        }
        p138n8.f fVar = (p138n8.f) obj;
        return this.f51960D == fVar.f51960D && this.f51959C.equals(fVar.f51959C);
    }

    public java.lang.String g() {
        java.lang.String str = this.f51959C;
        if (str == null) {
            e(1);
        }
        return str;
    }

    public int hashCode() {
        return (this.f51959C.hashCode() * 31) + (this.f51960D ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(p138n8.f fVar) {
        return this.f51959C.compareTo(fVar.f51959C);
    }

    public java.lang.String m() {
        if (this.f51960D) {
            throw new java.lang.IllegalStateException("not identifier: " + this);
        }
        java.lang.String strG = g();
        if (strG == null) {
            e(2);
        }
        return strG;
    }

    public boolean q() {
        return this.f51960D;
    }

    public java.lang.String toString() {
        return this.f51959C;
    }
}
