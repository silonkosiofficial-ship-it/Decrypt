package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4828pk extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4938qk {
    public AbstractBinderC4828pk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceB;
        com.google.android.gms.internal.ads.InterfaceC5267tk c5047rk;
        if (i6 != 3) {
            if (i6 == 4) {
                f();
            } else if (i6 == 5) {
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c5047rk = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    c5047rk = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5267tk ? (com.google.android.gms.internal.ads.InterfaceC5267tk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5047rk(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                h3(aVarY0, c5047rk);
            } else if (i6 == 6) {
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                zze(aVarY1);
            } else {
                if (i6 != 7) {
                    return false;
                }
                iInterfaceB = c();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterfaceB = b();
        parcel2.writeNoException();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceB);
        return true;
    }
}
