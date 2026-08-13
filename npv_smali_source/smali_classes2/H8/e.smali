.class public final LH8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/U;


# instance fields
.field private final synthetic C:LR7/C;


# direct methods
.method public constructor <init>()V
    .locals 21

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0}, LH8/k;->h()LH8/a;

    move-result-object v1

    sget-object v2, LP7/g;->d:LP7/g$a;

    invoke-virtual {v2}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    sget-object v3, LO7/D;->F:LO7/D;

    sget-object v4, LO7/t;->e:LO7/u;

    sget-object v5, LH8/b;->H:LH8/b;

    invoke-virtual {v5}, LH8/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    sget-object v7, LO7/b$a;->C:LO7/b$a;

    sget-object v8, LO7/a0;->a:LO7/a0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, LR7/C;->X0(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)LR7/C;

    move-result-object v1

    invoke-virtual {v0}, LH8/k;->k()LF8/E;

    move-result-object v16

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v17

    const/16 v19, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v20

    const/16 v18, 0x0

    move-object v15, v1

    invoke-virtual/range {v15 .. v20}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    move-object/from16 v0, p0

    iput-object v1, v0, LH8/e;->C:LR7/C;

    return-void
.end method


# virtual methods
.method public A0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->A0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public B()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->B()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public B0()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->B0()Z

    move-result v0

    return v0
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->C()Z

    move-result v0

    return v0
.end method

.method public D(LO7/a$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0, p1}, LR7/C;->D(LO7/a$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->F()Z

    move-result v0

    return v0
.end method

.method public G0(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0, p1}, LR7/C;->G0(Ljava/util/Collection;)V

    return-void
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/M;->L()Z

    move-result v0

    return v0
.end method

.method public N0()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->N0()Z

    move-result v0

    return v0
.end method

.method public R()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->R()Z

    move-result v0

    return v0
.end method

.method public T()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->T()Z

    move-result v0

    return v0
.end method

.method public a()LO7/U;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/a;
    .locals 1

    invoke-virtual {p0}, LH8/e;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/b;
    .locals 1

    invoke-virtual {p0}, LH8/e;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LH8/e;->a()LO7/U;

    move-result-object v0

    return-object v0
.end method

.method public b()LO7/m;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/k;->b()LO7/m;

    move-result-object v0

    return-object v0
.end method

.method public c(LF8/n0;)LO7/U;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0, p1}, LR7/C;->c(LF8/n0;)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LF8/n0;)LO7/n;
    .locals 0

    invoke-virtual {p0, p1}, LH8/e;->c(LF8/n0;)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public d()LO7/V;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->a1()LR7/D;

    move-result-object v0

    return-object v0
.end method

.method public d0()Lt8/g;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/N;->d0()Lt8/g;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ln8/f;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/j;->getName()Ln8/f;

    move-result-object v0

    return-object v0
.end method

.method public getType()LF8/E;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/M;->getType()LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public h()LO7/u;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->h()LO7/u;

    move-result-object v0

    return-object v0
.end method

.method public i()LO7/W;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->i()LO7/W;

    move-result-object v0

    return-object v0
.end method

.method public i0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/b;
    .locals 6

    iget-object v0, p0, LH8/e;->C:LR7/C;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LR7/C;->W0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/U;

    move-result-object p1

    return-object p1
.end method

.method public j()LO7/b$a;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->j()LO7/b$a;

    move-result-object v0

    return-object v0
.end method

.method public k()LP7/g;
    .locals 2

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LP7/b;->k()LP7/g;

    move-result-object v0

    const-string v1, "<get-annotations>(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public l()LF8/E;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->l()LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public m0()LO7/X;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->m0()LO7/X;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/M;->n()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/k;->o()LO7/a0;

    move-result-object v0

    return-object v0
.end method

.method public q()LO7/D;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->q()LO7/D;

    move-result-object v0

    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0, p1, p2}, LR7/C;->r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t0()Z
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/N;->t0()Z

    move-result v0

    return v0
.end method

.method public v0()LO7/X;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->v0()LO7/X;

    move-result-object v0

    return-object v0
.end method

.method public w0()LO7/w;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->w0()LO7/w;

    move-result-object v0

    return-object v0
.end method

.method public z0()LO7/w;
    .locals 1

    iget-object v0, p0, LH8/e;->C:LR7/C;

    invoke-virtual {v0}, LR7/C;->z0()LO7/w;

    move-result-object v0

    return-object v0
.end method
