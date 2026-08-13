package K4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends K4.n implements K4.w {
    public v() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // K4.n
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 2) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) K4.o.a(parcel, android.os.Bundle.CREATOR);
        K4.o.b(parcel);
        k3(bundle);
        return true;
    }
}
