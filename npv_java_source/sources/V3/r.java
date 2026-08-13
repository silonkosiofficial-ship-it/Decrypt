package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f15127a = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }
}
