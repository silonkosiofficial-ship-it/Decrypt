package p105k4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends p035d4.b implements p105k4.f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p035d4.b
    protected final boolean c2(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 3:
                p035d4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                p035d4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                p035d4.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                p105k4.l lVar = (p105k4.l) p035d4.c.a(parcel, p105k4.l.CREATOR);
                p035d4.c.b(parcel);
                V3(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                p035d4.c.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
