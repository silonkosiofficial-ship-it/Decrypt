.class public final LS/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/w;

    invoke-direct {v0}, LS/w;-><init>()V

    sput-object v0, LS/w;->a:LS/w;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/v;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:193)"

    const v2, -0x916c82

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/w;->b(LS/z;)LS/v;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LS/z;)LS/v;
    .locals 37

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->e()LS/v;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, LS/v;

    move-object v2, v1

    sget-object v25, LU/b;->a:LU/b;

    invoke-virtual/range {v25 .. v25}, LU/b;->c()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v3

    sget-object v13, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v13}, Lo0/y0$a;->f()J

    move-result-wide v5

    invoke-virtual/range {v25 .. v25}, LU/b;->a()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v7

    invoke-virtual {v13}, Lo0/y0$a;->f()J

    move-result-wide v9

    invoke-virtual/range {v25 .. v25}, LU/b;->b()LU/e;

    move-result-object v11

    invoke-static {v0, v11}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v14

    const/16 v20, 0xe

    const/16 v21, 0x0

    const v16, 0x3ec28f5c    # 0.38f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v11

    invoke-virtual {v13}, Lo0/y0$a;->f()J

    move-result-wide v13

    invoke-virtual/range {v25 .. v25}, LU/b;->b()LU/e;

    move-result-object v15

    invoke-static {v0, v15}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v16

    const/16 v22, 0xe

    const/16 v23, 0x0

    const v18, 0x3ec28f5c    # 0.38f

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v15

    move-object/from16 v28, v1

    invoke-virtual/range {v25 .. v25}, LU/b;->a()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v17

    invoke-virtual/range {v25 .. v25}, LU/b;->f()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v19

    invoke-virtual/range {v25 .. v25}, LU/b;->b()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v29

    const/16 v35, 0xe

    const/16 v36, 0x0

    const v31, 0x3ec28f5c    # 0.38f

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v29 .. v36}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v21

    invoke-virtual/range {v25 .. v25}, LU/b;->e()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v29

    invoke-static/range {v29 .. v36}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v23

    invoke-virtual/range {v25 .. v25}, LU/b;->b()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v29

    invoke-static/range {v29 .. v36}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v25

    const/16 v27, 0x0

    invoke-direct/range {v2 .. v27}, LS/v;-><init>(JJJJJJJJJJJJLy7/k;)V

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, LS/z;->d0(LS/v;)V

    :cond_0
    return-object v1
.end method
