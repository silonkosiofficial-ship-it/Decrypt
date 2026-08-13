package L3;

/* JADX INFO: loaded from: classes.dex */
public class a extends R3.a {
    public static final android.os.Parcelable.Creator<L3.a> CREATOR = new L3.d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f6191C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f6192D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.os.Bundle f6193E;

    a(int i6, int i10, android.os.Bundle bundle) {
        this.f6191C = i6;
        this.f6192D = i10;
        this.f6193E = bundle;
    }

    public int e() {
        return this.f6192D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f6191C);
        R3.c.k(parcel, 2, e());
        R3.c.e(parcel, 3, this.f6193E, false);
        R3.c.b(parcel, iA);
    }
}
