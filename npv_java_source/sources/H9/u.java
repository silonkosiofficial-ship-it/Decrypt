package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H9.u.b f4810k = new H9.u.b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f4811l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f4814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f4815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f4817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f4818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f4819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f4820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f4821j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final H9.u.a.C0112a f4822i = new H9.u.a.C0112a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f4823a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f4826d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.util.List f4828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.util.List f4829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String f4830h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f4824b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f4825c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4827e = -1;

        /* JADX INFO: renamed from: H9.u$a$a, reason: collision with other inner class name */
        public static final class C0112a {
            private C0112a() {
            }

            public /* synthetic */ C0112a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(java.lang.String str, int i6, int i10) {
                try {
                    int i11 = java.lang.Integer.parseInt(H9.u.b.b(H9.u.f4810k, str, i6, i10, "", false, false, false, false, null, 248, null));
                    if (1 > i11 || i11 >= 65536) {
                        return -1;
                    }
                    return i11;
                } catch (java.lang.NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(java.lang.String str, int i6, int i10) {
                while (i6 < i10) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '[') {
                        do {
                            i6++;
                            if (i6 >= i10) {
                                break;
                            }
                        } while (str.charAt(i6) != ']');
                    } else if (cCharAt == ':') {
                        return i6;
                    }
                    i6++;
                }
                return i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(java.lang.String str, int i6, int i10) {
                if (i10 - i6 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i6);
                if ((p247y7.AbstractC7350t.g(cCharAt, 97) < 0 || p247y7.AbstractC7350t.g(cCharAt, 122) > 0) && (p247y7.AbstractC7350t.g(cCharAt, 65) < 0 || p247y7.AbstractC7350t.g(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i6++;
                    if (i6 >= i10) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i6);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i6;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(java.lang.String str, int i6, int i10) {
                int i11 = 0;
                while (i6 < i10) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i6++;
                }
                return i11;
            }
        }

        public a() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f4828f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i6 = this.f4827e;
            if (i6 != -1) {
                return i6;
            }
            H9.u.b bVar = H9.u.f4810k;
            java.lang.String str = this.f4823a;
            p247y7.AbstractC7350t.c(str);
            return bVar.c(str);
        }

        private final boolean f(java.lang.String str) {
            return p247y7.AbstractC7350t.b(str, ".") || S8.r.K(str, "%2e", true);
        }

        private final boolean g(java.lang.String str) {
            return p247y7.AbstractC7350t.b(str, "..") || S8.r.K(str, "%2e.", true) || S8.r.K(str, ".%2e", true) || S8.r.K(str, "%2e%2e", true);
        }

        private final void j() {
            java.util.List list = this.f4828f;
            if (((java.lang.String) list.remove(list.size() - 1)).length() != 0 || !(!this.f4828f.isEmpty())) {
                this.f4828f.add("");
            } else {
                java.util.List list2 = this.f4828f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void l(java.lang.String str, int i6, int i10, boolean z6, boolean z10) {
            java.lang.String strB = H9.u.b.b(H9.u.f4810k, str, i6, i10, " \"<>^`{}|/\\?#", z10, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            java.util.List list = this.f4828f;
            if (((java.lang.CharSequence) list.get(list.size() - 1)).length() == 0) {
                java.util.List list2 = this.f4828f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f4828f.add(strB);
            }
            if (z6) {
                this.f4828f.add("");
            }
        }

        private final void n(java.lang.String str, int i6, int i10) {
            if (i6 == i10) {
                return;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f4828f.clear();
                this.f4828f.add("");
                i6++;
            } else {
                java.util.List list = this.f4828f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i11 = i6;
                while (i11 < i10) {
                    i6 = I9.d.q(str, "/\\", i11, i10);
                    boolean z6 = i6 < i10;
                    l(str, i11, i6, z6, true);
                    if (z6) {
                        i11 = i6 + 1;
                    }
                }
                return;
            }
        }

        public final H9.u a() {
            java.util.ArrayList arrayList;
            java.lang.String str = this.f4823a;
            if (str == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            H9.u.b bVar = H9.u.f4810k;
            java.lang.String strG = H9.u.b.g(bVar, this.f4824b, 0, 0, false, 7, null);
            java.lang.String strG2 = H9.u.b.g(bVar, this.f4825c, 0, 0, false, 7, null);
            java.lang.String str2 = this.f4826d;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            int iB = b();
            java.util.List list = this.f4828f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(H9.u.b.g(H9.u.f4810k, (java.lang.String) it.next(), 0, 0, false, 7, null));
            }
            java.util.List list2 = this.f4829g;
            if (list2 != null) {
                java.util.List<java.lang.String> list3 = list2;
                arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
                for (java.lang.String str3 : list3) {
                    arrayList.add(str3 != null ? H9.u.b.g(H9.u.f4810k, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            java.lang.String str4 = this.f4830h;
            return new H9.u(str, strG, strG2, str2, iB, arrayList2, arrayList, str4 != null ? H9.u.b.g(H9.u.f4810k, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        public final H9.u.a c(java.lang.String str) {
            java.util.List listI;
            if (str != null) {
                H9.u.b bVar = H9.u.f4810k;
                java.lang.String strB = H9.u.b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (strB != null) {
                    listI = bVar.i(strB);
                } else {
                    listI = null;
                }
            } else {
                listI = null;
            }
            this.f4829g = listI;
            return this;
        }

        public final java.util.List d() {
            return this.f4828f;
        }

        public final H9.u.a e(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "host");
            java.lang.String strE = I9.a.e(H9.u.b.g(H9.u.f4810k, str, 0, 0, false, 7, null));
            if (strE != null) {
                this.f4826d = strE;
                return this;
            }
            throw new java.lang.IllegalArgumentException("unexpected host: " + str);
        }

        public final H9.u.a h(H9.u uVar, java.lang.String str) {
            int iQ;
            int i6;
            int i10;
            boolean z6;
            boolean z10;
            java.lang.String str2 = str;
            p247y7.AbstractC7350t.f(str2, "input");
            int iA = I9.d.A(str2, 0, 0, 3, null);
            int iC = I9.d.C(str2, iA, 0, 2, null);
            H9.u.a.C0112a c0112a = f4822i;
            int iG = c0112a.g(str2, iA, iC);
            boolean z11 = true;
            byte b6 = -1;
            if (iG != -1) {
                if (S8.r.S(str2, "https:", iA, true)) {
                    this.f4823a = "https";
                    iA += 6;
                } else {
                    if (!S8.r.S(str2, "http:", iA, true)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        java.lang.String strSubstring = str2.substring(0, iG);
                        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    this.f4823a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (str.length() > 6) {
                        str2 = S8.r.B1(str2, 6) + "...";
                    }
                    throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f4823a = uVar.p();
            }
            int iH = c0112a.h(str2, iA, iC);
            byte b10 = 63;
            byte b11 = 35;
            if (iH >= 2 || uVar == null || !p247y7.AbstractC7350t.b(uVar.p(), this.f4823a)) {
                boolean z12 = false;
                boolean z13 = false;
                int i11 = iA + iH;
                while (true) {
                    iQ = I9.d.q(str2, "@/\\?#", i11, iC);
                    byte bCharAt = iQ != iC ? str2.charAt(iQ) : b6;
                    if (bCharAt == b6 || bCharAt == b11 || bCharAt == 47 || bCharAt == 92 || bCharAt == b10) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            i10 = iQ;
                            z6 = z11;
                            this.f4825c += "%40" + H9.u.b.b(H9.u.f4810k, str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int iP = I9.d.p(str2, ':', i11, iQ);
                            H9.u.b bVar = H9.u.f4810k;
                            z6 = z11;
                            java.lang.String strB = H9.u.b.b(bVar, str, i11, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strB = this.f4824b + "%40" + strB;
                            }
                            this.f4824b = strB;
                            i10 = iQ;
                            if (iP != i10) {
                                this.f4825c = H9.u.b.b(bVar, str, iP + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z10 = z6;
                            } else {
                                z10 = z12;
                            }
                            z12 = z10;
                            z13 = z6;
                        }
                        i11 = i10 + 1;
                        z11 = z6;
                        iC = iC;
                        b11 = 35;
                        b10 = 63;
                        b6 = -1;
                    }
                }
                i6 = iC;
                H9.u.a.C0112a c0112a2 = f4822i;
                int iF = c0112a2.f(str2, i11, iQ);
                int i12 = iF + 1;
                if (i12 < iQ) {
                    this.f4826d = I9.a.e(H9.u.b.g(H9.u.f4810k, str, i11, iF, false, 4, null));
                    int iE = c0112a2.e(str2, i12, iQ);
                    this.f4827e = iE;
                    if (iE == -1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("Invalid URL port: \"");
                        java.lang.String strSubstring2 = str2.substring(i12, iQ);
                        p247y7.AbstractC7350t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring2);
                        sb2.append('\"');
                        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                    }
                } else {
                    H9.u.b bVar2 = H9.u.f4810k;
                    this.f4826d = I9.a.e(H9.u.b.g(bVar2, str, i11, iF, false, 4, null));
                    java.lang.String str3 = this.f4823a;
                    p247y7.AbstractC7350t.c(str3);
                    this.f4827e = bVar2.c(str3);
                }
                if (this.f4826d == null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append("Invalid URL host: \"");
                    java.lang.String strSubstring3 = str2.substring(i11, iF);
                    p247y7.AbstractC7350t.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(strSubstring3);
                    sb3.append('\"');
                    throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                }
                iA = iQ;
            } else {
                this.f4824b = uVar.g();
                this.f4825c = uVar.c();
                this.f4826d = uVar.h();
                this.f4827e = uVar.l();
                this.f4828f.clear();
                this.f4828f.addAll(uVar.e());
                if (iA == iC || str2.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i6 = iC;
            }
            int i13 = i6;
            int iQ2 = I9.d.q(str2, "?#", iA, i13);
            n(str2, iA, iQ2);
            if (iQ2 < i13 && str2.charAt(iQ2) == '?') {
                int iP2 = I9.d.p(str2, '#', iQ2, i13);
                H9.u.b bVar3 = H9.u.f4810k;
                this.f4829g = bVar3.i(H9.u.b.b(bVar3, str, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                iQ2 = iP2;
            }
            if (iQ2 < i13 && str2.charAt(iQ2) == '#') {
                this.f4830h = H9.u.b.b(H9.u.f4810k, str, iQ2 + 1, i13, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final H9.u.a i(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "password");
            this.f4825c = H9.u.b.b(H9.u.f4810k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final H9.u.a k(int i6) {
            if (1 <= i6 && i6 < 65536) {
                this.f4827e = i6;
                return this;
            }
            throw new java.lang.IllegalArgumentException(("unexpected port: " + i6).toString());
        }

        public final H9.u.a m() {
            java.lang.String str = this.f4826d;
            this.f4826d = str != null ? new S8.o("[\"<>^`{|}]").e(str, "") : null;
            int size = this.f4828f.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.util.List list = this.f4828f;
                list.set(i6, H9.u.b.b(H9.u.f4810k, (java.lang.String) list.get(i6), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            java.util.List list2 = this.f4829g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    java.lang.String str2 = (java.lang.String) list2.get(i10);
                    list2.set(i10, str2 != null ? H9.u.b.b(H9.u.f4810k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            java.lang.String str3 = this.f4830h;
            this.f4830h = str3 != null ? H9.u.b.b(H9.u.f4810k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final H9.u.a o(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "scheme");
            java.lang.String str2 = "http";
            if (!S8.r.K(str, "http", true)) {
                str2 = "https";
                if (!S8.r.K(str, "https", true)) {
                    throw new java.lang.IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f4823a = str2;
            return this;
        }

        public final void p(java.lang.String str) {
            this.f4830h = str;
        }

        public final void q(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<set-?>");
            this.f4825c = str;
        }

        public final void r(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<set-?>");
            this.f4824b = str;
        }

        public final void s(java.lang.String str) {
            this.f4826d = str;
        }

        public final void t(int i6) {
            this.f4827e = i6;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0083  */
        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str2 = this.f4823a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (this.f4824b.length() > 0 || this.f4825c.length() > 0) {
                sb.append(this.f4824b);
                if (this.f4825c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f4825c);
                }
                sb.append('@');
            }
            java.lang.String str3 = this.f4826d;
            if (str3 != null) {
                p247y7.AbstractC7350t.c(str3);
                if (S8.r.b0(str3, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f4826d);
                    sb.append(']');
                } else {
                    sb.append(this.f4826d);
                }
            }
            if (this.f4827e != -1 || this.f4823a != null) {
                int iB = b();
                java.lang.String str4 = this.f4823a;
                if (str4 != null) {
                    H9.u.b bVar = H9.u.f4810k;
                    p247y7.AbstractC7350t.c(str4);
                    if (iB != bVar.c(str4)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                } else {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            H9.u.b bVar2 = H9.u.f4810k;
            bVar2.h(this.f4828f, sb);
            if (this.f4829g != null) {
                sb.append('?');
                java.util.List list = this.f4829g;
                p247y7.AbstractC7350t.c(list);
                bVar2.j(list, sb);
            }
            if (this.f4830h != null) {
                sb.append('#');
                sb.append(this.f4830h);
            }
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(java.lang.String str) {
            this.f4823a = str;
        }

        public final H9.u.a v(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "username");
            this.f4824b = H9.u.b.b(H9.u.f4810k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ java.lang.String b(H9.u.b bVar, java.lang.String str, int i6, int i10, java.lang.String str2, boolean z6, boolean z10, boolean z11, boolean z12, java.nio.charset.Charset charset, int i11, java.lang.Object obj) {
            return bVar.a(str, (i11 & 1) != 0 ? 0 : i6, (i11 & 2) != 0 ? str.length() : i10, str2, (i11 & 8) != 0 ? false : z6, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : charset);
        }

        private final boolean e(java.lang.String str, int i6, int i10) {
            int i11 = i6 + 2;
            return i11 < i10 && str.charAt(i6) == '%' && I9.d.H(str.charAt(i6 + 1)) != -1 && I9.d.H(str.charAt(i11)) != -1;
        }

        public static /* synthetic */ java.lang.String g(H9.u.b bVar, java.lang.String str, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
            if ((i11 & 1) != 0) {
                i6 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z6 = false;
            }
            return bVar.f(str, i6, i10, z6);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0067  */
        /* JADX WARN: Code duplicated, block: B:40:0x0069  */
        /* JADX WARN: Code duplicated, block: B:43:0x0071  */
        /* JADX WARN: Code duplicated, block: B:49:0x008a  */
        /* JADX WARN: Code duplicated, block: B:52:0x0093 A[LOOP:1: B:50:0x008d->B:52:0x0093, LOOP_END] */
        private final void k(X9.C1836d c1836d, java.lang.String str, int i6, int i10, java.lang.String str2, boolean z6, boolean z10, boolean z11, boolean z12, java.nio.charset.Charset charset) throws java.io.EOFException {
            int iCharCount = i6;
            X9.C1836d c1836d2 = null;
            while (iCharCount < i10) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z6 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        c1836d.t0(z6 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || S8.r.b0(str2, (char) iCodePointAt, false, 2, null))) {
                        if (c1836d2 == null) {
                            c1836d2 = new X9.C1836d();
                        }
                        if (charset != null || p247y7.AbstractC7350t.b(charset, java.nio.charset.StandardCharsets.UTF_8)) {
                            c1836d2.D1(iCodePointAt);
                        } else {
                            c1836d2.A1(str, iCharCount, java.lang.Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c1836d2.j()) {
                            byte bM = c1836d2.m();
                            c1836d.U(37);
                            c1836d.U(H9.u.f4811l[((bM & 255) >> 4) & 15]);
                            c1836d.U(H9.u.f4811l[bM & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z6) {
                                if (z10) {
                                    if (!e(str, iCharCount, i10)) {
                                    }
                                }
                            }
                            if (c1836d2 == null) {
                                c1836d2 = new X9.C1836d();
                            }
                            if (charset != null) {
                                c1836d2.D1(iCodePointAt);
                            } else {
                                c1836d2.D1(iCodePointAt);
                            }
                            while (!c1836d2.j()) {
                                byte bM2 = c1836d2.m();
                                c1836d.U(37);
                                c1836d.U(H9.u.f4811l[((bM2 & 255) >> 4) & 15]);
                                c1836d.U(H9.u.f4811l[bM2 & 15]);
                            }
                        }
                        c1836d.D1(iCodePointAt);
                    }
                }
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            }
        }

        private final void l(X9.C1836d c1836d, java.lang.String str, int i6, int i10, boolean z6) {
            int i11;
            while (i6 < i10) {
                int iCodePointAt = str.codePointAt(i6);
                if (iCodePointAt == 37 && (i11 = i6 + 2) < i10) {
                    int iH = I9.d.H(str.charAt(i6 + 1));
                    int iH2 = I9.d.H(str.charAt(i11));
                    if (iH == -1 || iH2 == -1) {
                        c1836d.D1(iCodePointAt);
                        i6 += java.lang.Character.charCount(iCodePointAt);
                    } else {
                        c1836d.U((iH << 4) + iH2);
                        i6 = java.lang.Character.charCount(iCodePointAt) + i11;
                    }
                } else if (iCodePointAt == 43 && z6) {
                    c1836d.U(32);
                    i6++;
                } else {
                    c1836d.D1(iCodePointAt);
                    i6 += java.lang.Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0041  */
        public final java.lang.String a(java.lang.String str, int i6, int i10, java.lang.String str2, boolean z6, boolean z10, boolean z11, boolean z12, java.nio.charset.Charset charset) throws java.io.EOFException {
            p247y7.AbstractC7350t.f(str, "<this>");
            p247y7.AbstractC7350t.f(str2, "encodeSet");
            int iCharCount = i6;
            while (true) {
                if (iCharCount >= i10) {
                    java.lang.String strSubstring = str.substring(i6, i10);
                    p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return strSubstring;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || S8.r.b0(str2, (char) iCodePointAt, false, 2, null))) {
                    break;
                }
                if (iCodePointAt == 37) {
                    if (!z6) {
                        break;
                    }
                    if (z10) {
                        if (e(str, iCharCount, i10)) {
                        }
                    }
                    if (iCodePointAt == 43) {
                    }
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                } else if (iCodePointAt == 43 || !z11) {
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
                X9.C1836d c1836d = new X9.C1836d();
                c1836d.C1(str, i6, iCharCount);
                k(c1836d, str, iCharCount, i10, str2, z6, z10, z11, z12, charset);
                return c1836d.Y0();
            }
            X9.C1836d c1836d2 = new X9.C1836d();
            c1836d2.C1(str, i6, iCharCount);
            k(c1836d2, str, iCharCount, i10, str2, z6, z10, z11, z12, charset);
            return c1836d2.Y0();
        }

        public final int c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "scheme");
            if (p247y7.AbstractC7350t.b(str, "http")) {
                return 80;
            }
            return p247y7.AbstractC7350t.b(str, "https") ? 443 : -1;
        }

        public final H9.u d(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "<this>");
            return new H9.u.a().h(null, str).a();
        }

        public final java.lang.String f(java.lang.String str, int i6, int i10, boolean z6) {
            p247y7.AbstractC7350t.f(str, "<this>");
            for (int i11 = i6; i11 < i10; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '%' || (cCharAt == '+' && z6)) {
                    X9.C1836d c1836d = new X9.C1836d();
                    c1836d.C1(str, i6, i11);
                    l(c1836d, str, i11, i10, z6);
                    return c1836d.Y0();
                }
            }
            java.lang.String strSubstring = str.substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(java.util.List list, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(list, "<this>");
            p247y7.AbstractC7350t.f(sb, "out");
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append('/');
                sb.append((java.lang.String) list.get(i6));
            }
        }

        public final java.util.List i(java.lang.String str) {
            java.lang.String strSubstring;
            p247y7.AbstractC7350t.f(str, "<this>");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i6 = 0;
            while (i6 <= str.length()) {
                int iO0 = S8.r.o0(str, '&', i6, false, 4, null);
                if (iO0 == -1) {
                    iO0 = str.length();
                }
                int i10 = iO0;
                int iO1 = S8.r.o0(str, '=', i6, false, 4, null);
                if (iO1 == -1 || iO1 > i10) {
                    java.lang.String strSubstring2 = str.substring(i6, i10);
                    p247y7.AbstractC7350t.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    strSubstring = null;
                } else {
                    java.lang.String strSubstring3 = str.substring(i6, iO1);
                    p247y7.AbstractC7350t.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                    strSubstring = str.substring(iO1 + 1, i10);
                    p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strSubstring);
                i6 = i10 + 1;
            }
            return arrayList;
        }

        public final void j(java.util.List list, java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(list, "<this>");
            p247y7.AbstractC7350t.f(sb, "out");
            E7.g gVarP = E7.j.p(E7.j.q(0, list.size()), 2);
            int iF = gVarP.f();
            int iG = gVarP.g();
            int iO = gVarP.o();
            if ((iO <= 0 || iF > iG) && (iO >= 0 || iG > iF)) {
                return;
            }
            while (true) {
                java.lang.String str = (java.lang.String) list.get(iF);
                java.lang.String str2 = (java.lang.String) list.get(iF + 1);
                if (iF > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (iF == iG) {
                    return;
                } else {
                    iF += iO;
                }
            }
        }
    }

    public u(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i6, java.util.List list, java.util.List list2, java.lang.String str5, java.lang.String str6) {
        p247y7.AbstractC7350t.f(str, "scheme");
        p247y7.AbstractC7350t.f(str2, "username");
        p247y7.AbstractC7350t.f(str3, "password");
        p247y7.AbstractC7350t.f(str4, "host");
        p247y7.AbstractC7350t.f(list, "pathSegments");
        p247y7.AbstractC7350t.f(str6, "url");
        this.f4812a = str;
        this.f4813b = str2;
        this.f4814c = str3;
        this.f4815d = str4;
        this.f4816e = i6;
        this.f4817f = list;
        this.f4818g = list2;
        this.f4819h = str5;
        this.f4820i = str6;
        this.f4821j = p247y7.AbstractC7350t.b(str, "https");
    }

    public final java.lang.String b() {
        if (this.f4819h == null) {
            return null;
        }
        java.lang.String strSubstring = this.f4820i.substring(S8.r.o0(this.f4820i, '#', 0, false, 6, null) + 1);
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final java.lang.String c() {
        if (this.f4814c.length() == 0) {
            return "";
        }
        java.lang.String strSubstring = this.f4820i.substring(S8.r.o0(this.f4820i, ':', this.f4812a.length() + 3, false, 4, null) + 1, S8.r.o0(this.f4820i, '@', 0, false, 6, null));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String d() {
        int iO0 = S8.r.o0(this.f4820i, '/', this.f4812a.length() + 3, false, 4, null);
        java.lang.String str = this.f4820i;
        java.lang.String strSubstring = this.f4820i.substring(iO0, I9.d.q(str, "?#", iO0, str.length()));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.util.List e() {
        int iO0 = S8.r.o0(this.f4820i, '/', this.f4812a.length() + 3, false, 4, null);
        java.lang.String str = this.f4820i;
        int iQ = I9.d.q(str, "?#", iO0, str.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iO0 < iQ) {
            int i6 = iO0 + 1;
            int iP = I9.d.p(this.f4820i, '/', i6, iQ);
            java.lang.String strSubstring = this.f4820i.substring(i6, iP);
            p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iO0 = iP;
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof H9.u) && p247y7.AbstractC7350t.b(((H9.u) obj).f4820i, this.f4820i);
    }

    public final java.lang.String f() {
        if (this.f4818g == null) {
            return null;
        }
        int iO0 = S8.r.o0(this.f4820i, '?', 0, false, 6, null) + 1;
        java.lang.String str = this.f4820i;
        java.lang.String strSubstring = this.f4820i.substring(iO0, I9.d.p(str, '#', iO0, str.length()));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String g() {
        if (this.f4813b.length() == 0) {
            return "";
        }
        int length = this.f4812a.length() + 3;
        java.lang.String str = this.f4820i;
        java.lang.String strSubstring = this.f4820i.substring(length, I9.d.q(str, ":@", length, str.length()));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String h() {
        return this.f4815d;
    }

    public int hashCode() {
        return this.f4820i.hashCode();
    }

    public final boolean i() {
        return this.f4821j;
    }

    public final H9.u.a j() {
        H9.u.a aVar = new H9.u.a();
        aVar.u(this.f4812a);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f4815d);
        aVar.t(this.f4816e != f4810k.c(this.f4812a) ? this.f4816e : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final H9.u.a k(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "link");
        try {
            return new H9.u.a().h(this, str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f4816e;
    }

    public final java.lang.String m() {
        if (this.f4818g == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        f4810k.j(this.f4818g, sb);
        return sb.toString();
    }

    public final java.lang.String n() {
        H9.u.a aVarK = k("/...");
        p247y7.AbstractC7350t.c(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final H9.u o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "link");
        H9.u.a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final java.lang.String p() {
        return this.f4812a;
    }

    public final java.net.URI q() {
        java.lang.String string = j().m().toString();
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e6) {
            try {
                java.net.URI uriCreate = java.net.URI.create(new S8.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").e(string, ""));
                p247y7.AbstractC7350t.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e6);
            }
        }
    }

    public final java.net.URL r() {
        try {
            return new java.net.URL(this.f4820i);
        } catch (java.net.MalformedURLException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    public java.lang.String toString() {
        return this.f4820i;
    }
}
