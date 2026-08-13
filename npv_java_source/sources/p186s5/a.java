package p186s5;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.io.File f54357a;

    public a(p166q5.g gVar) {
        this.f54357a = gVar.g("com.crashlytics.settings.json");
    }

    private java.io.File a() {
        return this.f54357a;
    }

    public org.json.JSONObject b() throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        org.json.JSONObject jSONObject;
        p076h5.g.f().b("Checking for cached settings...");
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                java.io.File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new java.io.FileInputStream(fileA);
                    try {
                        jSONObject = new org.json.JSONObject(p106k5.AbstractC6898i.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        p076h5.g.f().e("Failed to fetch cached settings", e);
                        p106k5.AbstractC6898i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    p076h5.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                p106k5.AbstractC6898i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (java.lang.Throwable th2) {
                th = th2;
                p106k5.AbstractC6898i.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (java.lang.Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            p106k5.AbstractC6898i.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j6, org.json.JSONObject jSONObject) throws java.lang.Throwable {
        p076h5.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            java.io.FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j6);
                    java.io.FileWriter fileWriter2 = new java.io.FileWriter(a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        p106k5.AbstractC6898i.f(fileWriter2, "Failed to close settings writer.");
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        fileWriter = fileWriter2;
                        p076h5.g.f().e("Failed to cache settings", e);
                        p106k5.AbstractC6898i.f(fileWriter, "Failed to close settings writer.");
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        p106k5.AbstractC6898i.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Exception e10) {
                e = e10;
            }
        }
    }
}
