package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends p045e4.a implements Q3.InterfaceC1471j {
    t0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // Q3.InterfaceC1471j
    public final android.accounts.Account b() {
        android.os.Parcel parcelQ0 = q0(2, y0());
        android.accounts.Account account = (android.accounts.Account) p045e4.c.a(parcelQ0, android.accounts.Account.CREATOR);
        parcelQ0.recycle();
        return account;
    }
}
