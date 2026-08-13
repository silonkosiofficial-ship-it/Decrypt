package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Date f44110h = new java.util.Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f44111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.json.JSONObject f44112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Date f44113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.json.JSONArray f44114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.json.JSONObject f44115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f44116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.json.JSONArray f44117g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.json.JSONObject f44118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Date f44119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private org.json.JSONArray f44120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private org.json.JSONObject f44121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private org.json.JSONArray f44123f;

        private b() {
            this.f44118a = new org.json.JSONObject();
            this.f44119b = com.google.firebase.remoteconfig.internal.g.f44110h;
            this.f44120c = new org.json.JSONArray();
            this.f44121d = new org.json.JSONObject();
            this.f44122e = 0L;
            this.f44123f = new org.json.JSONArray();
        }

        public com.google.firebase.remoteconfig.internal.g a() {
            return new com.google.firebase.remoteconfig.internal.g(this.f44118a, this.f44119b, this.f44120c, this.f44121d, this.f44122e, this.f44123f);
        }

        public com.google.firebase.remoteconfig.internal.g.b b(java.util.Map map) {
            this.f44118a = new org.json.JSONObject(map);
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b c(org.json.JSONObject jSONObject) {
            try {
                this.f44118a = new org.json.JSONObject(jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b d(org.json.JSONArray jSONArray) {
            try {
                this.f44120c = new org.json.JSONArray(jSONArray.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b e(java.util.Date date) {
            this.f44119b = date;
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b f(org.json.JSONObject jSONObject) {
            try {
                this.f44121d = new org.json.JSONObject(jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b g(org.json.JSONArray jSONArray) {
            try {
                this.f44123f = new org.json.JSONArray(jSONArray.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.g.b h(long j6) {
            this.f44122e = j6;
            return this;
        }
    }

    private g(org.json.JSONObject jSONObject, java.util.Date date, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject2, long j6, org.json.JSONArray jSONArray2) throws org.json.JSONException {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j6);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f44112b = jSONObject;
        this.f44113c = date;
        this.f44114d = jSONArray;
        this.f44115e = jSONObject2;
        this.f44116f = j6;
        this.f44117g = jSONArray2;
        this.f44111a = jSONObject3;
    }

    static com.google.firebase.remoteconfig.internal.g b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = jSONObjectOptJSONObject;
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new org.json.JSONArray();
        }
        return new com.google.firebase.remoteconfig.internal.g(jSONObject.getJSONObject("configs_key"), new java.util.Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private java.util.Map c() throws org.json.JSONException {
        java.util.HashMap map = new java.util.HashMap();
        for (int i6 = 0; i6 < j().length(); i6++) {
            org.json.JSONObject jSONObject = j().getJSONObject(i6);
            java.lang.String string = jSONObject.getString("rolloutId");
            java.lang.String string2 = jSONObject.getString("variantId");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                java.lang.String string3 = jSONArray.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new java.util.HashMap());
                }
                java.util.Map map2 = (java.util.Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static com.google.firebase.remoteconfig.internal.g d(org.json.JSONObject jSONObject) {
        return b(new org.json.JSONObject(jSONObject.toString()));
    }

    public static com.google.firebase.remoteconfig.internal.g.b l() {
        return new com.google.firebase.remoteconfig.internal.g.b();
    }

    public org.json.JSONArray e() {
        return this.f44114d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.firebase.remoteconfig.internal.g) {
            return this.f44111a.toString().equals(((com.google.firebase.remoteconfig.internal.g) obj).toString());
        }
        return false;
    }

    public java.util.Set f(com.google.firebase.remoteconfig.internal.g gVar) throws org.json.JSONException {
        org.json.JSONObject jSONObjectG = d(gVar.f44111a).g();
        java.util.Map mapC = c();
        java.util.Map mapC2 = gVar.c();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.lang.String> itKeys = g().keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (gVar.g().has(next) && g().get(next).equals(gVar.g().get(next)) && ((!i().has(next) || gVar.i().has(next)) && ((i().has(next) || !gVar.i().has(next)) && !((i().has(next) && gVar.i().has(next) && !i().getJSONObject(next).toString().equals(gVar.i().getJSONObject(next).toString())) || mapC.containsKey(next) != mapC2.containsKey(next) || (mapC.containsKey(next) && mapC2.containsKey(next) && !((java.util.Map) mapC.get(next)).equals(mapC2.get(next))))))) {
                jSONObjectG.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        java.util.Iterator<java.lang.String> itKeys2 = jSONObjectG.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public org.json.JSONObject g() {
        return this.f44112b;
    }

    public java.util.Date h() {
        return this.f44113c;
    }

    public int hashCode() {
        return this.f44111a.hashCode();
    }

    public org.json.JSONObject i() {
        return this.f44115e;
    }

    public org.json.JSONArray j() {
        return this.f44117g;
    }

    public long k() {
        return this.f44116f;
    }

    public java.lang.String toString() {
        return this.f44111a.toString();
    }
}
