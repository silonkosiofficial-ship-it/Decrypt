package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.K1> CREATOR = new p184s3.L1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f54134C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f54135D;

    public K1(int i6, int i10) {
        this.f54134C = i6;
        this.f54135D = i10;
    }

    public K1(p104k3.t tVar) {
        this.f54134C = tVar.c();
        this.f54135D = tVar.d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f54134C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f54135D);
        R3.c.b(parcel, iA);
    }
}
