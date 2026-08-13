package I5;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.regex.Pattern f5076d = java.util.regex.Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.nio.charset.Charset f5077e = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f5078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F5.b f5079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I5.e f5080c = new I5.e();

    public c(android.content.Context context, F5.b bVar) {
        this.f5078a = context;
        this.f5079b = bVar;
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (android.text.TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return java.lang.String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static org.json.JSONObject b(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (org.json.JSONException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    private static org.json.JSONObject c() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (org.json.JSONException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    private java.lang.String f() {
        try {
            android.content.Context context = this.f5078a;
            byte[] bArrA = V3.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return V3.k.b(bArrA, false);
            }
            java.lang.String str = "Could not get fingerprint hash for package: " + this.f5078a.getPackageName();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            java.lang.String str2 = "No such package: " + this.f5078a.getPackageName();
            return null;
        }
    }

    private java.net.URL g(java.lang.String str) throws com.google.firebase.installations.d {
        try {
            return new java.net.URL(java.lang.String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (java.net.MalformedURLException e6) {
            throw new com.google.firebase.installations.d(e6.getMessage(), com.google.firebase.installations.d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(org.json.JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int i6) {
        return i6 >= 200 && i6 < 300;
    }

    private static void j() {
    }

    private static void k(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(o(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    private java.net.HttpURLConnection l(java.net.URL url, java.lang.String str) throws com.google.firebase.installations.d {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f5078a.getPackageName());
            E5.i iVar = (E5.i) this.f5079b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (java.lang.String) p115l4.AbstractC6934o.a(iVar.a()));
                } catch (java.lang.InterruptedException e6) {
                    java.lang.Thread.currentThread().interrupt();
                } catch (java.util.concurrent.ExecutionException e10) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (java.io.IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
        }
    }

    static long m(java.lang.String str) {
        Q3.AbstractC1477p.b(f5076d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return java.lang.Long.parseLong(str.substring(0, str.length() - 1));
    }

    private I5.d n(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, f5077e));
        I5.f.a aVarA = I5.f.a();
        I5.d.a aVarA2 = I5.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(I5.d.b.OK).a();
    }

    private static java.lang.String o(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(errorStream, f5077e));
        try {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                java.lang.String str = java.lang.String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", java.lang.Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                }
                return str;
            } catch (java.io.IOException unused2) {
            }
        } catch (java.io.IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused4) {
            }
            throw th;
        }
    }

    private I5.f p(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, f5077e));
        I5.f.a aVarA = I5.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(I5.f.b.OK).a();
    }

    private void q(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        s(httpURLConnection, h(c()));
    }

    private static void s(java.net.URLConnection uRLConnection, byte[] bArr) throws java.io.IOException {
        java.io.OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public I5.d d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) throws com.google.firebase.installations.d {
        I5.d dVarN;
        if (!this.f5080c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
        }
        java.net.URL urlG = g(java.lang.String.format("projects/%s/installations", str3));
        for (int i6 = 0; i6 <= 1; i6++) {
            android.net.TrafficStats.setThreadStatsTag(32769);
            java.net.HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionL.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(httpURLConnectionL, str2, str4);
                    int responseCode = httpURLConnectionL.getResponseCode();
                    this.f5080c.f(responseCode);
                    if (i(responseCode)) {
                        dVarN = n(httpURLConnectionL);
                    } else {
                        k(httpURLConnectionL, str4, str, str3);
                        if (responseCode == 429) {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            dVarN = I5.d.a().e(I5.d.b.BAD_CONFIG).a();
                        }
                        httpURLConnectionL.disconnect();
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionL.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    return dVarN;
                } catch (java.io.IOException | java.lang.AssertionError unused) {
                }
            } catch (java.lang.Throwable th) {
                httpURLConnectionL.disconnect();
                android.net.TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
    }

    public I5.f e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws com.google.firebase.installations.d {
        java.net.HttpURLConnection httpURLConnectionL;
        I5.f fVarP;
        I5.f.a aVarB;
        int i6 = 0;
        if (!this.f5080c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
        }
        java.net.URL urlG = g(java.lang.String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        while (true) {
            if (i6 > 1) {
                throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
            }
            android.net.TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionL.setDoOutput(true);
                    r(httpURLConnectionL);
                    int responseCode = httpURLConnectionL.getResponseCode();
                    this.f5080c.f(responseCode);
                    if (!i(responseCode)) {
                        k(httpURLConnectionL, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            aVarB = I5.f.a().b(I5.f.b.AUTH_ERROR);
                        } else {
                            if (responseCode == 429) {
                                throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.d.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                j();
                                aVarB = I5.f.a().b(I5.f.b.BAD_CONFIG);
                            }
                            httpURLConnectionL.disconnect();
                            android.net.TrafficStats.clearThreadStatsTag();
                            i6++;
                        }
                        fVarP = aVarB.a();
                        break;
                    }
                    fVarP = p(httpURLConnectionL);
                    break;
                } catch (java.lang.Throwable th) {
                    httpURLConnectionL.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (java.io.IOException | java.lang.AssertionError unused) {
            }
        }
        httpURLConnectionL.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
        return fVarP;
    }
}
