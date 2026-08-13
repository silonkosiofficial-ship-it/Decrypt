.class public final Landroidx/compose/foundation/text/modifiers/b;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;
.implements LF0/s;
.implements LF0/z0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/modifiers/b$a;
    }
.end annotation


# instance fields
.field private P:LM0/d;

.field private Q:LM0/P;

.field private R:LR0/h$b;

.field private S:Lx7/l;

.field private T:I

.field private U:Z

.field private V:I

.field private W:I

.field private X:Ljava/util/List;

.field private Y:Lx7/l;

.field private Z:LM/g;

.field private a0:Lo0/B0;

.field private b0:Lx7/l;

.field private c0:Ljava/util/Map;

.field private d0:LM/e;

.field private e0:Lx7/l;

.field private f0:Landroidx/compose/foundation/text/modifiers/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/b;->S:Lx7/l;

    iput p5, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    iput p8, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    iput-object p10, p0, Landroidx/compose/foundation/text/modifiers/b;->Y:Lx7/l;

    iput-object p12, p0, Landroidx/compose/foundation/text/modifiers/b;->a0:Lo0/B0;

    iput-object p13, p0, Landroidx/compose/foundation/text/modifiers/b;->b0:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Landroidx/compose/foundation/text/modifiers/b;-><init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;)V

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/foundation/text/modifiers/b;)LM/e;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->c2()LM/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U1(Landroidx/compose/foundation/text/modifiers/b;)Lx7/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->b0:Lx7/l;

    return-object p0
.end method

.method public static final synthetic V1(Landroidx/compose/foundation/text/modifiers/b;)Lo0/B0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->a0:Lo0/B0;

    return-object p0
.end method

.method public static final synthetic W1(Landroidx/compose/foundation/text/modifiers/b;)LM0/P;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    return-object p0
.end method

