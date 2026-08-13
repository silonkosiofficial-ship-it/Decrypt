package T6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O {
    private static final void b(java.lang.Appendable appendable, java.lang.String str) throws java.io.IOException {
        appendable.append(":");
        appendable.append(str);
    }

    private static final void c(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        appendable.append("://");
        appendable.append(str);
        if (!S8.r.a1(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void d(java.lang.Appendable appendable, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Appendable e(T6.M m6, java.lang.Appendable appendable) throws java.io.IOException {
        appendable.append(m6.o().d());
        java.lang.String strD = m6.o().d();
        int iHashCode = strD.hashCode();
        if (iHashCode != -1081572750) {
            if (iHashCode != 3143036) {
                if (iHashCode == 92611469 && strD.equals("about")) {
                    b(appendable, m6.j());
                    return appendable;
                }
            } else if (strD.equals("file")) {
                c(appendable, m6.j(), g(m6));
                return appendable;
            }
        } else if (strD.equals("mailto")) {
            d(appendable, h(m6), m6.j());
            return appendable;
        }
        appendable.append("://");
        appendable.append(f(m6));
        T6.X.d(appendable, g(m6), m6.e(), m6.q());
        if (m6.d().length() > 0) {
            appendable.append('#');
            appendable.append(m6.d());
        }
        return appendable;
    }

    public static final java.lang.String f(T6.M m6) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(h(m6));
        sb.append(m6.j());
        if (m6.n() != 0 && m6.n() != m6.o().c()) {
            sb.append(":");
            sb.append(java.lang.String.valueOf(m6.n()));
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    public static final java.lang.String g(T6.M m6) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        return i(m6.g());
    }

    public static final java.lang.String h(T6.M m6) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        T6.X.f(sb, m6.h(), m6.f());
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    private static final java.lang.String i(java.util.List list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((java.lang.CharSequence) p097j7.AbstractC6879v.i0(list)).length() == 0 ? "/" : (java.lang.String) p097j7.AbstractC6879v.i0(list);
        }
        return p097j7.AbstractC6879v.r0(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void j(T6.M m6, java.lang.String str) {
        java.util.List listE;
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(str, "value");
        if (S8.r.s0(str)) {
            listE = p097j7.AbstractC6879v.m();
        } else {
            listE = p247y7.AbstractC7350t.b(str, "/") ? T6.T.e() : p097j7.AbstractC6879v.W0(S8.r.S0(str, new char[]{'/'}, false, 0, 6, null));
        }
        m6.v(listE);
    }
}
