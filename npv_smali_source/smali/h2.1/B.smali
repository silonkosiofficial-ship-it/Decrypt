.class public final Lh2/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/B$a;,
        Lh2/B$b;
    }
.end annotation


# instance fields
.field private final a:Lh2/E;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private final i:LY8/j;

.field private final j:LY8/j;

.field private final k:Ljava/util/Map;

.field private l:Lh2/w;


# direct methods
.method private constructor <init>(Lh2/E;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/B;->a:Lh2/E;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lh2/B;->b:Ljava/util/List;

    iput-object p1, p0, Lh2/B;->c:Ljava/util/List;

    const/4 p1, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, v0, v0, v1, v0}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v2

    iput-object v2, p0, Lh2/B;->i:LY8/j;

    invoke-static {p1, v0, v0, v1, v0}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object p1

    iput-object p1, p0, Lh2/B;->j:LY8/j;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lh2/B;->k:Ljava/util/Map;

    new-instance p1, Lh2/w;

    invoke-direct {p1}, Lh2/w;-><init>()V

    sget-object v0, Lh2/t;->C:Lh2/t;

    sget-object v1, Lh2/r$b;->b:Lh2/r$b;

    invoke-virtual {p1, v0, v1}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    iput-object p1, p0, Lh2/B;->l:Lh2/w;

    return-void
.end method

.method public synthetic constructor <init>(Lh2/E;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lh2/B;-><init>(Lh2/E;)V

    return-void
.end method

.method public static final synthetic a(Lh2/B;)I
    .locals 0

    iget p0, p0, Lh2/B;->h:I

    return p0
.end method

.method public static final synthetic b(Lh2/B;)LY8/j;
    .locals 0

    iget-object p0, p0, Lh2/B;->j:LY8/j;

    return-object p0
.end method

.method public static final synthetic c(Lh2/B;)I
    .locals 0

    iget p0, p0, Lh2/B;->g:I

    return p0
.end method

.method public static final synthetic d(Lh2/B;)LY8/j;
    .locals 0

    iget-object p0, p0, Lh2/B;->i:LY8/j;

    return-object p0
.end method


# virtual methods
.method public final e()LZ8/f;
    .locals 3

    iget-object v0, p0, Lh2/B;->j:LY8/j;

    invoke-static {v0}, LZ8/h;->m(LY8/B;)LZ8/f;

    move-result-object v0

    new-instance v1, Lh2/B$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lh2/B$c;-><init>(Lh2/B;Lm7/e;)V

    invoke-static {v0, v1}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v0

    return-object v0
.end method

.method public final f()LZ8/f;
    .locals 3

    iget-object v0, p0, Lh2/B;->i:LY8/j;

    invoke-static {v0}, LZ8/h;->m(LY8/B;)LZ8/f;

    move-result-object v0

    new-instance v1, Lh2/B$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lh2/B$d;-><init>(Lh2/B;Lm7/e;)V

    invoke-static {v0, v1}, LZ8/h;->H(LZ8/f;Lx7/p;)LZ8/f;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lh2/Z$a;)Lh2/M;
    .locals 8

    .prologue
    iget-object v0, p0, Lh2/B;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result v1

    iget v2, p0, Lh2/B;->d:I

    neg-int v2, v2

    iget-object v3, p0, Lh2/B;->c:Ljava/util/List;

    invoke-static {v3}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    iget v4, p0, Lh2/B;->d:I

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Lh2/Z$a;->g()I

    move-result v4

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_1

    if-le v5, v3, :cond_0

    iget-object v6, p0, Lh2/B;->a:Lh2/E;

    iget v6, v6, Lh2/E;->a:I

    goto :goto_1

    :cond_0
    iget-object v6, p0, Lh2/B;->c:Ljava/util/List;

    iget v7, p0, Lh2/B;->d:I

    add-int/2addr v7, v5

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh2/L$b$c;

    invoke-virtual {v6}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_1
    add-int/2addr v1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lh2/Z$a;->f()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p1}, Lh2/Z$a;->g()I

    move-result p1

    if-ge p1, v2, :cond_2

    iget-object p1, p0, Lh2/B;->a:Lh2/E;

    iget p1, p1, Lh2/E;->a:I

    sub-int/2addr v1, p1

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    iget-object v1, p0, Lh2/B;->a:Lh2/E;

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result v2

    new-instance v3, Lh2/M;

    invoke-direct {v3, v0, p1, v1, v2}, Lh2/M;-><init>(Ljava/util/List;Ljava/lang/Integer;Lh2/E;I)V

    return-object v3
