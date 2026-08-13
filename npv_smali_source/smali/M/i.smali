.class public final LM/i;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;
.implements LF0/s;
.implements LF0/z0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM/i$a;
    }
.end annotation


# instance fields
.field private P:Ljava/lang/String;

.field private Q:LM0/P;

.field private R:LR0/h$b;

.field private S:I

.field private T:Z

.field private U:I

.field private V:I

.field private W:Lo0/B0;

.field private X:Ljava/util/Map;

.field private Y:LM/f;

.field private Z:Lx7/l;

.field private a0:LM/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILo0/B0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, LM/i;->P:Ljava/lang/String;

    iput-object p2, p0, LM/i;->Q:LM0/P;

    iput-object p3, p0, LM/i;->R:LR0/h$b;

    iput p4, p0, LM/i;->S:I

    iput-boolean p5, p0, LM/i;->T:Z

    iput p6, p0, LM/i;->U:I

    iput p7, p0, LM/i;->V:I

    iput-object p8, p0, LM/i;->W:Lo0/B0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILo0/B0;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LM/i;-><init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILo0/B0;)V

    return-void
.end method

.method public static final synthetic T1(LM/i;)V
    .locals 0

    invoke-direct {p0}, LM/i;->a2()V

    return-void
.end method

.method public static final synthetic U1(LM/i;)LM/f;
    .locals 0

    invoke-direct {p0}, LM/i;->c2()LM/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic V1(LM/i;)Lo0/B0;
    .locals 0

    iget-object p0, p0, LM/i;->W:Lo0/B0;

    return-object p0
.end method

.method public static final synthetic W1(LM/i;)LM0/P;
    .locals 0

    iget-object p0, p0, LM/i;->Q:LM0/P;

    return-object p0
.end method

.method public static final synthetic X1(LM/i;)LM/i$a;
    .locals 0

    iget-object p0, p0, LM/i;->a0:LM/i$a;

    return-object p0
.end method

.method public static final synthetic Y1(LM/i;)V
    .locals 0

    invoke-direct {p0}, LM/i;->e2()V

    return-void
.end method

.method public static final synthetic Z1(LM/i;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LM/i;->f2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final a2()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LM/i;->a0:LM/i$a;

    return-void
.end method

.method private final c2()LM/f;
    .locals 10

    .prologue
    iget-object v0, p0, LM/i;->Y:LM/f;

    if-nez v0, :cond_0

    new-instance v0, LM/f;

    iget-object v2, p0, LM/i;->P:Ljava/lang/String;

    iget-object v3, p0, LM/i;->Q:LM0/P;

    iget-object v4, p0, LM/i;->R:LR0/h$b;

    iget v5, p0, LM/i;->S:I

    iget-boolean v6, p0, LM/i;->T:Z

    iget v7, p0, LM/i;->U:I

    iget v8, p0, LM/i;->V:I

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, LM/f;-><init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILy7/k;)V

    iput-object v0, p0, LM/i;->Y:LM/f;

    :cond_0
    iget-object v0, p0, LM/i;->Y:LM/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final d2(LY0/e;)LM/f;
    .locals 2

    .prologue
    iget-object v0, p0, LM/i;->a0:LM/i$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LM/i$a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LM/i$a;->a()LM/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LM/f;->m(LY0/e;)V

    return-object v0

    :cond_0
    invoke-direct {p0}, LM/i;->c2()LM/f;

    move-result-object v0

    invoke-virtual {v0, p1}, LM/f;->m(LY0/e;)V

    return-object v0
.end method

.method private final e2()V
    .locals 0

    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    invoke-static {p0}, LF0/H;->b(LF0/E;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method private final f2(Ljava/lang/String;)Z
    .locals 12

    .prologue
    iget-object v0, p0, LM/i;->a0:LM/i$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LM/i$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    return v8

    :cond_0
    invoke-virtual {v0, p1}, LM/i$a;->f(Ljava/lang/String;)V

    invoke-virtual {v0}, LM/i$a;->a()LM/f;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, LM/i;->Q:LM0/P;

    iget-object v3, p0, LM/i;->R:LR0/h$b;

    iget v4, p0, LM/i;->S:I

    iget-boolean v5, p0, LM/i;->T:Z

    iget v6, p0, LM/i;->U:I

    iget v9, p0, LM/i;->V:I

    move-object v1, p1

    move v7, v9

    invoke-virtual/range {v0 .. v7}, LM/f;->p(Ljava/lang/String;LM0/P;LR0/h$b;IZII)V

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    return v8

    :cond_2
    new-instance v9, LM/i$a;

    iget-object v1, p0, LM/i;->P:Ljava/lang/String;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, LM/i$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZLM/f;ILy7/k;)V

    new-instance v10, LM/f;

    iget-object v2, p0, LM/i;->Q:LM0/P;

    iget-object v3, p0, LM/i;->R:LR0/h$b;

    iget v4, p0, LM/i;->S:I

    iget-boolean v5, p0, LM/i;->T:Z

    iget v6, p0, LM/i;->U:I

    iget v8, p0, LM/i;->V:I

    const/4 v11, 0x0

    move-object v0, v10

    move-object v1, p1

    move v7, v8

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, LM/f;-><init>(Ljava/lang/String;LM0/P;LR0/h$b;IZIILy7/k;)V

    invoke-direct {p0}, LM/i;->c2()LM/f;

    move-result-object v0

    invoke-virtual {v0}, LM/f;->a()LY0/e;

    move-result-object v0

    invoke-virtual {v10, v0}, LM/f;->m(LY0/e;)V

    invoke-virtual {v9, v10}, LM/i$a;->d(LM/f;)V

    iput-object v9, p0, LM/i;->a0:LM/i$a;

    :cond_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p1}, LM/f;->k(LY0/v;)I

    move-result p1

    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p1}, LM/f;->j(LY0/v;)I

    move-result p1

    return p1
