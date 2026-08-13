.class public abstract Lg8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LO7/G;LE8/n;LO7/J;La8/f;Lg8/r;Lg8/j;LB8/r;Lm8/e;)Lg8/h;
    .locals 15

    move-object v2, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move-object/from16 v0, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    const-string v5, "module"

    invoke-static {p0, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "storageManager"

    invoke-static {v1, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "notFoundClasses"

    invoke-static {v7, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "lazyJavaPackageFragmentProvider"

    move-object/from16 v6, p3

    invoke-static {v6, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "reflectKotlinClassFinder"

    invoke-static {v0, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "deserializedDescriptorResolver"

    invoke-static {v3, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "errorReporter"

    move-object/from16 v8, p6

    invoke-static {v8, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "jvmMetadataVersion"

    invoke-static {v4, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lg8/k;

    invoke-direct {v5, v0, v3}, Lg8/k;-><init>(Lg8/r;Lg8/j;)V

    invoke-static {p0, v7, v1, v0, v4}, Lg8/f;->a(LO7/G;LO7/J;LE8/n;Lg8/r;Lm8/e;)Lg8/e;

    move-result-object v9

    new-instance v13, Lg8/h;

    sget-object v3, LB8/l$a;->a:LB8/l$a;

    sget-object v10, LW7/c$a;->a:LW7/c$a;

    sget-object v0, LB8/j;->a:LB8/j$a;

    invoke-virtual {v0}, LB8/j$a;->a()LB8/j;

    move-result-object v11

    sget-object v0, LG8/l;->b:LG8/l$a;

    invoke-virtual {v0}, LG8/l$a;->a()LG8/m;

    move-result-object v12

    new-instance v14, LI8/a;

    sget-object v0, LF8/n;->a:LF8/n;

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v14, v0}, LI8/a;-><init>(Ljava/util/List;)V

    move-object v0, v13

    move-object v4, v5

    move-object v5, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v14

    invoke-direct/range {v0 .. v12}, Lg8/h;-><init>(LE8/n;LO7/G;LB8/l;Lg8/k;Lg8/e;La8/f;LO7/J;LB8/r;LW7/c;LB8/j;LG8/l;LI8/a;)V

    return-object v13
.end method

.method public static final b(LX7/p;LO7/G;LE8/n;LO7/J;Lg8/r;Lg8/j;LB8/r;Ld8/b;La8/i;Lg8/z;)La8/f;
    .locals 31

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move-object/from16 v9, p3

    move-object/from16 v2, p0

    move-object/from16 v15, p1

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v6, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    const-string v0, "javaClassFinder"

    move-object/from16 v5, p0

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v14, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {v13, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectKotlinClassFinder"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaSourceElementFactory"

    move-object/from16 v5, p7

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "singleModuleClassResolver"

    move-object/from16 v5, p8

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    move-object/from16 v5, p9

    invoke-static {v5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, La8/b;

    move-object v0, v8

    sget-object v7, LY7/j;->a:LY7/j;

    move-object v5, v7

    move-object/from16 p0, v8

    const-string v8, "DO_NOTHING"

    invoke-static {v7, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LY7/g;->a:LY7/g;

    move-object v7, v8

    const-string v9, "EMPTY"

    invoke-static {v8, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LY7/f$a;->a:LY7/f$a;

    move-object/from16 v9, p0

    new-instance v14, Lx8/b;

    move-object/from16 p0, v0

    move-object/from16 v27, v9

    move-object/from16 v0, p3

    move-object v9, v14

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v16

    move-object/from16 v28, v1

    move-object/from16 v1, v16

    check-cast v1, Ljava/lang/Iterable;

    invoke-direct {v14, v13, v1}, Lx8/b;-><init>(LE8/n;Ljava/lang/Iterable;)V

    sget-object v13, LO7/d0$a;->a:LO7/d0$a;

    sget-object v14, LW7/c$a;->a:LW7/c$a;

    move-object/from16 v1, p1

    move-object/from16 v29, v2

    new-instance v2, LL7/i;

    move-object/from16 v16, v2

    invoke-direct {v2, v1, v0}, LL7/i;-><init>(LO7/G;LO7/J;)V

    new-instance v0, LX7/d;

    move-object/from16 v17, v0

    sget-object v1, LX7/x;->d:LX7/x$b;

    invoke-virtual {v1}, LX7/x$b;->a()LX7/x;

    move-result-object v2

    invoke-direct {v0, v2}, LX7/d;-><init>(LX7/x;)V

    new-instance v0, Lf8/l;

    move-object/from16 v18, v0

    new-instance v2, Lf8/d;

    move-object/from16 v30, v3

    sget-object v3, La8/c$a;->a:La8/c$a;

    move-object/from16 v20, v3

    invoke-direct {v2, v3}, Lf8/d;-><init>(La8/c;)V

    invoke-direct {v0, v2}, Lf8/l;-><init>(Lf8/d;)V

    sget-object v19, LX7/q$a;->a:LX7/q$a;

    sget-object v0, LG8/l;->b:LG8/l$a;

    invoke-virtual {v0}, LG8/l$a;->a()LG8/m;

    move-result-object v21

    invoke-virtual {v1}, LX7/x$b;->a()LX7/x;

    move-result-object v22

    new-instance v0, Lg8/i$a;

    move-object/from16 v23, v0

    invoke-direct {v0}, Lg8/i$a;-><init>()V

    const/high16 v25, 0x800000

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v28

    move-object/from16 v2, v29

    move-object/from16 v3, v30

    invoke-direct/range {v0 .. v26}, La8/b;-><init>(LE8/n;LX7/p;Lg8/r;Lg8/j;LY7/j;LB8/r;LY7/g;LY7/f;Lx8/a;Ld8/b;La8/i;Lg8/z;LO7/d0;LW7/c;LO7/G;LL7/i;LX7/d;Lf8/l;LX7/q;La8/c;LG8/l;LX7/x;LX7/u;Lw8/f;ILy7/k;)V

    new-instance v0, La8/f;

    move-object/from16 v1, v27

    invoke-direct {v0, v1}, La8/f;-><init>(La8/b;)V

    return-object v0
.end method

.method public static synthetic c(LX7/p;LO7/G;LE8/n;LO7/J;Lg8/r;Lg8/j;LB8/r;Ld8/b;La8/i;Lg8/z;ILjava/lang/Object;)La8/f;
    .locals 11

    .prologue
    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    sget-object v0, Lg8/z$a;->a:Lg8/z$a;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-static/range {v1 .. v10}, Lg8/i;->b(LX7/p;LO7/G;LE8/n;LO7/J;Lg8/r;Lg8/j;LB8/r;Ld8/b;La8/i;Lg8/z;)La8/f;

    move-result-object v0

    return-object v0
.end method
