package H3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends R3.a {
    public static final android.os.Parcelable.Creator<H3.d> CREATOR = new H3.e();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f4360C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f4361D;

    public d(java.lang.String str, java.lang.String str2) {
        this.f4360C = str;
        this.f4361D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, this.f4360C, false);
        R3.c.q(parcel, 2, this.f4361D, false);
        R3.c.b(parcel, iA);
    }
}
