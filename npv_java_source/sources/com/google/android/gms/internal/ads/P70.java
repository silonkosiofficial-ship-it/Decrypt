package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P70 {
    public static p184s3.W0 a(java.lang.Throwable th) {
        if (th instanceof com.google.android.gms.internal.ads.C3156aU) {
            com.google.android.gms.internal.ads.C3156aU c3156aU = (com.google.android.gms.internal.ads.C3156aU) th;
            return c(c3156aU.a(), c3156aU.b());
        }
        if (th instanceof com.google.android.gms.internal.ads.C4688oQ) {
            return th.getMessage() == null ? d(((com.google.android.gms.internal.ads.C4688oQ) th).a(), null, null) : d(((com.google.android.gms.internal.ads.C4688oQ) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof p214v3.C)) {
            return d(1, null, null);
        }
        p214v3.C c6 = (p214v3.C) th;
        return new p184s3.W0(c6.a(), com.google.android.gms.internal.ads.AbstractC2829Sg0.c(c6.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static p184s3.W0 b(java.lang.Throwable th, com.google.android.gms.internal.ads.C3266bU c3266bU) {
        p184s3.W0 w6;
        p184s3.W0 w0A = a(th);
        int i6 = w0A.f54145C;
        if ((i6 == 3 || i6 == 0) && (w6 = w0A.f54148F) != null && !w6.f54147E.equals("com.google.android.gms.ads")) {
            w0A.f54148F = null;
        }
        if (c3266bU != null) {
            w0A.f54149G = c3266bU.b();
        }
        return w0A;
    }

    public static p184s3.W0 c(int i6, p184s3.W0 w6) {
        if (i6 == 0) {
            throw null;
        }
        if (i6 == 8) {
            if (((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25565g8)).intValue() > 0) {
                return w6;
            }
            i6 = 8;
        }
        return d(i6, null, w6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static p184s3.W0 d(int i6, java.lang.String str, p184s3.W0 w6) {
        int i10;
        java.lang.String str2;
        int i11 = i6 - 1;
        if (str == null) {
            if (i6 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i11) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25598j8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        java.lang.String str3 = str;
        if (i6 == 0) {
            throw null;
        }
        int i12 = 2;
        switch (i11) {
            case 0:
            case 11:
            case 15:
                i12 = 0;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i12 = 1;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 2:
            case 10:
            case 18:
                i12 = 3;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 3:
                i10 = 8;
                i12 = i10;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 4:
            case 8:
            case 17:
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 7:
                i10 = 4;
                i12 = i10;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 12:
                if (((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25598j8)).intValue() <= 0) {
                    i10 = 9;
                    i12 = i10;
                } else {
                    i12 = 3;
                }
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 13:
                i10 = 10;
                i12 = i10;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            case 14:
                i10 = 11;
                i12 = i10;
                return new p184s3.W0(i12, str3, "com.google.android.gms.ads", w6, null);
            default:
                switch (i6) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new java.lang.AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
