.class public final Ls8/a;
.super LF8/M;
.source "SourceFile"

# interfaces
.implements LJ8/d;


# instance fields
.field private final D:LF8/i0;

.field private final E:Ls8/b;

.field private final F:Z

.field private final G:LF8/a0;


# direct methods
.method public constructor <init>(LF8/i0;Ls8/b;ZLF8/a0;)V
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/M;-><init>()V

    iput-object p1, p0, Ls8/a;->D:LF8/i0;

    iput-object p2, p0, Ls8/a;->E:Ls8/b;

    iput-boolean p3, p0, Ls8/a;->F:Z

    iput-object p4, p0, Ls8/a;->G:LF8/a0;

    return-void
.end method

.method public synthetic constructor <init>(LF8/i0;Ls8/b;ZLF8/a0;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    new-instance p2, Ls8/c;

    invoke-direct {p2, p1}, Ls8/c;-><init>(LF8/i0;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p4}, LF8/a0$a;->i()LF8/a0;

    move-result-object p4

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Ls8/a;-><init>(LF8/i0;Ls8/b;ZLF8/a0;)V

    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public V0()LF8/a0;
    .locals 1

    iget-object v0, p0, Ls8/a;->G:LF8/a0;

    return-object v0
.end method

.method public bridge synthetic W0()LF8/e0;
    .locals 1

    invoke-virtual {p0}, Ls8/a;->f1()Ls8/b;

    move-result-object v0

    return-object v0
.end method

.method public X0()Z
    .locals 1

    iget-boolean v0, p0, Ls8/a;->F:Z

    return v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/a;->h1(LG8/g;)Ls8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/a;->g1(Z)Ls8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/a;->h1(LG8/g;)Ls8/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/a;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d1(Z)LF8/M;
    .locals 0

    invoke-virtual {p0, p1}, Ls8/a;->g1(Z)Ls8/a;

    move-result-object p1

    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 4

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls8/a;

    iget-object v1, p0, Ls8/a;->D:LF8/i0;

    invoke-virtual {p0}, Ls8/a;->f1()Ls8/b;

    move-result-object v2

    invoke-virtual {p0}, Ls8/a;->X0()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Ls8/a;-><init>(LF8/i0;Ls8/b;ZLF8/a0;)V

    return-object v0
.end method

.method public f1()Ls8/b;
    .locals 1

    iget-object v0, p0, Ls8/a;->E:Ls8/b;

    return-object v0
.end method

.method public g1(Z)Ls8/a;
    .locals 4

    .prologue
    invoke-virtual {p0}, Ls8/a;->X0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ls8/a;

    iget-object v1, p0, Ls8/a;->D:LF8/i0;

    invoke-virtual {p0}, Ls8/a;->f1()Ls8/b;

    move-result-object v2

    invoke-virtual {p0}, Ls8/a;->V0()LF8/a0;

    move-result-object v3

    invoke-direct {v0, v1, v2, p1, v3}, Ls8/a;-><init>(LF8/i0;Ls8/b;ZLF8/a0;)V

    return-object v0
.end method

.method public h1(LG8/g;)Ls8/a;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls8/a;

    iget-object v1, p0, Ls8/a;->D:LF8/i0;

    invoke-interface {v1, p1}, LF8/i0;->v(LG8/g;)LF8/i0;

    move-result-object p1

    const-string v1, "refine(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls8/a;->f1()Ls8/b;

    move-result-object v1

    invoke-virtual {p0}, Ls8/a;->X0()Z

    move-result v2

    invoke-virtual {p0}, Ls8/a;->V0()LF8/a0;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Ls8/a;-><init>(LF8/i0;Ls8/b;ZLF8/a0;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Captured("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls8/a;->D:LF8/i0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ls8/a;->X0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "?"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ly8/h;
    .locals 3

    sget-object v0, LH8/g;->D:LH8/g;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, LH8/k;->a(LH8/g;Z[Ljava/lang/String;)LH8/f;

    move-result-object v0

    return-object v0
.end method
