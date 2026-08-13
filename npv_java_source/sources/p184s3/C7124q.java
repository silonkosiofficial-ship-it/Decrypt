package p184s3;

/* JADX INFO: renamed from: s3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7124q extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ java.lang.String f54317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC2945Vl f54318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54319e;

    C7124q(p184s3.C7141w c7141w, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f54316b = context;
        this.f54317c = str;
        this.f54318d = interfaceC2945Vl;
        this.f54319e = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54316b, "native_ad");
        return new p184s3.BinderC7152z1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.B4(X3.b.c2(this.f54316b), this.f54317c, this.f54318d, 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f54316b);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ba)).booleanValue()) {
            return this.f54319e.f54336b.c(this.f54316b, this.f54317c, this.f54318d);
        }
        try {
            android.os.IBinder iBinderD2 = ((p184s3.S) p224w3.t.b(this.f54316b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new p224w3.r() { // from class: s3.p
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof p184s3.S ? (p184s3.S) iInterfaceQueryLocalInterface : new p184s3.S(iBinder);
                }
            })).d2(X3.b.c2(this.f54316b), this.f54317c, this.f54318d, 244410000);
            if (iBinderD2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof p184s3.Q ? (p184s3.Q) iInterfaceQueryLocalInterface : new p184s3.O(iBinderD2);
        } catch (android.os.RemoteException e6) {
            e = e6;
            this.f54319e.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54316b);
            this.f54319e.f54341g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (java.lang.NullPointerException e10) {
            e = e10;
            this.f54319e.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54316b);
            this.f54319e.f54341g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (p224w3.s e11) {
            e = e11;
            this.f54319e.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54316b);
            this.f54319e.f54341g.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
