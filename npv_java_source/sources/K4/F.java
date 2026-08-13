package K4;

/* JADX INFO: loaded from: classes3.dex */
final class F extends K4.y {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ android.os.IBinder f6100D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ K4.ServiceConnectionC1306c f6101E;

    F(K4.ServiceConnectionC1306c serviceConnectionC1306c, android.os.IBinder iBinder) {
        this.f6101E = serviceConnectionC1306c;
        this.f6100D = iBinder;
    }

    @Override // K4.y
    public final void b() {
        K4.C1307d c1307d = this.f6101E.f6105a;
        c1307d.f6120n = (android.os.IInterface) c1307d.f6115i.a(this.f6100D);
        K4.C1307d.r(this.f6101E.f6105a);
        this.f6101E.f6105a.f6113g = false;
        java.util.Iterator it = this.f6101E.f6105a.f6110d.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.f6101E.f6105a.f6110d.clear();
    }
}
