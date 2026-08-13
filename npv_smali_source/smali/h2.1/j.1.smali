.class public final Lh2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/j$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private final c:Lj7/m;

.field private final d:Lh2/w;

.field private e:Lh2/s;

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj7/m;

    invoke-direct {v0}, Lj7/m;-><init>()V

    iput-object v0, p0, Lh2/j;->c:Lj7/m;

    new-instance v0, Lh2/w;

    invoke-direct {v0}, Lh2/w;-><init>()V

    iput-object v0, p0, Lh2/j;->d:Lh2/w;

    return-void
.end method

.method private final c(Lh2/x$b;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lh2/j;->d:Lh2/w;

    invoke-virtual {p1}, Lh2/x$b;->k()Lh2/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh2/w;->b(Lh2/s;)V

    invoke-virtual {p1}, Lh2/x$b;->g()Lh2/s;

    move-result-object v0

    iput-object v0, p0, Lh2/j;->e:Lh2/s;

    invoke-virtual {p1}, Lh2/x$b;->f()Lh2/t;

    move-result-object v0

    sget-object v1, Lh2/j$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lh2/j;->c:Lj7/m;

    invoke-virtual {v0}, Lj7/m;->clear()V

    invoke-virtual {p1}, Lh2/x$b;->i()I

    move-result v0

    iput v0, p0, Lh2/j;->b:I

    invoke-virtual {p1}, Lh2/x$b;->j()I

    move-result v0

    iput v0, p0, Lh2/j;->a:I

    :goto_0
    iget-object v0, p0, Lh2/j;->c:Lj7/m;

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Lj7/m;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lh2/x$b;->i()I

    move-result v0

    iput v0, p0, Lh2/j;->b:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lh2/x$b;->j()I

    move-result v0

    iput v0, p0, Lh2/j;->a:I

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE7/j;->n(II)LE7/g;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lj7/O;

    invoke-virtual {v1}, Lj7/O;->b()I

    move-result v1

    iget-object v2, p0, Lh2/j;->c:Lj7/m;

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Lj7/m;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method private final d(Lh2/x$c;)V
    .locals 2

    iget-object v0, p0, Lh2/j;->d:Lh2/w;

    invoke-virtual {p1}, Lh2/x$c;->d()Lh2/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh2/w;->b(Lh2/s;)V

    invoke-virtual {p1}, Lh2/x$c;->c()Lh2/s;

    move-result-object p1

    iput-object p1, p0, Lh2/j;->e:Lh2/s;

    return-void
.end method

.method private final e(Lh2/x$a;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lh2/j;->d:Lh2/w;

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v1

    sget-object v2, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v2}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v0

    sget-object v1, Lh2/j$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result v0

    iput v0, p0, Lh2/j;->b:I

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result p1

    :goto_0
    if-ge v1, p1, :cond_2

    iget-object v0, p0, Lh2/j;->c:Lj7/m;

    invoke-virtual {v0}, Lj7/m;->T()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Page drop type must be prepend or append"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result v0

    iput v0, p0, Lh2/j;->a:I

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result p1

    :goto_1
    if-ge v1, p1, :cond_2

    iget-object v0, p0, Lh2/j;->c:Lj7/m;

    invoke-virtual {v0}, Lj7/m;->R()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Lh2/x;)V
    .locals 1

    .prologue
    const-string v0, "event"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh2/j;->f:Z

    instance-of v0, p1, Lh2/x$b;

    if-eqz v0, :cond_0

    check-cast p1, Lh2/x$b;

    invoke-direct {p0, p1}, Lh2/j;->c(Lh2/x$b;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lh2/x$a;

    if-eqz v0, :cond_1

    check-cast p1, Lh2/x$a;

    invoke-direct {p0, p1}, Lh2/j;->e(Lh2/x$a;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lh2/x$c;

    if-eqz v0, :cond_2

    check-cast p1, Lh2/x$c;

    invoke-direct {p0, p1}, Lh2/j;->d(Lh2/x$c;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 8

    .prologue
    iget-boolean v0, p0, Lh2/j;->f:Z

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lh2/j;->d:Lh2/w;

    invoke-virtual {v1}, Lh2/w;->d()Lh2/s;

    move-result-object v6

    iget-object v1, p0, Lh2/j;->c:Lj7/m;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    sget-object v2, Lh2/x$b;->g:Lh2/x$b$a;

    iget-object v1, p0, Lh2/j;->c:Lj7/m;

    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lh2/j;->a:I

    iget v5, p0, Lh2/j;->b:I

    iget-object v7, p0, Lh2/j;->e:Lh2/s;

    invoke-virtual/range {v2 .. v7}, Lh2/x$b$a;->c(Ljava/util/List;IILh2/s;Lh2/s;)Lh2/x$b;

    move-result-object v1

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Lh2/x$c;

    iget-object v2, p0, Lh2/j;->e:Lh2/s;

    invoke-direct {v1, v6, v2}, Lh2/x$c;-><init>(Lh2/s;Lh2/s;)V

    goto :goto_0

    :goto_1
    return-object v0
.end method
