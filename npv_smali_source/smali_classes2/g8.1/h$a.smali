.class public final Lg8/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/h$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lg8/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg8/r;Lg8/r;LX7/p;Ljava/lang/String;LB8/r;Ld8/b;)Lg8/h$a$a;
    .locals 25

    move-object/from16 v0, p4

    const-string v1, "kotlinClassFinder"

    move-object/from16 v14, p1

    invoke-static {v14, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "jvmBuiltInsKotlinClassFinder"

    move-object/from16 v15, p2

    invoke-static {v15, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "javaClassFinder"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "moduleName"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "javaSourceElementFactory"

    move-object/from16 v9, p6

    invoke-static {v9, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE8/f;

    const-string v3, "DeserializationComponentsForJava.ModuleData"

    invoke-direct {v1, v3}, LE8/f;-><init>(Ljava/lang/String;)V

    new-instance v12, LN7/f;

    sget-object v3, LN7/f$a;->C:LN7/f$a;

    invoke-direct {v12, v1, v3}, LN7/f;-><init>(LE8/n;LN7/f$a;)V

    new-instance v11, LR7/x;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x3c

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3e

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v3, "special(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x38

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v16, v11

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v12

    invoke-direct/range {v16 .. v24}, LR7/x;-><init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;ILy7/k;)V

    invoke-virtual {v12, v11}, LL7/g;->E0(LR7/x;)V

    const/4 v0, 0x1

    invoke-virtual {v12, v11, v0}, LN7/f;->J0(LO7/G;Z)V

    new-instance v10, Lg8/j;

    invoke-direct {v10}, Lg8/j;-><init>()V

    new-instance v8, La8/j;

    invoke-direct {v8}, La8/j;-><init>()V

    new-instance v7, LO7/J;

    invoke-direct {v7, v1, v11}, LO7/J;-><init>(LE8/n;LO7/G;)V

    const/16 v16, 0x200

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v3, v11

    move-object v4, v1

    move-object v5, v7

    move-object/from16 v6, p1

    move-object/from16 v19, v7

    move-object v7, v10

    move-object/from16 p3, v8

    move-object/from16 v8, p5

    move-object/from16 p4, v10

    move-object/from16 v10, p3

    move-object/from16 p6, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v12

    move/from16 v12, v16

    move-object/from16 v13, v17

    invoke-static/range {v2 .. v13}, Lg8/i;->c(LX7/p;LO7/G;LE8/n;LO7/J;Lg8/r;Lg8/j;LB8/r;Ld8/b;La8/i;Lg8/z;ILjava/lang/Object;)La8/f;

    move-result-object v10

    sget-object v9, Lm8/e;->i:Lm8/e;

    move-object/from16 v2, p6

    move-object v3, v1

    move-object/from16 v4, v19

    move-object v5, v10

    move-object/from16 v7, p4

    invoke-static/range {v2 .. v9}, Lg8/i;->a(LO7/G;LE8/n;LO7/J;La8/f;Lg8/r;Lg8/j;LB8/r;Lm8/e;)Lg8/h;

    move-result-object v12

    move-object/from16 v13, p4

    invoke-virtual {v13, v12}, Lg8/j;->n(Lg8/h;)V

    new-instance v14, Lw8/c;

    sget-object v2, LY7/g;->a:LY7/g;

    const-string v3, "EMPTY"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v14, v10, v2}, Lw8/c;-><init>(La8/f;LY7/g;)V

    move-object/from16 v2, p3

    invoke-virtual {v2, v14}, La8/j;->c(Lw8/c;)V

    new-instance v16, LN7/k;

    invoke-virtual/range {v18 .. v18}, LN7/f;->I0()LN7/i;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LN7/f;->I0()LN7/i;

    move-result-object v8

    sget-object v9, LB8/l$a;->a:LB8/l$a;

    sget-object v2, LG8/l;->b:LG8/l$a;

    invoke-virtual {v2}, LG8/l$a;->a()LG8/m;

    move-result-object v10

    new-instance v11, Lx8/b;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v11, v1, v2}, Lx8/b;-><init>(LE8/n;Ljava/lang/Iterable;)V

    move-object/from16 v2, v16

    move-object v3, v1

    move-object/from16 v4, p2

    move-object/from16 v5, p6

    move-object/from16 v6, v19

    invoke-direct/range {v2 .. v11}, LN7/k;-><init>(LE8/n;Lg8/r;LO7/G;LO7/J;LQ7/a;LQ7/c;LB8/l;LG8/l;Lx8/a;)V

    new-array v1, v0, [LR7/x;

    const/4 v2, 0x0

    move-object/from16 v3, p6

    aput-object v3, v1, v2

    invoke-virtual {v3, v1}, LR7/x;->h1([LR7/x;)V

    new-instance v1, LR7/i;

    invoke-virtual {v14}, Lw8/c;->a()La8/f;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [LO7/O;

    aput-object v4, v5, v2

    aput-object v16, v5, v0

    invoke-static {v5}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CompositeProvider@RuntimeModuleData for "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LR7/i;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, LR7/x;->b1(LO7/L;)V

    new-instance v0, Lg8/h$a$a;

    invoke-direct {v0, v12, v13}, Lg8/h$a$a;-><init>(Lg8/h;Lg8/j;)V

    return-object v0
.end method
