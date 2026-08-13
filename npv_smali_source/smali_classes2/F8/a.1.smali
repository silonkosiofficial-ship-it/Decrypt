.class public final LF8/a;
.super LF8/q;
.source "SourceFile"


# instance fields
.field private final D:LF8/M;

.field private final E:LF8/M;


# direct methods
.method public constructor <init>(LF8/M;LF8/M;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviation"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/q;-><init>()V

    iput-object p1, p0, LF8/a;->D:LF8/M;

    iput-object p2, p0, LF8/a;->E:LF8/M;

    return-void
.end method


# virtual methods
.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->k1(LG8/g;)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->j1(Z)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->k1(LG8/g;)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public final c0()LF8/M;
    .locals 1

    invoke-virtual {p0}, LF8/a;->f1()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d1(Z)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->j1(Z)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/a;

    invoke-virtual {p0}, LF8/a;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    iget-object v1, p0, LF8/a;->E:LF8/M;

    invoke-direct {v0, p1, v1}, LF8/a;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method protected f1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/a;->D:LF8/M;

    return-object v0
.end method

.method public bridge synthetic g1(LG8/g;)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->k1(LG8/g;)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, LF8/a;->l1(LF8/M;)LF8/a;

    move-result-object p1

    return-object p1
.end method

.method public final i1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/a;->E:LF8/M;

    return-object v0
.end method

.method public j1(Z)LF8/a;
    .locals 3

    new-instance v0, LF8/a;

    invoke-virtual {p0}, LF8/a;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object v1

    iget-object v2, p0, LF8/a;->E:LF8/M;

    invoke-virtual {v2, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LF8/a;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method public k1(LG8/g;)LF8/a;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/a;

    invoke-virtual {p0}, LF8/a;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {p1, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LF8/M;

    iget-object v3, p0, LF8/a;->E:LF8/M;

    invoke-virtual {p1, v3}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    invoke-direct {v0, v1, p1}, LF8/a;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method public l1(LF8/M;)LF8/a;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/a;

    iget-object v1, p0, LF8/a;->E:LF8/M;

    invoke-direct {v0, p1, v1}, LF8/a;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method