.end method

.method public final h(Lh2/x$a;)V
    .locals 4

    .prologue
    const-string v0, "event"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result v0

    iget-object v1, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v0, v1, :cond_4

    iget-object v0, p0, Lh2/B;->k:Ljava/util/Map;

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh2/B;->l:Lh2/w;

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v1

    sget-object v2, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v2}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lh2/w;->c(Lh2/t;Lh2/r;)V

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v0

    sget-object v1, Lh2/B$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v1, p0, Lh2/B;->b:Ljava/util/List;

    iget-object v3, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result p1

    invoke-virtual {p0, p1}, Lh2/B;->s(I)V

    iget p1, p0, Lh2/B;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lh2/B;->h:I

    iget-object v0, p0, Lh2/B;->j:LY8/j;

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot drop "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result v0

    move v1, v2

    :goto_2
    if-ge v1, v0, :cond_3

    iget-object v3, p0, Lh2/B;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    iget v0, p0, Lh2/B;->d:I

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lh2/B;->d:I

    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result p1

    invoke-virtual {p0, p1}, Lh2/B;->t(I)V

    iget p1, p0, Lh2/B;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lh2/B;->g:I

    iget-object v0, p0, Lh2/B;->i:LY8/j;

    goto :goto_1

    :goto_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "invalid drop count. have "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " but wanted to drop "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lh2/x$a;->f()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Lh2/t;Lh2/Z;)Lh2/x$a;
    .locals 8

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/B;->a:Lh2/E;

    iget v0, v0, Lh2/E;->e:I

    const v1, 0x7fffffff

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0}, Lh2/B;->q()I

    move-result v0

    iget-object v3, p0, Lh2/B;->a:Lh2/E;

    iget v3, v3, Lh2/E;->e:I

    if-gt v0, v3, :cond_2

    return-object v2

    :cond_2
    sget-object v0, Lh2/t;->C:Lh2/t;

    if-eq p1, v0, :cond_b

    const/4 v0, 0x0

    move v3, v0

    move v4, v3

    :goto_0
    iget-object v5, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_5

    invoke-virtual {p0}, Lh2/B;->q()I

    move-result v5

    sub-int/2addr v5, v4

    iget-object v6, p0, Lh2/B;->a:Lh2/E;

    iget v6, v6, Lh2/E;->e:I

    if-le v5, v6, :cond_5

    sget-object v5, Lh2/B$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v5, v6

    if-ne v6, v1, :cond_3

    iget-object v6, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    :goto_1
    check-cast v6, Lh2/L$b$c;

    invoke-virtual {v6}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    goto :goto_2

    :cond_3
    iget-object v6, p0, Lh2/B;->c:Ljava/util/List;

    invoke-static {v6}, Lj7/v;->o(Ljava/util/List;)I

    move-result v7

    sub-int/2addr v7, v3

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v5, v5, v7

    if-ne v5, v1, :cond_4

    invoke-virtual {p2}, Lh2/Z;->d()I

    move-result v5

    :goto_3
    sub-int/2addr v5, v4

    sub-int/2addr v5, v6

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lh2/Z;->c()I

    move-result v5

    goto :goto_3

    :goto_4
    iget-object v7, p0, Lh2/B;->a:Lh2/E;

    iget v7, v7, Lh2/E;->b:I

    if-lt v5, v7, :cond_5

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    goto :goto_9

    :cond_6
    new-instance v2, Lh2/x$a;

    sget-object p2, Lh2/B$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, p2, v5

    if-ne v5, v1, :cond_7

    iget v5, p0, Lh2/B;->d:I

    neg-int v5, v5

    goto :goto_5

    :cond_7
    iget-object v5, p0, Lh2/B;->c:Ljava/util/List;

    invoke-static {v5}, Lj7/v;->o(Ljava/util/List;)I

    move-result v5

    iget v6, p0, Lh2/B;->d:I

    sub-int/2addr v5, v6

    add-int/lit8 v6, v3, -0x1

    sub-int/2addr v5, v6

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget p2, p2, v6

    if-ne p2, v1, :cond_8

    add-int/lit8 v3, v3, -0x1

    iget p2, p0, Lh2/B;->d:I

    sub-int/2addr v3, p2

    goto :goto_6

    :cond_8
    iget-object p2, p0, Lh2/B;->c:Ljava/util/List;

    invoke-static {p2}, Lj7/v;->o(Ljava/util/List;)I

    move-result p2

    iget v1, p0, Lh2/B;->d:I

    sub-int v3, p2, v1

    :goto_6
    iget-object p2, p0, Lh2/B;->a:Lh2/E;

    iget-boolean p2, p2, Lh2/E;->c:Z

    if-nez p2, :cond_9

    goto :goto_8

    :cond_9
    sget-object p2, Lh2/t;->D:Lh2/t;

    if-ne p1, p2, :cond_a

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result p2

    :goto_7
    add-int v0, p2, v4

    goto :goto_8

    :cond_a
    invoke-virtual {p0}, Lh2/B;->n()I

    move-result p2

    goto :goto_7

    :goto_8
    invoke-direct {v2, p1, v5, v3, v0}, Lh2/x$a;-><init>(Lh2/t;III)V

    :goto_9
    return-object v2

    :cond_b
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Drop LoadType must be PREPEND or APPEND, but got "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final j(Lh2/t;)I
    .locals 1

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/B$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget p1, p0, Lh2/B;->h:I

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iget p1, p0, Lh2/B;->g:I

    :goto_0
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot get loadId for loadType: REFRESH"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lh2/B;->k:Ljava/util/Map;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lh2/B;->d:I

    return v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lh2/B;->c:Ljava/util/List;

    return-object v0
