.class public final LY9/g;
.super LX9/m;
.source "SourceFile"


# instance fields
.field private final D:J

.field private final E:Z

.field private F:J


# direct methods
.method public constructor <init>(LX9/Z;JZ)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LX9/m;-><init>(LX9/Z;)V

    iput-wide p2, p0, LY9/g;->D:J

    iput-boolean p4, p0, LY9/g;->E:Z

    return-void
.end method

.method private final f(LX9/d;J)V
    .locals 1

    new-instance v0, LX9/d;

    invoke-direct {v0}, LX9/d;-><init>()V

    invoke-virtual {v0, p1}, LX9/d;->c0(LX9/Z;)J

    invoke-virtual {p1, v0, p2, p3}, LX9/d;->F0(LX9/d;J)V

    invoke-virtual {v0}, LX9/d;->a()V

    return-void
.end method


# virtual methods
.method public b0(LX9/d;J)J
    .locals 9

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LY9/g;->F:J

    iget-wide v2, p0, LY9/g;->D:J

    cmp-long v4, v0, v2

    const-wide/16 v5, -0x1

    const-wide/16 v7, 0x0

    if-lez v4, :cond_0

    move-wide p2, v7

    goto :goto_0

    :cond_0
    iget-boolean v4, p0, LY9/g;->E:Z

    if-eqz v4, :cond_2

    sub-long/2addr v2, v0

    cmp-long v0, v2, v7

    if-nez v0, :cond_1

    return-wide v5

    :cond_1
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    :cond_2
    :goto_0
    invoke-super {p0, p1, p2, p3}, LX9/m;->b0(LX9/d;J)J

    move-result-wide p2

    cmp-long v0, p2, v5

    if-eqz v0, :cond_3

    iget-wide v1, p0, LY9/g;->F:J

    add-long/2addr v1, p2

    iput-wide v1, p0, LY9/g;->F:J

    :cond_3
    iget-wide v1, p0, LY9/g;->F:J

    iget-wide v3, p0, LY9/g;->D:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_4

    if-eqz v0, :cond_5

    :cond_4
    cmp-long v0, v1, v3

    if-lez v0, :cond_7

    :cond_5
    cmp-long p2, p2, v7

    if-lez p2, :cond_6

    cmp-long p2, v1, v3

    if-lez p2, :cond_6

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide p2

    iget-wide v0, p0, LY9/g;->F:J

    iget-wide v2, p0, LY9/g;->D:J

    sub-long/2addr v0, v2

    sub-long/2addr p2, v0

    invoke-direct {p0, p1, p2, p3}, LY9/g;->f(LX9/d;J)V

    :cond_6
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LY9/g;->D:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but got "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LY9/g;->F:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-wide p2
.end method
