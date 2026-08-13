package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class J2 implements com.google.android.gms.internal.ads.InterfaceC3274bb {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.J2> CREATOR = new com.google.android.gms.internal.ads.G2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.util.List f28578C;

    public J2(java.util.List list) {
        this.f28578C = list;
        boolean z6 = false;
        if (!list.isEmpty()) {
            long j6 = ((com.google.android.gms.internal.ads.I2) list.get(0)).f28376D;
            for (int i6 = 1; i6 < list.size(); i6++) {
                if (((com.google.android.gms.internal.ads.I2) list.get(i6)).f28375C < j6) {
                    z6 = true;
                    break;
                }
                j6 = ((com.google.android.gms.internal.ads.I2) list.get(i6)).f28376D;
            }
        }
        com.google.android.gms.internal.ads.LC.d(!z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.internal.ads.J2.class != obj.getClass()) {
            return false;
        }
        return this.f28578C.equals(((com.google.android.gms.internal.ads.J2) obj).f28578C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3274bb
    public final /* synthetic */ void g(com.google.android.gms.internal.ads.S8 s10) {
    }

    public final int hashCode() {
        return this.f28578C.hashCode();
    }

    public final java.lang.String toString() {
        return "SlowMotion: segments=".concat(this.f28578C.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        parcel.writeList(this.f28578C);
    }
}
