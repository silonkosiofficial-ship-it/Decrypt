package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2972Wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32778a;

    public C2972Wg(android.content.Context context) {
        this.f32778a = context;
    }

    public final void a(com.google.android.gms.internal.ads.InterfaceC5165so interfaceC5165so) {
        java.lang.String strValueOf;
        java.lang.String str;
        try {
            ((com.google.android.gms.internal.ads.C3008Xg) p224w3.t.b(this.f32778a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new p224w3.r() { // from class: com.google.android.gms.internal.ads.Vg
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C3008Xg ? (com.google.android.gms.internal.ads.C3008Xg) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3008Xg(iBinder);
                }
            })).d2(interfaceC5165so);
        } catch (android.os.RemoteException e6) {
            strValueOf = java.lang.String.valueOf(e6.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            p224w3.p.g(str.concat(strValueOf));
        } catch (p224w3.s e10) {
            strValueOf = java.lang.String.valueOf(e10.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            p224w3.p.g(str.concat(strValueOf));
        }
    }
}
