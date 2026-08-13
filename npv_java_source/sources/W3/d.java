package W3;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final android.content.Context f15337a;

    public d(android.content.Context context) {
        this.f15337a = context;
    }

    public int a(java.lang.String str) {
        return this.f15337a.checkCallingOrSelfPermission(str);
    }

    public int b(java.lang.String str, java.lang.String str2) {
        return this.f15337a.getPackageManager().checkPermission(str, str2);
    }

    public android.content.pm.ApplicationInfo c(java.lang.String str, int i6) {
        return this.f15337a.getPackageManager().getApplicationInfo(str, i6);
    }

    public java.lang.CharSequence d(java.lang.String str) {
        android.content.Context context = this.f15337a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public B1.d e(java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ApplicationInfo applicationInfo = this.f15337a.getPackageManager().getApplicationInfo(str, 0);
        return B1.d.a(this.f15337a.getPackageManager().getApplicationLabel(applicationInfo), this.f15337a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public android.content.pm.PackageInfo f(java.lang.String str, int i6) {
        return this.f15337a.getPackageManager().getPackageInfo(str, i6);
    }

    public boolean g() {
        java.lang.String nameForUid;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return W3.b.a(this.f15337a);
        }
        if (!V3.n.i() || (nameForUid = this.f15337a.getPackageManager().getNameForUid(android.os.Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f15337a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i6, java.lang.String str) {
        if (V3.n.d()) {
            try {
                android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) this.f15337a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new java.lang.NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i6, str);
                return true;
            } catch (java.lang.SecurityException unused) {
                return false;
            }
        }
        java.lang.String[] packagesForUid = this.f15337a.getPackageManager().getPackagesForUid(i6);
        if (str != null && packagesForUid != null) {
            for (java.lang.String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
