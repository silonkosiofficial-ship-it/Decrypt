package p174r3;

/* JADX INFO: loaded from: classes.dex */
final class j implements com.google.android.gms.internal.ads.InterfaceC5914zd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p174r3.k f53854a;

    j(p174r3.k kVar) {
        this.f53854a = kVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5914zd0
    public final void a(int i6, long j6, java.lang.String str) {
        this.f53854a.f53862J.e(i6, java.lang.System.currentTimeMillis() - j6, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5914zd0
    public final void e(int i6, long j6) {
        this.f53854a.f53862J.d(i6, java.lang.System.currentTimeMillis() - j6);
    }
}
