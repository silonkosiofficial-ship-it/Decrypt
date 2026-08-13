package p085i4;

/* JADX INFO: renamed from: i4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6651c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int iY = R3.b.y(parcel);
        android.os.Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = R3.b.r(parcel);
            if (R3.b.l(iR) != 1) {
                R3.b.x(parcel, iR);
            } else {
                bundleA = R3.b.a(parcel, iR);
            }
        }
        R3.b.k(parcel, iY);
        return new p085i4.C6650b(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i6) {
        return new p085i4.C6650b[i6];
    }
}
