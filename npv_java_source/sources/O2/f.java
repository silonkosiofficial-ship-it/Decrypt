package O2;

/* JADX INFO: loaded from: classes.dex */
public class f extends O2.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final java.lang.String f8015j = I2.j.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.net.ConnectivityManager f8016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private O2.f.b f8017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private O2.f.a f8018i;

    private class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            I2.j.c().a(O2.f.f8015j, "Network broadcast received", new java.lang.Throwable[0]);
            O2.f fVar = O2.f.this;
            fVar.d(fVar.g());
        }
    }

    private class b extends android.net.ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            I2.j.c().a(O2.f.f8015j, java.lang.String.format("Network capabilities changed: %s", networkCapabilities), new java.lang.Throwable[0]);
            O2.f fVar = O2.f.this;
            fVar.d(fVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            I2.j.c().a(O2.f.f8015j, "Network connection lost", new java.lang.Throwable[0]);
            O2.f fVar = O2.f.this;
            fVar.d(fVar.g());
        }
    }

    public f(android.content.Context context, S2.a aVar) {
        super(context, aVar);
        this.f8016g = (android.net.ConnectivityManager) this.f8009b.getSystemService("connectivity");
        if (j()) {
            this.f8017h = new O2.f.b();
        } else {
            this.f8018i = new O2.f.a();
        }
    }

    private static boolean j() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    @Override // O2.d
    public void e() {
        if (!j()) {
            I2.j.c().a(f8015j, "Registering broadcast receiver", new java.lang.Throwable[0]);
            this.f8009b.registerReceiver(this.f8018i, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            I2.j.c().a(f8015j, "Registering network callback", new java.lang.Throwable[0]);
            this.f8016g.registerDefaultNetworkCallback(this.f8017h);
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e6) {
            I2.j.c().b(f8015j, "Received exception while registering network callback", e6);
        }
    }

    @Override // O2.d
    public void f() {
        if (!j()) {
            I2.j.c().a(f8015j, "Unregistering broadcast receiver", new java.lang.Throwable[0]);
            this.f8009b.unregisterReceiver(this.f8018i);
            return;
        }
        try {
            I2.j.c().a(f8015j, "Unregistering network callback", new java.lang.Throwable[0]);
            this.f8016g.unregisterNetworkCallback(this.f8017h);
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e6) {
            I2.j.c().b(f8015j, "Received exception while unregistering network callback", e6);
        }
    }

    M2.b g() {
        android.net.NetworkInfo activeNetworkInfo = this.f8016g.getActiveNetworkInfo();
        boolean z6 = false;
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zA = p232x1.a.a(this.f8016g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z6 = true;
        }
        return new M2.b(z10, zI, zA, z6);
    }

    @Override // O2.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public M2.b b() {
        return g();
    }

    boolean i() {
        try {
            android.net.NetworkCapabilities networkCapabilities = this.f8016g.getNetworkCapabilities(this.f8016g.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (java.lang.SecurityException e6) {
            I2.j.c().b(f8015j, "Unable to validate active network", e6);
            return false;
        }
    }
}
