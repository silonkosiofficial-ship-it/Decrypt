package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends p045e4.b implements Q3.InterfaceC1472k {
    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p045e4.b
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            int i11 = parcel.readInt();
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) p045e4.c.a(parcel, android.os.Bundle.CREATOR);
            p045e4.c.b(parcel);
            D3(i11, strongBinder, bundle);
        } else if (i6 == 2) {
            int i12 = parcel.readInt();
            android.os.Bundle bundle2 = (android.os.Bundle) p045e4.c.a(parcel, android.os.Bundle.CREATOR);
            p045e4.c.b(parcel);
            l2(i12, bundle2);
        } else {
            if (i6 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            Q3.h0 h0Var = (Q3.h0) p045e4.c.a(parcel, Q3.h0.CREATOR);
            p045e4.c.b(parcel);
            n1(i13, strongBinder2, h0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
