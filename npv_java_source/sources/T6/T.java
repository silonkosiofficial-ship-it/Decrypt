package T6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.List f13072a = p097j7.AbstractC6879v.e("");

    private static final int b(java.lang.String str, int i6, int i10, char c6) {
        int i11 = 0;
        while (true) {
            int i12 = i6 + i11;
            if (i12 >= i10 || str.charAt(i12) != c6) {
                break;
            }
            i11++;
        }
        return i11;
    }

    private static final void c(T6.M m6, java.lang.String str, int i6, int i10) {
        int i11;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(f(str, i6, i10));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i10;
        java.lang.String strSubstring = str.substring(i6, iIntValue);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        m6.x(strSubstring);
        int i12 = iIntValue + 1;
        if (i12 < i10) {
            java.lang.String strSubstring2 = str.substring(i12, i10);
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            i11 = java.lang.Integer.parseInt(strSubstring2);
        } else {
            i11 = 0;
        }
        m6.y(i11);
    }

    private static final int d(java.lang.String str, int i6, int i10) {
        int i11;
        int i12;
        char cCharAt = str.charAt(i6);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i11 = i6;
            i12 = i11;
        } else {
            i11 = i6;
            i12 = -1;
        }
        while (i11 < i10) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 == ':') {
                if (i12 == -1) {
                    return i11 - i6;
                }
                throw new java.lang.IllegalArgumentException("Illegal character in scheme at position " + i12);
            }
            if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                break;
            }
            if (i12 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                i12 = i11;
            }
            i11++;
        }
        return -1;
    }

    public static final java.util.List e() {
        return f13072a;
    }

    private static final int f(java.lang.String str, int i6, int i10) {
        boolean z6 = false;
        while (i6 < i10) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z6 = true;
                } else if (cCharAt == ']') {
                    z6 = false;
                }
            } else if (!z6) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private static final void g(T6.M m6, java.lang.String str, int i6, int i10, int i11) {
        java.lang.String strSubstring;
        if (i11 == 2) {
            int iO0 = S8.r.o0(str, '/', i6, false, 4, null);
            if (iO0 == -1 || iO0 == i10) {
                java.lang.String strSubstring2 = str.substring(i6, i10);
                p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                m6.x(strSubstring2);
                return;
            } else {
                java.lang.String strSubstring3 = str.substring(i6, iO0);
                p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                m6.x(strSubstring3);
                strSubstring = str.substring(iO0, i10);
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            }
        } else {
            if (i11 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid file url: " + str);
            }
            m6.x("");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('/');
            java.lang.String strSubstring4 = str.substring(i6, i10);
            p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
            sb.append(strSubstring4);
            strSubstring = sb.toString();
        }
        T6.O.j(m6, strSubstring);
    }

    private static final void h(T6.M m6, java.lang.String str, int i6, int i10) {
        if (i6 >= i10 || str.charAt(i6) != '#') {
            return;
        }
        java.lang.String strSubstring = str.substring(i6 + 1, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        m6.s(strSubstring);
    }

    private static final void i(T6.M m6, java.lang.String str, int i6, int i10) {
        int iP0 = S8.r.p0(str, "@", i6, false, 4, null);
        if (iP0 == -1) {
            throw new java.lang.IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        java.lang.String strSubstring = str.substring(i6, iP0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        m6.C(T6.AbstractC1658f.i(strSubstring, 0, 0, null, 7, null));
        java.lang.String strSubstring2 = str.substring(iP0 + 1, i10);
        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
        m6.x(strSubstring2);
    }

    private static final int j(final T6.M m6, java.lang.String str, int i6, int i10) {
        int i11 = i6 + 1;
        if (i11 == i10) {
            m6.B(true);
            return i10;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(S8.r.o0(str, '#', i11, false, 4, null));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i10 = numValueOf.intValue();
        }
        java.lang.String strSubstring = str.substring(i11, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        T6.L.d(strSubstring, 0, 0, false, 6, null).e(new p237x7.p() { // from class: T6.S
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return T6.T.k(m6, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M k(T6.M m6, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(list, "values");
        m6.e().d(str, list);
        return p087i7.M.f46721a;
    }

    public static final T6.M l(T6.M m6, java.lang.String str) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(str, "urlString");
        if (S8.r.s0(str)) {
            return m6;
        }
        try {
            return m(m6, str);
        } catch (java.lang.Throwable th) {
            throw new T6.Q(str, th);
        }
    }

    public static final T6.M m(T6.M m6, java.lang.String str) {
        int i6;
        int i10;
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(str, "urlString");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!S8.AbstractC1628a.c(str.charAt(i11))) {
                break;
            }
            i11++;
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            i6 = -1;
            break;
        }
        while (true) {
            int i12 = length2 - 1;
            if (!S8.AbstractC1628a.c(str.charAt(length2))) {
                i6 = length2;
                break;
            }
            if (i12 < 0) {
                i6 = -1;
                break;
            }
            length2 = i12;
        }
        int i13 = i6 + 1;
        int iD = d(str, i11, i13);
        if (iD > 0) {
            java.lang.String strSubstring = str.substring(i11, i11 + iD);
            p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            m6.z(T6.U.f13073c.a(strSubstring));
            i11 += iD + 1;
        }
        int iB = b(str, i11, i13, '/');
        int iIntValue = i11 + iB;
        if (p247y7.AbstractC7350t.b(m6.o().d(), "file")) {
            g(m6, str, iIntValue, i13, iB);
            return m6;
        }
        if (p247y7.AbstractC7350t.b(m6.o().d(), "mailto")) {
            if (iB != 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            i(m6, str, iIntValue, i13);
            return m6;
        }
        if (p247y7.AbstractC7350t.b(m6.o().d(), "about")) {
            if (iB != 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.lang.String strSubstring2 = str.substring(iIntValue, i13);
            p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            m6.x(strSubstring2);
            return m6;
        }
        if (iB >= 2) {
            int i14 = iIntValue;
            while (true) {
                i10 = i14;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(S8.r.r0(str, W6.m.b("@/\\?#"), i14, false, 4, null));
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i13;
                if (iIntValue >= i13 || str.charAt(iIntValue) != '@') {
                    break;
                }
                int iF = f(str, i10, iIntValue);
                if (iF != -1) {
                    java.lang.String strSubstring3 = str.substring(i10, iF);
                    p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                    m6.w(strSubstring3);
                    java.lang.String strSubstring4 = str.substring(iF + 1, iIntValue);
                    p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
                    m6.u(strSubstring4);
                } else {
                    java.lang.String strSubstring5 = str.substring(i10, iIntValue);
                    p247y7.AbstractC7350t.e(strSubstring5, "substring(...)");
                    m6.w(strSubstring5);
                }
                i14 = iIntValue + 1;
            }
            c(m6, str, i10, iIntValue);
        }
        int iJ = iIntValue;
        if (iJ >= i13) {
            m6.v(str.charAt(i6) == '/' ? f13072a : p097j7.AbstractC6879v.m());
            return m6;
        }
        m6.v(iB == 0 ? p097j7.AbstractC6879v.d0(m6.g(), 1) : p097j7.AbstractC6879v.m());
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(S8.r.r0(str, W6.m.b("?#"), iJ, false, 4, null));
        java.lang.Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        int iIntValue2 = num != null ? num.intValue() : i13;
        if (iIntValue2 > iJ) {
            java.lang.String strSubstring6 = str.substring(iJ, iIntValue2);
            p247y7.AbstractC7350t.e(strSubstring6, "substring(...)");
            m6.v(p097j7.AbstractC6879v.C0((m6.g().size() == 1 && ((java.lang.CharSequence) p097j7.AbstractC6879v.i0(m6.g())).length() == 0) ? p097j7.AbstractC6879v.m() : m6.g(), p097j7.AbstractC6879v.C0(iB == 1 ? f13072a : p097j7.AbstractC6879v.m(), p247y7.AbstractC7350t.b(strSubstring6, "/") ? f13072a : S8.r.S0(strSubstring6, new char[]{'/'}, false, 0, 6, null))));
            iJ = iIntValue2;
        }
        if (iJ < i13 && str.charAt(iJ) == '?') {
            iJ = j(m6, str, iJ, i13);
        }
        h(m6, str, iJ, i13);
        return m6;
    }
}
