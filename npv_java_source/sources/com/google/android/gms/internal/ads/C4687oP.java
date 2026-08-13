package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4687oP extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4908qQ f37813a;

    /* synthetic */ C4687oP(com.google.android.gms.internal.ads.C4908qQ c4908qQ, com.google.android.gms.internal.ads.PP pp) {
        this.f37813a = c4908qQ;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        int i6 = 0;
        if (connectivityManager != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i6 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i6 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i6 = 4;
                                break;
                            case 13:
                                i6 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i6 = 6;
                                break;
                            case 18:
                                i6 = 2;
                                break;
                            case 20:
                                if (com.google.android.gms.internal.ads.EW.f27061a >= 29) {
                                    i6 = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i6 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i6 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i6 = 4;
                                break;
                            case 13:
                                i6 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i6 = 6;
                                break;
                            case 18:
                                i6 = 2;
                                break;
                            case 20:
                                if (com.google.android.gms.internal.ads.EW.f27061a >= 29) {
                                    i6 = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i6 = type != 9 ? 8 : 7;
                    } else {
                        i6 = 5;
                    }
                }
            } catch (java.lang.SecurityException unused) {
            }
        }
        if (com.google.android.gms.internal.ads.EW.f27061a < 31 || i6 != 5) {
            com.google.android.gms.internal.ads.C4908qQ.c(this.f37813a, i6);
            return;
        }
        com.google.android.gms.internal.ads.C4908qQ c4908qQ = this.f37813a;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            com.google.android.gms.internal.ads.KO ko = new com.google.android.gms.internal.ads.KO(c4908qQ);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), ko);
            telephonyManager.unregisterTelephonyCallback(ko);
        } catch (java.lang.RuntimeException unused2) {
            com.google.android.gms.internal.ads.C4908qQ.c(c4908qQ, 5);
        }
    }
}
