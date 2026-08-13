package p085i4;

/* JADX INFO: renamed from: i4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6650b extends R3.a {
    public static final android.os.Parcelable.Creator<p085i4.C6650b> CREATOR = new p085i4.C6651c();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final android.os.Bundle f46666C;

    public C6650b(android.os.Bundle bundle) {
        this.f46666C = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.e(parcel, 1, this.f46666C, false);
        R3.c.b(parcel, iA);
    }
}
