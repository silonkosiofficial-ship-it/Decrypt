package T7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final java.lang.Class a(java.lang.ClassLoader classLoader, java.lang.String str) {
        p247y7.AbstractC7350t.f(classLoader, "<this>");
        p247y7.AbstractC7350t.f(str, "fqName");
        try {
            return java.lang.Class.forName(str, false, classLoader);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
