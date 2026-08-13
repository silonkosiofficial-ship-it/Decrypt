.class public abstract Ld9/f;
.super LW8/q0;
.source "SourceFile"


# instance fields
.field private final F:I

.field private final G:I

.field private final H:J

.field private final I:Ljava/lang/String;

.field private J:Ld9/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LW8/q0;-><init>()V

    iput p1, p0, Ld9/f;->F:I

    iput p2, p0, Ld9/f;->G:I

    iput-wide p3, p0, Ld9/f;->H:J

    iput-object p5, p0, Ld9/f;->I:Ljava/lang/String;

    invoke-direct {p0}, Ld9/f;->A1()Ld9/a;

    move-result-object p1

    iput-object p1, p0, Ld9/f;->J:Ld9/a;

    return-void
.end method

.method private final A1()Ld9/a;
    .locals 7

    new-instance v6, Ld9/a;

    iget v1, p0, Ld9/f;->F:I

    iget v2, p0, Ld9/f;->G:I

    iget-wide v3, p0, Ld9/f;->H:J

    iget-object v5, p0, Ld9/f;->I:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ld9/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public final B1(Ljava/lang/Runnable;ZZ)V
    .locals 1

    iget-object v0, p0, Ld9/f;->J:Ld9/a;

    invoke-virtual {v0, p1, p2, p3}, Ld9/a;->D(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Ld9/f;->J:Ld9/a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Ld9/a;->H(Ld9/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public u1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Ld9/f;->J:Ld9/a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Ld9/a;->H(Ld9/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public z1()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Ld9/f;->J:Ld9/a;

    return-object v0
.end method
