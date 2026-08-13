.class public abstract LF8/r;
.super LF8/q;
.source "SourceFile"


# instance fields
.field private final D:LF8/M;


# direct methods
.method public constructor <init>(LF8/M;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/q;-><init>()V

    iput-object p1, p0, LF8/r;->D:LF8/M;

    return-void
.end method


# virtual methods
.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/r;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/r;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/q;->X0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LF8/r;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    invoke-virtual {p0}, LF8/q;->V0()LF8/a0;

    move-result-object v0

    invoke-virtual {p1, v0}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/q;->V0()LF8/a0;

    move-result-object v0

    if-eq p1, v0, :cond_0

    new-instance v0, LF8/O;

    invoke-direct {v0, p0, p1}, LF8/O;-><init>(LF8/M;LF8/a0;)V

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method protected f1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/r;->D:LF8/M;

    return-object v0
.end method
