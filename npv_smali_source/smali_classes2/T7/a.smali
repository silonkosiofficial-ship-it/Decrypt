.class public final LT7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lg8/j;

.field private final b:LT7/g;

.field private final c:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lg8/j;LT7/g;)V
    .locals 1

    const-string v0, "resolver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/a;->a:Lg8/j;

    iput-object p2, p0, LT7/a;->b:LT7/g;

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LT7/a;->c:Lj$/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public final a(LT7/f;)Ly8/h;
    .locals 8

    .prologue
    const-string v0, "fileClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT7/a;->c:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, LT7/f;->c()Ln8/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, LT7/f;->c()Ln8/b;

    move-result-object v2

    invoke-virtual {v2}, Ln8/b;->h()Ln8/c;

    move-result-object v2

    const-string v3, "getPackageFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LT7/f;->b()Lh8/a;

    move-result-object v3

    invoke-virtual {v3}, Lh8/a;->c()Lh8/a$a;

    move-result-object v3

    sget-object v4, Lh8/a$a;->J:Lh8/a$a;

    if-ne v3, v4, :cond_1

    invoke-virtual {p1}, LT7/f;->b()Lh8/a;

    move-result-object v3

    invoke-virtual {v3}, Lh8/a;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lw8/d;->d(Ljava/lang/String;)Lw8/d;

    move-result-object v5

    invoke-virtual {v5}, Lw8/d;->e()Ln8/c;

    move-result-object v5

    invoke-static {v5}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v5

    const-string v6, "topLevel(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, LT7/a;->b:LT7/g;

    iget-object v7, p0, LT7/a;->a:Lg8/j;

    invoke-virtual {v7}, Lg8/j;->d()LB8/k;

    move-result-object v7

    invoke-virtual {v7}, LB8/k;->g()LB8/l;

    move-result-object v7

    invoke-static {v7}, LP8/c;->a(LB8/l;)Lm8/e;

    move-result-object v7

    invoke-static {v6, v5, v7}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_2
    new-instance v3, LR7/m;

    iget-object v5, p0, LT7/a;->a:Lg8/j;

    invoke-virtual {v5}, Lg8/j;->d()LB8/k;

    move-result-object v5

    invoke-virtual {v5}, LB8/k;->q()LO7/G;

    move-result-object v5

    invoke-direct {v3, v5, v2}, LR7/m;-><init>(LO7/G;Ln8/c;)V

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg8/t;

    iget-object v7, p0, LT7/a;->a:Lg8/j;

    invoke-virtual {v7, v3, v6}, Lg8/j;->b(LO7/K;Lg8/t;)Ly8/h;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v5}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Ly8/b;->d:Ly8/b$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "package "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v4, p1, v3}, Ly8/b$a;->a(Ljava/lang/String;Ljava/lang/Iterable;)Ly8/h;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v2, p1

    goto :goto_2

    :cond_5
    move-object v2, v0

    :cond_6
    :goto_2
    const-string p1, "getOrPut(...)"

    invoke-static {v2, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ly8/h;

    return-object v2
.end method
