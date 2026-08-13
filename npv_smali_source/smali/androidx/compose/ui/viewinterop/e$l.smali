.class final Landroidx/compose/ui/viewinterop/e$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->g(LV/n;Landroidx/compose/ui/d;ILY0/e;Landroidx/lifecycle/r;Lx2/f;LY0/v;LV/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/viewinterop/e$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/e$l;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/e$l;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/e$l;->D:Landroidx/compose/ui/viewinterop/e$l;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;Landroidx/lifecycle/r;)V
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/e;->c(LF0/J;)Landroidx/compose/ui/viewinterop/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/compose/ui/viewinterop/c;->setLifecycleOwner(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, Landroidx/lifecycle/r;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$l;->a(LF0/J;Landroidx/lifecycle/r;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
