package p184s3;

/* JADX INFO: renamed from: s3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7094g extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54249c;

    C7094g(p184s3.C7141w c7141w, android.content.Context context, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54248b = context;
        this.f54249c = interfaceC2945Vl;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54248b, "out_of_context_tester");
        return null;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        android.content.Context context = this.f54248b;
        X3.a aVarC2 = X3.b.c2(context);
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25640n9)).booleanValue()) {
            return interfaceC7110l0.b6(aVarC2, this.f54249c, 244410000);
        }
        return null;
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        android.content.Context context = this.f54248b;
        X3.a aVarC2 = X3.b.c2(context);
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25640n9)).booleanValue()) {
            return null;
        }
        try {
            return ((p184s3.R0) p224w3.t.b(this.f54248b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new p224w3.r() { // from class: s3.f
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof p184s3.R0 ? (p184s3.R0) iInterfaceQueryLocalInterface : new p184s3.R0(iBinder);
                }
            })).d2(aVarC2, this.f54249c, 244410000);
        } catch (android.os.RemoteException | java.lang.NullPointerException | p224w3.s e6) {
            com.google.android.gms.internal.ads.C4396lo.c(this.f54248b).a(e6, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
