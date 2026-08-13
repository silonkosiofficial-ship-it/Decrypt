package T;

/* JADX INFO: renamed from: T.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1649h {
    public static final T.k a(java.lang.String str) {
        java.lang.String strK0 = S8.r.K0(S8.r.R(new S8.o("y{1,4}").e(new S8.o("M{1,2}").e(new S8.o("d{1,2}").e(new S8.o("[^dMy/\\-.]").e(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        S8.InterfaceC1639l interfaceC1639lB = S8.o.b(new S8.o("[/\\-.]"), strK0, 0, 2, null);
        p247y7.AbstractC7350t.c(interfaceC1639lB);
        S8.C1637j c1637j = interfaceC1639lB.c().get(0);
        p247y7.AbstractC7350t.c(c1637j);
        int iF = c1637j.a().f();
        java.lang.String strSubstring = strK0.substring(iF, iF + 1);
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new T.k(strK0, strSubstring.charAt(0));
    }
}
