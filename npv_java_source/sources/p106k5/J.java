package p106k5;

/* JADX INFO: loaded from: classes3.dex */
class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f49578a;

    J() {
    }

    private static java.lang.String b(android.content.Context context) {
        java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized java.lang.String a(android.content.Context context) {
        try {
            if (this.f49578a == null) {
                this.f49578a = b(context);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return "".equals(this.f49578a) ? null : this.f49578a;
    }
}
