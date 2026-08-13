package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q3.AbstractC1464c f8943b;

    public e0(Q3.AbstractC1464c abstractC1464c, int i6) {
        this.f8943b = abstractC1464c;
        this.f8942a = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        Q3.AbstractC1464c abstractC1464c = this.f8943b;
        if (iBinder == null) {
            Q3.AbstractC1464c.d0(abstractC1464c, 16);
            return;
        }
        synchronized (abstractC1464c.f8902n) {
            try {
                Q3.AbstractC1464c abstractC1464c2 = this.f8943b;
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1464c2.f8903o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Q3.InterfaceC1473l)) ? new Q3.U(iBinder) : (Q3.InterfaceC1473l) iInterfaceQueryLocalInterface;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.f8943b.e0(0, null, this.f8942a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f8943b.f8902n) {
            this.f8943b.f8903o = null;
        }
        Q3.AbstractC1464c abstractC1464c = this.f8943b;
        int i6 = this.f8942a;
        android.os.Handler handler = abstractC1464c.f8900l;
        handler.sendMessage(handler.obtainMessage(6, i6, 1));
    }
}
