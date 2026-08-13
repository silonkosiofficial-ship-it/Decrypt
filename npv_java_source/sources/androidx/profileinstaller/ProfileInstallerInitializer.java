package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements D2.a {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        public static void c(final java.lang.Runnable runnable) {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: androidx.profileinstaller.m
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j6) {
                    runnable.run();
                }
            });
        }
    }

    private static class b {
        public static android.os.Handler a(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(final android.content.Context context) {
        new java.util.concurrent.ThreadPoolExecutor(0, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue()).execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.i.i(context);
            }
        });
    }

    @Override // D2.a
    public java.util.List a() {
        return java.util.Collections.emptyList();
    }

    @Override // D2.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public androidx.profileinstaller.ProfileInstallerInitializer.c b(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return new androidx.profileinstaller.ProfileInstallerInitializer.c();
        }
        g(context.getApplicationContext());
        return new androidx.profileinstaller.ProfileInstallerInitializer.c();
    }

    void g(final android.content.Context context) {
        androidx.profileinstaller.ProfileInstallerInitializer.a.c(new java.lang.Runnable() { // from class: androidx.profileinstaller.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f22937C.i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void i(final android.content.Context context) {
        (android.os.Build.VERSION.SDK_INT >= 28 ? androidx.profileinstaller.ProfileInstallerInitializer.b.a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new java.lang.Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.ProfileInstallerInitializer.l(context);
            }
        }, new java.util.Random().nextInt(java.lang.Math.max(1000, 1)) + 5000);
    }
}
