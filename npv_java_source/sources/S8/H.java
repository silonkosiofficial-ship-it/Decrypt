package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H extends S8.D {

    public static final class a implements R8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.CharSequence f12622a;

        public a(java.lang.CharSequence charSequence) {
            this.f12622a = charSequence;
        }

        @Override // R8.h
        public java.util.Iterator iterator() {
            return new S8.C1636i(this.f12622a);
        }
    }

    public static final java.lang.CharSequence A0(java.lang.CharSequence charSequence, int i6, char c6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("Desired length " + i6 + " is less than zero.");
        }
        if (i6 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i6);
        int length = i6 - charSequence.length();
        int i10 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c6);
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static java.lang.String B0(java.lang.String str, int i6, char c6) {
        p247y7.AbstractC7350t.f(str, "<this>");
        return A0(str, i6, c6).toString();
    }

    private static final R8.h C0(java.lang.CharSequence charSequence, final char[] cArr, int i6, final boolean z6, int i10) {
        O0(i10);
        return new S8.C1632e(charSequence, i6, i10, new p237x7.p() { // from class: S8.F
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return S8.H.G0(cArr, z6, (java.lang.CharSequence) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    private static final R8.h D0(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i6, final boolean z6, int i10) {
        O0(i10);
        final java.util.List listD = p097j7.AbstractC6872n.d(strArr);
        return new S8.C1632e(charSequence, i6, i10, new p237x7.p() { // from class: S8.E
            @Override // p237x7.p
            public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                return S8.H.H0(listD, z6, (java.lang.CharSequence) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ R8.h E0(java.lang.CharSequence charSequence, char[] cArr, int i6, boolean z6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return C0(charSequence, cArr, i6, z6, i10);
    }

    static /* synthetic */ R8.h F0(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i6, boolean z6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return D0(charSequence, strArr, i6, z6, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.u G0(char[] cArr, boolean z6, java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "$this$DelimitedRangesSequence");
        int iQ0 = q0(charSequence, cArr, i6, z6);
        if (iQ0 < 0) {
            return null;
        }
        return p087i7.B.a(java.lang.Integer.valueOf(iQ0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.u H0(java.util.List list, boolean z6, java.lang.CharSequence charSequence, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "$this$DelimitedRangesSequence");
        p087i7.u uVarH0 = h0(charSequence, list, i6, z6, false);
        if (uVarH0 != null) {
            return p087i7.B.a(uVarH0.c(), java.lang.Integer.valueOf(((java.lang.String) uVarH0.d()).length()));
        }
        return null;
    }

    public static final boolean I0(java.lang.CharSequence charSequence, int i6, java.lang.CharSequence charSequence2, int i10, int i11, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "other");
        if (i10 < 0 || i6 < 0 || i6 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!S8.AbstractC1630c.d(charSequence.charAt(i6 + i12), charSequence2.charAt(i10 + i12), z6)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String J0(java.lang.String str, java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "prefix");
        if (!c1(str, charSequence, false, 2, null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(charSequence.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String K0(java.lang.String str, java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "suffix");
        if (!g0(str, charSequence, false, 2, null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, str.length() - charSequence.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String L0(java.lang.String str, java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "delimiter");
        return S8.r.M0(str, charSequence, charSequence);
    }

    public static java.lang.String M0(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(charSequence, "prefix");
        p247y7.AbstractC7350t.f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !c1(str, charSequence, false, 2, null) || !g0(str, charSequence2, false, 2, null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.CharSequence N0(java.lang.CharSequence charSequence, int i6, int i10, java.lang.CharSequence charSequence2) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "replacement");
        if (i10 >= i6) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(charSequence, 0, i6);
            p247y7.AbstractC7350t.e(sb, "append(...)");
            sb.append(charSequence2);
            sb.append(charSequence, i10, charSequence.length());
            p247y7.AbstractC7350t.e(sb, "append(...)");
            return sb;
        }
        throw new java.lang.IndexOutOfBoundsException("End index (" + i10 + ") is less than start index (" + i6 + ").");
    }

    public static final void O0(int i6) {
        if (i6 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Limit must be non-negative, but was " + i6).toString());
    }

    public static final java.util.List P0(java.lang.CharSequence charSequence, char[] cArr, boolean z6, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return R0(charSequence, java.lang.String.valueOf(cArr[0]), z6, i6);
        }
        java.lang.Iterable iterableT = R8.k.t(E0(charSequence, cArr, 0, z6, i6, 2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableT, 10));
        java.util.Iterator it = iterableT.iterator();
        while (it.hasNext()) {
            arrayList.add(d1(charSequence, (E7.i) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List Q0(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z6, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(strArr, "delimiters");
        if (strArr.length == 1) {
            java.lang.String str = strArr[0];
            if (str.length() != 0) {
                return R0(charSequence, str, z6, i6);
            }
        }
        java.lang.Iterable iterableT = R8.k.t(F0(charSequence, strArr, 0, z6, i6, 2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterableT, 10));
        java.util.Iterator it = iterableT.iterator();
        while (it.hasNext()) {
            arrayList.add(d1(charSequence, (E7.i) it.next()));
        }
        return arrayList;
    }

    private static final java.util.List R0(java.lang.CharSequence charSequence, java.lang.String str, boolean z6, int i6) {
        O0(i6);
        int length = 0;
        int iL0 = l0(charSequence, str, 0, z6);
        if (iL0 == -1 || i6 == 1) {
            return p097j7.AbstractC6879v.e(charSequence.toString());
        }
        boolean z10 = i6 > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(z10 ? E7.j.g(i6, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iL0).toString());
            length = str.length() + iL0;
            if (z10 && arrayList.size() == i6 - 1) {
                break;
            }
            iL0 = l0(charSequence, str, length, z6);
        } while (iL0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ java.util.List S0(java.lang.CharSequence charSequence, char[] cArr, boolean z6, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return P0(charSequence, cArr, z6, i6);
    }

    public static /* synthetic */ java.util.List T0(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z6, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return Q0(charSequence, strArr, z6, i6);
    }

    public static final R8.h U0(final java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z6, int i6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(strArr, "delimiters");
        return R8.k.G(F0(charSequence, strArr, 0, z6, i6, 2, null), new p237x7.l() { // from class: S8.G
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return S8.H.W0(charSequence, (E7.i) obj);
            }
        });
    }

    public static /* synthetic */ R8.h V0(java.lang.CharSequence charSequence, java.lang.String[] strArr, boolean z6, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return U0(charSequence, strArr, z6, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String W0(java.lang.CharSequence charSequence, E7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "it");
        return d1(charSequence, iVar);
    }

    public static final boolean X0(java.lang.CharSequence charSequence, char c6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return charSequence.length() > 0 && S8.AbstractC1630c.d(charSequence.charAt(0), c6, z6);
    }

    public static final boolean Y0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        return (!z6 && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) ? S8.r.U((java.lang.String) charSequence, (java.lang.String) charSequence2, i6, false, 4, null) : I0(charSequence, i6, charSequence2, 0, charSequence2.length(), z6);
    }

    public static final boolean Z(java.lang.CharSequence charSequence, char c6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return S8.r.o0(charSequence, c6, 0, z6, 2, null) >= 0;
    }

    public static final boolean Z0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        return (!z6 && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) ? S8.r.V((java.lang.String) charSequence, (java.lang.String) charSequence2, false, 2, null) : I0(charSequence, 0, charSequence2, 0, charSequence2.length(), z6);
    }

    public static boolean a0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "other");
        if (charSequence2 instanceof java.lang.String) {
            if (S8.r.p0(charSequence, (java.lang.String) charSequence2, 0, z6, 2, null) < 0) {
                return false;
            }
        } else if (n0(charSequence, charSequence2, 0, charSequence.length(), z6, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean a1(java.lang.CharSequence charSequence, char c6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return X0(charSequence, c6, z6);
    }

    public static /* synthetic */ boolean b0(java.lang.CharSequence charSequence, char c6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return Z(charSequence, c6, z6);
    }

    public static /* synthetic */ boolean b1(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return Y0(charSequence, charSequence2, i6, z6);
    }

    public static /* synthetic */ boolean c0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return S8.r.a0(charSequence, charSequence2, z6);
    }

    public static /* synthetic */ boolean c1(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return Z0(charSequence, charSequence2, z6);
    }

    public static final boolean d0(java.lang.CharSequence charSequence, char c6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return charSequence.length() > 0 && S8.AbstractC1630c.d(charSequence.charAt(S8.r.j0(charSequence)), c6, z6);
    }

    public static final java.lang.String d1(java.lang.CharSequence charSequence, E7.i iVar) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(iVar, "range");
        return charSequence.subSequence(iVar.M().intValue(), iVar.E().intValue() + 1).toString();
    }

    public static final boolean e0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(charSequence2, "suffix");
        return (!z6 && (charSequence instanceof java.lang.String) && (charSequence2 instanceof java.lang.String)) ? S8.r.J((java.lang.String) charSequence, (java.lang.String) charSequence2, false, 2, null) : I0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z6);
    }

    public static java.lang.String e1(java.lang.String str, E7.i iVar) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(iVar, "range");
        java.lang.String strSubstring = str.substring(iVar.M().intValue(), iVar.E().intValue() + 1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean f0(java.lang.CharSequence charSequence, char c6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return d0(charSequence, c6, z6);
    }

    public static java.lang.String f1(java.lang.String str, char c6, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "missingDelimiterValue");
        int iO0 = S8.r.o0(str, c6, 0, false, 6, null);
        if (iO0 == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(iO0 + 1, str.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean g0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return e0(charSequence, charSequence2, z6);
    }

    public static java.lang.String g1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "delimiter");
        p247y7.AbstractC7350t.f(str3, "missingDelimiterValue");
        int iP0 = S8.r.p0(str, str2, 0, false, 6, null);
        if (iP0 == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(iP0 + str2.length(), str.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final p087i7.u h0(java.lang.CharSequence charSequence, java.util.Collection collection, int i6, boolean z6, boolean z10) {
        int iF;
        java.lang.Object next;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object next2;
        java.lang.String str3;
        if (!z6 && collection.size() == 1) {
            java.lang.String str4 = (java.lang.String) p097j7.AbstractC6879v.F0(collection);
            int iP0 = !z10 ? S8.r.p0(charSequence, str4, i6, false, 4, null) : S8.r.w0(charSequence, str4, i6, false, 4, null);
            if (iP0 < 0) {
                return null;
            }
            return p087i7.B.a(java.lang.Integer.valueOf(iP0), str4);
        }
        E7.g iVar = !z10 ? new E7.i(E7.j.d(i6, 0), charSequence.length()) : E7.j.n(E7.j.g(i6, S8.r.j0(charSequence)), 0);
        if (charSequence instanceof java.lang.String) {
            iF = iVar.f();
            int iG = iVar.g();
            int iO = iVar.o();
            if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
                while (true) {
                    java.util.Iterator it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str3 = (java.lang.String) next2;
                    } while (!S8.r.M(str3, 0, (java.lang.String) charSequence, iF, str3.length(), z6));
                    str = (java.lang.String) next2;
                    if (str != null) {
                        break;
                    }
                    if (iF != iG) {
                        iF += iO;
                    }
                }
                return p087i7.B.a(java.lang.Integer.valueOf(iF), str);
            }
            return null;
        }
        iF = iVar.f();
        int iG2 = iVar.g();
        int iO2 = iVar.o();
        if ((iO2 > 0 && iF <= iG2) || (iO2 < 0 && iG2 <= iF)) {
            while (true) {
                java.util.Iterator it2 = collection.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    str2 = (java.lang.String) next;
                } while (!I0(str2, 0, charSequence, iF, str2.length(), z6));
                str = (java.lang.String) next;
                if (str != null) {
                    break;
                }
                if (iF != iG2) {
                    iF += iO2;
                }
            }
            return p087i7.B.a(java.lang.Integer.valueOf(iF), str);
        }
        return null;
    }

    public static /* synthetic */ java.lang.String h1(java.lang.String str, char c6, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = str;
        }
        return S8.r.f1(str, c6, str2);
    }

    public static E7.i i0(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return new E7.i(0, charSequence.length() - 1);
    }

    public static /* synthetic */ java.lang.String i1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str3 = str;
        }
        return S8.r.g1(str, str2, str3);
    }

    public static int j0(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static java.lang.String j1(java.lang.String str, char c6, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "missingDelimiterValue");
        int iV0 = S8.r.v0(str, c6, 0, false, 6, null);
        if (iV0 == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(iV0 + 1, str.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int k0(java.lang.CharSequence charSequence, char c6, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return (z6 || !(charSequence instanceof java.lang.String)) ? q0(charSequence, new char[]{c6}, i6, z6) : ((java.lang.String) charSequence).indexOf(c6, i6);
    }

    public static final java.lang.String k1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "delimiter");
        p247y7.AbstractC7350t.f(str3, "missingDelimiterValue");
        int iW0 = S8.r.w0(str, str2, 0, false, 6, null);
        if (iW0 == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(iW0 + str2.length(), str.length());
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int l0(java.lang.CharSequence charSequence, java.lang.String str, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(str, "string");
        return (z6 || !(charSequence instanceof java.lang.String)) ? n0(charSequence, str, i6, charSequence.length(), z6, false, 16, null) : ((java.lang.String) charSequence).indexOf(str, i6);
    }

    public static /* synthetic */ java.lang.String l1(java.lang.String str, char c6, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = str;
        }
        return S8.r.j1(str, c6, str2);
    }

    private static final int m0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i6, int i10, boolean z6, boolean z10) {
        E7.g iVar = !z10 ? new E7.i(E7.j.d(i6, 0), E7.j.g(i10, charSequence.length())) : E7.j.n(E7.j.g(i6, S8.r.j0(charSequence)), E7.j.d(i10, 0));
        if (!(charSequence instanceof java.lang.String) || !(charSequence2 instanceof java.lang.String)) {
            int iF = iVar.f();
            int iG = iVar.g();
            int iO = iVar.o();
            if ((iO <= 0 || iF > iG) && (iO >= 0 || iG > iF)) {
                return -1;
            }
            while (!I0(charSequence2, 0, charSequence, iF, charSequence2.length(), z6)) {
                if (iF == iG) {
                    return -1;
                }
                iF += iO;
            }
            return iF;
        }
        int iF2 = iVar.f();
        int iG2 = iVar.g();
        int iO2 = iVar.o();
        if ((iO2 <= 0 || iF2 > iG2) && (iO2 >= 0 || iG2 > iF2)) {
            return -1;
        }
        while (true) {
            java.lang.String str = (java.lang.String) charSequence2;
            if (S8.r.M(str, 0, (java.lang.String) charSequence, iF2, str.length(), z6)) {
                return iF2;
            }
            if (iF2 == iG2) {
                return -1;
            }
            iF2 += iO2;
        }
    }

    public static /* synthetic */ java.lang.String m1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str3 = str;
        }
        return k1(str, str2, str3);
    }

    static /* synthetic */ int n0(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i6, int i10, boolean z6, boolean z10, int i11, java.lang.Object obj) {
        if ((i11 & 16) != 0) {
            z10 = false;
        }
        return m0(charSequence, charSequence2, i6, i10, z6, z10);
    }

    public static final java.lang.String n1(java.lang.String str, char c6, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "missingDelimiterValue");
        int iO0 = S8.r.o0(str, c6, 0, false, 6, null);
        if (iO0 == -1) {
            return str2;
        }
        java.lang.String strSubstring = str.substring(0, iO0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int o0(java.lang.CharSequence charSequence, char c6, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return k0(charSequence, c6, i6, z6);
    }

    public static final java.lang.String o1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "delimiter");
        p247y7.AbstractC7350t.f(str3, "missingDelimiterValue");
        int iP0 = S8.r.p0(str, str2, 0, false, 6, null);
        if (iP0 == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(0, iP0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int p0(java.lang.CharSequence charSequence, java.lang.String str, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return l0(charSequence, str, i6, z6);
    }

    public static /* synthetic */ java.lang.String p1(java.lang.String str, char c6, java.lang.String str2, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = str;
        }
        return n1(str, c6, str2);
    }

    public static final int q0(java.lang.CharSequence charSequence, char[] cArr, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(p097j7.AbstractC6872n.E0(cArr), i6);
        }
        int iD = E7.j.d(i6, 0);
        int iJ0 = S8.r.j0(charSequence);
        if (iD > iJ0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c6 : cArr) {
                if (S8.AbstractC1630c.d(c6, cCharAt, z6)) {
                    return iD;
                }
            }
            if (iD == iJ0) {
                return -1;
            }
            iD++;
        }
    }

    public static /* synthetic */ java.lang.String q1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str3 = str;
        }
        return o1(str, str2, str3);
    }

    public static /* synthetic */ int r0(java.lang.CharSequence charSequence, char[] cArr, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return q0(charSequence, cArr, i6, z6);
    }

    public static java.lang.String r1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(str2, "delimiter");
        p247y7.AbstractC7350t.f(str3, "missingDelimiterValue");
        int iW0 = S8.r.w0(str, str2, 0, false, 6, null);
        if (iW0 == -1) {
            return str3;
        }
        java.lang.String strSubstring = str.substring(0, iW0);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean s0(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            if (!S8.AbstractC1628a.c(charSequence.charAt(i6))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ java.lang.String s1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str3 = str;
        }
        return S8.r.r1(str, str2, str3);
    }

    public static final int t0(java.lang.CharSequence charSequence, char c6, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return (z6 || !(charSequence instanceof java.lang.String)) ? x0(charSequence, new char[]{c6}, i6, z6) : ((java.lang.String) charSequence).lastIndexOf(c6, i6);
    }

    public static java.lang.Boolean t1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        if (p247y7.AbstractC7350t.b(str, "true")) {
            return java.lang.Boolean.TRUE;
        }
        if (p247y7.AbstractC7350t.b(str, "false")) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static final int u0(java.lang.CharSequence charSequence, java.lang.String str, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(str, "string");
        return (z6 || !(charSequence instanceof java.lang.String)) ? m0(charSequence, str, i6, 0, z6, true) : ((java.lang.String) charSequence).lastIndexOf(str, i6);
    }

    public static java.lang.CharSequence u1(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z6 = false;
        while (i6 <= length) {
            boolean zC = S8.AbstractC1628a.c(charSequence.charAt(!z6 ? i6 : length));
            if (z6) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i6++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static /* synthetic */ int v0(java.lang.CharSequence charSequence, char c6, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = S8.r.j0(charSequence);
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return t0(charSequence, c6, i6, z6);
    }

    public static java.lang.String v1(java.lang.String str, char... cArr) {
        java.lang.CharSequence charSequenceSubSequence;
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(cArr, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i6 = length - 1;
            if (!p097j7.AbstractC6872n.Q(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i6 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i6;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int w0(java.lang.CharSequence charSequence, java.lang.String str, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i6 = S8.r.j0(charSequence);
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return u0(charSequence, str, i6, z6);
    }

    public static final int x0(java.lang.CharSequence charSequence, char[] cArr, int i6, boolean z6) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        p247y7.AbstractC7350t.f(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).lastIndexOf(p097j7.AbstractC6872n.E0(cArr), i6);
        }
        for (int iG = E7.j.g(i6, S8.r.j0(charSequence)); -1 < iG; iG--) {
            char cCharAt = charSequence.charAt(iG);
            for (char c6 : cArr) {
                if (S8.AbstractC1630c.d(c6, cCharAt, z6)) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static final R8.h y0(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return new S8.H.a(charSequence);
    }

    public static java.util.List z0(java.lang.CharSequence charSequence) {
        p247y7.AbstractC7350t.f(charSequence, "<this>");
        return R8.k.M(y0(charSequence));
    }
}
