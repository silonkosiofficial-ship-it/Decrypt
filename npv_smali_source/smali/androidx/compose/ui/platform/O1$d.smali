.class public final Landroidx/compose/ui/platform/O1$d;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O1;->e(Landroid/content/Context;)LZ8/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LY8/j;


# direct methods
.method constructor <init>(LY8/j;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O1$d;->a:LY8/j;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(ZLandroid/net/Uri;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/O1$d;->a:LY8/j;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-interface {p1, p2}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
