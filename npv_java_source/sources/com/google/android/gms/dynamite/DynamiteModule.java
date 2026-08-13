package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static java.lang.Boolean f24973h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static java.lang.String f24974i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f24975j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f24976k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static java.lang.Boolean f24977l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static com.google.android.gms.dynamite.m f24982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static com.google.android.gms.dynamite.n f24983r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f24984a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.ThreadLocal f24978m = new java.lang.ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final java.lang.ThreadLocal f24979n = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.dynamite.DynamiteModule.b.a f24980o = new com.google.android.gms.dynamite.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24967b = new com.google.android.gms.dynamite.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24968c = new com.google.android.gms.dynamite.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24969d = new com.google.android.gms.dynamite.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24970e = new com.google.android.gms.dynamite.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24971f = new com.google.android.gms.dynamite.h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24972g = new com.google.android.gms.dynamite.i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.dynamite.DynamiteModule.b f24981p = new com.google.android.gms.dynamite.j();

    @com.google.android.gms.common.util.DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    public static class a extends java.lang.Exception {
        /* synthetic */ a(java.lang.String str, Y3.f fVar) {
            super(str);
        }

        /* synthetic */ a(java.lang.String str, java.lang.Throwable th, Y3.f fVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(android.content.Context context, java.lang.String str, boolean z6);

            int b(android.content.Context context, java.lang.String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0471b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24985a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f24986b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f24987c = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.b.C0471b a(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.b.a aVar);
    }

    private DynamiteModule(android.content.Context context) {
        Q3.AbstractC1477p.l(context);
        this.f24984a = context;
    }

    public static int a(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Q3.AbstractC1475n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String str2 = "Module descriptor id '" + java.lang.String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'";
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.String str3 = "Local module descriptor class for " + str + " not found.";
            return 0;
        } catch (java.lang.Exception e6) {
            "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e6.getMessage()));
            return 0;
        }
    }

    public static int c(android.content.Context context, java.lang.String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0218: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:116:0x0218 */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.b bVar, java.lang.String str) throws java.lang.Throwable {
        com.google.android.gms.dynamite.k kVar;
        int i6;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModuleH;
        X3.a aVarF3;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        com.google.android.gms.dynamite.n nVar;
        boolean z6;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.a("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = f24978m;
        com.google.android.gms.dynamite.k kVar2 = (com.google.android.gms.dynamite.k) threadLocal.get();
        com.google.android.gms.dynamite.k kVar3 = new com.google.android.gms.dynamite.k(null);
        threadLocal.set(kVar3);
        java.lang.ThreadLocal threadLocal2 = f24979n;
        java.lang.Long l6 = (java.lang.Long) threadLocal2.get();
        long jLongValue = l6.longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            com.google.android.gms.dynamite.DynamiteModule.b.C0471b c0471bA = bVar.a(context, str, f24980o);
            java.lang.String str2 = "Considering local module " + str + ":" + c0471bA.f24985a + " and remote module " + str + ":" + c0471bA.f24986b;
            int i10 = c0471bA.f24987c;
            if (i10 != 0) {
                if (i10 == -1) {
                    if (c0471bA.f24985a != 0) {
                        i10 = -1;
                    }
                }
                if (i10 != 1 || c0471bA.f24986b != 0) {
                    if (i10 == -1) {
                        dynamiteModuleH = h(applicationContext, str);
                        kVar2 = kVar2;
                    } else {
                        try {
                            if (i10 != 1) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.a("VersionPolicy returned invalid code:" + i10, null);
                            }
                            try {
                                try {
                                    int i11 = c0471bA.f24986b;
                                    try {
                                        try {
                                            try {
                                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                    try {
                                                        if (!k(context)) {
                                                            throw new com.google.android.gms.dynamite.DynamiteModule.a("Remote loading disabled", null);
                                                        }
                                                        java.lang.Boolean bool = f24973h;
                                                        if (bool == null) {
                                                            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to determine which loading route to use.", null);
                                                        }
                                                        if (bool.booleanValue()) {
                                                            java.lang.String str3 = "Selected remote version of " + str + ", version >= " + i11;
                                                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                                try {
                                                                    nVar = f24983r;
                                                                } catch (java.lang.Throwable th) {
                                                                    th = th;
                                                                    while (true) {
                                                                        try {
                                                                            throw th;
                                                                        } catch (java.lang.Throwable th2) {
                                                                            th = th2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (nVar == null) {
                                                                throw new com.google.android.gms.dynamite.DynamiteModule.a("DynamiteLoaderV2 was not cached.", null);
                                                            }
                                                            com.google.android.gms.dynamite.k kVar4 = (com.google.android.gms.dynamite.k) threadLocal.get();
                                                            if (kVar4 == null || kVar4.f24988a == null) {
                                                                throw new com.google.android.gms.dynamite.DynamiteModule.a("No result cursor", null);
                                                            }
                                                            android.content.Context applicationContext2 = context.getApplicationContext();
                                                            android.database.Cursor cursor = kVar4.f24988a;
                                                            X3.b.c2(null);
                                                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                                z6 = f24976k >= 2;
                                                            }
                                                            android.content.Context context2 = (android.content.Context) X3.b.L0(z6 ? nVar.c2(X3.b.c2(applicationContext2), str, i11, X3.b.c2(cursor)) : nVar.L0(X3.b.c2(applicationContext2), str, i11, X3.b.c2(cursor)));
                                                            if (context2 == null) {
                                                                throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to get module context", null);
                                                            }
                                                            dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule(context2);
                                                        } else {
                                                            java.lang.String str4 = "Selected remote version of " + str + ", version >= " + i11;
                                                            com.google.android.gms.dynamite.m mVarL = l(context);
                                                            if (mVarL == null) {
                                                                throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to create IDynamiteLoader.", null);
                                                            }
                                                            int iD = mVarL.d();
                                                            if (iD >= 3) {
                                                                com.google.android.gms.dynamite.k kVar5 = (com.google.android.gms.dynamite.k) threadLocal.get();
                                                                if (kVar5 == null) {
                                                                    throw new com.google.android.gms.dynamite.DynamiteModule.a("No cached result cursor holder", null);
                                                                }
                                                                aVarF3 = mVarL.T2(X3.b.c2(context), str, i11, X3.b.c2(kVar5.f24988a));
                                                            } else {
                                                                aVarF3 = iD == 2 ? mVarL.f3(X3.b.c2(context), str, i11) : mVarL.d2(X3.b.c2(context), str, i11);
                                                            }
                                                            java.lang.Object objL0 = X3.b.L0(aVarF3);
                                                            if (objL0 == null) {
                                                                throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", null);
                                                            }
                                                            dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) objL0);
                                                        }
                                                        dynamiteModuleH = dynamiteModule;
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (android.os.RemoteException e6) {
                                            e = e6;
                                            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", e, null);
                                        } catch (com.google.android.gms.dynamite.DynamiteModule.a e10) {
                                            throw e10;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                            V3.h.a(context, th);
                                            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", th, null);
                                        }
                                    } catch (android.os.RemoteException e11) {
                                        e = e11;
                                        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", e, null);
                                    } catch (com.google.android.gms.dynamite.DynamiteModule.a e12) {
                                        throw e12;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        V3.h.a(context, th);
                                        throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to load remote module.", th, null);
                                    }
                                } catch (com.google.android.gms.dynamite.DynamiteModule.a e13) {
                                    e = e13;
                                    java.lang.String str5 = "Failed to load remote module: " + e.getMessage();
                                    i6 = c0471bA.f24985a;
                                    if (i6 != 0 || bVar.a(context, str, new com.google.android.gms.dynamite.l(i6, 0)).f24987c != -1) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.a("Remote load failed. No local fallback found.", e, null);
                                    }
                                    dynamiteModuleH = h(applicationContext, str);
                                }
                            } catch (com.google.android.gms.dynamite.DynamiteModule.a e14) {
                                e = e14;
                                kVar2 = kVar2;
                                java.lang.String str6 = "Failed to load remote module: " + e.getMessage();
                                i6 = c0471bA.f24985a;
                                if (i6 != 0) {
                                }
                                throw new com.google.android.gms.dynamite.DynamiteModule.a("Remote load failed. No local fallback found.", e, null);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                if (jLongValue == 0) {
                                    f24979n.remove();
                                } else {
                                    f24979n.set(l6);
                                }
                                android.database.Cursor cursor2 = kVar3.f24988a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                f24978m.set(kVar2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            kVar2 = kVar;
                        }
                    }
                    if (jLongValue == 0) {
                        f24979n.remove();
                    } else {
                        f24979n.set(l6);
                    }
                    android.database.Cursor cursor3 = kVar3.f24988a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f24978m.set(kVar2);
                    return dynamiteModuleH;
                }
            }
            throw new com.google.android.gms.dynamite.DynamiteModule.a("No acceptable module " + str + " found. Local version is " + c0471bA.f24985a + " and remote version is " + c0471bA.f24986b + ".", null);
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x016f A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00e7, blocks: (B:3:0x0002, B:64:0x00dc, B:66:0x00e2, B:73:0x0104, B:101:0x0163, B:105:0x016f, B:123:0x01bb, B:124:0x01be, B:118:0x01b3, B:71:0x00eb, B:126:0x01c0, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00d9, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00b9, B:63:0x00db, B:61:0x00bf), top: B:134:0x0002, inners: #0, #6 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b6, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00ad, B:17:0x003e), top: B:141:0x0026, inners: #1 }] */
    public static int f(android.content.Context context, java.lang.String str, boolean z6) {
        java.lang.Throwable th;
        android.os.RemoteException e6;
        android.database.Cursor cursor;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = f24973h;
                android.database.Cursor cursor2 = null;
                int iC2 = 0;
                if (bool == null) {
                    try {
                        java.lang.reflect.Field declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                            if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                bool = java.lang.Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    i(classLoader);
                                } catch (com.google.android.gms.dynamite.DynamiteModule.a unused) {
                                }
                                bool = java.lang.Boolean.TRUE;
                            } else {
                                if (!k(context)) {
                                    return 0;
                                }
                                if (f24975j) {
                                    declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                } else {
                                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                    } else {
                                        try {
                                            int iG = g(context, str, z6, true);
                                            java.lang.String str2 = f24974i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                java.lang.ClassLoader classLoaderA = Y3.d.a();
                                                if (classLoaderA == null) {
                                                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                        Y3.b.a();
                                                        java.lang.String str3 = f24974i;
                                                        Q3.AbstractC1477p.l(str3);
                                                        classLoaderA = Y3.a.a(str3, java.lang.ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        java.lang.String str4 = f24974i;
                                                        Q3.AbstractC1477p.l(str4);
                                                        classLoaderA = new com.google.android.gms.dynamite.a(str4, java.lang.ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                i(classLoaderA);
                                                declaredField.set(null, classLoaderA);
                                                f24973h = bool2;
                                                return iG;
                                            }
                                            return iG;
                                        } catch (com.google.android.gms.dynamite.DynamiteModule.a unused2) {
                                            declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                bool = java.lang.Boolean.FALSE;
                            }
                            f24973h = bool;
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e10) {
                        java.lang.String str5 = "Failed to load module via V2: " + e10.toString();
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z6, false);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.a e11) {
                        java.lang.String str6 = "Failed to retrieve remote module version: " + e11.getMessage();
                        return 0;
                    }
                }
                com.google.android.gms.dynamite.m mVarL = l(context);
                if (mVarL != null) {
                    try {
                        try {
                            int iD = mVarL.d();
                            if (iD >= 3) {
                                com.google.android.gms.dynamite.k kVar = (com.google.android.gms.dynamite.k) f24978m.get();
                                if (kVar == null || (cursor = kVar.f24988a) == null) {
                                    android.database.Cursor cursor3 = (android.database.Cursor) X3.b.L0(mVarL.p4(X3.b.c2(context), str, z6, ((java.lang.Long) f24979n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i6 = cursor3.getInt(0);
                                                cursor2 = (i6 <= 0 || !j(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iC2 = i6;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (android.os.RemoteException e12) {
                                            e6 = e12;
                                            cursor2 = cursor3;
                                            java.lang.String str7 = "Failed to retrieve remote module version: " + e6.getMessage();
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iC2 = cursor.getInt(0);
                                }
                            } else {
                                iC2 = iD == 2 ? mVarL.c2(X3.b.c2(context), str, z6) : mVarL.L0(X3.b.c2(context), str, z6);
                            }
                        } catch (android.os.RemoteException e13) {
                            e6 = e13;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                return iC2;
            }
        } catch (java.lang.Throwable th4) {
            V3.h.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int g(android.content.Context context, java.lang.String str, boolean z6, boolean z10) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Exception e6;
        ?? r6 = 0;
        ?? r10 = 0;
        ?? r11 = 0;
        ?? r12 = 0;
        try {
            try {
                boolean z11 = true;
                android.database.Cursor cursorQuery = context.getContentResolver().query(new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", java.lang.String.valueOf(((java.lang.Long) f24979n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z12 = false;
                            int i6 = cursorQuery.getInt(0);
                            if (i6 > 0) {
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    try {
                                        f24974i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f24976k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z11 = false;
                                            }
                                            f24975j = z11;
                                            z12 = z11;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (j(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z10 && z12) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.a("forcing fallback to container DynamiteLoader impl", r11 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i6;
                        }
                    } catch (java.lang.Exception e10) {
                        e6 = e10;
                        if (e6 instanceof com.google.android.gms.dynamite.DynamiteModule.a) {
                            throw e6;
                        }
                        throw new com.google.android.gms.dynamite.DynamiteModule.a("V2 version check failed: " + e6.getMessage(), e6, r10 == true ? 1 : 0);
                    }
                }
                throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to connect to dynamite module ContentResolver.", r12 == true ? 1 : 0);
            } catch (java.lang.Throwable th3) {
                th = th3;
                r6 = context;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e11) {
            e6 = e11;
        } catch (java.lang.Throwable th4) {
            th = th4;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule h(android.content.Context context, java.lang.String str) {
        "Selected local version of ".concat(java.lang.String.valueOf(str));
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    private static void i(java.lang.ClassLoader classLoader) throws com.google.android.gms.dynamite.DynamiteModule.a {
        com.google.android.gms.dynamite.n nVar;
        Y3.f fVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.n ? (com.google.android.gms.dynamite.n) iInterfaceQueryLocalInterface : new com.google.android.gms.dynamite.n(iBinder);
            }
            f24983r = nVar;
        } catch (java.lang.ClassNotFoundException e6) {
            e = e6;
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate dynamite loader", e, fVar);
        } catch (java.lang.IllegalAccessException e10) {
            e = e10;
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate dynamite loader", e, fVar);
        } catch (java.lang.InstantiationException e11) {
            e = e11;
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate dynamite loader", e, fVar);
        } catch (java.lang.NoSuchMethodException e12) {
            e = e12;
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate dynamite loader", e, fVar);
        } catch (java.lang.reflect.InvocationTargetException e13) {
            e = e13;
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean j(android.database.Cursor cursor) {
        com.google.android.gms.dynamite.k kVar = (com.google.android.gms.dynamite.k) f24978m.get();
        if (kVar == null || kVar.f24988a != null) {
            return false;
        }
        kVar.f24988a = cursor;
        return true;
    }

    private static boolean k(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f24977l)) {
            return true;
        }
        boolean z6 = false;
        if (f24977l == null) {
            android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (N3.C1395h.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f24977l = java.lang.Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f24975j = true;
            }
        }
        if (!z6) {
        }
        return z6;
    }

    private static com.google.android.gms.dynamite.m l(android.content.Context context) {
        com.google.android.gms.dynamite.m mVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.m mVar2 = f24982q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamite.m ? (com.google.android.gms.dynamite.m) iInterfaceQueryLocalInterface : new com.google.android.gms.dynamite.m(iBinder);
                }
                if (mVar != null) {
                    f24982q = mVar;
                    return mVar;
                }
            } catch (java.lang.Exception e6) {
                java.lang.String str = "Failed to load IDynamiteLoader from GmsCore: " + e6.getMessage();
            }
            return null;
        }
    }

    public android.content.Context b() {
        return this.f24984a;
    }

    public android.os.IBinder d(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.a {
        try {
            return (android.os.IBinder) this.f24984a.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e6) {
            throw new com.google.android.gms.dynamite.DynamiteModule.a("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e6, null);
        }
    }
}
