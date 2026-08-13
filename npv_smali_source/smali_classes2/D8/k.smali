.class public final LD8/k;
.super LR7/G;
.source "SourceFile"

# interfaces
.implements LD8/b;


# instance fields
.field private final g0:Li8/i;

.field private final h0:Lk8/c;

.field private final i0:Lk8/g;

.field private final j0:Lk8/h;

.field private final k0:LD8/f;


# direct methods
.method public constructor <init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;Li8/i;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V
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

    const-string v0, "name"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, LR7/G;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)V

    iput-object v8, v7, LD8/k;->g0:Li8/i;

    iput-object v9, v7, LD8/k;->h0:Lk8/c;

    iput-object v10, v7, LD8/k;->i0:Lk8/g;

    iput-object v11, v7, LD8/k;->j0:Lk8/h;

    move-object/from16 v0, p10

    iput-object v0, v7, LD8/k;->k0:LD8/f;

    return-void
.end method

.method public synthetic constructor <init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;Li8/i;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;ILy7/k;)V
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

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, LD8/k;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;Li8/i;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic J()Lp8/p;
    .locals 1

    invoke-virtual {p0}, LD8/k;->y1()Li8/i;

    move-result-object v0

    return-object v0
.end method

.method protected U0(LO7/m;LO7/y;LO7/b$a;Ln8/f;LP7/g;LO7/a0;)LR7/p;
    .locals 13

    .prologue
    const-string v0, "newOwner"

    move-object v2, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object/from16 v4, p5

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v12, p6

    invoke-static {v12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/k;

    move-object v3, p2

    check-cast v3, LO7/Z;

    if-nez p4, :cond_0

    invoke-virtual {p0}, LR7/j;->getName()Ln8/f;

    move-result-object v1

    const-string v5, "getName(...)"

    invoke-static {v1, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p4

    :goto_0
    invoke-virtual {p0}, LD8/k;->y1()Li8/i;

    move-result-object v7

    invoke-virtual {p0}, LD8/k;->h0()Lk8/c;

    move-result-object v8

    invoke-virtual {p0}, LD8/k;->Z()Lk8/g;

    move-result-object v9

    invoke-virtual {p0}, LD8/k;->z1()Lk8/h;

    move-result-object v10

    invoke-virtual {p0}, LD8/k;->k0()LD8/f;

    move-result-object v11

    move-object v1, v0

    move-object v2, p1

    move-object/from16 v4, p5

    move-object/from16 v6, p3

    move-object/from16 v12, p6

    invoke-direct/range {v1 .. v12}, LD8/k;-><init>(LO7/m;LO7/Z;LP7/g;Ln8/f;LO7/b$a;Li8/i;Lk8/c;Lk8/g;Lk8/h;LD8/f;LO7/a0;)V

    invoke-virtual {p0}, LR7/p;->Z0()Z

    move-result v1

    invoke-virtual {v0, v1}, LR7/p;->h1(Z)V

    return-object v0
.end method

.method public Z()Lk8/g;
    .locals 1

    iget-object v0, p0, LD8/k;->i0:Lk8/g;

    return-object v0
.end method

.method public h0()Lk8/c;
    .locals 1

    iget-object v0, p0, LD8/k;->h0:Lk8/c;

    return-object v0
.end method

.method public k0()LD8/f;
    .locals 1

    iget-object v0, p0, LD8/k;->k0:LD8/f;

    return-object v0
.end method

.method public y1()Li8/i;
    .locals 1

    iget-object v0, p0, LD8/k;->g0:Li8/i;

    return-object v0
.end method

.method public z1()Lk8/h;
    .locals 1

    iget-object v0, p0, LD8/k;->j0:Lk8/h;

    return-object v0
.end method
