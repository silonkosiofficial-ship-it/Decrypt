package S8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends S8.A {
    public static java.lang.Double s(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        try {
            if (S8.q.f12689b.d(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.Float t(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        try {
            if (S8.q.f12689b.d(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
