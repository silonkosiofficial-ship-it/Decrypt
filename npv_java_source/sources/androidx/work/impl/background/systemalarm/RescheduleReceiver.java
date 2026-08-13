package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f23874a = I2.j.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        I2.j.c().a(f23874a, java.lang.String.format("Received intent %s", intent), new java.lang.Throwable[0]);
        try {
            J2.j.k(context).t(goAsync());
        } catch (java.lang.IllegalStateException e6) {
            I2.j.c().b(f23874a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }
}
