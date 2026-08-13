package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {
    public static final java.lang.String a(java.lang.Object obj, java.lang.String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append('@');
        p247y7.V v6 = p247y7.V.f57259a;
        java.lang.String str2 = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        p247y7.AbstractC7350t.e(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
