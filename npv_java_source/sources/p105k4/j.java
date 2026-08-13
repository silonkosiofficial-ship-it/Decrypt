package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends R3.a {
    public static final android.os.Parcelable.Creator<p105k4.j> CREATOR = new p105k4.k();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f49533C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final Q3.M f49534D;

    j(int i6, Q3.M m6) {
        this.f49533C = i6;
        this.f49534D = m6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f49533C);
        R3.c.p(parcel, 2, this.f49534D, i6, false);
        R3.c.b(parcel, iA);
    }
}
