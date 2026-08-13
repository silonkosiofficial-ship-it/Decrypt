.class final Lu/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/B0;


# instance fields
.field private final a:Lu/B0;

.field private final b:J


# direct methods
.method public constructor <init>(Lu/B0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/n0;->a:Lu/B0;

    iput-wide p2, p0, Lu/n0;->b:J

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu/n0;->a:Lu/B0;

    invoke-interface {v0}, Lu/B0;->a()Z

    move-result v0

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 9

    .prologue
    iget-wide v0, p0, Lu/n0;->b:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lu/n0;->a:Lu/B0;

    sub-long v4, p1, v0

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-interface/range {v3 .. v8}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p5

    :goto_0
    return-object p5
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 9

    .prologue
    iget-wide v0, p0, Lu/n0;->b:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lu/n0;->a:Lu/B0;

    sub-long v4, p1, v0

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-interface/range {v3 .. v8}, Lu/B0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p3

    :goto_0
    return-object p3
.end method

.method public e(Lu/r;Lu/r;Lu/r;)J
    .locals 2

    iget-object v0, p0, Lu/n0;->a:Lu/B0;

    invoke-interface {v0, p1, p2, p3}, Lu/B0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide p1

    iget-wide v0, p0, Lu/n0;->b:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    instance-of v0, p1, Lu/n0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu/n0;

    iget-wide v2, p1, Lu/n0;->b:J

    iget-wide v4, p0, Lu/n0;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-object p1, p1, Lu/n0;->a:Lu/B0;

    iget-object v0, p0, Lu/n0;->a:Lu/B0;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public synthetic g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/A0;->a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lu/n0;->a:Lu/B0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lu/n0;->b:J

    invoke-static {v1, v2}, Lr/r;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
