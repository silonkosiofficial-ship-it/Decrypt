package N3;

/* JADX INFO: loaded from: classes.dex */
public final class G extends R3.a {
    public static final android.os.Parcelable.Creator<N3.G> CREATOR = new N3.H();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f7633C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final N3.x f7634D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f7635E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f7636F;

    G(java.lang.String str, N3.x xVar, boolean z6, boolean z10) {
        this.f7633C = str;
        this.f7634D = xVar;
        this.f7635E = z6;
        this.f7636F = z10;
    }

    G(java.lang.String str, android.os.IBinder iBinder, boolean z6, boolean z10) {
        this.f7633C = str;
        N3.y yVar = null;
        if (iBinder != null) {
            try {
                X3.a aVarF = Q3.v0.y0(iBinder).f();
                byte[] bArr = aVarF == null ? null : (byte[]) X3.b.L0(aVarF);
                if (bArr != null) {
                    yVar = new N3.y(bArr);
                }
            } catch (android.os.RemoteException e6) {
            }
        }
        this.f7634D = yVar;
        this.f7635E = z6;
        this.f7636F = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f7633C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        N3.x xVar = this.f7634D;
        if (xVar == null) {
            xVar = null;
        }
        R3.c.j(parcel, 2, xVar, false);
        R3.c.c(parcel, 3, this.f7635E);
        R3.c.c(parcel, 4, this.f7636F);
        R3.c.b(parcel, iA);
    }
}
