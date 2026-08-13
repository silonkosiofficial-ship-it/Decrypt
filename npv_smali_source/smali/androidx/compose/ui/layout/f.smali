.class final Landroidx/compose/ui/layout/f;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/C;


# instance fields
.field private P:Lx7/l;

.field private final Q:Z

.field private R:J


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 2

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/f;->P:Lx7/l;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/layout/f;->Q:Z

    const/high16 p1, -0x80000000

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/f;->R:J

    return-void
.end method


# virtual methods
.method public M(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, Landroidx/compose/ui/layout/f;->R:J

    invoke-static {v0, v1, p1, p2}, LY0/t;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/layout/f;->P:Lx7/l;

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-wide p1, p0, Landroidx/compose/ui/layout/f;->R:J

    :cond_0
    return-void
.end method

.method public final T1(Lx7/l;)V
    .locals 2

    iput-object p1, p0, Landroidx/compose/ui/layout/f;->P:Lx7/l;

    const/high16 p1, -0x80000000

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/f;->R:J

    return-void
.end method

.method public synthetic m1(LD0/t;)V
    .locals 0

    invoke-static {p0, p1}, LF0/B;->a(LF0/C;LD0/t;)V

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/layout/f;->Q:Z

    return v0
.end method
