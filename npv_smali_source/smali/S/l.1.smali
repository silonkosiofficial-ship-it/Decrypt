.class public final LS/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/l;

.field private static final b:F

.field private static final c:F

.field private static final d:LA/B;

.field private static final e:F

.field private static final f:LA/B;

.field private static final g:F

.field private static final h:LA/B;

.field private static final i:F

.field private static final j:LA/B;

.field private static final k:F

.field private static final l:F

.field private static final m:F

.field private static final n:F

.field public static final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LS/l;

    invoke-direct {v0}, LS/l;-><init>()V

    sput-object v0, LS/l;->a:LS/l;

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/l;->b:F

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LS/l;->c:F

    invoke-static {v0, v2, v0, v2}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object v3

    sput-object v3, LS/l;->d:LA/B;

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v5

    sput v5, LS/l;->e:F

    invoke-static {v5, v2, v0, v2}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object v0

    sput-object v0, LS/l;->f:LA/B;

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/l;->g:F

    invoke-interface {v3}, LA/B;->d()F

    move-result v2

    invoke-interface {v3}, LA/B;->c()F

    move-result v5

    invoke-static {v0, v2, v0, v5}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object v2

    sput-object v2, LS/l;->h:LA/B;

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v2

    sput v2, LS/l;->i:F

    invoke-interface {v3}, LA/B;->d()F

    move-result v4

    invoke-interface {v3}, LA/B;->c()F

    move-result v3

    invoke-static {v0, v4, v2, v3}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object v0

    sput-object v0, LS/l;->j:LA/B;

    const/16 v0, 0x3a

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/l;->k:F

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/l;->l:F

    sget-object v0, LU/k;->a:LU/k;

    invoke-virtual {v0}, LU/k;->i()F

    move-result v0

    sput v0, LS/l;->m:F

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/l;->n:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/k;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)"

    const v2, 0x5661c77d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/l;->d(LS/z;)LS/k;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(FFFFFLV/n;II)LS/m;
    .locals 4

    .prologue
    and-int/lit8 p6, p8, 0x1

    if-eqz p6, :cond_0

    sget-object p1, LU/k;->a:LU/k;

    invoke-virtual {p1}, LU/k;->b()F

    move-result p1

    :cond_0
    and-int/lit8 p6, p8, 0x2

    if-eqz p6, :cond_1

    sget-object p2, LU/k;->a:LU/k;

    invoke-virtual {p2}, LU/k;->k()F

    move-result p2

    :cond_1
    move p6, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    sget-object p2, LU/k;->a:LU/k;

    invoke-virtual {p2}, LU/k;->g()F

    move-result p3

    :cond_2
    move v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    sget-object p2, LU/k;->a:LU/k;

    invoke-virtual {p2}, LU/k;->h()F

    move-result p4

    :cond_3
    move v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    sget-object p2, LU/k;->a:LU/k;

    invoke-virtual {p2}, LU/k;->e()F

    move-result p5

    :cond_4
    move p8, p5

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_5

    const/4 p2, -0x1

    const-string p3, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)"

    const p4, 0x6cf1e157

    invoke-static {p4, p7, p2, p3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_5
    new-instance v2, LS/m;

    const/4 v3, 0x0

    move-object p2, v2

    move p3, p1

    move p4, p6

    move p5, v0

    move p6, v1

    move p7, p8

    move-object p8, v3

    invoke-direct/range {p2 .. p8}, LS/m;-><init>(FFFFFLy7/k;)V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LV/q;->P()V

    :cond_6
    return-object v2
.end method

.method public final c()LA/B;
    .locals 1

    sget-object v0, LS/l;->d:LA/B;

    return-object v0
.end method

.method public final d(LS/z;)LS/k;
    .locals 17

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->b()LS/k;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/k;

    sget-object v2, LU/k;->a:LU/k;

    invoke-virtual {v2}, LU/k;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/k;->j()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-virtual {v2}, LU/k;->d()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    const/16 v14, 0xe

    const/4 v15, 0x0

    const v10, 0x3df5c28f    # 0.12f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/k;->f()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    const/16 v15, 0xe

    const/16 v16, 0x0

    const v11, 0x3ec28f5c    # 0.38f

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    const/4 v11, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, LS/k;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->a0(LS/k;)V

    :cond_0
    return-object v1
.end method

.method public final e(LS/z;)LS/k;
    .locals 18

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->k()LS/k;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/k;

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v3

    sget-object v5, LU/s;->a:LU/s;

    invoke-virtual {v5}, LU/s;->c()LU/e;

    move-result-object v6

    invoke-static {v0, v6}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v6

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v8

    invoke-virtual {v5}, LU/s;->b()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    const/16 v16, 0xe

    const/16 v17, 0x0

    const v12, 0x3ec28f5c    # 0.38f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v10

    const/4 v12, 0x0

    move-object v2, v1

    move-wide v5, v6

    move-wide v7, v8

    move-wide v9, v10

    move-object v11, v12

    invoke-direct/range {v2 .. v11}, LS/k;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->j0(LS/k;)V

    :cond_0
    return-object v1
.end method

.method public final f(LS/z;)LS/k;
    .locals 18

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->o()LS/k;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/k;

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v3

    sget-object v5, LU/C;->a:LU/C;

    invoke-virtual {v5}, LU/C;->c()LU/e;

    move-result-object v6

    invoke-static {v0, v6}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v6

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v8

    invoke-virtual {v5}, LU/C;->b()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    const/16 v16, 0xe

    const/16 v17, 0x0

    const v12, 0x3ec28f5c    # 0.38f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v10

    const/4 v12, 0x0

    move-object v2, v1

    move-wide v5, v6

    move-wide v7, v8

    move-wide v9, v10

    move-object v11, v12

    invoke-direct/range {v2 .. v11}, LS/k;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->n0(LS/k;)V

    :cond_0
    return-object v1
.end method

.method public final g()F
    .locals 1

    sget v0, LS/l;->m:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LS/l;->n:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, LS/l;->l:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, LS/l;->k:F

    return v0
.end method

.method public final k(LV/n;I)Lv/g;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:877)"

    const v2, -0x219d4fa8

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/s;->a:LU/s;

    invoke-virtual {p2}, LU/s;->e()F

    move-result v0

    invoke-virtual {p2}, LU/s;->d()LU/e;

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p2, p1, v1}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lv/h;->a(FJ)Lv/g;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final l(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)"

    const v2, -0x79e77989

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/s;->a:LU/s;

    invoke-virtual {p2}, LU/s;->a()LU/z;

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

