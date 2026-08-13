package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int a(android.content.Context context, java.lang.String str, int i6, int i10, java.lang.String str2) {
        if (context.checkPermission(str, i6, i10) == -1) {
            return -1;
        }
        java.lang.String strC = androidx.core.app.e.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((android.os.Process.myUid() != i10 || !B1.c.a(context.getPackageName(), str2)) ? androidx.core.app.e.b(context, strC, str2) : androidx.core.app.e.a(context, i10, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(android.content.Context context, java.lang.String str) {
        return a(context, str, android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName());
    }
}
