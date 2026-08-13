package K4;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends K4.AbstractC1304a implements K4.u {
    s(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // K4.u
    public final void K2(android.os.Bundle bundle, K4.w wVar) {
        android.os.Parcel parcelQ0 = q0();
        K4.o.c(parcelQ0, bundle);
        parcelQ0.writeStrongBinder(wVar);
        y0(2, parcelQ0);
    }
}
