package O2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends O2.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.String f8004h = I2.j.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.BroadcastReceiver f8005g;

    class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent != null) {
                O2.c.this.h(context, intent);
            }
        }
    }

    public c(android.content.Context context, S2.a aVar) {
        super(context, aVar);
        this.f8005g = new O2.c.a();
    }

    @Override // O2.d
    public void e() {
        I2.j.c().a(f8004h, java.lang.String.format("%s: registering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.f8009b.registerReceiver(this.f8005g, g());
    }

    @Override // O2.d
    public void f() {
        I2.j.c().a(f8004h, java.lang.String.format("%s: unregistering receiver", getClass().getSimpleName()), new java.lang.Throwable[0]);
        this.f8009b.unregisterReceiver(this.f8005g);
    }

    public abstract android.content.IntentFilter g();

    public abstract void h(android.content.Context context, android.content.Intent intent);
}
