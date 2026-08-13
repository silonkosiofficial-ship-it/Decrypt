.class public final LS/V0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/V0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/V0;

    invoke-direct {v0}, LS/V0;-><init>()V

    sput-object v0, LS/V0;->a:LS/V0;

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

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:430)"

    const v2, 0x2c4fc5b9

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->a()LU/e;

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

.method public final b(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:434)"

    const v2, -0x4e44f359

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->a()LU/e;

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

.method public final c(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:422)"

    const v2, 0x3ae2bdcd

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->c()LU/e;

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

.method public final d(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:426)"

    const v2, 0x3cdff767

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->h()LU/e;

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

.method public final e(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:438)"

    const v2, -0x1f81d6c1

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->f()LU/e;

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

.method public final f(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:418)"

    const v2, -0x20e1312d

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/B;->a:LU/B;

    invoke-virtual {p2}, LU/B;->e()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method
