package p106k5;

/* JADX INFO: renamed from: k5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6905p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final java.io.FilenameFilter f49642t = new java.io.FilenameFilter() { // from class: k5.o
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return p106k5.C6905p.K(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f49643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p106k5.C f49644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p106k5.C6912x f49645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p126m5.n f49646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p116l5.f f49647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p106k5.H f49648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p166q5.g f49649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p106k5.C6890a f49650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p126m5.e f49651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p076h5.a f49652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p086i5.a f49653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p106k5.C6902m f49654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p106k5.Z f49655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p106k5.A f49656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p186s5.j f49657o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final p115l4.C6932m f49658p = new p115l4.C6932m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final p115l4.C6932m f49659q = new p115l4.C6932m();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final p115l4.C6932m f49660r = new p115l4.C6932m();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f49661s = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: k5.p$a */
    class a implements k5.A.a {
        a() {
        }

        @Override // k5.A.a
        public void a(p186s5.j jVar, java.lang.Thread thread, java.lang.Throwable th) {
            p106k5.C6905p.this.G(jVar, thread, th);
        }
    }

    /* JADX INFO: renamed from: k5.p$b */
    class b implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.Throwable f49664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Thread f49665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p186s5.j f49666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f49667e;

        /* JADX INFO: renamed from: k5.p$b$a */
        class a implements p115l4.InterfaceC6930k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f49669a;

            a(java.lang.String str) {
                this.f49669a = str;
            }

            @Override // p115l4.InterfaceC6930k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p115l4.AbstractC6931l a(p186s5.d dVar) {
                if (dVar != null) {
                    return p115l4.AbstractC6934o.g(p106k5.C6905p.this.N(), p106k5.C6905p.this.f49655m.z(p106k5.C6905p.this.f49647e.f50062a, p106k5.C6905p.b.this.f49667e ? this.f49669a : null));
                }
                p076h5.g.f().k("Received null app settings, cannot send reports at crash time.");
                return p115l4.AbstractC6934o.e(null);
            }
        }

        b(long j6, java.lang.Throwable th, java.lang.Thread thread, p186s5.j jVar, boolean z6) {
            this.f49663a = j6;
            this.f49664b = th;
            this.f49665c = thread;
            this.f49666d = jVar;
            this.f49667e = z6;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p115l4.AbstractC6931l call() {
            long jE = p106k5.C6905p.E(this.f49663a);
            java.lang.String strA = p106k5.C6905p.this.A();
            if (strA == null) {
                p076h5.g.f().d("Tried to write a fatal exception while no session was open.");
                return p115l4.AbstractC6934o.e(null);
            }
            p106k5.C6905p.this.f49645c.a();
            p106k5.C6905p.this.f49655m.v(this.f49664b, this.f49665c, strA, jE);
            p106k5.C6905p.this.v(this.f49663a);
            p106k5.C6905p.this.s(this.f49666d);
            p106k5.C6905p.this.u(new p106k5.C6897h().c(), java.lang.Boolean.valueOf(this.f49667e));
            return !p106k5.C6905p.this.f49644b.d() ? p115l4.AbstractC6934o.e(null) : this.f49666d.a().p(p106k5.C6905p.this.f49647e.f50062a, new p106k5.C6905p.b.a(strA));
        }
    }

    /* JADX INFO: renamed from: k5.p$c */
    class c implements p115l4.InterfaceC6930k {
        c() {
        }

        @Override // p115l4.InterfaceC6930k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p115l4.AbstractC6931l a(java.lang.Void r6) {
            return p115l4.AbstractC6934o.e(java.lang.Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: k5.p$d */
    class d implements p115l4.InterfaceC6930k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p115l4.AbstractC6931l f49672a;

        /* JADX INFO: renamed from: k5.p$d$a */
        class a implements p115l4.InterfaceC6930k {
            a() {
            }

            @Override // p115l4.InterfaceC6930k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p115l4.AbstractC6931l a(p186s5.d dVar) {
                if (dVar == null) {
                    p076h5.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                } else {
                    p106k5.C6905p.this.N();
                    p106k5.C6905p.this.f49655m.y(p106k5.C6905p.this.f49647e.f50062a);
                    p106k5.C6905p.this.f49660r.e(null);
                }
                return p115l4.AbstractC6934o.e(null);
            }
        }

        d(p115l4.AbstractC6931l abstractC6931l) {
            this.f49672a = abstractC6931l;
        }

        @Override // p115l4.InterfaceC6930k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p115l4.AbstractC6931l a(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                p076h5.g.f().b("Sending cached crash reports...");
                p106k5.C6905p.this.f49644b.c(bool.booleanValue());
                return this.f49672a.p(p106k5.C6905p.this.f49647e.f50062a, new p106k5.C6905p.d.a());
            }
            p076h5.g.f().i("Deleting cached crash reports...");
            p106k5.C6905p.q(p106k5.C6905p.this.L());
            p106k5.C6905p.this.f49655m.x();
            p106k5.C6905p.this.f49660r.e(null);
            return p115l4.AbstractC6934o.e(null);
        }
    }

    /* JADX INFO: renamed from: k5.p$e */
    class e implements java.util.concurrent.Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49675a;

        e(long j6) {
            this.f49675a = j6;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Void call() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f49675a);
            p106k5.C6905p.this.f49653k.a("_ae", bundle);
            return null;
        }
    }

    C6905p(android.content.Context context, p106k5.H h6, p106k5.C c6, p166q5.g gVar, p106k5.C6912x c6912x, p106k5.C6890a c6890a, p126m5.n nVar, p126m5.e eVar, p106k5.Z z6, p076h5.a aVar, p086i5.a aVar2, p106k5.C6902m c6902m, p116l5.f fVar) {
        this.f49643a = context;
        this.f49648f = h6;
        this.f49644b = c6;
        this.f49649g = gVar;
        this.f49645c = c6912x;
        this.f49650h = c6890a;
        this.f49646d = nVar;
        this.f49651i = eVar;
        this.f49652j = aVar;
        this.f49653k = aVar2;
        this.f49654l = c6902m;
        this.f49655m = z6;
        this.f49647e = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String A() {
        java.util.SortedSet sortedSetR = this.f49655m.r();
        if (sortedSetR.isEmpty()) {
            return null;
        }
        return (java.lang.String) sortedSetR.first();
    }

    private static long B() {
        return E(java.lang.System.currentTimeMillis());
    }

    static java.util.List C(p076h5.h hVar, java.lang.String str, p166q5.g gVar, byte[] bArr) {
        java.io.File fileQ = gVar.q(str, "user-data");
        java.io.File fileQ2 = gVar.q(str, "keys");
        java.io.File fileQ3 = gVar.q(str, "rollouts-state");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new p106k5.C6896g("logs_file", "logs", bArr));
        arrayList.add(new p106k5.F("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new p106k5.F("session_meta_file", "session", hVar.f()));
        arrayList.add(new p106k5.F("app_meta_file", "app", hVar.a()));
        arrayList.add(new p106k5.F("device_meta_file", "device", hVar.c()));
        arrayList.add(new p106k5.F("os_meta_file", "os", hVar.b()));
        arrayList.add(P(hVar));
        arrayList.add(new p106k5.F("user_meta_file", "user", fileQ));
        arrayList.add(new p106k5.F("keys_file", "keys", fileQ2));
        arrayList.add(new p106k5.F("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private java.io.InputStream D(java.lang.String str) {
        java.lang.ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            p076h5.g.f().k("Couldn't get Class Loader");
            return null;
        }
        java.io.InputStream inputStreamZqubf = com.napsternetlabs.napsternetv.ProtectedMyApplication.zqubf(classLoader, str);
        if (inputStreamZqubf != null) {
            return inputStreamZqubf;
        }
        p076h5.g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j6) {
        return j6 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(java.lang.String str) {
        u(str, java.lang.Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(java.io.File file, java.lang.String str) {
        return str.startsWith(".ae");
    }

    private p115l4.AbstractC6931l M(long j6) {
        if (z()) {
            p076h5.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return p115l4.AbstractC6934o.e(null);
        }
        p076h5.g.f().b("Logging app exception event to Firebase Analytics");
        return p115l4.AbstractC6934o.c(new java.util.concurrent.ScheduledThreadPoolExecutor(1), new p106k5.C6905p.e(j6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p115l4.AbstractC6931l N() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : L()) {
            try {
                arrayList.add(M(java.lang.Long.parseLong(file.getName().substring(3))));
            } catch (java.lang.NumberFormatException unused) {
                p076h5.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return p115l4.AbstractC6934o.f(arrayList);
    }

    private static boolean O(java.lang.String str, java.io.File file, n5.F.a aVar) {
        if (file == null || !file.exists()) {
            p076h5.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            p076h5.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static p106k5.K P(p076h5.h hVar) {
        java.io.File fileE = hVar.e();
        return (fileE == null || !fileE.exists()) ? new p106k5.C6896g("minidump_file", "minidump", new byte[]{0}) : new p106k5.F("minidump_file", "minidump", fileE);
    }

    private static byte[] R(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i6);
        }
    }

    private p115l4.AbstractC6931l V() {
        if (this.f49644b.d()) {
            p076h5.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f49658p.e(java.lang.Boolean.FALSE);
            return p115l4.AbstractC6934o.e(java.lang.Boolean.TRUE);
        }
        p076h5.g.f().b("Automatic data collection is disabled.");
        p076h5.g.f().i("Notifying that unsent reports are available.");
        this.f49658p.e(java.lang.Boolean.TRUE);
        p115l4.AbstractC6931l abstractC6931lQ = this.f49644b.h().q(new p106k5.C6905p.c());
        p076h5.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return p116l5.b.c(abstractC6931lQ, this.f49659q.a());
    }

    private void W(java.lang.String str) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 30) {
            p076h5.g.f().i("ANR feature enabled, but device is API " + i6);
            return;
        }
        java.util.List historicalProcessExitReasons = ((android.app.ActivityManager) this.f49643a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f49655m.w(str, historicalProcessExitReasons, new p126m5.e(this.f49649g, str), p126m5.n.l(str, this.f49649g, this.f49647e));
        } else {
            p076h5.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static n5.G.a n(p106k5.H h6, p106k5.C6890a c6890a) {
        return n5.G.a.b(h6.f(), c6890a.f49598f, c6890a.f49599g, h6.a().c(), p106k5.D.g(c6890a.f49596d).i(), c6890a.f49600h);
    }

    private static n5.G.b o(android.content.Context context) {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        return n5.G.b.c(p106k5.AbstractC6898i.k(), android.os.Build.MODEL, java.lang.Runtime.getRuntime().availableProcessors(), p106k5.AbstractC6898i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), p106k5.AbstractC6898i.w(), p106k5.AbstractC6898i.l(), android.os.Build.MANUFACTURER, android.os.Build.PRODUCT);
    }

    private static n5.G.c p() {
        return n5.G.c.a(android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, p106k5.AbstractC6898i.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.io.File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z6, p186s5.j jVar, boolean z10) {
        java.lang.String str;
        p116l5.f.c();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f49655m.r());
        if (arrayList.size() <= z6) {
            p076h5.g.f().i("No open sessions to be closed.");
            return;
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(z6 ? 1 : 0);
        if (z10 && jVar.b().f54362b.f54370b) {
            W(str2);
        } else {
            p076h5.g.f().i("ANR feature disabled.");
        }
        if (z10 && this.f49652j.d(str2)) {
            x(str2);
        }
        if (z6 != 0) {
            str = (java.lang.String) arrayList.get(0);
        } else {
            this.f49654l.e(null);
            str = null;
        }
        this.f49655m.l(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(java.lang.String str, java.lang.Boolean bool) {
        long jB = B();
        p076h5.g.f().b("Opening a new session with ID " + str);
        this.f49652j.b(str, java.lang.String.format(java.util.Locale.US, "Crashlytics Android SDK/%s", p106k5.C6911w.k()), jB, p136n5.G.b(n(this.f49648f, this.f49650h), p(), o(this.f49643a)));
        if (bool.booleanValue() && str != null) {
            this.f49646d.o(str);
        }
        this.f49651i.e(str);
        this.f49654l.e(str);
        this.f49655m.s(str, jB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j6) {
        try {
            if (this.f49649g.g(".ae" + j6).createNewFile()) {
            } else {
                throw new java.io.IOException("Create new file failed.");
            }
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Could not create app exception marker file.", e6);
        }
    }

    private void x(java.lang.String str) {
        p076h5.g.f().i("Finalizing native report for session " + str);
        p076h5.h hVarA = this.f49652j.a(str);
        java.io.File fileE = hVarA.e();
        n5.F.a aVarD = hVarA.d();
        if (O(str, fileE, aVarD)) {
            p076h5.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        p126m5.e eVar = new p126m5.e(this.f49649g, str);
        java.io.File fileK = this.f49649g.k(str);
        if (!fileK.isDirectory()) {
            p076h5.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        java.util.List listC = C(hVarA, str, this.f49649g, eVar.b());
        p106k5.L.b(fileK, listC);
        p076h5.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f49655m.k(str, listC, aVarD);
        eVar.a();
    }

    private static boolean z() {
        try {
            java.lang.Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    java.lang.String F() {
        java.io.InputStream inputStreamD = D("META-INF/version-control-info.textproto");
        if (inputStreamD == null) {
            return null;
        }
        p076h5.g.f().b("Read version control info");
        return android.util.Base64.encodeToString(R(inputStreamD), 0);
    }

    void G(p186s5.j jVar, java.lang.Thread thread, java.lang.Throwable th) {
        H(jVar, thread, th, false);
    }

    synchronized void H(p186s5.j jVar, java.lang.Thread thread, java.lang.Throwable th, boolean z6) {
        try {
            p076h5.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            p115l4.AbstractC6931l abstractC6931lH = this.f49647e.f50062a.h(new p106k5.C6905p.b(java.lang.System.currentTimeMillis(), th, thread, jVar, z6));
            if (!z6) {
                try {
                    try {
                        p106k5.c0.b(abstractC6931lH);
                    } catch (java.util.concurrent.TimeoutException unused) {
                        p076h5.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    }
                } catch (java.lang.Exception e6) {
                    p076h5.g.f().e("Error handling uncaught exception", e6);
                }
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
    }

    boolean I() {
        p106k5.A a6 = this.f49656n;
        return a6 != null && a6.a();
    }

    java.util.List L() {
        return this.f49649g.h(f49642t);
    }

    void Q(final java.lang.String str) {
        this.f49647e.f50062a.g(new java.lang.Runnable() { // from class: k5.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f49640C.J(str);
            }
        });
    }

    void S() {
        try {
            java.lang.String strF = F();
            if (strF != null) {
                T("com.crashlytics.version-control-info", strF);
                p076h5.g.f().g("Saved version control info");
            }
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Unable to save version control info", e6);
        }
    }

    void T(java.lang.String str, java.lang.String str2) {
        try {
            this.f49646d.n(str, str2);
        } catch (java.lang.IllegalArgumentException e6) {
            android.content.Context context = this.f49643a;
            if (context != null && p106k5.AbstractC6898i.u(context)) {
                throw e6;
            }
            p076h5.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(p115l4.AbstractC6931l abstractC6931l) {
        if (this.f49655m.o()) {
            p076h5.g.f().i("Crash reports are available to be sent.");
            V().p(this.f49647e.f50062a, new p106k5.C6905p.d(abstractC6931l));
        } else {
            p076h5.g.f().i("No crash reports are available to be sent.");
            this.f49658p.e(java.lang.Boolean.FALSE);
        }
    }

    void X(long j6, java.lang.String str) {
        if (I()) {
            return;
        }
        this.f49651i.g(j6, str);
    }

    boolean r() {
        p116l5.f.c();
        if (!this.f49645c.c()) {
            java.lang.String strA = A();
            return strA != null && this.f49652j.d(strA);
        }
        p076h5.g.f().i("Found previous crash marker.");
        this.f49645c.d();
        return true;
    }

    void s(p186s5.j jVar) {
        t(false, jVar, false);
    }

    void w(java.lang.String str, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, p186s5.j jVar) {
        this.f49657o = jVar;
        Q(str);
        p106k5.A a6 = new p106k5.A(new p106k5.C6905p.a(), jVar, uncaughtExceptionHandler, this.f49652j);
        this.f49656n = a6;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(a6);
    }

    boolean y(p186s5.j jVar) {
        p116l5.f.c();
        if (I()) {
            p076h5.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        p076h5.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            p076h5.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (java.lang.Exception e6) {
            p076h5.g.f().e("Unable to finalize previously open sessions.", e6);
            return false;
        }
    }
}
