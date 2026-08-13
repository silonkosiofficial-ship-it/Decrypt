package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p224w3.y f56265a;

    private w(p224w3.y yVar) {
        this.f56265a = yVar;
    }

    public static p224w3.w a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new p224w3.w(jSONObjectOptJSONObject == null ? new p224w3.o(1, 0, 1.0d, false) : new p224w3.o(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final p224w3.y b() {
        return this.f56265a;
    }
}
