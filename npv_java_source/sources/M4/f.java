package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends M4.b {
    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }
}
