.class public final Ls8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# instance fields
.field private final a:LF8/i0;

.field private b:LG8/j;


# direct methods
.method public constructor <init>(LF8/i0;)V
    .locals 1

    const-string v0, "projection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls8/c;->a:LF8/i0;

    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object p1

    invoke-interface {p1}, LF8/i0;->a()LF8/u0;

    sget-object p1, LF8/u0;->G:LF8/u0;

    return-void
.end method


# virtual methods
.method public a()LF8/i0;
    .locals 1

    iget-object v0, p0, Ls8/c;->a:LF8/i0;

    return-object v0
.end method

.method public b()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()LG8/j;
    .locals 1

    iget-object v0, p0, Ls8/c;->b:LG8/j;

    return-object v0
.end method

.method public d(LG8/g;)Ls8/c;
    .locals 2

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls8/c;

    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object v1

    invoke-interface {v1, p1}, LF8/i0;->v(LG8/g;)LF8/i0;

    move-result-object p1

    const-string v1, "refine(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ls8/c;-><init>(LF8/i0;)V

    return-object v0
.end method

.method public final e(LG8/j;)V
    .locals 0

    iput-object p1, p0, Ls8/c;->b:LG8/j;

    return-void
.end method

.method public t()LL7/g;
    .locals 2

    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->t()LL7/g;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapturedTypeConstructor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->a()LF8/u0;

    move-result-object v0

    sget-object v1, LF8/u0;->I:LF8/u0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ls8/c;->a()LF8/i0;

    move-result-object v0

    invoke-interface {v0}, LF8/i0;->getType()LF8/E;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls8/c;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->I()LF8/M;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic v(LG8/g;)LF8/e0;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/c;->d(LG8/g;)Ls8/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic w()LO7/h;
    .locals 1

    invoke-virtual {p0}, Ls8/c;->b()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, LO7/h;

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
