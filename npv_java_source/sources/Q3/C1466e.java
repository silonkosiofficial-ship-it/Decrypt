package Q3;

/* JADX INFO: renamed from: Q3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1466e extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.C1466e> CREATOR = new Q3.j0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Q3.r f8936C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f8937D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f8938E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f8939F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f8940G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int[] f8941H;

    public C1466e(Q3.r rVar, boolean z6, boolean z10, int[] iArr, int i6, int[] iArr2) {
        this.f8936C = rVar;
        this.f8937D = z6;
        this.f8938E = z10;
        this.f8939F = iArr;
        this.f8940G = i6;
        this.f8941H = iArr2;
    }

    public boolean C() {
        return this.f8938E;
    }

    public final Q3.r D() {
        return this.f8936C;
    }

    public int e() {
        return this.f8940G;
    }

    public int[] f() {
        return this.f8939F;
    }

    public int[] s() {
        return this.f8941H;
    }

    public boolean w() {
        return this.f8937D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.p(parcel, 1, this.f8936C, i6, false);
        R3.c.c(parcel, 2, w());
        R3.c.c(parcel, 3, C());
        R3.c.l(parcel, 4, f(), false);
        R3.c.k(parcel, 5, e());
        R3.c.l(parcel, 6, s(), false);
        R3.c.b(parcel, iA);
    }
}
