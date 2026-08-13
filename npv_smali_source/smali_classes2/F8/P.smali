.class public final LF8/P;
.super LF8/q;
.source "SourceFile"

# interfaces
.implements LF8/r0;


# instance fields
.field private final D:LF8/M;

.field private final E:LF8/E;


# direct methods
.method public constructor <init>(LF8/M;LF8/E;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/q;-><init>()V

    iput-object p1, p0, LF8/P;->D:LF8/M;

    iput-object p2, p0, LF8/P;->E:LF8/E;

    return-void
.end method


# virtual methods
.method public M()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/P;->E:LF8/E;

    return-object v0
.end method

.method public bridge synthetic O0()LF8/t0;
    .locals 1

    invoke-virtual {p0}, LF8/P;->i1()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->j1(LG8/g;)LF8/P;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->j1(LG8/g;)LF8/P;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 2

    invoke-virtual {p0}, LF8/P;->i1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->d1(Z)LF8/M;

    move-result-object v0

    invoke-virtual {p0}, LF8/P;->M()LF8/E;

    move-result-object v1

    invoke-virtual {v1}, LF8/E;->Z0()LF8/t0;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/t0;->a1(Z)LF8/t0;

    move-result-object p1

    invoke-static {v0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/P;->i1()LF8/M;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/M;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    invoke-virtual {p0}, LF8/P;->M()LF8/E;

    move-result-object v0

    invoke-static {p1, v0}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    return-object p1
.end method

.method protected f1()LF8/M;
    .locals 1

    iget-object v0, p0, LF8/P;->D:LF8/M;

    return-object v0
.end method

.method public bridge synthetic g1(LG8/g;)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->j1(LG8/g;)LF8/P;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, LF8/P;->k1(LF8/M;)LF8/P;

    move-result-object p1

    return-object p1
.end method

.method public i1()LF8/M;
    .locals 1

    invoke-virtual {p0}, LF8/P;->f1()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public j1(LG8/g;)LF8/P;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/P;

    invoke-virtual {p0}, LF8/P;->f1()LF8/M;

    move-result-object v1

    invoke-virtual {p1, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LF8/M;

    invoke-virtual {p0}, LF8/P;->M()LF8/E;

    move-result-object v2

    invoke-virtual {p1, v2}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LF8/P;-><init>(LF8/M;LF8/E;)V

    return-object v0
.end method

.method public k1(LF8/M;)LF8/P;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/P;

    invoke-virtual {p0}, LF8/P;->M()LF8/E;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LF8/P;-><init>(LF8/M;LF8/E;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[@EnhancedForWarnings("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/P;->M()LF8/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/P;->i1()LF8/M;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
