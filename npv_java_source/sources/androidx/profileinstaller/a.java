package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0434a {
        static java.io.File a(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static java.io.File a(android.content.Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (java.io.File file2 : fileArrListFiles) {
            z6 = a(file2) && z6;
        }
        return z6;
    }

    static void b(android.content.Context context, androidx.profileinstaller.ProfileInstallReceiver.a aVar) {
        aVar.b(a(android.os.Build.VERSION.SDK_INT >= 24 ? androidx.profileinstaller.a.b.a(context) : androidx.profileinstaller.a.C0434a.a(context)) ? 14 : 15, null);
    }
}
