package V;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f14692a;

    public L0(java.util.List list) {
        this.f14692a = list;
    }

    public /* synthetic */ L0(java.util.List list, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new java.util.ArrayList() : list);
    }

    public final void a(int i6) {
        if (!this.f14692a.isEmpty()) {
            if (((java.lang.Number) this.f14692a.get(0)).intValue() == i6) {
                return;
            }
            java.util.List list = this.f14692a;
            if (((java.lang.Number) list.get(list.size() - 1)).intValue() == i6) {
                return;
            }
        }
        int size = this.f14692a.size();
        this.f14692a.add(java.lang.Integer.valueOf(i6));
        while (size > 0) {
            int i10 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((java.lang.Number) this.f14692a.get(i10)).intValue();
            if (i6 <= iIntValue) {
                break;
            }
            this.f14692a.set(size, java.lang.Integer.valueOf(iIntValue));
            size = i10;
        }
        this.f14692a.set(size, java.lang.Integer.valueOf(i6));
    }

    public final boolean b() {
        return !this.f14692a.isEmpty();
    }

    public final int c() {
        return ((java.lang.Number) p097j7.AbstractC6879v.i0(this.f14692a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.f14692a.size() > 0)) {
            V.AbstractC1741q.r("Set is empty");
        }
        int iIntValue2 = ((java.lang.Number) this.f14692a.get(0)).intValue();
        while ((!this.f14692a.isEmpty()) && ((java.lang.Number) this.f14692a.get(0)).intValue() == iIntValue2) {
            java.util.List list = this.f14692a;
            list.set(0, p097j7.AbstractC6879v.t0(list));
            java.util.List list2 = this.f14692a;
            list2.remove(list2.size() - 1);
            int size = this.f14692a.size();
            int size2 = this.f14692a.size() >>> 1;
            int i6 = 0;
            while (i6 < size2) {
                int iIntValue3 = ((java.lang.Number) this.f14692a.get(i6)).intValue();
                int i10 = (i6 + 1) * 2;
                int i11 = i10 - 1;
                int iIntValue4 = ((java.lang.Number) this.f14692a.get(i11)).intValue();
                if (i10 < size && (iIntValue = ((java.lang.Number) this.f14692a.get(i10)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.f14692a.set(i6, java.lang.Integer.valueOf(iIntValue));
                    this.f14692a.set(i10, java.lang.Integer.valueOf(iIntValue3));
                    i6 = i10;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.f14692a.set(i6, java.lang.Integer.valueOf(iIntValue4));
                    this.f14692a.set(i11, java.lang.Integer.valueOf(iIntValue3));
                    i6 = i11;
                }
            }
        }
        return iIntValue2;
    }
}
