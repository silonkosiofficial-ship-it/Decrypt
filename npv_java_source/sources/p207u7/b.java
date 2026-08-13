package p207u7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f55558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f55559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f55560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f55561d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f55558a = bArr;
        int[] iArr = new int[256];
        int i6 = 0;
        p097j7.AbstractC6872n.z(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            iArr[bArr[i10]] = i11;
            i10++;
            i11++;
        }
        f55559b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f55560c = bArr2;
        int[] iArr2 = new int[256];
        p097j7.AbstractC6872n.z(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i12 = 0;
        while (i6 < length2) {
            iArr2[bArr2[i6]] = i12;
            i6++;
            i12++;
        }
        f55561d = iArr2;
    }
}
