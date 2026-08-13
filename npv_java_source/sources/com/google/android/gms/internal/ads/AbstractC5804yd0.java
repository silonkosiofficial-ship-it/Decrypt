package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5804yd0 {
    public static boolean a(int i6) {
        int i10 = i6 - 1;
        return i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    public static final int b(android.content.Context context, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        java.lang.String str;
        int i6;
        java.lang.String str2;
        java.lang.String strC;
        java.io.File file = new java.io.File(new java.io.File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            java.io.File[] fileArrListFiles = file.listFiles(new com.google.android.gms.internal.ads.C5596wj0(java.util.regex.Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                str = "No .so";
            } else {
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                d(bArr, null, context, c2929Vc0);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s6 = java.nio.ByteBuffer.wrap(bArr2).getShort();
                                if (s6 == 3) {
                                    fileInputStream.close();
                                    i6 = 5;
                                } else if (s6 == 40) {
                                    fileInputStream.close();
                                    i6 = 3;
                                } else if (s6 == 62) {
                                    fileInputStream.close();
                                    i6 = 7;
                                } else if (s6 == 183) {
                                    fileInputStream.close();
                                    i6 = 6;
                                } else if (s6 != 243) {
                                    d(bArr, null, context, c2929Vc0);
                                } else {
                                    fileInputStream.close();
                                    i6 = 8;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException e6) {
                    d(null, e6.toString(), context, c2929Vc0);
                }
                i6 = 1;
            }
            if (i6 == 1000) {
                strC = c(context, c2929Vc0);
                if (android.text.TextUtils.isEmpty(strC)) {
                    strC = "Empty dev arch";
                } else if (!strC.equalsIgnoreCase("i686") || strC.equalsIgnoreCase("x86")) {
                    i6 = 5;
                } else if (strC.equalsIgnoreCase("x86_64")) {
                    i6 = 7;
                } else if (strC.equalsIgnoreCase("arm64-v8a")) {
                    i6 = 6;
                } else if (strC.equalsIgnoreCase("armeabi-v7a") || strC.equalsIgnoreCase("armv71")) {
                    i6 = 3;
                } else if (strC.equalsIgnoreCase("riscv64")) {
                    i6 = 8;
                }
                d(null, strC, context, c2929Vc0);
                i6 = 1;
            }
            if (i6 != 1) {
                str2 = "UNSUPPORTED";
            } else if (i6 != 3) {
                str2 = "ARM7";
            } else if (i6 != 5) {
                str2 = "X86";
            } else if (i6 != 6) {
                str2 = "ARM64";
            } else if (i6 != 7) {
                str2 = "X86_64";
            } else if (i6 != 8) {
                str2 = "null";
            } else {
                str2 = "RISCV64";
            }
            c2929Vc0.b(5018, str2);
            return i6;
        }
        str = "No lib/";
        c2929Vc0.b(5017, str);
        i6 = 1000;
        if (i6 == 1000) {
            strC = c(context, c2929Vc0);
            if (android.text.TextUtils.isEmpty(strC)) {
                strC = "Empty dev arch";
            } else if (strC.equalsIgnoreCase("i686")) {
                i6 = 5;
            } else {
                i6 = 5;
            }
            d(null, strC, context, c2929Vc0);
            i6 = 1;
        }
        if (i6 != 1) {
            str2 = "UNSUPPORTED";
        } else if (i6 != 3) {
            str2 = "ARM7";
        } else if (i6 != 5) {
            str2 = "X86";
        } else if (i6 != 6) {
            str2 = "ARM64";
        } else if (i6 != 7) {
            str2 = "X86_64";
        } else if (i6 != 8) {
            str2 = "null";
        } else {
            str2 = "RISCV64";
        }
        c2929Vc0.b(5018, str2);
        return i6;
    }

    private static final java.lang.String c(android.content.Context context, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("i686", "armv71"));
        java.lang.String strE = com.google.android.gms.internal.ads.EnumC2792Rg0.OS_ARCH.e();
        if (!android.text.TextUtils.isEmpty(strE) && hashSet.contains(strE)) {
            return strE;
        }
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e6) {
            c2929Vc0.c(2024, 0L, e6);
        }
        java.lang.String str = android.os.Build.CPU_ABI;
        return str != null ? str : android.os.Build.CPU_ABI2;
    }

    private static final void d(byte[] bArr, java.lang.String str, android.content.Context context, com.google.android.gms.internal.ads.C2929Vc0 c2929Vc0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("os.arch:");
        sb.append(com.google.android.gms.internal.ads.EnumC2792Rg0.OS_ARCH.e());
        sb.append(";");
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(java.util.Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(android.os.Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(android.os.Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(java.util.Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        c2929Vc0.b(4007, sb.toString());
    }
}
