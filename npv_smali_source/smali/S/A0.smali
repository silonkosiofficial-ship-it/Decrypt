.class public final LS/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/A0;

.field private static final b:F

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:Lu/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LS/A0;

    invoke-direct {v0}, LS/A0;-><init>()V

    sput-object v0, LS/A0;->a:LS/A0;

    sget-object v0, LU/x;->a:LU/x;

    invoke-virtual {v0}, LU/x;->e()F

    move-result v1

    sput v1, LS/A0;->b:F

    sget-object v1, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v1}, Lo0/g2$a;->b()I

    move-result v2

    sput v2, LS/A0;->c:I

    invoke-virtual {v1}, Lo0/g2$a;->b()I

    move-result v2

    sput v2, LS/A0;->d:I

    invoke-virtual {v1}, Lo0/g2$a;->b()I

    move-result v1

    sput v1, LS/A0;->e:I

    invoke-virtual {v0}, LU/x;->d()F

    move-result v1

    sput v1, LS/A0;->f:F

    invoke-virtual {v0}, LU/x;->b()F

    move-result v1

    sput v1, LS/A0;->g:F

    invoke-virtual {v0}, LU/x;->b()F

    move-result v0

    sput v0, LS/A0;->h:F

    new-instance v0, Lu/l0;

    const v1, 0x3a83126f    # 0.001f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x42480000    # 50.0f

    invoke-direct {v0, v2, v3, v1}, Lu/l0;-><init>(FFLjava/lang/Object;)V

    sput-object v0, LS/A0;->i:Lu/l0;

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

    const-string v1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)"

    const v2, 0x6b7ceedd

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/x;->a:LU/x;

    invoke-virtual {p2}, LU/x;->a()LU/e;

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

.method public final b()I
    .locals 1

    sget v0, LS/A0;->e:I

    return v0
.end method

.method public final c(LV/n;I)J
    .locals 2

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)"

    const v1, -0x741a9cc3

    invoke-static {v1, p2, p1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->f()J

    move-result-wide p1

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-wide p1
.end method

.method public final d()F
    .locals 1

    sget v0, LS/A0;->b:F

    return v0
.end method
