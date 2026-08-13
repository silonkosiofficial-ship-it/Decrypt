.class public final LS/M;
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

.field private final o:J

.field private final p:J

.field private final q:J

.field private final r:J

.field private final s:J

.field private final t:J

.field private final u:J

.field private final v:J

.field private final w:J

.field private final x:J

.field private final y:LS/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJJJJJJJJJJJJJJJJJJJJLS/i1;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, LS/M;->a:J

    move-wide v1, p3

    iput-wide v1, v0, LS/M;->b:J

    move-wide v1, p5

    iput-wide v1, v0, LS/M;->c:J

    move-wide v1, p7

    iput-wide v1, v0, LS/M;->d:J

    move-wide v1, p9

    iput-wide v1, v0, LS/M;->e:J

    move-wide v1, p11

    iput-wide v1, v0, LS/M;->f:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LS/M;->g:J

    move-wide/from16 v1, p15

    iput-wide v1, v0, LS/M;->h:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, LS/M;->i:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, LS/M;->j:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, LS/M;->k:J

    move-wide/from16 v1, p23

    iput-wide v1, v0, LS/M;->l:J

    move-wide/from16 v1, p25

    iput-wide v1, v0, LS/M;->m:J

    move-wide/from16 v1, p27

    iput-wide v1, v0, LS/M;->n:J

    move-wide/from16 v1, p29

    iput-wide v1, v0, LS/M;->o:J

    move-wide/from16 v1, p31

    iput-wide v1, v0, LS/M;->p:J

    move-wide/from16 v1, p33

    iput-wide v1, v0, LS/M;->q:J

    move-wide/from16 v1, p35

    iput-wide v1, v0, LS/M;->r:J

    move-wide/from16 v1, p37

    iput-wide v1, v0, LS/M;->s:J

    move-wide/from16 v1, p39

    iput-wide v1, v0, LS/M;->t:J

    move-wide/from16 v1, p41

    iput-wide v1, v0, LS/M;->u:J

    move-wide/from16 v1, p43

    iput-wide v1, v0, LS/M;->v:J

    move-wide/from16 v1, p45

    iput-wide v1, v0, LS/M;->w:J

    move-wide/from16 v1, p47

    iput-wide v1, v0, LS/M;->x:J

    move-object/from16 v1, p49

    iput-object v1, v0, LS/M;->y:LS/i1;

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJJJJJJJJJJJJJJLS/i1;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p49}, LS/M;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJLS/i1;)V

    return-void
.end method


