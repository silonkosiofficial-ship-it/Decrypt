package B3;

/* JADX INFO: renamed from: B3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0814u implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3300bo f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ B3.BinderC0816w f703c;

    C0814u(B3.BinderC0816w binderC0816w, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo, boolean z6) {
        this.f701a = interfaceC3300bo;
        this.f702b = z6;
        this.f703c = binderC0816w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        try {
            this.f701a.o("Internal error: " + th.getMessage());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C2559La0 c2559La0;
        java.lang.String string;
        java.util.List<android.net.Uri> list = (java.util.List) obj;
        try {
            B3.BinderC0816w.w6(this.f703c, list);
            this.f701a.E1(list);
            if (!this.f703c.f727P && !this.f702b) {
                return;
            }
            for (android.net.Uri uri : list) {
                if (this.f703c.D6(uri)) {
                    android.net.Uri uriN6 = B3.BinderC0816w.N6(uri, this.f703c.f735X, "1");
                    c2559La0 = this.f703c.f725N;
                    string = uriN6.toString();
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25628m7)).booleanValue()) {
                        c2559La0 = this.f703c.f725N;
                        string = uri.toString();
                    }
                }
                c2559La0.d(string, null, null);
            }
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }
}
