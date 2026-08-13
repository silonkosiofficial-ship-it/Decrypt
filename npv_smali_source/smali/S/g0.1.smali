.class public final LS/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/g0;

    invoke-direct {v0}, LS/g0;-><init>()V

    sput-object v0, LS/g0;->a:LS/g0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LS/z;J)LS/f0;
    .locals 16

    .prologue
    invoke-virtual/range {p1 .. p1}, LS/z;->h()LS/f0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LS/f0;

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->f()J

    move-result-wide v2

    invoke-virtual {v1}, Lo0/y0$a;->f()J

    move-result-wide v6

    const/16 v14, 0xe

    const/4 v15, 0x0

    const v10, 0x3ec28f5c    # 0.38f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v8, p2

    invoke-static/range {v8 .. v15}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    const/4 v10, 0x0

    move-object v1, v0

    move-wide/from16 v4, p2

    invoke-direct/range {v1 .. v10}, LS/f0;-><init>(JJJJLy7/k;)V

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, LS/z;->g0(LS/f0;)V

    :cond_0
    return-object v0
.end method

.method public final b(LV/n;I)LS/f0;
    .locals 17

    .prologue
    move-object/from16 v0, p1

    const v1, -0x5a939695

    invoke-interface {v0, v1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)"

    move/from16 v4, p2

    invoke-static {v1, v4, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v1

    invoke-interface {v0, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v10

    sget-object v1, LS/o0;->a:LS/o0;

    const/4 v2, 0x6

    invoke-virtual {v1, v0, v2}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v1

    move-object/from16 v13, p0

    invoke-virtual {v13, v1, v10, v11}, LS/g0;->a(LS/z;J)LS/f0;

    move-result-object v1

    invoke-virtual {v1}, LS/f0;->e()J

    move-result-wide v2

    invoke-static {v2, v3, v10, v11}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface/range {p1 .. p1}, LV/n;->J()V

    return-object v1

    :cond_2
    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3ec28f5c    # 0.38f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, v10

    invoke-static/range {v2 .. v9}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v14

    const/4 v12, 0x5

    const/16 v16, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    move-object v2, v1

    move-wide v5, v10

    move-wide v9, v14

    move v11, v12

    move-object/from16 v12, v16

    invoke-static/range {v2 .. v12}, LS/f0;->d(LS/f0;JJJJILjava/lang/Object;)LS/f0;

    move-result-object v1

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LV/n;->J()V

    return-object v1
.end method
