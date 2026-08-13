package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC2089v extends android.app.Service implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.lifecycle.Q f22848C = new androidx.lifecycle.Q(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p247y7.AbstractC7350t.f(intent, "intent");
        this.f22848C.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f22848C.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f22848C.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i6) {
        this.f22848C.e();
        super.onStart(intent, i6);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i6, int i10) {
        return super.onStartCommand(intent, i6, i10);
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return this.f22848C.a();
    }
}
