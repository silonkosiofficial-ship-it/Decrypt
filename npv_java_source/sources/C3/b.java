package C3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f1283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f1284b;

    public b(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f1283a = interfaceC5078rz0;
        this.f1284b = interfaceC5078rz1;
    }

    public static C3.b a(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        return new C3.b(interfaceC5078rz0, interfaceC5078rz1);
    }

    public static C3.a d(android.content.Context context, p224w3.a aVar) {
        return new C3.a(context, aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3.a b() {
        return d((android.content.Context) this.f1283a.b(), (p224w3.a) this.f1284b.b());
    }
}
