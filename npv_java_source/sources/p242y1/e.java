package p242y1;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Comparator f57165a = new java.util.Comparator() { // from class: y1.c
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p242y1.e.g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        android.database.Cursor a(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements y1.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.ContentProviderClient f57166a;

        b(android.content.Context context, android.net.Uri uri) {
            this.f57166a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // y1.e.a
        public android.database.Cursor a(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.f57166a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException e6) {
                return null;
            }
        }

        @Override // y1.e.a
        public void close() {
            android.content.ContentProviderClient contentProviderClient = this.f57166a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements y1.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.ContentProviderClient f57167a;

        c(android.content.Context context, android.net.Uri uri) {
            this.f57167a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // y1.e.a
        public android.database.Cursor a(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.f57167a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException e6) {
                return null;
            }
        }

        @Override // y1.e.a
        public void close() {
            android.content.ContentProviderClient contentProviderClient = this.f57167a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    private static java.util.List b(android.content.pm.Signature[] signatureArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(java.util.List list, java.util.List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!java.util.Arrays.equals((byte[]) list.get(i6), (byte[]) list2.get(i6))) {
                return false;
            }
        }
        return true;
    }

    private static java.util.List d(p242y1.f fVar, android.content.res.Resources resources) {
        return fVar.b() != null ? fVar.b() : androidx.core.content.res.e.c(resources, fVar.c());
    }

    static y1.h.a e(android.content.Context context, p242y1.f fVar, android.os.CancellationSignal cancellationSignal) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ProviderInfo providerInfoF = f(context.getPackageManager(), fVar, context.getResources());
        return providerInfoF == null ? y1.h.a.a(1, null) : y1.h.a.a(0, h(context, fVar, providerInfoF.authority, cancellationSignal));
    }

    static android.content.pm.ProviderInfo f(android.content.pm.PackageManager packageManager, p242y1.f fVar, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String strE = fVar.e();
        android.content.pm.ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fVar.f())) {
            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + fVar.f());
        }
        java.util.List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        java.util.Collections.sort(listB, f57165a);
        java.util.List listD = d(fVar, resources);
        for (int i6 = 0; i6 < listD.size(); i6++) {
            java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) listD.get(i6));
            java.util.Collections.sort(arrayList, f57165a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            byte b10 = bArr2[i6];
            if (b6 != b10) {
                return b6 - b10;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    static y1.h.b[] h(android.content.Context context, p242y1.f fVar, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        boolean z6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority(str).build();
        android.net.Uri uriBuild2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        y1.e.a aVarA = p242y1.d.a(context, uriBuild);
        android.database.Cursor cursorA = null;
        try {
            cursorA = aVarA.a(uriBuild, new java.lang.String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new java.lang.String[]{fVar.g()}, null, cancellationSignal);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex("result_code");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int columnIndex2 = cursorA.getColumnIndex("_id");
                int columnIndex3 = cursorA.getColumnIndex("file_id");
                int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorA.getColumnIndex("font_weight");
                int columnIndex6 = cursorA.getColumnIndex("font_italic");
                while (cursorA.moveToNext()) {
                    int i6 = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                    int i10 = columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0;
                    java.util.ArrayList arrayList3 = arrayList2;
                    android.net.Uri uriWithAppendedId = columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3));
                    int i11 = columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z6 = true;
                        if (cursorA.getInt(columnIndex6) != 1) {
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                    y1.h.b bVarA = y1.h.b.a(uriWithAppendedId, i10, i11, z6, i6);
                    arrayList2 = arrayList3;
                    arrayList2.add(bVarA);
                }
                arrayList = arrayList2;
            }
            return (y1.h.b[]) arrayList.toArray(new y1.h.b[0]);
        } finally {
            if (cursorA != null) {
                cursorA.close();
            }
            aVarA.close();
        }
    }
}
