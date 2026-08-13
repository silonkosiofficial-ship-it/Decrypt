.class public final LH8/c;
.super LR7/G;
.source "SourceFile"


# direct methods
.method public constructor <init>(LO7/e;)V
    .locals 17

    const-string v0, "containingDeclaration"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v4

    sget-object v0, LH8/b;->E:LH8/b;

    invoke-virtual {v0}, LH8/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    sget-object v6, LO7/b$a;->C:LO7/b$a;

    sget-object v7, LO7/a0;->a:LO7/a0;

    const/4 v3, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v7}, LR7/G;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v11

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v12

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v13

    sget-object v0, LH8/j;->M:LH8/j;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v14

    sget-object v15, LO7/D;->F:LO7/D;

    sget-object v16, LO7/t;->e:LO7/u;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v8, p0

    invoke-virtual/range {v8 .. v16}, LR7/G;->w1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/G;

    return-void
.end method


# virtual methods
.method public D(LO7/a$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public G0(Ljava/util/Collection;)V
    .locals 1

    const-string v0, "overriddenDescriptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 0

    const-string p2, "newOwner"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "annotations"

    invoke-static {p5, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {p6, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public bridge synthetic i0(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LH8/c;->t1(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/Z;

    move-result-object p1

    return-object p1
.end method

.method public t1(LO7/m;LO7/D;LO7/u;LO7/b$a;Z)LO7/Z;
    .locals 0

    const-string p5, "newOwner"

    invoke-static {p1, p5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modality"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "visibility"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "kind"

    invoke-static {p4, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z()LO7/y$a;
    .locals 1

    new-instance v0, LH8/c$a;

    invoke-direct {v0, p0}, LH8/c$a;-><init>(LH8/c;)V

    return-object v0
.end method
