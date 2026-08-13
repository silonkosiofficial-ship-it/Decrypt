.class final Lf8/n;
.super Lf8/a;
.source "SourceFile"


# instance fields
.field private final a:LP7/a;

.field private final b:Z

.field private final c:La8/g;

.field private final d:LX7/b;

.field private final e:Z


# direct methods
.method public constructor <init>(LP7/a;ZLa8/g;LX7/b;Z)V
    .locals 1

    const-string v0, "containerContext"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerApplicabilityType"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf8/a;-><init>()V

    iput-object p1, p0, Lf8/n;->a:LP7/a;

    iput-boolean p2, p0, Lf8/n;->b:Z

    iput-object p3, p0, Lf8/n;->c:La8/g;

    iput-object p4, p0, Lf8/n;->d:LX7/b;

    iput-boolean p5, p0, Lf8/n;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(LP7/a;ZLa8/g;LX7/b;ZILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lf8/n;-><init>(LP7/a;ZLa8/g;LX7/b;Z)V

    return-void
.end method


# virtual methods
.method public A(LJ8/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    invoke-virtual {p1}, LF8/E;->Z0()LF8/t0;

    move-result-object p1

    instance-of p1, p1, Lf8/g;

    return p1
.end method

.method public D(LP7/c;LJ8/i;)Z
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LZ7/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LZ7/g;

    invoke-interface {v0}, LZ7/g;->d()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    instance-of v0, p1, Lb8/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lf8/n;->p()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Lb8/e;

    invoke-virtual {v0}, Lb8/e;->k()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lf8/n;->m()LX7/b;

    move-result-object v0

    sget-object v1, LX7/b;->H:LX7/b;

    if-eq v0, v1, :cond_2

    :cond_1
    if-eqz p2, :cond_3

    check-cast p2, LF8/E;

    invoke-static {p2}, LL7/g;->q0(LF8/E;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lf8/n;->E()LX7/d;

    move-result-object p2

    invoke-virtual {p2, p1}, LX7/a;->m(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lf8/n;->c:La8/g;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->q()La8/c;

    move-result-object p1

    invoke-interface {p1}, La8/c;->c()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public E()LX7/d;
    .locals 1

    iget-object v0, p0, Lf8/n;->c:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->a()LX7/d;

    move-result-object v0

    return-object v0
.end method

.method public F(LJ8/i;)LF8/E;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    invoke-static {p1}, LF8/s0;->a(LF8/E;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method public G()LJ8/q;
    .locals 1

    sget-object v0, LG8/o;->a:LG8/o;

    return-object v0
.end method

.method public bridge synthetic h(Ljava/lang/Object;LJ8/i;)Z
    .locals 0

    check-cast p1, LP7/c;

    invoke-virtual {p0, p1, p2}, Lf8/n;->D(LP7/c;LJ8/i;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic i()LX7/a;
    .locals 1

    invoke-virtual {p0}, Lf8/n;->E()LX7/d;

    move-result-object v0

    return-object v0
.end method

.method public j(LJ8/i;)Ljava/lang/Iterable;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    invoke-virtual {p1}, LF8/E;->k()LP7/g;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/Iterable;
    .locals 1

    .prologue
    iget-object v0, p0, Lf8/n;->a:LP7/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LP7/a;->k()LP7/g;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    :goto_0
    return-object v0
.end method

.method public m()LX7/b;
    .locals 1

    iget-object v0, p0, Lf8/n;->d:LX7/b;

    return-object v0
.end method

.method public n()LX7/y;
    .locals 1

    iget-object v0, p0, Lf8/n;->c:La8/g;

    invoke-virtual {v0}, La8/g;->b()LX7/y;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lf8/n;->a:LP7/a;

    instance-of v1, v0, LO7/j0;

    if-eqz v1, :cond_0

    check-cast v0, LO7/j0;

    invoke-interface {v0}, LO7/j0;->u0()LF8/E;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lf8/n;->c:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->q()La8/c;

    move-result-object v0

    invoke-interface {v0}, La8/c;->d()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic q(LJ8/i;)LJ8/i;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/n;->F(LJ8/i;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method public s(LJ8/i;)Ln8/d;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    invoke-static {p1}, LF8/q0;->f(LF8/E;)LO7/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lr8/f;->m(LO7/m;)Ln8/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lf8/n;->e:Z

    return v0
.end method

.method public bridge synthetic v()LJ8/o;
    .locals 1

    invoke-virtual {p0}, Lf8/n;->G()LJ8/q;

    move-result-object v0

    return-object v0
.end method

.method public w(LJ8/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/E;

    invoke-static {p1}, LL7/g;->d0(LF8/E;)Z

    move-result p1

    return p1
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lf8/n;->b:Z

    return v0
.end method

.method public y(LJ8/i;LJ8/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/n;->c:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->k()LG8/l;

    move-result-object v0

    check-cast p1, LF8/E;

    check-cast p2, LF8/E;

    invoke-interface {v0, p1, p2}, LG8/e;->b(LF8/E;LF8/E;)Z

    move-result p1

    return p1
.end method

.method public z(LJ8/n;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lb8/n;

    return p1
.end method
