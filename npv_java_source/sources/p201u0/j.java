package p201u0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList f55308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f55309b = new float[64];

    public final p201u0.j a(java.lang.String str) {
        java.util.ArrayList arrayList = this.f55308a;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f55308a = arrayList;
        } else {
            arrayList.clear();
        }
        b(str, arrayList);
        return this;
    }

    public final java.util.ArrayList b(java.lang.String str, java.util.ArrayList arrayList) {
        int i6;
        char cCharAt;
        int i10;
        int length = str.length();
        int i11 = 0;
        while (i11 < length && p247y7.AbstractC7350t.g(str.charAt(i11), 32) <= 0) {
            i11++;
        }
        while (length > i11 && p247y7.AbstractC7350t.g(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i12 = 0;
        while (i11 < length) {
            while (true) {
                i6 = i11 + 1;
                cCharAt = str.charAt(i11);
                int i13 = cCharAt | ' ';
                if ((i13 - 97) * (i13 - 122) <= 0 && i13 != 101) {
                    break;
                }
                if (i6 >= length) {
                    cCharAt = 0;
                    break;
                }
                i11 = i6;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i12 = 0;
                    while (true) {
                        if (i6 >= length || p247y7.AbstractC7350t.g(str.charAt(i6), 32) > 0) {
                            long jA = p201u0.b.a(str, i6, length);
                            i10 = (int) (jA >>> 32);
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jA & 4294967295L));
                            if (!java.lang.Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f55309b;
                                int i14 = i12 + 1;
                                fArr[i12] = fIntBitsToFloat;
                                if (i14 >= fArr.length) {
                                    float[] fArr2 = new float[i14 * 2];
                                    this.f55309b = fArr2;
                                    p097j7.AbstractC6872n.i(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i12 = i14;
                            }
                            while (i10 < length && str.charAt(i10) == ',') {
                                i10++;
                            }
                            if (i10 >= length || java.lang.Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i6 = i10;
                        } else {
                            i6++;
                        }
                    }
                    i6 = i10;
                }
                p201u0.i.a(cCharAt, arrayList, this.f55309b, i12);
            }
            i11 = i6;
        }
        return arrayList;
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = this.f55308a;
        return arrayList != null ? arrayList : p097j7.AbstractC6879v.m();
    }
}
