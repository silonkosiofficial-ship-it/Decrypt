package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends S8.s {
    private static final p237x7.l f(final java.lang.String str) {
        return str.length() == 0 ? new p237x7.l() { // from class: S8.u
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return S8.w.g((java.lang.String) obj);
            }
        } : new p237x7.l() { // from class: S8.v
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return S8.w.h(str, (java.lang.String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String g(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "line");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String h(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str2, "line");
        return str + str2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int i(java.lang.String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            if (!S8.AbstractC1628a.c(str.charAt(i6))) {
                if (i6 == -1) {
                    return str.length();
                }
                return i6;
            }
            i6++;
        }
        i6 = -1;
        if (i6 == -1) {
            return str.length();
        }
        return i6;
    }

    public static final java.lang.String j(java.lang.String str, final java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "indent");
        return R8.k.E(R8.k.G(S8.H.y0(str), new p237x7.l() { // from class: S8.t
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return S8.w.l(str2, (java.lang.String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ java.lang.String k(java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str2 = "    ";
        }
        return j(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String l(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str2, "it");
        if (S8.r.s0(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    public static final java.lang.String m(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "newIndent");
        java.util.List listZ0 = S8.r.z0(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listZ0) {
            if (!S8.r.s0((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(i((java.lang.String) it.next())));
        }
        java.lang.Integer num = (java.lang.Integer) p097j7.AbstractC6879v.x0(arrayList2);
        int i6 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listZ0.size());
        p237x7.l lVarF = f(str2);
        int iO = p097j7.AbstractC6879v.o(listZ0);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listZ0) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            java.lang.String str4 = (java.lang.String) obj2;
            if ((i6 == 0 || i6 == iO) && S8.r.s0(str4)) {
                str4 = null;
            } else {
                java.lang.String strW1 = S8.r.w1(str4, iIntValue);
                if (strW1 != null && (str3 = (java.lang.String) lVarF.l(strW1)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i6 = i10;
        }
        return ((java.lang.StringBuilder) p097j7.G.o0(arrayList3, new java.lang.StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final java.lang.String n(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i6;
        java.lang.String str4;
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "newIndent");
        p247y7.AbstractC7350t.f(str3, "marginPrefix");
        if (!(!S8.r.s0(str3))) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        java.util.List listZ0 = S8.r.z0(str);
        int length = str.length() + (str2.length() * listZ0.size());
        p237x7.l lVarF = f(str2);
        int iO = p097j7.AbstractC6879v.o(listZ0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i10 = 0;
        for (java.lang.Object obj : listZ0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p097j7.AbstractC6879v.w();
            }
            java.lang.String str5 = (java.lang.String) obj;
            java.lang.String strSubstring = null;
            if ((i10 == 0 || i10 == iO) && S8.r.s0(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!S8.AbstractC1628a.c(str5.charAt(i12))) {
                        i6 = i12;
                        break;
                    }
                    i12++;
                }
                if (i6 != -1) {
                    int i13 = i6;
                    if (S8.r.U(str5, str3, i6, false, 4, null)) {
                        int length3 = i13 + str3.length();
                        p247y7.AbstractC7350t.d(str5, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str5.substring(length3);
                        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str4 = (java.lang.String) lVarF.l(strSubstring)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i10 = i11;
        }
        return ((java.lang.StringBuilder) p097j7.G.o0(arrayList, new java.lang.StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static java.lang.String o(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return m(str, "");
    }

    public static final java.lang.String p(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "marginPrefix");
        return n(str, "", str2);
    }

    public static /* synthetic */ java.lang.String q(java.lang.String str, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str2 = "|";
        }
        return p(str, str2);
    }
}
