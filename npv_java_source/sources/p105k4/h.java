package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends R3.a implements O3.k {
    public static final android.os.Parcelable.Creator<p105k4.h> CREATOR = new p105k4.i();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f49531C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f49532D;

    public h(java.util.List list, java.lang.String str) {
        this.f49531C = list;
        this.f49532D = str;
    }

    @Override // O3.k
    public final com.google.android.gms.common.api.Status d() {
        return this.f49532D != null ? com.google.android.gms.common.api.Status.f24845H : com.google.android.gms.common.api.Status.f24849L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.util.List list = this.f49531C;
        int iA = R3.c.a(parcel);
        R3.c.s(parcel, 1, list, false);
        R3.c.q(parcel, 2, this.f49532D, false);
        R3.c.b(parcel, iA);
    }
}
