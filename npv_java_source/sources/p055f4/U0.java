package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U0 {
    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void b(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
