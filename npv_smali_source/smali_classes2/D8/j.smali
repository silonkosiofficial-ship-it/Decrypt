.class public final LD8/j;
.super LR7/C;
.source "SourceFile"

# interfaces
.implements LD8/b;


# instance fields
.field private final e0:Li8/n;

.field private final f0:Lk8/c;

.field private final g0:Lk8/g;

.field private final h0:Lk8/h;

.field private final i0:LD8/f;


# direct methods
.method public constructor <init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;ZZZZZLi8/n;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V
    .locals 17

    move-object/from16 v15, p0

    move-object/from16 v14, p14

    move-object/from16 v13, p15

    move-object/from16 v12, p16

    move-object/from16 v11, p17

    const-string v0, "containingDeclaration"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modality"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v14, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LO7/a0;->a:LO7/a0;

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v6, p6

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p13

    move/from16 v13, v16

    move/from16 v14, p11

    move/from16 v15, p12

    invoke-direct/range {v0 .. v15}, LR7/C;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)V

    move-object/from16 v1, p14

    iput-object v1, v0, LD8/j;->e0:Li8/n;

    move-object/from16 v1, p15

    iput-object v1, v0, LD8/j;->f0:Lk8/c;

    move-object/from16 v1, p16

    iput-object v1, v0, LD8/j;->g0:Lk8/g;

    move-object/from16 v1, p17

    iput-object v1, v0, LD8/j;->h0:Lk8/h;

    move-object/from16 v1, p18

    iput-object v1, v0, LD8/j;->i0:LD8/f;

    return-void
.end method


# virtual methods
.method public C()Z
    .locals 2

    sget-object v0, Lk8/b;->E:Lk8/b$b;

    invoke-virtual {p0}, LD8/j;->o1()Li8/n;

    move-result-object v1

    invoke-virtual {v1}, Li8/n;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic J()Lp8/p;
    .locals 1

    invoke-virtual {p0}, LD8/j;->o1()Li8/n;

    move-result-object v0

    return-object v0
.end method

.method protected Y0(LO7/m;LO7/D;LO7/u;LO7/U;LO7/b$a;Ln8/f;LO7/a0;)LR7/C;
    .locals 20

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v2, p4

    move-object/from16 v8, p5

    move-object/from16 v7, p6

    const-string v0, "newOwner"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newModality"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newVisibility"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v3, p5

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    move-object/from16 v3, p6

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v3, p7

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v19, LD8/j;

    move-object/from16 v0, v19

    invoke-virtual/range {p0 .. p0}, LP7/b;->k()LP7/g;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR7/N;->t0()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, LR7/C;->B0()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, LR7/C;->F()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, LD8/j;->C()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, LR7/C;->T()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LR7/C;->R()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, LD8/j;->o1()Li8/n;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, LD8/j;->h0()Lk8/c;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, LD8/j;->Z()Lk8/g;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, LD8/j;->p1()Lk8/h;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, LD8/j;->k0()LD8/f;

    move-result-object v18

    invoke-direct/range {v0 .. v18}, LD8/j;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;ZZZZZLi8/n;Lk8/c;Lk8/g;Lk8/h;LD8/f;)V

    return-object v19
.end method

.method public Z()Lk8/g;
    .locals 1

    iget-object v0, p0, LD8/j;->g0:Lk8/g;

    return-object v0
.end method

.method public h0()Lk8/c;
    .locals 1

    iget-object v0, p0, LD8/j;->f0:Lk8/c;

    return-object v0
.end method

.method public k0()LD8/f;
    .locals 1

    iget-object v0, p0, LD8/j;->i0:LD8/f;

    return-object v0
.end method

.method public o1()Li8/n;
    .locals 1

    iget-object v0, p0, LD8/j;->e0:Li8/n;

    return-object v0
.end method

.method public p1()Lk8/h;
    .locals 1

    iget-object v0, p0, LD8/j;->h0:Lk8/h;

    return-object v0
.end method
