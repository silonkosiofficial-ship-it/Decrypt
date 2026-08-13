package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class O2 implements com.google.android.gms.internal.measurement.Q2 {
    @Override // com.google.android.gms.internal.measurement.Q2
    public final java.lang.String a(android.content.ContentResolver contentResolver, java.lang.String str) throws com.google.android.gms.internal.measurement.U2 {
        android.net.Uri uri = com.google.android.gms.internal.measurement.I2.f40541a;
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new com.google.android.gms.internal.measurement.U2("Unable to acquire ContentProviderClient");
            }
            try {
                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new java.lang.String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new com.google.android.gms.internal.measurement.U2("ContentProvider query returned null cursor");
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return null;
                    }
                    java.lang.String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return string;
                } catch (java.lang.Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (android.os.RemoteException e6) {
                throw new com.google.android.gms.internal.measurement.U2("ContentProvider query failed", e6);
            }
        } catch (java.lang.Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q2
    public final java.util.Map b(android.content.ContentResolver contentResolver, java.lang.String[] strArr, com.google.android.gms.internal.measurement.R2 r6) throws com.google.android.gms.internal.measurement.U2 {
        android.net.Uri uri = com.google.android.gms.internal.measurement.I2.f40542b;
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new com.google.android.gms.internal.measurement.U2("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new com.google.android.gms.internal.measurement.U2("ContentProvider query returned null cursor");
                    }
                    java.util.Map mapR = r6.r(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapR.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new com.google.android.gms.internal.measurement.U2("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapR;
                } catch (java.lang.Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (android.os.RemoteException e6) {
                throw new com.google.android.gms.internal.measurement.U2("ContentProvider query failed", e6);
            }
        } catch (java.lang.Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
