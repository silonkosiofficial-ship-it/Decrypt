package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final H9.t.b f4807D = new H9.t.b(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String[] f4808C;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f4809a = new java.util.ArrayList(20);

        public final H9.t.a a(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            H9.t.b bVar = H9.t.f4807D;
            bVar.d(str);
            bVar.e(str2, str);
            c(str, str2);
            return this;
        }

        public final H9.t.a b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "line");
            int iO0 = S8.r.o0(str, ':', 1, false, 4, null);
            if (iO0 != -1) {
                java.lang.String strSubstring = str.substring(0, iO0);
                p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                java.lang.String strSubstring2 = str.substring(iO0 + 1);
                p247y7.AbstractC7350t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    p247y7.AbstractC7350t.e(str, "this as java.lang.String).substring(startIndex)");
                }
                c("", str);
            }
            return this;
        }

        public final H9.t.a c(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            this.f4809a.add(str);
            this.f4809a.add(S8.r.u1(str2).toString());
            return this;
        }

        public final H9.t d() {
            return new H9.t((java.lang.String[]) this.f4809a.toArray(new java.lang.String[0]), null);
        }

        public final java.util.List e() {
            return this.f4809a;
        }

        public final H9.t.a f(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            int i6 = 0;
            while (i6 < this.f4809a.size()) {
                if (S8.r.K(str, (java.lang.String) this.f4809a.get(i6), true)) {
                    this.f4809a.remove(i6);
                    this.f4809a.remove(i6);
                    i6 -= 2;
                }
                i6 += 2;
            }
            return this;
        }

        public final H9.t.a g(java.lang.String str, java.lang.String str2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "value");
            H9.t.b bVar = H9.t.f4807D;
            bVar.d(str);
            bVar.e(str2, str);
            f(str);
            c(str, str2);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(java.lang.String str) {
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = str.charAt(i6);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new java.lang.IllegalArgumentException(I9.d.t("Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(cCharAt), java.lang.Integer.valueOf(i6), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(java.lang.String str, java.lang.String str2) {
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                char cCharAt = str.charAt(i6);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(I9.d.t("Unexpected char %#04x at %d in %s value", java.lang.Integer.valueOf(cCharAt), java.lang.Integer.valueOf(i6), str2));
                    sb.append(I9.d.G(str2) ? "" : ": " + str);
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String f(java.lang.String[] strArr, java.lang.String str) {
            int length = strArr.length - 2;
            int iB = p167q7.c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!S8.r.K(str, strArr[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public final H9.t g(java.lang.String... strArr) {
            p247y7.AbstractC7350t.f(strArr, "namesAndValues");
            if (strArr.length % 2 != 0) {
                throw new java.lang.IllegalArgumentException("Expected alternating header names and values".toString());
            }
            java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
            int length = strArr2.length;
            int i6 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                java.lang.String str = strArr2[i10];
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr2[i10] = S8.r.u1(str).toString();
            }
            int iB = p167q7.c.b(0, strArr2.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    java.lang.String str2 = strArr2[i6];
                    java.lang.String str3 = strArr2[i6 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i6 == iB) {
                        break;
                    }
                    i6 += 2;
                }
            }
            return new H9.t(strArr2, null);
        }
    }

    private t(java.lang.String[] strArr) {
        this.f4808C = strArr;
    }

    public /* synthetic */ t(java.lang.String[] strArr, p247y7.AbstractC7342k abstractC7342k) {
        this(strArr);
    }

    public final java.util.List C(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        int size = size();
        java.util.ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (S8.r.K(str, e(i6), true)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList(2);
                }
                arrayList.add(s(i6));
            }
        }
        if (arrayList == null) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
        p247y7.AbstractC7350t.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final java.lang.String d(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return f4807D.f(this.f4808C, str);
    }

    public final java.lang.String e(int i6) {
        return this.f4808C[i6 * 2];
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof H9.t) && java.util.Arrays.equals(this.f4808C, ((H9.t) obj).f4808C);
    }

    public final java.util.Set f() {
        java.util.TreeSet treeSet = new java.util.TreeSet(S8.r.L(p247y7.V.f57259a));
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            treeSet.add(e(i6));
        }
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(treeSet);
        p247y7.AbstractC7350t.e(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final H9.t.a g() {
        H9.t.a aVar = new H9.t.a();
        p097j7.AbstractC6879v.D(aVar.e(), this.f4808C);
        return aVar;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f4808C);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        int size = size();
        p087i7.u[] uVarArr = new p087i7.u[size];
        for (int i6 = 0; i6 < size; i6++) {
            uVarArr[i6] = p087i7.B.a(e(i6), s(i6));
        }
        return p247y7.AbstractC7334c.a(uVarArr);
    }

    public final java.util.Map o() {
        java.util.TreeMap treeMap = new java.util.TreeMap(S8.r.L(p247y7.V.f57259a));
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.String strE = e(i6);
            java.util.Locale locale = java.util.Locale.US;
            p247y7.AbstractC7350t.e(locale, "US");
            java.lang.String lowerCase = strE.toLowerCase(locale);
            p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            java.util.List arrayList = (java.util.List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(s(i6));
        }
        return treeMap;
    }

    public final java.lang.String s(int i6) {
        return this.f4808C[(i6 * 2) + 1];
    }

    public final int size() {
        return this.f4808C.length / 2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.String strE = e(i6);
            java.lang.String strS = s(i6);
            sb.append(strE);
            sb.append(": ");
            if (I9.d.G(strE)) {
                strS = "██";
            }
            sb.append(strS);
            sb.append("\n");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
