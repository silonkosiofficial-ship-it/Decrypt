package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6706d implements j$.time.format.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f47831a;

    C6706d(char c6) {
        this.f47831a = c6;
    }

    @Override // j$.time.format.f
    public final boolean n(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        sb.append(this.f47831a);
        return true;
    }

    @Override // j$.time.format.f
    public final int p(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i6) {
        if (i6 == charSequence.length()) {
            return ~i6;
        }
        char cCharAt = charSequence.charAt(i6);
        char c6 = this.f47831a;
        return (cCharAt == c6 || (!vVar.k() && (java.lang.Character.toUpperCase(cCharAt) == java.lang.Character.toUpperCase(c6) || java.lang.Character.toLowerCase(cCharAt) == java.lang.Character.toLowerCase(c6)))) ? i6 + 1 : ~i6;
    }

    public final java.lang.String toString() {
        char c6 = this.f47831a;
        if (c6 == '\'') {
            return "''";
        }
        return "'" + c6 + "'";
    }
}
