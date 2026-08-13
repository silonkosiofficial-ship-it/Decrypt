.class final Landroidx/compose/animation/e$b;
.super Lt/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final b:Lu/s0$a;

.field private final c:LV/G1;

.field final synthetic d:Landroidx/compose/animation/e;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/e;Lu/s0$a;LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b;->d:Landroidx/compose/animation/e;

    invoke-direct {p0}, Lt/t;-><init>()V

    iput-object p2, p0, Landroidx/compose/animation/e$b;->b:Lu/s0$a;

    iput-object p3, p0, Landroidx/compose/animation/e$b;->c:LV/G1;

    return-void
.end method


# virtual methods
.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    .prologue
    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    iget-object p3, p0, Landroidx/compose/animation/e$b;->b:Lu/s0$a;

    new-instance p4, Landroidx/compose/animation/e$b$b;

    iget-object v0, p0, Landroidx/compose/animation/e$b;->d:Landroidx/compose/animation/e;

    invoke-direct {p4, v0, p0}, Landroidx/compose/animation/e$b$b;-><init>(Landroidx/compose/animation/e;Landroidx/compose/animation/e$b;)V

    new-instance v0, Landroidx/compose/animation/e$b$c;

    iget-object v1, p0, Landroidx/compose/animation/e$b;->d:Landroidx/compose/animation/e;

    invoke-direct {v0, v1}, Landroidx/compose/animation/e$b$c;-><init>(Landroidx/compose/animation/e;)V

    invoke-virtual {p3, p4, v0}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object p3

    iget-object p4, p0, Landroidx/compose/animation/e$b;->d:Landroidx/compose/animation/e;

    invoke-virtual {p4, p3}, Landroidx/compose/animation/e;->j(LV/G1;)V

    invoke-interface {p1}, LD0/o;->A0()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p3

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p4

    invoke-static {p3, p4}, LY0/u;->a(II)J

    move-result-wide p3

    goto :goto_0

    :cond_0
    invoke-interface {p3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LY0/t;

    invoke-virtual {p3}, LY0/t;->j()J

    move-result-wide p3

    :goto_0
    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result v2

    new-instance v4, Landroidx/compose/animation/e$b$a;

    iget-object v0, p0, Landroidx/compose/animation/e$b;->d:Landroidx/compose/animation/e;

    invoke-direct {v4, v0, p2, p3, p4}, Landroidx/compose/animation/e$b$a;-><init>(Landroidx/compose/animation/e;LD0/X;J)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final g()LV/G1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e$b;->c:LV/G1;

    return-object v0
.end method
