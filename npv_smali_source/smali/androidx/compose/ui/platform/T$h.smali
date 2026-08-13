.class final Landroidx/compose/ui/platform/T$h;
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
.field final synthetic D:Landroidx/compose/ui/platform/t0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/t0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/T$h;->D:Landroidx/compose/ui/platform/t0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/platform/T$h;->D:Landroidx/compose/ui/platform/t0;

    new-instance v0, Landroidx/compose/ui/platform/T$h$a;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/T$h$a;-><init>(Landroidx/compose/ui/platform/t0;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/T$h;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
