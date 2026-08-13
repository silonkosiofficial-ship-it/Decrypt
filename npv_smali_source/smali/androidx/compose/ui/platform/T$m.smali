.class final Landroidx/compose/ui/platform/T$m;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/T;->l(Landroid/content/Context;LV/n;I)LI0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroid/content/Context;

.field final synthetic E:Landroidx/compose/ui/platform/T$n;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/compose/ui/platform/T$n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$m;->D:Landroid/content/Context;

    iput-object p2, p0, Landroidx/compose/ui/platform/T$m;->E:Landroidx/compose/ui/platform/T$n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, Landroidx/compose/ui/platform/T$m;->D:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/T$m;->E:Landroidx/compose/ui/platform/T$n;

    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/T$m;->D:Landroid/content/Context;

    iget-object v0, p0, Landroidx/compose/ui/platform/T$m;->E:Landroidx/compose/ui/platform/T$n;

    new-instance v1, Landroidx/compose/ui/platform/T$m$a;

    invoke-direct {v1, p1, v0}, Landroidx/compose/ui/platform/T$m$a;-><init>(Landroid/content/Context;Landroidx/compose/ui/platform/T$n;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/T$m;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
