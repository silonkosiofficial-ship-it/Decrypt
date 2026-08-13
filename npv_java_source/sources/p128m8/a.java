package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f51202a;

    static {
        java.lang.String property;
        try {
            property = java.lang.System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        f51202a = "true".equals(property);
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 3 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 12 || i6 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 3 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 12 || i6 == 14) ? 2 : 3];
        if (i6 == 1 || i6 == 3 || i6 == 6 || i6 == 8 || i6 == 10 || i6 == 12 || i6 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i6 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i6 == 3) {
            objArr[1] = "encode8to7";
        } else if (i6 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i6 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i6 == 10) {
            objArr[1] = "dropMarker";
        } else if (i6 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i6 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i6) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 3 && i6 != 6 && i6 != 8 && i6 != 10 && i6 != 12 && i6 != 14) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static void b(byte[] bArr, int i6) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) ((bArr[i10] + i6) & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
        }
    }

    private static byte[] c(java.lang.String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int length = 0;
        for (java.lang.String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i6 = 0;
        for (java.lang.String str2 : strArr) {
            int length2 = str2.length();
            int i10 = 0;
            while (i10 < length2) {
                bArr[i6] = (byte) str2.charAt(i10);
                i10++;
                i6++;
            }
        }
        return bArr;
    }

    private static byte[] d(byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i6 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i6 + 1;
            int i13 = i10 + 1;
            bArr2[i11] = (byte) (((bArr[i6] & 255) >>> i10) + ((bArr[i12] & ((1 << i13) - 1)) << (7 - i10)));
            if (i10 == 6) {
                i6 += 2;
                i10 = 0;
            } else {
                i6 = i12;
                i10 = i13;
            }
        }
        return bArr2;
    }

    public static byte[] e(java.lang.String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrA = p128m8.j.a(f(strArr));
                if (bArrA == null) {
                    a(8);
                }
                return bArrA;
            }
            if (cCharAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] bArrC = c(strArr);
        b(bArrC, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
        return d(bArrC);
    }

    private static java.lang.String[] f(java.lang.String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
