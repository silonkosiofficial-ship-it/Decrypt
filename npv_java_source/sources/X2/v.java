package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    static X2.v a(long j6) {
        return new X2.l(j6);
    }

    public static X2.v b(java.io.Reader reader) throws java.io.IOException {
        android.util.JsonReader jsonReader = new android.util.JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == android.util.JsonToken.STRING) {
                        X2.v vVarA = a(java.lang.Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return vVarA;
                    }
                    X2.v vVarA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return vVarA2;
                }
                jsonReader.skipValue();
            }
            throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
        } catch (java.lang.Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long c();
}
