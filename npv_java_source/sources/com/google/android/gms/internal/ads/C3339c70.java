package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3339c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f34447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.U60 f34448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f34449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C2730Po f34450d;

    C3339c70(android.util.JsonReader jsonReader, com.google.android.gms.internal.ads.C2730Po c2730Po) throws java.io.IOException {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        this.f34450d = c2730Po;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() && c2730Po != null && (bundle2 = c2730Po.f30805O) != null) {
            bundle2.putLong(com.google.android.gms.internal.ads.MN.SERVER_RESPONSE_PARSE_START.e(), p174r3.v.c().a());
        }
        java.util.List listEmptyList = java.util.Collections.emptyList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginObject();
        com.google.android.gms.internal.ads.U60 u60 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new java.util.ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new com.google.android.gms.internal.ads.R60(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        u60 = new com.google.android.gms.internal.ads.U60(jsonReader);
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25614l2)).booleanValue() && c2730Po != null && (bundle = c2730Po.f30805O) != null) {
                            bundle.putLong(com.google.android.gms.internal.ads.MN.NORMALIZATION_AD_RESPONSE_START.e(), u60.f32131s);
                            c2730Po.f30805O.putLong(com.google.android.gms.internal.ads.MN.NORMALIZATION_AD_RESPONSE_END.e(), u60.f32132t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    java.lang.String strNextString = null;
                    org.json.JSONObject jSONObjectI = null;
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectI = p214v3.V.i(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new com.google.android.gms.internal.ads.C3230b70(strNextString, jSONObjectI));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f34449c = arrayList;
        this.f34447a = listEmptyList;
        this.f34448b = u60 == null ? new com.google.android.gms.internal.ads.U60(new android.util.JsonReader(new java.io.StringReader("{}"))) : u60;
    }

    public static com.google.android.gms.internal.ads.C3339c70 a(java.io.Reader reader, com.google.android.gms.internal.ads.C2730Po c2730Po) {
        try {
            try {
                com.google.android.gms.internal.ads.C3339c70 c3339c70 = new com.google.android.gms.internal.ads.C3339c70(new android.util.JsonReader(reader), c2730Po);
                V3.l.a(reader);
                return c3339c70;
            } catch (java.lang.Throwable th) {
                V3.l.a(reader);
                throw th;
            }
        } catch (java.io.IOException | java.lang.AssertionError | java.lang.IllegalStateException | java.lang.NumberFormatException | org.json.JSONException e6) {
            throw new com.google.android.gms.internal.ads.V60("unable to parse ServerResponse", e6);
        }
    }
}
