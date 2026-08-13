package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f22944a = androidx.concurrent.futures.d.D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f22945b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static androidx.profileinstaller.o.c f22946c = null;

    private static class a {
        static android.content.pm.PackageInfo a(android.content.pm.PackageManager packageManager, android.content.Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f22947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f22948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f22949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f22950d;

        b(int i6, int i10, long j6, long j10) {
            this.f22947a = i6;
            this.f22948b = i10;
            this.f22949c = j6;
            this.f22950d = j10;
        }

        static androidx.profileinstaller.o.b a(java.io.File file) throws java.io.IOException {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
            try {
                androidx.profileinstaller.o.b bVar = new androidx.profileinstaller.o.b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (java.lang.Throwable th) {
                try {
                    dataInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(java.io.File file) throws java.io.IOException {
            file.delete();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f22947a);
                dataOutputStream.writeInt(this.f22948b);
                dataOutputStream.writeLong(this.f22949c);
                dataOutputStream.writeLong(this.f22950d);
                dataOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof androidx.profileinstaller.o.b)) {
                return false;
            }
            androidx.profileinstaller.o.b bVar = (androidx.profileinstaller.o.b) obj;
            return this.f22948b == bVar.f22948b && this.f22949c == bVar.f22949c && this.f22947a == bVar.f22947a && this.f22950d == bVar.f22950d;
        }

        public int hashCode() {
            return j$.util.Objects.hash(java.lang.Integer.valueOf(this.f22948b), java.lang.Long.valueOf(this.f22949c), java.lang.Integer.valueOf(this.f22947a), java.lang.Long.valueOf(this.f22950d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f22951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f22953c;

        c(int i6, boolean z6, boolean z10) {
            this.f22951a = i6;
            this.f22953c = z10;
            this.f22952b = z6;
        }
    }

    private static long a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (android.os.Build.VERSION.SDK_INT >= 33 ? androidx.profileinstaller.o.a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static androidx.profileinstaller.o.c b(int i6, boolean z6, boolean z10) {
        androidx.profileinstaller.o.c cVar = new androidx.profileinstaller.o.c(i6, z6, z10);
        f22946c = cVar;
        f22944a.z(cVar);
        return f22946c;
    }

    static androidx.profileinstaller.o.c c(android.content.Context context, boolean z6) {
        androidx.profileinstaller.o.b bVarA;
        int i6;
        androidx.profileinstaller.o.c cVar;
        if (!z6 && (cVar = f22946c) != null) {
            return cVar;
        }
        synchronized (f22945b) {
            if (!z6) {
                try {
                    androidx.profileinstaller.o.c cVar2 = f22946c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            int i10 = android.os.Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 28 && i10 != 30) {
                java.io.File file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z10 = file.exists() && length > 0;
                java.io.File file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z11 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    java.io.File file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = androidx.profileinstaller.o.b.a(file3);
                        } catch (java.io.IOException unused) {
                            return b(131072, z10, z11);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f22949c == jA && (i6 = bVarA.f22948b) != 2) {
                        i11 = i6;
                    } else if (z10) {
                        i11 = 1;
                    } else if (z11) {
                        i11 = 2;
                    }
                    if (z6 && z11 && i11 != 1) {
                        i11 = 2;
                    }
                    if (bVarA != null && bVarA.f22948b == 2 && i11 == 1 && length < bVarA.f22950d) {
                        i11 = 3;
                    }
                    androidx.profileinstaller.o.b bVar = new androidx.profileinstaller.o.b(1, i11, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (java.io.IOException unused2) {
                            i11 = 196608;
                        }
                    }
                    return b(i11, z10, z11);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    return b(65536, z10, z11);
                }
            }
            return b(262144, false, false);
        }
    }
}
