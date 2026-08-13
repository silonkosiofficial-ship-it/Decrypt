package com.google.firebase.installations;

/* JADX INFO: loaded from: classes3.dex */
public class c implements G5.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.Object f44012m = new java.lang.Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final java.util.concurrent.ThreadFactory f44013n = new com.google.firebase.installations.c.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q4.f f44014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I5.c f44015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H5.c f44016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.i f44017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p046e5.x f44018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final G5.g f44019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f44020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f44021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.Executor f44022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.String f44023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private java.util.Set f44024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.util.List f44025l;

    class a implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f44026a = new java.util.concurrent.atomic.AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable, java.lang.String.format("firebase-installations-executor-%d", java.lang.Integer.valueOf(this.f44026a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44028b;

        static {
            int[] iArr = new int[I5.f.b.values().length];
            f44028b = iArr;
            try {
                iArr[I5.f.b.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f44028b[I5.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f44028b[I5.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[I5.d.b.values().length];
            f44027a = iArr2;
            try {
                iArr2[I5.d.b.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f44027a[I5.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    c(final Q4.f fVar, F5.b bVar, java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor) {
        this(executorService, executor, fVar, new I5.c(fVar.k(), bVar), new H5.c(fVar), com.google.firebase.installations.i.c(), new p046e5.x(new F5.b() { // from class: G5.a
            @Override // F5.b
            public final java.lang.Object get() {
                return com.google.firebase.installations.c.z(fVar);
            }
        }), new G5.g());
    }

    c(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor, Q4.f fVar, I5.c cVar, H5.c cVar2, com.google.firebase.installations.i iVar, p046e5.x xVar, G5.g gVar) {
        this.f44020g = new java.lang.Object();
        this.f44024k = new java.util.HashSet();
        this.f44025l = new java.util.ArrayList();
        this.f44014a = fVar;
        this.f44015b = cVar;
        this.f44016c = cVar2;
        this.f44017d = iVar;
        this.f44018e = xVar;
        this.f44019f = gVar;
        this.f44021h = executorService;
        this.f44022i = executor;
    }

    private void A() {
        Q3.AbstractC1477p.g(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Q3.AbstractC1477p.g(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Q3.AbstractC1477p.g(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Q3.AbstractC1477p.b(com.google.firebase.installations.i.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Q3.AbstractC1477p.b(com.google.firebase.installations.i.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private java.lang.String B(H5.d dVar) {
        if ((!this.f44014a.m().equals("CHIME_ANDROID_SDK") && !this.f44014a.u()) || !dVar.m()) {
            return this.f44019f.a();
        }
        java.lang.String strF = p().f();
        return android.text.TextUtils.isEmpty(strF) ? this.f44019f.a() : strF;
    }

    private H5.d C(H5.d dVar) throws com.google.firebase.installations.d {
        I5.d dVarD = this.f44015b.d(m(), dVar.d(), u(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i6 = com.google.firebase.installations.c.b.f44027a[dVarD.e().ordinal()];
        if (i6 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f44017d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i6 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
    }

    private void D(java.lang.Exception exc) {
        synchronized (this.f44020g) {
            try {
                java.util.Iterator it = this.f44025l.iterator();
                while (it.hasNext()) {
                    if (((com.google.firebase.installations.h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void E(H5.d dVar) {
        synchronized (this.f44020g) {
            try {
                java.util.Iterator it = this.f44025l.iterator();
                while (it.hasNext()) {
                    if (((com.google.firebase.installations.h) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void F(java.lang.String str) {
        this.f44023j = str;
    }

    private synchronized void G(H5.d dVar, H5.d dVar2) {
        if (this.f44024k.size() != 0 && !android.text.TextUtils.equals(dVar.d(), dVar2.d())) {
            java.util.Iterator it = this.f44024k.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private p115l4.AbstractC6931l g() {
        p115l4.C6932m c6932m = new p115l4.C6932m();
        i(new com.google.firebase.installations.e(this.f44017d, c6932m));
        return c6932m.a();
    }

    private p115l4.AbstractC6931l h() {
        p115l4.C6932m c6932m = new p115l4.C6932m();
        i(new com.google.firebase.installations.f(c6932m));
        return c6932m.a();
    }

    private void i(com.google.firebase.installations.h hVar) {
        synchronized (this.f44020g) {
            this.f44025l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void w(boolean z6) {
        H5.d dVarC;
        java.lang.Exception iOException;
        H5.d dVarS = s();
        try {
            if (dVarS.i() || dVarS.l()) {
                dVarC = C(dVarS);
            } else {
                if (!z6 && !this.f44017d.f(dVarS)) {
                    return;
                }
                dVarC = l(dVarS);
            }
            v(dVarC);
            G(dVarS, dVarC);
            if (dVarC.k()) {
                F(dVarC.d());
            }
            if (dVarC.i()) {
                iOException = new com.google.firebase.installations.d(com.google.firebase.installations.d.a.BAD_CONFIG);
            } else {
                if (!dVarC.j()) {
                    E(dVarC);
                    return;
                }
                iOException = new java.io.IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            D(iOException);
        } catch (com.google.firebase.installations.d e6) {
            D(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void y(final boolean z6) {
        H5.d dVarT = t();
        if (z6) {
            dVarT = dVarT.p();
        }
        E(dVarT);
        this.f44022i.execute(new java.lang.Runnable() { // from class: G5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f3037C.w(z6);
            }
        });
    }

    private H5.d l(H5.d dVar) throws com.google.firebase.installations.d {
        I5.f fVarE = this.f44015b.e(m(), dVar.d(), u(), dVar.f());
        int i6 = com.google.firebase.installations.c.b.f44028b[fVarE.b().ordinal()];
        if (i6 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f44017d.b());
        }
        if (i6 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i6 != 3) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.UNAVAILABLE);
        }
        F(null);
        return dVar.r();
    }

    private synchronized java.lang.String o() {
        return this.f44023j;
    }

    private H5.b p() {
        return (H5.b) this.f44018e.get();
    }

    public static com.google.firebase.installations.c q() {
        return r(Q4.f.l());
    }

    public static com.google.firebase.installations.c r(Q4.f fVar) {
        Q3.AbstractC1477p.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (com.google.firebase.installations.c) fVar.j(G5.e.class);
    }

    private H5.d s() {
        H5.d dVarD;
        synchronized (f44012m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44014a.k(), "generatefid.lock");
                try {
                    dVarD = this.f44016c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (java.lang.Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    private H5.d t() {
        H5.d dVarD;
        synchronized (f44012m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44014a.k(), "generatefid.lock");
                try {
                    dVarD = this.f44016c.d();
                    if (dVarD.j()) {
                        dVarD = this.f44016c.b(dVarD.t(B(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (java.lang.Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    private void v(H5.d dVar) {
        synchronized (f44012m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f44014a.k(), "generatefid.lock");
                try {
                    this.f44016c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (java.lang.Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ H5.b z(Q4.f fVar) {
        return new H5.b(fVar);
    }

    @Override // G5.e
    public p115l4.AbstractC6931l a() {
        A();
        java.lang.String strO = o();
        if (strO != null) {
            return p115l4.AbstractC6934o.e(strO);
        }
        p115l4.AbstractC6931l abstractC6931lH = h();
        this.f44021h.execute(new java.lang.Runnable() { // from class: G5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3034C.x();
            }
        });
        return abstractC6931lH;
    }

    @Override // G5.e
    public p115l4.AbstractC6931l b(final boolean z6) {
        A();
        p115l4.AbstractC6931l abstractC6931lG = g();
        this.f44021h.execute(new java.lang.Runnable() { // from class: G5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3035C.y(z6);
            }
        });
        return abstractC6931lG;
    }

    java.lang.String m() {
        return this.f44014a.n().b();
    }

    java.lang.String n() {
        return this.f44014a.n().c();
    }

    java.lang.String u() {
        return this.f44014a.n().e();
    }
}
