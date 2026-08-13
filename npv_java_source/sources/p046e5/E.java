package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public static void a(boolean z6, java.lang.String str) {
        if (!z6) {
            throw new java.lang.IllegalArgumentException(str);
        }
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

    public static void d(boolean z6, java.lang.String str) {
        if (!z6) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
