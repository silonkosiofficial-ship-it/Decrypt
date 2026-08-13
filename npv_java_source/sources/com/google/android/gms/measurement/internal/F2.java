package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class F2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.InterfaceC5987d0 f41779C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final /* synthetic */ android.content.ServiceConnection f41780D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.G2 f41781E;

    F2(com.google.android.gms.measurement.internal.G2 g6, com.google.android.gms.internal.measurement.InterfaceC5987d0 interfaceC5987d0, android.content.ServiceConnection serviceConnection) {
        this.f41779C = interfaceC5987d0;
        this.f41780D = serviceConnection;
        this.f41781E = g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str;
        long j6;
        com.google.android.gms.measurement.internal.G2 g6 = this.f41781E;
        com.google.android.gms.measurement.internal.E2 e6 = g6.f41928b;
        java.lang.String str2 = g6.f41927a;
        com.google.android.gms.internal.measurement.InterfaceC5987d0 interfaceC5987d0 = this.f41779C;
        android.content.ServiceConnection serviceConnection = this.f41780D;
        android.os.Bundle bundleA = e6.a(str2, interfaceC5987d0);
        e6.f41776a.l().n();
        e6.f41776a.Q();
        if (bundleA != null) {
            long j10 = bundleA.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c6442p2G = e6.f41776a.j().L();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                java.lang.String string = bundleA.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c6442p2G = e6.f41776a.j().G();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    e6.f41776a.j().K().b("InstallReferrer API result", string);
                    boolean z6 = com.google.android.gms.internal.measurement.S6.a() && e6.f41776a.z().t(com.google.android.gms.measurement.internal.G.f41853V0);
                    android.os.Bundle bundleC = e6.f41776a.L().C(android.net.Uri.parse("?" + string), z6);
                    if (bundleC == null) {
                        c6442p2G = e6.f41776a.j().G();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        if (!z6) {
                            java.lang.String string2 = bundleC.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                j6 = bundleA.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j6 == 0) {
                                    c6442p2G = e6.f41776a.j().G();
                                    str = "Install Referrer is missing click timestamp for ad campaign";
                                }
                                bundleC.putLong("click_timestamp", j6);
                            }
                        } else if (bundleC.containsKey("gclid") || bundleC.containsKey("gbraid")) {
                            j6 = bundleA.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j6 > 0) {
                                bundleC.putLong("click_timestamp", j6);
                            }
                        }
                        if (j10 == e6.f41776a.F().f42729h.a()) {
                            e6.f41776a.j().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (e6.f41776a.p()) {
                            e6.f41776a.F().f42729h.b(j10);
                            e6.f41776a.j().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleC.putString("_cis", "referrer API v2");
                            e6.f41776a.H().i0("auto", "_cmp", bundleC, str2);
                        }
                    }
                }
            }
            c6442p2G.a(str);
        }
        if (serviceConnection != null) {
            U3.b.b().c(e6.f41776a.a(), serviceConnection);
        }
    }
}
