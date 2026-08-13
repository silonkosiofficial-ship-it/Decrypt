.class public final Lf8/m$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/m$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;

.field private c:Li7/u;

.field final synthetic d:Lf8/m$a;


# direct methods
.method public constructor <init>(Lf8/m$a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "functionName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf8/m$a$a;->d:Lf8/m$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf8/m$a$a;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf8/m$a$a;->b:Ljava/util/List;

    const-string p1, "V"

    const/4 p2, 0x0

    invoke-static {p1, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Lf8/m$a$a;->c:Li7/u;

    return-void
.end method


# virtual methods
.method public final a()Li7/u;
    .locals 7

    .prologue
    sget-object v0, Lg8/A;->a:Lg8/A;

    iget-object v1, p0, Lf8/m$a$a;->d:Lf8/m$a;

    invoke-virtual {v1}, Lf8/m$a;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lf8/m$a$a;->a:Ljava/lang/String;

    iget-object v3, p0, Lf8/m$a$a;->b:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li7/u;

    invoke-virtual {v6}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lf8/m$a$a;->c:Li7/u;

    invoke-virtual {v3}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v4, v3}, Lg8/A;->j(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lg8/A;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lf8/m$a$a;->c:Li7/u;

    invoke-virtual {v1}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf8/q;

    iget-object v2, p0, Lf8/m$a$a;->b:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf8/q;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v2, Lf8/k;

    invoke-direct {v2, v1, v3}, Lf8/k;-><init>(Lf8/q;Ljava/util/List;)V

    invoke-static {v0, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    return-object v0
.end method

.method public final varargs b(Ljava/lang/String;[Lf8/e;)V
    .locals 4

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/m$a$a;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    array-length v1, p2

    if-nez v1, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    invoke-static {p2}, Lj7/n;->e1([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p2

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, LE7/j;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj7/L;

    invoke-virtual {v1}, Lj7/L;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lj7/L;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf8/e;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p2, Lf8/q;

    invoke-direct {p2, v2}, Lf8/q;-><init>(Ljava/util/Map;)V

    :goto_1
    invoke-static {p1, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final varargs c(Ljava/lang/String;[Lf8/e;)V
    .locals 3

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lj7/n;->e1([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p2

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lj7/S;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, LE7/j;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj7/L;

    invoke-virtual {v0}, Lj7/L;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lj7/L;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf8/e;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p2, Lf8/q;

    invoke-direct {p2, v1}, Lf8/q;-><init>(Ljava/util/Map;)V

    invoke-static {p1, p2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Lf8/m$a$a;->c:Li7/u;

    return-void
.end method

.method public final d(Lw8/e;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getDesc(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Lf8/m$a$a;->c:Li7/u;

    return-void
.end method
