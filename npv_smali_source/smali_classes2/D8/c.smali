.class public final LD8/c;
.super LR7/f;
.source "SourceFile"

# interfaces
.implements LD8/b;


# instance fields
.field private final h0:Li8/d;

.field private final i0:Lk8/c;

.field private final j0:Lk8/g;

.field private final k0:Lk8/h;

.field private final l0:LD8/f;


# direct methods
.method public constructor <init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;Li8/d;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V
    .locals 12

    .prologue
    move-object v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const-string v0, "containingDeclaration"

    move-object v1, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v3, p3

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p11, :cond_0

    sget-object v0, LO7/a0;->a:LO7/a0;

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, LR7/f;-><init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;LO7/a0;)V

    iput-object v8, v7, LD8/c;->h0:Li8/d;

    iput-object v9, v7, LD8/c;->i0:Lk8/c;

    iput-object v10, v7, LD8/c;->j0:Lk8/g;

    iput-object v11, v7, LD8/c;->k0:Lk8/h;

    move-object/from16 v0, p10

    iput-object v0, v7, LD8/c;->l0:LD8/f;

    return-void
.end method

.method public synthetic constructor <init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;Li8/d;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;ILy7/k;)V
    .locals 13

    .prologue
    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v12, v0

    goto :goto_0

    :cond_0
    move-object/from16 v12, p11

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, LD8/c;-><init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;Li8/d;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V

    return-void
.end method


# virtual methods
.method protected B1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LD8/c;
    .locals 14

    move-object v0, p1

    const-string v1, "newOwner"

    invoke-static {p1, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "kind"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "annotations"

    move-object/from16 v5, p5

    invoke-static {v5, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "source"

    move-object/from16 v13, p6

    invoke-static {v13, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LD8/c;

    move-object v3, v0

    check-cast v3, LO7/e;

    move-object/from16 v4, p2

    check-cast v4, LO7/l;

    move-object v0, p0

    iget-boolean v6, v0, LR7/f;->g0:Z

    invoke-virtual {p0}, LD8/c;->C1()Li8/d;

    move-result-object v8

    invoke-virtual {p0}, LD8/c;->h0()Lk8/c;

    move-result-object v9

    invoke-virtual {p0}, LD8/c;->Z()Lk8/g;

    move-result-object v10

    invoke-virtual {p0}, LD8/c;->D1()Lk8/h;

    move-result-object v11

    invoke-virtual {p0}, LD8/c;->k0()LD8/f;

    move-result-object v12

    move-object v2, v1

    invoke-direct/range {v2 .. v13}, LD8/c;-><init>(LO7/e;LO7/l;LP7/g;ZLO7/b$a;Li8/d;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V

    invoke-virtual {p0}, LR7/p;->Z0()Z

    move-result v2

    invoke-virtual {v1, v2}, LR7/p;->h1(Z)V

    return-object v1
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public C1()Li8/d;
    .locals 1

    iget-object v0, p0, LD8/c;->h0:Li8/d;

    return-object v0
.end method

.method public D1()Lk8/h;
    .locals 1

    iget-object v0, p0, LD8/c;->k0:Lk8/h;

    return-object v0
.end method

.method public bridge synthetic J()Lp8/p;
    .locals 1

    invoke-virtual {p0}, LD8/c;->C1()Li8/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LD8/c;->B1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LD8/c;

    move-result-object p1

    return-object p1
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Z()Lk8/g;
    .locals 1

    iget-object v0, p0, LD8/c;->j0:Lk8/g;

    return-object v0
.end method

.method public h0()Lk8/c;
    .locals 1

    iget-object v0, p0, LD8/c;->i0:Lk8/c;

    return-object v0
.end method

.method public k0()LD8/f;
    .locals 1

    iget-object v0, p0, LD8/c;->l0:LD8/f;

    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic x1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/f;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LD8/c;->B1(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LD8/c;

    move-result-object p1

    return-object p1
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
