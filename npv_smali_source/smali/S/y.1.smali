.class public final LS/y;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/v0;
.implements LF0/h;
.implements LF0/C;


# instance fields
.field private R:LS/c;

.field private S:Z

.field private T:I

.field private U:F

.field private V:F

.field private W:J

.field private final X:Lz0/W;

.field private final Y:Lz0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LS/c;ZI)V
    .locals 0

    invoke-direct {p0}, LF0/m;-><init>()V

    iput-object p1, p0, LS/y;->R:LS/c;

    iput-boolean p2, p0, LS/y;->S:Z

    iput p3, p0, LS/y;->T:I

    sget-object p1, LY0/p;->b:LY0/p$a;

    invoke-virtual {p1}, LY0/p$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LS/y;->W:J

    new-instance p1, LS/y$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LS/y$b;-><init>(LS/y;Lm7/e;)V

    invoke-static {p1}, Lz0/U;->a(Lx7/p;)Lz0/W;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lz0/W;

    iput-object p1, p0, LS/y;->X:Lz0/W;

    new-instance p1, LS/y$a;

    invoke-direct {p1, p0, p2}, LS/y$a;-><init>(LS/y;Lm7/e;)V

    invoke-static {p1}, Lz0/U;->a(Lx7/p;)Lz0/W;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lz0/W;

    iput-object p1, p0, LS/y;->Y:Lz0/W;

    return-void
.end method

.method public synthetic constructor <init>(LS/c;ZILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LS/y;-><init>(LS/c;ZI)V

    return-void
.end method

.method public static final synthetic Z1(LS/y;)Z
    .locals 0

    iget-boolean p0, p0, LS/y;->S:Z

    return p0
.end method

.method public static final synthetic a2(LS/y;)J
    .locals 2

    iget-wide v0, p0, LS/y;->W:J

    return-wide v0
.end method

.method public static final synthetic b2(LS/y;)F
    .locals 0

    invoke-direct {p0}, LS/y;->h2()F

    move-result p0

    return p0
.end method

.method public static final synthetic c2(LS/y;)F
    .locals 0

    iget p0, p0, LS/y;->U:F

    return p0
.end method

.method public static final synthetic d2(LS/y;)F
    .locals 0

    iget p0, p0, LS/y;->V:F

    return p0
.end method

.method public static final synthetic e2(LS/y;)LS/c;
    .locals 0

    iget-object p0, p0, LS/y;->R:LS/c;

    return-object p0
.end method

.method public static final synthetic f2(LS/y;F)V
    .locals 0

    iput p1, p0, LS/y;->U:F

    return-void
.end method

.method public static final synthetic g2(LS/y;F)V
    .locals 0

    iput p1, p0, LS/y;->V:F

    return-void
.end method

.method private final h2()F
    .locals 2

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v0

    invoke-static {}, LS/q1;->O()F

    move-result v1

    invoke-interface {v0, v1}, LY0/e;->B0(F)F

    move-result v0

    return v0
.end method


# virtual methods
.method public M(J)V
    .locals 0

    invoke-static {p1, p2}, LY0/u;->b(J)J

    move-result-wide p1

    iput-wide p1, p0, LS/y;->W:J

    return-void
.end method

.method public synthetic Y0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->d(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public g0()V
    .locals 1

    iget-object v0, p0, LS/y;->X:Lz0/W;

    invoke-interface {v0}, LF0/v0;->g0()V

    iget-object v0, p0, LS/y;->Y:Lz0/W;

    invoke-interface {v0}, LF0/v0;->g0()V

    return-void
.end method

.method public final i2(LS/c;ZI)V
    .locals 6

    .prologue
    iput-object p1, p0, LS/y;->R:LS/c;

    iput-boolean p2, p0, LS/y;->S:Z

    iget p2, p0, LS/y;->T:I

    invoke-static {p2, p3}, LS/s1;->f(II)Z

    move-result p2

    if-nez p2, :cond_0

    iput p3, p0, LS/y;->T:I

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    new-instance v3, LS/y$c;

    const/4 p2, 0x0

    invoke-direct {v3, p1, p2}, LS/y$c;-><init>(LS/c;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    return-void
.end method

.method public synthetic m1(LD0/t;)V
    .locals 0

    invoke-static {p0, p1}, LF0/B;->a(LF0/C;LD0/t;)V

    return-void
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 1

    iget-object v0, p0, LS/y;->X:Lz0/W;

    invoke-interface {v0, p1, p2, p3, p4}, LF0/v0;->w0(Lz0/p;Lz0/r;J)V

    iget-object v0, p0, LS/y;->Y:Lz0/W;

    invoke-interface {v0, p1, p2, p3, p4}, LF0/v0;->w0(Lz0/p;Lz0/r;J)V

    return-void
.end method
