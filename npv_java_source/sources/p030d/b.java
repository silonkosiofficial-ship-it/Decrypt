package p030d;

/* JADX INFO: loaded from: classes.dex */
public interface b extends android.os.IInterface {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final java.lang.String f44258x = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends android.os.Binder implements p030d.b {

        /* JADX INFO: renamed from: d.b$a$a, reason: collision with other inner class name */
        private static class C0486a implements p030d.b {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private android.os.IBinder f44259C;

            C0486a(android.os.IBinder iBinder) {
                this.f44259C = iBinder;
            }

            @Override // p030d.b
            public boolean X2(long j6) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeLong(j6);
                    this.f44259C.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p030d.b
            public int a3(p030d.a aVar, java.lang.String str, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    p030d.b.C0487b.b(parcelObtain, bundle, 0);
                    this.f44259C.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f44259C;
            }

            @Override // p030d.b
            public boolean n2(p030d.a aVar) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f44259C.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p030d.b
            public boolean o5(p030d.a aVar, android.net.Uri uri) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeStrongInterface(aVar);
                    p030d.b.C0487b.b(parcelObtain, uri, 0);
                    this.f44259C.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p030d.b
            public boolean s3(p030d.a aVar, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeStrongInterface(aVar);
                    p030d.b.C0487b.b(parcelObtain, bundle, 0);
                    this.f44259C.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p030d.b
            public boolean t3(p030d.a aVar, android.net.Uri uri, android.os.Bundle bundle) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(p030d.b.f44258x);
                    parcelObtain.writeStrongInterface(aVar);
                    p030d.b.C0487b.b(parcelObtain, uri, 0);
                    p030d.b.C0487b.b(parcelObtain, bundle, 0);
                    this.f44259C.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static p030d.b q0(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p030d.b.f44258x);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p030d.b)) ? new d.b.a.C0486a(iBinder) : (p030d.b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    public static class C0487b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(android.os.Parcel parcel, android.os.Parcelable parcelable, int i6) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i6);
            }
        }
    }

    boolean X2(long j6);

    int a3(p030d.a aVar, java.lang.String str, android.os.Bundle bundle);

    boolean n2(p030d.a aVar);

    boolean o5(p030d.a aVar, android.net.Uri uri);

    boolean s3(p030d.a aVar, android.os.Bundle bundle);

    boolean t3(p030d.a aVar, android.net.Uri uri, android.os.Bundle bundle);
}
