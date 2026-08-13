package p214v3;

/* JADX INFO: loaded from: classes.dex */
final class K implements com.google.android.gms.internal.ads.InterfaceC3667f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f55851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p214v3.M f55852b;

    K(p214v3.Q q6, java.lang.String str, p214v3.M m6) {
        this.f55851a = str;
        this.f55852b = m6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3667f7
    public final void a(com.google.android.gms.internal.ads.C4215k7 c4215k7) {
        p224w3.p.g("Failed to load URL: " + this.f55851a + "\n" + c4215k7.toString());
        this.f55852b.b(null);
    }
}
