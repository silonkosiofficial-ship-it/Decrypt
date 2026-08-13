package p184s3;

/* JADX INFO: renamed from: s3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7135u extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.widget.FrameLayout f54330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ android.widget.FrameLayout f54331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54333e;

    C7135u(p184s3.C7141w c7141w, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, android.content.Context context) {
        this.f54330b = frameLayout;
        this.f54331c = frameLayout2;
        this.f54332d = context;
        this.f54333e = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54332d, "native_ad_view_delegate");
        return new p184s3.E1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.J4(X3.b.c2(this.f54330b), X3.b.c2(this.f54331c));
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f54332d);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ba)).booleanValue()) {
            p184s3.C7141w c7141w = this.f54333e;
            return c7141w.f54338d.c(this.f54332d, this.f54330b, this.f54331c);
        }
        try {
            return com.google.android.gms.internal.ads.AbstractBinderC5041rh.o6(((com.google.android.gms.internal.ads.InterfaceC5591wh) p224w3.t.b(this.f54332d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new p224w3.r() { // from class: s3.t
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.AbstractBinderC5481vh.o6((android.os.IBinder) obj);
                }
            })).i4(X3.b.c2(this.f54332d), X3.b.c2(this.f54330b), X3.b.c2(this.f54331c), 244410000));
        } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s e6) {
            this.f54333e.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54332d);
            this.f54333e.f54341g.a(e6, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
