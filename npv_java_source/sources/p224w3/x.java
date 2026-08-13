package p224w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static p224w3.x d(org.json.JSONObject jSONObject) {
        return new p224w3.n(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c();
}
