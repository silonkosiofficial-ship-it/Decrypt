.class public final Landroidx/compose/ui/platform/r$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Lz0/w;

.field final synthetic b:Landroidx/compose/ui/platform/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->b:Landroidx/compose/ui/platform/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lz0/w;->a:Lz0/w$a;

    invoke-virtual {p1}, Lz0/w$a;->a()Lz0/w;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->a:Lz0/w;

    return-void
.end method


# virtual methods
.method public a(Lz0/w;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    sget-object p1, Lz0/w;->a:Lz0/w$a;

    invoke-virtual {p1}, Lz0/w$a;->a()Lz0/w;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->a:Lz0/w;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    sget-object v0, Landroidx/compose/ui/platform/N;->a:Landroidx/compose/ui/platform/N;

    iget-object v1, p0, Landroidx/compose/ui/platform/r$q;->b:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/platform/N;->a(Landroid/view/View;Lz0/w;)V

    :cond_1
    return-void
.end method
