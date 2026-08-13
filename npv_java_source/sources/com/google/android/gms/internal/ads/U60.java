package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class U60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f32113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f32114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f32117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f32119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f32121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.T60 f32122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.os.Bundle f32123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f32124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f32125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f32126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final org.json.JSONObject f32127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final org.json.JSONObject f32128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f32129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f32130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f32131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f32132t;

    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    U60(android.util.JsonReader jsonReader) throws java.io.IOException {
        int iIntValue;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        java.lang.String strNextString2 = "";
        java.lang.String strNextString3 = strNextString2;
        java.lang.String strNextString4 = strNextString3;
        java.lang.String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        com.google.android.gms.internal.ads.T60 t60 = null;
        long jA = -1;
        long jA2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        java.lang.String strNextString6 = strNextString5;
        java.lang.String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (j$.util.Objects.equals(strNextName, "nofill_urls")) {
                listEmptyList = p214v3.V.d(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (j$.util.Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                java.lang.String str = strNextString3;
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25576h8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT) {
                    t60 = new com.google.android.gms.internal.ads.T60(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.na)).booleanValue() && j$.util.Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25257E6)).booleanValue()) {
                            try {
                                try {
                                    android.os.Bundle bundleA = p214v3.V.a(p214v3.V.i(jsonReader));
                                    if (bundleA != null) {
                                        bundle = bundleA;
                                    }
                                } catch (java.lang.IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (java.io.IOException | org.json.JSONException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25577h9)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25577h9)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25588i9;
                        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && j$.util.Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && j$.util.Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = p214v3.V.i(jsonReader);
                        } else if (j$.util.Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = java.lang.Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25660p9)).booleanValue() && j$.util.Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = p214v3.V.i(jsonReader);
                            } else {
                                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25614l2)).booleanValue() && j$.util.Objects.equals(strNextName, "latency_extras")) {
                                    android.os.Bundle bundleA2 = p214v3.V.a(p214v3.V.i(jsonReader));
                                    if (bundleA2 != null) {
                                        jA2 = a(bundleA2.getDouble("start_time"));
                                        jA = a(bundleA2.getDouble("end_time"));
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                strNextString3 = str;
            }
        }
        java.lang.String str2 = strNextString3;
        jsonReader.endObject();
        this.f32113a = listEmptyList;
        this.f32115c = iNextInt;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2459Ig.f28489c.e()).booleanValue()) {
            com.google.android.gms.internal.ads.C4380lg c4380lg = com.google.android.gms.internal.ads.AbstractC4820pg.f38045a;
            if (((java.lang.Long) c4380lg.e()).longValue() > -1) {
                iIntValue = ((java.lang.Long) c4380lg.e()).intValue();
            } else {
                this.f32116d = iNextInt3;
            }
            this.f32114b = strNextString;
            this.f32117e = strNextString6;
            this.f32118f = iNextInt2;
            this.f32119g = jNextLong;
            this.f32122j = t60;
            this.f32120h = zNextBoolean;
            this.f32121i = strNextString7;
            this.f32123k = bundle;
            this.f32124l = strNextString4;
            this.f32125m = strNextString5;
            this.f32126n = strNextString2;
            this.f32127o = jSONObject;
            this.f32128p = jSONObject2;
            this.f32129q = str2;
            com.google.android.gms.internal.ads.C4380lg c4380lg2 = com.google.android.gms.internal.ads.AbstractC2385Gg.f27864a;
            this.f32130r = ((java.lang.Long) c4380lg2.e()).longValue() > 0 ? ((java.lang.Long) c4380lg2.e()).intValue() : iMax;
            this.f32131s = jA2;
            this.f32132t = jA;
        }
        iIntValue = -1;
        this.f32116d = iIntValue;
        this.f32114b = strNextString;
        this.f32117e = strNextString6;
        this.f32118f = iNextInt2;
        this.f32119g = jNextLong;
        this.f32122j = t60;
        this.f32120h = zNextBoolean;
        this.f32121i = strNextString7;
        this.f32123k = bundle;
        this.f32124l = strNextString4;
        this.f32125m = strNextString5;
        this.f32126n = strNextString2;
        this.f32127o = jSONObject;
        this.f32128p = jSONObject2;
        this.f32129q = str2;
        com.google.android.gms.internal.ads.C4380lg c4380lg3 = com.google.android.gms.internal.ads.AbstractC2385Gg.f27864a;
        this.f32130r = ((java.lang.Long) c4380lg3.e()).longValue() > 0 ? ((java.lang.Long) c4380lg3.e()).intValue() : iMax;
        this.f32131s = jA2;
        this.f32132t = jA;
    }

    private static final long a(double d6) {
        if (d6 > 9.223372036854776E18d || d6 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d6;
    }
}
