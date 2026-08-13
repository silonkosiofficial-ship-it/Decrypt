.class final LF0/d0$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/d0;-><init>(LF0/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/d0;


# direct methods
.method constructor <init>(LF0/d0;)V
    .locals 0

    iput-object p1, p0, LF0/d0$g;->D:LF0/d0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/q0;Lr0/c;)V
    .locals 5

    .prologue
    iget-object v0, p0, LF0/d0$g;->D:LF0/d0;

    invoke-virtual {v0}, LF0/d0;->o1()LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/d0$g;->D:LF0/d0;

    invoke-static {v0}, LF0/d0;->K1(LF0/d0;)LF0/q0;

    move-result-object v0

    iget-object v1, p0, LF0/d0$g;->D:LF0/d0;

    invoke-static {}, LF0/d0;->H1()Lx7/l;

    move-result-object v2

    new-instance v3, LF0/d0$g$a;

    iget-object v4, p0, LF0/d0$g;->D:LF0/d0;

    invoke-direct {v3, v4, p1, p2}, LF0/d0$g$a;-><init>(LF0/d0;Lo0/q0;Lr0/c;)V

    invoke-virtual {v0, v1, v2, v3}, LF0/q0;->i(LF0/p0;Lx7/l;Lx7/a;)V

    iget-object p1, p0, LF0/d0$g;->D:LF0/d0;

    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, LF0/d0;->P1(LF0/d0;Z)V

    goto :goto_1

    :cond_0
    iget-object p1, p0, LF0/d0$g;->D:LF0/d0;

    const/4 p2, 0x1

    goto :goto_0

    :goto_1
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/q0;

    check-cast p2, Lr0/c;

    invoke-virtual {p0, p1, p2}, LF0/d0$g;->a(Lo0/q0;Lr0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
