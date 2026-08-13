package p106k5;

/* JADX INFO: loaded from: classes3.dex */
public class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p106k5.C6913y f49586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p166q5.e f49587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p176r5.b f49588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p126m5.e f49589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p126m5.n f49590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p106k5.H f49591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p116l5.f f49592g;

    Z(p106k5.C6913y c6913y, p166q5.e eVar, p176r5.b bVar, p126m5.e eVar2, p126m5.n nVar, p106k5.H h6, p116l5.f fVar) {
        this.f49586a = c6913y;
        this.f49587b = eVar;
        this.f49588c = bVar;
        this.f49589d = eVar2;
        this.f49590e = nVar;
        this.f49591f = h6;
        this.f49592g = fVar;
    }

    private n5.F.e.d d(n5.F.e.d dVar, p126m5.e eVar, p126m5.n nVar) {
        n5.F.e.d.b bVarH = dVar.h();
        java.lang.String strC = eVar.c();
        if (strC != null) {
            bVarH.d(n5.F.e.d.AbstractC0665d.a().b(strC).a());
        } else {
            p076h5.g.f().i("No log data to include with this event.");
        }
        java.util.List listN = n(nVar.f());
        java.util.List listN2 = n(nVar.g());
        if (!listN.isEmpty() || !listN2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listN).g(listN2).a());
        }
        return bVarH.a();
    }

    private n5.F.e.d e(n5.F.e.d dVar) {
        return f(d(dVar, this.f49589d, this.f49590e), this.f49590e);
    }

    private n5.F.e.d f(n5.F.e.d dVar, p126m5.n nVar) {
        java.util.List listH = nVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        n5.F.e.d.b bVarH = dVar.h();
        bVarH.e(n5.F.e.d.f.a().b(listH).a());
        return bVarH.a();
    }

    private static n5.F.a g(android.app.ApplicationExitInfo applicationExitInfo) {
        java.lang.String strH = null;
        try {
            java.io.InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strH = h(traceInputStream);
            }
        } catch (java.io.IOException e6) {
            p076h5.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e6);
        }
        return n5.F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strH).a();
    }

    public static java.lang.String h(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 == -1) {
                return byteArrayOutputStream.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i6);
        }
    }

    public static p106k5.Z i(android.content.Context context, p106k5.H h6, p166q5.g gVar, p106k5.C6890a c6890a, p126m5.e eVar, p126m5.n nVar, p196t5.d dVar, p186s5.j jVar, p106k5.M m6, p106k5.C6902m c6902m, p116l5.f fVar) {
        return new p106k5.Z(new p106k5.C6913y(context, h6, c6890a, dVar, jVar), new p166q5.e(gVar, jVar, c6902m), p176r5.b.b(context, jVar, m6), eVar, nVar, h6, fVar);
    }

    private p106k5.AbstractC6914z j(p106k5.AbstractC6914z abstractC6914z) {
        if (abstractC6914z.b().h() != null && abstractC6914z.b().g() != null) {
            return abstractC6914z;
        }
        p106k5.G gD = this.f49591f.d(true);
        return p106k5.AbstractC6914z.a(abstractC6914z.b().t(gD.b()).s(gD.a()), abstractC6914z.d(), abstractC6914z.c());
    }

    private android.app.ApplicationExitInfo m(java.lang.String str, java.util.List list) {
        long jQ = this.f49587b.q(str);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.app.ApplicationExitInfo applicationExitInfoA = R2.d.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static java.util.List n(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.ensureCapacity(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(n5.F.c.a().b((java.lang.String) entry.getKey()).c((java.lang.String) entry.getValue()).a());
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: k5.W
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return p106k5.Z.p((n5.F.c) obj, (n5.F.c) obj2);
            }
        });
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(n5.F.c cVar, n5.F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(n5.F.e.d dVar, java.lang.String str, boolean z6) {
        p076h5.g.f().b("disk worker: log non-fatal event to persistence");
        this.f49587b.y(dVar, str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(p115l4.AbstractC6931l abstractC6931l) {
        if (!abstractC6931l.o()) {
            p076h5.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC6931l.k());
            return false;
        }
        p106k5.AbstractC6914z abstractC6914z = (p106k5.AbstractC6914z) abstractC6931l.l();
        p076h5.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + abstractC6914z.d());
        java.io.File fileC = abstractC6914z.c();
        if (fileC.delete()) {
            p076h5.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        p076h5.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void u(java.lang.Throwable th, java.lang.Thread thread, final java.lang.String str, java.lang.String str2, long j6, boolean z6) {
        final boolean zEquals = str2.equals("crash");
        final n5.F.e.d dVarE = e(this.f49586a.d(th, thread, str2, j6, 4, 8, z6));
        if (z6) {
            this.f49587b.y(dVarE, str, zEquals);
        } else {
            this.f49592g.f50063b.g(new java.lang.Runnable() { // from class: k5.Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49582C.q(dVarE, str, zEquals);
                }
            });
        }
    }

    public void k(java.lang.String str, java.util.List list, n5.F.a aVar) {
        p076h5.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            n5.F.d.b bVarC = ((p106k5.K) it.next()).c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        this.f49587b.l(str, n5.F.d.a().b(j$.util.DesugarCollections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void l(long j6, java.lang.String str) {
        this.f49587b.k(str, j6);
    }

    public boolean o() {
        return this.f49587b.r();
    }

    public java.util.SortedSet r() {
        return this.f49587b.p();
    }

    public void s(java.lang.String str, long j6) {
        this.f49587b.z(this.f49586a.e(str, j6));
    }

    public void v(java.lang.Throwable th, java.lang.Thread thread, java.lang.String str, long j6) {
        p076h5.g.f().i("Persisting fatal event for session " + str);
        u(th, thread, str, "crash", j6, true);
    }

    public void w(java.lang.String str, java.util.List list, p126m5.e eVar, p126m5.n nVar) {
        android.app.ApplicationExitInfo applicationExitInfoM = m(str, list);
        if (applicationExitInfoM == null) {
            p076h5.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        n5.F.e.d dVarC = this.f49586a.c(g(applicationExitInfoM));
        p076h5.g.f().b("Persisting anr for session " + str);
        this.f49587b.y(f(d(dVarC, eVar, nVar), nVar), str, true);
    }

    public void x() {
        this.f49587b.i();
    }

    public p115l4.AbstractC6931l y(java.util.concurrent.Executor executor) {
        return z(executor, null);
    }

    public p115l4.AbstractC6931l z(java.util.concurrent.Executor executor, java.lang.String str) {
        java.util.List<p106k5.AbstractC6914z> listW = this.f49587b.w();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p106k5.AbstractC6914z abstractC6914z : listW) {
            if (str == null || str.equals(abstractC6914z.d())) {
                arrayList.add(this.f49588c.c(j(abstractC6914z), str != null).h(executor, new p115l4.InterfaceC6922c() { // from class: k5.X
                    @Override // p115l4.InterfaceC6922c
                    public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                        return java.lang.Boolean.valueOf(this.f49581a.t(abstractC6931l));
                    }
                }));
            }
        }
        return p115l4.AbstractC6934o.f(arrayList);
    }
}
