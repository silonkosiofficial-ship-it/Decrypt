package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends R3.a {
    public static final android.os.Parcelable.Creator<p204u3.l> CREATOR = new p204u3.k();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f55491C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f55492D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.String f55493E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.String f55494F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String f55495G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f55496H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final java.lang.String f55497I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final android.content.Intent f55498J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final p204u3.InterfaceC7200b f55499K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f55500L;

    public l(android.content.Intent intent, p204u3.InterfaceC7200b interfaceC7200b) {
        this(null, null, null, null, null, null, null, intent, X3.b.c2(interfaceC7200b).asBinder(), false);
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Intent intent, android.os.IBinder iBinder, boolean z6) {
        this.f55491C = str;
        this.f55492D = str2;
        this.f55493E = str3;
        this.f55494F = str4;
        this.f55495G = str5;
        this.f55496H = str6;
        this.f55497I = str7;
        this.f55498J = intent;
        this.f55499K = (p204u3.InterfaceC7200b) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder));
        this.f55500L = z6;
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, p204u3.InterfaceC7200b interfaceC7200b) {
        this(str, str2, str3, str4, str5, str6, str7, null, X3.b.c2(interfaceC7200b).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f55491C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 2, str, false);
        R3.c.q(parcel, 3, this.f55492D, false);
        R3.c.q(parcel, 4, this.f55493E, false);
        R3.c.q(parcel, 5, this.f55494F, false);
        R3.c.q(parcel, 6, this.f55495G, false);
        R3.c.q(parcel, 7, this.f55496H, false);
        R3.c.q(parcel, 8, this.f55497I, false);
        R3.c.p(parcel, 9, this.f55498J, i6, false);
        R3.c.j(parcel, 10, X3.b.c2(this.f55499K).asBinder(), false);
        R3.c.c(parcel, 11, this.f55500L);
        R3.c.b(parcel, iA);
    }
}
