.class public final LZ7/d;
.super LZ7/f;
.source "SourceFile"


# instance fields
.field private final h0:LO7/Z;

.field private final i0:LO7/Z;

.field private final j0:LO7/U;


# direct methods
.method public constructor <init>(LO7/e;LO7/Z;LO7/Z;LO7/U;)V
    .locals 16

    .prologue
    move-object/from16 v12, p0

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v15, p4

    const-string v0, "ownerDescriptor"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getterMethod"

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overriddenProperty"

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, LO7/C;->q()LO7/D;

    move-result-object v3

    invoke-interface/range {p2 .. p2}, LO7/C;->h()LO7/u;

    move-result-object v4

    if-eqz v14, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {p4 .. p4}, LO7/I;->getName()Ln8/f;

    move-result-object v6

    invoke-interface/range {p2 .. p2}, LO7/p;->o()LO7/a0;

    move-result-object v7

    sget-object v9, LO7/b$a;->C:LO7/b$a;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v11}, LZ7/f;-><init>(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;LO7/U;LO7/b$a;ZLi7/u;)V

    iput-object v13, v12, LZ7/d;->h0:LO7/Z;

    iput-object v14, v12, LZ7/d;->i0:LO7/Z;

    iput-object v15, v12, LZ7/d;->j0:LO7/U;

    return-void
.end method
