.class public final Lg8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/h$a;
    }
.end annotation


# static fields
.field public static final b:Lg8/h$a;


# instance fields
.field private final a:LB8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg8/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lg8/h;->b:Lg8/h$a;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/G;LB8/l;Lg8/k;Lg8/e;La8/f;LO7/J;LB8/r;LW7/c;LB8/j;LG8/l;LI8/a;)V
    .locals 24

    .prologue
    move-object/from16 v1, p1

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDataFinder"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationAndConstantLoader"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragmentProvider"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    move-object/from16 v12, p7

    invoke-static {v12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contractDeserializer"

    move-object/from16 v13, p10

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p11

    invoke-static {v15, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttributeTranslators"

    move-object/from16 v7, p12

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-interface/range {p2 .. p2}, LO7/G;->t()LL7/g;

    move-result-object v0

    instance-of v10, v0, LN7/f;

    if-eqz v10, :cond_0

    check-cast v0, LN7/f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v14, LB8/k;

    sget-object v10, LB8/w$a;->a:LB8/w$a;

    sget-object v11, Lg8/l;->a:Lg8/l;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v16

    move-object/from16 v17, v16

    check-cast v17, Ljava/lang/Iterable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LN7/f;->I0()LN7/i;

    move-result-object v16

    if-eqz v16, :cond_1

    :goto_1
    move-object/from16 v21, v16

    goto :goto_2

    :cond_1
    sget-object v16, LQ7/a$a;->a:LQ7/a$a;

    goto :goto_1

    :goto_2
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LN7/f;->I0()LN7/i;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_3
    move-object/from16 v22, v0

    goto :goto_4

    :cond_2
    sget-object v0, LQ7/c$b;->a:LQ7/c$b;

    goto :goto_3

    :goto_4
    sget-object v0, Lm8/i;->a:Lm8/i;

    invoke-virtual {v0}, Lm8/i;->a()Lp8/g;

    move-result-object v16

    new-instance v0, Lx8/b;

    move-object/from16 v18, v0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v19

    move-object/from16 v2, v19

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v0, v1, v2}, Lx8/b;-><init>(LE8/n;Ljava/lang/Iterable;)V

    invoke-virtual/range {p12 .. p12}, LI8/a;->a()Ljava/util/List;

    move-result-object v19

    sget-object v20, LB8/u;->a:LB8/u;

    move-object v0, v14

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object v7, v10

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v23, v14

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    move-object/from16 v17, p11

    invoke-direct/range {v0 .. v20}, LB8/k;-><init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    iput-object v1, v0, Lg8/h;->a:LB8/k;

    return-void
.end method


# virtual methods
.method public final a()LB8/k;
    .locals 1

    iget-object v0, p0, Lg8/h;->a:LB8/k;

    return-object v0
.end method
