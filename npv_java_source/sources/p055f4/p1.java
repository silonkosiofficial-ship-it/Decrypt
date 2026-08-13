package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.Application f45219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Handler f45220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f45221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p055f4.C6575q f45222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p055f4.P f45223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p055f4.e1 f45224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p055f4.s1 f45225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p055f4.X0 f45226h;

    p1(android.app.Application application, p055f4.C6547c c6547c, android.os.Handler handler, java.util.concurrent.Executor executor, p055f4.C6575q c6575q, p055f4.P p6, p055f4.e1 e1Var, p055f4.s1 s1Var, p055f4.X0 x6) {
        this.f45219a = application;
        this.f45220b = handler;
        this.f45221c = executor;
        this.f45222d = c6575q;
        this.f45223e = p6;
        this.f45224f = e1Var;
        this.f45225g = s1Var;
        this.f45226h = x6;
    }

    private final p055f4.C6572o0 d(p055f4.C6568m0 c6568m0) throws p055f4.Z0 {
        java.lang.String str;
        java.lang.String str2;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", android.webkit.WebSettings.getDefaultUserAgent(this.f45219a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                android.util.JsonWriter jsonWriter = new android.util.JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    java.lang.String str3 = c6568m0.f45184a;
                    if (str3 != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str3);
                    }
                    p055f4.C6560i0 c6560i0 = c6568m0.f45185b;
                    if (c6560i0 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i6 = c6560i0.f45157c;
                        if (i6 != 1) {
                            jsonWriter.name("os_type");
                            int i10 = i6 - 1;
                            if (i10 == 0) {
                                str2 = "UNKNOWN";
                            } else if (i10 == 1) {
                                str2 = "ANDROID";
                            }
                            jsonWriter.value(str2);
                        }
                        java.lang.String str4 = c6560i0.f45155a;
                        if (str4 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str4);
                        }
                        java.lang.Integer num = c6560i0.f45156b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    java.lang.String str5 = c6568m0.f45186c;
                    if (str5 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str5);
                    }
                    java.lang.Boolean bool = c6568m0.f45187d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    java.util.Map map = c6568m0.f45188e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((java.lang.String) entry.getKey());
                            jsonWriter.value((java.lang.String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    p055f4.C6564k0 c6564k0 = c6568m0.f45189f;
                    if (c6564k0 != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        java.lang.Integer num2 = c6564k0.f45169a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        java.lang.Integer num3 = c6564k0.f45170b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        java.lang.Double d6 = c6564k0.f45171c;
                        if (d6 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d6);
                        }
                        java.util.List<p055f4.C6562j0> list = c6564k0.f45172d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (p055f4.C6562j0 c6562j0 : list) {
                                jsonWriter.beginObject();
                                java.lang.Integer num4 = c6562j0.f45163a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                java.lang.Integer num5 = c6562j0.f45164b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                java.lang.Integer num6 = c6562j0.f45165c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                java.lang.Integer num7 = c6562j0.f45166d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    p055f4.C6556g0 c6556g0 = c6568m0.f45190g;
                    if (c6556g0 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        java.lang.String str6 = c6556g0.f45134a;
                        if (str6 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str6);
                        }
                        java.lang.String str7 = c6556g0.f45135b;
                        if (str7 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str7);
                        }
                        java.lang.String str8 = c6556g0.f45136c;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    p055f4.C6566l0 c6566l0 = c6568m0.f45191h;
                    if (c6566l0 != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        java.lang.String str9 = c6566l0.f45178a;
                        if (str9 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str9);
                        }
                        jsonWriter.endObject();
                    }
                    java.util.List list2 = c6568m0.f45192i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = ((p055f4.EnumC6558h0) it.next()).ordinal();
                            if (iOrdinal == 0) {
                                str = "DEBUG_PARAM_UNKNOWN";
                            } else if (iOrdinal == 1) {
                                str = "ALWAYS_SHOW";
                            } else if (iOrdinal == 2) {
                                str = "GEO_OVERRIDE_EEA";
                            } else if (iOrdinal == 3) {
                                str = "GEO_OVERRIDE_NON_EEA";
                            } else if (iOrdinal == 4) {
                                str = "PREVIEWING_DEBUG_MESSAGES";
                            }
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new java.io.IOException("Http error code - " + responseCode + ".\n" + new java.util.Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    java.lang.String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        p055f4.C6572o0 c6572o0A = p055f4.C6572o0.a(new android.util.JsonReader(new java.io.StringReader(headerField)));
                        c6572o0A.f45208a = new java.util.Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return c6572o0A;
                    }
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        android.util.JsonReader jsonReader = new android.util.JsonReader(bufferedReader);
                        try {
                            p055f4.C6572o0 c6572o0A2 = p055f4.C6572o0.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return c6572o0A2;
                        } catch (java.lang.Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (java.lang.Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (java.net.SocketTimeoutException e6) {
            throw new p055f4.Z0(4, "The server timed out.", e6);
        } catch (java.io.IOException e10) {
            throw new p055f4.Z0(2, "Error making request.", e10);
        }
    }

    final /* synthetic */ void a(final L4.c.b bVar, p055f4.u1 u1Var) {
        j$.util.Objects.requireNonNull(bVar);
        this.f45220b.post(new java.lang.Runnable() { // from class: f4.o1
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        if (u1Var.f45258b != L4.c.EnumC0153c.NOT_REQUIRED) {
            this.f45223e.c();
        }
    }

    final /* synthetic */ void b(android.app.Activity activity, L4.d dVar, final L4.c.b bVar, final L4.c.a aVar) {
        try {
            L4.a aVarA = dVar.a();
            if (aVarA == null || !aVarA.b()) {
                java.lang.String str = "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + p055f4.AbstractC6574p0.a(this.f45219a) + "\") to set this as a debug device.";
            }
            final p055f4.u1 u1VarA = new p055f4.r1(this.f45225g, d(this.f45224f.c(activity, dVar))).a();
            this.f45222d.f(u1VarA.f45257a);
            this.f45222d.h(u1VarA.f45258b);
            this.f45223e.d(u1VarA.f45259c);
            this.f45226h.a().execute(new java.lang.Runnable() { // from class: f4.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45173C.a(bVar, u1VarA);
                }
            });
        } catch (p055f4.Z0 e6) {
            this.f45220b.post(new java.lang.Runnable() { // from class: f4.m1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(e6.a());
                }
            });
        } catch (java.lang.RuntimeException e10) {
            final p055f4.Z0 z6 = new p055f4.Z0(1, "Caught exception when trying to request consent info update: ".concat(java.lang.String.valueOf(android.util.Log.getStackTraceString(e10))));
            this.f45220b.post(new java.lang.Runnable() { // from class: f4.n1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(z6.a());
                }
            });
        }
    }

    final void c(final android.app.Activity activity, final L4.d dVar, final L4.c.b bVar, final L4.c.a aVar) {
        this.f45221c.execute(new java.lang.Runnable() { // from class: f4.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f45179C.b(activity, dVar, bVar, aVar);
            }
        });
    }
}
