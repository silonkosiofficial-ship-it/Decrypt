package L3;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p025c4.c implements L3.r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p025c4.c
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            I1();
        } else {
            if (i6 != 2) {
                return false;
            }
            g1();
        }
        return true;
    }
}
