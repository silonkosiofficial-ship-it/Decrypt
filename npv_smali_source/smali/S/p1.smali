.class public final LS/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/p1;

    invoke-direct {v0}, LS/p1;-><init>()V

    sput-object v0, LS/p1;->a:LS/p1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/o1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:270)"

    const v2, -0x7c52e7ba

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/p1;->b(LS/z;)LS/o1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LS/z;)LS/o1;
    .locals 33

    .prologue
    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, LS/z;->q()LS/o1;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LU/E;->a:LU/E;

    invoke-virtual {v1}, LU/E;->a()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v4

    invoke-virtual {v1}, LU/E;->d()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v12

    invoke-virtual {v1}, LU/E;->i()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v14

    invoke-virtual {v1}, LU/E;->f()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v6

    invoke-virtual {v1}, LU/E;->j()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    invoke-virtual {v1}, LU/E;->n()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    invoke-virtual {v1}, LU/E;->p()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v16

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v2}, Lo0/y0$a;->f()J

    move-result-wide v18

    invoke-virtual {v1}, LU/E;->q()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v20

    invoke-virtual {v1}, LU/E;->r()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v22

    invoke-virtual {v1}, LU/E;->y()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v24

    invoke-virtual {v1}, LU/E;->A()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v26

    invoke-virtual {v1}, LU/E;->z()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v28

    invoke-virtual {v1}, LU/E;->B()LU/e;

    move-result-object v1

    invoke-static {v0, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v30

    new-instance v1, LS/o1;

    move-object v3, v1

    const/16 v32, 0x0

    invoke-direct/range {v3 .. v32}, LS/o1;-><init>(JJJJJJJJJJJJJJLy7/k;)V

    invoke-virtual {v0, v1}, LS/z;->p0(LS/o1;)V

    :cond_0
    return-object v1
.end method

.method public final c(LV/n;I)I
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:367)"

    const v2, 0x1ed3421e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, LS/v1;->a(LV/n;I)I

    move-result p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return p1
.end method
