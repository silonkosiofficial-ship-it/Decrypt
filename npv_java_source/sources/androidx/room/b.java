package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public interface b extends android.os.IInterface {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.lang.String f23462m = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends android.os.Binder implements androidx.room.b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0442a implements androidx.room.b {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private android.os.IBinder f23463C;

            C0442a(android.os.IBinder iBinder) {
                this.f23463C = iBinder;
            }

            @Override // androidx.room.b
            public void G5(int i6, java.lang.String[] strArr) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.b.f23462m);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeStringArray(strArr);
                    this.f23463C.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void Y5(androidx.room.a aVar, int i6) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.b.f23462m);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i6);
                    this.f23463C.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f23463C;
            }

            @Override // androidx.room.b
            public int g2(androidx.room.a aVar, java.lang.String str) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.b.f23462m);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f23463C.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, androidx.room.b.f23462m);
        }

        public static androidx.room.b q0(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.room.b.f23462m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.b)) ? new androidx.room.b.a.C0442a(iBinder) : (androidx.room.b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
            java.lang.String str = androidx.room.b.f23462m;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i6 == 1) {
                int iG2 = g2(androidx.room.a.AbstractBinderC0440a.q0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iG2);
            } else if (i6 == 2) {
                Y5(androidx.room.a.AbstractBinderC0440a.q0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i6 != 3) {
                    return super.onTransact(i6, parcel, parcel2, i10);
                }
                G5(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void G5(int i6, java.lang.String[] strArr);

    void Y5(androidx.room.a aVar, int i6);

    int g2(androidx.room.a aVar, java.lang.String str);
}
