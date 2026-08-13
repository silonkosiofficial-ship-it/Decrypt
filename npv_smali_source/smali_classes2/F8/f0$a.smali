.class public final LF8/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LF8/f0$a;-><init>()V

    return-void
.end method

.method public static synthetic e(LF8/f0$a;Ljava/util/Map;ZILjava/lang/Object;)LF8/f0;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LF8/f0$a;->d(Ljava/util/Map;Z)LF8/f0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LF8/E;)LF8/l0;
    .locals 1

    const-string v0, "kotlinType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-virtual {p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LF8/f0$a;->b(LF8/e0;Ljava/util/List;)LF8/l0;

    move-result-object p1

    return-object p1
.end method

.method public final b(LF8/e0;Ljava/util/List;)LF8/l0;
    .locals 4

    .prologue
    const-string v0, "typeConstructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/f0;

    if-eqz v2, :cond_1

    invoke-interface {v2}, LO7/f0;->x0()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, LF8/e0;->x()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/f0;

    invoke-interface {v1}, LO7/f0;->p()LF8/e0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v0, p2}, Lj7/v;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/S;->q(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, p2, v0}, LF8/f0$a;->e(LF8/f0$a;Ljava/util/Map;ZILjava/lang/Object;)LF8/f0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, LF8/C;

    invoke-direct {p1, v0, p2}, LF8/C;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public final c(Ljava/util/Map;)LF8/f0;
    .locals 3

    const-string v0, "map"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LF8/f0$a;->e(LF8/f0$a;Ljava/util/Map;ZILjava/lang/Object;)LF8/f0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/Map;Z)LF8/f0;
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/f0$a$a;

    invoke-direct {v0, p1, p2}, LF8/f0$a$a;-><init>(Ljava/util/Map;Z)V

    return-object v0
.end method
