package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p129m9.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(java.lang.Integer.valueOf(str.length()), "the predefined string " + str, null);
        p247y7.AbstractC7350t.f(str, "expected");
        this.f51230c = str;
    }

    @Override // p129m9.e
    public p129m9.g a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        if (p247y7.AbstractC7350t.b(charSequence.subSequence(i6, i10).toString(), this.f51230c)) {
            return null;
        }
        return new m9.g.e(this.f51230c);
    }
}
