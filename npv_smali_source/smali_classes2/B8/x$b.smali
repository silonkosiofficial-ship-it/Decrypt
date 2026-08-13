.class final LB8/x$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/x;->f(Li8/n;Z)LP7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/x;

.field final synthetic E:Z

.field final synthetic F:Li8/n;


# direct methods
.method constructor <init>(LB8/x;ZLi8/n;)V
    .locals 0

    iput-object p1, p0, LB8/x$b;->D:LB8/x;

    iput-boolean p2, p0, LB8/x$b;->E:Z

    iput-object p3, p0, LB8/x$b;->F:Li8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, LB8/x$b;->D:LB8/x;

    invoke-static {v0}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v1

    invoke-static {v0, v1}, LB8/x;->a(LB8/x;LO7/m;)LB8/A;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, LB8/x$b;->E:Z

    iget-object v2, p0, LB8/x$b;->D:LB8/x;

    iget-object v3, p0, LB8/x$b;->F:Li8/n;

    if-eqz v1, :cond_0

    invoke-static {v2}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->d()LB8/c;

    move-result-object v1

    invoke-interface {v1, v0, v3}, LB8/f;->f(LB8/A;Li8/n;)Ljava/util/List;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-static {v2}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->d()LB8/c;

    move-result-object v1

    invoke-interface {v1, v0, v3}, LB8/f;->d(LB8/A;Li8/n;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/x$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
