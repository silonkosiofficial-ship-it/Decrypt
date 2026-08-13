.class public final Ls3/P1;
.super Ls3/G;
.source "SourceFile"


# instance fields
.field private final C:Lk3/d;


# direct methods
.method public constructor <init>(Lk3/d;)V
    .locals 0

    invoke-direct {p0}, Ls3/G;-><init>()V

    iput-object p1, p0, Ls3/P1;->C:Lk3/d;

    return-void
.end method


# virtual methods
.method public final F(I)V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->e0()V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->e()V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->k()V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->i()V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->p()V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk3/d;->q()V

    :cond_0
    return-void
.end method

.method public final x(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/P1;->C:Lk3/d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk3/d;->g(Lk3/m;)V

    :cond_0
    return-void
.end method
