.class final LB8/x$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB8/x;->d(Lp8/p;ILB8/b;)LP7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB8/x;

.field final synthetic E:Lp8/p;

.field final synthetic F:LB8/b;


# direct methods
.method constructor <init>(LB8/x;Lp8/p;LB8/b;)V
    .locals 0

    iput-object p1, p0, LB8/x$a;->D:LB8/x;

    iput-object p2, p0, LB8/x$a;->E:Lp8/p;

    iput-object p3, p0, LB8/x$a;->F:LB8/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .prologue
    iget-object v0, p0, LB8/x$a;->D:LB8/x;

    invoke-static {v0}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->e()LO7/m;

    move-result-object v1

    invoke-static {v0, v1}, LB8/x;->a(LB8/x;LO7/m;)LB8/A;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LB8/x$a;->D:LB8/x;

    iget-object v2, p0, LB8/x$a;->E:Lp8/p;

    iget-object v3, p0, LB8/x$a;->F:LB8/b;

    invoke-static {v1}, LB8/x;->b(LB8/x;)LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->d()LB8/c;

    move-result-object v1

    invoke-interface {v1, v0, v2, v3}, LB8/f;->i(LB8/A;Lp8/p;LB8/b;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB8/x$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