# virtual methods
.method public final a(ZZZLV/n;I)LV/G1;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)"

    const v2, -0x49f04362

    invoke-static {v2, p5, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    iget-wide p1, p0, LS/M;->r:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    iget-wide p1, p0, LS/M;->s:J

    goto :goto_0

    :cond_2
    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->f()J

    move-result-wide p1

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    if-eqz p3, :cond_3

    const p2, -0xcf4b2cd

    invoke-interface {p4, p2}, LV/n;->T(I)V

    const/16 p2, 0x64

    const/4 p3, 0x6

    const/4 p5, 0x0

    invoke-static {p2, p1, p5, p3, p5}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p4

    invoke-static/range {v0 .. v7}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    :goto_2
    invoke-interface {p4}, LV/n;->J()V

    goto :goto_3

    :cond_3
    const p2, -0xcf2f0d1    # -1.117587E31f

    invoke-interface {p4, p2}, LV/n;->T(I)V

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p2

    invoke-static {p2, p4, p1}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    goto :goto_2

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object p1
.end method

.method public final b(ZZZZLV/n;I)LV/G1;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)"

    const v2, -0x4988b0c6

    invoke-static {v2, p6, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    iget-wide p1, p0, LS/M;->p:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    if-nez p4, :cond_2

    iget-wide p1, p0, LS/M;->q:J

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    if-eqz p4, :cond_3

    iget-wide p1, p0, LS/M;->w:J

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_5

    if-nez p4, :cond_5

    :cond_4
    iget-wide p1, p0, LS/M;->o:J

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_6

    iget-wide p1, p0, LS/M;->t:J

    goto :goto_0

    :cond_6
    if-eqz p4, :cond_4

    iget-wide p1, p0, LS/M;->n:J

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    if-eqz p3, :cond_7

    const p2, -0x315ee799

    invoke-interface {p5, p2}, LV/n;->T(I)V

    invoke-static {v0, v1}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p2

    invoke-static {p2, p5, p1}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    :goto_2
    invoke-interface {p5}, LV/n;->J()V

    goto :goto_3

    :cond_7
    const p2, -0x315df623

    invoke-interface {p5, p2}, LV/n;->T(I)V

    const/16 p2, 0x64

    const/4 p3, 0x6

    const/4 p4, 0x0

    invoke-static {p2, p1, p4, p3, p4}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p5

    invoke-static/range {v0 .. v7}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    goto :goto_2

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    return-object p1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LS/M;->a:J

    return-wide v0
.end method

.method public final d()LS/i1;
    .locals 1

    iget-object v0, p0, LS/M;->y:LS/i1;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, LS/M;->x:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    instance-of v0, p1, LS/M;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-wide v2, p0, LS/M;->a:J

    check-cast p1, LS/M;

    iget-wide v4, p1, LS/M;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-wide v2, p0, LS/M;->b:J

    iget-wide v4, p1, LS/M;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LS/M;->c:J

    iget-wide v4, p1, LS/M;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/M;->d:J

    iget-wide v4, p1, LS/M;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/M;->e:J

    iget-wide v4, p1, LS/M;->e:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LS/M;->g:J

    iget-wide v4, p1, LS/M;->g:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, LS/M;->h:J

    iget-wide v4, p1, LS/M;->h:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, LS/M;->i:J

    iget-wide v4, p1, LS/M;->i:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, LS/M;->j:J

    iget-wide v4, p1, LS/M;->j:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, LS/M;->k:J

    iget-wide v4, p1, LS/M;->k:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_a

    return v1

    :cond_a
    iget-wide v2, p0, LS/M;->l:J

    iget-wide v4, p1, LS/M;->l:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_b

    return v1

    :cond_b
    iget-wide v2, p0, LS/M;->m:J

    iget-wide v4, p1, LS/M;->m:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_c

    return v1

    :cond_c
    iget-wide v2, p0, LS/M;->n:J

    iget-wide v4, p1, LS/M;->n:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_d

    return v1

    :cond_d
    iget-wide v2, p0, LS/M;->o:J

    iget-wide v4, p1, LS/M;->o:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_e

    return v1

    :cond_e
    iget-wide v2, p0, LS/M;->p:J

    iget-wide v4, p1, LS/M;->p:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_f

    return v1

    :cond_f
    iget-wide v2, p0, LS/M;->q:J

    iget-wide v4, p1, LS/M;->q:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_10

    return v1

    :cond_10
    iget-wide v2, p0, LS/M;->r:J

    iget-wide v4, p1, LS/M;->r:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_11

    return v1

    :cond_11
    iget-wide v2, p0, LS/M;->s:J

    iget-wide v4, p1, LS/M;->s:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_12

    return v1

    :cond_12
    iget-wide v2, p0, LS/M;->t:J

    iget-wide v4, p1, LS/M;->t:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_13

    return v1

    :cond_13
    iget-wide v2, p0, LS/M;->u:J

    iget-wide v4, p1, LS/M;->u:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_14

    return v1

    :cond_14
    iget-wide v2, p0, LS/M;->v:J

    iget-wide v4, p1, LS/M;->v:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-nez v0, :cond_15

    return v1

    :cond_15
    iget-wide v2, p0, LS/M;->w:J

    iget-wide v4, p1, LS/M;->w:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_16

    return v1

    :cond_16
    const/4 p1, 0x1

    return p1
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, LS/M;->c:J

    return-wide v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, LS/M;->f:J

    return-wide v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, LS/M;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/M;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->e:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->g:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->h:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->i:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->j:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->k:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->l:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->m:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->n:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->o:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->p:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->q:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->r:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->s:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->t:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->u:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->v:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/M;->w:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, LS/M;->u:J

    return-wide v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, LS/M;->d:J

    return-wide v0
.end method

.method public final k(ZZLV/n;I)LV/G1;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)"

    const v2, -0x4ddd07e3

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    iget-wide p1, p0, LS/M;->l:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    iget-wide p1, p0, LS/M;->m:J

    goto :goto_0

    :cond_2
    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->f()J

    move-result-wide p1

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p4, 0x64

    const/4 v2, 0x0

    invoke-static {p4, p1, v2, p2, v2}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p1
.end method

.method public final l(ZZZLV/n;I)LV/G1;
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)"

    const v2, 0x3419e079

    invoke-static {v2, p5, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    iget-wide p1, p0, LS/M;->j:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    if-nez p3, :cond_2

    iget-wide p1, p0, LS/M;->k:J

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    iget-wide p1, p0, LS/M;->i:J

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_4

    iget-wide p1, p0, LS/M;->g:J

    goto :goto_0

    :cond_4
    iget-wide p1, p0, LS/M;->h:J

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p3, 0x64

    const/4 p5, 0x0

    invoke-static {p3, p1, p5, p2, p5}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p4

    invoke-static/range {v0 .. v7}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object p1
.end method
