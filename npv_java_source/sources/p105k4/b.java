package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends R3.a implements O3.k {
    public static final android.os.Parcelable.Creator<p105k4.b> CREATOR = new p105k4.c();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f49528C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f49529D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.content.Intent f49530E;

    b(int i6, int i10, android.content.Intent intent) {
        this.f49528C = i6;
        this.f49529D = i10;
        this.f49530E = intent;
    }

    @Override // O3.k
    public final com.google.android.gms.common.api.Status d() {
        return this.f49529D == 0 ? com.google.android.gms.common.api.Status.f24845H : com.google.android.gms.common.api.Status.f24849L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f49528C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f49529D);
        R3.c.p(parcel, 3, this.f49530E, i6, false);
        R3.c.b(parcel, iA);
    }
}