.method public static final synthetic X1(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->f2()V

    return-void
.end method

.method public static final synthetic Y1(Landroidx/compose/foundation/text/modifiers/b;LM0/d;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->l2(LM0/d;)Z

    move-result p0

    return p0
.end method

.method private final c2()LM/e;
    .locals 11

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->d0:LM/e;

    if-nez v0, :cond_0

    new-instance v0, LM/e;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    iget v5, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LM/e;-><init>(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;Ly7/k;)V

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->d0:LM/e;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->d0:LM/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final d2(LY0/e;)LM/e;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->a()LM/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LM/e;->k(LY0/e;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->c2()LM/e;

    move-result-object v0

    invoke-virtual {v0, p1}, LM/e;->k(LY0/e;)V

    return-object v0
.end method

.method private final f2()V
    .locals 0

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    invoke-static {p0}, LF0/H;->b(LF0/E;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method private final l2(LM0/d;)Z
    .locals 13

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->b()LM0/d;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    return v9

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b$a;->f(LM0/d;)V

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->a()LM/e;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    move-object v1, p1

    move v7, v8

    move-object v8, v10

    invoke-virtual/range {v0 .. v8}, LM/e;->n(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;)V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    return v9

    :cond_2
    new-instance v10, Landroidx/compose/foundation/text/modifiers/b$a;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v10

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/modifiers/b$a;-><init>(LM0/d;LM0/d;ZLM/e;ILy7/k;)V

    new-instance v11, LM/e;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    iget v8, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    const/4 v12, 0x0

    move-object v0, v11

    move-object v1, p1

    move v7, v8

    move-object v8, v9

    move-object v9, v12

    invoke-direct/range {v0 .. v9}, LM/e;-><init>(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;Ly7/k;)V

    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->c2()LM/e;

    move-result-object v0

    invoke-virtual {v0}, LM/e;->a()LY0/e;

    move-result-object v0

    invoke-virtual {v11, v0}, LM/e;->k(LY0/e;)V

    invoke-virtual {v10, v11}, Landroidx/compose/foundation/text/modifiers/b$a;->d(LM/e;)V

    iput-object v10, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p1}, LM/e;->i(LY0/v;)I

    move-result p1

    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p1}, LM/e;->h(LY0/v;)I

    move-result p1

    return p1
.end method

.method public M0(LK0/w;)V
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->e0:Lx7/l;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/text/modifiers/b$b;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/modifiers/b$b;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->e0:Lx7/l;

    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-static {p1, v1}, LK0/u;->c0(LK0/w;LM0/d;)V

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b$a;->b()LM0/d;

    move-result-object v2

    invoke-static {p1, v2}, LK0/u;->g0(LK0/w;LM0/d;)V

    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b$a;->c()Z

    move-result v1

    invoke-static {p1, v1}, LK0/u;->b0(LK0/w;Z)V

    :cond_1
    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$c;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$c;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->i0(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$d;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$d;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->o0(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$e;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/modifiers/b$e;-><init>(Landroidx/compose/foundation/text/modifiers/b;)V

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->d(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    invoke-static {p1, v2, v0, v3, v2}, LK0/u;->q(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final Z1()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    return-void
.end method

.method public final a2(ZZZZ)V
    .locals 9

    .prologue
    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-eqz p4, :cond_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/modifiers/b;->c2()LM/e;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    iget-object v8, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    invoke-virtual/range {v0 .. v8}, LM/e;->n(LM0/d;LM0/P;LR0/h$b;IZIILjava/util/List;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->e0:Lx7/l;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_4
    if-nez p2, :cond_5

    if-nez p3, :cond_5

    if-eqz p4, :cond_6

    :cond_5
    invoke-static {p0}, LF0/H;->b(LF0/E;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    :cond_7
    return-void
.end method

.method public final b2(Lq0/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->y(Lq0/c;)V

    return-void
.end method

.method public final e2()Landroidx/compose/foundation/text/modifiers/b$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    return-object v0
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 5

    .prologue
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object v0

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, LM/e;->f(JLY0/v;)Z

    move-result p3

    invoke-virtual {v0}, LM/e;->c()LM0/K;

    move-result-object p4

    invoke-virtual {p4}, LM0/K;->w()LM0/j;

    move-result-object v0

    invoke-virtual {v0}, LM0/j;->j()LM0/k;

    move-result-object v0

    invoke-virtual {v0}, LM0/k;->c()Z

    if-eqz p3, :cond_2

    invoke-static {p0}, LF0/H;->a(LF0/E;)V

    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->S:Lx7/l;

    if-eqz p3, :cond_0

    invoke-interface {p3, p4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->c0:Ljava/util/Map;

    if-nez p3, :cond_1

    new-instance p3, Ljava/util/LinkedHashMap;

    const/4 v0, 0x2

    invoke-direct {p3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_1
    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v0

    invoke-virtual {p4}, LM0/K;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v0

    invoke-virtual {p4}, LM0/K;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->c0:Ljava/util/Map;

    :cond_2
    iget-object p3, p0, Landroidx/compose/foundation/text/modifiers/b;->Y:Lx7/l;

    if-eqz p3, :cond_3

    invoke-virtual {p4}, LM0/K;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p3, LY0/b;->b:LY0/b$a;

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v0

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v1

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v2

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    invoke-virtual {p3, v0, v1, v2, v3}, LY0/b$a;->b(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p3

    invoke-virtual {p4}, LM0/K;->B()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result p4

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->c0:Ljava/util/Map;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v1, Landroidx/compose/foundation/text/modifiers/b$f;

    invoke-direct {v1, p2}, Landroidx/compose/foundation/text/modifiers/b$f;-><init>(LD0/X;)V

    invoke-interface {p1, p3, p4, v0, v1}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final g2(LD0/o;LD0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->k(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public final h2(LD0/o;LD0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->F(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final i2(LD0/M;LD0/G;J)LD0/K;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/modifiers/b;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final j2(LD0/o;LD0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->t(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LM/e;->d(ILY0/v;)I

    move-result p1

    return p1
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public final k2(LD0/o;LD0/n;I)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->C(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public final m2(Lx7/l;Lx7/l;LM/g;Lx7/l;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->S:Lx7/l;

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->S:Lx7/l;

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->Y:Lx7/l;

    if-eq v0, p2, :cond_1

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->Y:Lx7/l;

    move p1, v1

    :cond_1
    iget-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->Z:LM/g;

    invoke-static {p2, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    move p1, v1

    :cond_2
    iget-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->b0:Lx7/l;

    if-eq p2, p4, :cond_3

    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/b;->b0:Lx7/l;

    goto :goto_1

    :cond_3
    move v1, p1

    :goto_1
    return v1
.end method

.method public final n2(Lo0/B0;LM0/P;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->a0:Lo0/B0;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->a0:Lo0/B0;

    if-nez v0, :cond_1

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {p2, p1}, LM0/P;->F(LM0/P;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final o2(LM0/P;Ljava/util/List;IIZLR0/h$b;I)Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v0, p1}, LM0/P;->G(LM0/P;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    move v0, v1

    :cond_0
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    if-eq p1, p3, :cond_1

    iput p3, p0, Landroidx/compose/foundation/text/modifiers/b;->W:I

    move v0, v1

    :cond_1
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    if-eq p1, p4, :cond_2

    iput p4, p0, Landroidx/compose/foundation/text/modifiers/b;->V:I

    move v0, v1

    :cond_2
    iget-boolean p1, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    if-eq p1, p5, :cond_3

    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/b;->U:Z

    move v0, v1

    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    invoke-static {p1, p6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iput-object p6, p0, Landroidx/compose/foundation/text/modifiers/b;->R:LR0/h$b;

    move v0, v1

    :cond_4
    iget p1, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    invoke-static {p1, p7}, LX0/u;->e(II)Z

    move-result p1

    if-nez p1, :cond_5

    iput p7, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    goto :goto_0

    :cond_5
    move v1, v0

    :goto_0
    return v1
.end method

.method public final p2(LM0/d;)Z
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-virtual {v2}, LM0/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, LM0/d;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v1

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-virtual {v3}, LM0/d;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, LM0/d;->e()Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-virtual {v4, p1}, LM0/d;->l(LM0/d;)Z

    move-result v4

    xor-int/2addr v4, v1

    if-nez v0, :cond_1

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/text/modifiers/b;->Z1()V

    :cond_3
    return v1
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LM/e;->d(ILY0/v;)I

    move-result p1

    return p1
.end method

.method public y(Lq0/c;)V
    .locals 14

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/modifiers/b;->d2(LY0/e;)LM/e;

    move-result-object v1

    invoke-virtual {v1}, LM/e;->c()LM0/K;

    move-result-object v1

    invoke-virtual {v1}, LM0/K;->w()LM0/j;

    move-result-object v2

    invoke-virtual {v1}, LM0/K;->i()Z

    move-result v3

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_1

    iget v3, p0, Landroidx/compose/foundation/text/modifiers/b;->T:I

    sget-object v4, LX0/u;->a:LX0/u$a;

    invoke-virtual {v4}, LX0/u$a;->c()I

    move-result v4

    invoke-static {v3, v4}, LX0/u;->e(II)Z

    move-result v3

    if-nez v3, :cond_1

    move v13, v11

    goto :goto_0

    :cond_1
    move v13, v12

    :goto_0
    if-eqz v13, :cond_2

    invoke-virtual {v1}, LM0/K;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, LM0/K;->B()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/t;->f(J)I

    move-result v1

    int-to-float v1, v1

    sget-object v4, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v4}, Ln0/g$a;->c()J

    move-result-wide v4

    invoke-static {v3, v1}, Ln0/n;->a(FF)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ln0/j;->b(JJ)Ln0/i;

    move-result-object v1

    invoke-interface {v0}, Lo0/q0;->m()V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v12, v3, v4}, Lo0/p0;->e(Lo0/q0;Ln0/i;IILjava/lang/Object;)V

    :cond_2
    :try_start_0
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->A()LX0/k;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, LX0/k;->b:LX0/k$a;

    invoke-virtual {v1}, LX0/k$a;->c()LX0/k;

    move-result-object v1

    :cond_3
    move-object v6, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :goto_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->x()Lo0/c2;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {v1}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object v1

    :cond_4
    move-object v5, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->i()Lq0/h;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object v1, Lq0/l;->a:Lq0/l;

    :cond_5
    move-object v7, v1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->g()Lo0/n0;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->d()F

    move-result v4

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v10}, LM0/j;->F(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V

    goto :goto_4

    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->a0:Lo0/B0;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lo0/B0;->a()J

    move-result-wide v3

    goto :goto_2

    :cond_7
    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->g()J

    move-result-wide v3

    :goto_2
    const-wide/16 v8, 0x10

    cmp-long v1, v3, v8

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->h()J

    move-result-wide v3

    cmp-long v1, v3, v8

    if-eqz v1, :cond_9

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b;->Q:LM0/P;

    invoke-virtual {v1}, LM0/P;->h()J

    move-result-wide v3

    goto :goto_3

    :cond_9
    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->a()J

    move-result-wide v3

    :goto_3
    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v1, v2

    move-object v2, v0

    invoke-static/range {v1 .. v10}, LM0/j;->D(LM0/j;Lo0/q0;JLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    if-eqz v13, :cond_a

    invoke-interface {v0}, Lo0/q0;->s()V

    :cond_a
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->f0:Landroidx/compose/foundation/text/modifiers/b$a;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b$a;->c()Z

    move-result v0

    if-ne v0, v11, :cond_b

    move v0, v12

    goto :goto_5

    :cond_b
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->P:LM0/d;

    invoke-static {v0}, LM/h;->a(LM0/d;)Z

    move-result v0

    :goto_5
    if-nez v0, :cond_e

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b;->X:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    move v11, v12

    :cond_d
    :goto_6
    if-nez v11, :cond_f

    :cond_e
    invoke-interface {p1}, Lq0/c;->l1()V

    :cond_f
    return-void

    :goto_7
    if-eqz v13, :cond_10

    invoke-interface {v0}, Lo0/q0;->s()V

    :cond_10
    throw p1
.end method
