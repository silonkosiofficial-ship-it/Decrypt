package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4580nS implements com.google.android.gms.internal.ads.Y80 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f37597d = java.util.regex.Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f37598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E90 f37599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q90 f37600c;

    public C4580nS(java.lang.String str, com.google.android.gms.internal.ads.Q90 q90, com.google.android.gms.internal.ads.E90 e90) {
        this.f37598a = str;
        this.f37600c = q90;
        this.f37599b = e90;
    }

    @Override // com.google.android.gms.internal.ads.Y80
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) throws com.google.android.gms.internal.ads.C4688oQ {
        com.google.android.gms.internal.ads.C4688oQ c4688oQ;
        org.json.JSONObject jSONObject;
        java.lang.String strConcat;
        com.google.android.gms.internal.ads.C4470mS c4470mS = (com.google.android.gms.internal.ads.C4470mS) obj;
        int iOptInt = c4470mS.f37352a.optInt("http_timeout_millis", 60000);
        com.google.android.gms.internal.ads.C2804Ro c2804Ro = c4470mS.f37353b;
        java.lang.String strJoin = "";
        if (c2804Ro.a() != -2) {
            if (c2804Ro.a() == 1) {
                if (c2804Ro.h() != null) {
                    strJoin = android.text.TextUtils.join(", ", c2804Ro.h());
                    p224w3.p.d(strJoin);
                }
                c4688oQ = new com.google.android.gms.internal.ads.C4688oQ(2, "Error building request URL: ".concat(java.lang.String.valueOf(strJoin)));
            } else {
                c4688oQ = new com.google.android.gms.internal.ads.C4688oQ(1);
            }
            com.google.android.gms.internal.ads.Q90 q90 = this.f37600c;
            com.google.android.gms.internal.ads.E90 e90 = this.f37599b;
            e90.c(c4688oQ);
            e90.K0(false);
            q90.a(e90);
            throw c4688oQ;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (c4470mS.f37353b.j() && !android.text.TextUtils.isEmpty(this.f37598a)) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25482Z0)).booleanValue()) {
                java.lang.String str = this.f37598a;
                if (android.text.TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    java.util.regex.Matcher matcher = f37597d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        java.lang.String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            java.util.Locale locale = java.util.Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!android.text.TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.f37598a);
            }
        }
        if (c4470mS.f37353b.k() && (jSONObject = c4470mS.f37352a) != null) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!android.text.TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!android.text.TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                p214v3.AbstractC7265q0.k("DSID signal does not exist.");
            }
        }
        if (c4470mS.f37353b != null && !android.text.TextUtils.isEmpty(c4470mS.f37353b.f())) {
            strJoin = c4470mS.f37353b.f();
        }
        com.google.android.gms.internal.ads.Q90 q91 = this.f37600c;
        com.google.android.gms.internal.ads.E90 e91 = this.f37599b;
        e91.K0(true);
        q91.a(e91);
        return new com.google.android.gms.internal.ads.C4032iS(c4470mS.f37353b.g(), iOptInt, map, strJoin.getBytes(java.nio.charset.StandardCharsets.UTF_8), "", c4470mS.f37353b.k());
    }
}
