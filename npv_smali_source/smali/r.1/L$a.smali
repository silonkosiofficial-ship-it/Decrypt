.class final Lr/L$a;
.super Lr/W$a;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Lz7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic D:Lr/L;


# direct methods
.method public constructor <init>(Lr/L;)V
    .locals 0

    iput-object p1, p0, Lr/L$a;->D:Lr/L;

    invoke-direct {p0, p1}, Lr/W$a;-><init>(Lr/W;)V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {v0, p1}, Lr/L;->h(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr/L$a;->D:Lr/L;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {v0, p1}, Lr/L;->i(Ljava/lang/Iterable;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {v0}, Lr/L;->m()V

    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lr/L$a$a;

    iget-object v1, p0, Lr/L$a;->D:Lr/L;

    invoke-direct {v0, v1}, Lr/L$a$a;-><init>(Lr/L;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {v0, p1}, Lr/L;->x(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 3

    .prologue
    const-string v0, "elements"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {v0}, Lr/W;->c()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {v2, v1}, Lr/L;->t(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr/L$a;->D:Lr/L;

    invoke-virtual {p1}, Lr/W;->c()I

    move-result p1

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 17

    .prologue
    move-object/from16 v0, p1

    const-string v1, "elements"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lr/L$a;->D:Lr/L;

    iget-object v3, v2, Lr/W;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    const/4 v5, 0x0

    if-ltz v4, :cond_4

    move v6, v5

    move v7, v6

    :goto_0
    aget-wide v8, v3, v6

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v6, v4

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v5

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v6, 0x3

    add-int/2addr v13, v12

    iget-object v14, v2, Lr/W;->b:[Ljava/lang/Object;

    aget-object v14, v14, v13

    invoke-interface {v0, v14}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_0

    invoke-virtual {v2, v13}, Lr/L;->y(I)V

    const/4 v7, 0x1

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_5

    :cond_2
    if-eq v6, v4, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move v5, v7

    :cond_4
    move v7, v5

    :cond_5
    return v7
.end method
