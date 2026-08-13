package B3;

/* JADX INFO: loaded from: classes.dex */
public final class I implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f538c;

    public I(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f536a = interfaceC5078rz0;
        this.f537b = interfaceC5078rz1;
        this.f538c = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.lang.Object obj = (B3.t0) this.f536a.b();
        B3.P p6 = (B3.P) this.f537b.b();
        com.google.android.gms.internal.ads.Yk0 yk0C = com.google.android.gms.internal.ads.O80.c();
        if (((java.lang.Integer) this.f538c.b()).intValue() == 2) {
            obj = p6;
        }
        return new com.google.android.gms.internal.ads.EG(obj, yk0C);
    }
}
