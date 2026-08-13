package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static int a(byte[] bArr, int i6, int i10, int i11) {
        int i12;
        int i13 = i6;
        while (true) {
            i12 = (i10 & (-4)) + i6;
            if (i13 >= i12) {
                break;
            }
            int i14 = ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | (bArr[i13 + 3] << 24)) * (-862048943);
            int i15 = i11 ^ (((i14 >>> 17) | (i14 << 15)) * 461845907);
            i11 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
            i13 += 4;
        }
        int i16 = i10 & 3;
        int i17 = 0;
        if (i16 == 1) {
            int i18 = ((bArr[i12] & 255) | i17) * (-862048943);
            i11 ^= ((i18 >>> 17) | (i18 << 15)) * 461845907;
        } else {
            if (i16 != 2) {
                i17 = i16 == 3 ? (bArr[i12 + 2] & 255) << 16 : 0;
            }
            i17 |= (bArr[i12 + 1] & 255) << 8;
            int i19 = ((bArr[i12] & 255) | i17) * (-862048943);
            i11 ^= ((i19 >>> 17) | (i19 << 15)) * 461845907;
        }
        int i20 = i11 ^ i10;
        int i21 = (i20 ^ (i20 >>> 16)) * (-2048144789);
        int i22 = (i21 ^ (i21 >>> 13)) * (-1028477387);
        return i22 ^ (i22 >>> 16);
    }
}
