package L3;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends p025c4.c implements L3.t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p025c4.c
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 101:
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) p025c4.d.a(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) p025c4.d.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                p025c4.d.b(parcel);
                x3(googleSignInAccount, status);
                break;
            case 102:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) p025c4.d.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                p025c4.d.b(parcel);
                Y3(status2);
                break;
            case 103:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) p025c4.d.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                p025c4.d.b(parcel);
                n3(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
