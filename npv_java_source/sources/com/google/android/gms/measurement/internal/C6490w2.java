package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6490w2 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.H5 f42676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42678c;

    C6490w2(com.google.android.gms.measurement.internal.H5 h6) {
        Q3.AbstractC1477p.l(h6);
        this.f42676a = h6;
    }

    public final void b() {
        this.f42676a.A0();
        this.f42676a.l().n();
        if (this.f42677b) {
            return;
        }
        this.f42676a.a().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f42678c = this.f42676a.p0().C();
        this.f42676a.j().K().b("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.f42678c));
        this.f42677b = true;
    }

    public final void c() {
        this.f42676a.A0();
        this.f42676a.l().n();
        this.f42676a.l().n();
        if (this.f42677b) {
            this.f42676a.j().K().a("Unregistering connectivity change receiver");
            this.f42677b = false;
            this.f42678c = false;
            try {
                this.f42676a.a().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e6) {
                this.f42676a.j().G().b("Failed to unregister the network broadcast receiver", e6);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f42676a.A0();
        java.lang.String action = intent.getAction();
        this.f42676a.j().K().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f42676a.j().L().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zC = this.f42676a.p0().C();
        if (this.f42678c != zC) {
            this.f42678c = zC;
            this.f42676a.l().D(new com.google.android.gms.measurement.internal.RunnableC6483v2(this, zC));
        }
    }
}
