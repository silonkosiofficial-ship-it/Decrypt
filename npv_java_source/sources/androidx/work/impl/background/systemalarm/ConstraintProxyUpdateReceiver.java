package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.String f23869a = I2.j.f("ConstrntProxyUpdtRecvr");

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.content.Intent f23870C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ android.content.Context f23871D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ android.content.BroadcastReceiver.PendingResult f23872E;

        a(android.content.Intent intent, android.content.Context context, android.content.BroadcastReceiver.PendingResult pendingResult) {
            this.f23870C = intent;
            this.f23871D = context;
            this.f23872E = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f23870C.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f23870C.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f23870C.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f23870C.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                I2.j.c().a(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f23869a, java.lang.String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3), java.lang.Boolean.valueOf(booleanExtra4)), new java.lang.Throwable[0]);
                R2.g.a(this.f23871D, androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                R2.g.a(this.f23871D, androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                R2.g.a(this.f23871D, androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                R2.g.a(this.f23871D, androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f23872E.finish();
            }
        }
    }

    public static android.content.Intent a(android.content.Context context, boolean z6, boolean z10, boolean z11, boolean z12) {
        android.content.Intent intent = new android.content.Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            J2.j.k(context).p().b(new androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a(intent, context, goAsync()));
        } else {
            I2.j.c().a(f23869a, java.lang.String.format("Ignoring unknown action %s", action), new java.lang.Throwable[0]);
        }
    }
}