.method public final m(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)"

    const v2, -0x499b6e0d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/k;->a:LU/k;

    invoke-virtual {p2}, LU/k;->c()LU/z;

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

.method public final n()LA/B;
    .locals 1

    sget-object v0, LS/l;->h:LA/B;

    return-object v0
.end method

.method public final o(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)"

    const v2, -0x14cf2c33

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/C;->a:LU/C;

    invoke-virtual {p2}, LU/C;->a()LU/z;

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

.method public final p(ZLV/n;II)Lv/g;
    .locals 9

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

    const-string v0, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)"

    const v1, -0x255d0b6f

    invoke-static {v1, p3, p4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    sget-object p3, LU/s;->a:LU/s;

    invoke-virtual {p3}, LU/s;->e()F

    move-result p4

    const/4 v0, 0x6

    if-eqz p1, :cond_2

    const p1, -0x33038c54

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-virtual {p3}, LU/s;->d()LU/e;

    move-result-object p1

    invoke-static {p1, p2, v0}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v0

    :goto_0
    invoke-interface {p2}, LV/n;->J()V

    goto :goto_1

    :cond_2
    const p1, -0x3302365c

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-virtual {p3}, LU/s;->d()LU/e;

    move-result-object p1

    invoke-static {p1, p2, v0}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v1

    const/16 v7, 0xe

    const/4 v8, 0x0

    const v3, 0x3df5c28f    # 0.12f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    goto :goto_0

    :goto_1
    invoke-static {p4, v0, v1}, Lv/h;->a(FJ)Lv/g;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p1
.end method

.method public final q(LV/n;I)LS/k;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)"

    const v2, -0x502957c5

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/l;->e(LS/z;)LS/k;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final r(LV/n;I)LS/k;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)"

    const v2, 0x7013bc50

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/l;->f(LS/z;)LS/k;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final s(JJJJLV/n;II)LS/k;
    .locals 12

    .prologue
    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    and-int/lit8 v2, p11, 0x2

    if-eqz v2, :cond_1

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->g()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    move-wide v2, p3

    :goto_1
    and-int/lit8 v4, p11, 0x4

    if-eqz v4, :cond_2

    sget-object v4, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v4}, Lo0/y0$a;->g()J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide/from16 v4, p5

    :goto_2
    and-int/lit8 v6, p11, 0x8

    if-eqz v6, :cond_3

    sget-object v6, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v6}, Lo0/y0$a;->g()J

    move-result-wide v6

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p7

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_4

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)"

    const v10, -0x539503de

    move/from16 v11, p10

    invoke-static {v10, v11, v8, v9}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v8, LS/o0;->a:LS/o0;

    const/4 v9, 0x6

    move-object/from16 v10, p9

    invoke-virtual {v8, v10, v9}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v8

    move-object v9, p0

    invoke-virtual {p0, v8}, LS/l;->f(LS/z;)LS/k;

    move-result-object v8

    move-object p1, v8

    move-wide p2, v0

    move-wide/from16 p4, v2

    move-wide/from16 p6, v4

    move-wide/from16 p8, v6

    invoke-virtual/range {p1 .. p9}, LS/k;->c(JJJJ)LS/k;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object v0
.end method
