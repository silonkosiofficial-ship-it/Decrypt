.class public abstract LM0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LM0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LM0/d;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    sput-object v6, LM0/e;->a:LM0/d;

    return-void
.end method

.method public static final synthetic a(Ljava/util/List;II)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, LM0/e;->h(Ljava/util/List;II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LM0/d;II)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, LM0/e;->i(LM0/d;II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LM0/d;II)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, LM0/e;->j(LM0/d;II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LM0/d;II)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, LM0/e;->k(LM0/d;II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LM0/d;II)LM0/d;
    .locals 0

    invoke-static {p0, p1, p2}, LM0/e;->n(LM0/d;II)LM0/d;

    move-result-object p0

    return-object p0
.end method

.method public static final f(IIII)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-gt p0, p2, :cond_3

    if-gt p3, p1, :cond_3

    const/4 v1, 0x1

    if-ne p1, p3, :cond_2

    if-ne p2, p3, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    if-ne p0, p1, :cond_1

    move p0, v1

    goto :goto_1

    :cond_1
    move p0, v0

    :goto_1
    if-ne p2, p0, :cond_3

    :cond_2
    move v0, v1

    :cond_3
    return v0
.end method

.method public static final g()LM0/d;
    .locals 1

    sget-object v0, LM0/e;->a:LM0/d;

    return-object v0
.end method

.method private static final h(Ljava/util/List;II)Ljava/util/List;
    .locals 9

    .prologue
    if-gt p1, p2, :cond_5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LM0/d$c;

    invoke-virtual {v6}, LM0/d$c;->f()I

    move-result v7

    invoke-virtual {v6}, LM0/d$c;->d()I

    move-result v6

    invoke-static {p1, p2, v7, v6}, LM0/e;->l(IIII)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LM0/d$c;

    new-instance v5, LM0/d$c;

    invoke-virtual {v4}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4}, LM0/d$c;->f()I

    move-result v7

    invoke-static {p1, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    sub-int/2addr v7, p1

    invoke-virtual {v4}, LM0/d$c;->d()I

    move-result v8

    invoke-static {p2, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    sub-int/2addr v8, p1

    invoke-virtual {v4}, LM0/d$c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v7, v8, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    invoke-interface {p0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    return-object v0

    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "start ("

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") should be less than or equal to end ("

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final i(LM0/d;II)Ljava/util/List;
    .locals 8

    .prologue
    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LM0/d;->b()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p0}, LM0/d;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-lt p2, p0, :cond_2

    return-object v1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM0/d$c;

    invoke-virtual {v5}, LM0/d$c;->f()I

    move-result v6

    invoke-virtual {v5}, LM0/d$c;->d()I

    move-result v5

    invoke-static {p1, p2, v6, v5}, LM0/e;->l(IIII)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM0/d$c;

    invoke-virtual {v3}, LM0/d$c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LM0/d$c;->f()I

    move-result v6

    invoke-static {v6, p1, p2}, LE7/j;->k(III)I

    move-result v6

    sub-int/2addr v6, p1

    invoke-virtual {v3}, LM0/d$c;->d()I

    move-result v3

    invoke-static {v3, p1, p2}, LE7/j;->k(III)I

    move-result v3

    sub-int/2addr v3, p1

    new-instance v7, LM0/d$c;

    invoke-direct {v7, v5, v6, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method private static final j(LM0/d;II)Ljava/util/List;
    .locals 7

    .prologue
    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LM0/d;->f()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p0}, LM0/d;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-lt p2, p0, :cond_2

    return-object v1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM0/d$c;

    invoke-virtual {v5}, LM0/d$c;->f()I

    move-result v6

    invoke-virtual {v5}, LM0/d$c;->d()I

    move-result v5

    invoke-static {p1, p2, v6, v5}, LM0/e;->l(IIII)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM0/d$c;

    new-instance v4, LM0/d$c;

    invoke-virtual {v3}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LM0/d$c;->f()I

    move-result v6

    invoke-static {v6, p1, p2}, LE7/j;->k(III)I

    move-result v6

    sub-int/2addr v6, p1

    invoke-virtual {v3}, LM0/d$c;->d()I

    move-result v3

    invoke-static {v3, p1, p2}, LE7/j;->k(III)I

    move-result v3

    sub-int/2addr v3, p1

    invoke-direct {v4, v5, v6, v3}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method private static final k(LM0/d;II)Ljava/util/List;
    .locals 7

    .prologue
    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LM0/d;->h()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p0}, LM0/d;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-lt p2, p0, :cond_2

    return-object v1

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM0/d$c;

    invoke-virtual {v5}, LM0/d$c;->f()I

    move-result v6

    invoke-virtual {v5}, LM0/d$c;->d()I

    move-result v5

    invoke-static {p1, p2, v6, v5}, LM0/e;->l(IIII)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM0/d$c;

    new-instance v4, LM0/d$c;

    invoke-virtual {v3}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LM0/d$c;->f()I

    move-result v6

    invoke-static {v6, p1, p2}, LE7/j;->k(III)I

    move-result v6

    sub-int/2addr v6, p1

    invoke-virtual {v3}, LM0/d$c;->d()I

    move-result v3

    invoke-static {v3, p1, p2}, LE7/j;->k(III)I

    move-result v3

    sub-int/2addr v3, p1

    invoke-direct {v4, v5, v6, v3}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method public static final l(IIII)Z
    .locals 2

    .prologue
    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1, p2, p3}, LM0/e;->f(IIII)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3, p0, p1}, LM0/e;->f(IIII)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final m(LM0/d;LM0/v;)Ljava/util/List;
    .locals 10

    .prologue
    invoke-virtual {p0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, LM0/d;->f()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/d$c;

    invoke-virtual {v6}, LM0/d$c;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LM0/v;

    invoke-virtual {v6}, LM0/d$c;->b()I

    move-result v8

    invoke-virtual {v6}, LM0/d$c;->c()I

    move-result v6

    if-eq v8, v5, :cond_1

    new-instance v9, LM0/d$c;

    invoke-direct {v9, p1, v5, v8}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v5, LM0/d$c;

    invoke-virtual {p1, v7}, LM0/v;->l(LM0/v;)LM0/v;

    move-result-object v7

    invoke-direct {v5, v7, v8, v6}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move v5, v6

    goto :goto_0

    :cond_2
    if-eq v5, v0, :cond_3

    new-instance p0, LM0/d$c;

    invoke-direct {p0, p1, v5, v0}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    new-instance p0, LM0/d$c;

    invoke-direct {p0, p1, v3, v3}, LM0/d$c;-><init>(Ljava/lang/Object;II)V

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v1
.end method

.method private static final n(LM0/d;II)LM0/d;
    .locals 8

    .prologue
    new-instance v7, LM0/d;

    if-eq p1, p2, :cond_0

    invoke-virtual {p0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const-string v0, ""

    goto :goto_0

    :goto_1
    invoke-static {p0, p1, p2}, LM0/e;->k(LM0/d;II)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    return-object v7
.end method
