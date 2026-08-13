.class public final LS/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/r;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/r;

    invoke-direct {v0}, LS/r;-><init>()V

    sput-object v0, LS/r;->a:LS/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/q;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)"

    const v2, -0x6fd202ff

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/r;->e(LS/z;)LS/q;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(FFFFFFLV/n;II)LS/s;
    .locals 5

    .prologue
    and-int/lit8 p7, p9, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LU/l;->a:LU/l;

    invoke-virtual {p1}, LU/l;->b()F

    move-result p1

    :cond_0
    and-int/lit8 p7, p9, 0x2

    if-eqz p7, :cond_1

    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->j()F

    move-result p2

    :cond_1
    move p7, p2

    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_2

    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->h()F

    move-result p3

    :cond_2
    move v0, p3

    and-int/lit8 p2, p9, 0x8

    if-eqz p2, :cond_3

    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->i()F

    move-result p4

    :cond_3
    move v1, p4

    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_4

    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->g()F

    move-result p5

    :cond_4
    move v2, p5

    and-int/lit8 p2, p9, 0x20

    if-eqz p2, :cond_5

    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->e()F

    move-result p6

    :cond_5
    move p9, p6

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    const/4 p2, -0x1

    const-string p3, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)"

    const p4, -0x22444137

    invoke-static {p4, p8, p2, p3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    new-instance v3, LS/s;

    const/4 v4, 0x0

    move-object p2, v3

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, p9

    move-object p9, v4

    invoke-direct/range {p2 .. p9}, LS/s;-><init>(FFFFFFLy7/k;)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object v3
.end method

.method public final c(LV/n;I)LS/q;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)"

    const v2, 0x5ff8c177

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/r;->f(LS/z;)LS/q;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final d(FFFFFFLV/n;II)LS/s;
    .locals 5

    .prologue
    and-int/lit8 p7, p9, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LU/i;->a:LU/i;

    invoke-virtual {p1}, LU/i;->b()F

    move-result p1

    :cond_0
    and-int/lit8 p7, p9, 0x2

    if-eqz p7, :cond_1

    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->j()F

    move-result p2

    :cond_1
    move p7, p2

    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_2

    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->h()F

    move-result p3

    :cond_2
    move v0, p3

    and-int/lit8 p2, p9, 0x8

    if-eqz p2, :cond_3

    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->i()F

    move-result p4

    :cond_3
    move v1, p4

    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_4

    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->g()F

    move-result p5

    :cond_4
    move v2, p5

    and-int/lit8 p2, p9, 0x20

    if-eqz p2, :cond_5

    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->e()F

    move-result p6

    :cond_5
    move p9, p6

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    const/4 p2, -0x1

    const-string p3, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)"

    const p4, 0x44cc5593

    invoke-static {p4, p8, p2, p3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    new-instance v3, LS/s;

    const/4 v4, 0x0

    move-object p2, v3

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, p9

    move-object p9, v4

    invoke-direct/range {p2 .. p9}, LS/s;-><init>(FFFFFFLy7/k;)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object v3
.end method

.method public final e(LS/z;)LS/q;
    .locals 19

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->c()LS/q;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/q;

    sget-object v2, LU/l;->a:LU/l;

    invoke-virtual {v2}, LU/l;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/l;->a()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LS/A;->b(LS/z;J)J

    move-result-wide v5

    invoke-virtual {v2}, LU/l;->d()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    invoke-virtual {v2}, LU/l;->f()F

    move-result v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/l;->a()LU/e;

    move-result-object v9

    invoke-static {v0, v9}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Lo0/A0;->h(JJ)J

    move-result-wide v7

    invoke-virtual {v2}, LU/l;->a()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-static {v0, v9, v10}, LS/A;->b(LS/z;J)J

    move-result-wide v11

    const/16 v17, 0xe

    const/16 v18, 0x0

    const v13, 0x3ec28f5c    # 0.38f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, LS/q;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->b0(LS/q;)V

    :cond_0
    return-object v1
.end method

.method public final f(LS/z;)LS/q;
    .locals 19

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->g()LS/q;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/q;

    sget-object v2, LU/i;->a:LU/i;

    invoke-virtual {v2}, LU/i;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/i;->a()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LS/A;->b(LS/z;J)J

    move-result-wide v5

    invoke-virtual {v2}, LU/i;->d()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    invoke-virtual {v2}, LU/i;->f()F

    move-result v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/i;->d()LU/e;

    move-result-object v9

    invoke-static {v0, v9}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Lo0/A0;->h(JJ)J

    move-result-wide v7

    invoke-virtual {v2}, LU/i;->a()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-static {v0, v9, v10}, LS/A;->b(LS/z;J)J

    move-result-wide v11

    const/16 v17, 0xe

    const/16 v18, 0x0

    const v13, 0x3ec28f5c    # 0.38f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, LS/q;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->f0(LS/q;)V

    :cond_0
    return-object v1
.end method

.method public final g(LS/z;)LS/q;
    .locals 19

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->l()LS/q;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/q;

    sget-object v2, LU/t;->a:LU/t;

    invoke-virtual {v2}, LU/t;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/t;->a()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LS/A;->b(LS/z;J)J

    move-result-wide v5

    invoke-virtual {v2}, LU/t;->a()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/t;->a()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-static {v0, v9, v10}, LS/A;->b(LS/z;J)J

    move-result-wide v11

    const/16 v17, 0xe

    const/16 v18, 0x0

    const v13, 0x3ec28f5c    # 0.38f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, LS/q;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->k0(LS/q;)V

    :cond_0
    return-object v1
.end method

.method public final h(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)"

    const v2, -0x7f4fd79

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/i;->a:LU/i;

    invoke-virtual {p2}, LU/i;->c()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final i(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)"

    const v2, 0x414a89f7

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/t;->a:LU/t;

    invoke-virtual {p2}, LU/t;->c()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final j(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)"

    const v2, 0x4b7fb373    # 1.6757619E7f

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/l;->a:LU/l;

    invoke-virtual {p2}, LU/l;->c()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final k(ZLV/n;II)Lv/g;
    .locals 8

    .prologue
    const/4 v0, 0x1

    and-int/2addr p4, v0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v0, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)"

    const v1, -0x176bbc91

    invoke-static {v1, p3, p4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    const/4 p3, 0x6

    if-eqz p1, :cond_2

    const p1, -0x802ee2a

    invoke-interface {p2, p1}, LV/n;->T(I)V

    sget-object p1, LU/t;->a:LU/t;

    invoke-virtual {p1}, LU/t;->g()LU/e;

    move-result-object p1

    invoke-static {p1, p2, p3}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p3

    :goto_0
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_1

    :cond_2
    const p1, -0x801b80b

    invoke-interface {p2, p1}, LV/n;->T(I)V

    sget-object p1, LU/t;->a:LU/t;

    invoke-virtual {p1}, LU/t;->e()LU/e;

    move-result-object p1

    invoke-static {p1, p2, p3}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v0

    const/16 v6, 0xe

    const/4 v7, 0x0

    const v2, 0x3df5c28f    # 0.12f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    sget-object p1, LU/i;->a:LU/i;

    invoke-virtual {p1}, LU/i;->a()LU/e;

    move-result-object p1

    invoke-static {p1, p2, p3}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p3

    invoke-static {v0, v1, p3, p4}, Lo0/A0;->h(JJ)J

    move-result-wide p3

    goto :goto_0

    :goto_1
    invoke-interface {p2, p3, p4}, LV/n;->j(J)Z

    move-result p1

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_3

    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_4

    :cond_3
    sget-object p1, LU/t;->a:LU/t;

    invoke-virtual {p1}, LU/t;->h()F

    move-result p1

    invoke-static {p1, p3, p4}, Lv/h;->a(FJ)Lv/g;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lv/g;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object v0
.end method

.method public final l(LV/n;I)LS/q;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)"

    const v2, -0x47c98441

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/r;->g(LS/z;)LS/q;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final m(FFFFFFLV/n;II)LS/s;
    .locals 5

    .prologue
    and-int/lit8 p7, p9, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LU/t;->a:LU/t;

    invoke-virtual {p1}, LU/t;->b()F

    move-result p1

    :cond_0
    and-int/lit8 p7, p9, 0x2

    if-eqz p7, :cond_1

    move p7, p1

    goto :goto_0

    :cond_1
    move p7, p2

    :goto_0
    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_2

    move v0, p1

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    and-int/lit8 p2, p9, 0x8

    if-eqz p2, :cond_3

    move v1, p1

    goto :goto_2

    :cond_3
    move v1, p4

    :goto_2
    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_4

    sget-object p2, LU/t;->a:LU/t;

    invoke-virtual {p2}, LU/t;->f()F

    move-result p5

    :cond_4
    move v2, p5

    and-int/lit8 p2, p9, 0x20

    if-eqz p2, :cond_5

    sget-object p2, LU/t;->a:LU/t;

    invoke-virtual {p2}, LU/t;->d()F

    move-result p6

    :cond_5
    move p9, p6

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    const/4 p2, -0x1

    const-string p3, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)"

    const p4, -0x5d275b5

    invoke-static {p4, p8, p2, p3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    new-instance v3, LS/s;

    const/4 v4, 0x0

    move-object p2, v3

    move p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, p9

    move-object p9, v4

    invoke-direct/range {p2 .. p9}, LS/s;-><init>(FFFFFFLy7/k;)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object v3
.end method
