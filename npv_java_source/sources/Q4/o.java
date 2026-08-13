package Q4;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f9051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f9053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f9054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f9055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f9056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f9057g;

    private o(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Q3.AbstractC1477p.p(!V3.r.b(str), "ApplicationId must be set.");
        this.f9052b = str;
        this.f9051a = str2;
        this.f9053c = str3;
        this.f9054d = str4;
        this.f9055e = str5;
        this.f9056f = str6;
        this.f9057g = str7;
    }

    public static Q4.o a(android.content.Context context) {
        Q3.C1479s c1479s = new Q3.C1479s(context);
        java.lang.String strA = c1479s.a("google_app_id");
        if (android.text.TextUtils.isEmpty(strA)) {
            return null;
        }
        return new Q4.o(strA, c1479s.a("google_api_key"), c1479s.a("firebase_database_url"), c1479s.a("ga_trackingId"), c1479s.a("gcm_defaultSenderId"), c1479s.a("google_storage_bucket"), c1479s.a("project_id"));
    }

    public java.lang.String b() {
        return this.f9051a;
    }

    public java.lang.String c() {
        return this.f9052b;
    }

    public java.lang.String d() {
        return this.f9055e;
    }

    public java.lang.String e() {
        return this.f9057g;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Q4.o)) {
            return false;
        }
        Q4.o oVar = (Q4.o) obj;
        return Q3.AbstractC1475n.a(this.f9052b, oVar.f9052b) && Q3.AbstractC1475n.a(this.f9051a, oVar.f9051a) && Q3.AbstractC1475n.a(this.f9053c, oVar.f9053c) && Q3.AbstractC1475n.a(this.f9054d, oVar.f9054d) && Q3.AbstractC1475n.a(this.f9055e, oVar.f9055e) && Q3.AbstractC1475n.a(this.f9056f, oVar.f9056f) && Q3.AbstractC1475n.a(this.f9057g, oVar.f9057g);
    }

    public int hashCode() {
        return Q3.AbstractC1475n.b(this.f9052b, this.f9051a, this.f9053c, this.f9054d, this.f9055e, this.f9056f, this.f9057g);
    }

    public java.lang.String toString() {
        return Q3.AbstractC1475n.c(this).a("applicationId", this.f9052b).a("apiKey", this.f9051a).a("databaseUrl", this.f9053c).a("gcmSenderId", this.f9055e).a("storageBucket", this.f9056f).a("projectId", this.f9057g).toString();
    }
}
