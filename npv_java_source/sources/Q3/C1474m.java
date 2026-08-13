package Q3;

/* JADX INFO: renamed from: Q3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1474m extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.C1474m> CREATOR = new Q3.H();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f8983C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f8984D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f8985E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f8986F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final long f8987G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.lang.String f8988H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.lang.String f8989I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final int f8990J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final int f8991K;

    public C1474m(int i6, int i10, int i11, long j6, long j10, java.lang.String str, java.lang.String str2, int i12, int i13) {
        this.f8983C = i6;
        this.f8984D = i10;
        this.f8985E = i11;
        this.f8986F = j6;
        this.f8987G = j10;
        this.f8988H = str;
        this.f8989I = str2;
        this.f8990J = i12;
        this.f8991K = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f8983C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f8984D);
        R3.c.k(parcel, 3, this.f8985E);
        R3.c.n(parcel, 4, this.f8986F);
        R3.c.n(parcel, 5, this.f8987G);
        R3.c.q(parcel, 6, this.f8988H, false);
        R3.c.q(parcel, 7, this.f8989I, false);
        R3.c.k(parcel, 8, this.f8990J);
        R3.c.k(parcel, 9, this.f8991K);
        R3.c.b(parcel, iA);
    }
}
