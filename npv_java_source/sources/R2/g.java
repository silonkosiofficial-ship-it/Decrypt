package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f9426a = I2.j.f("PackageManagerHelper");

    public static void a(android.content.Context context, java.lang.Class cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            I2.j.c().a(f9426a, java.lang.String.format("%s %s", cls.getName(), z6 ? "enabled" : "disabled"), new java.lang.Throwable[0]);
        } catch (java.lang.Exception e6) {
            I2.j.c().a(f9426a, java.lang.String.format("%s could not be %s", cls.getName(), z6 ? "enabled" : "disabled"), e6);
        }
    }
}
