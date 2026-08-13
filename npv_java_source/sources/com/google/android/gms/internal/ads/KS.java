package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class KS implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f28931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.LS f28932b;

    KS(com.google.android.gms.internal.ads.LS ls, boolean z6) {
        this.f28931a = z6;
        this.f28932b = ls;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        p224w3.p.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.util.List listEmptyList;
        java.util.List listAsList;
        final java.util.ArrayList arrayList;
        java.util.Iterator it;
        byte b6;
        com.google.android.gms.internal.ads.EnumC2344Fe enumC2344Fe;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (this.f28932b.a()) {
            return;
        }
        android.os.Bundle bundle = c3677fC.f35301a;
        java.lang.Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof java.util.List)) {
            if (obj2 instanceof java.lang.String[]) {
                listAsList = java.util.Arrays.asList((java.lang.String[]) obj2);
            } else {
                listEmptyList = java.util.Collections.emptyList();
            }
            arrayList = new java.util.ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((java.lang.String) it.next()) {
                    case "banner":
                        b6 = 0;
                        break;
                    case "native":
                        b6 = 2;
                        break;
                    case "rewarded":
                        b6 = 3;
                        break;
                    case "interstitial":
                        b6 = 1;
                        break;
                    default:
                        b6 = -1;
                        break;
                }
                if (b6 != 0) {
                    enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.BANNER;
                } else if (b6 != 1) {
                    enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.INTERSTITIAL;
                } else if (b6 != 2) {
                    enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.NATIVE_APP_INSTALL;
                } else if (b6 != 3) {
                    enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(enumC2344Fe);
            }
            final com.google.android.gms.internal.ads.EnumC2527Kd enumC2527KdC = com.google.android.gms.internal.ads.LS.c(this.f28932b, bundle);
            final com.google.android.gms.internal.ads.C2305Ed c2305EdB = com.google.android.gms.internal.ads.LS.b(this.f28932b, bundle);
            com.google.android.gms.internal.ads.LS ls = this.f28932b;
            final boolean z6 = this.f28931a;
            ls.f29757b.a(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.JS
                @Override // com.google.android.gms.internal.ads.Y80
                public final java.lang.Object b(java.lang.Object obj3) {
                    com.google.android.gms.internal.ads.KS ks = this.f28689a;
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj3;
                    if (ks.f28932b.a()) {
                        return null;
                    }
                    com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd = enumC2527KdC;
                    com.google.android.gms.internal.ads.C2305Ed c2305Ed = c2305EdB;
                    java.util.ArrayList arrayList2 = arrayList;
                    boolean z10 = z6;
                    byte[] bArrF = com.google.android.gms.internal.ads.LS.f(ks.f28932b, z10, arrayList2, c2305Ed, enumC2527Kd);
                    com.google.android.gms.internal.ads.OS.f(sQLiteDatabase, z10, true);
                    com.google.android.gms.internal.ads.OS.c(sQLiteDatabase, ks.f28932b.f29497f.d(), bArrF);
                    return null;
                }
            });
        }
        listAsList = (java.util.List) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(listAsList.size());
        for (java.lang.Object obj3 : listAsList) {
            if (obj3 instanceof java.lang.String) {
                arrayList2.add((java.lang.String) obj3);
            }
        }
        listEmptyList = j$.util.DesugarCollections.unmodifiableList(arrayList2);
        arrayList = new java.util.ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((java.lang.String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b6 = 0;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals("native")) {
                        b6 = 2;
                    } else {
                        b6 = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b6 = 3;
                    } else {
                        b6 = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b6 = 1;
                    } else {
                        b6 = -1;
                    }
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 != 0) {
                enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.BANNER;
            } else if (b6 != 1) {
                enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.INTERSTITIAL;
            } else if (b6 != 2) {
                enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.NATIVE_APP_INSTALL;
            } else if (b6 != 3) {
                enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                enumC2344Fe = com.google.android.gms.internal.ads.EnumC2344Fe.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(enumC2344Fe);
        }
        final com.google.android.gms.internal.ads.EnumC2527Kd enumC2527KdC2 = com.google.android.gms.internal.ads.LS.c(this.f28932b, bundle);
        final com.google.android.gms.internal.ads.C2305Ed c2305EdB2 = com.google.android.gms.internal.ads.LS.b(this.f28932b, bundle);
        com.google.android.gms.internal.ads.LS ls2 = this.f28932b;
        final boolean z10 = this.f28931a;
        ls2.f29757b.a(new com.google.android.gms.internal.ads.Y80() { // from class: com.google.android.gms.internal.ads.JS
            @Override // com.google.android.gms.internal.ads.Y80
            public final java.lang.Object b(java.lang.Object obj4) {
                com.google.android.gms.internal.ads.KS ks = this.f28689a;
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj4;
                if (ks.f28932b.a()) {
                    return null;
                }
                com.google.android.gms.internal.ads.EnumC2527Kd enumC2527Kd = enumC2527KdC2;
                com.google.android.gms.internal.ads.C2305Ed c2305Ed = c2305EdB2;
                java.util.ArrayList arrayList3 = arrayList;
                boolean z11 = z10;
                byte[] bArrF = com.google.android.gms.internal.ads.LS.f(ks.f28932b, z11, arrayList3, c2305Ed, enumC2527Kd);
                com.google.android.gms.internal.ads.OS.f(sQLiteDatabase, z11, true);
                com.google.android.gms.internal.ads.OS.c(sQLiteDatabase, ks.f28932b.f29497f.d(), bArrF);
                return null;
            }
        });
    }
}
