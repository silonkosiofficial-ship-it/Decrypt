package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class j implements androidx.core.os.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Locale[] f21595c = new java.util.Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Locale f21596d = new java.util.Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Locale f21597e = new java.util.Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Locale f21598f = androidx.core.os.i.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Locale[] f21599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f21600b;

    j(java.util.Locale... localeArr) {
        java.lang.String string;
        if (localeArr.length == 0) {
            this.f21599a = f21595c;
            string = "";
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i6 = 0; i6 < localeArr.length; i6++) {
                java.util.Locale locale = localeArr[i6];
                if (locale == null) {
                    throw new java.lang.NullPointerException("list[" + i6 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    java.util.Locale locale2 = (java.util.Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb, locale2);
                    if (i6 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f21599a = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            string = sb.toString();
        }
        this.f21600b = string;
    }

    static void c(java.lang.StringBuilder sb, java.util.Locale locale) {
        sb.append(locale.getLanguage());
        java.lang.String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.k
    public java.lang.String a() {
        return this.f21600b;
    }

    @Override // androidx.core.os.k
    public java.lang.Object b() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.core.os.j)) {
            return false;
        }
        java.util.Locale[] localeArr = ((androidx.core.os.j) obj).f21599a;
        if (this.f21599a.length != localeArr.length) {
            return false;
        }
        int i6 = 0;
        while (true) {
            java.util.Locale[] localeArr2 = this.f21599a;
            if (i6 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i6].equals(localeArr[i6])) {
                return false;
            }
            i6++;
        }
    }

    @Override // androidx.core.os.k
    public java.util.Locale get(int i6) {
        if (i6 >= 0) {
            java.util.Locale[] localeArr = this.f21599a;
            if (i6 < localeArr.length) {
                return localeArr[i6];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (java.util.Locale locale : this.f21599a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.k
    public boolean isEmpty() {
        return this.f21599a.length == 0;
    }

    @Override // androidx.core.os.k
    public int size() {
        return this.f21599a.length;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        int i6 = 0;
        while (true) {
            java.util.Locale[] localeArr = this.f21599a;
            if (i6 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i6]);
            if (i6 < this.f21599a.length - 1) {
                sb.append(',');
            }
            i6++;
        }
    }
}
