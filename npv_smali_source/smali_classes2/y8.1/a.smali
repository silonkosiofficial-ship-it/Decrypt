.class public abstract Ly8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0}, Ly8/h;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0}, Ly8/h;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ly8/k;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0}, Ly8/h;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ly8/h;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    instance-of v0, v0, Ly8/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly8/a;

    invoke-virtual {v0}, Ly8/a;->h()Ly8/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly8/a;->i()Ly8/h;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected abstract i()Ly8/h;
.end method
