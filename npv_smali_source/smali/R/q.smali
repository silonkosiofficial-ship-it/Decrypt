.class public abstract LR/q;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/h;
.implements LF0/s;
.implements LF0/C;


# instance fields
.field private final P:Lz/j;

.field private final Q:Z

.field private final R:F

.field private final S:Lo0/B0;

.field private final T:Lx7/a;

.field private final U:Z

.field private V:LR/u;

.field private W:F

.field private X:J

.field private Y:Z

.field private final Z:Lr/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lz/j;ZFLo0/B0;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, LR/q;->P:Lz/j;

    iput-boolean p2, p0, LR/q;->Q:Z

    iput p3, p0, LR/q;->R:F

    iput-object p4, p0, LR/q;->S:Lo0/B0;

    iput-object p5, p0, LR/q;->T:Lx7/a;

    sget-object p1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {p1}, Ln0/m$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LR/q;->X:J

    new-instance p1, Lr/I;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3}, Lr/I;-><init>(IILy7/k;)V

    iput-object p1, p0, LR/q;->Z:Lr/I;

    return-void
.end method

.method public synthetic constructor <init>(Lz/j;ZFLo0/B0;Lx7/a;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LR/q;-><init>(Lz/j;ZFLo0/B0;Lx7/a;)V

    return-void
.end method

.method public static final synthetic T1(LR/q;)Z
    .locals 0

    iget-boolean p0, p0, LR/q;->Y:Z

    return p0
.end method

.method public static final synthetic U1(LR/q;)Lz/j;
    .locals 0

    iget-object p0, p0, LR/q;->P:Lz/j;

    return-object p0
.end method

.method public static final synthetic V1(LR/q;)Lr/I;
    .locals 0

    iget-object p0, p0, LR/q;->Z:Lr/I;

    return-object p0
.end method

.method public static final synthetic W1(LR/q;Lz/n;)V
    .locals 0

    invoke-direct {p0, p1}, LR/q;->e2(Lz/n;)V

    return-void
.end method

.method public static final synthetic X1(LR/q;Lz/i;LW8/N;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LR/q;->g2(Lz/i;LW8/N;)V

    return-void
.end method

.method private final e2(Lz/n;)V
    .locals 3

    .prologue
    instance-of v0, p1, Lz/n$b;

    if-eqz v0, :cond_0

    check-cast p1, Lz/n$b;

    iget-wide v0, p0, LR/q;->X:J

    iget v2, p0, LR/q;->W:F

    invoke-virtual {p0, p1, v0, v1, v2}, LR/q;->Y1(Lz/n$b;JF)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lz/n$c;

    if-eqz v0, :cond_1

    check-cast p1, Lz/n$c;

    invoke-virtual {p1}, Lz/n$c;->a()Lz/n$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, LR/q;->f2(Lz/n$b;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lz/n$a;

    if-eqz v0, :cond_2

    check-cast p1, Lz/n$a;

    invoke-virtual {p1}, Lz/n$a;->a()Lz/n$b;

    move-result-object p1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final g2(Lz/i;LW8/N;)V
    .locals 3

    .prologue
    iget-object v0, p0, LR/q;->V:LR/u;

    if-nez v0, :cond_0

    new-instance v0, LR/u;

    iget-boolean v1, p0, LR/q;->Q:Z

    iget-object v2, p0, LR/q;->T:Lx7/a;

    invoke-direct {v0, v1, v2}, LR/u;-><init>(ZLx7/a;)V

    invoke-static {p0}, LF0/t;->a(LF0/s;)V

    iput-object v0, p0, LR/q;->V:LR/u;

    :cond_0
    invoke-virtual {v0, p1, p2}, LR/u;->c(Lz/i;LW8/N;)V

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->t1()LW8/N;

    move-result-object v0

    new-instance v3, LR/q$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LR/q$a;-><init>(LR/q;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public M(J)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LR/q;->Y:Z

    invoke-static {p0}, LF0/k;->i(LF0/j;)LY0/e;

    move-result-object v0

    invoke-static {p1, p2}, LY0/u;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, LR/q;->X:J

    iget p1, p0, LR/q;->R:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LR/q;->Q:Z

    iget-wide v1, p0, LR/q;->X:J

    invoke-static {v0, p1, v1, v2}, LR/i;->a(LY0/e;ZJ)F

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LR/q;->R:F

    invoke-interface {v0, p1}, LY0/e;->B0(F)F

    move-result p1

    :goto_0
    iput p1, p0, LR/q;->W:F

    iget-object p1, p0, LR/q;->Z:Lr/I;

    iget-object p2, p1, Lr/P;->a:[Ljava/lang/Object;

    iget p1, p1, Lr/P;->b:I

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_1

    aget-object v1, p2, v0

    check-cast v1, Lz/n;

    invoke-direct {p0, v1}, LR/q;->e2(Lz/n;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LR/q;->Z:Lr/I;

    invoke-virtual {p1}, Lr/I;->h()V

    return-void
.end method

.method public abstract Y1(Lz/n$b;JF)V
.end method

.method public abstract Z1(Lq0/g;)V
.end method

.method protected final a2()Z
    .locals 1

    iget-boolean v0, p0, LR/q;->Q:Z

    return v0
.end method

.method protected final b2()Lx7/a;
    .locals 1

    iget-object v0, p0, LR/q;->T:Lx7/a;

    return-object v0
.end method

.method public final c2()J
    .locals 2

    iget-object v0, p0, LR/q;->S:Lo0/B0;

    invoke-interface {v0}, Lo0/B0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final d2()J
    .locals 2

    iget-wide v0, p0, LR/q;->X:J

    return-wide v0
.end method

.method public abstract f2(Lz/n$b;)V
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public synthetic m1(LD0/t;)V
    .locals 0

    invoke-static {p0, p1}, LF0/B;->a(LF0/C;LD0/t;)V

    return-void
.end method

.method public y(Lq0/c;)V
    .locals 4

    .prologue
    invoke-interface {p1}, Lq0/c;->l1()V

    iget-object v0, p0, LR/q;->V:LR/u;

    if-eqz v0, :cond_0

    iget v1, p0, LR/q;->W:F

    invoke-virtual {p0}, LR/q;->c2()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, LR/u;->b(Lq0/g;FJ)V

    :cond_0
    invoke-virtual {p0, p1}, LR/q;->Z1(Lq0/g;)V

    return-void
.end method

.method public final y1()Z
    .locals 1

    iget-boolean v0, p0, LR/q;->U:Z

    return v0
.end method
