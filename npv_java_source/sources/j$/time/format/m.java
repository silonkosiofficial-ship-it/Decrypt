package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class m extends j$.time.format.n {
    @Override // j$.time.format.n
    protected final boolean c(char c6, char c10) {
        return j$.time.format.v.c(c6, c10);
    }

    @Override // j$.time.format.n
    protected final j$.time.format.n e(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        return new j$.time.format.m(str, str2, nVar, 0);
    }

    @Override // j$.time.format.n
    protected final boolean h(java.lang.CharSequence charSequence, int i6, int i10) {
        int length = this.f47852a.length();
        if (length > i10 - i6) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i6 + 1;
            if (!j$.time.format.v.c(this.f47852a.charAt(i11), charSequence.charAt(i6))) {
                return false;
            }
            i6 = i14;
            length = i12;
            i11 = i13;
        }
    }
}
