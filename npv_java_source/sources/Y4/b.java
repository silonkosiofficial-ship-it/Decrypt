package Y4;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends V4.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f16352d = "Y4.b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f16353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16355c;

    b(java.lang.String str, long j6) {
        this(str, j6, new Z4.a.C0312a().a());
    }

    b(java.lang.String str, long j6, long j10) {
        Q3.AbstractC1477p.f(str);
        this.f16353a = str;
        this.f16355c = j6;
        this.f16354b = j10;
    }

    public static Y4.b c(Y4.a aVar) {
        long jG;
        Q3.AbstractC1477p.l(aVar);
        try {
            jG = (long) (java.lang.Double.parseDouble(aVar.b().replace("s", "")) * 1000.0d);
        } catch (java.lang.NumberFormatException unused) {
            java.util.Map mapB = Z4.c.b(aVar.c());
            jG = 1000 * (g(mapB, "exp") - g(mapB, "iat"));
        }
        return new Y4.b(aVar.c(), jG);
    }

    public static Y4.b d(java.lang.String str) {
        Q3.AbstractC1477p.l(str);
        java.util.Map mapB = Z4.c.b(str);
        long jG = g(mapB, "iat");
        return new Y4.b(str, (g(mapB, "exp") - jG) * 1000, jG * 1000);
    }

    static Y4.b e(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return new Y4.b(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (org.json.JSONException e6) {
            java.lang.String str2 = f16352d;
            java.lang.String str3 = "Could not deserialize token: " + e6.getMessage();
            return null;
        }
    }

    private static long g(java.util.Map map, java.lang.String str) {
        Q3.AbstractC1477p.l(map);
        Q3.AbstractC1477p.f(str);
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // V4.c
    public long a() {
        return this.f16354b + this.f16355c;
    }

    @Override // V4.c
    public java.lang.String b() {
        return this.f16353a;
    }

    long f() {
        return this.f16355c;
    }

    long h() {
        return this.f16354b;
    }

    java.lang.String i() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("token", this.f16353a);
            jSONObject.put("receivedAt", this.f16354b);
            jSONObject.put("expiresIn", this.f16355c);
            return jSONObject.toString();
        } catch (org.json.JSONException e6) {
            java.lang.String str = f16352d;
            java.lang.String str2 = "Could not serialize token: " + e6.getMessage();
            return null;
        }
    }
}
