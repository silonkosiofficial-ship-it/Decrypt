package O2;

/* JADX INFO: loaded from: classes.dex */
public class a extends O2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String f8002i = I2.j.f("BatteryChrgTracker");

    public a(android.content.Context context, S2.a aVar) {
        super(context, aVar);
    }

    private boolean j(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // O2.c
    public android.content.IntentFilter g() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // O2.c
    public void h(android.content.Context context, android.content.Intent intent) {
        java.lang.Boolean bool;
        byte b6 = 1;
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        I2.j.c().a(f8002i, java.lang.String.format("Received %s", action), new java.lang.Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                b6 = !action.equals("android.intent.action.ACTION_POWER_DISCONNECTED") ? (byte) -1 : (byte) 0;
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b6 = -1;
                }
                break;
            case 948344062:
                b6 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b6 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b6 = -1;
                break;
        }
        switch (b6) {
            case 0:
            case 1:
                bool = java.lang.Boolean.FALSE;
                break;
            case 2:
            case 3:
                bool = java.lang.Boolean.TRUE;
                break;
            default:
                return;
        }
        d(bool);
    }

    @Override // O2.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean b() {
        android.content.Intent intentRegisterReceiver = this.f8009b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return java.lang.Boolean.valueOf(j(intentRegisterReceiver));
        }
        I2.j.c().b(f8002i, "getInitialState - null intent received", new java.lang.Throwable[0]);
        return null;
    }
}
