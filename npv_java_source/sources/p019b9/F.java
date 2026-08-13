package p019b9;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24334a = java.lang.Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f24334a;
    }

    public static final java.lang.String b(java.lang.String str) {
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}
