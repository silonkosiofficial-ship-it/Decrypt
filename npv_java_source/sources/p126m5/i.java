package p126m5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5.a f51170a = new B5.d().j(p126m5.a.f51124a).i();

    static p126m5.i a(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static p126m5.i b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j6) {
        return new p126m5.b(str, str2, i(str3), str4, j6);
    }

    private static java.lang.String i(java.lang.String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract java.lang.String c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public abstract long f();

    public abstract java.lang.String g();

    public n5.F.e.d.AbstractC0666e h() {
        return n5.F.e.d.AbstractC0666e.a().d(n5.F.e.d.AbstractC0666e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
