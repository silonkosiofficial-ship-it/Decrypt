package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.Q1> CREATOR = new p184s3.R1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f54139C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f54140D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f54141E;

    public Q1(p104k3.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    public Q1(boolean z6, boolean z10, boolean z11) {
        this.f54139C = z6;
        this.f54140D = z10;
        this.f54141E = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        boolean z6 = this.f54139C;
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 2, z6);
        R3.c.c(parcel, 3, this.f54140D);
        R3.c.c(parcel, 4, this.f54141E);
        R3.c.b(parcel, iA);
    }
}
