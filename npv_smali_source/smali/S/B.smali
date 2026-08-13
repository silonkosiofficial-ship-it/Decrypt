.class public final LS/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR/r;


# static fields
.field public static final b:LS/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/B;

    invoke-direct {v0}, LS/B;-><init>()V

    sput-object v0, LS/B;->b:LS/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LV/n;I)LR/g;
    .locals 3

    .prologue
    const v0, -0x1157ee36

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.CompatRippleTheme.rippleAlpha (Ripple.kt:248)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LS/H0;->a:LS/H0;

    invoke-virtual {p2}, LS/H0;->a()LR/g;

    move-result-object p2

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-object p2
.end method

.method public b(LV/n;I)J
    .locals 3

    .prologue
    const v0, -0x6df157d1

    invoke-interface {p1, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.CompatRippleTheme.defaultColor (Ripple.kt:244)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo0/y0;

    invoke-virtual {p2}, Lo0/y0;->w()J

    move-result-wide v0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    invoke-interface {p1}, LV/n;->J()V

    return-wide v0
.end method
