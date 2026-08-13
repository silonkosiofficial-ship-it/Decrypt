.class public final Ln1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/o$a;,
        Ln1/o$b;
    }
.end annotation


# static fields
.field public static final g:Ln1/o$a;

.field public static final h:I

.field private static i:I


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:I

.field private c:Z

.field private d:I

.field private e:Ljava/util/ArrayList;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/o$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/o;->g:Ln1/o$a;

    const/16 v0, 0x8

    sput v0, Ln1/o;->h:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    iput p1, p0, Ln1/o;->d:I

    const/4 p1, -0x1

    iput p1, p0, Ln1/o;->f:I

    sget p1, Ln1/o;->i:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Ln1/o;->i:I

    iput p1, p0, Ln1/o;->b:I

    return-void
.end method

.method private final e()Ljava/lang/String;
    .locals 2

    .prologue
    iget v0, p0, Ln1/o;->d:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const-string v0, "Unknown"

    goto :goto_0

    :cond_0
    const-string v0, "Both"

    goto :goto_0

    :cond_1
    const-string v0, "Vertical"

    goto :goto_0

    :cond_2
    const-string v0, "Horizontal"

    :goto_0
    return-object v0
.end method

.method private final j(Le1/d;Ljava/util/ArrayList;I)I
    .locals 21

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/e;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lm1/f;

    invoke-virtual/range {p1 .. p1}, Le1/d;->H()V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6, v2, v5}, Lm1/e;->d(Le1/d;Z)V

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v7, v5

    :goto_0
    const-string v8, "get(...)"

    if-ge v7, v0, :cond_0

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lm1/e;

    invoke-virtual {v9, v2, v5}, Lm1/e;->d(Le1/d;Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    if-nez v4, :cond_1

    invoke-virtual {v6}, Lm1/f;->x2()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, Lm1/b;->a:Lm1/b$a;

    invoke-virtual {v0, v6, v2, v3, v5}, Lm1/b$a;->b(Lm1/f;Le1/d;Ljava/util/ArrayList;I)V

    :cond_1
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    invoke-virtual {v6}, Lm1/f;->D2()I

    move-result v7

    if-lez v7, :cond_2

    sget-object v7, Lm1/b;->a:Lm1/b$a;

    invoke-virtual {v7, v6, v2, v3, v0}, Lm1/b$a;->b(Lm1/f;Le1/d;Ljava/util/ArrayList;I)V

    :cond_2
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Le1/d;->D()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v7, v0

    invoke-static {v7}, Li7/g;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v10, "["

    const-string v11, "   at "

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string v16, ","

    const-string v17, "\n   at"

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "]"

    const-string v11, ""

    invoke-static/range {v9 .. v14}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v7, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Ln1/o;->e:Ljava/util/ArrayList;

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_2
    if-ge v5, v0, :cond_3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    new-instance v9, Ln1/o$b;

    invoke-direct {v9, v7, v2, v4}, Ln1/o$b;-><init>(Lm1/e;Le1/d;I)V

    iget-object v7, v1, Ln1/o;->e:Ljava/util/ArrayList;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    if-nez v4, :cond_4

    invoke-virtual {v6}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Le1/d;->B(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v6}, Lm1/e;->b0()Lm1/d;

    move-result-object v3

    :goto_3
    invoke-virtual {v2, v3}, Le1/d;->B(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Le1/d;->H()V

    sub-int/2addr v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Le1/d;->B(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v6}, Lm1/e;->G()Lm1/d;

    move-result-object v3

    goto :goto_3

    :goto_4
    return v3
.end method


# virtual methods
.method public final a(Lm1/e;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/util/ArrayList;)V
    .locals 6

    .prologue
    const-string v0, "dependencyLists"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Ln1/o;->f:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-lez v0, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ln1/o;

    iget v4, p0, Ln1/o;->f:I

    iget v5, v3, Ln1/o;->b:I

    if-ne v4, v5, :cond_0

    iget v4, p0, Ln1/o;->d:I

    invoke-virtual {p0, v4, v3}, Ln1/o;->g(ILn1/o;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Ln1/o;->b:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ln1/o;->d:I

    return v0
.end method

.method public final f(Le1/d;I)I
    .locals 1

    .prologue
    const-string v0, "system"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0, p2}, Ln1/o;->j(Le1/d;Ljava/util/ArrayList;I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final g(ILn1/o;)V
    .locals 3

    .prologue
    const-string v0, "widgetGroup"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lm1/e;

    invoke-virtual {p2, v1}, Ln1/o;->a(Lm1/e;)Z

    invoke-virtual {p2}, Ln1/o;->c()I

    move-result v2

    if-nez p1, :cond_0

    invoke-virtual {v1, v2}, Lm1/e;->s1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Lm1/e;->Q1(I)V

    goto :goto_0

    :cond_1
    iget p1, p2, Ln1/o;->b:I

    iput p1, p0, Ln1/o;->f:I

    return-void
.end method

.method public final h(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/o;->c:Z

    return-void
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Ln1/o;->d:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    invoke-direct {p0}, Ln1/o;->e()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Ln1/o;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] <"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ln1/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " >"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
