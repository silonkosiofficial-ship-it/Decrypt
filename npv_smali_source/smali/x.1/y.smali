.class public final Lx/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/y;

    invoke-direct {v0}, Lx/y;-><init>()V

    sput-object v0, Lx/y;->a:Lx/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)Lx/p;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)"

    const v2, 0x4206c4aa

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lt/B;->b(LV/n;I)Lu/B;

    move-result-object p2

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lx/j;

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2, v0, v2}, Lx/j;-><init>(Lu/B;Lh0/k;ILy7/k;)V

    invoke-interface {p1, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lx/j;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object v1
.end method

.method public final b(LV/n;I)Lv/T;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)"

    const v2, 0x6bdf63e4

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-static {p1, p2}, Lv/b;->a(LV/n;I)Lv/T;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final c(LY0/v;Lx/s;Z)Z
    .locals 2

    .prologue
    xor-int/lit8 v0, p3, 0x1

    sget-object v1, LY0/v;->D:LY0/v;

    if-ne p1, v1, :cond_0

    sget-object p1, Lx/s;->C:Lx/s;

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    return p3
.end method
