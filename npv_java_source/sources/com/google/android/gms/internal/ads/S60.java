package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31556c;

    public S60(int i6, int i10, boolean z6) {
        this.f31554a = i6;
        this.f31555b = i10;
        this.f31556c = z6;
    }

    static java.util.List a(android.util.JsonReader jsonReader) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new com.google.android.gms.internal.ads.S60(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
