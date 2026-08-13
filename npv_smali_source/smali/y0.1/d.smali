.class public final Ly0/d;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;
.implements Ly0/b;


# instance fields
.field private P:Ly0/b;

.field private Q:Ly0/c;

.field private final R:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly0/b;Ly0/c;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Ly0/d;->P:Ly0/b;

    if-nez p2, :cond_0

    new-instance p2, Ly0/c;

    invoke-direct {p2}, Ly0/c;-><init>()V

    :cond_0
    iput-object p2, p0, Ly0/d;->Q:Ly0/c;

    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    iput-object p1, p0, Ly0/d;->R:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic T1(Ly0/d;)LW8/N;
    .locals 0

    invoke-direct {p0}, Ly0/d;->U1()LW8/N;

    move-result-object p0

    return-object p0
.end method

.method private final U1()LW8/N;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ly0/d;->W1()Ly0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {v0}, Ly0/d;->U1()LW8/N;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    invoke-virtual {v0}, Ly0/c;->h()LW8/N;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final V1()Ly0/b;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly0/d;->W1()Ly0/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final X1()V
    .locals 2

    .prologue
    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    invoke-virtual {v0}, Ly0/c;->f()Ly0/d;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly0/c;->j(Ly0/d;)V

    :cond_0
    return-void
.end method

