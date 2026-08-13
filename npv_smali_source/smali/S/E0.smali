.class public final LS/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/E0;

    invoke-direct {v0}, LS/E0;-><init>()V

    sput-object v0, LS/E0;->a:LS/E0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/D0;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:140)"

    const v2, -0x4705db32

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/E0;->b(LS/z;)LS/D0;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LS/z;)LS/D0;
    .locals 17

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->n()LS/D0;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/D0;

    sget-object v2, LU/y;->a:LU/y;

    invoke-virtual {v2}, LU/y;->d()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    invoke-virtual {v2}, LU/y;->f()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-virtual {v2}, LU/y;->a()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    const/16 v14, 0xe

    const/4 v15, 0x0

    const v10, 0x3ec28f5c    # 0.38f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v7

    invoke-virtual {v2}, LU/y;->b()LU/e;

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

    invoke-direct/range {v2 .. v11}, LS/D0;-><init>(JJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->m0(LS/D0;)V

    :cond_0
    return-object v1
.end method
