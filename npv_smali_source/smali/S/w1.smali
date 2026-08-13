.class public final LS/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LS/w1;->a:J

    iput-wide p3, p0, LS/w1;->b:J

    iput-wide p5, p0, LS/w1;->c:J

    iput-wide p7, p0, LS/w1;->d:J

    iput-wide p9, p0, LS/w1;->e:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, LS/w1;-><init>(JJJJJ)V

    return-void
.end method


# virtual methods
.method public final a(F)J
    .locals 5

    iget-wide v0, p0, LS/w1;->a:J

    iget-wide v2, p0, LS/w1;->b:J

    invoke-static {}, Lu/H;->c()Lu/F;

    move-result-object v4

    invoke-interface {v4, p1}, Lu/F;->a(F)F

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lo0/A0;->i(JJF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LS/w1;->e:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LS/w1;->c:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LS/w1;->d:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    instance-of v2, p1, LS/w1;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v2, p0, LS/w1;->a:J

    check-cast p1, LS/w1;

    iget-wide v4, p1, LS/w1;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LS/w1;->b:J

    iget-wide v4, p1, LS/w1;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/w1;->c:J

    iget-wide v4, p1, LS/w1;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/w1;->d:J

    iget-wide v4, p1, LS/w1;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LS/w1;->e:J

    iget-wide v4, p1, LS/w1;->e:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/w1;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/w1;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/w1;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/w1;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/w1;->e:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
