package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends R3.a {
    public static final android.os.Parcelable.Creator<p224w3.a> CREATOR = new p224w3.z();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.lang.String f56217C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f56218D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f56219E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f56220F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f56221G;

    public a(int i6, int i10, boolean z6) {
        this(i6, i10, z6, false, false);
    }

    public a(int i6, int i10, boolean z6, boolean z10) {
        this(i6, i10, z6, false, z10);
    }

    public a(int i6, int i10, boolean z6, boolean z10, boolean z11) {
        this("afma-sdk-a-v" + i6 + "." + i10 + "." + (z6 ? "0" : z10 ? "2" : "1"), i6, i10, z6, z11);
    }

    a(java.lang.String str, int i6, int i10, boolean z6, boolean z10) {
        this.f56217C = str;
        this.f56218D = i6;
        this.f56219E = i10;
        this.f56220F = z6;
        this.f56221G = z10;
    }

    public static p224w3.a e() {
        return new p224w3.a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, this.f56217C, false);
        R3.c.k(parcel, 3, this.f56218D);
        R3.c.k(parcel, 4, this.f56219E);
        R3.c.c(parcel, 5, this.f56220F);
        R3.c.c(parcel, 6, this.f56221G);
        R3.c.b(parcel, iA);
    }
}
