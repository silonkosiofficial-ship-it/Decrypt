package p184s3;

/* JADX INFO: renamed from: s3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7088e extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f54213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54214c;

    C7088e(p184s3.C7141w c7141w, android.app.Activity activity) {
        this.f54213b = activity;
        this.f54214c = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54213b, "ad_overlay");
        return null;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.m0(X3.b.c2(this.f54213b));
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f54213b);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ba)).booleanValue()) {
            p184s3.C7141w c7141w = this.f54214c;
            return c7141w.f54339e.c(this.f54213b);
        }
        try {
            return com.google.android.gms.internal.ads.AbstractBinderC2582Ln.o6(((com.google.android.gms.internal.ads.InterfaceC2729Pn) p224w3.t.b(this.f54213b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new p224w3.r() { // from class: s3.d
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.AbstractBinderC2692On.o6((android.os.IBinder) obj);
                }
            })).zze(X3.b.c2(this.f54213b)));
        } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s e6) {
            this.f54214c.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54213b.getApplicationContext());
            this.f54214c.f54341g.a(e6, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
