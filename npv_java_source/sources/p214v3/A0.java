package p214v3;

/* JADX INFO: loaded from: classes.dex */
final class A0 implements com.google.android.gms.internal.ads.InterfaceC3284bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3393cg f55817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f55818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ android.net.Uri f55819c;

    A0(p214v3.E0 e6, com.google.android.gms.internal.ads.C3393cg c3393cg, android.content.Context context, android.net.Uri uri) {
        this.f55817a = c3393cg;
        this.f55818b = context;
        this.f55819c = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3284bg
    public final void a() {
        androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0346d(this.f55817a.a()).a();
        dVarA.f18641a.setPackage(com.google.android.gms.internal.ads.AbstractC5188sz0.a(this.f55818b));
        dVarA.a(this.f55818b, this.f55819c);
        this.f55817a.f((android.app.Activity) this.f55818b);
    }
}
