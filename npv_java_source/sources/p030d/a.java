package p030d;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final java.lang.String f44257w = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0485a extends android.os.Binder implements p030d.a {
        public AbstractBinderC0485a() {
            attachInterface(this, p030d.a.f44257w);
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
            java.lang.String str = p030d.a.f44257w;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i6) {
                case 2:
                    R4(parcel.readInt(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 3:
                    q4(parcel.readString(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 4:
                    M5((android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    y5(parcel.readString(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    R5(parcel.readInt(), (android.net.Uri) d.a.b.c(parcel, android.net.Uri.CREATOR), parcel.readInt() != 0, (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 7:
                    android.os.Bundle bundleM2 = m2(parcel.readString(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    d.a.b.d(parcel2, bundleM2, 1);
                    return true;
                case 8:
                    Q3(parcel.readInt(), parcel.readInt(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 9:
                    C4((android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 10:
                    s1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 11:
                    i3((android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 12:
                    w3((android.os.Bundle) d.a.b.c(parcel, android.os.Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i6, parcel, parcel2, i10);
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static java.lang.Object c(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(android.os.Parcel parcel, android.os.Parcelable parcelable, int i6) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i6);
            }
        }
    }

    void C4(android.os.Bundle bundle);

    void M5(android.os.Bundle bundle);

    void Q3(int i6, int i10, android.os.Bundle bundle);

    void R4(int i6, android.os.Bundle bundle);

    void R5(int i6, android.net.Uri uri, boolean z6, android.os.Bundle bundle);

    void i3(android.os.Bundle bundle);

    android.os.Bundle m2(java.lang.String str, android.os.Bundle bundle);

    void q4(java.lang.String str, android.os.Bundle bundle);

    void s1(int i6, int i10, int i11, int i12, int i13, android.os.Bundle bundle);

    void w3(android.os.Bundle bundle);

    void y5(java.lang.String str, android.os.Bundle bundle);
}
