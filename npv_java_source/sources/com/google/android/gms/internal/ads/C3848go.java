package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3848go extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.C3848go> CREATOR = new com.google.android.gms.internal.ads.C3958ho();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final android.view.View f35687C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.util.Map f35688D;

    public C3848go(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.f35687C = (android.view.View) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder));
        this.f35688D = (java.util.Map) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        android.view.View view = this.f35687C;
        int iA = R3.c.a(parcel);
        R3.c.j(parcel, 1, X3.b.c2(view).asBinder(), false);
        R3.c.j(parcel, 2, X3.b.c2(this.f35688D).asBinder(), false);
        R3.c.b(parcel, iA);
    }
}
