package androidx.work.impl.diagnostics;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f23917a = I2.j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        I2.j.c().a(f23917a, "Requesting diagnostics", new java.lang.Throwable[0]);
        try {
            I2.t.d(context).b(I2.l.d(androidx.work.impl.workers.DiagnosticsWorker.class));
        } catch (java.lang.IllegalStateException e6) {
            I2.j.c().b(f23917a, "WorkManager is not initialized", e6);
        }
    }
}
