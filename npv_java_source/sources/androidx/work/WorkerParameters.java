package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.UUID f23808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.b f23809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Set f23810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.work.WorkerParameters.a f23811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.concurrent.Executor f23813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private S2.a f23814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I2.v f23815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I2.o f23816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private I2.f f23817j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.util.List f23818a = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public java.util.List f23819b = java.util.Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public android.net.Network f23820c;
    }

    public WorkerParameters(java.util.UUID uuid, androidx.work.b bVar, java.util.Collection collection, androidx.work.WorkerParameters.a aVar, int i6, java.util.concurrent.Executor executor, S2.a aVar2, I2.v vVar, I2.o oVar, I2.f fVar) {
        this.f23808a = uuid;
        this.f23809b = bVar;
        this.f23810c = new java.util.HashSet(collection);
        this.f23811d = aVar;
        this.f23812e = i6;
        this.f23813f = executor;
        this.f23814g = aVar2;
        this.f23815h = vVar;
        this.f23816i = oVar;
        this.f23817j = fVar;
    }

    public java.util.concurrent.Executor a() {
        return this.f23813f;
    }

    public I2.f b() {
        return this.f23817j;
    }

    public java.util.UUID c() {
        return this.f23808a;
    }

    public androidx.work.b d() {
        return this.f23809b;
    }

    public android.net.Network e() {
        return this.f23811d.f23820c;
    }

    public I2.o f() {
        return this.f23816i;
    }

    public int g() {
        return this.f23812e;
    }

    public java.util.Set h() {
        return this.f23810c;
    }

    public S2.a i() {
        return this.f23814g;
    }

    public java.util.List j() {
        return this.f23811d.f23818a;
    }

    public java.util.List k() {
        return this.f23811d.f23819b;
    }

    public I2.v l() {
        return this.f23815h;
    }
}
