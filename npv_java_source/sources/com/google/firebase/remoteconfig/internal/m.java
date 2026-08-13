package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f44137j = java.util.concurrent.TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int[] f44138k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G5.e f44139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F5.b f44140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f44141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V3.f f44142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Random f44143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient f44145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.p f44146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.Map f44147i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Date f44148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f44149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.firebase.remoteconfig.internal.g f44150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.String f44151d;

        private a(java.util.Date date, int i6, com.google.firebase.remoteconfig.internal.g gVar, java.lang.String str) {
            this.f44148a = date;
            this.f44149b = i6;
            this.f44150c = gVar;
            this.f44151d = str;
        }

        public static com.google.firebase.remoteconfig.internal.m.a a(java.util.Date date, com.google.firebase.remoteconfig.internal.g gVar) {
            return new com.google.firebase.remoteconfig.internal.m.a(date, 1, gVar, null);
        }

        public static com.google.firebase.remoteconfig.internal.m.a b(com.google.firebase.remoteconfig.internal.g gVar, java.lang.String str) {
            return new com.google.firebase.remoteconfig.internal.m.a(gVar.h(), 0, gVar, str);
        }

        public static com.google.firebase.remoteconfig.internal.m.a c(java.util.Date date) {
            return new com.google.firebase.remoteconfig.internal.m.a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.g d() {
            return this.f44150c;
        }

        java.lang.String e() {
            return this.f44151d;
        }

        int f() {
            return this.f44149b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.String f44155C;

        b(java.lang.String str) {
            this.f44155C = str;
        }

        java.lang.String g() {
            return this.f44155C;
        }
    }

    public m(G5.e eVar, F5.b bVar, java.util.concurrent.Executor executor, V3.f fVar, java.util.Random random, com.google.firebase.remoteconfig.internal.f fVar2, com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient configFetchHttpClient, com.google.firebase.remoteconfig.internal.p pVar, java.util.Map map) {
        this.f44139a = eVar;
        this.f44140b = bVar;
        this.f44141c = executor;
        this.f44142d = fVar;
        this.f44143e = random;
        this.f44144f = fVar2;
        this.f44145g = configFetchHttpClient;
        this.f44146h = pVar;
        this.f44147i = map;
    }

    private com.google.firebase.remoteconfig.internal.p.a A(int i6, java.util.Date date) {
        if (t(i6)) {
            B(date);
        }
        return this.f44146h.a();
    }

    private void B(java.util.Date date) {
        int iB = this.f44146h.a().b() + 1;
        this.f44146h.j(iB, new java.util.Date(date.getTime() + q(iB)));
    }

    private void C(p115l4.AbstractC6931l abstractC6931l, java.util.Date date) {
        if (abstractC6931l.o()) {
            this.f44146h.p(date);
            return;
        }
        java.lang.Exception excK = abstractC6931l.k();
        if (excK == null) {
            return;
        }
        if (excK instanceof N5.l) {
            this.f44146h.q();
        } else {
            this.f44146h.o();
        }
    }

    private boolean f(long j6, java.util.Date date) {
        java.util.Date dateD = this.f44146h.d();
        if (dateD.equals(com.google.firebase.remoteconfig.internal.p.f44166e)) {
            return false;
        }
        return date.before(new java.util.Date(dateD.getTime() + java.util.concurrent.TimeUnit.SECONDS.toMillis(j6)));
    }

    private N5.m g(N5.m mVar) throws N5.j {
        java.lang.String str;
        int iA = mVar.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new N5.j("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new N5.m(mVar.a(), "Fetch failed: " + str, mVar);
    }

    private java.lang.String h(long j6) {
        return java.lang.String.format("Fetch is throttled. Please wait before calling fetch again: %s", android.text.format.DateUtils.formatElapsedTime(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j6)));
    }

    private com.google.firebase.remoteconfig.internal.m.a k(java.lang.String str, java.lang.String str2, java.util.Date date, java.util.Map map) throws N5.k {
        try {
            com.google.firebase.remoteconfig.internal.m.a aVarFetch = this.f44145g.fetch(this.f44145g.d(), str, str2, s(), this.f44146h.c(), map, p(), date);
            if (aVarFetch.d() != null) {
                this.f44146h.m(aVarFetch.d().k());
            }
            if (aVarFetch.e() != null) {
                this.f44146h.l(aVarFetch.e());
            }
            this.f44146h.h();
            return aVarFetch;
        } catch (N5.m e6) {
            com.google.firebase.remoteconfig.internal.p.a aVarA = A(e6.a(), date);
            if (z(aVarA, e6.a())) {
                throw new N5.l(aVarA.a().getTime());
            }
            throw g(e6);
        }
    }

    private p115l4.AbstractC6931l l(java.lang.String str, java.lang.String str2, java.util.Date date, java.util.Map map) {
        try {
            final com.google.firebase.remoteconfig.internal.m.a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? p115l4.AbstractC6934o.e(aVarK) : this.f44144f.k(aVarK.d()).p(this.f44141c, new p115l4.InterfaceC6930k() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // p115l4.InterfaceC6930k
                public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                    return com.google.firebase.remoteconfig.internal.m.v(aVarK, (com.google.firebase.remoteconfig.internal.g) obj);
                }
            });
        } catch (N5.k e6) {
            return p115l4.AbstractC6934o.d(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p115l4.AbstractC6931l u(p115l4.AbstractC6931l abstractC6931l, long j6, final java.util.Map map) {
        p115l4.AbstractC6931l abstractC6931lI;
        final java.util.Date date = new java.util.Date(this.f44142d.a());
        if (abstractC6931l.o() && f(j6, date)) {
            return p115l4.AbstractC6934o.e(com.google.firebase.remoteconfig.internal.m.a.c(date));
        }
        java.util.Date dateO = o(date);
        if (dateO != null) {
            abstractC6931lI = p115l4.AbstractC6934o.d(new N5.l(h(dateO.getTime() - date.getTime()), dateO.getTime()));
        } else {
            final p115l4.AbstractC6931l abstractC6931lA = this.f44139a.a();
            final p115l4.AbstractC6931l abstractC6931lB = this.f44139a.b(false);
            abstractC6931lI = p115l4.AbstractC6934o.j(abstractC6931lA, abstractC6931lB).i(this.f44141c, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // p115l4.InterfaceC6922c
                public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l2) {
                    return this.f44129a.w(abstractC6931lA, abstractC6931lB, date, map, abstractC6931l2);
                }
            });
        }
        return abstractC6931lI.i(this.f44141c, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l2) {
                return this.f44134a.x(date, abstractC6931l2);
            }
        });
    }

    private java.util.Date o(java.util.Date date) {
        java.util.Date dateA = this.f44146h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private java.lang.Long p() {
        T4.a aVar = (T4.a) this.f44140b.get();
        if (aVar == null) {
            return null;
        }
        return (java.lang.Long) aVar.b(true).get("_fot");
    }

    private long q(int i6) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        int[] iArr = f44138k;
        long millis = timeUnit.toMillis(iArr[java.lang.Math.min(i6, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f44143e.nextInt((int) millis));
    }

    private java.util.Map s() {
        java.util.HashMap map = new java.util.HashMap();
        T4.a aVar = (T4.a) this.f44140b.get();
        if (aVar == null) {
            return map;
        }
        for (java.util.Map.Entry entry : aVar.b(false).entrySet()) {
            map.put((java.lang.String) entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    private boolean t(int i6) {
        return i6 == 429 || i6 == 502 || i6 == 503 || i6 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l v(com.google.firebase.remoteconfig.internal.m.a aVar, com.google.firebase.remoteconfig.internal.g gVar) {
        return p115l4.AbstractC6934o.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l w(p115l4.AbstractC6931l abstractC6931l, p115l4.AbstractC6931l abstractC6931l2, java.util.Date date, java.util.Map map, p115l4.AbstractC6931l abstractC6931l3) {
        if (abstractC6931l.o()) {
            return !abstractC6931l2.o() ? p115l4.AbstractC6934o.d(new N5.j("Firebase Installations failed to get installation auth token for fetch.", abstractC6931l2.k())) : l((java.lang.String) abstractC6931l.l(), ((com.google.firebase.installations.g) abstractC6931l2.l()).b(), date, map);
        }
        return p115l4.AbstractC6934o.d(new N5.j("Firebase Installations failed to get installation ID for fetch.", abstractC6931l.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l x(java.util.Date date, p115l4.AbstractC6931l abstractC6931l) {
        C(abstractC6931l, date);
        return abstractC6931l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l y(java.util.Map map, p115l4.AbstractC6931l abstractC6931l) {
        return u(abstractC6931l, 0L, map);
    }

    private boolean z(com.google.firebase.remoteconfig.internal.p.a aVar, int i6) {
        return aVar.b() > 1 || i6 == 429;
    }

    public p115l4.AbstractC6931l i() {
        return j(this.f44146h.f());
    }

    public p115l4.AbstractC6931l j(final long j6) {
        final java.util.HashMap map = new java.util.HashMap(this.f44147i);
        map.put("X-Firebase-RC-Fetch-Type", com.google.firebase.remoteconfig.internal.m.b.BASE.g() + "/1");
        return this.f44144f.e().i(this.f44141c, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f44124a.u(j6, map, abstractC6931l);
            }
        });
    }

    public p115l4.AbstractC6931l n(com.google.firebase.remoteconfig.internal.m.b bVar, int i6) {
        final java.util.HashMap map = new java.util.HashMap(this.f44147i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.g() + "/" + i6);
        return this.f44144f.e().i(this.f44141c, new p115l4.InterfaceC6922c() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f44127a.y(map, abstractC6931l);
            }
        });
    }

    public long r() {
        return this.f44146h.e();
    }
}
