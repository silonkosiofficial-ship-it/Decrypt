package K4;

/* JADX INFO: renamed from: K4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ServiceConnectionC1306c implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ K4.C1307d f6105a;

    /* synthetic */ ServiceConnectionC1306c(K4.C1307d c1307d, K4.AbstractC1305b abstractC1305b) {
        this.f6105a = c1307d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f6105a.f6108b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f6105a.c().post(new K4.F(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f6105a.f6108b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f6105a.c().post(new K4.G(this));
    }
}
