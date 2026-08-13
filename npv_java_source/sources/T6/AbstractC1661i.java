package T6;

/* JADX INFO: renamed from: T6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1661i {
    public static final java.nio.charset.Charset a(T6.AbstractC1666n abstractC1666n) {
        p247y7.AbstractC7350t.f(abstractC1666n, "<this>");
        java.lang.String strC = abstractC1666n.c("charset");
        if (strC == null) {
            return null;
        }
        try {
            return p027c7.a.e(S8.C1631d.f12623a, strC);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static final T6.C1660h b(T6.C1660h c1660h, java.nio.charset.Charset charset) {
        p247y7.AbstractC7350t.f(c1660h, "<this>");
        p247y7.AbstractC7350t.f(charset, "charset");
        return c1660h.g("charset", p027c7.a.g(charset));
    }
}
