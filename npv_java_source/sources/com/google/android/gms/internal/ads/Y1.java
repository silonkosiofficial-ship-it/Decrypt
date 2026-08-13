package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class Y1 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.Y1> CREATOR = new com.google.android.gms.internal.ads.X1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f33253C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f33254D;

    protected Y1(android.os.Parcel parcel) {
        java.lang.String string = parcel.readString();
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        this.f33253C = string;
        this.f33254D = parcel.readString();
    }

    public Y1(java.lang.String str, java.lang.String str2) {
        this.f33253C = com.google.android.gms.internal.ads.AbstractC3723fg0.b(str);
        this.f33254D = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.Y1 y6 = (com.google.android.gms.internal.ads.Y1) obj;
            if (this.f33253C.equals(y6.f33253C) && this.f33254D.equals(y6.f33254D)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final void g(com.google.android.gms.internal.ads.S8 s10) {
        byte b6;
        switch (this.f33253C) {
            case "ALBUM":
                b6 = 2;
                break;
            case "TITLE":
                b6 = 0;
                break;
            case "DESCRIPTION":
                b6 = 4;
                break;
            case "ALBUMARTIST":
                b6 = 3;
                break;
            case "ARTIST":
                b6 = 1;
                break;
            default:
                b6 = -1;
                break;
        }
        if (b6 == 0) {
            s10.J(this.f33254D);
            return;
        }
        if (b6 == 1) {
            s10.x(this.f33254D);
            return;
        }
        if (b6 == 2) {
            s10.w(this.f33254D);
        } else if (b6 == 3) {
            s10.v(this.f33254D);
        } else {
            if (b6 != 4) {
                return;
            }
            s10.A(this.f33254D);
        }
    }

    public final int hashCode() {
        return ((this.f33253C.hashCode() + 527) * 31) + this.f33254D.hashCode();
    }

    public final java.lang.String toString() {
        return "VC: " + this.f33253C + "=" + this.f33254D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeString(this.f33253C);
        parcel.writeString(this.f33254D);
    }
}