.end method

.method public M0(LK0/w;)V
    .locals 9

    .prologue
    iget-object v0, p0, LM/i;->Z:Lx7/l;

    if-nez v0, :cond_0

    new-instance v0, LM/i$b;

    invoke-direct {v0, p0}, LM/i$b;-><init>(LM/i;)V

    iput-object v0, p0, LM/i;->Z:Lx7/l;

    :cond_0
    new-instance v7, LM0/d;

    iget-object v2, p0, LM/i;->P:Ljava/lang/String;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    invoke-static {p1, v7}, LK0/u;->c0(LK0/w;LM0/d;)V

    iget-object v1, p0, LM/i;->a0:LM/i$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LM/i$a;->c()Z

    move-result v2

    invoke-static {p1, v2}, LK0/u;->b0(LK0/w;Z)V

    new-instance v2, LM0/d;

    invoke-virtual {v1}, LM/i$a;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    invoke-static {p1, v2}, LK0/u;->g0(LK0/w;LM0/d;)V

    :cond_1
    new-instance v1, LM/i$c;

    invoke-direct {v1, p0}, LM/i$c;-><init>(LM/i;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->i0(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-instance v1, LM/i$d;

    invoke-direct {v1, p0}, LM/i$d;-><init>(LM/i;)V

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->o0(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    new-instance v1, LM/i$e;

    invoke-direct {v1, p0}, LM/i$e;-><init>(LM/i;)V

    invoke-static {p1, v2, v1, v3, v2}, LK0/u;->d(LK0/w;Ljava/lang/String;Lx7/a;ILjava/lang/Object;)V

    invoke-static {p1, v2, v0, v3, v2}, LK0/u;->q(LK0/w;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final b2(ZZZ)V
    .locals 8

    .prologue
    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    invoke-direct {p0}, LM/i;->c2()LM/f;

    move-result-object v0

    iget-object v1, p0, LM/i;->P:Ljava/lang/String;

    iget-object v2, p0, LM/i;->Q:LM0/P;

    iget-object v3, p0, LM/i;->R:LR0/h$b;

    iget v4, p0, LM/i;->S:I

    iget-boolean v5, p0, LM/i;->T:Z

    iget v6, p0, LM/i;->U:I

    iget v7, p0, LM/i;->V:I

    invoke-virtual/range {v0 .. v7}, LM/f;->p(Ljava/lang/String;LM0/P;LR0/h$b;IZII)V

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    iget-object v0, p0, LM/i;->Z:Lx7/l;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p0}, LF0/A0;->b(LF0/z0;)V

    :cond_4
    if-nez p2, :cond_5

    if-eqz p3, :cond_6

    :cond_5
    invoke-static {p0}, LF0/H;->b(LF0/E;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    :cond_7
    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 5

    .prologue
    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object v0

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v1

    invoke-virtual {v0, p3, p4, v1}, LM/f;->h(JLY0/v;)Z

    move-result p3

    invoke-virtual {v0}, LM/f;->d()Li7/M;

    invoke-virtual {v0}, LM/f;->e()LM0/p;

    move-result-object p4

    invoke-static {p4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LM/f;->c()J

    move-result-wide v0

    if-eqz p3, :cond_1

    invoke-static {p0}, LF0/H;->a(LF0/E;)V

    iget-object p3, p0, LM/i;->X:Ljava/util/Map;

    if-nez p3, :cond_0

    new-instance p3, Ljava/util/LinkedHashMap;

    const/4 v2, 0x2

    invoke-direct {p3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_0
    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v2

    invoke-interface {p4}, LM0/p;->l()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v2

    invoke-interface {p4}, LM0/p;->h()F

    move-result p4

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, v2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, LM/i;->X:Ljava/util/Map;

    :cond_1
    sget-object p3, LY0/b;->b:LY0/b$a;

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p4

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v3

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v4

    invoke-virtual {p3, p4, v2, v3, v4}, LY0/b$a;->b(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p3

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result p4

    iget-object v0, p0, LM/i;->X:Ljava/util/Map;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v1, LM/i$f;

    invoke-direct {v1, p2}, LM/i$f;-><init>(LD0/X;)V

    invoke-interface {p1, p3, p4, v0, v1}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final g2(Lo0/B0;LM0/P;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LM/i;->W:Lo0/B0;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, LM/i;->W:Lo0/B0;

    if-nez v0, :cond_1

    iget-object p1, p0, LM/i;->Q:LM0/P;

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

.method public synthetic h0()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->a(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public final h2(LM0/P;IIZLR0/h$b;I)Z
    .locals 2

    .prologue
    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0, p1}, LM0/P;->G(LM0/P;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, LM/i;->Q:LM0/P;

    iget p1, p0, LM/i;->V:I

    if-eq p1, p2, :cond_0

    iput p2, p0, LM/i;->V:I

    move v0, v1

    :cond_0
    iget p1, p0, LM/i;->U:I

    if-eq p1, p3, :cond_1

    iput p3, p0, LM/i;->U:I

    move v0, v1

    :cond_1
    iget-boolean p1, p0, LM/i;->T:Z

    if-eq p1, p4, :cond_2

    iput-boolean p4, p0, LM/i;->T:Z

    move v0, v1

    :cond_2
    iget-object p1, p0, LM/i;->R:LR0/h$b;

    invoke-static {p1, p5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iput-object p5, p0, LM/i;->R:LR0/h$b;

    move v0, v1

    :cond_3
    iget p1, p0, LM/i;->S:I

    invoke-static {p1, p6}, LX0/u;->e(II)Z

    move-result p1

    if-nez p1, :cond_4

    iput p6, p0, LM/i;->S:I

    goto :goto_0

    :cond_4
    move v1, v0

    :goto_0
    return v1
.end method

.method public final i2(Ljava/lang/String;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LM/i;->P:Ljava/lang/String;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, LM/i;->P:Ljava/lang/String;

    invoke-direct {p0}, LM/i;->a2()V

    const/4 p1, 0x1

    return p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LM/f;->f(ILY0/v;)I

    move-result p1

    return p1
.end method

.method public synthetic k1()Z
    .locals 1

    invoke-static {p0}, LF0/y0;->b(LF0/z0;)Z

    move-result v0

    return v0
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LM/f;->f(ILY0/v;)I

    move-result p1

    return p1
.end method

.method public y(Lq0/c;)V
    .locals 12

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, LM/i;->d2(LY0/e;)LM/f;

    move-result-object v0

    invoke-virtual {v0}, LM/f;->e()LM0/p;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    invoke-virtual {v0}, LM/f;->b()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v0}, LM/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v2

    int-to-float v5, v2

    invoke-virtual {v0}, LM/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v0

    int-to-float v6, v0

    invoke-interface {p1}, Lo0/q0;->m()V

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lo0/p0;->d(Lo0/q0;FFFFIILjava/lang/Object;)V

    :cond_1
    :try_start_0
    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->A()LX0/k;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, LX0/k;->b:LX0/k$a;

    invoke-virtual {v0}, LX0/k$a;->c()LX0/k;

    move-result-object v0

    :cond_2
    move-object v6, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :goto_0
    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->x()Lo0/c2;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {v0}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object v0

    :cond_3
    move-object v5, v0

    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->i()Lq0/h;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lq0/l;->a:Lq0/l;

    :cond_4
    move-object v7, v0

    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->g()Lo0/n0;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->d()F

    move-result v4

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v10}, LM0/o;->b(LM0/p;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V

    goto :goto_4

    :cond_5
    iget-object v0, p0, LM/i;->W:Lo0/B0;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lo0/B0;->a()J

    move-result-wide v2

    goto :goto_1

    :cond_6
    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v2

    :goto_1
    const-wide/16 v8, 0x10

    cmp-long v0, v2, v8

    if-eqz v0, :cond_7

    :goto_2
    move-wide v3, v2

    goto :goto_3

    :cond_7
    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->h()J

    move-result-wide v2

    cmp-long v0, v2, v8

    if-eqz v0, :cond_8

    iget-object v0, p0, LM/i;->Q:LM0/P;

    invoke-virtual {v0}, LM0/P;->h()J

    move-result-wide v2

    goto :goto_2

    :cond_8
    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->a()J

    move-result-wide v2

    goto :goto_2

    :goto_3
    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v10}, LM0/o;->a(LM0/p;Lo0/q0;JLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    if-eqz v11, :cond_9

    invoke-interface {p1}, Lo0/q0;->s()V

    :cond_9
    return-void

    :goto_5
    if-eqz v11, :cond_a

    invoke-interface {p1}, Lo0/q0;->s()V

    :cond_a
    throw v0

    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "no paragraph (layoutCache="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LM/i;->Y:LM/f;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textSubstitution="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LM/i;->a0:LM/i$a;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
