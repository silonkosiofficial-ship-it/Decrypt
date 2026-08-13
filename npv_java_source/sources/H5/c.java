package H5;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.io.File f4385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.f f4386b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(Q4.f fVar) {
        this.f4386b = fVar;
    }

    private java.io.File a() {
        if (this.f4385a == null) {
            synchronized (this) {
                try {
                    if (this.f4385a == null) {
                        this.f4385a = new java.io.File(this.f4386b.k().getFilesDir(), "PersistedInstallation." + this.f4386b.o() + ".json");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4385a;
    }

    private org.json.JSONObject c() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(a());
            while (true) {
                try {
                    int i6 = fileInputStream.read(bArr, 0, 16384);
                    if (i6 < 0) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i6);
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    public H5.d b(H5.d dVar) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            java.io.File fileCreateTempFile = java.io.File.createTempFile("PersistedInstallation", "tmp", this.f4386b.k().getFilesDir());
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(a())) {
                throw new java.io.IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
        }
        return dVar;
    }

    public H5.d d() {
        org.json.JSONObject jSONObjectC = c();
        java.lang.String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", H5.c.a.ATTEMPT_MIGRATION.ordinal());
        java.lang.String strOptString2 = jSONObjectC.optString("AuthToken", null);
        java.lang.String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return H5.d.a().d(strOptString).g(H5.c.a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}
