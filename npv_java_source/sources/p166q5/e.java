package p166q5;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.nio.charset.Charset f53122e = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f53123f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p146o5.j f53124g = new p146o5.j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Comparator f53125h = new java.util.Comparator() { // from class: q5.a
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p166q5.e.u((java.io.File) obj, (java.io.File) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.io.FilenameFilter f53126i = new java.io.FilenameFilter() { // from class: q5.b
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return p166q5.e.v(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f53127a = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p166q5.g f53128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p186s5.j f53129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p106k5.C6902m f53130d;

    public e(p166q5.g gVar, p186s5.j jVar, p106k5.C6902m c6902m) {
        this.f53128b = gVar;
        this.f53129c = jVar;
        this.f53130d = c6902m;
    }

    private static java.lang.String A(java.io.File file) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        while (true) {
            try {
                int i6 = fileInputStream.read(bArr);
                if (i6 <= 0) {
                    java.lang.String str = new java.lang.String(byteArrayOutputStream.toByteArray(), f53122e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            } catch (java.lang.Throwable th) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(java.io.File file, n5.F.d dVar, java.lang.String str, n5.F.a aVar) {
        java.lang.String strD = this.f53130d.d(str);
        try {
            p146o5.j jVar = f53124g;
            F(this.f53128b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(strD)));
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Could not synthesize final native report file for " + file, e6);
        }
    }

    private void C(java.lang.String str, long j6) {
        boolean z6;
        java.util.List listR = this.f53128b.r(str, f53126i);
        if (listR.isEmpty()) {
            p076h5.g.f().i("Session " + str + " has no events.");
            return;
        }
        java.util.Collections.sort(listR);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listR.iterator();
        loop0: while (true) {
            z6 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                java.io.File file = (java.io.File) it.next();
                try {
                    arrayList.add(f53124g.j(A(file)));
                    if (z6 || s(file.getName())) {
                        z6 = true;
                    }
                } catch (java.io.IOException e6) {
                    p076h5.g.f().l("Could not add event to report for " + file, e6);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f53128b.q(str, "report"), arrayList, j6, z6, p126m5.n.m(str, this.f53128b), this.f53130d.d(str));
        } else {
            p076h5.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(java.io.File file, java.util.List list, long j6, boolean z6, java.lang.String str, java.lang.String str2) {
        try {
            p146o5.j jVar = f53124g;
            p136n5.F fR = jVar.L(A(file)).v(j6, z6, str).p(str2).r(list);
            n5.F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            p076h5.g.f().b("appQualitySessionId: " + str2);
            F(z6 ? this.f53128b.l(eVarN.i()) : this.f53128b.n(eVarN.i()), jVar.M(fR));
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Could not synthesize final report file for " + file, e6);
        }
    }

    private int E(java.lang.String str, int i6) {
        java.util.List listR = this.f53128b.r(str, new java.io.FilenameFilter() { // from class: q5.c
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str2) {
                return p166q5.e.t(file, str2);
            }
        });
        java.util.Collections.sort(listR, new java.util.Comparator() { // from class: q5.d
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return p166q5.e.x((java.io.File) obj, (java.io.File) obj2);
            }
        });
        return f(listR, i6);
    }

    private static void F(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), f53122e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (java.lang.Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(java.io.File file, java.lang.String str, long j6) throws java.io.IOException {
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), f53122e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j6));
            outputStreamWriter.close();
        } catch (java.lang.Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private java.util.SortedSet e(java.lang.String str) {
        this.f53128b.d();
        java.util.SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() <= 8) {
            return sortedSetP;
        }
        while (sortedSetP.size() > 8) {
            java.lang.String str2 = (java.lang.String) sortedSetP.last();
            p076h5.g.f().b("Removing session over cap: " + str2);
            this.f53128b.e(str2);
            sortedSetP.remove(str2);
        }
        return sortedSetP;
    }

    private static int f(java.util.List list, int i6) {
        int size = list.size();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.io.File file = (java.io.File) it.next();
            if (size <= i6) {
                return size;
            }
            p166q5.g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i6 = this.f53129c.b().f54361a.f54373b;
        java.util.List listN = n();
        int size = listN.size();
        if (size <= i6) {
            return;
        }
        java.util.Iterator it = listN.subList(i6, size).iterator();
        while (it.hasNext()) {
            ((java.io.File) it.next()).delete();
        }
    }

    private static long h(long j6) {
        return j6 * 1000;
    }

    private void j(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((java.io.File) it.next()).delete();
        }
    }

    private static java.lang.String m(int i6, boolean z6) {
        return "event" + java.lang.String.format(java.util.Locale.US, "%010d", java.lang.Integer.valueOf(i6)) + (z6 ? "_" : "");
    }

    private java.util.List n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f53128b.m());
        arrayList.addAll(this.f53128b.j());
        java.util.Comparator comparator = f53125h;
        java.util.Collections.sort(arrayList, comparator);
        java.util.List listO = this.f53128b.o();
        java.util.Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static java.lang.String o(java.lang.String str) {
        return str.substring(0, f53123f);
    }

    private static boolean s(java.lang.String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(java.io.File file, java.lang.String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(java.io.File file, java.io.File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(java.io.File file, java.lang.String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(java.io.File file, java.io.File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f53128b.o());
        j(this.f53128b.m());
        j(this.f53128b.j());
    }

    public void k(java.lang.String str, long j6) {
        for (java.lang.String str2 : e(str)) {
            p076h5.g.f().i("Finalizing report for session " + str2);
            C(str2, j6);
            this.f53128b.e(str2);
        }
        g();
    }

    public void l(java.lang.String str, n5.F.d dVar, n5.F.a aVar) {
        java.io.File fileQ = this.f53128b.q(str, "report");
        p076h5.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        B(fileQ, dVar, str, aVar);
    }

    public java.util.SortedSet p() {
        return new java.util.TreeSet(this.f53128b.f()).descendingSet();
    }

    public long q(java.lang.String str) {
        return this.f53128b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f53128b.o().isEmpty() && this.f53128b.m().isEmpty() && this.f53128b.j().isEmpty()) ? false : true;
    }

    public java.util.List w() {
        java.util.List<java.io.File> listN = n();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : listN) {
            try {
                arrayList.add(p106k5.AbstractC6914z.a(f53124g.L(A(file)), file.getName(), file));
            } catch (java.io.IOException e6) {
                p076h5.g.f().l("Could not load report file " + file + "; deleting", e6);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(n5.F.e.d dVar, java.lang.String str, boolean z6) {
        int i6 = this.f53129c.b().f54361a.f54372a;
        try {
            F(this.f53128b.q(str, m(this.f53127a.getAndIncrement(), z6)), f53124g.k(dVar));
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Could not persist event for session " + str, e6);
        }
        E(str, i6);
    }

    public void z(p136n5.F f6) {
        n5.F.e eVarN = f6.n();
        if (eVarN == null) {
            p076h5.g.f().b("Could not get session for report");
            return;
        }
        java.lang.String strI = eVarN.i();
        try {
            F(this.f53128b.q(strI, "report"), f53124g.M(f6));
            G(this.f53128b.q(strI, "start-time"), "", eVarN.l());
        } catch (java.io.IOException e6) {
            p076h5.g.f().c("Could not persist report for session " + strI, e6);
        }
    }
}
