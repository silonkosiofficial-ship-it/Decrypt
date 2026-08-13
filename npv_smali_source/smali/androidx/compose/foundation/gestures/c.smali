.class public final Landroidx/compose/foundation/gestures/c;
.super Landroidx/compose/foundation/gestures/b;
.source "SourceFile"


# instance fields
.field private a0:Lx/o;

.field private b0:Lx/s;

.field private c0:Z

.field private d0:Lx7/q;

.field private e0:Lx7/q;

.field private f0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx/o;Lx7/l;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V
    .locals 0

    invoke-direct {p0, p2, p4, p5, p3}, Landroidx/compose/foundation/gestures/b;-><init>(Lx7/l;ZLz/l;Lx/s;)V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/c;->a0:Lx/o;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/c;->b0:Lx/s;

    iput-boolean p6, p0, Landroidx/compose/foundation/gestures/c;->c0:Z

    iput-object p7, p0, Landroidx/compose/foundation/gestures/c;->d0:Lx7/q;

    iput-object p8, p0, Landroidx/compose/foundation/gestures/c;->e0:Lx7/q;

    iput-boolean p9, p0, Landroidx/compose/foundation/gestures/c;->f0:Z

    return-void
.end method

.method private final A2(J)J
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->f0:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    invoke-static {p1, p2, v0}, Ln0/g;->s(JF)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :goto_1
    return-wide p1
.end method

.method public static final synthetic u2(Landroidx/compose/foundation/gestures/c;)Lx7/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->d0:Lx7/q;

    return-object p0
.end method

.method public static final synthetic v2(Landroidx/compose/foundation/gestures/c;)Lx7/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->e0:Lx7/q;

    return-object p0
.end method

.method public static final synthetic w2(Landroidx/compose/foundation/gestures/c;)Lx/s;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->b0:Lx/s;

    return-object p0
.end method

.method public static final synthetic x2(Landroidx/compose/foundation/gestures/c;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/c;->z2(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic y2(Landroidx/compose/foundation/gestures/c;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/c;->A2(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private final z2(J)J
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->f0:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    invoke-static {p1, p2, v0}, LY0/A;->m(JF)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :goto_1
    return-wide p1
.end method


# virtual methods
.method public final B2(Lx/o;Lx7/l;Lx/s;ZLz/l;ZLx7/q;Lx7/q;Z)V
    .locals 7

    .prologue
    move-object v6, p0

    move-object v0, p1

    move-object v4, p3

    move/from16 v1, p9

    iget-object v2, v6, Landroidx/compose/foundation/gestures/c;->a0:Lx/o;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->a0:Lx/o;

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, v6, Landroidx/compose/foundation/gestures/c;->b0:Lx/s;

    if-eq v2, v4, :cond_1

    iput-object v4, v6, Landroidx/compose/foundation/gestures/c;->b0:Lx/s;

    move v0, v3

    :cond_1
    iget-boolean v2, v6, Landroidx/compose/foundation/gestures/c;->f0:Z

    if-eq v2, v1, :cond_2

    iput-boolean v1, v6, Landroidx/compose/foundation/gestures/c;->f0:Z

    move-object v0, p7

    move v5, v3

    goto :goto_1

    :cond_2
    move v5, v0

    move-object v0, p7

    :goto_1
    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->d0:Lx7/q;

    move-object v0, p8

    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->e0:Lx7/q;

    move v0, p6

    iput-boolean v0, v6, Landroidx/compose/foundation/gestures/c;->c0:Z

    move-object v0, p0

    move-object v1, p2

    move v2, p4

    move-object v3, p5

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/gestures/b;->t2(Lx7/l;ZLz/l;Lx/s;Z)V

    return-void
.end method

.method public i2(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->a0:Lx/o;

    sget-object v1, Lv/L;->D:Lv/L;

    new-instance v2, Landroidx/compose/foundation/gestures/c$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Landroidx/compose/foundation/gestures/c$a;-><init>(Lx7/p;Landroidx/compose/foundation/gestures/c;Lm7/e;)V

    invoke-interface {v0, v1, v2, p2}, Lx/o;->a(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public m2(J)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->d0:Lx7/q;

    invoke-static {}, Lx/n;->b()Lx7/q;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/c$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/c$b;-><init>(Landroidx/compose/foundation/gestures/c;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_1
    :goto_0
    return-void
.end method

.method public n2(J)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->e0:Lx7/q;

    invoke-static {}, Lx/n;->c()Lx7/q;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/c$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/c$c;-><init>(Landroidx/compose/foundation/gestures/c;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_1
    :goto_0
    return-void
.end method

.method public r2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->c0:Z

    return v0
.end method
