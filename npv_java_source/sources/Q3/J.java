package Q3;

/* JADX INFO: loaded from: classes.dex */
final class J implements O3.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ O3.g f8862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p115l4.C6932m f8863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1476o.a f8864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q3.L f8865d;

    J(O3.g gVar, p115l4.C6932m c6932m, Q3.AbstractC1476o.a aVar, Q3.L l6) {
        this.f8862a = gVar;
        this.f8863b = c6932m;
        this.f8864c = aVar;
        this.f8865d = l6;
    }

    @Override // O3.g.a
    public final void a(com.google.android.gms.common.api.Status status) {
        if (!status.C()) {
            this.f8863b.b(Q3.AbstractC1463b.a(status));
        } else {
            this.f8863b.c(this.f8864c.a(this.f8862a.b(0L, java.util.concurrent.TimeUnit.MILLISECONDS)));
        }
    }
}
