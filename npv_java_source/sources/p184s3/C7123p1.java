package p184s3;

/* JADX INFO: renamed from: s3.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7123p1 extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        java.lang.String str;
        android.os.Bundle bundle = null;
        try {
            bundle = W3.e.a(context).c(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            e = e6;
            str = "Failed to load metadata: Package name not found.";
            p224w3.p.e(str, e);
        } catch (java.lang.NullPointerException e10) {
            e = e10;
            str = "Failed to load metadata: Null pointer exception.";
            p224w3.p.e(str, e);
        }
        com.google.android.gms.internal.ads.C2616Ml c2616MlA = com.google.android.gms.internal.ads.C2616Ml.a();
        if (bundle == null) {
            p224w3.p.d("Metadata was null.");
        } else {
            try {
                java.lang.String str2 = (java.lang.String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    java.lang.Boolean bool = (java.lang.Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        java.lang.String str3 = (java.lang.String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str2 != null) {
                            if (!str2.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                throw new java.lang.IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            p224w3.p.b("Publisher provided Google AdMob App ID in manifest: ".concat(str2));
                            if (bool == null || !bool.booleanValue()) {
                                c2616MlA.b(context, str2);
                            }
                        } else {
                            if (android.text.TextUtils.isEmpty(str3)) {
                                throw new java.lang.IllegalStateException("\n\n******************************************************************************\n* Missing application ID. AdMob publishers should follow the instructions    *\n* here:                                                                      *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            p224w3.p.b("The Google Mobile Ads SDK is integrated by ".concat(java.lang.String.valueOf(str3)));
                        }
                    } catch (java.lang.ClassCastException e11) {
                        throw new java.lang.IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e11);
                    }
                } catch (java.lang.ClassCastException e12) {
                    throw new java.lang.IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e12);
                }
            } catch (java.lang.ClassCastException e13) {
                throw new java.lang.IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e13);
            }
        }
        if (bundle != null) {
            boolean z6 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z10 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z6) {
                p224w3.p.b("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z10) {
                p224w3.p.b("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
