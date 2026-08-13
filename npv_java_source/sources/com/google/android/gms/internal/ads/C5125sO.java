package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5125sO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.f f38733a;

    public C5125sO(V3.f fVar) {
        this.f38733a = fVar;
    }

    public final void a(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2311Eg.f27098a.e()).booleanValue()) {
            long jA = this.f38733a.a();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jA);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    java.lang.Object obj = objArr[i6];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (java.io.IOException e6) {
                p224w3.p.e("unable to log", e6);
            }
            p224w3.p.f("AD-DBG ".concat(java.lang.String.valueOf(stringWriter.toString())));
        }
    }
}
