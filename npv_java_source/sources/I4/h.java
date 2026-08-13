package I4;

/* JADX INFO: loaded from: classes3.dex */
final class h extends K4.y {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ byte[] f5030D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ java.lang.Long f5031E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ p115l4.C6932m f5032F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final /* synthetic */ I4.d f5033G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ I4.k f5034H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(I4.k kVar, p115l4.C6932m c6932m, byte[] bArr, java.lang.Long l6, android.os.Parcelable parcelable, p115l4.C6932m c6932m2, I4.d dVar) {
        super(c6932m);
        this.f5034H = kVar;
        this.f5030D = bArr;
        this.f5031E = l6;
        this.f5032F = c6932m2;
        this.f5033G = dVar;
    }

    @Override // K4.y
    public final void a(java.lang.Exception exc) {
        if (exc instanceof K4.C1308e) {
            super.a(new I4.C1244c(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // K4.y
    protected final void b() {
        try {
            ((K4.u) this.f5034H.f5040c.e()).K2(I4.k.a(this.f5034H, this.f5030D, this.f5031E, null), new I4.j(this.f5034H, this.f5032F));
        } catch (android.os.RemoteException e6) {
            this.f5034H.f5038a.b(e6, "requestIntegrityToken(%s)", this.f5033G);
            this.f5032F.d(new I4.C1244c(-100, e6));
        }
    }
}
