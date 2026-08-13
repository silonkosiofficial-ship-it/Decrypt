package O2;

/* JADX INFO: loaded from: classes.dex */
public class g extends O2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String f8021i = I2.j.f("StorageNotLowTracker");

    public g(android.content.Context context, S2.a aVar) {
        super(context, aVar);
    }

    @Override // O2.c
    public android.content.IntentFilter g() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // O2.c
    public void h(android.content.Context context, android.content.Intent intent) {
        java.lang.Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        I2.j.c().a(f8021i, java.lang.String.format("Received %s", intent.getAction()), new java.lang.Throwable[0]);
        java.lang.String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = java.lang.Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = java.lang.Boolean.TRUE;
        }
        d(bool);
    }

    @Override // O2.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean b() {
        android.content.Intent intentRegisterReceiver = this.f8009b.registerReceiver(null, g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return java.lang.Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }
}
