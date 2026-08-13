.class final Landroidx/compose/ui/platform/v0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/v0;->c(Ljava/lang/String;Lx2/f;)Landroidx/compose/ui/platform/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lx2/d;

.field final synthetic F:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLx2/d;Ljava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/v0$a;->D:Z

    iput-object p2, p0, Landroidx/compose/ui/platform/v0$a;->E:Lx2/d;

    iput-object p3, p0, Landroidx/compose/ui/platform/v0$a;->F:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/platform/v0$a;->D:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/v0$a;->E:Lx2/d;

    iget-object v1, p0, Landroidx/compose/ui/platform/v0$a;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lx2/d;->j(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/v0$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
