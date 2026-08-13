package p186s5;

/* JADX INFO: loaded from: classes3.dex */
public class g implements p186s5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f54379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p186s5.k f54380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p186s5.h f54381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p106k5.B f54382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p186s5.a f54383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p186s5.l f54384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p106k5.C f54385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f54386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f54387i;

    class a implements p115l4.InterfaceC6930k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p116l5.f f54388a;

        a(p116l5.f fVar) {
            this.f54388a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ org.json.JSONObject c() {
            return p186s5.g.this.f54384f.a(p186s5.g.this.f54380b, true);
        }

        @Override // p115l4.InterfaceC6930k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p115l4.AbstractC6931l a(java.lang.Void r6) throws java.lang.Throwable {
            org.json.JSONObject jSONObject = (org.json.JSONObject) this.f54388a.f50065d.d().submit(new java.util.concurrent.Callable() { // from class: s5.f
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f54378a.c();
                }
            }).get();
            if (jSONObject != null) {
                p186s5.d dVarB = p186s5.g.this.f54381c.b(jSONObject);
                p186s5.g.this.f54383e.c(dVarB.f54363c, jSONObject);
                p186s5.g.this.q(jSONObject, "Loaded settings: ");
                p186s5.g gVar = p186s5.g.this;
                gVar.r(gVar.f54380b.f54396f);
                p186s5.g.this.f54386h.set(dVarB);
                ((p115l4.C6932m) p186s5.g.this.f54387i.get()).e(dVarB);
            }
            return p115l4.AbstractC6934o.e(null);
        }
    }

    g(android.content.Context context, p186s5.k kVar, p106k5.B b6, p186s5.h hVar, p186s5.a aVar, p186s5.l lVar, p106k5.C c6) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.f54386h = atomicReference;
        this.f54387i = new java.util.concurrent.atomic.AtomicReference(new p115l4.C6932m());
        this.f54379a = context;
        this.f54380b = kVar;
        this.f54382d = b6;
        this.f54381c = hVar;
        this.f54383e = aVar;
        this.f54384f = lVar;
        this.f54385g = c6;
        atomicReference.set(p186s5.b.b(b6));
    }

    public static p186s5.g l(android.content.Context context, java.lang.String str, p106k5.H h6, p156p5.b bVar, java.lang.String str2, java.lang.String str3, p166q5.g gVar, p106k5.C c6) {
        java.lang.String strG = h6.g();
        p106k5.a0 a0Var = new p106k5.a0();
        return new p186s5.g(context, new p186s5.k(str, h6.h(), h6.i(), h6.j(), h6, p106k5.AbstractC6898i.h(p106k5.AbstractC6898i.m(context), str, str3, str2), str3, str2, p106k5.D.g(strG).i()), a0Var, new p186s5.h(a0Var), new p186s5.a(gVar), new p186s5.c(java.lang.String.format(java.util.Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), c6);
    }

    private p186s5.d m(p186s5.e eVar) throws java.lang.Throwable {
        p186s5.d dVar = null;
        try {
            if (!p186s5.e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                org.json.JSONObject jSONObjectB = this.f54383e.b();
                if (jSONObjectB != null) {
                    p186s5.d dVarB = this.f54381c.b(jSONObjectB);
                    if (dVarB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f54382d.a();
                        if (p186s5.e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !dVarB.a(jA)) {
                            try {
                                p076h5.g.f().i("Returning cached settings.");
                                dVar = dVarB;
                            } catch (java.lang.Exception e6) {
                                e = e6;
                                dVar = dVarB;
                                p076h5.g.f().e("Failed to get cached settings", e);
                            }
                        } else {
                            p076h5.g.f().i("Cached settings have expired.");
                        }
                    } else {
                        p076h5.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    p076h5.g.f().b("No cached settings data found.");
                }
            }
        } catch (java.lang.Exception e10) {
            e = e10;
        }
        return dVar;
    }

    private java.lang.String n() {
        return p106k5.AbstractC6898i.q(this.f54379a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(org.json.JSONObject jSONObject, java.lang.String str) {
        p076h5.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = p106k5.AbstractC6898i.q(this.f54379a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // p186s5.j
    public p115l4.AbstractC6931l a() {
        return ((p115l4.C6932m) this.f54387i.get()).a();
    }

    @Override // p186s5.j
    public p186s5.d b() {
        return (p186s5.d) this.f54386h.get();
    }

    boolean k() {
        return !n().equals(this.f54380b.f54396f);
    }

    public p115l4.AbstractC6931l o(p116l5.f fVar) {
        return p(p186s5.e.USE_CACHE, fVar);
    }

    public p115l4.AbstractC6931l p(p186s5.e eVar, p116l5.f fVar) throws java.lang.Throwable {
        p186s5.d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f54386h.set(dVarM);
            ((p115l4.C6932m) this.f54387i.get()).e(dVarM);
            return p115l4.AbstractC6934o.e(null);
        }
        p186s5.d dVarM2 = m(p186s5.e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f54386h.set(dVarM2);
            ((p115l4.C6932m) this.f54387i.get()).e(dVarM2);
        }
        return this.f54385g.i().p(fVar.f50062a, new s5.g.a(fVar));
    }
}