.end method

.method public final n()I
    .locals 1

    .prologue
    iget-object v0, p0, Lh2/B;->a:Lh2/E;

    iget-boolean v0, v0, Lh2/E;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lh2/B;->f:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()I
    .locals 1

    .prologue
    iget-object v0, p0, Lh2/B;->a:Lh2/E;

    iget-boolean v0, v0, Lh2/E;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lh2/B;->e:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Lh2/w;
    .locals 1

    iget-object v0, p0, Lh2/B;->l:Lh2/w;

    return-object v0
.end method

.method public final q()I
    .locals 3

    .prologue
    iget-object v0, p0, Lh2/B;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/L$b$c;

    invoke-virtual {v2}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final r(ILh2/t;Lh2/L$b$c;)Z
    .locals 4

    .prologue
    const-string v0, "loadType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "page"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/B$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_8

    const/4 v2, 0x2

    const/high16 v3, -0x80000000

    if-eq p2, v2, :cond_4

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p2, p0, Lh2/B;->c:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v0

    if-eqz p2, :cond_3

    iget p2, p0, Lh2/B;->h:I

    if-eq p1, p2, :cond_1

    return v1

    :cond_1
    iget-object p1, p0, Lh2/B;->b:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3}, Lh2/L$b$c;->e()I

    move-result p1

    if-ne p1, v3, :cond_2

    invoke-virtual {p0}, Lh2/B;->n()I

    move-result p1

    invoke-virtual {p3}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1, v1}, LE7/j;->d(II)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lh2/L$b$c;->e()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Lh2/B;->s(I)V

    iget-object p1, p0, Lh2/B;->k:Ljava/util/Map;

    sget-object p2, Lh2/t;->E:Lh2/t;

    :goto_1
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "should\'ve received an init before append"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, p0, Lh2/B;->c:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v0

    if-eqz p2, :cond_7

    iget p2, p0, Lh2/B;->g:I

    if-eq p1, p2, :cond_5

    return v1

    :cond_5
    iget-object p1, p0, Lh2/B;->b:Ljava/util/List;

    invoke-interface {p1, v1, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget p1, p0, Lh2/B;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Lh2/B;->d:I

    invoke-virtual {p3}, Lh2/L$b$c;->f()I

    move-result p1

    if-ne p1, v3, :cond_6

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result p1

    invoke-virtual {p3}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-static {p1, v1}, LE7/j;->d(II)I

    move-result p1

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Lh2/L$b$c;->f()I

    move-result p1

    :goto_2
    invoke-virtual {p0, p1}, Lh2/B;->t(I)V

    iget-object p1, p0, Lh2/B;->k:Ljava/util/Map;

    sget-object p2, Lh2/t;->D:Lh2/t;

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "should\'ve received an init before prepend"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object p2, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    if-nez p1, :cond_9

    iget-object p1, p0, Lh2/B;->b:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput v1, p0, Lh2/B;->d:I

    invoke-virtual {p3}, Lh2/L$b$c;->e()I

    move-result p1

    invoke-virtual {p0, p1}, Lh2/B;->s(I)V

    invoke-virtual {p3}, Lh2/L$b$c;->f()I

    move-result p1

    invoke-virtual {p0, p1}, Lh2/B;->t(I)V

    :goto_3
    return v0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "init loadId must be the initial value, 0"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot receive multiple init calls"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(I)V
    .locals 1

    .prologue
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lh2/B;->f:I

    return-void
.end method

.method public final t(I)V
    .locals 1

    .prologue
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lh2/B;->e:I

    return-void
.end method

.method public final u(Lh2/L$b$c;Lh2/t;)Lh2/x;
    .locals 12

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/B$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lh2/B;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lh2/B;->d:I

    sub-int/2addr v1, v2

    add-int/lit8 v2, v1, -0x1

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iget v1, p0, Lh2/B;->d:I

    sub-int/2addr v2, v1

    :cond_2
    :goto_0
    new-instance v1, Lh2/W;

    invoke-virtual {p1}, Lh2/L$b$c;->d()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lh2/W;-><init>(ILjava/util/List;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v5, :cond_5

    const/4 p2, 0x0

    if-eq p1, v4, :cond_4

    if-ne p1, v3, :cond_3

    sget-object p1, Lh2/x$b;->g:Lh2/x$b$a;

    invoke-virtual {p0}, Lh2/B;->n()I

    move-result v0

    iget-object v1, p0, Lh2/B;->l:Lh2/w;

    invoke-virtual {v1}, Lh2/w;->d()Lh2/s;

    move-result-object v1

    invoke-virtual {p1, v7, v0, v1, p2}, Lh2/x$b$a;->a(Ljava/util/List;ILh2/s;Lh2/s;)Lh2/x$b;

    move-result-object p1

    goto :goto_1

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_4
    sget-object p1, Lh2/x$b;->g:Lh2/x$b$a;

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result v0

    iget-object v1, p0, Lh2/B;->l:Lh2/w;

    invoke-virtual {v1}, Lh2/w;->d()Lh2/s;

    move-result-object v1

    invoke-virtual {p1, v7, v0, v1, p2}, Lh2/x$b$a;->b(Ljava/util/List;ILh2/s;Lh2/s;)Lh2/x$b;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object v6, Lh2/x$b;->g:Lh2/x$b$a;

    invoke-virtual {p0}, Lh2/B;->o()I

    move-result v8

    invoke-virtual {p0}, Lh2/B;->n()I

    move-result v9

    iget-object p1, p0, Lh2/B;->l:Lh2/w;

    invoke-virtual {p1}, Lh2/w;->d()Lh2/s;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual/range {v6 .. v11}, Lh2/x$b$a;->c(Ljava/util/List;IILh2/s;Lh2/s;)Lh2/x$b;

    move-result-object p1

    :goto_1
    return-object p1
.end method
