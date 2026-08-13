package B3;

/* JADX INFO: renamed from: B3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0815v implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ B3.BinderC0816w f708a;

    C0815v(B3.BinderC0816w binderC0816w) {
        this.f708a = binderC0816w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p174r3.v.s().x(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        B3.AbstractC0797c.d(this.f708a.f724M, null, "sgf", new android.util.Pair("sgf_reason", th.getMessage()), new android.util.Pair("se", "query_g"), new android.util.Pair("ad_format", p104k3.EnumC6886c.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("sgi_rn", java.lang.Integer.toString(this.f708a.f742e0.get())));
        p224w3.p.e("Failed to initialize webview for loading SDKCore. ", th);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25238C9)).booleanValue() || this.f708a.f741d0.get() || this.f708a.f742e0.getAndIncrement() >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25249D9)).intValue()) {
            return;
        }
        this.f708a.I6();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        p224w3.p.b("Initialized webview successfully for SDKCore.");
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25238C9)).booleanValue()) {
            B3.AbstractC0797c.d(this.f708a.f724M, null, "sgs", new android.util.Pair("se", "query_g"), new android.util.Pair("ad_format", p104k3.EnumC6886c.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("sgi_rn", java.lang.Integer.toString(this.f708a.f742e0.get())));
            this.f708a.f741d0.set(true);
        }
    }
}
