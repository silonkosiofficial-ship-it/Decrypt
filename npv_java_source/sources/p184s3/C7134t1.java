package p184s3;

/* JADX INFO: renamed from: s3.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7134t1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.C7134t1> CREATOR = new p184s3.C7137u1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f54327C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f54328D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f54329E;

    public C7134t1(int i6, int i10, java.lang.String str) {
        this.f54327C = i6;
        this.f54328D = i10;
        this.f54329E = str;
    }

    public final int e() {
        return this.f54328D;
    }

    public final java.lang.String f() {
        return this.f54329E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f54327C);
        R3.c.k(parcel, 2, this.f54328D);
        R3.c.q(parcel, 3, this.f54329E, false);
        R3.c.b(parcel, iA);
    }
}
