package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f50178c;

    public h(p237x7.l lVar, int i6, java.lang.Integer num) {
        p247y7.AbstractC7350t.f(lVar, "number");
        this.f50176a = lVar;
        this.f50177b = i6;
        this.f50178c = num;
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") is negative").toString());
        }
        if (i6 <= 9) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") exceeds the length of an Int").toString());
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        java.lang.StringBuilder sbDeleteCharAt;
        p247y7.AbstractC7350t.f(appendable, "builder");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iIntValue = ((java.lang.Number) this.f50176a.l(obj)).intValue();
        if (z6 && iIntValue < 0) {
            iIntValue = -iIntValue;
        }
        if (this.f50178c != null && iIntValue >= p099j9.e.b()[this.f50178c.intValue()]) {
            sb.append('+');
        }
        if (java.lang.Math.abs(iIntValue) < p099j9.e.b()[this.f50177b - 1]) {
            int[] iArrB = p099j9.e.b();
            if (iIntValue >= 0) {
                sb.append(iIntValue + iArrB[this.f50177b]);
                p247y7.AbstractC7350t.e(sb, "append(...)");
                sbDeleteCharAt = sb.deleteCharAt(0);
            } else {
                sb.append(iIntValue - iArrB[this.f50177b]);
                p247y7.AbstractC7350t.e(sb, "append(...)");
                sbDeleteCharAt = sb.deleteCharAt(1);
            }
            p247y7.AbstractC7350t.e(sbDeleteCharAt, "deleteCharAt(...)");
        } else {
            sb.append(iIntValue);
        }
        appendable.append(sb);
    }
}
