package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.i2> CREATOR = new p184s3.j2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f54278C;

    public i2(int i6) {
        this.f54278C = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f54278C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 2, i10);
        R3.c.b(parcel, iA);
    }
}
