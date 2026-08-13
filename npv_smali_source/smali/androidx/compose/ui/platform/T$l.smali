.class public final Landroidx/compose/ui/platform/T$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/T;->k(Landroid/content/Context;Landroid/content/res/Configuration;LV/n;I)LI0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroid/content/res/Configuration;

.field final synthetic D:LI0/a;


# direct methods
.method constructor <init>(Landroid/content/res/Configuration;LI0/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$l;->C:Landroid/content/res/Configuration;

    iput-object p2, p0, Landroidx/compose/ui/platform/T$l;->D:LI0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/T$l;->C:Landroid/content/res/Configuration;

    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/T$l;->D:LI0/a;

    invoke-virtual {v1, v0}, LI0/a;->b(I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/T$l;->C:Landroid/content/res/Configuration;

    invoke-virtual {v0, p1}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/T$l;->D:LI0/a;

    invoke-virtual {v0}, LI0/a;->a()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/T$l;->D:LI0/a;

    invoke-virtual {p1}, LI0/a;->a()V

    return-void
.end method
