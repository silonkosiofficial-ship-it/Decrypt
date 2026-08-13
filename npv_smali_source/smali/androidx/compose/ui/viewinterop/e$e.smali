.class final Landroidx/compose/ui/viewinterop/e$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->b(Lx7/l;Landroidx/compose/ui/d;Lx7/l;Lx7/l;Lx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/viewinterop/e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/viewinterop/e$e;

    invoke-direct {v0}, Landroidx/compose/ui/viewinterop/e$e;-><init>()V

    sput-object v0, Landroidx/compose/ui/viewinterop/e$e;->D:Landroidx/compose/ui/viewinterop/e$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;Lx7/l;)V
    .locals 0

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/e;->c(LF0/J;)Landroidx/compose/ui/viewinterop/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/compose/ui/viewinterop/i;->setUpdateBlock(Lx7/l;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, Lx7/l;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$e;->a(LF0/J;Lx7/l;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
