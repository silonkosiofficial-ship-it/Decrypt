package V9;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V9.f f15206a = new V9.f();

    private f() {
    }

    public final java.lang.String a(int i6) {
        java.lang.StringBuilder sb;
        if (i6 < 1000 || i6 >= 5000) {
            sb = new java.lang.StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i6);
        } else {
            if ((1004 > i6 || i6 >= 1007) && (1015 > i6 || i6 >= 3000)) {
                return null;
            }
            sb = new java.lang.StringBuilder();
            sb.append("Code ");
            sb.append(i6);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    public final void b(X9.C1836d.a aVar, byte[] bArr) {
        p247y7.AbstractC7350t.f(aVar, "cursor");
        p247y7.AbstractC7350t.f(bArr, "key");
        int length = bArr.length;
        int i6 = 0;
        do {
            byte[] bArr2 = aVar.f16144G;
            int i10 = aVar.f16145H;
            int i11 = aVar.f16146I;
            if (bArr2 != null) {
                while (i10 < i11) {
                    int i12 = i6 % length;
                    bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i12]);
                    i10++;
                    i6 = i12 + 1;
                }
            }
        } while (aVar.f() != -1);
    }

    public final void c(int i6) {
        java.lang.String strA = a(i6);
        if (strA == null) {
            return;
        }
        p247y7.AbstractC7350t.c(strA);
        throw new java.lang.IllegalArgumentException(strA.toString());
    }
}
