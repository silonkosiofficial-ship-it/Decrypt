.class public final Lk9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/s;


# instance fields
.field private final a:Lk9/o;

.field private final b:Z

.field private final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lk9/o;Z)V
    .locals 1

    .prologue
    const-string v0, "format"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/z;->a:Lk9/o;

    iput-boolean p2, p0, Lk9/z;->b:Z

    invoke-static {p1}, Lk9/p;->a(Lk9/o;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/l;

    invoke-interface {v0}, Lk9/l;->c()Lk9/n;

    move-result-object v0

    invoke-interface {v0}, Lk9/n;->c()Lk9/m;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lk9/z;->c:Ljava/util/Set;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Signed format must contain at least one field with a sign"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic c(Lk9/z;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lk9/z;->e(Lk9/z;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lk9/z;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lk9/z;->c:Ljava/util/Set;

    return-object p0
.end method

.method private static final e(Lk9/z;Ljava/lang/Object;)Z
    .locals 5

    .prologue
    iget-object p0, p0, Lk9/z;->c:Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk9/m;

    invoke-interface {v2}, Lk9/m;->c()Lk9/b;

    move-result-object v3

    invoke-interface {v3, p1}, Lk9/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2, p1}, Lk9/m;->a(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_2
    return v1
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 4

    iget-object v0, p0, Lk9/z;->a:Lk9/o;

    invoke-interface {v0}, Lk9/o;->a()Ll9/e;

    move-result-object v0

    new-instance v1, Ll9/g;

    new-instance v2, Lk9/z$a;

    invoke-direct {v2, p0}, Lk9/z$a;-><init>(Lk9/z;)V

    iget-boolean v3, p0, Lk9/z;->b:Z

    invoke-direct {v1, v0, v2, v3}, Ll9/g;-><init>(Ll9/e;Lx7/l;Z)V

    return-object v1
.end method

.method public b()Lm9/q;
    .locals 6

    new-instance v0, Lm9/q;

    new-instance v1, Lm9/t;

    new-instance v2, Lk9/z$b;

    invoke-direct {v2, p0}, Lk9/z$b;-><init>(Lk9/z;)V

    iget-boolean v3, p0, Lk9/z;->b:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sign for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lk9/z;->c:Ljava/util/Set;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lm9/t;-><init>(Lx7/p;ZLjava/lang/String;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    iget-object v1, p0, Lk9/z;->a:Lk9/o;

    invoke-interface {v1}, Lk9/o;->b()Lm9/q;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lm9/q;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm9/n;->b(Ljava/util/List;)Lm9/q;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lk9/z;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/z;->a:Lk9/o;

    check-cast p1, Lk9/z;

    iget-object v1, p1, Lk9/z;->a:Lk9/o;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lk9/z;->b:Z

    iget-boolean p1, p1, Lk9/z;->b:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Lk9/o;
    .locals 1

    iget-object v0, p0, Lk9/z;->a:Lk9/o;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lk9/z;->a:Lk9/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lk9/z;->b:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SignedFormatStructure("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk9/z;->a:Lk9/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
