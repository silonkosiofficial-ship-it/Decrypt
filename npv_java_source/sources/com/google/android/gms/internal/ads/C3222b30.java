package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3222b30 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f34201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f34202b;

    public C3222b30(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f34201a = yk0;
        this.f34202b = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f34201a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.a30
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f33998a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.Z20 c() {
        boolean zIsActiveNetworkMetered;
        int i6;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.f34202b.getSystemService("phone");
        java.lang.String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        p174r3.v.t();
        int i10 = -1;
        if (p214v3.E0.b(this.f34202b, "android.permission.ACCESS_NETWORK_STATE")) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.f34202b.getSystemService("connectivity");
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i6 = type;
                i10 = iOrdinal;
            } else {
                i6 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i6 = -2;
        }
        return new com.google.android.gms.internal.ads.Z20(networkOperator, i6, p174r3.v.u().k(this.f34202b), phoneType, zIsActiveNetworkMetered, i10);
    }
}
