package T6;

/* JADX INFO: renamed from: T6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1677z {
    public static final java.nio.charset.Charset a(T6.InterfaceC1675x interfaceC1675x) {
        p247y7.AbstractC7350t.f(interfaceC1675x, "<this>");
        T6.C1660h c1660hC = c(interfaceC1675x);
        if (c1660hC != null) {
            return T6.AbstractC1661i.a(c1660hC);
        }
        return null;
    }

    public static final java.lang.Long b(T6.InterfaceC1675x interfaceC1675x) {
        p247y7.AbstractC7350t.f(interfaceC1675x, "<this>");
        java.lang.String strD = interfaceC1675x.a().d(T6.C1673v.f13241a.g());
        if (strD != null) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(strD));
        }
        return null;
    }

    public static final T6.C1660h c(T6.InterfaceC1675x interfaceC1675x) {
        p247y7.AbstractC7350t.f(interfaceC1675x, "<this>");
        java.lang.String strD = interfaceC1675x.a().d(T6.C1673v.f13241a.h());
        if (strD != null) {
            return T6.C1660h.f13129f.b(strD);
        }
        return null;
    }

    public static final T6.C1660h d(T6.InterfaceC1676y interfaceC1676y) {
        p247y7.AbstractC7350t.f(interfaceC1676y, "<this>");
        java.lang.String strK = interfaceC1676y.a().k(T6.C1673v.f13241a.h());
        if (strK != null) {
            return T6.C1660h.f13129f.b(strK);
        }
        return null;
    }
}
