.class public final Landroidx/compose/ui/platform/T$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/T;->l(Landroid/content/Context;LV/n;I)LI0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LI0/b;


# direct methods
.method constructor <init>(LI0/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$n;->C:LI0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/T$n;->C:LI0/b;

    invoke-virtual {p1}, LI0/b;->a()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/T$n;->C:LI0/b;

    invoke-virtual {v0}, LI0/b;->a()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/T$n;->C:LI0/b;

    invoke-virtual {p1}, LI0/b;->a()V

    return-void
.end method
