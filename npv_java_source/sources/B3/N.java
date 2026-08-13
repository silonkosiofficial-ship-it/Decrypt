package B3;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f553b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C2730Po f555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.os.Bundle f556e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f559h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f554c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.os.Bundle f557f = new android.os.Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public N(android.util.JsonReader jsonReader, com.google.android.gms.internal.ads.C2730Po c2730Po) throws java.io.IOException {
        android.os.Bundle bundle;
        byte b6;
        this.f558g = -1L;
        this.f559h = -1L;
        this.f555d = c2730Po;
        java.util.HashMap map = new java.util.HashMap();
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b6 = 2;
                    break;
                case "params":
                    b6 = 0;
                    break;
                case "signal_dictionary":
                    b6 = 1;
                    break;
                case "end_time":
                    b6 = 3;
                    break;
                default:
                    b6 = -1;
                    break;
            }
            if (b6 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b6 == 1) {
                map = new java.util.HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b6 == 2) {
                this.f558g = jsonReader.nextLong();
            } else if (b6 != 3) {
                jsonReader.skipValue();
            } else {
                this.f559h = jsonReader.nextLong();
            }
        }
        this.f552a = strNextString;
        jsonReader.endObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f557f.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25604k2)).booleanValue() || c2730Po == null || (bundle = c2730Po.f30805O) == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.MN.GET_SIGNALS_SDKCORE_START.e(), this.f558g);
        c2730Po.f30805O.putLong(com.google.android.gms.internal.ads.MN.GET_SIGNALS_SDKCORE_END.e(), this.f559h);
    }
}
