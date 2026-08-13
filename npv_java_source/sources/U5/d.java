package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements U5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U5.d.a f14501d = new U5.d.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5.C1619b f14502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p127m7.i f14503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f14504c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f14505G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.util.Map f14507I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.p f14508J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p237x7.p f14509K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.Map map, p237x7.p pVar, p237x7.p pVar2, p127m7.e eVar) {
            super(2, eVar);
            this.f14507I = map;
            this.f14508J = pVar;
            this.f14509K = pVar2;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f14505G;
            try {
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    java.net.URLConnection uRLConnectionOpenConnection = U5.d.this.c().openConnection();
                    p247y7.AbstractC7350t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (java.util.Map.Entry entry : this.f14507I.entrySet()) {
                        httpsURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        java.io.InputStream inputStream = httpsURLConnection.getInputStream();
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        p247y7.O o6 = new p247y7.O();
                        while (true) {
                            java.lang.String line = bufferedReader.readLine();
                            o6.f57254C = line;
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        org.json.JSONObject jSONObject = new org.json.JSONObject(sb.toString());
                        p237x7.p pVar = this.f14508J;
                        this.f14505G = 1;
                        if (pVar.u(jSONObject, this) == objG) {
                            return objG;
                        }
                    } else {
                        p237x7.p pVar2 = this.f14509K;
                        java.lang.String str = "Bad response code: " + responseCode;
                        this.f14505G = 2;
                        if (pVar2.u(str, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i6 != 1 && i6 != 2 && i6 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
            } catch (java.lang.Exception e6) {
                p237x7.p pVar3 = this.f14509K;
                java.lang.String message = e6.getMessage();
                if (message == null) {
                    message = e6.toString();
                }
                this.f14505G = 3;
                if (pVar3.u(message, this) == objG) {
                    return objG;
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((U5.d.b) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return U5.d.this.new b(this.f14507I, this.f14508J, this.f14509K, eVar);
        }
    }

    public d(S5.C1619b c1619b, p127m7.i iVar, java.lang.String str) {
        p247y7.AbstractC7350t.f(c1619b, "appInfo");
        p247y7.AbstractC7350t.f(iVar, "blockingDispatcher");
        p247y7.AbstractC7350t.f(str, "baseUrl");
        this.f14502a = c1619b;
        this.f14503b = iVar;
        this.f14504c = str;
    }

    public /* synthetic */ d(S5.C1619b c1619b, p127m7.i iVar, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(c1619b, iVar, (i6 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.net.URL c() {
        return new java.net.URL(new android.net.Uri.Builder().scheme("https").authority(this.f14504c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f14502a.b()).appendPath("settings").appendQueryParameter("build_version", this.f14502a.a().a()).appendQueryParameter("display_version", this.f14502a.a().f()).build().toString());
    }

    @Override // U5.a
    public java.lang.Object a(java.util.Map map, p237x7.p pVar, p237x7.p pVar2, p127m7.e eVar) {
        java.lang.Object objG = W8.AbstractC1784g.g(this.f14503b, new U5.d.b(map, pVar, pVar2, null), eVar);
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }
}
