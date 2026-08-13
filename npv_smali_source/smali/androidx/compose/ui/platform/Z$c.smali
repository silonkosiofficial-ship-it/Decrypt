.class final Landroidx/compose/ui/platform/Z$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/Z;->R(Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LW8/l;

.field final synthetic D:Landroidx/compose/ui/platform/Z;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(LW8/l;Landroidx/compose/ui/platform/Z;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/Z$c;->C:LW8/l;

    iput-object p2, p0, Landroidx/compose/ui/platform/Z$c;->D:Landroidx/compose/ui/platform/Z;

    iput-object p3, p0, Landroidx/compose/ui/platform/Z$c;->E:Lx7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/Z$c;->C:LW8/l;

    iget-object v1, p0, Landroidx/compose/ui/platform/Z$c;->E:Lx7/l;

    :try_start_0
    sget-object v2, Li7/w;->D:Li7/w$a;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object p2, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
