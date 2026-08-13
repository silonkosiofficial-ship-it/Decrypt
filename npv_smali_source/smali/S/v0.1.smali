.class public final LS/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/v0;

    invoke-direct {v0}, LS/v0;-><init>()V

    sput-object v0, LS/v0;->a:LS/v0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/u0;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:311)"

    const v2, 0x3cbaef72

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/v0;->b(LS/z;)LS/u0;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LS/z;)LS/u0;
    .locals 23

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->j()LS/u0;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/u0;

    sget-object v2, LU/r;->a:LU/r;

    invoke-virtual {v2}, LU/r;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/r;->f()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-virtual {v2}, LU/r;->b()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/r;->i()LU/e;

    move-result-object v9

    invoke-static {v0, v9}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v9

    invoke-virtual {v2}, LU/r;->j()LU/e;

    move-result-object v11

    invoke-static {v0, v11}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v11

    invoke-virtual {v2}, LU/r;->i()LU/e;

    move-result-object v13

    invoke-static {v0, v13}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v14

    const/16 v20, 0xe

    const/16 v21, 0x0

    const v16, 0x3ec28f5c    # 0.38f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v13

    invoke-virtual {v2}, LU/r;->j()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v15

    const/16 v21, 0xe

    const/16 v22, 0x0

    const v17, 0x3ec28f5c    # 0.38f

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v15

    const/16 v17, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v17}, LS/u0;-><init>(JJJJJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->i0(LS/u0;)V

    :cond_0
    return-object v1
.end method
