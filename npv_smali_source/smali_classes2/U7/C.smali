.class public final LU7/C;
.super LU7/z;
.source "SourceFile"

# interfaces
.implements Le8/C;


# instance fields
.field private final b:Ljava/lang/reflect/WildcardType;

.field private final c:Ljava/util/Collection;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/WildcardType;)V
    .locals 1

    const-string v0, "reflectType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/z;-><init>()V

    iput-object p1, p0, LU7/C;->b:Ljava/lang/reflect/WildcardType;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iput-object p1, p0, LU7/C;->c:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public bridge synthetic G()Le8/x;
    .locals 1

    invoke-virtual {p0}, LU7/C;->Y()LU7/z;

    move-result-object v0

    return-object v0
.end method

.method public P()Z
    .locals 2

    invoke-virtual {p0}, LU7/C;->Z()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->Z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge synthetic X()Ljava/lang/reflect/Type;
    .locals 1

    invoke-virtual {p0}, LU7/C;->Z()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    return-object v0
.end method

.method public Y()LU7/z;
    .locals 4

    .prologue
    invoke-virtual {p0}, LU7/C;->Z()Ljava/lang/reflect/WildcardType;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p0}, LU7/C;->Z()Ljava/lang/reflect/WildcardType;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    array-length v2, v0

    const/4 v3, 0x1

    if-gt v2, v3, :cond_2

    array-length v2, v1

    if-gt v2, v3, :cond_2

    array-length v2, v1

    if-ne v2, v3, :cond_0

    sget-object v0, LU7/z;->a:LU7/z$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v1}, Lj7/n;->F0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "single(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object v0

    goto :goto_0

    :cond_0
    array-length v1, v0

    const/4 v2, 0x0

    if-ne v1, v3, :cond_1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, Lj7/n;->F0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, LU7/z;->a:LU7/z$a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wildcard types with many bounds are not yet supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/C;->Z()Ljava/lang/reflect/WildcardType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected Z()Ljava/lang/reflect/WildcardType;
    .locals 1

    iget-object v0, p0, LU7/C;->b:Ljava/lang/reflect/WildcardType;

    return-object v0
.end method

.method public k()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LU7/C;->c:Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, LU7/C;->d:Z

    return v0
.end method
