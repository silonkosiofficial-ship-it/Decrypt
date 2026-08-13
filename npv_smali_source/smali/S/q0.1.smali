.class public final LS/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/q0;

.field private static final b:F

.field private static final c:F

.field private static final d:LA/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/q0;

    invoke-direct {v0}, LS/q0;-><init>()V

    sput-object v0, LS/q0;->a:LS/q0;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LS/q0;->b:F

    sget-object v0, LU/p;->a:LU/p;

    invoke-virtual {v0}, LU/p;->b()F

    move-result v0

    sput v0, LS/q0;->c:F

    invoke-static {}, LS/s0;->g()F

    move-result v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/m;->b(FF)LA/B;

    move-result-object v0

    sput-object v0, LS/q0;->d:LA/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:198)"

    const v2, -0x6a89fc59

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/p;->a:LU/p;

    invoke-virtual {p2}, LU/p;->a()LU/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p1

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-wide p1
.end method

.method public final b(LS/z;)LS/r0;
    .locals 22

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->i()LS/r0;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/r0;

    sget-object v2, LU/o;->a:LU/o;

    invoke-virtual {v2}, LU/o;->g()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/o;->h()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-virtual {v2}, LU/o;->j()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/o;->a()LU/e;

    move-result-object v9

    invoke-static {v0, v9}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    invoke-virtual {v2}, LU/o;->b()F

    move-result v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v2}, LU/o;->c()LU/e;

    move-result-object v11

    invoke-static {v0, v11}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v12

    invoke-virtual {v2}, LU/o;->d()F

    move-result v14

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    invoke-virtual {v2}, LU/o;->e()LU/e;

    move-result-object v13

    invoke-static {v0, v13}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v14

    invoke-virtual {v2}, LU/o;->f()F

    move-result v16

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    const/4 v15, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v15}, LS/r0;-><init>(JJJJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->h0(LS/r0;)V

    :cond_0
    return-object v1
.end method

.method public final c()LA/B;
    .locals 1

    sget-object v0, LS/q0;->d:LA/B;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LS/q0;->c:F

    return v0
.end method

.method public final e(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:194)"

    const v2, 0xd092393

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/p;->a:LU/p;

    invoke-virtual {p2}, LU/p;->c()LU/z;

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

.method public final f()F
    .locals 1

    sget v0, LS/q0;->b:F

    return v0
.end method

.method public final g(LV/n;I)LS/r0;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:204)"

    const v2, 0x4f1143bc    # 2.43713536E9f

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/q0;->b(LS/z;)LS/r0;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
