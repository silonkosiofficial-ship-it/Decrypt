package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f29784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f29785b;

    MZ(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f29784a = yk0;
        this.f29785b = context;
    }

    private final android.content.Intent d() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? this.f29785b.registerReceiver(null, intentFilter) : this.f29785b.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean e(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f29784a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.KZ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f28947a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.NZ c() {
        double intExtra;
        boolean zIsCharging;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Tb)).booleanValue()) {
            android.os.BatteryManager batteryManager = (android.os.BatteryManager) this.f29785b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : e(d());
        } else {
            android.content.Intent intentD = d();
            boolean zE = e(intentD);
            intExtra = intentD != null ? ((double) intentD.getIntExtra("level", -1)) / ((double) intentD.getIntExtra("scale", -1)) : -1.0d;
            zIsCharging = zE;
        }
        return new com.google.android.gms.internal.ads.NZ(intExtra, zIsCharging);
    }
}
