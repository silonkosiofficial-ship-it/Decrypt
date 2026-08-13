.class public final LF8/A;
.super LF8/y;
.source "SourceFile"

# interfaces
.implements LF8/r0;


# instance fields
.field private final F:LF8/y;

.field private final G:LF8/E;


# direct methods
.method public constructor <init>(LF8/y;LF8/E;)V
    .locals 2

    const-string v0, "origin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/y;->e1()LF8/M;

    move-result-object v0

    invoke-virtual {p1}, LF8/y;->f1()LF8/M;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LF8/y;-><init>(LF8/M;LF8/M;)V

    iput-object p1, p0, LF8/A;->F:LF8/y;

    iput-object p2, p0, LF8/A;->G:LF8/E;

    return-void
.end method


# virtual methods
.method public M()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/A;->G:LF8/E;

    return-object v0
.end method

.method public bridge synthetic O0()LF8/t0;
    .locals 1

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/A;->i1(LG8/g;)LF8/A;

    move-result-object p1

    return-object p1
.end method

.method public a1(Z)LF8/t0;
    .locals 2

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/t0;->a1(Z)LF8/t0;

    move-result-object v0

    invoke-virtual {p0}, LF8/A;->M()LF8/E;

    move-result-object v1

    invoke-virtual {v1}, LF8/E;->Z0()LF8/t0;

    move-result-object v1

    invoke-virtual {v1, p1}, LF8/t0;->a1(Z)LF8/t0;

    move-result-object p1

    invoke-static {v0, p1}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/A;->i1(LG8/g;)LF8/A;

    move-result-object p1

    return-object p1
.end method

.method public c1(LF8/a0;)LF8/t0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LF8/t0;->c1(LF8/a0;)LF8/t0;

    move-result-object p1

    invoke-virtual {p0}, LF8/A;->M()LF8/E;

    move-result-object v0

    invoke-static {p1, v0}, LF8/s0;->d(LF8/t0;LF8/E;)LF8/t0;

    move-result-object p1

    return-object p1
.end method

.method public d1()LF8/M;
    .locals 1

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v0

    invoke-virtual {v0}, LF8/y;->d1()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public g1(Lq8/c;Lq8/f;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "renderer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lq8/f;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF8/A;->M()LF8/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq8/c;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LF8/y;->g1(Lq8/c;Lq8/f;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h1()LF8/y;
    .locals 1

    iget-object v0, p0, LF8/A;->F:LF8/y;

    return-object v0
.end method

.method public i1(LG8/g;)LF8/A;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/A;

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v1

    invoke-virtual {p1, v1}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LF8/y;

    invoke-virtual {p0}, LF8/A;->M()LF8/E;

    move-result-object v2

    invoke-virtual {p1, v2}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LF8/A;-><init>(LF8/y;LF8/E;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[@EnhancedForWarnings("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/A;->M()LF8/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/A;->h1()LF8/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
