package p089i9;

/* JADX INFO: renamed from: i9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6670a implements p089i9.InterfaceC6683n {
    private AbstractC6670a() {
    }

    public /* synthetic */ AbstractC6670a(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    @Override // p089i9.InterfaceC6683n
    public java.lang.String a(java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        l9.e.a.a(c().a(), e(obj), sb, false, 4, null);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    @Override // p089i9.InterfaceC6683n
    public java.lang.Object b(java.lang.CharSequence charSequence) {
        java.lang.String str;
        p247y7.AbstractC7350t.f(charSequence, "input");
        try {
            try {
                return f(p129m9.l.c(p129m9.l.a(c().b()), charSequence, d(), 0, 4, null));
            } catch (java.lang.IllegalArgumentException e6) {
                java.lang.String message = e6.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((java.lang.Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((java.lang.Object) charSequence) + "')";
                }
                throw new p079h9.c(str, e6);
            }
        } catch (p129m9.j e10) {
            throw new p079h9.c("Failed to parse value from '" + ((java.lang.Object) charSequence) + '\'', e10);
        }
    }

    public abstract p109k9.f c();

    public abstract p129m9.c d();

    public abstract p129m9.c e(java.lang.Object obj);

    public abstract java.lang.Object f(p129m9.c cVar);
}
