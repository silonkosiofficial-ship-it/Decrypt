package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.e2> CREATOR = new p184s3.f2();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f54229C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f54230D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f54231E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f54232F;

    public e2(int i6, int i10, java.lang.String str, long j6) {
        this.f54229C = i6;
        this.f54230D = i10;
        this.f54231E = str;
        this.f54232F = j6;
    }

    public static p184s3.e2 e(org.json.JSONObject jSONObject) {
        return new p184s3.e2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f54229C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.k(parcel, 2, this.f54230D);
        R3.c.q(parcel, 3, this.f54231E, false);
        R3.c.n(parcel, 4, this.f54232F);
        R3.c.b(parcel, iA);
    }
}
