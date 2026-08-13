.class public final LS/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/i;

.field private static final b:F

.field private static final c:LA/B;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LS/i;

    invoke-direct {v0}, LS/i;-><init>()V

    sput-object v0, LS/i;->a:LS/i;

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/i;->b:F

    invoke-static {}, LS/f;->j()F

    move-result v1

    invoke-static {}, LS/f;->l()F

    move-result v2

    invoke-static {}, LS/f;->j()F

    move-result v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/m;->e(FFFFILjava/lang/Object;)LA/B;

    move-result-object v0

    sput-object v0, LS/i;->c:LA/B;

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

    const-string v1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:1534)"

    const v2, -0x15f46c6e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/a;->a:LU/a;

    invoke-virtual {p2}, LU/a;->a()LU/e;

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

.method public final b()F
    .locals 1

    sget v0, LS/i;->b:F

    return v0
.end method

.method public final c()LA/B;
    .locals 1

    sget-object v0, LS/i;->c:LA/B;

    return-object v0
.end method

.method public final d(LV/n;I)LA/S;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:1553)"

    const v2, 0x290fb999

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LA/S;->a:LA/S$a;

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LT/z;->a(LA/S$a;LV/n;I)LA/S;

    move-result-object p1

    sget-object p2, LA/W;->a:LA/W$a;

    invoke-virtual {p2}, LA/W$a;->f()I

    move-result v0

    invoke-virtual {p2}, LA/W$a;->e()I

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
