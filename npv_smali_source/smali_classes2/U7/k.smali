.class public final LU7/k;
.super LU7/z;
.source "SourceFile"

# interfaces
.implements Le8/f;


# instance fields
.field private final b:Ljava/lang/reflect/Type;

.field private final c:LU7/z;

.field private final d:Ljava/util/Collection;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 2

    .prologue
    const-string v0, "reflectType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/z;-><init>()V

    iput-object p1, p0, LU7/k;->b:Ljava/lang/reflect/Type;

    invoke-virtual {p0}, LU7/k;->X()Ljava/lang/reflect/Type;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_0

    sget-object v0, LU7/z;->a:LU7/z$a;

    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p1

    const-string v1, "getGenericComponentType(...)"

    :goto_0
    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LU7/z$a;->a(Ljava/lang/reflect/Type;)LU7/z;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LU7/z;->a:LU7/z$a;

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const-string v1, "getComponentType(...)"

    goto :goto_0

    :goto_1
    iput-object p1, p0, LU7/k;->c:LU7/z;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iput-object p1, p0, LU7/k;->d:Ljava/util/Collection;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not an array type ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/k;->X()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/k;->X()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected X()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LU7/k;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public Y()LU7/z;
    .locals 1

    iget-object v0, p0, LU7/k;->c:LU7/z;

    return-object v0
.end method

.method public k()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LU7/k;->d:Ljava/util/Collection;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, LU7/k;->e:Z

    return v0
.end method

.method public bridge synthetic p()Le8/x;
    .locals 1

    invoke-virtual {p0}, LU7/k;->Y()LU7/z;

    move-result-object v0

    return-object v0
.end method
