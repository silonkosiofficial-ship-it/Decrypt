package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3192ap extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3302bp {
    public AbstractBinderC3192ap() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            java.lang.String strC = c();
            parcel2.writeNoException();
            parcel2.writeString(strC);
        } else {
            if (i6 != 2) {
                return false;
            }
            int iB = b();
            parcel2.writeNoException();
            parcel2.writeInt(iB);
        }
        return true;
    }
}
