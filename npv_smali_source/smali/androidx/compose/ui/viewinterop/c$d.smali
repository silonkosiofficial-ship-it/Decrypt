.class final Landroidx/compose/ui/viewinterop/c$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LV/s;ILy0/c;Landroid/view/View;LF0/o0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/J;


# direct methods
.method constructor <init>(LF0/J;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$d;->D:LF0/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/e;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$d;->D:LF0/J;

    invoke-virtual {v0, p1}, LF0/J;->a(LY0/e;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/e;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$d;->a(LY0/e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
