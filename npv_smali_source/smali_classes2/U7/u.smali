.class public final LU7/u;
.super LU7/t;
.source "SourceFile"

# interfaces
.implements Le8/r;


# instance fields
.field private final a:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/t;-><init>()V

    iput-object p1, p0, LU7/u;->a:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public R()Z
    .locals 1

    .prologue
    invoke-interface {p0}, Le8/r;->v()Le8/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic Y()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method

.method public a0()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, LU7/u;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public b0()LU7/z;
    .locals 3

    sget-object v0, LU7/z;->a:LU7/z$a;

    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericReturnType(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 6

    .prologue
    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    new-instance v5, LU7/A;

    invoke-direct {v5, v4}, LU7/A;-><init>(Ljava/lang/reflect/TypeVariable;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic l()Le8/x;
    .locals 1

    invoke-virtual {p0}, LU7/u;->b0()LU7/z;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericParameterTypes(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v1

    const-string v2, "getParameterAnnotations(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [[Ljava/lang/annotation/Annotation;

    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->isVarArgs()Z

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, LU7/t;->Z([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public v()Le8/b;
    .locals 3

    .prologue
    invoke-virtual {p0}, LU7/u;->a0()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, LU7/f;->b:LU7/f$a;

    invoke-virtual {v2, v0, v1}, LU7/f$a;->a(Ljava/lang/Object;Ln8/f;)LU7/f;

    move-result-object v1

    :cond_0
    return-object v1
.end method
