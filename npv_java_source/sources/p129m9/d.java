package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p129m9.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p129m9.a f51233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i6, int i10, p129m9.a aVar, java.lang.String str) {
        super(i6 == i10 ? java.lang.Integer.valueOf(i6) : null, str, null);
        p247y7.AbstractC7350t.f(aVar, "setter");
        p247y7.AbstractC7350t.f(str, "name");
        this.f51231c = i6;
        this.f51232d = i10;
        this.f51233e = aVar;
        if (1 > i6 || i6 >= 10) {
            throw new java.lang.IllegalArgumentException(("Invalid minimum length " + i6 + " for field " + c() + ": expected 1..9").toString());
        }
        if (i6 > i10 || i10 >= 10) {
            throw new java.lang.IllegalArgumentException(("Invalid maximum length " + i10 + " for field " + c() + ": expected " + i6 + "..9").toString());
        }
    }

    @Override // p129m9.e
    public p129m9.g a(java.lang.Object obj, java.lang.CharSequence charSequence, int i6, int i10) {
        p247y7.AbstractC7350t.f(charSequence, "input");
        int i11 = i10 - i6;
        int i12 = this.f51231c;
        if (i11 < i12) {
            return new m9.g.c(i12);
        }
        int i13 = this.f51232d;
        return i11 > i13 ? new m9.g.d(i13) : p129m9.f.f(this.f51233e, obj, new p099j9.a(p129m9.f.d(charSequence, i6, i10), i11));
    }
}
