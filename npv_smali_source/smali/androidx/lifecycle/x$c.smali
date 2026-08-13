.class Landroidx/lifecycle/x$c;
.super Landroidx/lifecycle/x$d;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final G:Landroidx/lifecycle/r;

.field final synthetic H:Landroidx/lifecycle/x;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/r;Landroidx/lifecycle/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/x$c;->H:Landroidx/lifecycle/x;

    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/x$d;-><init>(Landroidx/lifecycle/x;Landroidx/lifecycle/A;)V

    iput-object p2, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    return-void
.end method


# virtual methods
.method b()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    return-void
.end method

.method c(Landroidx/lifecycle/r;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method d()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    invoke-interface {v0}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v0

    return v0
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/k$b;->C:Landroidx/lifecycle/k$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/x$c;->H:Landroidx/lifecycle/x;

    iget-object p2, p0, Landroidx/lifecycle/x$d;->C:Landroidx/lifecycle/A;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->m(Landroidx/lifecycle/A;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Landroidx/lifecycle/x$c;->d()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/lifecycle/x$d;->a(Z)V

    iget-object p2, p0, Landroidx/lifecycle/x$c;->G:Landroidx/lifecycle/r;

    invoke-interface {p2}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method
