.class public final LC8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL7/a;


# instance fields
.field private final b:LC8/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LC8/d;

    invoke-direct {v0}, LC8/d;-><init>()V

    iput-object v0, p0, LC8/b;->b:LC8/d;

    return-void
.end method


# virtual methods
.method public a(LE8/n;LO7/G;Ljava/lang/Iterable;LQ7/c;LQ7/a;Z)LO7/L;
    .locals 10

    const-string v0, "storageManager"

    move-object v2, p1

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtInsModule"

    move-object v3, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptorFactories"

    move-object v5, p3

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    move-object v6, p4

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    move-object v7, p5

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, LL7/j;->F:Ljava/util/Set;

    new-instance v9, LC8/b$a;

    move-object v0, p0

    iget-object v1, v0, LC8/b;->b:LC8/d;

    invoke-direct {v9, v1}, LC8/b$a;-><init>(Ljava/lang/Object;)V

    move-object v1, p0

    move/from16 v8, p6

    invoke-virtual/range {v1 .. v9}, LC8/b;->b(LE8/n;LO7/G;Ljava/util/Set;Ljava/lang/Iterable;LQ7/c;LQ7/a;ZLx7/l;)LO7/L;

    move-result-object v1

    return-object v1
.end method

.method public final b(LE8/n;LO7/G;Ljava/util/Set;Ljava/lang/Iterable;LQ7/c;LQ7/a;ZLx7/l;)LO7/L;
    .locals 26

    .prologue
    move-object/from16 v11, p1

    move-object/from16 v14, p2

    move-object/from16 v0, p3

    move-object/from16 v6, p8

    const-string v1, "storageManager"

    invoke-static {v11, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "module"

    invoke-static {v14, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "packageFqNames"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "classDescriptorFactories"

    move-object/from16 v15, p4

    invoke-static {v15, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "platformDependentDeclarationFilter"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "additionalClassPartsProvider"

    move-object/from16 v10, p6

    invoke-static {v10, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loadResource"

    invoke-static {v6, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln8/c;

    sget-object v0, LC8/a;->r:LC8/a;

    invoke-virtual {v0, v1}, LC8/a;->r(Ln8/c;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/io/InputStream;

    if-eqz v4, :cond_0

    sget-object v0, LC8/c;->Q:LC8/c$a;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p7

    invoke-virtual/range {v0 .. v5}, LC8/c$a;->a(Ln8/c;LE8/n;LO7/G;Ljava/io/InputStream;Z)LC8/c;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Resource not found in classpath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v2, LO7/M;

    move-object v6, v2

    invoke-direct {v2, v9}, LO7/M;-><init>(Ljava/util/Collection;)V

    new-instance v1, LO7/J;

    move-object v12, v1

    invoke-direct {v1, v11, v14}, LO7/J;-><init>(LE8/n;LO7/G;)V

    new-instance v8, LB8/k;

    move-object v0, v8

    sget-object v3, LB8/l$a;->a:LB8/l$a;

    new-instance v5, LB8/n;

    move-object v4, v5

    invoke-direct {v5, v2}, LB8/n;-><init>(LO7/L;)V

    new-instance v7, LB8/d;

    move-object v5, v7

    move-object/from16 p3, v2

    sget-object v2, LC8/a;->r:LC8/a;

    invoke-direct {v7, v14, v1, v2}, LB8/d;-><init>(LO7/G;LO7/J;LA8/a;)V

    sget-object v7, LB8/w$a;->a:LB8/w$a;

    sget-object v1, LB8/r;->a:LB8/r;

    move-object/from16 v23, v8

    move-object v8, v1

    move-object/from16 v16, v9

    const-string v9, "DO_NOTHING"

    invoke-static {v1, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, LW7/c$a;->a:LW7/c$a;

    move-object/from16 v24, v16

    sget-object v1, LB8/s$a;->a:LB8/s$a;

    move-object v10, v1

    sget-object v1, LB8/j;->a:LB8/j$a;

    invoke-virtual {v1}, LB8/j$a;->a()LB8/j;

    move-result-object v1

    move-object v13, v1

    invoke-virtual {v2}, LA8/a;->e()Lp8/g;

    move-result-object v16

    new-instance v1, Lx8/b;

    move-object/from16 v18, v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-direct {v1, v11, v2}, Lx8/b;-><init>(LE8/n;Ljava/lang/Iterable;)V

    const/high16 v21, 0xd0000

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p1

    move-object/from16 v25, p3

    move-object/from16 v2, p2

    move-object/from16 v11, p4

    move-object/from16 v14, p6

    move-object/from16 v15, p5

    invoke-direct/range {v0 .. v22}, LB8/k;-><init>(LE8/n;LO7/G;LB8/l;LB8/h;LB8/c;LO7/L;LB8/w;LB8/r;LW7/c;LB8/s;Ljava/lang/Iterable;LO7/J;LB8/j;LQ7/a;LQ7/c;Lp8/g;LG8/l;Lx8/a;Ljava/util/List;LB8/q;ILy7/k;)V

    invoke-interface/range {v24 .. v24}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC8/c;

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, LB8/p;->U0(LB8/k;)V

    goto :goto_1

    :cond_2
    return-object v25
.end method
