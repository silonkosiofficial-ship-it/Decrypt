.class public final LS/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:J

.field private final l:J

.field private final m:J

.field private final n:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJJJJJJJJJJ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, LS/o1;->a:J

    move-wide v1, p3

    iput-wide v1, v0, LS/o1;->b:J

    move-wide v1, p5

    iput-wide v1, v0, LS/o1;->c:J

    move-wide v1, p7

    iput-wide v1, v0, LS/o1;->d:J

    move-wide v1, p9

    iput-wide v1, v0, LS/o1;->e:J

    move-wide v1, p11

    iput-wide v1, v0, LS/o1;->f:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LS/o1;->g:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, LS/o1;->h:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, LS/o1;->i:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, LS/o1;->j:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, LS/o1;->k:J

    move-wide/from16 v1, p23

    iput-wide v1, v0, LS/o1;->l:J

    move-wide/from16 v1, p25

    iput-wide v1, v0, LS/o1;->m:J

    move-wide/from16 v1, p27

    iput-wide v1, v0, LS/o1;->n:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJJJJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p28}, LS/o1;-><init>(JJJJJJJJJJJJJJ)V

    return-void
.end method


# virtual methods
.method public final a(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/o1;->e:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/o1;->f:J

    :goto_0
    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LS/o1;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LS/o1;->d:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LS/o1;->b:J

    return-wide v0
.end method

.method public final e(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/o1;->g:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/o1;->h:J

    :goto_0
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

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LS/o1;

    if-eq v3, v2, :cond_2

    return v1

    :cond_2
    check-cast p1, LS/o1;

    iget-wide v2, p0, LS/o1;->a:J

    iget-wide v4, p1, LS/o1;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/o1;->b:J

    iget-wide v4, p1, LS/o1;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/o1;->c:J

    iget-wide v4, p1, LS/o1;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LS/o1;->d:J

    iget-wide v4, p1, LS/o1;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, LS/o1;->g:J

    iget-wide v4, p1, LS/o1;->g:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, LS/o1;->h:J

    iget-wide v4, p1, LS/o1;->h:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, LS/o1;->i:J

    iget-wide v4, p1, LS/o1;->i:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, LS/o1;->j:J

    iget-wide v4, p1, LS/o1;->j:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-wide v2, p0, LS/o1;->k:J

    iget-wide v4, p1, LS/o1;->k:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-wide v2, p0, LS/o1;->l:J

    iget-wide v4, p1, LS/o1;->l:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-wide v2, p0, LS/o1;->m:J

    iget-wide v4, p1, LS/o1;->m:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    :cond_d
    iget-wide v2, p0, LS/o1;->n:J

    iget-wide v4, p1, LS/o1;->n:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_e

    return v1

    :cond_e
    return v0
.end method

.method public final f(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/o1;->i:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/o1;->j:J

    :goto_0
    return-wide v0
.end method

.method public final g(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/o1;->k:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/o1;->l:J

    :goto_0
    return-wide v0
.end method

.method public final h(Z)J
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-wide v0, p0, LS/o1;->m:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LS/o1;->n:J

    :goto_0
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/o1;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->g:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->h:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->i:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->j:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->k:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->l:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->m:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/o1;->n:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
