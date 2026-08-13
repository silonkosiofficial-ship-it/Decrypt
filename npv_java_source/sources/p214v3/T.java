package p214v3;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p214v3.U {
    public T() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        int iZzf;
        if (i6 != 1) {
            if (i6 == 2) {
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                zze(aVarY0);
                parcel2.writeNoException();
            } else {
                if (i6 != 3) {
                    return false;
                }
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p194t3.a aVar = (p194t3.a) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p194t3.a.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iZzf = zzg(aVarY1, aVar);
            }
            return true;
        }
        X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        iZzf = zzf(aVarY2, string, string2);
        parcel2.writeNoException();
        parcel2.writeInt(iZzf);
        return true;
    }
}
