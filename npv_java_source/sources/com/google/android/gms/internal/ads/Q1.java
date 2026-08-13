package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f30858a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String[] f30859b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f30860c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static com.google.android.gms.internal.ads.M1 a(java.lang.String str) {
        long j6;
        java.lang.String str2;
        java.lang.String str3;
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw com.google.android.gms.internal.ads.C4708of.a("Couldn't find xmp metadata", null);
            }
            com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0O = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
            long j10 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, "rdf:Description")) {
                    java.lang.String[] strArr = f30858a;
                    int i6 = 0;
                    for (int i10 = 0; i10 < 4; i10++) {
                        java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, strArr[i10]);
                        if (strA != null) {
                            if (java.lang.Integer.parseInt(strA) != 1) {
                                return null;
                            }
                            java.lang.String[] strArr2 = f30859b;
                            int i11 = 0;
                            while (true) {
                                if (i11 < 4) {
                                    java.lang.String strA2 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, strArr2[i11]);
                                    if (strA2 != null) {
                                        j6 = java.lang.Long.parseLong(strA2);
                                        if (j6 != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i11++;
                                }
                                j6 = -9223372036854775807L;
                                break;
                            }
                            java.lang.String[] strArr3 = f30860c;
                            while (true) {
                                if (i6 >= 2) {
                                    abstractC3398ci0O = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
                                    break;
                                }
                                java.lang.String strA3 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParserNewPullParser, strArr3[i6]);
                                if (strA3 != null) {
                                    abstractC3398ci0O = com.google.android.gms.internal.ads.AbstractC3398ci0.Q(new com.google.android.gms.internal.ads.L1("image/jpeg", "Primary", 0L, 0L), new com.google.android.gms.internal.ads.L1("video/mp4", "MotionPhoto", java.lang.Long.parseLong(strA3), 0L));
                                    break;
                                }
                                i6++;
                            }
                            j10 = j6;
                        }
                    }
                    return null;
                }
                if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                abstractC3398ci0O = b(xmlPullParserNewPullParser, str2, str3);
            } while (!com.google.android.gms.internal.ads.AbstractC3707fX.b(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (abstractC3398ci0O.isEmpty()) {
                return null;
            }
            return new com.google.android.gms.internal.ads.M1(j10, abstractC3398ci0O);
        } catch (com.google.android.gms.internal.ads.C4708of | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.AbstractC3398ci0 b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        do {
            java.lang.String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (com.google.android.gms.internal.ads.AbstractC3707fX.c(xmlPullParser, strConcat)) {
                java.lang.String strConcat2 = str2.concat(":Mime");
                java.lang.String strConcat3 = str2.concat(":Semantic");
                java.lang.String strConcat4 = str2.concat(":Length");
                java.lang.String strConcat5 = str2.concat(":Padding");
                java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParser, strConcat2);
                java.lang.String strA2 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParser, strConcat3);
                java.lang.String strA3 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParser, strConcat4);
                java.lang.String strA4 = com.google.android.gms.internal.ads.AbstractC3707fX.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
                }
                c3083Zh0.g(new com.google.android.gms.internal.ads.L1(strA, strA2, strA3 != null ? java.lang.Long.parseLong(strA3) : 0L, strA4 != null ? java.lang.Long.parseLong(strA4) : 0L));
            }
        } while (!com.google.android.gms.internal.ads.AbstractC3707fX.b(xmlPullParser, str.concat(":Directory")));
        return c3083Zh0.j();
    }
}
