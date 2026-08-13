package J2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f5675a = I2.j.f("WrkDbPathHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f5676b = {"-journal", "-shm", "-wal"};

    public static java.io.File a(android.content.Context context) {
        return c(context, "androidx.work.workdb");
    }

    public static java.io.File b(android.content.Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static java.io.File c(android.content.Context context, java.lang.String str) {
        return new java.io.File(context.getNoBackupFilesDir(), str);
    }

    public static java.lang.String d() {
        return "androidx.work.workdb";
    }

    public static void e(android.content.Context context) {
        if (b(context).exists()) {
            I2.j.c().a(f5675a, "Migrating WorkDatabase to the no-backup directory", new java.lang.Throwable[0]);
            java.util.Map mapF = f(context);
            for (java.io.File file : mapF.keySet()) {
                java.io.File file2 = (java.io.File) mapF.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        I2.j.c().h(f5675a, java.lang.String.format("Over-writing contents of %s", file2), new java.lang.Throwable[0]);
                    }
                    I2.j.c().a(f5675a, file.renameTo(file2) ? java.lang.String.format("Migrated %s to %s", file, file2) : java.lang.String.format("Renaming %s to %s failed", file, file2), new java.lang.Throwable[0]);
                }
            }
        }
    }

    public static java.util.Map f(android.content.Context context) {
        java.util.HashMap map = new java.util.HashMap();
        java.io.File fileB = b(context);
        java.io.File fileA = a(context);
        map.put(fileB, fileA);
        for (java.lang.String str : f5676b) {
            map.put(new java.io.File(fileB.getPath() + str), new java.io.File(fileA.getPath() + str));
        }
        return map;
    }
}
