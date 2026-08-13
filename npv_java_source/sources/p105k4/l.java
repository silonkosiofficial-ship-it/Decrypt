package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends R3.a {
    public static final android.os.Parcelable.Creator<p105k4.l> CREATOR = new p105k4.m();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f49535C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final N3.C1389b f49536D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Q3.O f49537E;

    l(int i6, N3.C1389b c1389b, Q3.O o6) {
        this.f49535C = i6;
        this.f49536D = c1389b;
        this.f49537E = o6;
    }

    public final N3.C1389b e() {
        return this.f49536D;
    }

    public final Q3.O f() {
        return this.f49537E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f49535C);
        R3.c.p(parcel, 2, this.f49536D, i6, false);
        R3.c.p(parcel, 3, this.f49537E, i6, false);
        R3.c.b(parcel, iA);
    }
}
