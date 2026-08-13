.class public final LS/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/o0;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/o0;

    invoke-direct {v0}, LS/o0;-><init>()V

    sput-object v0, LS/o0;->a:LS/o0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)LS/z;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:83)"

    const v2, -0x21799f1e

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LS/A;->g()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS/z;

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LV/n;I)LS/S0;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:99)"

    const v2, 0x19013646

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LS/T0;->d()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS/S0;

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final c(LV/n;I)LS/A1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:91)"

    const v2, -0x3831e8b7

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LS/B1;->b()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS/A1;

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
