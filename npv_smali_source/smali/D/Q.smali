.class public abstract LD/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD/Q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "robolectric"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LD/Q$a;

    invoke-direct {v0}, LD/Q$a;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, LD/Q;->a:LD/Q$a;

    return-void
.end method

.method public static final a(LV/n;I)LD/P;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)"

    const v2, 0x440f9293

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LD/Q;->a:LD/Q$a;

    if-eqz p1, :cond_1

    const v0, 0x485a89af

    invoke-interface {p0, v0}, LV/n;->T(I)V

    :goto_0
    invoke-interface {p0}, LV/n;->J()V

    goto :goto_1

    :cond_1
    const p1, 0x485b21a8    # 224390.62f

    invoke-interface {p0, p1}, LV/n;->T(I)V

    invoke-static {}, Landroidx/compose/ui/platform/T;->i()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-interface {p0, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_3

    :cond_2
    new-instance v1, LD/a;

    invoke-direct {v1, p1}, LD/a;-><init>(Landroid/view/View;)V

    invoke-interface {p0, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_3
    move-object p1, v1

    check-cast p1, LD/a;

    goto :goto_0

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object p1
.end method
