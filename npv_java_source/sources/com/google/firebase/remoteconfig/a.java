package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f44047n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f44048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q4.f f44049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R4.c f44050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.Executor f44051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.m f44055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.o f44056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f44057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final G5.e f44058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.q f44059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final O5.e f44060m;

    a(android.content.Context context, Q4.f fVar, G5.e eVar, R4.c cVar, java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.o oVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.q qVar, O5.e eVar2) {
        this.f44048a = context;
        this.f44049b = fVar;
        this.f44058k = eVar;
        this.f44050c = cVar;
        this.f44051d = executor;
        this.f44052e = fVar2;
        this.f44053f = fVar3;
        this.f44054g = fVar4;
        this.f44055h = mVar;
        this.f44056i = oVar;
        this.f44057j = pVar;
        this.f44059l = qVar;
        this.f44060m = eVar2;
    }

    static java.util.List B(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            java.util.HashMap map = new java.util.HashMap();
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i6);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public static com.google.firebase.remoteconfig.a k() {
        return l(Q4.f.l());
    }

    public static com.google.firebase.remoteconfig.a l(Q4.f fVar) {
        return ((com.google.firebase.remoteconfig.c) fVar.j(com.google.firebase.remoteconfig.c.class)).g();
    }

    private static boolean p(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l q(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2, p115l4.AbstractC6931l abstractC6931l3) {
        if (!abstractC6931l.o() || abstractC6931l.l() == null) {
            return p115l4.AbstractC6934o.e(java.lang.Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.g gVar = (com.google.firebase.remoteconfig.internal.g) abstractC6931l.l();
        return (!abstractC6931l2.o() || p(gVar, (com.google.firebase.remoteconfig.internal.g) abstractC6931l2.l())) ? this.f44053f.k(gVar).h(this.f44051d, new p115l4.InterfaceC6922c() { // from class: N5.i
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l4) {
                return java.lang.Boolean.valueOf(this.f7798a.v(abstractC6931l4));
            }
        }) : p115l4.AbstractC6934o.e(java.lang.Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l r(com.google.firebase.remoteconfig.internal.m.a aVar) {
        return p115l4.AbstractC6934o.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l s(java.lang.Void r6) {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void t(N5.n nVar) {
        this.f44057j.k(nVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l u(com.google.firebase.remoteconfig.internal.g gVar) {
        return p115l4.AbstractC6934o.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(p115l4.AbstractC6931l abstractC6931l) {
        if (!abstractC6931l.o()) {
            return false;
        }
        this.f44052e.d();
        com.google.firebase.remoteconfig.internal.g gVar = (com.google.firebase.remoteconfig.internal.g) abstractC6931l.l();
        if (gVar == null) {
            return true;
        }
        C(gVar.e());
        this.f44060m.g(gVar);
        return true;
    }

    private p115l4.AbstractC6931l z(java.util.Map map) {
        try {
            return this.f44054g.k(com.google.firebase.remoteconfig.internal.g.l().b(map).a()).p(p056f5.j.a(), new p115l4.InterfaceC6930k() { // from class: N5.d
                @Override // p115l4.InterfaceC6930k
                public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                    return com.google.firebase.remoteconfig.a.u((com.google.firebase.remoteconfig.internal.g) obj);
                }
            });
        } catch (org.json.JSONException e6) {
            return p115l4.AbstractC6934o.e(null);
        }
    }

    void A() {
        this.f44053f.e();
        this.f44054g.e();
        this.f44052e.e();
    }

    void C(org.json.JSONArray jSONArray) {
        if (this.f44050c == null) {
            return;
        }
        try {
            this.f44050c.m(B(jSONArray));
        } catch (R4.a e6) {
        } catch (org.json.JSONException e10) {
        }
    }

    public p115l4.AbstractC6931l g() {
        final p115l4.AbstractC6931l abstractC6931lE = this.f44052e.e();
        final p115l4.AbstractC6931l abstractC6931lE2 = this.f44053f.e();
        return p115l4.AbstractC6934o.j(abstractC6931lE, abstractC6931lE2).i(this.f44051d, new p115l4.InterfaceC6922c() { // from class: N5.g
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f7795a.q(abstractC6931lE, abstractC6931lE2, abstractC6931l);
            }
        });
    }

    public p115l4.AbstractC6931l h() {
        return this.f44055h.i().p(p056f5.j.a(), new p115l4.InterfaceC6930k() { // from class: N5.h
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return com.google.firebase.remoteconfig.a.r((com.google.firebase.remoteconfig.internal.m.a) obj);
            }
        });
    }

    public p115l4.AbstractC6931l i() {
        return h().p(this.f44051d, new p115l4.InterfaceC6930k() { // from class: N5.f
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f7794a.s((java.lang.Void) obj);
            }
        });
    }

    public boolean j(java.lang.String str) {
        return this.f44056i.d(str);
    }

    public long m(java.lang.String str) {
        return this.f44056i.f(str);
    }

    O5.e n() {
        return this.f44060m;
    }

    public java.lang.String o(java.lang.String str) {
        return this.f44056i.h(str);
    }

    public p115l4.AbstractC6931l w(final N5.n nVar) {
        return p115l4.AbstractC6934o.c(this.f44051d, new java.util.concurrent.Callable() { // from class: N5.e
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f7792a.t(nVar);
            }
        });
    }

    void x(boolean z6) {
        this.f44059l.b(z6);
    }

    public p115l4.AbstractC6931l y(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            boolean z6 = value instanceof byte[];
            java.lang.String str = (java.lang.String) entry.getKey();
            if (z6) {
                map2.put(str, new java.lang.String((byte[]) value));
            } else {
                map2.put(str, value.toString());
            }
        }
        return z(map2);
    }
}
