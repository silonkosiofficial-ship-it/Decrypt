package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2508Jn extends X3.c {
    public C2508Jn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2729Pn ? (com.google.android.gms.internal.ads.InterfaceC2729Pn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2655Nn(iBinder);
    }

    public final com.google.android.gms.internal.ads.InterfaceC2618Mn c(android.app.Activity activity) {
        try {
            android.os.IBinder iBinderZze = ((com.google.android.gms.internal.ads.InterfaceC2729Pn) b(activity)).zze(X3.b.c2(activity));
            if (iBinderZze == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2618Mn ? (com.google.android.gms.internal.ads.InterfaceC2618Mn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2545Kn(iBinderZze);
        } catch (X3.c.a e6) {
            p224w3.p.h("Could not create remote AdOverlay.", e6);
            return null;
        } catch (android.os.RemoteException e10) {
            p224w3.p.h("Could not create remote AdOverlay.", e10);
            return null;
        }
    }
}
