package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2488Jc extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2525Kc {
    public AbstractBinderC2488Jc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2525Kc o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2525Kc ? (com.google.android.gms.internal.ads.InterfaceC2525Kc) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2451Ic(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC2414Hc c2340Fc;
        if (i6 == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c2340Fc = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c2340Fc = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2414Hc ? (com.google.android.gms.internal.ads.InterfaceC2414Hc) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2340Fc(strongBinder);
            }
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            Q0(c2340Fc);
        } else if (i6 == 2) {
            parcel.readInt();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        } else {
            if (i6 != 3) {
                return false;
            }
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            B3(w6);
        }
        parcel2.writeNoException();
        return true;
    }
}
