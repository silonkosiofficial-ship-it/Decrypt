.class public final LM0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/s;


# instance fields
.field private final a:LM0/d;

.field private final b:Ljava/util/List;

.field private final c:Li7/n;

.field private final d:Li7/n;

.field private final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LM0/d;LM0/P;Ljava/util/List;LY0/e;LR0/h$b;)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LM0/k;->a:LM0/d;

    move-object/from16 v2, p3

    iput-object v2, v0, LM0/k;->b:Ljava/util/List;

    sget-object v2, Li7/r;->E:Li7/r;

    new-instance v3, LM0/k$b;

    invoke-direct {v3, v0}, LM0/k$b;-><init>(LM0/k;)V

    invoke-static {v2, v3}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v3

    iput-object v3, v0, LM0/k;->c:Li7/n;

    new-instance v3, LM0/k$a;

    invoke-direct {v3, v0}, LM0/k$a;-><init>(LM0/k;)V

    invoke-static {v2, v3}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v2

    iput-object v2, v0, LM0/k;->d:Li7/n;

    invoke-virtual/range {p2 .. p2}, LM0/P;->L()LM0/v;

    move-result-object v2

    invoke-static {v1, v2}, LM0/e;->m(LM0/d;LM0/v;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LM0/d$c;

    invoke-virtual {v7}, LM0/d$c;->f()I

    move-result v8

    invoke-virtual {v7}, LM0/d$c;->d()I

    move-result v9

    invoke-static {v1, v8, v9}, LM0/e;->e(LM0/d;II)LM0/d;

    move-result-object v8

    invoke-virtual {v7}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LM0/v;

    invoke-static {v0, v9, v2}, LM0/k;->d(LM0/k;LM0/v;LM0/v;)LM0/v;

    move-result-object v9

    new-instance v10, LM0/r;

    invoke-virtual {v8}, LM0/d;->i()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v15, p2

    invoke-virtual {v15, v9}, LM0/P;->H(LM0/v;)LM0/P;

    move-result-object v12

    invoke-virtual {v8}, LM0/d;->g()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, LM0/k;->g()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, LM0/d$c;->f()I

    move-result v9

    invoke-virtual {v7}, LM0/d$c;->d()I

    move-result v14

    invoke-static {v8, v9, v14}, LM0/l;->a(Ljava/util/List;II)Ljava/util/List;

    move-result-object v14

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    invoke-static/range {v11 .. v16}, LM0/t;->a(Ljava/lang/String;LM0/P;Ljava/util/List;Ljava/util/List;LY0/e;LR0/h$b;)LM0/s;

    move-result-object v8

    invoke-virtual {v7}, LM0/d$c;->f()I

    move-result v9

    invoke-virtual {v7}, LM0/d$c;->d()I

    move-result v7

    invoke-direct {v10, v8, v9, v7}, LM0/r;-><init>(LM0/s;II)V

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    iput-object v4, v0, LM0/k;->e:Ljava/util/List;

    return-void
.end method

.method public static final synthetic d(LM0/k;LM0/v;LM0/v;)LM0/v;
    .locals 0

    invoke-direct {p0, p1, p2}, LM0/k;->h(LM0/v;LM0/v;)LM0/v;

    move-result-object p0

    return-object p0
.end method

.method private final h(LM0/v;LM0/v;)LM0/v;
    .locals 14

    .prologue
    invoke-virtual {p1}, LM0/v;->i()I

    move-result v0

    sget-object v1, LX0/l;->b:LX0/l$a;

    invoke-virtual {v1}, LX0/l$a;->f()I

    move-result v1

    invoke-static {v0, v1}, LX0/l;->j(II)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LM0/v;->i()I

    move-result v3

    const/16 v12, 0x1fd

    const/4 v13, 0x0

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, LM0/v;->b(LM0/v;IIJLX0/r;LM0/y;LX0/h;IILX0/t;ILjava/lang/Object;)LM0/v;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, LM0/k;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LM0/k;->d:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 5

    .prologue
    iget-object v0, p0, LM0/k;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LM0/r;

    invoke-virtual {v4}, LM0/r;->b()LM0/s;

    move-result-object v4

    invoke-interface {v4}, LM0/s;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public final e()LM0/d;
    .locals 1

    iget-object v0, p0, LM0/k;->a:LM0/d;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM0/k;->e:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM0/k;->b:Ljava/util/List;

    return-object v0
.end method
