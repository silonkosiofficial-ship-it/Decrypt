package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2838Sm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2874Tm {
    public AbstractBinderC2838Sm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2874Tm o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2874Tm ? (com.google.android.gms.internal.ads.InterfaceC2874Tm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2802Rm(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.Wm] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.Qm] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.Qm] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.Sm, com.google.android.gms.internal.ads.Tm] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.Mm] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.Mm] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.Dm] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.Jm] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.C3956hn c3956hnE;
        ?? C10;
        java.lang.Object c2910Um = null;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    c3956hnE = i();
                } else if (i6 != 5) {
                    if (i6 == 10) {
                        X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                    } else if (i6 != 11) {
                        switch (i6) {
                            case 13:
                                java.lang.String string = parcel.readString();
                                java.lang.String string2 = parcel.readString();
                                p184s3.X1 x6 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder = parcel.readStrongBinder();
                                if (strongBinder != null) {
                                    java.lang.Object objQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    c2910Um = objQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2396Gm ? (com.google.android.gms.internal.ads.InterfaceC2396Gm) objQueryLocalInterface : new com.google.android.gms.internal.ads.C2322Em(strongBinder);
                                }
                                ?? r11 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO6 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                K5(string, string2, x6, aVarY0, r11, interfaceC3296bmO6, c2Var);
                                break;
                            case 14:
                                java.lang.String string3 = parcel.readString();
                                java.lang.String string4 = parcel.readString();
                                p184s3.X1 x10 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                                if (strongBinder2 != null) {
                                    java.lang.Object objQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                    c2910Um = objQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.InterfaceC2507Jm ? (com.google.android.gms.internal.ads.InterfaceC2507Jm) objQueryLocalInterface2 : new com.google.android.gms.internal.ads.C2433Hm(strongBinder2);
                                }
                                ?? r10 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO7 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                T5(string3, string4, x10, aVarY1, r10, interfaceC3296bmO7);
                                break;
                            case 15:
                                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                C10 = C0(aVarY2);
                                parcel2.writeNoException();
                                parcel2.writeInt(C10);
                                break;
                            case 16:
                                java.lang.String string5 = parcel.readString();
                                java.lang.String string6 = parcel.readString();
                                p184s3.X1 x11 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                                if (strongBinder3 != null) {
                                    java.lang.Object objQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    c2910Um = objQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.InterfaceC2765Qm ? (com.google.android.gms.internal.ads.InterfaceC2765Qm) objQueryLocalInterface3 : new com.google.android.gms.internal.ads.C2654Nm(strongBinder3);
                                }
                                ?? r12 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO8 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                u2(string5, string6, x11, aVarY3, r12, interfaceC3296bmO8);
                                break;
                            case 17:
                                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                C10 = g4(aVarY4);
                                parcel2.writeNoException();
                                parcel2.writeInt(C10);
                                break;
                            case 18:
                                java.lang.String string7 = parcel.readString();
                                java.lang.String string8 = parcel.readString();
                                p184s3.X1 x12 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                                if (strongBinder4 != null) {
                                    java.lang.Object objQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    c2910Um = objQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.InterfaceC2617Mm ? (com.google.android.gms.internal.ads.InterfaceC2617Mm) objQueryLocalInterface4 : new com.google.android.gms.internal.ads.C2544Km(strongBinder4);
                                }
                                ?? r6 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO9 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                L5(string7, string8, x12, aVarY5, r6, interfaceC3296bmO9);
                                break;
                            case 19:
                                java.lang.String string9 = parcel.readString();
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                J0(string9);
                                break;
                            case 20:
                                java.lang.String string10 = parcel.readString();
                                java.lang.String string11 = parcel.readString();
                                p184s3.X1 x13 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                                if (strongBinder5 != null) {
                                    java.lang.Object objQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                    c2910Um = objQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.InterfaceC2765Qm ? (com.google.android.gms.internal.ads.InterfaceC2765Qm) objQueryLocalInterface5 : new com.google.android.gms.internal.ads.C2654Nm(strongBinder5);
                                }
                                ?? r13 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO10 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                K1(string10, string11, x13, aVarY6, r13, interfaceC3296bmO10);
                                break;
                            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                java.lang.String string12 = parcel.readString();
                                java.lang.String string13 = parcel.readString();
                                p184s3.X1 x14 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                                if (strongBinder6 != null) {
                                    java.lang.Object objQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                    c2910Um = objQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.InterfaceC2396Gm ? (com.google.android.gms.internal.ads.InterfaceC2396Gm) objQueryLocalInterface6 : new com.google.android.gms.internal.ads.C2322Em(strongBinder6);
                                }
                                ?? r14 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO11 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                p184s3.c2 c2Var2 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                Z4(string12, string13, x14, aVarY7, r14, interfaceC3296bmO11, c2Var2);
                                break;
                            case 22:
                                java.lang.String string14 = parcel.readString();
                                java.lang.String string15 = parcel.readString();
                                p184s3.X1 x15 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                                if (strongBinder7 != null) {
                                    java.lang.Object objQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                    c2910Um = objQueryLocalInterface7 instanceof com.google.android.gms.internal.ads.InterfaceC2617Mm ? (com.google.android.gms.internal.ads.InterfaceC2617Mm) objQueryLocalInterface7 : new com.google.android.gms.internal.ads.C2544Km(strongBinder7);
                                }
                                ?? r15 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO12 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.C3505dh c3505dh = (com.google.android.gms.internal.ads.C3505dh) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C3505dh.CREATOR);
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                G2(string14, string15, x15, aVarY8, r15, interfaceC3296bmO12, c3505dh);
                                break;
                            case 23:
                                java.lang.String string16 = parcel.readString();
                                java.lang.String string17 = parcel.readString();
                                p184s3.X1 x16 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                                if (strongBinder8 != null) {
                                    java.lang.Object objQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                    c2910Um = objQueryLocalInterface8 instanceof com.google.android.gms.internal.ads.InterfaceC2285Dm ? (com.google.android.gms.internal.ads.InterfaceC2285Dm) objQueryLocalInterface8 : new com.google.android.gms.internal.ads.C2211Bm(strongBinder8);
                                }
                                ?? r16 = c2910Um;
                                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bmO13 = com.google.android.gms.internal.ads.AbstractBinderC3186am.o6(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                O4(string16, string17, x16, aVarY9, r16, interfaceC3296bmO13);
                                break;
                            case 24:
                                X3.a aVarY10 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                                C10 = g0(aVarY10);
                                parcel2.writeNoException();
                                parcel2.writeInt(C10);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        parcel.createStringArray();
                    }
                    com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                } else {
                    p184s3.Y0 y0D = d();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, y0D);
                }
                return true;
            }
            c3956hnE = e();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, c3956hnE);
            return true;
        }
        X3.a aVarY11 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
        java.lang.String string18 = parcel.readString();
        android.os.Parcelable.Creator creator = android.os.Bundle.CREATOR;
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, creator);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, creator);
        p184s3.c2 c2Var3 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
        android.os.IBinder strongBinder9 = parcel.readStrongBinder();
        if (strongBinder9 != null) {
            java.lang.Object objQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            c2910Um = objQueryLocalInterface9 instanceof com.google.android.gms.internal.ads.InterfaceC2982Wm ? (com.google.android.gms.internal.ads.InterfaceC2982Wm) objQueryLocalInterface9 : new com.google.android.gms.internal.ads.C2910Um(strongBinder9);
        }
        ?? r17 = c2910Um;
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        q1(aVarY11, string18, bundle, bundle2, c2Var3, r17);
        parcel2.writeNoException();
        return true;
    }
}
