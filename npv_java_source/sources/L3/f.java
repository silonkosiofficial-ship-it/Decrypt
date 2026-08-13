package L3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final T3.a f6199E = new T3.a("RevokeAccessOperation", new java.lang.String[0]);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f6200C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final P3.l f6201D = new P3.l(null);

    public f(java.lang.String str) {
        this.f6200C = Q3.AbstractC1477p.f(str);
    }

    public static O3.g a(java.lang.String str) {
        if (str == null) {
            return O3.h.a(new com.google.android.gms.common.api.Status(4), null);
        }
        L3.f fVar = new L3.f(str);
        new java.lang.Thread(fVar).start();
        return fVar.f6201D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.f24847J;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f6200C).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.f24845H;
            } else {
                f6199E.b("Unable to revoke access!", new java.lang.Object[0]);
            }
            f6199E.a("Response Code: " + responseCode, new java.lang.Object[0]);
        } catch (java.io.IOException e6) {
            f6199E.b("IOException when revoking access: ".concat(java.lang.String.valueOf(e6.toString())), new java.lang.Object[0]);
        } catch (java.lang.Exception e10) {
            f6199E.b("Exception when revoking access: ".concat(java.lang.String.valueOf(e10.toString())), new java.lang.Object[0]);
        }
        this.f6201D.f(status);
    }
}
