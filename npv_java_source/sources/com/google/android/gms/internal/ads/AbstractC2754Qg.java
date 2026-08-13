package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2754Qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4380lg f31029a = com.google.android.gms.internal.ads.C4380lg.d("gads:trustless_token_for_decagon:enabled", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4380lg f31030b;

    static {
        com.google.android.gms.internal.ads.C4380lg.d("gads:invalidate_token_at_refresh_start", true);
        com.google.android.gms.internal.ads.C4380lg.d("gms:expose_token_for_gma:enabled", true);
        com.google.android.gms.internal.ads.C4380lg.d("gads:referesh_rate_limit", false);
        f31030b = com.google.android.gms.internal.ads.C4380lg.b("gads:timeout_for_trustless_token:millis", 2000L);
        com.google.android.gms.internal.ads.C4380lg.d("gads:token_anonymization:enabled", true);
        com.google.android.gms.internal.ads.C4380lg.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
