package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends R3.a {
    public static final android.os.Parcelable.Creator<p134n3.a> CREATOR = new p134n3.i();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f51470C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final android.os.IBinder f51471D;

    a(boolean z6, android.os.IBinder iBinder) {
        this.f51470C = z6;
        this.f51471D = iBinder;
    }

    public boolean e() {
        return this.f51470C;
    }

    public final com.google.android.gms.internal.ads.InterfaceC3726fi f() {
        android.os.IBinder iBinder = this.f51471D;
        if (iBinder == null) {
            return null;
        }
        return com.google.android.gms.internal.ads.AbstractBinderC3616ei.o6(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 1, e());
        R3.c.j(parcel, 2, this.f51471D, false);
        R3.c.b(parcel, iA);
    }
}
