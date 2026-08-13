package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends com.google.android.gms.common.GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i6) {
        super(i6, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + N3.C1395h.f7660a + " but found " + i6 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
