.class final LV/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/Y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:Lr/L;

.field private final f:Ljava/util/List;

.field private final g:Lr/B;

.field private final h:Lr/B;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/u$a;->a:Ljava/util/Set;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/u$a;->b:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/u$a;->c:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/u$a;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/u$a;->f:Ljava/util/List;

    new-instance p1, Lr/B;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lr/B;-><init>(IILy7/k;)V

    iput-object p1, p0, LV/u$a;->g:Lr/B;

    new-instance p1, Lr/B;

    invoke-direct {p1, v0, v1, v2}, Lr/B;-><init>(IILy7/k;)V

    iput-object p1, p0, LV/u$a;->h:Lr/B;

    return-void
.end method

.method private final i(I)V
    .locals 11

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, LV/u$a;->f:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v1

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    move v3, v0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    :goto_0
    iget-object v7, p0, LV/u$a;->h:Lr/B;

    invoke-virtual {v7}, Lr/l;->b()I

    move-result v7

    const-string v8, "null cannot be cast to non-null type androidx.collection.MutableIntList"

    if-ge v3, v7, :cond_2

    iget-object v7, p0, LV/u$a;->h:Lr/B;

    invoke-virtual {v7, v3}, Lr/l;->a(I)I

    move-result v7

    if-gt p1, v7, :cond_1

    iget-object v7, p0, LV/u$a;->f:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v9, p0, LV/u$a;->h:Lr/B;

    invoke-virtual {v9, v3}, Lr/B;->l(I)I

    move-result v9

    iget-object v10, p0, LV/u$a;->g:Lr/B;

    invoke-virtual {v10, v3}, Lr/B;->l(I)I

    move-result v10

    if-nez v4, :cond_0

    new-array v4, v1, [Ljava/lang/Object;

    aput-object v7, v4, v0

    invoke-static {v4}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lr/B;

    invoke-direct {v6, v0, v1, v2}, Lr/B;-><init>(IILy7/k;)V

    invoke-virtual {v6, v9}, Lr/B;->g(I)Z

    new-instance v5, Lr/B;

    invoke-direct {v5, v0, v1, v2}, Lr/B;-><init>(IILy7/k;)V

    :goto_1
    invoke-virtual {v5, v10}, Lr/B;->g(I)Z

    goto :goto_0

    :cond_0
    invoke-static {v5, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v9}, Lr/B;->g(I)Z

    goto :goto_1

    :cond_1
    add-int/2addr v3, v1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_7

    invoke-static {v5, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v1

    :goto_2
    if-ge v0, p1, :cond_6

    add-int/lit8 v2, v0, 0x1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    move v7, v2

    :goto_3
    if-ge v7, v3, :cond_5

    invoke-virtual {v6, v0}, Lr/l;->a(I)I

    move-result v8

    invoke-virtual {v6, v7}, Lr/l;->a(I)I

    move-result v9

    if-lt v8, v9, :cond_3

    if-ne v9, v8, :cond_4

    invoke-virtual {v5, v0}, Lr/l;->a(I)I

    move-result v8

    invoke-virtual {v5, v7}, Lr/l;->a(I)I

    move-result v9

    if-ge v8, v9, :cond_4

    :cond_3
    invoke-static {v4, v0, v7}, LV/v;->d(Ljava/util/List;II)V

    invoke-static {v5, v0, v7}, LV/v;->e(Lr/B;II)V

    invoke-static {v6, v0, v7}, LV/v;->e(Lr/B;II)V

    :cond_4
    add-int/2addr v7, v1

    goto :goto_3

    :cond_5
    move v0, v2

    goto :goto_2

    :cond_6
    iget-object p1, p0, LV/u$a;->c:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {p1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_7
    return-void
.end method

.method private final j(Ljava/lang/Object;III)V
    .locals 0

    .prologue
    invoke-direct {p0, p2}, LV/u$a;->i(I)V

    if-ltz p4, :cond_0

    if-ge p4, p2, :cond_0

    iget-object p2, p0, LV/u$a;->f:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LV/u$a;->g:Lr/B;

    invoke-virtual {p1, p3}, Lr/B;->g(I)Z

    iget-object p1, p0, LV/u$a;->h:Lr/B;

    invoke-virtual {p1, p4}, Lr/B;->g(I)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, LV/u$a;->c:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public a(LV/Z0;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LV/u$a;->j(Ljava/lang/Object;III)V

    return-void
.end method

.method public b(LV/l;III)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/u$a;->e:Lr/L;

    if-nez v0, :cond_0

    invoke-static {}, Lr/X;->a()Lr/L;

    move-result-object v0

    iput-object v0, p0, LV/u$a;->e:Lr/L;

    :cond_0
    invoke-virtual {v0, p1}, Lr/L;->v(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3, p4}, LV/u$a;->j(Ljava/lang/Object;III)V

    return-void
.end method

.method public c(LV/l;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LV/u$a;->j(Ljava/lang/Object;III)V

    return-void
.end method

.method public d(LV/Z0;)V
    .locals 1

    iget-object v0, p0, LV/u$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Lx7/a;)V
    .locals 1

    iget-object v0, p0, LV/u$a;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 3

    .prologue
    iget-object v0, p0, LV/u$a;->a:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-string v0, "Compose:abandons"

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LV/u$a;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/Z0;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-interface {v2}, LV/Z0;->b()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->b(Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v0}, LV/K1;->b(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_2
    return-void
.end method

.method public final g()V
    .locals 6

    .prologue
    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    invoke-direct {p0, v1}, LV/u$a;->i(I)V

    iget-object v1, p0, LV/u$a;->c:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_4

    const-string v1, "Compose:onForgotten"

    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v1}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, LV/u$a;->e:Lr/L;

    iget-object v3, p0, LV/u$a;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ge v0, v3, :cond_3

    iget-object v4, p0, LV/u$a;->c:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, LV/Z0;

    if-eqz v5, :cond_0

    iget-object v5, p0, LV/u$a;->a:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-object v5, v4

    check-cast v5, LV/Z0;

    invoke-interface {v5}, LV/Z0;->c()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_1
    instance-of v5, v4, LV/l;

    if-eqz v5, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v4}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    check-cast v4, LV/l;

    invoke-interface {v4}, LV/l;->f()V

    goto :goto_2

    :cond_1
    check-cast v4, LV/l;

    invoke-interface {v4}, LV/l;->i()V

    :cond_2
    :goto_2
    add-int/2addr v3, v0

    goto :goto_0

    :cond_3
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, LV/K1;->a:LV/K1;

    invoke-virtual {v0, v1}, LV/K1;->b(Ljava/lang/Object;)V

    goto :goto_4

    :goto_3
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v1}, LV/K1;->b(Ljava/lang/Object;)V

    throw v0

    :cond_4
    :goto_4
    iget-object v0, p0, LV/u$a;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_6

    const-string v0, "Compose:onRemembered"

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    :try_start_1
    iget-object v1, p0, LV/u$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_5
    if-ge v3, v2, :cond_5

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/Z0;

    iget-object v5, p0, LV/u$a;->a:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v4}, LV/Z0;->d()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catchall_1
    move-exception v1

    goto :goto_6

    :cond_5
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->b(Ljava/lang/Object;)V

    goto :goto_7

    :goto_6
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v0}, LV/K1;->b(Ljava/lang/Object;)V

    throw v1

    :cond_6
    :goto_7
    return-void
.end method

.method public final h()V
    .locals 5

    .prologue
    iget-object v0, p0, LV/u$a;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-string v0, "Compose:sideeffects"

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, LV/u$a;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx7/a;

    invoke-interface {v4}, Lx7/a;->b()Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, LV/u$a;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v0}, LV/K1;->b(Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v0}, LV/K1;->b(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_2
    return-void
.end method
