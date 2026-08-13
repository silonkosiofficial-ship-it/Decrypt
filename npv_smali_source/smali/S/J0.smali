.class final LS/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/I;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:Lo0/B0;

.field private final d:J


# direct methods
.method private constructor <init>(ZFJ)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, LS/J0;-><init>(ZFLo0/B0;J)V

    return-void
.end method

.method public synthetic constructor <init>(ZFJLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LS/J0;-><init>(ZFJ)V

    return-void
.end method

.method private constructor <init>(ZFLo0/B0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LS/J0;->a:Z

    iput p2, p0, LS/J0;->b:F

    iput-object p3, p0, LS/J0;->c:Lo0/B0;

    iput-wide p4, p0, LS/J0;->d:J

    return-void
.end method

.method public static final synthetic c(LS/J0;)J
    .locals 2

    iget-wide v0, p0, LS/J0;->d:J

    return-wide v0
.end method


# virtual methods
.method public a(Lz/j;)LF0/j;
    .locals 7

    .prologue
    iget-object v0, p0, LS/J0;->c:Lo0/B0;

    if-nez v0, :cond_0

    new-instance v0, LS/J0$a;

    invoke-direct {v0, p0}, LS/J0$a;-><init>(LS/J0;)V

    :cond_0
    move-object v5, v0

    new-instance v0, LS/X;

    iget-boolean v3, p0, LS/J0;->a:Z

    iget v4, p0, LS/J0;->b:F

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LS/X;-><init>(Lz/j;ZFLo0/B0;Ly7/k;)V

    return-object v0
.end method

.method public synthetic b(Lz/j;LV/n;I)Lv/H;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv/F;->a(Lv/G;Lz/j;LV/n;I)Lv/H;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LS/J0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, LS/J0;->a:Z

    check-cast p1, LS/J0;

    iget-boolean v2, p1, LS/J0;->a:Z

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    iget v0, p0, LS/J0;->b:F

    iget v2, p1, LS/J0;->b:F

    invoke-static {v0, v2}, LY0/i;->s(FF)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, LS/J0;->c:Lo0/B0;

    iget-object v2, p1, LS/J0;->c:Lo0/B0;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-wide v0, p0, LS/J0;->d:J

    iget-wide v2, p1, LS/J0;->d:J

    invoke-static {v0, v1, v2, v3}, Lo0/y0;->o(JJ)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-boolean v0, p0, LS/J0;->a:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS/J0;->b:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS/J0;->c:Lo0/B0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/J0;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
