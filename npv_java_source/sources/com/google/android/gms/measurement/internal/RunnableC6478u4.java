package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC6478u4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.net.URL f42651C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.InterfaceC6457r4 f42652D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f42653E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Map f42654F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6464s4 f42655G;

    public RunnableC6478u4(com.google.android.gms.measurement.internal.C6464s4 c6464s4, java.lang.String str, java.net.URL url, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.InterfaceC6457r4 interfaceC6457r4) {
        this.f42655G = c6464s4;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(url);
        Q3.AbstractC1477p.l(interfaceC6457r4);
        this.f42651C = url;
        this.f42652D = interfaceC6457r4;
        this.f42653E = str;
        this.f42654F = null;
    }

    private final void b(final int i6, final java.lang.Exception exc, final byte[] bArr, final java.util.Map map) {
        this.f42655G.l().D(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final void run() {
                this.f42635C.a(i6, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i6, java.lang.Exception exc, byte[] bArr, java.util.Map map) {
        this.f42652D.a(this.f42653E, i6, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.net.HttpURLConnection httpURLConnection;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        this.f42655G.k();
        int responseCode = 0;
        try {
            java.net.URLConnection uRLConnectionB = com.google.android.gms.internal.measurement.D0.a().b(this.f42651C, "client-measurement");
            if (!(uRLConnectionB instanceof java.net.HttpURLConnection)) {
                throw new java.io.IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (java.net.HttpURLConnection) uRLConnectionB;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    com.google.android.gms.measurement.internal.C6464s4 c6464s4 = this.f42655G;
                    byte[] bArrV = com.google.android.gms.measurement.internal.C6464s4.v(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(responseCode, null, bArrV, headerFields);
                } catch (java.io.IOException e6) {
                    e = e6;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(responseCode, e, null, headerFields);
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (java.io.IOException e10) {
                e = e10;
                headerFields = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (java.io.IOException e11) {
            e = e11;
            httpURLConnection = null;
            headerFields = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }
}
