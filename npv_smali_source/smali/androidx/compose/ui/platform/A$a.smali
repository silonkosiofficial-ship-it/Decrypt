.class final Landroidx/compose/ui/platform/A$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/A;->i(LK0/o;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/platform/A$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/A$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/A$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/A$a;->D:Landroidx/compose/ui/platform/A$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    invoke-virtual {p1}, LF0/J;->I()LK0/k;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK0/k;->M()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, LK0/r;->a:LK0/r;

    invoke-virtual {v0}, LK0/r;->g()LK0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LK0/k;->f(LK0/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/A$a;->a(LF0/J;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
