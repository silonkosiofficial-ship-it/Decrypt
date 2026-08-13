package p004a3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(java.lang.Object obj, java.lang.Class cls) {
        if (obj != null) {
            return;
        }
        throw new java.lang.IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static java.lang.Object b(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.Object d(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
