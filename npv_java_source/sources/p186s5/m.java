package p186s5;

/* JADX INFO: loaded from: classes3.dex */
class m implements p186s5.i {
    m() {
    }

    private static s5.d.a b(org.json.JSONObject jSONObject) {
        return new s5.d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static s5.d.b c(org.json.JSONObject jSONObject) {
        return new s5.d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(p106k5.B b6, long j6, org.json.JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : b6.a() + (j6 * 1000);
    }

    @Override // p186s5.i
    public p186s5.d a(p106k5.B b6, org.json.JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new p186s5.d(d(b6, iOptInt2, jSONObject), c(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new org.json.JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
