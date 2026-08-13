.class public final LS/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LS/k;->a:J

    iput-wide p3, p0, LS/k;->b:J

    iput-wide p5, p0, LS/k;->c:J

    iput-wide p7, p0, LS/k;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LS/k;-><init>(JJJJ)V

    return-void
.end method


# virtual methods
.method public final a(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/k;->a:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/k;->c:J

    :goto_0
    return-wide v0
.end method

.method public final b(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/k;->b:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/k;->d:J

    :goto_0
    return-wide v0
.end method

.method public final c(JJJJ)LS/k;
    .locals 15

    .prologue
    move-object v0, p0

    const-wide/16 v1, 0x10

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    move-wide/from16 v6, p1

    goto :goto_0

    :cond_0
    iget-wide v3, v0, LS/k;->a:J

    move-wide v6, v3

    :goto_0
    cmp-long v3, p3, v1

    if-eqz v3, :cond_1

    move-wide/from16 v8, p3

    goto :goto_1

    :cond_1
    iget-wide v3, v0, LS/k;->b:J

    move-wide v8, v3

    :goto_1
    cmp-long v3, p5, v1

    if-eqz v3, :cond_2

    move-wide/from16 v10, p5

    goto :goto_2

    :cond_2
    iget-wide v3, v0, LS/k;->c:J

    move-wide v10, v3

    :goto_2
    cmp-long v1, p7, v1

    if-eqz v1, :cond_3

    move-wide/from16 v12, p7

    goto :goto_3

    :cond_3
    iget-wide v1, v0, LS/k;->d:J

    move-wide v12, v1

    :goto_3
    new-instance v1, LS/k;

    const/4 v14, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v14}, LS/k;-><init>(JJJJLy7/k;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    instance-of v2, p1, LS/k;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v2, p0, LS/k;->a:J

    check-cast p1, LS/k;

    iget-wide v4, p1, LS/k;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LS/k;->b:J

    iget-wide v4, p1, LS/k;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/k;->c:J

    iget-wide v4, p1, LS/k;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/k;->d:J

    iget-wide v4, p1, LS/k;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/k;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/k;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/k;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/k;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
