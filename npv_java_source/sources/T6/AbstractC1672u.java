package T6;

/* JADX INFO: renamed from: T6.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1672u {
    private static final boolean c(java.lang.String str, int i6) {
        int i10 = i6 + 1;
        while (i10 < str.length() && str.charAt(i10) == ' ') {
            i10++;
        }
        return i10 == str.length() || str.charAt(i10) == ';';
    }

    public static final java.util.List d(java.lang.String str) {
        return e(str, false);
    }

    public static final java.util.List e(java.lang.String str, boolean z6) {
        if (str == null) {
            return p097j7.AbstractC6879v.m();
        }
        p087i7.InterfaceC6668n interfaceC6668nA = p087i7.AbstractC6669o.a(p087i7.r.NONE, new p237x7.a() { // from class: T6.s
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.AbstractC1672u.f();
            }
        });
        int iG = 0;
        while (iG <= S8.r.j0(str)) {
            iG = g(str, iG, interfaceC6668nA, z6);
        }
        return n(interfaceC6668nA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList f() {
        return new java.util.ArrayList();
    }

    private static final int g(java.lang.String str, int i6, p087i7.InterfaceC6668n interfaceC6668n, boolean z6) {
        p087i7.InterfaceC6668n interfaceC6668nA = p087i7.AbstractC6669o.a(p087i7.r.NONE, new p237x7.a() { // from class: T6.t
            @Override // p237x7.a
            public final java.lang.Object b() {
                return T6.AbstractC1672u.h();
            }
        });
        java.lang.Integer numValueOf = z6 ? java.lang.Integer.valueOf(i6) : null;
        int i10 = i6;
        while (i10 <= S8.r.j0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ',') {
                ((java.util.ArrayList) interfaceC6668n.getValue()).add(new T6.C1664l(m(str, i6, numValueOf != null ? numValueOf.intValue() : i10), n(interfaceC6668nA)));
                return i10 + 1;
            }
            if (cCharAt == ';') {
                if (numValueOf == null) {
                    numValueOf = java.lang.Integer.valueOf(i10);
                }
                i10++;
            } else if (!z6) {
                i10++;
            }
            i10 = i(str, i10, interfaceC6668nA);
        }
        ((java.util.ArrayList) interfaceC6668n.getValue()).add(new T6.C1664l(m(str, i6, numValueOf != null ? numValueOf.intValue() : i10), n(interfaceC6668nA)));
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList h() {
        return new java.util.ArrayList();
    }

    private static final int i(java.lang.String str, int i6, p087i7.InterfaceC6668n interfaceC6668n) {
        int i10 = i6;
        while (i10 <= S8.r.j0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ',' || cCharAt == ';') {
                j(interfaceC6668n, str, i6, i10, "");
                return i10;
            }
            if (cCharAt == '=') {
                p087i7.u uVarK = k(str, i10 + 1);
                int iIntValue = ((java.lang.Number) uVarK.a()).intValue();
                j(interfaceC6668n, str, i6, i10, (java.lang.String) uVarK.b());
                return iIntValue;
            }
            i10++;
        }
        j(interfaceC6668n, str, i6, i10, "");
        return i10;
    }

    private static final void j(p087i7.InterfaceC6668n interfaceC6668n, java.lang.String str, int i6, int i10, java.lang.String str2) {
        java.lang.String strM = m(str, i6, i10);
        if (strM.length() == 0) {
            return;
        }
        ((java.util.ArrayList) interfaceC6668n.getValue()).add(new T6.C1665m(strM, str2));
    }

    private static final p087i7.u k(java.lang.String str, int i6) {
        if (str.length() == i6) {
            return p087i7.B.a(java.lang.Integer.valueOf(i6), "");
        }
        if (str.charAt(i6) == '\"') {
            return l(str, i6 + 1);
        }
        int i10 = i6;
        while (i10 <= S8.r.j0(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ',' || cCharAt == ';') {
                return p087i7.B.a(java.lang.Integer.valueOf(i10), m(str, i6, i10));
            }
            i10++;
        }
        return p087i7.B.a(java.lang.Integer.valueOf(i10), m(str, i6, i10));
    }

    private static final p087i7.u l(java.lang.String str, int i6) {
        java.lang.Integer numValueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (i6 <= S8.r.j0(str)) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '\"' && c(str, i6)) {
                numValueOf = java.lang.Integer.valueOf(i6 + 1);
                return p087i7.B.a(numValueOf, sb.toString());
            }
            if (cCharAt != '\\' || i6 >= S8.r.j0(str) - 2) {
                sb.append(cCharAt);
                i6++;
            } else {
                sb.append(str.charAt(i6 + 1));
                i6 += 2;
            }
        }
        numValueOf = java.lang.Integer.valueOf(i6);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        sb = new java.lang.StringBuilder();
        sb.append('\"');
        sb.append(string);
        return p087i7.B.a(numValueOf, sb.toString());
    }

    private static final java.lang.String m(java.lang.String str, int i6, int i10) {
        java.lang.String strSubstring = str.substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        return S8.r.u1(strSubstring).toString();
    }

    private static final java.util.List n(p087i7.InterfaceC6668n interfaceC6668n) {
        return interfaceC6668n.d() ? (java.util.List) interfaceC6668n.getValue() : p097j7.AbstractC6879v.m();
    }
}
