package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f16389f = "Y4.m";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f16390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f16391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f16392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f16393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F5.b f16394e;

    public m(Q4.f fVar) {
        this(fVar.k(), fVar.n(), ((Y4.h) V4.e.c(fVar)).j());
    }

    m(android.content.Context context, Q4.o oVar, F5.b bVar) {
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.l(oVar);
        Q3.AbstractC1477p.l(bVar);
        this.f16390a = context;
        this.f16391b = oVar.b();
        this.f16392c = oVar.c();
        java.lang.String strE = oVar.e();
        this.f16393d = strE;
        if (strE == null) {
            throw new java.lang.IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f16394e = bVar;
    }

    private java.lang.String d() {
        try {
            android.content.Context context = this.f16390a;
            byte[] bArrA = V3.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return V3.k.b(bArrA, false);
            }
            java.lang.String str = f16389f;
            java.lang.String str2 = "Could not get fingerprint hash for package: " + this.f16390a.getPackageName();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            java.lang.String str3 = f16389f;
            java.lang.String str4 = "No such package: " + this.f16390a.getPackageName();
            return null;
        }
    }

    private static java.lang.String f(int i6) {
        if (i6 == 2) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        }
        if (i6 == 3) {
            return "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        throw new java.lang.IllegalArgumentException("Unknown token type.");
    }

    private static final boolean g(int i6) {
        return i6 >= 200 && i6 < 300;
    }

    private java.lang.String h(java.net.URL url, byte[] bArr, Y4.n nVar, boolean z6) {
        java.net.HttpURLConnection httpURLConnectionA = a(url);
        try {
            httpURLConnectionA.setDoOutput(true);
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.setRequestProperty("Content-Type", "application/json");
            java.lang.String strE = e();
            if (strE != null) {
                httpURLConnectionA.setRequestProperty("X-Firebase-Client", strE);
            }
            httpURLConnectionA.setRequestProperty("X-Android-Package", this.f16390a.getPackageName());
            httpURLConnectionA.setRequestProperty("X-Android-Cert", d());
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnectionA.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnectionA.getResponseCode();
                java.io.InputStream inputStream = g(responseCode) ? httpURLConnectionA.getInputStream() : httpURLConnectionA.getErrorStream();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        java.lang.String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (java.lang.Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    httpURLConnectionA.disconnect();
                    throw th;
                }
                bufferedReader.close();
                java.lang.String string = sb.toString();
                if (g(responseCode)) {
                    if (z6) {
                        nVar.c();
                    }
                    httpURLConnectionA.disconnect();
                    return string;
                }
                nVar.d(responseCode);
                Y4.l lVarA = Y4.l.a(string);
                throw new Q4.m("Error returned from API. code: " + lVarA.b() + " body: " + lVarA.c());
            } catch (java.lang.Throwable th3) {
                try {
                    bufferedOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            httpURLConnectionA.disconnect();
            throw th5;
        }
    }

    java.net.HttpURLConnection a(java.net.URL url) {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    public Y4.a b(byte[] bArr, int i6, Y4.n nVar) throws Q4.m {
        if (nVar.a()) {
            return Y4.a.a(h(new java.net.URL(java.lang.String.format(f(i6), this.f16393d, this.f16392c, this.f16391b)), bArr, nVar, true));
        }
        throw new Q4.m("Too many attempts.");
    }

    public java.lang.String c(byte[] bArr, Y4.n nVar) throws Q4.m {
        if (nVar.a()) {
            return h(new java.net.URL(java.lang.String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f16393d, this.f16392c, this.f16391b)), bArr, nVar, false);
        }
        throw new Q4.m("Too many attempts.");
    }

    java.lang.String e() {
        E5.i iVar = (E5.i) this.f16394e.get();
        if (iVar != null) {
            try {
                return (java.lang.String) p115l4.AbstractC6934o.a(iVar.a());
            } catch (java.lang.Exception unused) {
                java.lang.String str = f16389f;
            }
        }
        return null;
    }
}
