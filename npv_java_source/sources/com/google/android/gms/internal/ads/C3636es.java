package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636es {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f35081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f35082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f35083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f35084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f35085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f35086n;

    public C3636es(java.lang.String str) {
        org.json.JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused) {
            }
        }
        this.f35073a = a(jSONObject, "aggressive_media_codec_release", com.google.android.gms.internal.ads.AbstractC2161Af.f25437V);
        this.f35074b = b(jSONObject, "byte_buffer_precache_limit", com.google.android.gms.internal.ads.AbstractC2161Af.f25579i);
        this.f35075c = b(jSONObject, "exo_cache_buffer_size", com.google.android.gms.internal.ads.AbstractC2161Af.f25681s);
        this.f35076d = b(jSONObject, "exo_connect_timeout_millis", com.google.android.gms.internal.ads.AbstractC2161Af.f25535e);
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25524d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (org.json.JSONException unused2) {
            }
        }
        this.f35077e = b(jSONObject, "exo_read_timeout_millis", com.google.android.gms.internal.ads.AbstractC2161Af.f25546f);
        this.f35078f = b(jSONObject, "load_check_interval_bytes", com.google.android.gms.internal.ads.AbstractC2161Af.f25557g);
        this.f35079g = b(jSONObject, "player_precache_limit", com.google.android.gms.internal.ads.AbstractC2161Af.f25568h);
        this.f35080h = b(jSONObject, "socket_receive_buffer_size", com.google.android.gms.internal.ads.AbstractC2161Af.f25590j);
        this.f35081i = a(jSONObject, "use_cache_data_source", com.google.android.gms.internal.ads.AbstractC2161Af.f25656p4);
        b(jSONObject, "min_retry_count", com.google.android.gms.internal.ads.AbstractC2161Af.f25601k);
        this.f35082j = a(jSONObject, "treat_load_exception_as_non_fatal", com.google.android.gms.internal.ads.AbstractC2161Af.f25621m);
        this.f35083k = a(jSONObject, "enable_multiple_video_playback", com.google.android.gms.internal.ads.AbstractC2161Af.f25483Z1);
        this.f35084l = a(jSONObject, "use_range_http_data_source", com.google.android.gms.internal.ads.AbstractC2161Af.f25505b2);
        this.f35085m = c(jSONObject, "range_http_data_source_high_water_mark", com.google.android.gms.internal.ads.AbstractC2161Af.f25516c2);
        this.f35086n = c(jSONObject, "range_http_data_source_low_water_mark", com.google.android.gms.internal.ads.AbstractC2161Af.f25527d2);
    }

    private static final boolean a(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (org.json.JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int b(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (org.json.JSONException unused) {
            }
        }
        return ((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue();
    }

    private static final long c(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (org.json.JSONException unused) {
            }
        }
        return ((java.lang.Long) p184s3.A.c().a(abstractC5037rf)).longValue();
    }
}
