package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M extends F8.t0 implements J8.j, J8.k {
    public M() {
        super(null);
    }

    public abstract F8.M d1(boolean z6);

    public abstract F8.M e1(F8.a0 a0Var);

    public java.lang.String toString() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = k().iterator();
        while (it.hasNext()) {
            S8.r.r(sb, "[", p168q8.c.s(p168q8.c.f53162j, (P7.c) it.next(), null, 2, null), "] ");
        }
        sb.append(W0());
        if (!U0().isEmpty()) {
            p097j7.G.o0(U0(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (X0()) {
            sb.append("?");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
