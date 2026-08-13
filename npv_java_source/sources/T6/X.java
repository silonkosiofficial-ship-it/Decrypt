package T6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X {
    public static final T6.M b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "urlString");
        return T6.T.l(new T6.M(null, null, 0, null, null, null, null, null, false, 511, null), str);
    }

    public static final T6.g0 c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "urlString");
        return b(str).b();
    }

    public static final void d(java.lang.Appendable appendable, java.lang.String str, T6.H h6, boolean z6) {
        java.util.List listE;
        p247y7.AbstractC7350t.f(appendable, "<this>");
        p247y7.AbstractC7350t.f(str, "encodedPath");
        p247y7.AbstractC7350t.f(h6, "encodedQueryParameters");
        if ((!S8.r.s0(str)) && !S8.r.V(str, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str);
        if (!h6.isEmpty() || z6) {
            appendable.append("?");
        }
        java.util.Set<java.util.Map.Entry> setA = h6.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : setA) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.isEmpty()) {
                listE = p097j7.AbstractC6879v.e(p087i7.B.a(str2, null));
            } else {
                java.util.List list2 = list;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(p087i7.B.a(str2, (java.lang.String) it.next()));
                }
                listE = arrayList2;
            }
            p097j7.AbstractC6879v.C(arrayList, listE);
        }
        p097j7.G.o0(arrayList, appendable, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new p237x7.l() { // from class: T6.W
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return T6.X.e((p087i7.u) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence e(p087i7.u uVar) {
        p247y7.AbstractC7350t.f(uVar, "it");
        java.lang.String str = (java.lang.String) uVar.c();
        if (uVar.d() == null) {
            return str;
        }
        return str + '=' + java.lang.String.valueOf(uVar.d());
    }

    public static final void f(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }

    public static final java.lang.String g(T6.g0 g0Var) {
        p247y7.AbstractC7350t.f(g0Var, "<this>");
        return g0Var.p() + ':' + g0Var.q();
    }

    public static final java.lang.String h(T6.g0 g0Var) {
        p247y7.AbstractC7350t.f(g0Var, "<this>");
        int iT = g0Var.t();
        return (iT == 0 || iT == g0Var.r().c()) ? g0Var.p() : g(g0Var);
    }

    public static final T6.M i(T6.M m6, T6.M m10) {
        p247y7.AbstractC7350t.f(m6, "<this>");
        p247y7.AbstractC7350t.f(m10, "url");
        m6.A(m10.p());
        m6.x(m10.j());
        m6.y(m10.n());
        m6.v(m10.g());
        m6.w(m10.h());
        m6.u(m10.f());
        T6.H hB = T6.K.b(0, 1, null);
        W6.D.c(hB, m10.e());
        m6.t(hB);
        m6.s(m10.d());
        m6.B(m10.q());
        return m6;
    }
}
