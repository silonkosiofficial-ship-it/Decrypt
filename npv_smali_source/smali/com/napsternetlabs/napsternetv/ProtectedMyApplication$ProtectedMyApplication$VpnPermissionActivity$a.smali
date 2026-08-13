.class public Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Beyxd(Ljava/lang/Class;Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredAnnotationsByType(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->E(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static E(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v1, p1, v0

    invoke-static {p0, v1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->j(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public static Im(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->E(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;
    .locals 4

    .prologue
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$VpnPermissionActivity$a;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v3

    aput-object v3, v1, v2

    new-instance v2, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MyApplication$a$c;

    invoke-direct {v2, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$MyApplication$a$c;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/annotation/Annotation;

    return-object v0

    :cond_0
    return-object p1
.end method

.method public static qdg(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->E(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static vl(Ljava/lang/Class;Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getAnnotationsByType(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->E(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static wuzl(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->j(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method

.method public static ytikc(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->j(Ljava/lang/Class;Ljava/lang/annotation/Annotation;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    return-object p0
.end method
