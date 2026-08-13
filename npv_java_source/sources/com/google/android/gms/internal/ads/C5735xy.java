package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5735xy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3588eO f39962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3558e70 f39963b;

    C5735xy(com.google.android.gms.internal.ads.C3588eO c3588eO, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f39962a = c3588eO;
        this.f39963b = c3558e70;
    }

    public final void a(long j6, int i6) {
        java.lang.String str;
        com.google.android.gms.internal.ads.C3479dO c3479dOA = this.f39962a.a();
        c3479dOA.d(this.f39963b.f34899b.f34448b);
        c3479dOA.b("action", "ad_closed");
        c3479dOA.b("show_time", java.lang.String.valueOf(j6));
        c3479dOA.b("ad_format", "app_open_ad");
        int i10 = i6 - 1;
        if (i10 == 0) {
            str = "h";
        } else if (i10 == 1) {
            str = "bb";
        } else if (i10 == 2) {
            str = "cc";
        } else if (i10 != 3) {
            str = i10 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        c3479dOA.b("acr", str);
        c3479dOA.g();
    }
}
