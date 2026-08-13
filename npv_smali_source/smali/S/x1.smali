.class public final LS/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/x1;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/x1;

    invoke-direct {v0}, LS/x1;-><init>()V

    sput-object v0, LS/x1;->a:LS/x1;

    sget-object v0, LU/I;->a:LU/I;

    invoke-virtual {v0}, LU/I;->a()F

    move-result v1

    sput v1, LS/x1;->b:F

    invoke-virtual {v0}, LU/I;->a()F

    move-result v1

    sput v1, LS/x1;->c:F

    sget-object v1, LU/G;->a:LU/G;

    invoke-virtual {v1}, LU/G;->a()F

    move-result v1

    sput v1, LS/x1;->d:F

    invoke-virtual {v0}, LU/I;->a()F

    move-result v0

    sput v0, LS/x1;->e:F

    sget-object v0, LU/F;->a:LU/F;

    invoke-virtual {v0}, LU/F;->a()F

    move-result v0

    sput v0, LS/x1;->f:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/w1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)"

    const v2, 0x1ea21a3d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/o0;->a:LS/o0;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object p1

    invoke-virtual {p0, p1}, LS/x1;->b(LS/z;)LS/w1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LS/z;)LS/w1;
    .locals 13

    .prologue
    invoke-virtual {p1}, LS/z;->d()LS/w1;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LS/w1;

    sget-object v1, LU/H;->a:LU/H;

    invoke-virtual {v1}, LU/H;->a()LU/e;

    move-result-object v2

    invoke-static {p1, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v2

    invoke-virtual {v1}, LU/H;->d()LU/e;

    move-result-object v4

    invoke-static {p1, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v4

    invoke-virtual {v1}, LU/H;->c()LU/e;

    move-result-object v6

    invoke-static {p1, v6}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v6

    invoke-virtual {v1}, LU/H;->b()LU/e;

    move-result-object v8

    invoke-static {p1, v8}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    invoke-virtual {v1}, LU/H;->e()LU/e;

    move-result-object v1

    invoke-static {p1, v1}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, LS/w1;-><init>(JJJJJLy7/k;)V

    invoke-virtual {p1, v0}, LS/z;->c0(LS/w1;)V

    :cond_0
    return-object v0
.end method

.method public final c()F
    .locals 1

    sget v0, LS/x1;->b:F

    return v0
.end method

.method public final d(LV/n;I)LA/S;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)"

    const v2, 0x7fbe5fff

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LA/S;->a:LA/S$a;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LT/z;->a(LA/S$a;LV/n;I)LA/S;

    move-result-object p1

    sget-object p2, LA/W;->a:LA/W$a;

    invoke-virtual {p2}, LA/W$a;->f()I

    move-result v0

    invoke-virtual {p2}, LA/W$a;->g()I

    move-result p2

    invoke-static {v0, p2}, LA/W;->l(II)I

    move-result p2

    invoke-static {p1, p2}, LA/U;->d(LA/S;I)LA/S;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
