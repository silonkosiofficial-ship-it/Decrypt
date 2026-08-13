.class final Landroidx/compose/ui/platform/T$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/T;->a(Landroidx/compose/ui/platform/r;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;


# direct methods
.method constructor <init>(LV/w0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$g;->D:LV/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/T$g;->D:LV/w0;

    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/T;->d(LV/w0;Landroid/content/res/Configuration;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/T$g;->a(Landroid/content/res/Configuration;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
