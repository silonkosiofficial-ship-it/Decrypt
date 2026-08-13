package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3958ho implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.IBinder iBinderS = null;
        android.os.IBinder iBinderS2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            int iL = R3.b.l(iR);
            if (iL == 1) {
                iBinderS = R3.b.s(parcel, iR);
            } else if (iL != 2) {
                R3.b.x(parcel, iR);
            } else {
                iBinderS2 = R3.b.s(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new com.google.android.gms.internal.ads.C3848go(iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new com.google.android.gms.internal.ads.C3848go[i6];
    }
}
