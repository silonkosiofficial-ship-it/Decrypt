package E5;

/* JADX INFO: loaded from: classes3.dex */
public class f implements E5.i, E5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.b f2240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f2241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F5.b f2242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f2243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.Executor f2244e;

    f(F5.b bVar, java.util.Set set, java.util.concurrent.Executor executor, F5.b bVar2, android.content.Context context) {
        this.f2240a = bVar;
        this.f2243d = set;
        this.f2244e = executor;
        this.f2242c = bVar2;
        this.f2241b = context;
    }

    private f(final android.content.Context context, final java.lang.String str, java.util.Set set, F5.b bVar, java.util.concurrent.Executor executor) {
        this(new F5.b() { // from class: E5.c
            @Override // F5.b
            public final java.lang.Object get() {
                return E5.f.i(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static p046e5.C6530c f() {
        final p046e5.F fA = p046e5.F.a(U4.a.class, java.util.concurrent.Executor.class);
        return p046e5.C6530c.f(E5.f.class, E5.i.class, E5.j.class).b(p046e5.r.j(android.content.Context.class)).b(p046e5.r.j(Q4.f.class)).b(p046e5.r.m(E5.g.class)).b(p046e5.r.l(M5.i.class)).b(p046e5.r.i(fA)).f(new p046e5.h() { // from class: E5.b
            @Override // p046e5.h
            public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                return E5.f.g(fA, interfaceC6532e);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ E5.f g(p046e5.F f6, p046e5.InterfaceC6532e interfaceC6532e) {
        return new E5.f((android.content.Context) interfaceC6532e.a(android.content.Context.class), ((Q4.f) interfaceC6532e.a(Q4.f.class)).o(), interfaceC6532e.g(E5.g.class), interfaceC6532e.d(M5.i.class), (java.util.concurrent.Executor) interfaceC6532e.c(f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.String h() {
        java.lang.String string;
        synchronized (this) {
            try {
                E5.k kVar = (E5.k) this.f2240a.get();
                java.util.List listC = kVar.c();
                kVar.b();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i6 = 0; i6 < listC.size(); i6++) {
                    E5.l lVar = (E5.l) listC.get(i6);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new org.json.JSONArray((java.util.Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                android.util.Base64OutputStream base64OutputStream = new android.util.Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (java.lang.Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ E5.k i(android.content.Context context, java.lang.String str) {
        return new E5.k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void j() {
        synchronized (this) {
            ((E5.k) this.f2240a.get()).g(java.lang.System.currentTimeMillis(), ((M5.i) this.f2242c.get()).a());
        }
        return null;
    }

    @Override // E5.i
    public p115l4.AbstractC6931l a() {
        return androidx.core.os.t.a(this.f2241b) ^ true ? p115l4.AbstractC6934o.e("") : p115l4.AbstractC6934o.c(this.f2244e, new java.util.concurrent.Callable() { // from class: E5.d
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f2238a.h();
            }
        });
    }

    public p115l4.AbstractC6931l k() {
        if (this.f2243d.size() > 0 && !(!androidx.core.os.t.a(this.f2241b))) {
            return p115l4.AbstractC6934o.c(this.f2244e, new java.util.concurrent.Callable() { // from class: E5.e
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f2239a.j();
                }
            });
        }
        return p115l4.AbstractC6934o.e(null);
    }
}
