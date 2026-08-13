package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.emoji2.text.d.b f22249a;

        public a(androidx.emoji2.text.d.b bVar) {
            this.f22249a = bVar == null ? e() : bVar;
        }

        private androidx.emoji2.text.f.c a(android.content.Context context, p242y1.f fVar) {
            if (fVar == null) {
                return null;
            }
            return new androidx.emoji2.text.k(context, fVar);
        }

        private java.util.List b(android.content.pm.Signature[] signatureArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return java.util.Collections.singletonList(arrayList);
        }

        private p242y1.f d(android.content.pm.ProviderInfo providerInfo, android.content.pm.PackageManager packageManager) {
            java.lang.String str = providerInfo.authority;
            java.lang.String str2 = providerInfo.packageName;
            return new p242y1.f(str, str2, "emojicompat-emoji-font", b(this.f22249a.b(packageManager, str2)));
        }

        private static androidx.emoji2.text.d.b e() {
            return android.os.Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.d.C0421d() : new androidx.emoji2.text.d.c();
        }

        private boolean f(android.content.pm.ProviderInfo providerInfo) {
            android.content.pm.ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private android.content.pm.ProviderInfo g(android.content.pm.PackageManager packageManager) {
            java.util.Iterator it = this.f22249a.c(packageManager, new android.content.Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                android.content.pm.ProviderInfo providerInfoA = this.f22249a.a((android.content.pm.ResolveInfo) it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        public androidx.emoji2.text.f.c c(android.content.Context context) {
            return a(context, h(context));
        }

        p242y1.f h(android.content.Context context) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            B1.i.h(packageManager, "Package manager required to locate emoji font provider");
            android.content.pm.ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                return null;
            }
        }
    }

    public static class b {
        public abstract android.content.pm.ProviderInfo a(android.content.pm.ResolveInfo resolveInfo);

        public android.content.pm.Signature[] b(android.content.pm.PackageManager packageManager, java.lang.String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract java.util.List c(android.content.pm.PackageManager packageManager, android.content.Intent intent, int i6);
    }

    public static class c extends androidx.emoji2.text.d.b {
        @Override // androidx.emoji2.text.d.b
        public android.content.pm.ProviderInfo a(android.content.pm.ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.d.b
        public java.util.List c(android.content.pm.PackageManager packageManager, android.content.Intent intent, int i6) {
            return packageManager.queryIntentContentProviders(intent, i6);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0421d extends androidx.emoji2.text.d.c {
        @Override // androidx.emoji2.text.d.b
        public android.content.pm.Signature[] b(android.content.pm.PackageManager packageManager, java.lang.String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static androidx.emoji2.text.k a(android.content.Context context) {
        return (androidx.emoji2.text.k) new androidx.emoji2.text.d.a(null).c(context);
    }
}
