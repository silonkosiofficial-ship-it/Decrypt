.class final Landroidx/compose/ui/platform/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$c;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$c;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$c;->a:Landroidx/compose/ui/platform/x$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LC1/B;LK0/o;)V
    .locals 4

    .prologue
    invoke-static {p1}, Landroidx/compose/ui/platform/A;->b(LK0/o;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object v0

    sget-object v1, LK0/j;->a:LK0/j;

    invoke-virtual {v1}, LK0/j;->q()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/a;

    if-eqz v0, :cond_0

    new-instance v2, LC1/B$a;

    const v3, 0x1020046

    invoke-virtual {v0}, LK0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LC1/B$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LC1/B;->b(LC1/B$a;)V

    :cond_0
    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object v0

    invoke-virtual {v1}, LK0/j;->n()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/a;

    if-eqz v0, :cond_1

    new-instance v2, LC1/B$a;

    const v3, 0x1020047

    invoke-virtual {v0}, LK0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LC1/B$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LC1/B;->b(LC1/B$a;)V

    :cond_1
    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object v0

    invoke-virtual {v1}, LK0/j;->o()LK0/v;

    move-result-object v2

    invoke-static {v0, v2}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/a;

    if-eqz v0, :cond_2

    new-instance v2, LC1/B$a;

    const v3, 0x1020048

    invoke-virtual {v0}, LK0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, LC1/B$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, LC1/B;->b(LC1/B$a;)V

    :cond_2
    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object p1

    invoke-virtual {v1}, LK0/j;->p()LK0/v;

    move-result-object v0

    invoke-static {p1, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK0/a;

    if-eqz p1, :cond_3

    new-instance v0, LC1/B$a;

    const v1, 0x1020049

    invoke-virtual {p1}, LK0/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LC1/B$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, LC1/B;->b(LC1/B$a;)V

    :cond_3
    return-void
.end method
