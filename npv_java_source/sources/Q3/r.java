package Q3;

/* JADX INFO: loaded from: classes.dex */
public class r extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.r> CREATOR = new Q3.a0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f9014C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f9015D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f9016E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f9017F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f9018G;

    public r(int i6, boolean z6, boolean z10, int i10, int i11) {
        this.f9014C = i6;
        this.f9015D = z6;
        this.f9016E = z10;
        this.f9017F = i10;
        this.f9018G = i11;
    }

    public int C() {
        return this.f9014C;
    }

    public int e() {
        return this.f9017F;
    }

    public int f() {
        return this.f9018G;
    }

    public boolean s() {
        return this.f9015D;
    }

    public boolean w() {
        return this.f9016E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, C());
        R3.c.c(parcel, 2, s());
        R3.c.c(parcel, 3, w());
        R3.c.k(parcel, 4, e());
        R3.c.k(parcel, 5, f());
        R3.c.b(parcel, iA);
    }
}
