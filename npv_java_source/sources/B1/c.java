package B1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Objects.equals(obj, obj2);
    }

    public static int b(java.lang.Object... objArr) {
        return j$.util.Objects.hash(objArr);
    }

    public static java.lang.Object c(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    public static java.lang.Object d(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }
}
