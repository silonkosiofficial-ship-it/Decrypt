package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ow0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4743ow0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f37887a;

    static {
        char[] cArr = new char[80];
        f37887a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String a(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC4523mw0, sb, 0);
        return sb.toString();
    }

    static void b(java.lang.StringBuilder sb, int i6, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i6, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i6, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (java.lang.Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.ads.Jw0.a(com.google.android.gms.internal.ads.AbstractC3753fv0.U((java.lang.String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.AbstractC3753fv0) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.ads.Jw0.a((com.google.android.gms.internal.ads.AbstractC3753fv0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.Jv0) {
            sb.append(" {");
            d((com.google.android.gms.internal.ads.Jv0) obj, sb, i6 + 2);
            sb.append("\n");
            c(i6, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i11 = i6 + 2;
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        b(sb, i11, "key", entry.getKey());
        b(sb, i11, "value", entry.getValue());
        sb.append("\n");
        c(i6, sb);
        sb.append("}");
    }

    private static void c(int i6, java.lang.StringBuilder sb) {
        while (i6 > 0) {
            int i10 = 80;
            if (i6 <= 80) {
                i10 = i6;
            }
            sb.append(f37887a, 0, i10);
            i6 -= i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    private static void d(com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, java.lang.StringBuilder sb, int i6) {
        int i10;
        java.lang.Object obj;
        java.lang.reflect.Method method;
        java.lang.String strSubstring;
        java.lang.Object objZ;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = interfaceC4523mw0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i11];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring2 = ((java.lang.String) entry.getKey()).substring(i10);
            if (!strSubstring2.endsWith("List") || strSubstring2.endsWith("OrBuilderList") || strSubstring2.equals("List") || (method2 = (java.lang.reflect.Method) entry.getValue()) == null || !method2.getReturnType().equals(java.util.List.class)) {
                if (strSubstring2.endsWith("Map") && !strSubstring2.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                    strSubstring = strSubstring2.substring(0, strSubstring2.length() - 3);
                    objZ = com.google.android.gms.internal.ads.Jv0.z(method, interfaceC4523mw0, new java.lang.Object[0]);
                } else if (hashSet.contains("set".concat(strSubstring2)) && (!strSubstring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 5)))))) {
                    java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                    java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strSubstring2));
                    if (method4 != null) {
                        java.lang.Object objZ2 = com.google.android.gms.internal.ads.Jv0.z(method4, interfaceC4523mw0, new java.lang.Object[0]);
                        if (method5 == null) {
                            if (objZ2 instanceof java.lang.Boolean) {
                                if (((java.lang.Boolean) objZ2).booleanValue()) {
                                    b(sb, i6, strSubstring2, objZ2);
                                }
                            } else if (objZ2 instanceof java.lang.Integer) {
                                if (((java.lang.Integer) objZ2).intValue() != 0) {
                                    b(sb, i6, strSubstring2, objZ2);
                                }
                            } else if (objZ2 instanceof java.lang.Float) {
                                if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objZ2).floatValue()) != 0) {
                                    b(sb, i6, strSubstring2, objZ2);
                                }
                            } else if (!(objZ2 instanceof java.lang.Double)) {
                                if (objZ2 instanceof java.lang.String) {
                                    obj = "";
                                } else if (objZ2 instanceof com.google.android.gms.internal.ads.AbstractC3753fv0) {
                                    obj = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
                                } else if (objZ2 instanceof com.google.android.gms.internal.ads.InterfaceC4523mw0) {
                                    if (objZ2 != ((com.google.android.gms.internal.ads.InterfaceC4523mw0) objZ2).a()) {
                                        b(sb, i6, strSubstring2, objZ2);
                                    }
                                } else if (!(objZ2 instanceof java.lang.Enum) || ((java.lang.Enum) objZ2).ordinal() != 0) {
                                    b(sb, i6, strSubstring2, objZ2);
                                }
                                if (!objZ2.equals(obj)) {
                                    b(sb, i6, strSubstring2, objZ2);
                                }
                            } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objZ2).doubleValue()) != 0) {
                                b(sb, i6, strSubstring2, objZ2);
                            }
                        } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.Jv0.z(method5, interfaceC4523mw0, new java.lang.Object[0])).booleanValue()) {
                            b(sb, i6, strSubstring2, objZ2);
                        }
                    }
                }
                i10 = 3;
            } else {
                strSubstring = strSubstring2.substring(0, strSubstring2.length() - 4);
                objZ = com.google.android.gms.internal.ads.Jv0.z(method2, interfaceC4523mw0, new java.lang.Object[0]);
            }
            b(sb, i6, strSubstring, objZ);
            i10 = 3;
        }
        com.google.android.gms.internal.ads.Mw0 mw0 = ((com.google.android.gms.internal.ads.Jv0) interfaceC4523mw0).zzt;
        if (mw0 != null) {
            mw0.i(sb, i6);
        }
    }
}
