package p174r3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends R3.a {
    public static final android.os.Parcelable.Creator<p174r3.l> CREATOR = new p174r3.m();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f53870C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f53871D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f53872E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f53873F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final float f53874G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f53875H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f53876I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f53877J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f53878K;

    l(boolean z6, boolean z10, java.lang.String str, boolean z11, float f6, int i6, boolean z12, boolean z13, boolean z14) {
        this.f53870C = z6;
        this.f53871D = z10;
        this.f53872E = str;
        this.f53873F = z11;
        this.f53874G = f6;
        this.f53875H = i6;
        this.f53876I = z12;
        this.f53877J = z13;
        this.f53878K = z14;
    }

    public l(boolean z6, boolean z10, boolean z11, float f6, int i6, boolean z12, boolean z13, boolean z14) {
        this(z6, z10, null, z11, f6, -1, z12, z13, z14);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        boolean z6 = this.f53870C;
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 2, z6);
        R3.c.c(parcel, 3, this.f53871D);
        R3.c.q(parcel, 4, this.f53872E, false);
        R3.c.c(parcel, 5, this.f53873F);
        R3.c.h(parcel, 6, this.f53874G);
        R3.c.k(parcel, 7, this.f53875H);
        R3.c.c(parcel, 8, this.f53876I);
        R3.c.c(parcel, 9, this.f53877J);
        R3.c.c(parcel, 10, this.f53878K);
        R3.c.b(parcel, iA);
    }
}
