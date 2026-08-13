package p106k5;

/* JADX INFO: renamed from: k5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6898i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f49620a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 k5.i$a, still in use, count: 1, list:
  (r0v0 k5.i$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 k5.i$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: k5.i$a */
    static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final java.util.Map f49631M;

        static {
            java.util.HashMap map = new java.util.HashMap(4);
            f49631M = map;
            map.put("armeabi-v7a", new p106k5.AbstractC6898i.a());
            map.put("armeabi", new p106k5.AbstractC6898i.a());
            map.put("arm64-v8a", new p106k5.AbstractC6898i.a());
            map.put("x86", new p106k5.AbstractC6898i.a());
        }

        private a() {
            super(str, i);
        }

        static p106k5.AbstractC6898i.a g() {
            java.lang.String str = android.os.Build.CPU_ABI;
            if (android.text.TextUtils.isEmpty(str)) {
                p076h5.g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            p106k5.AbstractC6898i.a aVar = (p106k5.AbstractC6898i.a) f49631M.get(str.toLowerCase(java.util.Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static p106k5.AbstractC6898i.a valueOf(java.lang.String str) {
            return (p106k5.AbstractC6898i.a) java.lang.Enum.valueOf(p106k5.AbstractC6898i.a.class, str);
        }

        public static p106k5.AbstractC6898i.a[] values() {
            return (p106k5.AbstractC6898i.a[]) f49632N.clone();
        }
    }

    public static java.lang.String A(java.io.InputStream inputStream) {
        java.util.Scanner scannerUseDelimiter = new java.util.Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static long a(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(android.content.Context context) {
        android.app.ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long c(java.lang.String str) {
        android.os.StatFs statFs = new android.os.StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean d(android.content.Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(java.io.Closeable closeable, java.lang.String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e6) {
                p076h5.g.f().e(str, e6);
            }
        }
    }

    public static void g(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e6) {
                throw e6;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static java.lang.String h(java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(java.util.Locale.US));
            }
        }
        java.util.Collections.sort(arrayList);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
        }
        java.lang.String string = sb.toString();
        if (string.length() > 0) {
            return z(string);
        }
        return null;
    }

    public static boolean i(android.content.Context context, java.lang.String str, boolean z6) {
        android.content.res.Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iP = p(context, str, "bool");
            if (iP > 0) {
                return resources.getBoolean(iP);
            }
            int iP2 = p(context, str, "string");
            if (iP2 > 0) {
                return java.lang.Boolean.parseBoolean(context.getString(iP2));
            }
        }
        return z6;
    }

    public static java.util.List j(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iP = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iP2 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iP3 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iP == 0 || iP2 == 0 || iP3 == 0) {
            p076h5.g.f().b(java.lang.String.format("Could not find resources: %d %d %d", java.lang.Integer.valueOf(iP), java.lang.Integer.valueOf(iP2), java.lang.Integer.valueOf(iP3)));
            return arrayList;
        }
        java.lang.String[] stringArray = context.getResources().getStringArray(iP);
        java.lang.String[] stringArray2 = context.getResources().getStringArray(iP2);
        java.lang.String[] stringArray3 = context.getResources().getStringArray(iP3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            p076h5.g.f().b(java.lang.String.format("Lengths did not match: %d %d %d", java.lang.Integer.valueOf(stringArray.length), java.lang.Integer.valueOf(stringArray2.length), java.lang.Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i6 = 0; i6 < stringArray3.length; i6++) {
            arrayList.add(new p106k5.C6895f(stringArray[i6], stringArray2[i6], stringArray3[i6]));
        }
        return arrayList;
    }

    public static int k() {
        return p106k5.AbstractC6898i.a.g().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean zW = w();
        ?? r6 = zW;
        if (x()) {
            r6 = (zW ? 1 : 0) | 2;
        }
        return v() ? r6 | 4 : r6;
    }

    public static java.lang.String m(android.content.Context context) {
        int iP = p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iP == 0) {
            iP = p(context, "com.crashlytics.android.build_id", "string");
        }
        if (iP != 0) {
            return context.getResources().getString(iP);
        }
        return null;
    }

    public static boolean n(android.content.Context context) {
        return (w() || ((android.hardware.SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static java.lang.String o(android.content.Context context) {
        int i6 = context.getApplicationContext().getApplicationInfo().icon;
        if (i6 > 0) {
            try {
                java.lang.String resourcePackageName = context.getResources().getResourcePackageName(i6);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (android.content.res.Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    public static int p(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static android.content.SharedPreferences q(android.content.Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static java.lang.String r(java.lang.String str, java.lang.String str2) {
        return s(str.getBytes(), str2);
    }

    private static java.lang.String s(byte[] bArr, java.lang.String str) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return t(messageDigest.digest());
        } catch (java.security.NoSuchAlgorithmException e6) {
            p076h5.g.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e6);
            return "";
        }
    }

    public static java.lang.String t(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            int i10 = i6 * 2;
            char[] cArr2 = f49620a;
            cArr[i10] = cArr2[(b6 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b6 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static boolean u(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean v() {
        return android.os.Debug.isDebuggerConnected() || android.os.Debug.waitingForDebugger();
    }

    public static boolean w() {
        if (!android.os.Build.PRODUCT.contains("sdk")) {
            java.lang.String str = android.os.Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean x() {
        boolean zW = w();
        java.lang.String str = android.os.Build.TAGS;
        if ((zW || str == null || !str.contains("test-keys")) && !new java.io.File("/system/app/Superuser.apk").exists()) {
            return !zW && new java.io.File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean y(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static java.lang.String z(java.lang.String str) {
        return r(str, "SHA-1");
    }
}
