.class public abstract LD0/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/O;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/X$a;
    }
.end annotation


# instance fields
.field private C:I

.field private D:I

.field private E:J

.field private F:J

.field private G:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0, v0}, LY0/u;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, LD0/X;->E:J

    invoke-static {}, LD0/Y;->c()J

    move-result-wide v0

    iput-wide v0, p0, LD0/X;->F:J

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LD0/X;->G:J

    return-void
.end method

.method private final L0()V
    .locals 4

    iget-wide v0, p0, LD0/X;->E:J

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v0

    iget-wide v1, p0, LD0/X;->F:J

    invoke-static {v1, v2}, LY0/b;->n(J)I

    move-result v1

    iget-wide v2, p0, LD0/X;->F:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, LE7/j;->k(III)I

    move-result v0

    iput v0, p0, LD0/X;->C:I

    iget-wide v0, p0, LD0/X;->E:J

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v0

    iget-wide v1, p0, LD0/X;->F:J

    invoke-static {v1, v2}, LY0/b;->m(J)I

    move-result v1

    iget-wide v2, p0, LD0/X;->F:J

    invoke-static {v2, v3}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v0, v1, v2}, LE7/j;->k(III)I

    move-result v0

    iput v0, p0, LD0/X;->D:I

    iget v0, p0, LD0/X;->C:I

    iget-wide v1, p0, LD0/X;->E:J

    invoke-static {v1, v2}, LY0/t;->g(J)I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, LD0/X;->D:I

    iget-wide v2, p0, LD0/X;->E:J

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, LY0/q;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, LD0/X;->G:J

    return-void
.end method

.method public static final synthetic r0(LD0/X;)J
    .locals 2

    iget-wide v0, p0, LD0/X;->G:J

    return-wide v0
.end method

.method public static final synthetic s0(LD0/X;JFLr0/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X;->M0(JFLr0/c;)V

    return-void
.end method

.method public static final synthetic t0(LD0/X;JFLx7/l;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X;->R0(JFLx7/l;)V

    return-void
.end method


# virtual methods
.method public D0()I
    .locals 2

    iget-wide v0, p0, LD0/X;->E:J

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result v0

    return v0
.end method

.method protected final E0()J
    .locals 2

    iget-wide v0, p0, LD0/X;->F:J

    return-wide v0
.end method

.method public final I0()I
    .locals 1

    iget v0, p0, LD0/X;->C:I

    return v0
.end method

.method protected M0(JFLr0/c;)V
    .locals 0

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, LD0/X;->R0(JFLx7/l;)V

    return-void
.end method

.method protected abstract R0(JFLx7/l;)V
.end method

.method protected final Y0(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, LD0/X;->E:J

    invoke-static {v0, v1, p1, p2}, LY0/t;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, LD0/X;->E:J

    invoke-direct {p0}, LD0/X;->L0()V

    :cond_0
    return-void
.end method

.method public synthetic Z()Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, LD0/N;->a(LD0/O;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final a1(J)V
    .locals 2

    .prologue
    iget-wide v0, p0, LD0/X;->F:J

    invoke-static {v0, v1, p1, p2}, LY0/b;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, LD0/X;->F:J

    invoke-direct {p0}, LD0/X;->L0()V

    :cond_0
    return-void
.end method

.method protected final u0()J
    .locals 2

    iget-wide v0, p0, LD0/X;->G:J

    return-wide v0
.end method

.method public final w0()I
    .locals 1

    iget v0, p0, LD0/X;->D:I

    return v0
.end method

.method public x0()I
    .locals 2

    iget-wide v0, p0, LD0/X;->E:J

    invoke-static {v0, v1}, LY0/t;->f(J)I

    move-result v0

    return v0
.end method

.method protected final z0()J
    .locals 2

    iget-wide v0, p0, LD0/X;->E:J

    return-wide v0
.end method
