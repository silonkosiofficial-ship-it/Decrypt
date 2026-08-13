package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f21944a;

    static {
        char[] cArr = new char[80];
        f21944a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    private static void a(int i6, java.lang.StringBuilder sb) {
        while (i6 > 0) {
            char[] cArr = f21944a;
            int length = i6 > cArr.length ? cArr.length : i6;
            sb.append(cArr, 0, length);
            i6 -= length;
        }
    }

    private static boolean b(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj instanceof java.lang.Boolean) {
            return !((java.lang.Boolean) obj).booleanValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue() == 0;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()) == 0;
        }
        if (obj instanceof java.lang.Double) {
            return java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof java.lang.String) {
            obj2 = "";
        } else {
            if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g)) {
                if (obj instanceof androidx.datastore.preferences.protobuf.O) {
                    return obj == ((androidx.datastore.preferences.protobuf.O) obj).a();
                }
                return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
            }
            obj2 = androidx.datastore.preferences.protobuf.AbstractC2047g.f21988D;
        }
        return obj.equals(obj2);
    }

    private static java.lang.String c(java.lang.String str) {
        if (str.isEmpty()) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        for (int i6 = 1; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if (java.lang.Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    static void d(java.lang.StringBuilder sb, int i6, java.lang.String str, java.lang.Object obj) {
        java.lang.String strA;
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i6, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i6, sb);
        sb.append(c(str));
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            strA = androidx.datastore.preferences.protobuf.j0.c((java.lang.String) obj);
        } else {
            if (!(obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g)) {
                if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2062w) {
                    sb.append(" {");
                    e((androidx.datastore.preferences.protobuf.AbstractC2062w) obj, sb, i6 + 2);
                } else if (!(obj instanceof java.util.Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int i10 = i6 + 2;
                    d(sb, i10, "key", entry.getKey());
                    d(sb, i10, "value", entry.getValue());
                }
                sb.append("\n");
                a(i6, sb);
                sb.append("}");
                return;
            }
            sb.append(": \"");
            strA = androidx.datastore.preferences.protobuf.j0.a((androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
        }
        sb.append(strA);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0172, please report this as an issue */
    private static void e(androidx.datastore.preferences.protobuf.O o6, java.lang.StringBuilder sb, int i6) {
        int i10;
        int i11;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.Object objY;
        boolean zBooleanValue;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = o6.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i12];
            if (!java.lang.reflect.Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i12++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i10);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (java.lang.reflect.Method) entry.getValue()) == null || !method4.getReturnType().equals(java.util.List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (java.lang.reflect.Method) entry.getValue()) == null || !method3.getReturnType().equals(java.util.Map.class) || method3.isAnnotationPresent(java.lang.Deprecated.class) || !java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    i11 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (java.lang.reflect.Method) entry.getValue();
                                method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                                if (method != null) {
                                    objY = androidx.datastore.preferences.protobuf.AbstractC2062w.y(method, o6, new java.lang.Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = ((java.lang.Boolean) androidx.datastore.preferences.protobuf.AbstractC2062w.y(method2, o6, new java.lang.Object[0])).booleanValue();
                                    } else if (b(objY)) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        d(sb, i6, strSubstring, objY);
                                    }
                                }
                            }
                        } else {
                            method = (java.lang.reflect.Method) entry.getValue();
                            method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objY = androidx.datastore.preferences.protobuf.AbstractC2062w.y(method, o6, new java.lang.Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((java.lang.Boolean) androidx.datastore.preferences.protobuf.AbstractC2062w.y(method2, o6, new java.lang.Object[0])).booleanValue();
                                } else if (b(objY)) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    d(sb, i6, strSubstring, objY);
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    d(sb, i6, strSubstring.substring(0, strSubstring.length() - 3), androidx.datastore.preferences.protobuf.AbstractC2062w.y(method3, o6, new java.lang.Object[0]));
                }
                i10 = i11;
            } else {
                d(sb, i6, strSubstring.substring(0, strSubstring.length() - 4), androidx.datastore.preferences.protobuf.AbstractC2062w.y(method4, o6, new java.lang.Object[0]));
                i10 = 3;
            }
        }
        androidx.datastore.preferences.protobuf.m0 m0Var = ((androidx.datastore.preferences.protobuf.AbstractC2062w) o6).unknownFields;
        if (m0Var != null) {
            m0Var.m(sb, i6);
        }
    }

    static java.lang.String f(androidx.datastore.preferences.protobuf.O o6, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(o6, sb, 0);
        return sb.toString();
    }
}
