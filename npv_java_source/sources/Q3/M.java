package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class M extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.M> CREATOR = new Q3.N();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f8866C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.accounts.Account f8867D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f8868E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount f8869F;

    M(int i6, android.accounts.Account account, int i10, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.f8866C = i6;
        this.f8867D = account;
        this.f8868E = i10;
        this.f8869F = googleSignInAccount;
    }

    public M(android.accounts.Account account, int i6, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this(2, account, i6, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f8866C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.p(parcel, 2, this.f8867D, i6, false);
        R3.c.k(parcel, 3, this.f8868E);
        R3.c.p(parcel, 4, this.f8869F, i6, false);
        R3.c.b(parcel, iA);
    }
}
