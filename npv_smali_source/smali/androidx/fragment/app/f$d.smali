.class Landroidx/fragment/app/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f;->e(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/fragment/app/A;

.field final synthetic D:Landroidx/fragment/app/f;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f;Landroidx/fragment/app/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/f$d;->D:Landroidx/fragment/app/f;

    iput-object p2, p0, Landroidx/fragment/app/f$d;->C:Landroidx/fragment/app/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f$d;->C:Landroidx/fragment/app/A;

    invoke-virtual {v0}, Landroidx/fragment/app/A;->g()V

    return-void
.end method
