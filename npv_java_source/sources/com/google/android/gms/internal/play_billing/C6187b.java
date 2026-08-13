package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6187b extends com.google.android.gms.internal.play_billing.AbstractC6205e implements com.google.android.gms.internal.play_billing.InterfaceC6199d {
    C6187b(android.os.IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle A5(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(11, parcelQ0);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle D2(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(3);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        android.os.Parcel parcelY0 = y0(4, parcelQ0);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle Q2(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(3);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        parcelQ0.writeString(null);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle a6(int i6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(9);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(902, parcelQ0);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle e1(int i6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.os.Bundle bundle2) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle2);
        android.os.Parcel parcelY0 = y0(901, parcelQ0);
        android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final int n5(int i6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(10, parcelQ0);
        int i10 = parcelY0.readInt();
        parcelY0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle o4(int i6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        parcelQ0.writeString(null);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(8, parcelQ0);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final int t1(int i6, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(i6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        int i10 = parcelY0.readInt();
        parcelY0.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6199d
    public final android.os.Bundle t4(int i6, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeInt(3);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.play_billing.AbstractC6217g.c(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.play_billing.AbstractC6217g.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle2;
    }
}
