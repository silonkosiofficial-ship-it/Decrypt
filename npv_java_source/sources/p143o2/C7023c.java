package p143o2;

/* JADX INFO: renamed from: o2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7023c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f52397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f52398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2.e.c f52399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o2.n.e f52400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f52401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f52402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o2.n.d f52403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.Executor f52404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.Executor f52405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final android.content.Intent f52406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f52407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f52408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.Set f52409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f52410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.io.File f52411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.Callable f52412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.List f52413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.List f52414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f52415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p243y2.c f52416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p127m7.i f52417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f52418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f52419w;

    public C7023c(android.content.Context context, java.lang.String str, z2.e.c cVar, o2.n.e eVar, java.util.List list, boolean z6, o2.n.d dVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z10, boolean z11, java.util.Set set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable callable, o2.n.f fVar, java.util.List list2, java.util.List list3, boolean z12, p243y2.c cVar2, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(eVar, "migrationContainer");
        p247y7.AbstractC7350t.f(dVar, "journalMode");
        p247y7.AbstractC7350t.f(executor, "queryExecutor");
        p247y7.AbstractC7350t.f(executor2, "transactionExecutor");
        p247y7.AbstractC7350t.f(list2, "typeConverters");
        p247y7.AbstractC7350t.f(list3, "autoMigrationSpecs");
        this.f52397a = context;
        this.f52398b = str;
        this.f52399c = cVar;
        this.f52400d = eVar;
        this.f52401e = list;
        this.f52402f = z6;
        this.f52403g = dVar;
        this.f52404h = executor;
        this.f52405i = executor2;
        this.f52406j = intent;
        this.f52407k = z10;
        this.f52408l = z11;
        this.f52409m = set;
        this.f52410n = str2;
        this.f52411o = file;
        this.f52412p = callable;
        this.f52413q = list2;
        this.f52414r = list3;
        this.f52415s = z12;
        this.f52416t = cVar2;
        this.f52417u = iVar;
        this.f52418v = intent != null;
        this.f52419w = true;
    }

    public static /* synthetic */ p143o2.C7023c b(p143o2.C7023c c7023c, android.content.Context context, java.lang.String str, z2.e.c cVar, o2.n.e eVar, java.util.List list, boolean z6, o2.n.d dVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z10, boolean z11, java.util.Set set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable callable, o2.n.f fVar, java.util.List list2, java.util.List list3, boolean z12, p243y2.c cVar2, p127m7.i iVar, int i6, java.lang.Object obj) {
        o2.n.f fVar2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        android.content.Context context2 = (i6 & 1) != 0 ? c7023c.f52397a : context;
        java.lang.String str3 = (i6 & 2) != 0 ? c7023c.f52398b : str;
        z2.e.c cVar3 = (i6 & 4) != 0 ? c7023c.f52399c : cVar;
        o2.n.e eVar2 = (i6 & 8) != 0 ? c7023c.f52400d : eVar;
        java.util.List list4 = (i6 & 16) != 0 ? c7023c.f52401e : list;
        boolean z13 = (i6 & 32) != 0 ? c7023c.f52402f : z6;
        o2.n.d dVar2 = (i6 & 64) != 0 ? c7023c.f52403g : dVar;
        java.util.concurrent.Executor executor3 = (i6 & 128) != 0 ? c7023c.f52404h : executor;
        java.util.concurrent.Executor executor4 = (i6 & 256) != 0 ? c7023c.f52405i : executor2;
        android.content.Intent intent2 = (i6 & 512) != 0 ? c7023c.f52406j : intent;
        boolean z14 = (i6 & 1024) != 0 ? c7023c.f52407k : z10;
        boolean z15 = (i6 & 2048) != 0 ? c7023c.f52408l : z11;
        java.util.Set set2 = (i6 & 4096) != 0 ? c7023c.f52409m : set;
        java.lang.String str4 = (i6 & 8192) != 0 ? c7023c.f52410n : str2;
        java.io.File file2 = (i6 & 16384) != 0 ? c7023c.f52411o : file;
        java.util.concurrent.Callable callable2 = (i6 & 32768) != 0 ? c7023c.f52412p : callable;
        if ((i6 & 65536) != 0) {
            c7023c.getClass();
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        return c7023c.a(context2, str3, cVar3, eVar2, list4, z13, dVar2, executor3, executor4, intent2, z14, z15, set2, str4, file2, callable2, fVar2, (i6 & 131072) != 0 ? c7023c.f52413q : list2, (i6 & 262144) != 0 ? c7023c.f52414r : list3, (i6 & 524288) != 0 ? c7023c.f52415s : z12, (i6 & 1048576) != 0 ? c7023c.f52416t : cVar2, (i6 & 2097152) != 0 ? c7023c.f52417u : iVar);
    }

    public final p143o2.C7023c a(android.content.Context context, java.lang.String str, z2.e.c cVar, o2.n.e eVar, java.util.List list, boolean z6, o2.n.d dVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, android.content.Intent intent, boolean z10, boolean z11, java.util.Set set, java.lang.String str2, java.io.File file, java.util.concurrent.Callable callable, o2.n.f fVar, java.util.List list2, java.util.List list3, boolean z12, p243y2.c cVar2, p127m7.i iVar) {
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(eVar, "migrationContainer");
        p247y7.AbstractC7350t.f(dVar, "journalMode");
        p247y7.AbstractC7350t.f(executor, "queryExecutor");
        p247y7.AbstractC7350t.f(executor2, "transactionExecutor");
        p247y7.AbstractC7350t.f(list2, "typeConverters");
        p247y7.AbstractC7350t.f(list3, "autoMigrationSpecs");
        return new p143o2.C7023c(context, str, cVar, eVar, list, z6, dVar, executor, executor2, intent, z10, z11, set, str2, file, callable, fVar, list2, list3, z12, cVar2, iVar);
    }

    public final java.util.Set c() {
        return this.f52409m;
    }

    public final boolean d() {
        return this.f52419w;
    }

    public boolean e(int i6, int i10) {
        return p223w2.h.d(this, i6, i10);
    }

    public final void f(boolean z6) {
        this.f52419w = z6;
    }
}
