package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.lang.String f23460l = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0440a extends android.os.Binder implements androidx.room.a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        private static class C0441a implements androidx.room.a {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private android.os.IBinder f23461C;

            C0441a(android.os.IBinder iBinder) {
                this.f23461C = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f23461C;
            }

            @Override // androidx.room.a
            public void x1(java.lang.String[] strArr) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.a.f23460l);
                    parcelObtain.writeStringArray(strArr);
                    this.f23461C.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0440a() {
            attachInterface(this, androidx.room.a.f23460l);
        }

        public static androidx.room.a q0(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.room.a.f23460l);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.room.a)) ? new androidx.room.a.AbstractBinderC0440a.C0441a(iBinder) : (androidx.room.a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
            java.lang.String str = androidx.room.a.f23460l;
            if (i6 >= 1 && i6 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i6 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i6 != 1) {
                return super.onTransact(i6, parcel, parcel2, i10);
            }
            x1(parcel.createStringArray());
            return true;
        }
    }

    void x1(java.lang.String[] strArr);
}
