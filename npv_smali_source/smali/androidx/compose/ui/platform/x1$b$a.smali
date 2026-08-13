.class final Landroidx/compose/ui/platform/x1$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x1$b;->a(Landroidx/compose/ui/platform/a;)Lx7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/a;

.field final synthetic E:Landroidx/compose/ui/platform/x1$b$b;

.field final synthetic F:LH1/b;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/a;Landroidx/compose/ui/platform/x1$b$b;LH1/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x1$b$a;->D:Landroidx/compose/ui/platform/a;

    iput-object p2, p0, Landroidx/compose/ui/platform/x1$b$a;->E:Landroidx/compose/ui/platform/x1$b$b;

    iput-object p3, p0, Landroidx/compose/ui/platform/x1$b$a;->F:LH1/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/x1$b$a;->D:Landroidx/compose/ui/platform/a;

    iget-object v1, p0, Landroidx/compose/ui/platform/x1$b$a;->E:Landroidx/compose/ui/platform/x1$b$b;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/x1$b$a;->D:Landroidx/compose/ui/platform/a;

    iget-object v1, p0, Landroidx/compose/ui/platform/x1$b$a;->F:LH1/b;

    invoke-static {v0, v1}, LH1/a;->e(Landroid/view/View;LH1/b;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x1$b$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
