package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class T60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f31874a;

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    T60(android.util.JsonReader jsonReader) throws java.io.IOException {
        byte b6;
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b6 = 0;
                } else {
                    b6 = -1;
                }
            } else if (strNextName.equals("description")) {
                b6 = 1;
            } else {
                b6 = -1;
            }
            if (b6 == 0) {
                jsonReader.nextInt();
            } else if (b6 != 1) {
                jsonReader.skipValue();
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.f31874a = strNextString;
    }

    public final java.lang.String a() {
        return this.f31874a;
    }
}
