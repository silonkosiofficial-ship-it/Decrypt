package p186s5;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p106k5.B f54390a;

    h(p106k5.B b6) {
        this.f54390a = b6;
    }

    private static p186s5.i a(int i6) {
        if (i6 == 3) {
            return new p186s5.m();
        }
        p076h5.g.f().d("Could not determine SettingsJsonTransform for settings version " + i6 + ". Using default settings values.");
        return new p186s5.b();
    }

    public p186s5.d b(org.json.JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f54390a, jSONObject);
    }
}
