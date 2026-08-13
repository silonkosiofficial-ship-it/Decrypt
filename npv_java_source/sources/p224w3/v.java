package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p224w3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f56264a;

    public v(java.lang.String str) {
        this.f56264a = str;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f7 A[PHI: r1
  0x00f7: PHI (r1v6 w3.u) = (r1v0 w3.u), (r1v4 w3.u), (r1v9 w3.u) binds: [B:43:0x00f5, B:39:0x00d0, B:29:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p224w3.f
    public final p224w3.u o(java.lang.String str) {
        p224w3.u uVar = p224w3.u.PERMANENT_FAILURE;
        try {
            try {
                if (V3.e.a()) {
                    android.net.TrafficStats.setThreadStatsTag(263);
                }
                p224w3.p.b("Pinging URL: " + str);
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URI(str).toURL().openConnection();
                try {
                    p184s3.C7147y.b();
                    java.lang.String str2 = this.f56264a;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    p224w3.m mVar = new p224w3.m(null);
                    mVar.c(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    mVar.e(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        p224w3.p.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                        if (responseCode == 502) {
                            uVar = p224w3.u.RETRIABLE_FAILURE;
                        }
                    } else {
                        uVar = p224w3.u.SUCCESS;
                    }
                    httpURLConnection.disconnect();
                    if (V3.e.a()) {
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                if (V3.e.a()) {
                    android.net.TrafficStats.clearThreadStatsTag();
                }
                throw th2;
            }
        } catch (java.io.IOException e6) {
            e = e6;
            p224w3.p.g("Error while pinging URL: " + str + ". " + e.getMessage());
            uVar = p224w3.u.RETRIABLE_FAILURE;
            if (V3.e.a()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.lang.IndexOutOfBoundsException e10) {
            e = e10;
            p224w3.p.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            if (V3.e.a()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.lang.RuntimeException e11) {
            e = e11;
            p224w3.p.g("Error while pinging URL: " + str + ". " + e.getMessage());
            uVar = p224w3.u.RETRIABLE_FAILURE;
            if (V3.e.a()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        } catch (java.net.URISyntaxException e12) {
            e = e12;
            p224w3.p.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            if (V3.e.a()) {
                android.net.TrafficStats.clearThreadStatsTag();
            }
        }
        return uVar;
    }
}
