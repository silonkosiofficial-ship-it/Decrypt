package O2;

/* JADX INFO: loaded from: classes.dex */
public class b extends O2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String f8003i = I2.j.f("BatteryNotLowTracker");

    public b(android.content.Context context, S2.a aVar) {
        super(context, aVar);
    }

    @Override // O2.c
    public android.content.IntentFilter g() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // O2.c
    public void h(android.content.Context context, android.content.Intent intent) {
        java.lang.Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        I2.j.c().a(f8003i, java.lang.String.format("Received %s", intent.getAction()), new java.lang.Throwable[0]);
        java.lang.String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = java.lang.Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        d(bool);
    }

    @Override // O2.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean b() {
        android.content.Intent intentRegisterReceiver = this.f8009b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return java.lang.Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        I2.j.c().b(f8003i, "getInitialState - null intent received", new java.lang.Throwable[0]);
        return null;
    }
}
