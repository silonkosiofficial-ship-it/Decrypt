.class public final LQ3/g0;
.super LQ3/Q;
.source "SourceFile"


# instance fields
.field final synthetic g:LQ3/c;


# direct methods
.method public constructor <init>(LQ3/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LQ3/g0;->g:LQ3/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LQ3/Q;-><init>(LQ3/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(LN3/b;)V
    .locals 1

    .prologue
    iget-object v0, p0, LQ3/g0;->g:LQ3/c;

    invoke-virtual {v0}, LQ3/c;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ3/g0;->g:LQ3/c;

    invoke-static {v0}, LQ3/c;->h0(LQ3/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LQ3/g0;->g:LQ3/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, LQ3/c;->d0(LQ3/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, LQ3/g0;->g:LQ3/c;

    iget-object v0, v0, LQ3/c;->p:LQ3/c$c;

    invoke-interface {v0, p1}, LQ3/c$c;->a(LN3/b;)V

    iget-object v0, p0, LQ3/g0;->g:LQ3/c;

    invoke-virtual {v0, p1}, LQ3/c;->L(LN3/b;)V

    return-void
.end method

.method protected final g()Z
    .locals 2

    iget-object v0, p0, LQ3/g0;->g:LQ3/c;

    iget-object v0, v0, LQ3/c;->p:LQ3/c$c;

    sget-object v1, LN3/b;->G:LN3/b;

    invoke-interface {v0, v1}, LQ3/c$c;->a(LN3/b;)V

    const/4 v0, 0x1

    return v0
.end method
