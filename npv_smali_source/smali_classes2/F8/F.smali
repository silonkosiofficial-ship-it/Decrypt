.class public final LF8/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/F$b;
    }
.end annotation


# static fields
.field public static final a:LF8/F;

.field private static final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF8/F;

    invoke-direct {v0}, LF8/F;-><init>()V

    sput-object v0, LF8/F;->a:LF8/F;

    sget-object v0, LF8/F$a;->D:LF8/F$a;

    sput-object v0, LF8/F;->b:Lx7/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LF8/F;LF8/e0;LG8/g;Ljava/util/List;)LF8/F$b;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF8/F;->f(LF8/e0;LG8/g;Ljava/util/List;)LF8/F$b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LO7/e0;Ljava/util/List;)LF8/M;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/V;

    sget-object v1, LF8/X$a;->a:LF8/X$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF8/V;-><init>(LF8/X;Z)V

    sget-object v1, LF8/W;->e:LF8/W$a;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0, p1}, LF8/W$a;->a(LF8/W;LO7/e0;Ljava/util/List;)LF8/W;

    move-result-object p0

    sget-object p1, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {p1}, LF8/a0$a;->i()LF8/a0;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, LF8/V;->h(LF8/W;LF8/a0;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method private final c(LF8/e0;Ljava/util/List;LG8/g;)Ly8/h;
    .locals 2

    .prologue
    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/f0;

    if-eqz v1, :cond_0

    check-cast v0, LO7/f0;

    invoke-interface {v0}, LO7/h;->w()LF8/M;

    move-result-object p1

    invoke-virtual {p1}, LF8/E;->u()Ly8/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v1, v0, LO7/e;

    if-eqz v1, :cond_3

    if-nez p3, :cond_1

    invoke-static {v0}, Lv8/c;->p(LO7/m;)LO7/G;

    move-result-object p3

    invoke-static {p3}, Lv8/c;->o(LO7/G;)LG8/g;

    move-result-object p3

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    check-cast v0, LO7/e;

    if-eqz v1, :cond_2

    invoke-static {v0, p3}, LR7/u;->b(LO7/e;LG8/g;)Ly8/h;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object v1, LF8/f0;->c:LF8/f0$a;

    invoke-virtual {v1, p1, p2}, LF8/f0$a;->b(LF8/e0;Ljava/util/List;)LF8/l0;

    move-result-object p1

    invoke-static {v0, p1, p3}, LR7/u;->a(LO7/e;LF8/l0;LG8/g;)Ly8/h;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of p2, v0, LO7/e0;

    if-eqz p2, :cond_4

    sget-object p1, LH8/g;->G:LH8/g;

    check-cast v0, LO7/e0;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object p2

    invoke-virtual {p2}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "toString(...)"

    invoke-static {p2, p3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p1, p3, p2}, LH8/k;->a(LH8/g;Z[Ljava/lang/String;)LH8/f;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_4
    instance-of p2, p1, LF8/D;

    if-eqz p2, :cond_5

    check-cast p1, LF8/D;

    invoke-virtual {p1}, LF8/D;->b()Ly8/h;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported classifier: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for constructor: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static final d(LF8/M;LF8/M;)LF8/t0;
    .locals 1

    .prologue
    const-string v0, "lowerBound"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LF8/z;

    invoke-direct {v0, p0, p1}, LF8/z;-><init>(LF8/M;LF8/M;)V

    return-object v0
.end method

.method public static final e(LF8/a0;Lt8/n;Z)LF8/M;
    .locals 4

    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    sget-object v1, LH8/g;->E:LH8/g;

    const-string v2, "unknown integer literal type"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, LH8/k;->a(LH8/g;Z[Ljava/lang/String;)LH8/f;

    move-result-object v1

    invoke-static {p0, p1, v0, p2, v1}, LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method private final f(LF8/e0;LG8/g;Ljava/util/List;)LF8/F$b;
    .locals 2

    .prologue
    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p2, p1}, LG8/g;->f(LO7/m;)LO7/h;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, LO7/e0;

    if-eqz v1, :cond_1

    new-instance p2, LF8/F$b;

    check-cast p1, LO7/e0;

    invoke-static {p1, p3}, LF8/F;->b(LO7/e0;Ljava/util/List;)LF8/M;

    move-result-object p1

    invoke-direct {p2, p1, v0}, LF8/F$b;-><init>(LF8/M;LF8/e0;)V

    return-object p2

    :cond_1
    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object p1

    invoke-interface {p1, p2}, LF8/e0;->v(LG8/g;)LF8/e0;

    move-result-object p1

    const-string p2, "refine(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LF8/F$b;

    invoke-direct {p2, v0, p1}, LF8/F$b;-><init>(LF8/M;LF8/e0;)V

    return-object p2

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static final g(LF8/a0;LO7/e;Ljava/util/List;)LF8/M;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/h;->p()LF8/e0;

    move-result-object v2

    const-string p1, "getTypeConstructor(...)"

    invoke-static {v2, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LF8/M;LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;
    .locals 7

    const-string v0, "baseType"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "annotations"

    invoke-static {p1, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "constructor"

    invoke-static {p2, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "arguments"

    invoke-static {p3, p0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-static/range {v0 .. v6}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final i(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;
    .locals 8

    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v7}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;)LF8/M;
    .locals 7

    .prologue
    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p0}, LO7/h;->w()LF8/M;

    move-result-object p0

    const-string p1, "getDefaultType(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    sget-object v0, LF8/F;->a:LF8/F;

    invoke-direct {v0, p1, p2, p4}, LF8/F;->c(LF8/e0;Ljava/util/List;LG8/g;)Ly8/h;

    move-result-object v5

    new-instance v6, LF8/F$c;

    invoke-direct {v6, p1, p2, p0, p3}, LF8/F$c;-><init>(LF8/e0;Ljava/util/List;LF8/a0;Z)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-static/range {v1 .. v6}, LF8/F;->n(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(LF8/M;LF8/a0;LF8/e0;Ljava/util/List;ZILjava/lang/Object;)LF8/M;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    invoke-virtual {p0}, LF8/E;->V0()LF8/a0;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_2

    invoke-virtual {p0}, LF8/E;->U0()Ljava/util/List;

    move-result-object p3

    :cond_2
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_3

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result p4

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, LF8/F;->h(LF8/M;LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LF8/F;->j(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;)LF8/M;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;
    .locals 8

    .prologue
    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/N;

    new-instance v7, LF8/F$d;

    move-object v1, v7

    move-object v2, p1

    move-object v3, p2

    move-object v4, p0

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LF8/F$d;-><init>(LF8/e0;Ljava/util/List;LF8/a0;ZLy8/h;)V

    move-object v1, v0

    move v4, p3

    move-object v5, p4

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, LF8/N;-><init>(LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LF8/O;

    invoke-direct {p1, v0, p0}, LF8/O;-><init>(LF8/M;LF8/a0;)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public static final n(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)LF8/M;
    .locals 7

    .prologue
    const-string v0, "attributes"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refinedTypeFactory"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/N;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LF8/N;-><init>(LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)V

    invoke-virtual {p0}, LM8/a;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LF8/O;

    invoke-direct {p1, v0, p0}, LF8/O;-><init>(LF8/M;LF8/a0;)V

    move-object v0, p1

    :goto_0
    return-object v0
.end method