.method private final Y1(Ly0/c;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ly0/d;->X1()V

    if-nez p1, :cond_0

    new-instance p1, Ly0/c;

    invoke-direct {p1}, Ly0/c;-><init>()V

    :goto_0
    iput-object p1, p0, Ly0/d;->Q:Ly0/c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Ly0/d;->Z1()V

    :cond_2
    return-void
.end method

.method private final Z1()V
    .locals 2

    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    invoke-virtual {v0, p0}, Ly0/c;->j(Ly0/d;)V

    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    new-instance v1, Ly0/d$c;

    invoke-direct {v1, p0}, Ly0/d$c;-><init>(Ly0/d;)V

    invoke-virtual {v0, v1}, Ly0/c;->i(Lx7/a;)V

    iget-object v0, p0, Ly0/d;->Q:Ly0/c;

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c;->k(LW8/N;)V

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 0

    invoke-direct {p0}, Ly0/d;->Z1()V

    return-void
.end method

.method public E1()V
    .locals 0

    invoke-direct {p0}, Ly0/d;->X1()V

    return-void
.end method

.method public J(JJLm7/e;)Ljava/lang/Object;
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v1, p5

    instance-of v2, v1, Ly0/d$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ly0/d$a;

    iget v3, v2, Ly0/d$a;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ly0/d$a;->K:I

    goto :goto_0

    :cond_0
    new-instance v2, Ly0/d$a;

    invoke-direct {v2, p0, v1}, Ly0/d$a;-><init>(Ly0/d;Lm7/e;)V

    :goto_0
    iget-object v1, v2, Ly0/d$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v9

    iget v3, v2, Ly0/d$a;->K:I

    const/4 v10, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v10, :cond_1

    iget-wide v2, v2, Ly0/d$a;->G:J

    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v3, v2, Ly0/d$a;->H:J

    iget-wide v5, v2, Ly0/d$a;->G:J

    iget-object v7, v2, Ly0/d$a;->F:Ljava/lang/Object;

    check-cast v7, Ly0/d;

    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    move-wide v13, v3

    move-wide v11, v5

    goto :goto_1

    :cond_3
    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v3, v0, Ly0/d;->P:Ly0/b;

    iput-object v0, v2, Ly0/d$a;->F:Ljava/lang/Object;

    move-wide/from16 v11, p1

    iput-wide v11, v2, Ly0/d$a;->G:J

    move-wide/from16 v13, p3

    iput-wide v13, v2, Ly0/d$a;->H:J

    iput v4, v2, Ly0/d$a;->K:I

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-object v8, v2

    invoke-interface/range {v3 .. v8}, Ly0/b;->J(JJLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_4

    return-object v9

    :cond_4
    move-object v7, v0

    :goto_1
    check-cast v1, LY0/A;

    invoke-virtual {v1}, LY0/A;->o()J

    move-result-wide v4

    invoke-direct {v7}, Ly0/d;->V1()Ly0/b;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v11, v12, v4, v5}, LY0/A;->l(JJ)J

    move-result-wide v6

    invoke-static {v13, v14, v4, v5}, LY0/A;->k(JJ)J

    move-result-wide v11

    const/4 v1, 0x0

    iput-object v1, v2, Ly0/d$a;->F:Ljava/lang/Object;

    iput-wide v4, v2, Ly0/d$a;->G:J

    iput v10, v2, Ly0/d$a;->K:I

    move-wide v13, v4

    move-wide v4, v6

    move-wide v6, v11

    move-object v8, v2

    invoke-interface/range {v3 .. v8}, Ly0/b;->J(JJLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_5

    return-object v9

    :cond_5
    move-wide v2, v13

    :goto_2
    check-cast v1, LY0/A;

    invoke-virtual {v1}, LY0/A;->o()J

    move-result-wide v4

    move-wide v13, v2

    goto :goto_3

    :cond_6
    move-wide v13, v4

    sget-object v1, LY0/A;->b:LY0/A$a;

    invoke-virtual {v1}, LY0/A$a;->a()J

    move-result-wide v4

    :goto_3
    invoke-static {v13, v14, v4, v5}, LY0/A;->l(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/A;->b(J)LY0/A;

    move-result-object v1

    return-object v1
.end method

.method public K()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly0/d;->R:Ljava/lang/Object;

    return-object v0
.end method

.method public final W1()Ly0/d;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LF0/F0;->b(LF0/E0;)LF0/E0;

    move-result-object v0

    check-cast v0, Ly0/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final a2(Ly0/b;Ly0/c;)V
    .locals 0

    iput-object p1, p0, Ly0/d;->P:Ly0/b;

    invoke-direct {p0, p2}, Ly0/d;->Y1(Ly0/c;)V

    return-void
.end method

.method public e1(JJI)J
    .locals 8

    .prologue
    iget-object v0, p0, Ly0/d;->P:Ly0/b;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Ly0/b;->e1(JJI)J

    move-result-wide v0

    invoke-direct {p0}, Ly0/d;->V1()Ly0/b;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {p1, p2, v0, v1}, Ln0/g;->r(JJ)J

    move-result-wide v3

    invoke-static {p3, p4, v0, v1}, Ln0/g;->q(JJ)J

    move-result-wide v5

    move v7, p5

    invoke-interface/range {v2 .. v7}, Ly0/b;->e1(JJI)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    :goto_0
    invoke-static {v0, v1, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public h1(JLm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    instance-of v0, p3, Ly0/d$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ly0/d$b;

    iget v1, v0, Ly0/d$b;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/d$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/d$b;

    invoke-direct {v0, p0, p3}, Ly0/d$b;-><init>(Ly0/d;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Ly0/d$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly0/d$b;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Ly0/d$b;->G:J

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Ly0/d$b;->G:J

    iget-object v2, v0, Ly0/d$b;->F:Ljava/lang/Object;

    check-cast v2, Ly0/d;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, Ly0/d;->V1()Ly0/b;

    move-result-object p3

    if-eqz p3, :cond_5

    iput-object p0, v0, Ly0/d$b;->F:Ljava/lang/Object;

    iput-wide p1, v0, Ly0/d$b;->G:J

    iput v4, v0, Ly0/d$b;->J:I

    invoke-interface {p3, p1, p2, v0}, Ly0/b;->h1(JLm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p3, LY0/A;

    invoke-virtual {p3}, LY0/A;->o()J

    move-result-wide v4

    :goto_2
    move-wide v6, p1

    move-wide p1, v4

    move-wide v4, v6

    goto :goto_3

    :cond_5
    sget-object p3, LY0/A;->b:LY0/A$a;

    invoke-virtual {p3}, LY0/A$a;->a()J

    move-result-wide v4

    move-object v2, p0

    goto :goto_2

    :goto_3
    iget-object p3, v2, Ly0/d;->P:Ly0/b;

    invoke-static {v4, v5, p1, p2}, LY0/A;->k(JJ)J

    move-result-wide v4

    const/4 v2, 0x0

    iput-object v2, v0, Ly0/d$b;->F:Ljava/lang/Object;

    iput-wide p1, v0, Ly0/d$b;->G:J

    iput v3, v0, Ly0/d$b;->J:I

    invoke-interface {p3, v4, v5, v0}, Ly0/b;->h1(JLm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    :goto_4
    check-cast p3, LY0/A;

    invoke-virtual {p3}, LY0/A;->o()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/A;->l(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    return-object p1
.end method

.method public u0(JI)J
    .locals 3

    .prologue
    invoke-direct {p0}, Ly0/d;->V1()Ly0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Ly0/b;->u0(JI)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Ly0/d;->P:Ly0/b;

    invoke-static {p1, p2, v0, v1}, Ln0/g;->q(JJ)J

    move-result-wide p1

    invoke-interface {v2, p1, p2, p3}, Ly0/b;->u0(JI)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method
