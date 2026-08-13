package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.core.os.i f21592b = a(new java.util.Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.os.k f21593a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.util.Locale[] f21594a = {new java.util.Locale("en", "XA"), new java.util.Locale("ar", "XB")};

        static java.util.Locale a(java.lang.String str) {
            return java.util.Locale.forLanguageTag(str);
        }

        private static boolean b(java.util.Locale locale) {
            for (java.util.Locale locale2 : f21594a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(java.util.Locale locale, java.util.Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            java.lang.String strA = androidx.core.text.c.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(androidx.core.text.c.a(locale2));
            }
            java.lang.String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static android.os.LocaleList a(java.util.Locale... localeArr) {
            return new android.os.LocaleList(localeArr);
        }

        static android.os.LocaleList b() {
            return android.os.LocaleList.getAdjustedDefault();
        }

        static android.os.LocaleList c() {
            return android.os.LocaleList.getDefault();
        }
    }

    private i(androidx.core.os.k kVar) {
        this.f21593a = kVar;
    }

    public static androidx.core.os.i a(java.util.Locale... localeArr) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? j(androidx.core.os.i.b.a(localeArr)) : new androidx.core.os.i(new androidx.core.os.j(localeArr));
    }

    static java.util.Locale b(java.lang.String str) {
        if (str.contains("-")) {
            java.lang.String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new java.util.Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new java.util.Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new java.util.Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new java.util.Locale(str);
            }
            java.lang.String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new java.util.Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new java.util.Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new java.util.Locale(strArrSplit2[0]);
            }
        }
        throw new java.lang.IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static androidx.core.os.i c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        java.lang.String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i6 = 0; i6 < length; i6++) {
            localeArr[i6] = androidx.core.os.i.a.a(strArrSplit[i6]);
        }
        return a(localeArr);
    }

    public static androidx.core.os.i e() {
        return f21592b;
    }

    public static androidx.core.os.i j(android.os.LocaleList localeList) {
        return new androidx.core.os.i(new androidx.core.os.p(localeList));
    }

    public java.util.Locale d(int i6) {
        return this.f21593a.get(i6);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.core.os.i) && this.f21593a.equals(((androidx.core.os.i) obj).f21593a);
    }

    public boolean f() {
        return this.f21593a.isEmpty();
    }

    public int g() {
        return this.f21593a.size();
    }

    public java.lang.String h() {
        return this.f21593a.a();
    }

    public int hashCode() {
        return this.f21593a.hashCode();
    }

    public java.lang.Object i() {
        return this.f21593a.b();
    }

    public java.lang.String toString() {
        return this.f21593a.toString();
    }
}
