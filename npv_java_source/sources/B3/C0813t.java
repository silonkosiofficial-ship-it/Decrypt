package B3;

/* JADX INFO: renamed from: B3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0813t implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3300bo f694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ B3.BinderC0816w f696c;

    C0813t(B3.BinderC0816w binderC0816w, com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300bo, boolean z6) {
        this.f694a = interfaceC3300bo;
        this.f695b = z6;
        this.f696c = binderC0816w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        try {
            this.f694a.o("Internal error: " + th.getMessage());
        } catch (android.os.RemoteException e6) {
            p224w3.p.e("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        com.google.android.gms.internal.ads.C2559La0 c2559La0;
        java.lang.String string;
        java.util.ArrayList<android.net.Uri> arrayList = (java.util.ArrayList) obj;
        try {
            this.f694a.E1(arrayList);
            if (!this.f696c.f726O && !this.f695b) {
                return;
            }
            for (android.net.Uri uri : arrayList) {
                if (this.f696c.E6(uri)) {
                    android.net.Uri uriN6 = B3.BinderC0816w.N6(uri, this.f696c.f735X, "1");
                    c2559La0 = this.f696c.f725N;
                    string = uriN6.toString();
                } else {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25628m7)).booleanValue()) {
                        c2559La0 = this.f696c.f725N;
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
