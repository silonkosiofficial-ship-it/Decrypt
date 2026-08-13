package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H9.m.a f4770j = new H9.m.a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.util.regex.Pattern f4771k = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.util.regex.Pattern f4772l = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.util.regex.Pattern f4773m = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final java.util.regex.Pattern f4774n = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f4778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f4779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f4782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f4783i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final int a(java.lang.String str, int i6, int i10, boolean z6) {
            while (i6 < i10) {
                char cCharAt = str.charAt(i6);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z6)) {
                    return i6;
                }
                i6++;
            }
            return i10;
        }

        private final boolean b(java.lang.String str, java.lang.String str2) {
            if (p247y7.AbstractC7350t.b(str, str2)) {
                return true;
            }
            return S8.r.J(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !I9.d.i(str);
        }

        private final java.lang.String f(java.lang.String str) {
            if (!(!S8.r.J(str, ".", false, 2, null))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.lang.String strE = I9.a.e(S8.r.J0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new java.lang.IllegalArgumentException();
        }

        private final long g(java.lang.String str, int i6, int i10) {
            int iA = a(str, i6, i10, false);
            java.util.regex.Matcher matcher = H9.m.f4774n.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iP0 = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(str, iA + 1, i10, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(H9.m.f4774n).matches()) {
                    java.lang.String strGroup = matcher.group(1);
                    p247y7.AbstractC7350t.e(strGroup, "matcher.group(1)");
                    i12 = java.lang.Integer.parseInt(strGroup);
                    java.lang.String strGroup2 = matcher.group(2);
                    p247y7.AbstractC7350t.e(strGroup2, "matcher.group(2)");
                    i14 = java.lang.Integer.parseInt(strGroup2);
                    java.lang.String strGroup3 = matcher.group(3);
                    p247y7.AbstractC7350t.e(strGroup3, "matcher.group(3)");
                    i15 = java.lang.Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(H9.m.f4773m).matches()) {
                    java.lang.String strGroup4 = matcher.group(1);
                    p247y7.AbstractC7350t.e(strGroup4, "matcher.group(1)");
                    i13 = java.lang.Integer.parseInt(strGroup4);
                } else if (iP0 == -1 && matcher.usePattern(H9.m.f4772l).matches()) {
                    java.lang.String strGroup5 = matcher.group(1);
                    p247y7.AbstractC7350t.e(strGroup5, "matcher.group(1)");
                    java.util.Locale locale = java.util.Locale.US;
                    p247y7.AbstractC7350t.e(locale, "US");
                    java.lang.String lowerCase = strGroup5.toLowerCase(locale);
                    p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    java.lang.String strPattern = H9.m.f4772l.pattern();
                    p247y7.AbstractC7350t.e(strPattern, "MONTH_PATTERN.pattern()");
                    iP0 = S8.r.p0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i11 == -1 && matcher.usePattern(H9.m.f4771k).matches()) {
                    java.lang.String strGroup6 = matcher.group(1);
                    p247y7.AbstractC7350t.e(strGroup6, "matcher.group(1)");
                    i11 = java.lang.Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i10, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (iP0 == -1) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i13 || i13 >= 32) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (i12 < 0 || i12 >= 24) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (i14 < 0 || i14 >= 60) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (i15 < 0 || i15 >= 60) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(I9.d.f5552f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iP0 - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(java.lang.String str) {
            try {
                long j6 = java.lang.Long.parseLong(str);
                if (j6 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j6;
            } catch (java.lang.NumberFormatException e6) {
                if (new S8.o("-?\\d+").d(str)) {
                    return S8.r.V(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e6;
            }
        }

        public final H9.m c(H9.u uVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(uVar, "url");
            p247y7.AbstractC7350t.f(str, "setCookie");
            return d(java.lang.System.currentTimeMillis(), uVar, str);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[PHI: r1
  0x00d7: PHI (r1v23 long) = (r1v7 long), (r1v11 long) binds: [B:42:0x00d5, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        public final H9.m d(long j6, H9.u uVar, java.lang.String str) {
            long j10;
            long j11;
            H9.m mVar;
            java.lang.String str2;
            java.lang.String str3;
            p247y7.AbstractC7350t.f(uVar, "url");
            p247y7.AbstractC7350t.f(str, "setCookie");
            int iR = I9.d.r(str, ';', 0, 0, 6, null);
            int iR2 = I9.d.r(str, '=', 0, iR, 2, null);
            if (iR2 == iR) {
                return null;
            }
            java.lang.String strY = I9.d.Y(str, 0, iR2, 1, null);
            if (strY.length() == 0 || I9.d.y(strY) != -1) {
                return null;
            }
            java.lang.String strX = I9.d.X(str, iR2 + 1, iR);
            if (I9.d.y(strX) != -1) {
                return null;
            }
            int i6 = iR + 1;
            int length = str.length();
            java.lang.String strF = null;
            java.lang.String str4 = null;
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i6 < length) {
                int iP = I9.d.p(str, ';', i6, length);
                int iP2 = I9.d.p(str, '=', i6, iP);
                java.lang.String strX2 = I9.d.X(str, i6, iP2);
                java.lang.String strX3 = iP2 < iP ? I9.d.X(str, iP2 + 1, iP) : "";
                if (S8.r.K(strX2, "expires", true)) {
                    try {
                        jG = g(strX3, 0, strX3.length());
                        z11 = true;
                    } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
                    }
                } else if (S8.r.K(strX2, "max-age", true)) {
                    jH = h(strX3);
                    z11 = true;
                } else if (S8.r.K(strX2, "domain", true)) {
                    strF = f(strX3);
                    z12 = false;
                } else if (S8.r.K(strX2, "path", true)) {
                    str4 = strX3;
                } else if (S8.r.K(strX2, "secure", true)) {
                    z6 = true;
                } else if (S8.r.K(strX2, "httponly", true)) {
                    z10 = true;
                }
                i6 = iP + 1;
            }
            long j12 = Long.MIN_VALUE;
            if (jH == Long.MIN_VALUE) {
                j10 = j12;
            } else if (jH != -1) {
                j12 = j6 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                if (j12 >= j6) {
                    j11 = 253402300799999L;
                    if (j12 <= 253402300799999L) {
                        j10 = j12;
                    }
                } else {
                    j11 = 253402300799999L;
                }
                j10 = j11;
            } else {
                j10 = jG;
            }
            java.lang.String strH = uVar.h();
            if (strF == null) {
                str2 = strH;
                mVar = null;
            } else {
                if (!b(strH, strF)) {
                    return null;
                }
                mVar = null;
                str2 = strF;
            }
            if (strH.length() != str2.length() && okhttp3.internal.publicsuffix.PublicSuffixDatabase.f52598e.c().c(str2) == null) {
                return mVar;
            }
            java.lang.String strSubstring = "/";
            java.lang.String str5 = str4;
            if (str5 == null || !S8.r.V(str5, "/", false, 2, mVar)) {
                java.lang.String strD = uVar.d();
                int iV0 = S8.r.v0(strD, '/', 0, false, 6, null);
                if (iV0 != 0) {
                    strSubstring = strD.substring(0, iV0);
                    p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str3 = strSubstring;
            } else {
                str3 = str5;
            }
            return new H9.m(strY, strX, j10, str2, str3, z6, z10, z11, z12, null);
        }

        public final java.util.List e(H9.u uVar, H9.t tVar) {
            p247y7.AbstractC7350t.f(uVar, "url");
            p247y7.AbstractC7350t.f(tVar, "headers");
            java.util.List listC = tVar.C("Set-Cookie");
            int size = listC.size();
            java.util.ArrayList arrayList = null;
            for (int i6 = 0; i6 < size; i6++) {
                H9.m mVarC = c(uVar, (java.lang.String) listC.get(i6));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return p097j7.AbstractC6879v.m();
            }
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
            p247y7.AbstractC7350t.e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private m(java.lang.String str, java.lang.String str2, long j6, java.lang.String str3, java.lang.String str4, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f4775a = str;
        this.f4776b = str2;
        this.f4777c = j6;
        this.f4778d = str3;
        this.f4779e = str4;
        this.f4780f = z6;
        this.f4781g = z10;
        this.f4782h = z11;
        this.f4783i = z12;
    }

    public /* synthetic */ m(java.lang.String str, java.lang.String str2, long j6, java.lang.String str3, java.lang.String str4, boolean z6, boolean z10, boolean z11, boolean z12, p247y7.AbstractC7342k abstractC7342k) {
        this(str, str2, j6, str3, str4, z6, z10, z11, z12);
    }

    public final java.lang.String e() {
        return this.f4775a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.m) {
            H9.m mVar = (H9.m) obj;
            if (p247y7.AbstractC7350t.b(mVar.f4775a, this.f4775a) && p247y7.AbstractC7350t.b(mVar.f4776b, this.f4776b) && mVar.f4777c == this.f4777c && p247y7.AbstractC7350t.b(mVar.f4778d, this.f4778d) && p247y7.AbstractC7350t.b(mVar.f4779e, this.f4779e) && mVar.f4780f == this.f4780f && mVar.f4781g == this.f4781g && mVar.f4782h == this.f4782h && mVar.f4783i == this.f4783i) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String f(boolean z6) {
        java.lang.String strB;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f4775a);
        sb.append('=');
        sb.append(this.f4776b);
        if (this.f4782h) {
            if (this.f4777c == Long.MIN_VALUE) {
                strB = "; max-age=0";
            } else {
                sb.append("; expires=");
                strB = N9.c.b(new java.util.Date(this.f4777c));
            }
            sb.append(strB);
        }
        if (!this.f4783i) {
            sb.append("; domain=");
            if (z6) {
                sb.append(".");
            }
            sb.append(this.f4778d);
        }
        sb.append("; path=");
        sb.append(this.f4779e);
        if (this.f4780f) {
            sb.append("; secure");
        }
        if (this.f4781g) {
            sb.append("; httponly");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString()");
        return string;
    }

    public final java.lang.String g() {
        return this.f4776b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f4775a.hashCode()) * 31) + this.f4776b.hashCode()) * 31) + p170r.r.a(this.f4777c)) * 31) + this.f4778d.hashCode()) * 31) + this.f4779e.hashCode()) * 31) + p190t.h.a(this.f4780f)) * 31) + p190t.h.a(this.f4781g)) * 31) + p190t.h.a(this.f4782h)) * 31) + p190t.h.a(this.f4783i);
    }

    public java.lang.String toString() {
        return f(false);
    }
}
