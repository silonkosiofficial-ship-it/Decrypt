package Q3;

/* JADX INFO: loaded from: classes.dex */
abstract class Q extends Q3.c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f8876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Q(Q3.AbstractC1464c abstractC1464c, int i6, android.os.Bundle bundle) {
        super(abstractC1464c, java.lang.Boolean.TRUE);
        this.f8877f = abstractC1464c;
        this.f8875d = i6;
        this.f8876e = bundle;
    }

    @Override // Q3.c0
    protected final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        if (this.f8875d != 0) {
            this.f8877f.i0(1, null);
            android.os.Bundle bundle = this.f8876e;
            f(new N3.C1389b(this.f8875d, bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f8877f.i0(1, null);
            f(new N3.C1389b(8, null));
        }
    }

    @Override // Q3.c0
    protected final void b() {
    }

    protected abstract void f(N3.C1389b c1389b);

    protected abstract boolean g();
}
