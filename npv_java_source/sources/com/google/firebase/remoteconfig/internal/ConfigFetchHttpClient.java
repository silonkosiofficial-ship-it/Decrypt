package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.regex.Pattern f44075h = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f44076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f44077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f44078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f44079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f44080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f44082g;

    public ConfigFetchHttpClient(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j6, long j10) {
        this.f44076a = context;
        this.f44077b = str;
        this.f44078c = str2;
        this.f44079d = f(str);
        this.f44080e = str3;
        this.f44081f = j6;
        this.f44082g = j10;
    }

    private boolean a(org.json.JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (org.json.JSONException unused) {
            return true;
        }
    }

    private java.lang.String b(long j6) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j6));
    }

    private org.json.JSONObject c(java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.Long l6) throws N5.j {
        java.util.HashMap map2 = new java.util.HashMap();
        if (str == null) {
            throw new N5.j("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f44077b);
        java.util.Locale locale = this.f44076a.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i6 = android.os.Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", java.lang.Integer.toString(i6));
        map2.put("timeZone", java.util.TimeZone.getDefault().getID());
        try {
            android.content.pm.PackageInfo packageInfo = this.f44076a.getPackageManager().getPackageInfo(this.f44076a.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", java.lang.Long.toString(androidx.core.content.pm.a.a(packageInfo)));
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.f44076a.getPackageName());
        map2.put("sdkVersion", "22.0.1");
        map2.put("analyticsUserProperties", new org.json.JSONObject(map));
        if (l6 != null) {
            map2.put("firstOpenTime", b(l6.longValue()));
        }
        return new org.json.JSONObject(map2);
    }

    private static com.google.firebase.remoteconfig.internal.g e(org.json.JSONObject jSONObject, java.util.Date date) throws N5.j {
        org.json.JSONObject jSONObject2;
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject3;
        try {
            com.google.firebase.remoteconfig.internal.g.b bVarE = com.google.firebase.remoteconfig.internal.g.l().e(date);
            org.json.JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (org.json.JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                bVarE = bVarE.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (org.json.JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                bVarE = bVarE.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (org.json.JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                bVarE = bVarE.f(jSONObject3);
            }
            java.lang.String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                bVarE.h(java.lang.Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (org.json.JSONException unused4) {
            }
            if (jSONArray2 != null) {
                bVarE = bVarE.g(jSONArray2);
            }
            return bVarE.a();
        } catch (org.json.JSONException e6) {
            throw new N5.j("Fetch failed: fetch response could not be parsed.", e6);
        }
    }

    private static java.lang.String f(java.lang.String str) {
        java.util.regex.Matcher matcher = f44075h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private org.json.JSONObject g(java.net.URLConnection uRLConnection) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i6 = bufferedReader.read();
            if (i6 == -1) {
                return new org.json.JSONObject(sb.toString());
            }
            sb.append((char) i6);
        }
    }

    private java.lang.String h(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private java.lang.String i() {
        try {
            android.content.Context context = this.f44076a;
            byte[] bArrA = V3.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return V3.k.b(bArrA, false);
            }
            java.lang.String str = "Could not get fingerprint hash for package: " + this.f44076a.getPackageName();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            java.lang.String str2 = "No such package: " + this.f44076a.getPackageName();
            return null;
        }
    }

    private void j(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f44078c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f44076a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void k(java.net.HttpURLConnection httpURLConnection, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    private void l(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.io.IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void m(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.util.Map map) {
        httpURLConnection.setDoOutput(true);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f44081f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f44082g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }

    java.net.HttpURLConnection d() throws N5.k {
        try {
            return (java.net.HttpURLConnection) new java.net.URL(h(this.f44079d, this.f44080e)).openConnection();
        } catch (java.io.IOException e6) {
            throw new N5.k(e6.getMessage());
        }
    }

    @androidx.annotation.Keep
    com.google.firebase.remoteconfig.internal.m.a fetch(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.Long l6, java.util.Date date) throws N5.j {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l6).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new N5.m(responseCode, httpURLConnection.getResponseMessage());
                }
                java.lang.String headerField = httpURLConnection.getHeaderField("ETag");
                org.json.JSONObject jSONObjectG = g(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException unused) {
                }
                com.google.firebase.remoteconfig.internal.g gVarE = e(jSONObjectG, date);
                return !a(jSONObjectG) ? com.google.firebase.remoteconfig.internal.m.a.a(date, gVarE) : com.google.firebase.remoteconfig.internal.m.a.b(gVarE, headerField);
            } catch (java.lang.Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException unused2) {
                }
                throw th;
            }
        } catch (java.io.IOException | org.json.JSONException e6) {
            throw new N5.j("The client had an error while calling the backend!", e6);
        }
    }
}
