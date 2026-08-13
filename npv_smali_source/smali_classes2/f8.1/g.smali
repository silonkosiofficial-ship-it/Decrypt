.class public final Lf8/g;
.super LF8/q;
.source "SourceFile"

# interfaces
.implements LF8/J;


# instance fields
.field private final D:LF8/M;


# direct methods
.method public constructor <init>(LF8/M;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/q;-><init>()V

    iput-object p1, p0, Lf8/g;->D:LF8/M;

    return-void
.end method

.method private final i1(LF8/M;)LF8/M;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LF8/M;->d1(Z)LF8/M;

    move-result-object v0

    invoke-static {p1}, LK8/a;->t(LF8/E;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lf8/g;

    invoke-direct {p1, v0}, Lf8/g;-><init>(LF8/M;)V

    return-object p1
.end method


# virtual methods
.method public J0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public Q(LF8/E;)LF8/E;
    .locals 3

    .prologue
    const-string v0, "replacement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    invoke-static {p1}, LK8/a;->t(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, LF8/q0;->l(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, LF8/M;

    if-eqz v0, :cond_1

    check-cast p1, LF8/M;

    invoke-direct {p0, p1}, Lf8/g;->i1(LF8/M;)LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LF8/y;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, LF8/y;

    invoke-virtual {v0}, LF8/y;->e1()LF8/M;

    move-result-object v1

    invoke-direct {p0, v1}, Lf8/g;->i1(LF8/M;)LF8/M;

    move-result-object v1

    invoke-virtual {v0}, LF8/y;->f1()LF8/M;

    move-result-object v0

    invoke-direct {p0, v0}, Lf8/g;->i1(LF8/M;)LF8/M;

    move-result-object v0

    invoke-static {v1, v0}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object v0

    invoke-static {p1}, LF8/s0;->a(LF8/E;)LF8/E;

    move-result-object p1

    invoke-static {v0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public X0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/g;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/g;->j1(LF8/a0;)Lf8/g;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf8/g;->f1()LF8/M;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic e1(LF8/a0;)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/g;->j1(LF8/a0;)Lf8/g;

    move-result-object p1

    return-object p1
.end method

.method protected f1()LF8/M;
    .locals 1

    iget-object v0, p0, Lf8/g;->D:LF8/M;

    return-object v0
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/g;->k1(LF8/M;)Lf8/g;

    move-result-object p1

    return-object p1
.end method

.method public j1(LF8/a0;)Lf8/g;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf8/g;

    invoke-virtual {p0}, Lf8/g;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    invoke-direct {v0, p1}, Lf8/g;-><init>(LF8/M;)V

    return-object v0
.end method

.method public k1(LF8/M;)Lf8/g;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf8/g;

    invoke-direct {v0, p1}, Lf8/g;-><init>(LF8/M;)V

    return-object v0
.end method
