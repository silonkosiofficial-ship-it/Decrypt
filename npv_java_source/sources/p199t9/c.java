package p199t9;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p199t9.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f54657C;

    public c(java.util.List list, java.lang.String str) {
        java.lang.StringBuilder sb;
        java.lang.String str2;
        p247y7.AbstractC7350t.f(list, "missingFields");
        p247y7.AbstractC7350t.f(str, "serialName");
        if (list.size() == 1) {
            sb = new java.lang.StringBuilder();
            sb.append("Field '");
            sb.append((java.lang.String) list.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str);
            str2 = "', but it was missing";
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("Fields ");
            sb.append(list);
            sb.append(" are required for type with serial name '");
            sb.append(str);
            str2 = "', but they were missing";
        }
        sb.append(str2);
        this(list, sb.toString(), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        p247y7.AbstractC7350t.f(list, "missingFields");
        this.f54657C = list;
    }

    public final java.util.List a() {
        return this.f54657C;
    }
}
