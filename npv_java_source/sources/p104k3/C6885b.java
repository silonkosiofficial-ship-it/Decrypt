package p104k3;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6885b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f49450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p104k3.C6885b f49452d;

    public C6885b(int i6, java.lang.String str, java.lang.String str2) {
        this(i6, str, str2, null);
    }

    public C6885b(int i6, java.lang.String str, java.lang.String str2, p104k3.C6885b c6885b) {
        this.f49449a = i6;
        this.f49450b = str;
        this.f49451c = str2;
        this.f49452d = c6885b;
    }

    public int a() {
        return this.f49449a;
    }

    public java.lang.String b() {
        return this.f49451c;
    }

    public java.lang.String c() {
        return this.f49450b;
    }

    public final p184s3.W0 d() {
        p184s3.W0 w6;
        p104k3.C6885b c6885b = this.f49452d;
        if (c6885b == null) {
            w6 = null;
        } else {
            java.lang.String str = c6885b.f49451c;
            w6 = new p184s3.W0(c6885b.f49449a, c6885b.f49450b, str, null, null);
        }
        return new p184s3.W0(this.f49449a, this.f49450b, this.f49451c, w6, null);
    }

    public org.json.JSONObject e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("Code", this.f49449a);
        jSONObject.put("Message", this.f49450b);
        jSONObject.put("Domain", this.f49451c);
        p104k3.C6885b c6885b = this.f49452d;
        jSONObject.put("Cause", c6885b == null ? "null" : c6885b.e());
        return jSONObject;
    }

    public java.lang.String toString() {
        try {
            return e().toString(2);
        } catch (org.json.JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
