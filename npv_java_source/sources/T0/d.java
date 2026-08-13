package T0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements T0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.LocaleList f12883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T0.h f12884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U0.r f12885c = U0.q.a();

    @Override // T0.i
    public T0.h b() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (this.f12885c) {
            T0.h hVar = this.f12884b;
            if (hVar != null && localeList == this.f12883a) {
                return hVar;
            }
            int size = localeList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(new T0.g(localeList.get(i6)));
            }
            T0.h hVar2 = new T0.h(arrayList);
            this.f12883a = localeList;
            this.f12884b = hVar2;
            return hVar2;
        }
    }

    @Override // T0.i
    public java.util.Locale c(java.lang.String str) {
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        if (p247y7.AbstractC7350t.b(localeForLanguageTag.toLanguageTag(), "und")) {
            java.lang.String unused = T0.e.f12886a;
            java.lang.String str2 = "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.";
        }
        return localeForLanguageTag;
    }
}
