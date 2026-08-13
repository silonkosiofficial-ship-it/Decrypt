package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends androidx.lifecycle.AbstractServiceC2089v implements androidx.work.impl.background.systemalarm.e.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String f23875F = I2.j.f("SystemAlarmService");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.work.impl.background.systemalarm.e f23876D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f23877E;

    private void f() {
        androidx.work.impl.background.systemalarm.e eVar = new androidx.work.impl.background.systemalarm.e(this);
        this.f23876D = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f23877E = true;
        I2.j.c().a(f23875F, "All commands completed in dispatcher", new java.lang.Throwable[0]);
        R2.n.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f23877E = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f23877E = true;
        this.f23876D.j();
    }

    @Override // androidx.lifecycle.AbstractServiceC2089v, android.app.Service
    public int onStartCommand(android.content.Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        if (this.f23877E) {
            I2.j.c().d(f23875F, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new java.lang.Throwable[0]);
            this.f23876D.j();
            f();
            this.f23877E = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f23876D.a(intent, i10);
        return 3;
    }
}
