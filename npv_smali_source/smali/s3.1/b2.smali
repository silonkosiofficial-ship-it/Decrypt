.class public final Ls3/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls3/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/b2;

    invoke-direct {v0}, Ls3/b2;-><init>()V

    sput-object v0, Ls3/b2;->a:Ls3/b2;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ls3/f1;)Ls3/X1;
    .locals 31

    .prologue
    move-object/from16 v0, p2

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->i()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->n()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object v7, v1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    move-object v7, v3

    :goto_0
    invoke-virtual {v0, v1}, Ls3/f1;->q(Landroid/content/Context;)Z

    move-result v8

    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v0, v2}, Ls3/f1;->e(Ljava/lang/Class;)Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->j()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->g()LG3/a;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ls3/y;->b()Lw3/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-static {v2, v1}, Lw3/g;->s([Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_1

    :cond_1
    move-object/from16 v19, v3

    :goto_1
    invoke-virtual/range {p2 .. p2}, Ls3/f1;->p()Z

    move-result v20

    invoke-static {}, Ls3/o1;->h()Ls3/o1;

    move-result-object v1

    invoke-virtual {v1}, Ls3/o1;->e()Lk3/t;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->b()I

    move-result v1

    invoke-virtual {v2}, Lk3/t;->c()I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v2}, Lk3/t;->a()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Ls3/a2;

    invoke-direct {v3}, Ls3/a2;-><init>()V

    invoke-static {v1, v3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->l()Ljava/util/List;

    move-result-object v24

    new-instance v30, Ls3/X1;

    move-object/from16 v1, v30

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->f()Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->d()Landroid/os/Bundle;

    move-result-object v16

    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->m()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->k()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lk3/t;->d()I

    move-result v22

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->a()I

    move-result v25

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->h()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v2}, Lk3/t;->b()Lk3/t$b;

    move-result-object v2

    invoke-virtual {v2}, Lk3/t$b;->e()I

    move-result v27

    invoke-virtual/range {p2 .. p2}, Ls3/f1;->c()J

    move-result-wide v28

    const/16 v2, 0x8

    const-wide/16 v3, -0x1

    const/4 v6, -0x1

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v1 .. v29}, Ls3/X1;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Ls3/M1;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLs3/X;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJ)V

    return-object v30
.end method
