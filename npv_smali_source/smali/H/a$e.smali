.class final LH/a$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/a;->d(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/a$e;

    invoke-direct {v0}, LH/a$e;-><init>()V

    sput-object v0, LH/a$e;->D:LH/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
    .locals 4

    .prologue
    const v0, -0x7ec5e7f9

    invoke-interface {p2, v0}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)"

    invoke-static {v0, p3, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LN/J;

    invoke-virtual {p3}, LN/J;->b()J

    move-result-wide v0

    sget-object p3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p2, v0, v1}, LV/n;->j(J)Z

    move-result v2

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, LH/a$e$a;

    invoke-direct {v3, v0, v1}, LH/a$e$a;-><init>(J)V

    invoke-interface {p2, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lx7/l;

    invoke-static {p3, v3}, Landroidx/compose/ui/draw/b;->c(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p3

    invoke-interface {p1, p3}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p2}, LV/n;->J()V

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LH/a$e;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
