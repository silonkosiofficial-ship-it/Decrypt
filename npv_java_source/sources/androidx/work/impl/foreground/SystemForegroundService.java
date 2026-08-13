package androidx.work.impl.foreground;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends androidx.lifecycle.AbstractServiceC2089v implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.lang.String f23918H = I2.j.f("SystemFgService");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static androidx.work.impl.foreground.SystemForegroundService f23919I = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.os.Handler f23920D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f23921E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    androidx.work.impl.foreground.a f23922F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    android.app.NotificationManager f23923G;

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f23924C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.app.Notification f23925D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f23926E;

        a(int i6, android.app.Notification notification, int i10) {
            this.f23924C = i6;
            this.f23925D = notification;
            this.f23926E = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.work.impl.foreground.SystemForegroundService.this.startForeground(this.f23924C, this.f23925D, this.f23926E);
            } else {
                androidx.work.impl.foreground.SystemForegroundService.this.startForeground(this.f23924C, this.f23925D);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f23928C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.app.Notification f23929D;

        b(int i6, android.app.Notification notification) {
            this.f23928C = i6;
            this.f23929D = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.foreground.SystemForegroundService.this.f23923G.notify(this.f23928C, this.f23929D);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f23931C;

        c(int i6) {
            this.f23931C = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.work.impl.foreground.SystemForegroundService.this.f23923G.cancel(this.f23931C);
        }
    }

    private void f() {
        this.f23920D = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f23923G = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f23922F = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i6, int i10, android.app.Notification notification) {
        this.f23920D.post(new androidx.work.impl.foreground.SystemForegroundService.a(i6, notification, i10));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i6, android.app.Notification notification) {
        this.f23920D.post(new androidx.work.impl.foreground.SystemForegroundService.b(i6, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i6) {
        this.f23920D.post(new androidx.work.impl.foreground.SystemForegroundService.c(i6));
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public void onCreate() {
        super.onCreate();
        f23919I = this;
        f();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f23922F.k();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        if (this.f23921E) {
            I2.j.c().d(f23918H, "Re-initializing SystemForegroundService after a request to shut-down.", new java.lang.Throwable[0]);
            this.f23922F.k();
            f();
            this.f23921E = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f23922F.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f23921E = true;
        I2.j.c().a(f23918H, "All commands completed.", new java.lang.Throwable[0]);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f23919I = null;
        stopSelf();
    }
}
