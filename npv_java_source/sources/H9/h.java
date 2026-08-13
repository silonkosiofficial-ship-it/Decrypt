package H9;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f4630b;

    public h(java.lang.String str, java.util.Map map) {
        java.lang.String lowerCase;
        p247y7.AbstractC7350t.f(str, "scheme");
        p247y7.AbstractC7350t.f(map, "authParams");
        this.f4629a = str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.String str3 = (java.lang.String) entry.getValue();
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.US;
                p247y7.AbstractC7350t.e(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        p247y7.AbstractC7350t.e(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f4630b = mapUnmodifiableMap;
    }

    public final java.nio.charset.Charset a() {
        java.lang.String str = (java.lang.String) this.f4630b.get("charset");
        if (str != null) {
            try {
                java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(str);
                p247y7.AbstractC7350t.e(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (java.lang.Exception unused) {
            }
        }
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.ISO_8859_1;
        p247y7.AbstractC7350t.e(charset, "ISO_8859_1");
        return charset;
    }

    public final java.lang.String b() {
        return (java.lang.String) this.f4630b.get("realm");
    }

    public final java.lang.String c() {
        return this.f4629a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof H9.h) {
            H9.h hVar = (H9.h) obj;
            if (p247y7.AbstractC7350t.b(hVar.f4629a, this.f4629a) && p247y7.AbstractC7350t.b(hVar.f4630b, this.f4630b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f4629a.hashCode()) * 31) + this.f4630b.hashCode();
    }

    public java.lang.String toString() {
        return this.f4629a + " authParams=" + this.f4630b;
    }
}
