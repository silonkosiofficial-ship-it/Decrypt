package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final java.lang.Object a(java.lang.Class cls, java.lang.String str) {
        java.lang.String str2;
        p247y7.AbstractC7350t.f(cls, "klass");
        p247y7.AbstractC7350t.f(str, "suffix");
        java.lang.Package r6 = cls.getPackage();
        java.lang.String name = r6 != null ? r6.getName() : null;
        if (name == null) {
            name = "";
        }
        java.lang.String canonicalName = cls.getCanonicalName();
        p247y7.AbstractC7350t.c(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            p247y7.AbstractC7350t.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        java.lang.String str3 = S8.r.Q(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            java.lang.Class<?> cls2 = java.lang.Class.forName(str2, true, cls.getClassLoader());
            p247y7.AbstractC7350t.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist. Is Room annotation processor correctly configured?", e6);
        } catch (java.lang.IllegalAccessException e10) {
            throw new java.lang.RuntimeException("Cannot access the constructor " + cls.getCanonicalName(), e10);
        } catch (java.lang.InstantiationException e11) {
            throw new java.lang.RuntimeException("Failed to create an instance of " + cls.getCanonicalName(), e11);
        }
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Class cls, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str = "_Impl";
        }
        return a(cls, str);
    }
}
