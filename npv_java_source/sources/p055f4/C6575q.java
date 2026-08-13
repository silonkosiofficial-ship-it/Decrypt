package p055f4;

/* JADX INFO: renamed from: f4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6575q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final p055f4.J0 f45227d = p055f4.J0.C("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f45229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f45230c;

    C6575q(android.app.Application application) {
        this.f45228a = application;
        android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f45229b = sharedPreferences;
        this.f45230c = new java.util.HashSet(sharedPreferences.getStringSet("written_values", java.util.Collections.emptySet()));
    }

    public final int a() {
        return this.f45229b.getInt("consent_status", 0);
    }

    public final L4.c.EnumC0153c b() {
        return L4.c.EnumC0153c.valueOf(this.f45229b.getString("privacy_options_requirement_status", L4.c.EnumC0153c.UNKNOWN.name()));
    }

    public final java.util.Map c() {
        java.lang.String strValueOf;
        java.lang.String str;
        java.lang.String string;
        java.util.Set<java.lang.String> stringSet = this.f45229b.getStringSet("stored_info", p055f4.J0.w());
        if (stringSet.isEmpty()) {
            stringSet = f45227d;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str2 : stringSet) {
            android.app.Application application = this.f45228a;
            p055f4.C6576q0 c6576q0A = p055f4.AbstractC6579s0.a(application, str2);
            if (c6576q0A == null) {
                strValueOf = java.lang.String.valueOf(str2);
                str = "Fetching request info: failed for key: ";
            } else {
                java.lang.Object obj = application.getSharedPreferences(c6576q0A.f45231a, 0).getAll().get(c6576q0A.f45232b);
                if (obj == null) {
                    strValueOf = java.lang.String.valueOf(str2);
                    str = "Stored info not exists: ";
                } else {
                    if (obj instanceof java.lang.Boolean) {
                        string = true != ((java.lang.Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof java.lang.Number) {
                        string = obj.toString();
                    } else if (obj instanceof java.lang.String) {
                        string = (java.lang.String) obj;
                    } else {
                        strValueOf = java.lang.String.valueOf(str2);
                        str = "Failed to fetch stored info: ";
                    }
                    map.put(str2, string);
                }
            }
            str.concat(strValueOf);
        }
        return map;
    }

    public final java.util.Set d() {
        return this.f45230c;
    }

    public final void e() {
        this.f45229b.edit().putStringSet("written_values", this.f45230c).apply();
    }

    public final void f(int i6) {
        this.f45229b.edit().putInt("consent_status", i6).apply();
    }

    public final void g(boolean z6) {
        this.f45229b.edit().putBoolean("is_pub_misconfigured", z6).apply();
    }

    public final void h(L4.c.EnumC0153c enumC0153c) {
        this.f45229b.edit().putString("privacy_options_requirement_status", enumC0153c.name()).apply();
    }

    public final void i(java.util.Set set) {
        this.f45229b.edit().putStringSet("stored_info", set).apply();
    }

    public final boolean j() {
        return this.f45229b.getBoolean("is_pub_misconfigured", false);
    }
}
