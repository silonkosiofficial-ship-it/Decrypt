.class final LT/a$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a;->c(ZZLV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/s;

.field final synthetic E:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method constructor <init>(LT/s;Landroid/view/accessibility/AccessibilityManager;)V
    .locals 0

    iput-object p1, p0, LT/a$e;->D:LT/s;

    iput-object p2, p0, LT/a$e;->E:Landroid/view/accessibility/AccessibilityManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    sget-object v0, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LT/a$e;->D:LT/s;

    iget-object v0, p0, LT/a$e;->E:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1, v0}, LT/s;->q(Landroid/view/accessibility/AccessibilityManager;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/lifecycle/k$a;

    invoke-virtual {p0, p1}, LT/a$e;->a(Landroidx/lifecycle/k$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
