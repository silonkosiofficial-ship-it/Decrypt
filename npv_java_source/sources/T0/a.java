package T0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements T0.i {
    @Override // T0.i
    public T0.h b() {
        return new T0.h(p097j7.AbstractC6879v.e(new T0.g(java.util.Locale.getDefault())));
    }

    @Override // T0.i
    public java.util.Locale c(java.lang.String str) {
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
        if (p247y7.AbstractC7350t.b(localeForLanguageTag.toLanguageTag(), "und")) {
            java.lang.String unused = T0.e.f12886a;
            java.lang.String str2 = "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.";
        }
        return localeForLanguageTag;
    }
}
