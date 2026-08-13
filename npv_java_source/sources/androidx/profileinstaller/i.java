package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.profileinstaller.i.c f22935a = new androidx.profileinstaller.i.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final androidx.profileinstaller.i.c f22936b = new androidx.profileinstaller.i.b();

    class a implements androidx.profileinstaller.i.c {
        a() {
        }

        @Override // androidx.profileinstaller.i.c
        public void a(int i6, java.lang.Object obj) {
        }

        @Override // androidx.profileinstaller.i.c
        public void b(int i6, java.lang.Object obj) {
        }
    }

    class b implements androidx.profileinstaller.i.c {
        b() {
        }

        @Override // androidx.profileinstaller.i.c
        public void a(int i6, java.lang.Object obj) {
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4 || i6 != 5) {
            }
        }

        @Override // androidx.profileinstaller.i.c
        public void b(int i6, java.lang.Object obj) {
            switch (i6) {
            }
            if (i6 == 6 || i6 == 7 || i6 == 8) {
            }
        }
    }

    public interface c {
        void a(int i6, java.lang.Object obj);

        void b(int i6, java.lang.Object obj);
    }

    static boolean b(java.io.File file) {
        return new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, null);
    }

    static boolean d(android.content.pm.PackageInfo packageInfo, java.io.File file, androidx.profileinstaller.i.c cVar) {
        java.io.File file2 = new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file2));
            try {
                long j6 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z6 = j6 == packageInfo.lastUpdateTime;
                if (z6) {
                    cVar.b(2, null);
                }
                return z6;
            } catch (java.lang.Throwable th) {
                try {
                    dataInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    static void f(android.content.pm.PackageInfo packageInfo, java.io.File file) {
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(new java.io.File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException unused) {
        }
    }

    static void g(java.util.concurrent.Executor executor, final androidx.profileinstaller.i.c cVar, final int i6, final java.lang.Object obj) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                cVar.b(i6, obj);
            }
        });
    }

    private static boolean h(android.content.res.AssetManager assetManager, java.lang.String str, android.content.pm.PackageInfo packageInfo, java.io.File file, java.lang.String str2, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar) {
        androidx.profileinstaller.d dVar = new androidx.profileinstaller.d(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new java.io.File(new java.io.File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!dVar.e()) {
            return false;
        }
        boolean zN = dVar.i().m().n();
        if (zN) {
            f(packageInfo, file);
        }
        return zN;
    }

    public static void i(android.content.Context context) {
        j(context, new p123m2.m(), f22935a);
    }

    public static void j(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar) {
        k(context, executor, cVar, false);
    }

    static void k(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar, boolean z6) {
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String packageName = applicationContext.getPackageName();
        android.content.pm.ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        android.content.res.AssetManager assets = applicationContext.getAssets();
        java.lang.String name = new java.io.File(applicationInfo.sourceDir).getName();
        boolean z10 = false;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            java.io.File filesDir = context.getFilesDir();
            if (z6 || !d(packageInfo, filesDir, cVar)) {
                java.lang.String str = "Installing profile for " + context.getPackageName();
                if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z6) {
                    z10 = true;
                }
            } else {
                java.lang.String str2 = "Skipping profile installation for " + context.getPackageName();
            }
            androidx.profileinstaller.o.c(context, z10);
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            cVar.b(7, e6);
            androidx.profileinstaller.o.c(context, false);
        }
    }

    static void l(android.content.Context context, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, null);
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            g(executor, cVar, 7, e6);
        }
    }
}
