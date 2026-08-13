.class final Landroidx/compose/ui/platform/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/x$b;

    invoke-direct {v0}, Landroidx/compose/ui/platform/x$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/x$b;->a:Landroidx/compose/ui/platform/x$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LC1/B;LK0/o;)V
    .locals 2

    .prologue
    invoke-static {p1}, Landroidx/compose/ui/platform/A;->b(LK0/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LK0/o;->w()LK0/k;

    move-result-object p1

    sget-object v0, LK0/j;->a:LK0/j;

    invoke-virtual {v0}, LK0/j;->w()LK0/v;

    move-result-object v0

    invoke-static {p1, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK0/a;

    if-eqz p1, :cond_0

    new-instance v0, LC1/B$a;

    const v1, 0x102003d

    invoke-virtual {p1}, LK0/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LC1/B$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, LC1/B;->b(LC1/B$a;)V

    :cond_0
    return-void
.end method
