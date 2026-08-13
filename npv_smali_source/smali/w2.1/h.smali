.class public abstract Lw2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo2/n$e;II)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/n$e;->e()Ljava/util/Map;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    if-nez p0, :cond_0

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object p0

    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lo2/n$e;II)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    if-le p2, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, v1, v0, p1, p2}, Lw2/h;->c(Lo2/n$e;Ljava/util/List;ZII)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lo2/n$e;Ljava/util/List;ZII)Ljava/util/List;
    .locals 5

    .prologue
    :goto_0
    if-eqz p2, :cond_0

    if-ge p3, p4, :cond_7

    goto :goto_1

    :cond_0
    if-le p3, p4, :cond_7

    :goto_1
    if-eqz p2, :cond_1

    invoke-virtual {p0, p3}, Lo2/n$e;->f(I)Li7/u;

    move-result-object v0

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p3}, Lo2/n$e;->g(I)Li7/u;

    move-result-object v0

    :goto_2
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-eqz p2, :cond_4

    add-int/lit8 v4, p3, 0x1

    if-gt v4, v3, :cond_3

    if-gt v3, p4, :cond_3

    goto :goto_3

    :cond_4
    if-gt p4, v3, :cond_3

    if-ge v3, p3, :cond_3

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p3, 0x1

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    move v3, p3

    move p3, v0

    :goto_4
    if-nez p3, :cond_6

    return-object v1

    :cond_6
    move p3, v3

    goto :goto_0

    :cond_7
    return-object p1
.end method

.method public static final d(Lo2/c;II)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-le p1, p2, :cond_0

    iget-boolean p2, p0, Lo2/c;->l:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lo2/c;->k:Z

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lo2/c;->c()Ljava/util/Set;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lo2/c;->c()Ljava/util/Set;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0
.end method
