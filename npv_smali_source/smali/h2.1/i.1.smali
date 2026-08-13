.class final Lh2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh2/j;

.field private final b:Lf9/a;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/j;

    invoke-direct {v0}, Lh2/j;-><init>()V

    iput-object v0, p0, Lh2/i;->a:Lh2/j;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, Lh2/i;->b:Lf9/a;

    const/4 v0, -0x1

    iput v0, p0, Lh2/i;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lh2/x$b;
    .locals 4

    .prologue
    iget-object v0, p0, Lh2/i;->a:Lh2/j;

    invoke-virtual {v0}, Lh2/j;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v2, v0, Lh2/x$b;

    if-eqz v2, :cond_0

    check-cast v0, Lh2/x$b;

    invoke-virtual {v0}, Lh2/x$b;->f()Lh2/t;

    move-result-object v2

    sget-object v3, Lh2/t;->C:Lh2/t;

    if-ne v2, v3, :cond_0

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public final b(Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p1, Lh2/i$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh2/i$a;

    iget v1, v0, Lh2/i$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/i$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/i$a;

    invoke-direct {v0, p0, p1}, Lh2/i$a;-><init>(Lh2/i;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lh2/i$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/i$a;->J:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lh2/i$a;->G:Ljava/lang/Object;

    check-cast v1, Lf9/a;

    iget-object v0, v0, Lh2/i$a;->F:Ljava/lang/Object;

    check-cast v0, Lh2/i;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/i;->b:Lf9/a;

    iput-object p0, v0, Lh2/i$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/i$a;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/i$a;->J:I

    invoke-interface {p1, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    :try_start_0
    iget-object p1, v0, Lh2/i;->a:Lh2/j;

    invoke-virtual {p1}, Lh2/j;->b()Ljava/util/List;

    move-result-object p1

    iget v0, v0, Lh2/i;->c:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/2addr v0, v3

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v3, 0x1

    if-gez v3, :cond_4

    invoke-static {}, Lj7/v;->w()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    :goto_3
    check-cast v5, Lh2/x;

    new-instance v7, Lj7/L;

    add-int/2addr v3, v0

    invoke-direct {v7, v3, v5}, Lj7/L;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v6

    goto :goto_2

    :cond_5
    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    return-object v2

    :goto_4
    invoke-interface {v1, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method

.method public final c(Lj7/L;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/i$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/i$b;

    iget v1, v0, Lh2/i$b;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/i$b;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/i$b;

    invoke-direct {v0, p0, p2}, Lh2/i$b;-><init>(Lh2/i;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/i$b;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/i$b;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/i$b;->H:Ljava/lang/Object;

    check-cast p1, Lf9/a;

    iget-object v1, v0, Lh2/i$b;->G:Ljava/lang/Object;

    check-cast v1, Lj7/L;

    iget-object v0, v0, Lh2/i$b;->F:Ljava/lang/Object;

    check-cast v0, Lh2/i;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/i;->b:Lf9/a;

    iput-object p0, v0, Lh2/i$b;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/i$b;->G:Ljava/lang/Object;

    iput-object p2, v0, Lh2/i$b;->H:Ljava/lang/Object;

    iput v3, v0, Lh2/i$b;->K:I

    invoke-interface {p2, v4, v0}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_0
    invoke-virtual {p1}, Lj7/L;->c()I

    move-result v1

    iput v1, v0, Lh2/i;->c:I

    iget-object v0, v0, Lh2/i;->a:Lh2/j;

    invoke-virtual {p1}, Lj7/L;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/x;

    invoke-virtual {v0, p1}, Lh2/j;->a(Lh2/x;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v4}, Lf9/a;->d(Ljava/lang/Object;)V

    throw p1
.end method
