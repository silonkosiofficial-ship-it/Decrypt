package p106k5;

/* JADX INFO: renamed from: k5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6913y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Map f49708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final java.lang.String f49709h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f49710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p106k5.H f49711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p106k5.C6890a f49712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p196t5.d f49713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p186s5.j f49714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p076h5.j f49715f = p076h5.j.f46504a;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f49708g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f49709h = java.lang.String.format(java.util.Locale.US, "Crashlytics Android SDK/%s", "19.3.0");
    }

    public C6913y(android.content.Context context, p106k5.H h6, p106k5.C6890a c6890a, p196t5.d dVar, p186s5.j jVar) {
        this.f49710a = context;
        this.f49711b = h6;
        this.f49712c = c6890a;
        this.f49713d = dVar;
        this.f49714e = jVar;
    }

    private n5.F.e.d.a.c A(n5.F.a aVar) {
        return this.f49715f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private n5.F.a a(n5.F.a aVar) {
        java.util.List listUnmodifiableList;
        if (!this.f49714e.b().f54362b.f54371c || this.f49712c.f49595c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p106k5.C6895f c6895f : this.f49712c.f49595c) {
                arrayList.add(n5.F.a.AbstractC0650a.a().d(c6895f.c()).b(c6895f.a()).c(c6895f.b()).a());
            }
            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
        }
        return n5.F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private n5.F.b b() {
        return p136n5.F.b().l("19.3.0").h(this.f49712c.f49593a).i(this.f49711b.a().c()).g(this.f49711b.a().e()).f(this.f49711b.a().d()).d(this.f49712c.f49598f).e(this.f49712c.f49599g).k(4);
    }

    private static long f(long j6) {
        if (j6 > 0) {
            return j6;
        }
        return 0L;
    }

    private static int g() {
        java.lang.Integer num;
        java.lang.String str = android.os.Build.CPU_ABI;
        if (android.text.TextUtils.isEmpty(str) || (num = (java.lang.Integer) f49708g.get(str.toLowerCase(java.util.Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private n5.F.e.d.a.b.AbstractC0654a h() {
        return n5.F.e.d.a.b.AbstractC0654a.a().b(0L).d(0L).c(this.f49712c.f49597e).e(this.f49712c.f49594b).a();
    }

    private java.util.List i() {
        return java.util.Collections.singletonList(h());
    }

    private n5.F.e.d.a j(int i6, n5.F.a aVar) {
        return n5.F.e.d.a.a().c(java.lang.Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i6).f(o(aVar)).a();
    }

    private n5.F.e.d.a k(int i6, p196t5.e eVar, java.lang.Thread thread, int i10, int i11, boolean z6) {
        java.lang.Boolean boolValueOf;
        n5.F.e.d.a.c cVarE = this.f49715f.e(this.f49710a);
        if (cVarE.b() > 0) {
            boolValueOf = java.lang.Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return n5.F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f49715f.d(this.f49710a)).h(i6).f(p(eVar, thread, i10, i11, z6)).a();
    }

    private n5.F.e.d.c l(int i6) {
        p106k5.C6894e c6894eA = p106k5.C6894e.a(this.f49710a);
        java.lang.Float fB = c6894eA.b();
        java.lang.Double dValueOf = fB != null ? java.lang.Double.valueOf(fB.doubleValue()) : null;
        int iC = c6894eA.c();
        boolean zN = p106k5.AbstractC6898i.n(this.f49710a);
        return n5.F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i6).g(f(p106k5.AbstractC6898i.b(this.f49710a) - p106k5.AbstractC6898i.a(this.f49710a))).d(p106k5.AbstractC6898i.c(android.os.Environment.getDataDirectory().getPath())).a();
    }

    private n5.F.e.d.a.b.c m(p196t5.e eVar, int i6, int i10) {
        return n(eVar, i6, i10, 0);
    }

    private n5.F.e.d.a.b.c n(p196t5.e eVar, int i6, int i10, int i11) {
        java.lang.String str = eVar.f54626b;
        java.lang.String str2 = eVar.f54625a;
        java.lang.StackTraceElement[] stackTraceElementArr = eVar.f54627c;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new java.lang.StackTraceElement[0];
        }
        p196t5.e eVar2 = eVar.f54628d;
        if (i11 >= i10) {
            p196t5.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f54628d;
                i12++;
            }
        }
        n5.F.e.d.a.b.c.AbstractC0657a abstractC0657aD = n5.F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i6)).d(i12);
        if (eVar2 != null && i12 == 0) {
            abstractC0657aD.b(n(eVar2, i6, i10, i11 + 1));
        }
        return abstractC0657aD.a();
    }

    private n5.F.e.d.a.b o(n5.F.a aVar) {
        return n5.F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private n5.F.e.d.a.b p(p196t5.e eVar, java.lang.Thread thread, int i6, int i10, boolean z6) {
        return n5.F.e.d.a.b.a().f(z(eVar, thread, i6, z6)).d(m(eVar, i6, i10)).e(w()).c(i()).a();
    }

    private n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b q(java.lang.StackTraceElement stackTraceElement, n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a abstractC0663a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? java.lang.Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        java.lang.String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        java.lang.String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0663a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private java.util.List r(java.lang.StackTraceElement[] stackTraceElementArr, int i6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.a().c(i6)));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private n5.F.e.a s() {
        return n5.F.e.a.a().e(this.f49711b.f()).g(this.f49712c.f49598f).d(this.f49712c.f49599g).f(this.f49711b.a().c()).b(this.f49712c.f49600h.d()).c(this.f49712c.f49600h.e()).a();
    }

    private n5.F.e t(java.lang.String str, long j6) {
        return n5.F.e.a().m(j6).j(str).h(f49709h).b(s()).l(v()).e(u()).i(3).a();
    }

    private n5.F.e.c u() {
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        long jB = p106k5.AbstractC6898i.b(this.f49710a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zW = p106k5.AbstractC6898i.w();
        int iL = p106k5.AbstractC6898i.l();
        java.lang.String str = android.os.Build.MANUFACTURER;
        return n5.F.e.c.a().b(iG).f(android.os.Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zW).j(iL).e(str).g(android.os.Build.PRODUCT).a();
    }

    private n5.F.e.AbstractC0667e v() {
        return n5.F.e.AbstractC0667e.a().d(3).e(android.os.Build.VERSION.RELEASE).b(android.os.Build.VERSION.CODENAME).c(p106k5.AbstractC6898i.x()).a();
    }

    private n5.F.e.d.a.b.AbstractC0658d w() {
        return n5.F.e.d.a.b.AbstractC0658d.a().d("0").c("0").b(0L).a();
    }

    private n5.F.e.d.a.b.AbstractC0660e x(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private n5.F.e.d.a.b.AbstractC0660e y(java.lang.Thread thread, java.lang.StackTraceElement[] stackTraceElementArr, int i6) {
        return n5.F.e.d.a.b.AbstractC0660e.a().d(thread.getName()).c(i6).b(r(stackTraceElementArr, i6)).a();
    }

    private java.util.List z(p196t5.e eVar, java.lang.Thread thread, int i6, boolean z6) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(y(thread, eVar.f54627c, i6));
        if (z6) {
            for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : java.lang.Thread.getAllStackTraces().entrySet()) {
                java.lang.Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f49713d.a(entry.getValue())));
                }
            }
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public n5.F.e.d c(n5.F.a aVar) {
        int i6 = this.f49710a.getResources().getConfiguration().orientation;
        return n5.F.e.d.a().g("anr").f(aVar.i()).b(j(i6, a(aVar))).c(l(i6)).a();
    }

    public n5.F.e.d d(java.lang.Throwable th, java.lang.Thread thread, java.lang.String str, long j6, int i6, int i10, boolean z6) {
        int i11 = this.f49710a.getResources().getConfiguration().orientation;
        return n5.F.e.d.a().g(str).f(j6).b(k(i11, p196t5.e.a(th, this.f49713d), thread, i6, i10, z6)).c(l(i11)).a();
    }

    public p136n5.F e(java.lang.String str, long j6) {
        return b().m(t(str, j6)).a();
    }
}
