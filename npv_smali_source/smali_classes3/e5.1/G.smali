.class final Le5/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le5/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le5/G$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private final d:Ljava/util/Set;

.field private final e:Ljava/util/Set;

.field private final f:Ljava/util/Set;

.field private final g:Le5/e;


# direct methods
.method constructor <init>(Le5/c;Le5/e;)V
    .locals 8

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Le5/c;->g()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le5/r;

    invoke-virtual {v6}, Le5/r;->e()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6}, Le5/r;->g()Z

    move-result v7

    invoke-virtual {v6}, Le5/r;->c()Le5/F;

    move-result-object v6

    if-eqz v7, :cond_0

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Le5/r;->d()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Le5/r;->c()Le5/F;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Le5/r;->g()Z

    move-result v7

    invoke-virtual {v6}, Le5/r;->c()Le5/F;

    move-result-object v6

    if-eqz v7, :cond_3

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Le5/c;->k()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    const-class v5, LD5/c;

    invoke-static {v5}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le5/G;->a:Ljava/util/Set;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le5/G;->b:Ljava/util/Set;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le5/G;->c:Ljava/util/Set;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le5/G;->d:Ljava/util/Set;

    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le5/G;->e:Ljava/util/Set;

    invoke-virtual {p1}, Le5/c;->k()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Le5/G;->f:Ljava/util/Set;

    iput-object p2, p0, Le5/G;->g:Le5/e;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->a:Ljava/util/Set;

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, LD5/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Le5/G$a;

    iget-object v1, p0, Le5/G;->f:Ljava/util/Set;

    check-cast v0, LD5/c;

    invoke-direct {p1, v1, v0}, Le5/G$a;-><init>(Ljava/util/Set;LD5/c;)V

    return-object p1

    :cond_1
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency %s."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Le5/F;)LF5/b;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->b(Le5/F;)LF5/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency Provider<Set<%s>>."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Le5/F;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->c(Le5/F;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency %s."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Ljava/lang/Class;)LF5/b;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Le5/G;->f(Le5/F;)LF5/b;

    move-result-object p1

    return-object p1
.end method

.method public e(Le5/F;)LF5/a;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->e(Le5/F;)LF5/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency Deferred<%s>."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Le5/F;)LF5/b;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->f(Le5/F;)LF5/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency Provider<%s>."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic g(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Le5/d;->f(Le5/e;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public h(Le5/F;)Ljava/util/Set;
    .locals 4

    .prologue
    iget-object v0, p0, Le5/G;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le5/G;->g:Le5/e;

    invoke-interface {v0, p1}, Le5/e;->h(Le5/F;)Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Le5/t;

    const-string v1, "Attempting to request an undeclared dependency Set<%s>."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le5/t;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Ljava/lang/Class;)LF5/a;
    .locals 0

    invoke-static {p1}, Le5/F;->b(Ljava/lang/Class;)Le5/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Le5/G;->e(Le5/F;)LF5/a;

    move-result-object p1

    return-object p1
.end method
