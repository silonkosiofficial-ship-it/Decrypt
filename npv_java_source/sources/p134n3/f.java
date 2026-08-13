package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends R3.a {
    public static final android.os.Parcelable.Creator<p134n3.f> CREATOR = new p134n3.n();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f51486C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p184s3.InterfaceC7101i0 f51487D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.IBinder f51488E;

    f(boolean z6, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.f51486C = z6;
        this.f51487D = iBinder != null ? p184s3.AbstractBinderC7098h0.o6(iBinder) : null;
        this.f51488E = iBinder2;
    }

    public final boolean c() {
        return this.f51486C;
    }

    public final p184s3.InterfaceC7101i0 e() {
        return this.f51487D;
    }

    public final com.google.android.gms.internal.ads.InterfaceC3726fi f() {
        android.os.IBinder iBinder = this.f51488E;
        if (iBinder == null) {
            return null;
        }
        return com.google.android.gms.internal.ads.AbstractBinderC3616ei.o6(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 1, this.f51486C);
        p184s3.InterfaceC7101i0 interfaceC7101i0 = this.f51487D;
        R3.c.j(parcel, 2, interfaceC7101i0 == null ? null : interfaceC7101i0.asBinder(), false);
        R3.c.j(parcel, 3, this.f51488E, false);
        R3.c.b(parcel, iA);
    }
}
