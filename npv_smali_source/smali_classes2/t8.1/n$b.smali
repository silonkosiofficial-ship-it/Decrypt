.class final Lt8/n$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lt8/n;


# direct methods
.method constructor <init>(Lt8/n;)V
    .locals 0

    iput-object p1, p0, Lt8/n$b;->D:Lt8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, Lt8/n$b;->D:Lt8/n;

    invoke-virtual {v0}, Lt8/n;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->x()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LF8/k0;

    sget-object v2, LF8/u0;->H:LF8/u0;

    iget-object v3, p0, Lt8/n$b;->D:Lt8/n;

    invoke-static {v3}, Lt8/n;->c(Lt8/n;)LF8/M;

    move-result-object v3

    invoke-direct {v1, v2, v3}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    invoke-static {v1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LF8/m0;->f(LF8/M;Ljava/util/List;LF8/a0;ILjava/lang/Object;)LF8/M;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF8/M;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lt8/n$b;->D:Lt8/n;

    invoke-static {v1}, Lt8/n;->e(Lt8/n;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    iget-object v2, p0, Lt8/n$b;->D:Lt8/n;

    invoke-virtual {v2}, Lt8/n;->t()LL7/g;

    move-result-object v2

    invoke-virtual {v2}, LL7/g;->L()LF8/M;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt8/n$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
