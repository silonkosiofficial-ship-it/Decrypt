.class public final LS/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/Z;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/Z;

    invoke-direct {v0}, LS/Z;-><init>()V

    sput-object v0, LS/Z;->a:LS/Z;

    sget-object v0, LU/h;->a:LU/h;

    invoke-virtual {v0}, LU/h;->b()F

    move-result v0

    sput v0, LS/Z;->b:F

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

    const-string v1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:118)"

    const v2, 0x49df631

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/h;->a:LU/h;

    invoke-virtual {p2}, LU/h;->a()LU/e;

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

    sget v0, LS/Z;->b:F

    return v0
.end method
