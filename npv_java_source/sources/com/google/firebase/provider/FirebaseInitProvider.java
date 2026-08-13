package com.google.firebase.provider;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInitProvider extends android.content.ContentProvider {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static Q4.p f44045C = Q4.p.e();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static java.util.concurrent.atomic.AtomicBoolean f44046D = new java.util.concurrent.atomic.AtomicBoolean(false);

    private static void a(android.content.pm.ProviderInfo providerInfo) {
        Q3.AbstractC1477p.m(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new java.lang.IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static Q4.p b() {
        return f44045C;
    }

    public static boolean c() {
        return f44046D.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            f44046D.set(true);
            if (Q4.f.q(getContext()) == null) {
            }
            return false;
        } finally {
            f44046D.set(false);
        }
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
