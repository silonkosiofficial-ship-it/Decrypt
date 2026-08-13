package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4494mi extends X3.c {
    public C4494mi() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5591wh ? (com.google.android.gms.internal.ads.InterfaceC5591wh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5371uh(iBinder);
    }

    public final com.google.android.gms.internal.ads.InterfaceC5261th c(android.content.Context context, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        try {
            android.os.IBinder iBinderI4 = ((com.google.android.gms.internal.ads.InterfaceC5591wh) b(context)).i4(X3.b.c2(context), X3.b.c2(frameLayout), X3.b.c2(frameLayout2), 244410000);
            if (iBinderI4 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderI4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5261th ? (com.google.android.gms.internal.ads.InterfaceC5261th) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4932qh(iBinderI4);
        } catch (X3.c.a e6) {
            e = e6;
            p224w3.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (android.os.RemoteException e10) {
            e = e10;
            p224w3.p.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
