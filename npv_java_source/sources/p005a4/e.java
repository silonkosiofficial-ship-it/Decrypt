package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends p005a4.b implements p005a4.f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p005a4.b
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        x5((com.google.android.gms.common.api.Status) p005a4.c.a(parcel, com.google.android.gms.common.api.Status.CREATOR), (H3.f) p005a4.c.a(parcel, H3.f.CREATOR));
        return true;
    }
}
