.class public final LS/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/v$a;
    }
.end annotation


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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJJJJJJJJ)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, LS/v;->a:J

    move-wide v1, p3

    iput-wide v1, v0, LS/v;->b:J

    move-wide v1, p5

    iput-wide v1, v0, LS/v;->c:J

    move-wide v1, p7

    iput-wide v1, v0, LS/v;->d:J

    move-wide v1, p9

    iput-wide v1, v0, LS/v;->e:J

    move-wide v1, p11

    iput-wide v1, v0, LS/v;->f:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LS/v;->g:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, LS/v;->h:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, LS/v;->i:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, LS/v;->j:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, LS/v;->k:J

    move-wide/from16 v1, p23

    iput-wide v1, v0, LS/v;->l:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p24}, LS/v;-><init>(JJJJJJJJJJJJ)V

    return-void
.end method


# virtual methods
.method public final a(ZLL0/a;LV/n;I)LV/G1;
    .locals 10

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)"

    const v2, 0x3c2defc6

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    sget-object v2, LS/v$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz p1, :cond_3

    aget v2, v2, v3

    if-eq v2, v1, :cond_2

    if-eq v2, v0, :cond_2

    if-ne v2, p4, :cond_1

    iget-wide v0, p0, LS/v;->i:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    iget-wide v0, p0, LS/v;->h:J

    goto :goto_0

    :cond_3
    aget v2, v2, v3

    if-eq v2, v1, :cond_6

    if-eq v2, v0, :cond_5

    if-ne v2, p4, :cond_4

    iget-wide v0, p0, LS/v;->k:J

    goto :goto_0

    :cond_4
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, LS/v;->l:J

    goto :goto_0

    :cond_6
    iget-wide v0, p0, LS/v;->j:J

    goto :goto_0

    :goto_1
    const/4 p4, 0x0

    if-eqz p1, :cond_8

    const p1, -0x66dddeb1

    invoke-interface {p3, p1}, LV/n;->T(I)V

    sget-object p1, LL0/a;->D:LL0/a;

    if-ne p2, p1, :cond_7

    const/16 p1, 0x64

    goto :goto_2

    :cond_7
    const/16 p1, 0x32

    :goto_2
    const/4 p2, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p4, v0, p2, v0}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    :goto_3
    invoke-interface {p3}, LV/n;->J()V

    goto :goto_4

    :cond_8
    const p1, -0x66db1d71

    invoke-interface {p3, p1}, LV/n;->T(I)V

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    invoke-static {p1, p3, p4}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    goto :goto_3

    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object p1
.end method

.method public final b(ZLL0/a;LV/n;I)LV/G1;
    .locals 10

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)"

    const v2, 0x15804d09

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    sget-object v2, LS/v$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz p1, :cond_3

    aget v2, v2, v3

    if-eq v2, v1, :cond_2

    if-eq v2, v0, :cond_2

    if-ne v2, p4, :cond_1

    iget-wide v0, p0, LS/v;->d:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    iget-wide v0, p0, LS/v;->c:J

    goto :goto_0

    :cond_3
    aget v2, v2, v3

    if-eq v2, v1, :cond_6

    if-eq v2, v0, :cond_5

    if-ne v2, p4, :cond_4

    iget-wide v0, p0, LS/v;->f:J

    goto :goto_0

    :cond_4
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, LS/v;->g:J

    goto :goto_0

    :cond_6
    iget-wide v0, p0, LS/v;->e:J

    goto :goto_0

    :goto_1
    const/4 p4, 0x0

    if-eqz p1, :cond_8

    const p1, -0x1760adc2

    invoke-interface {p3, p1}, LV/n;->T(I)V

    sget-object p1, LL0/a;->D:LL0/a;

    if-ne p2, p1, :cond_7

    const/16 p1, 0x64

    goto :goto_2

    :cond_7
    const/16 p1, 0x32

    :goto_2
    const/4 p2, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p4, v0, p2, v0}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    :goto_3
    invoke-interface {p3}, LV/n;->J()V

    goto :goto_4

    :cond_8
    const p1, -0x175dec82

    invoke-interface {p3, p1}, LV/n;->T(I)V

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    invoke-static {p1, p3, p4}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    goto :goto_3

    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object p1
.end method

.method public final c(LL0/a;LV/n;I)LV/G1;
    .locals 10

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)"

    const v2, -0x1e412491

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, LL0/a;->D:LL0/a;

    if-ne p1, p3, :cond_1

    iget-wide v0, p0, LS/v;->b:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    iget-wide v0, p0, LS/v;->a:J

    goto :goto_0

    :goto_1
    if-ne p1, p3, :cond_2

    const/16 p1, 0x64

    goto :goto_2

    :cond_2
    const/16 p1, 0x32

    :goto_2
    const/4 p3, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p1, p3, v1, v0, v1}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_e

    instance-of v2, p1, LS/v;

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-wide v2, p0, LS/v;->a:J

    check-cast p1, LS/v;

    iget-wide v4, p1, LS/v;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LS/v;->b:J

    iget-wide v4, p1, LS/v;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/v;->c:J

    iget-wide v4, p1, LS/v;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/v;->d:J

    iget-wide v4, p1, LS/v;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LS/v;->e:J

    iget-wide v4, p1, LS/v;->e:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, LS/v;->f:J

    iget-wide v4, p1, LS/v;->f:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, LS/v;->g:J

    iget-wide v4, p1, LS/v;->g:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, LS/v;->h:J

    iget-wide v4, p1, LS/v;->h:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, LS/v;->i:J

    iget-wide v4, p1, LS/v;->i:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-wide v2, p0, LS/v;->j:J

    iget-wide v4, p1, LS/v;->j:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-wide v2, p0, LS/v;->k:J

    iget-wide v4, p1, LS/v;->k:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-wide v2, p0, LS/v;->l:J

    iget-wide v4, p1, LS/v;->l:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    return v1

    :cond_d
    return v0

    :cond_e
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/v;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->e:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->f:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->g:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->h:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->i:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->j:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->k:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/v;->l:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
