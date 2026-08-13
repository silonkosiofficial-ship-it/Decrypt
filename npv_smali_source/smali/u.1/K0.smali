.class public final Lu/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/B0;


# instance fields
.field private final a:Lu/F0;

.field private final b:Lu/f0;

.field private final c:J

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lu/F0;Lu/f0;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/K0;->a:Lu/F0;

    iput-object p2, p0, Lu/K0;->b:Lu/f0;

    invoke-interface {p1}, Lu/F0;->d()I

    move-result p2

    invoke-interface {p1}, Lu/F0;->f()I

    move-result p1

    add-int/2addr p2, p1

    int-to-long p1, p2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iput-wide p1, p0, Lu/K0;->c:J

    mul-long/2addr p3, v0

    iput-wide p3, p0, Lu/K0;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lu/F0;Lu/f0;JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lu/K0;-><init>(Lu/F0;Lu/f0;J)V

    return-void
.end method

.method private final h(J)J
    .locals 8

    .prologue
    iget-wide v0, p0, Lu/K0;->d:J

    add-long v2, p1, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    return-wide v4

    :cond_0
    add-long/2addr p1, v0

    iget-wide v0, p0, Lu/K0;->c:J

    div-long v2, p1, v0

    iget-object v6, p0, Lu/K0;->b:Lu/f0;

    sget-object v7, Lu/f0;->C:Lu/f0;

    if-eq v6, v7, :cond_2

    const/4 v6, 0x2

    int-to-long v6, v6

    rem-long v6, v2, v6

    cmp-long v4, v6, v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    mul-long/2addr v2, v0

    sub-long/2addr v2, p1

    return-wide v2

    :cond_2
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->signum(J)I

    mul-long/2addr v2, v0

    sub-long/2addr p1, v2

    return-wide p1
.end method

.method private final i(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 10

    .prologue
    iget-wide v0, p0, Lu/K0;->d:J

    add-long/2addr p1, v0

    iget-wide v2, p0, Lu/K0;->c:J

    cmp-long p1, p1, v2

    if-lez p1, :cond_0

    iget-object v4, p0, Lu/K0;->a:Lu/F0;

    sub-long v5, v2, v0

    move-object v7, p3

    move-object v8, p5

    move-object v9, p4

    invoke-interface/range {v4 .. v9}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p4

    :cond_0
    return-object p4
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 9

    iget-object v0, p0, Lu/K0;->a:Lu/F0;

    invoke-direct {p0, p1, p2}, Lu/K0;->h(J)J

    move-result-wide v1

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p5

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lu/K0;->i(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v5

    move-object v3, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v5}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 9

    iget-object v0, p0, Lu/K0;->a:Lu/F0;

    invoke-direct {p0, p1, p2}, Lu/K0;->h(J)J

    move-result-wide v1

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object v7, p5

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lu/K0;->i(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v5

    move-object v3, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v5}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public e(Lu/r;Lu/r;Lu/r;)J
    .locals 0

    const-wide p1, 0x7fffffffffffffffL

    return-wide p1
.end method

.method public synthetic g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/A0;->a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method
