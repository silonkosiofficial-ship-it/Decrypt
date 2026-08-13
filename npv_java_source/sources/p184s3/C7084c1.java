package p184s3;

/* JADX INFO: renamed from: s3.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7084c1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.C7084c1> CREATOR = new p184s3.C7087d1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f54197C;

    public C7084c1(int i6) {
        this.f54197C = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f54197C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 2, i10);
        R3.c.b(parcel, iA);
    }
}
