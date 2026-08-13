package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f56245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f56246d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f56249g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f56250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f56244b = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final V3.f f56247e = V3.i.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Set f56248f = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[0]));

    public m(java.lang.String str) {
        this.f56250a = !k() ? new java.util.ArrayList() : java.util.Arrays.asList("network_request_".concat(java.lang.String.valueOf(java.util.UUID.randomUUID().toString())));
    }

    static /* synthetic */ void a(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr, android.util.JsonWriter jsonWriter) throws java.io.IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(V3.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i6, java.util.Map map, android.util.JsonWriter jsonWriter) throws java.io.IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i6);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f56244b) {
            f56245c = false;
            f56246d = false;
            p224w3.p.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z6) {
        synchronized (f56244b) {
            f56245c = true;
            f56246d = z6;
        }
    }

    public static boolean k() {
        boolean z6;
        synchronized (f56244b) {
            try {
                z6 = false;
                if (f56245c && f56246d) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public static boolean l() {
        boolean z6;
        synchronized (f56244b) {
            z6 = f56245c;
        }
        return z6;
    }

    private static synchronized void m(java.lang.String str) {
        try {
            p224w3.p.f("GMA Debug BEGIN");
            int i6 = 0;
            while (i6 < str.length()) {
                int i10 = i6 + 4000;
                p224w3.p.f("GMA Debug CONTENT ".concat(java.lang.String.valueOf(str.substring(i6, java.lang.Math.min(i10, str.length())))));
                i6 = i10;
            }
            p224w3.p.f("GMA Debug FINISH");
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private final void n(java.lang.String str, p224w3.l lVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f56247e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            java.util.Iterator it = this.f56250a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((java.lang.String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (java.io.IOException e6) {
            p224w3.p.e("unable to log", e6);
        }
        m(stringWriter.toString());
    }

    private final void o(final java.lang.String str) {
        n("onNetworkRequestError", new p224w3.l() { // from class: w3.j
            @Override // p224w3.l
            public final void a(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                int i6 = p224w3.m.f56249g;
                jsonWriter.name("params").beginObject();
                java.lang.String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final java.lang.String str, final java.lang.String str2, final java.util.Map map, final byte[] bArr) {
        n("onNetworkRequest", new p224w3.l() { // from class: w3.h
            @Override // p224w3.l
            public final void a(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                p224w3.m.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final java.util.Map map, final int i6) {
        n("onNetworkResponse", new p224w3.l() { // from class: w3.k
            @Override // p224w3.l
            public final void a(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                p224w3.m.b(i6, map, jsonWriter);
            }
        });
    }

    private static void r(android.util.JsonWriter jsonWriter, java.util.Map map) throws java.io.IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!f56248f.contains(str)) {
                if (!(entry.getValue() instanceof java.util.List)) {
                    if (!(entry.getValue() instanceof java.lang.String)) {
                        p224w3.p.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((java.lang.String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (java.lang.String str2 : (java.util.List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        if (k()) {
            p(new java.lang.String(httpURLConnection.getURL().toString()), new java.lang.String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new java.util.HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr) {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(java.net.HttpURLConnection httpURLConnection, int i6) {
        if (k()) {
            java.lang.String responseMessage = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new java.util.HashMap(httpURLConnection.getHeaderFields()), i6);
            if (i6 < 200 || i6 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (java.io.IOException e6) {
                    p224w3.p.g("Can not get error message from error HttpURLConnection\n".concat(java.lang.String.valueOf(e6.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void f(java.util.Map map, int i6) {
        if (k()) {
            q(map, i6);
            if (i6 < 200 || i6 >= 300) {
                o(null);
            }
        }
    }

    public final void g(java.lang.String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new p224w3.l() { // from class: w3.i
            @Override // p224w3.l
            public final void a(android.util.JsonWriter jsonWriter) throws java.io.IOException {
                java.lang.String str;
                int i6 = p224w3.m.f56249g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                java.lang.String strA = V3.c.a(bArr2);
                if (length >= 10000) {
                    strA = p224w3.g.h(strA);
                    str = strA != null ? "bodydigest" : "body";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                jsonWriter.name(str).value(strA);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
