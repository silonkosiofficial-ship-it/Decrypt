package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H9.w.a f4831e = new H9.w.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.regex.Pattern f4832f = java.util.regex.Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.regex.Pattern f4833g = java.util.regex.Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f4836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String[] f4837d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final H9.w a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<this>");
            java.util.regex.Matcher matcher = H9.w.f4832f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new java.lang.IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            java.lang.String strGroup = matcher.group(1);
            p247y7.AbstractC7350t.e(strGroup, "typeSubtype.group(1)");
            java.util.Locale locale = java.util.Locale.US;
            p247y7.AbstractC7350t.e(locale, "US");
            java.lang.String lowerCase = strGroup.toLowerCase(locale);
            p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            java.lang.String strGroup2 = matcher.group(2);
            p247y7.AbstractC7350t.e(strGroup2, "typeSubtype.group(2)");
            p247y7.AbstractC7350t.e(locale, "US");
            java.lang.String lowerCase2 = strGroup2.toLowerCase(locale);
            p247y7.AbstractC7350t.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.regex.Matcher matcher2 = H9.w.f4833g.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    java.lang.String strSubstring = str.substring(iEnd);
                    p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                java.lang.String strGroup3 = matcher2.group(1);
                if (strGroup3 != null) {
                    java.lang.String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (S8.r.V(strGroup4, "'", false, 2, null) && S8.r.J(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        p247y7.AbstractC7350t.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            return new H9.w(str, lowerCase, lowerCase2, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null);
        }

        public final H9.w b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<this>");
            try {
                return a(str);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private w(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        this.f4834a = str;
        this.f4835b = str2;
        this.f4836c = str3;
        this.f4837d = strArr;
    }

    public /* synthetic */ w(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, p247y7.AbstractC7342k abstractC7342k) {
        this(str, str2, str3, strArr);
    }

    public final java.lang.String c() {
        return this.f4836c;
    }

    public final java.lang.String d() {
        return this.f4835b;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof H9.w) && p247y7.AbstractC7350t.b(((H9.w) obj).f4834a, this.f4834a);
    }

    public int hashCode() {
        return this.f4834a.hashCode();
    }

    public java.lang.String toString() {
        return this.f4834a;
    }
}
