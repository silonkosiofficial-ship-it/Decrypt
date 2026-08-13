.class public final LN7/k;
.super LB8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/k$a;
    }
.end annotation


# static fields
.field public static final f:LN7/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN7/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN7/k$a;-><init>(Ly7/k;)V

    sput-object v0, LN7/k;->f:LN7/k$a;

    return-void
.end method

.method public constructor <init>(LE8/n;Lg8/r;LO7/G;LO7/J;LQ7/a;LQ7/c;LB8/l;LG8/l;Lx8/a;)V
    .locals 25

    move-object/from16 v13, p0

    move-object/from16 v11, p1

    move-object/from16 v10, p3

    move-object/from16 v7, p4

    move-object/from16 v6, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v3, p7

    move-object/from16 v17, p8

    move-object/from16 v18, p9

    const-string v0, "storageManager"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializationConfiguration"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    move-object/from16 v5, p9

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p3}, LB8/a;-><init>(LE8/n;LB8/v;LO7/G;)V

    new-instance v9, LB8/k;

    move-object v0, v9

    new-instance v5, LB8/n;

    move-object v4, v5

    invoke-direct {v5, v13}, LB8/n;-><init>(LO7/L;)V

    new-instance v8, LB8/d;

    move-object v5, v8

    move-object/from16 p2, v0

    sget-object v0, LC8/a;->r:LC8/a;

    invoke-direct {v8, v10, v7, v0}, LB8/d;-><init>(LO7/G;LO7/J;LA8/a;)V

    sget-object v7, LB8/w$a;->a:LB8/w$a;

    sget-object v8, LB8/r;->a:LB8/r;

    move-object/from16 p4, v8

    move-object/from16 p5, v9

    const-string v9, "DO_NOTHING"

    move-object/from16 v10, p4

    invoke-static {v10, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LW7/c$a;->a:LW7/c$a;

    move-object/from16 v10, p5

    sget-object v16, LB8/s$a;->a:LB8/s$a;

    move-object/from16 v13, p3

    move-object/from16 v23, v10

    move-object/from16 v10, v16

    move-object/from16 v24, v1

    new-instance v1, LM7/a;

    invoke-direct {v1, v11, v13}, LM7/a;-><init>(LE8/n;LO7/G;)V

    new-instance v16, LN7/e;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v16

    move-object/from16 p5, p1

    move-object/from16 p6, p3

    move-object/from16 p7, v21

    move/from16 p8, v19

    move-object/from16 p9, v20

    invoke-direct/range {p4 .. p9}, LN7/e;-><init>(LE8/n;LO7/G;Lx7/l;ILy7/k;)V

    const/4 v11, 0x2

    new-array v11, v11, [LQ7/b;

    const/4 v13, 0x0

    aput-object v1, v11, v13

    const/4 v1, 0x1

    aput-object v16, v11, v1

    invoke-static {v11}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Iterable;

    sget-object v1, LB8/j;->a:LB8/j$a;

    invoke-virtual {v1}, LB8/j$a;->a()LB8/j;

    move-result-object v13

    move-object/from16 v1, p0

    invoke-virtual {v0}, LA8/a;->e()Lp8/g;

    move-result-object v16

    sget-object v20, LB8/u;->a:LB8/u;

    const/high16 v21, 0x40000

    const/16 v22, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p2

    move-object/from16 v1, v24

    invoke-direct/range {v0 .. v22}, LB8/k;-><init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;ILy7/k;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, LB8/a;->i(LB8/k;)V

    return-void
.end method


# virtual methods
.method protected d(Ln8/c;)LB8/o;
    .locals 7

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LB8/a;->f()LB8/v;

    move-result-object v0

    invoke-interface {v0, p1}, LB8/v;->c(Ln8/c;)Ljava/io/InputStream;

    move-result-object v5

    if-eqz v5, :cond_0

    sget-object v1, LC8/c;->Q:LC8/c$a;

    invoke-virtual {p0}, LB8/a;->h()LE8/n;

    move-result-object v3

    invoke-virtual {p0}, LB8/a;->g()LO7/G;

    move-result-object v4

    const/4 v6, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, LC8/c$a;->a(Ln8/c;LE8/n;LO7/G;Ljava/io/InputStream;Z)LC8/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
