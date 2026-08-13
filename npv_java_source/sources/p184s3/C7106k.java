package p184s3;

/* JADX INFO: renamed from: s3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7106k extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54281c;

    C7106k(p184s3.C7141w c7141w, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54280b = context;
        this.f54281c = interfaceC2945Vl;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        return null;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.Z0(X3.b.c2(this.f54280b), this.f54281c, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        try {
            return ((com.google.android.gms.internal.ads.InterfaceC2471In) p224w3.t.b(this.f54280b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new p224w3.r() { // from class: s3.j
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.AbstractBinderC2397Gn.o6((android.os.IBinder) obj);
                }
            })).t0(X3.b.c2(this.f54280b), this.f54281c, 244410000);
        } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s unused) {
            return null;
        }
    }
}
