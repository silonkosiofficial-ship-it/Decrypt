.class public abstract synthetic LD0/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LD0/I;LD0/o;Ljava/util/List;I)I
    .locals 9

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/n;

    new-instance v4, LD0/j;

    sget-object v5, LD0/p;->D:LD0/p;

    sget-object v6, LD0/q;->D:LD0/q;

    invoke-direct {v4, v3, v5, v6}, LD0/j;-><init>(LD0/n;LD0/p;LD0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, LD0/r;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p1, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p0, v1, v0, p2, p3}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p0

    invoke-interface {p0}, LD0/K;->getHeight()I

    move-result p0

    return p0
.end method

.method public static b(LD0/I;LD0/o;Ljava/util/List;I)I
    .locals 9

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/n;

    new-instance v4, LD0/j;

    sget-object v5, LD0/p;->D:LD0/p;

    sget-object v6, LD0/q;->C:LD0/q;

    invoke-direct {v4, v3, v5, v6}, LD0/j;-><init>(LD0/n;LD0/p;LD0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, LD0/r;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p1, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p0, v1, v0, p2, p3}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p0

    invoke-interface {p0}, LD0/K;->getWidth()I

    move-result p0

    return p0
.end method

.method public static c(LD0/I;LD0/o;Ljava/util/List;I)I
    .locals 9

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/n;

    new-instance v4, LD0/j;

    sget-object v5, LD0/p;->C:LD0/p;

    sget-object v6, LD0/q;->D:LD0/q;

    invoke-direct {v4, v3, v5, v6}, LD0/j;-><init>(LD0/n;LD0/p;LD0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, LD0/r;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p1, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p0, v1, v0, p2, p3}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p0

    invoke-interface {p0}, LD0/K;->getHeight()I

    move-result p0

    return p0
.end method

.method public static d(LD0/I;LD0/o;Ljava/util/List;I)I
    .locals 9

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/n;

    new-instance v4, LD0/j;

    sget-object v5, LD0/p;->C:LD0/p;

    sget-object v6, LD0/q;->C:LD0/q;

    invoke-direct {v4, v3, v5, v6}, LD0/j;-><init>(LD0/n;LD0/p;LD0/q;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p3

    invoke-static/range {v3 .. v8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p2

    new-instance v1, LD0/r;

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-direct {v1, p1, v2}, LD0/r;-><init>(LD0/o;LY0/v;)V

    invoke-interface {p0, v1, v0, p2, p3}, LD0/I;->b(LD0/M;Ljava/util/List;J)LD0/K;

    move-result-object p0

    invoke-interface {p0}, LD0/K;->getWidth()I

    move-result p0

    return p0
.end method
