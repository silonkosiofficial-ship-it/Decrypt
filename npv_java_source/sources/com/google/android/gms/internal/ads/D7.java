package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class D7 extends com.google.android.gms.internal.ads.AbstractC4875q7 {
    public D7(com.google.android.gms.internal.ads.C7 c10, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
    }

    static java.util.List b(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.google.android.gms.internal.ads.V6((java.lang.String) entry.getKey(), (java.lang.String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4875q7
    public final com.google.android.gms.internal.ads.A7 a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, java.util.Map map) throws java.lang.Throwable {
        java.lang.String strT = abstractC3448d7.t();
        java.util.HashMap map2 = new java.util.HashMap();
        map2.putAll(map);
        map2.putAll(abstractC3448d7.u());
        java.net.URL url = new java.net.URL(strT);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(java.net.HttpURLConnection.getFollowRedirects());
        int iE = abstractC3448d7.e();
        httpURLConnection.setConnectTimeout(iE);
        httpURLConnection.setReadTimeout(iE);
        boolean z6 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (java.lang.String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (java.lang.String) map2.get(str));
            }
            if (abstractC3448d7.a() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrG = abstractC3448d7.G();
                if (bArrG != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrG);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            abstractC3448d7.a();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                com.google.android.gms.internal.ads.A7 a10 = new com.google.android.gms.internal.ads.A7(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return a10;
            }
            try {
                return new com.google.android.gms.internal.ads.A7(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new com.google.android.gms.internal.ads.B7(httpURLConnection));
            } catch (java.lang.Throwable th) {
                th = th;
                z6 = true;
                if (!z6) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
