.class Landroidx/fragment/app/f$b;
.super Landroidx/fragment/app/f$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/f;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/f$b;->a:Landroidx/fragment/app/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/f$j;-><init>(Landroidx/fragment/app/f$a;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/f$b;->a:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->z0:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->c()V

    iget-object v0, p0, Landroidx/fragment/app/f$b;->a:Landroidx/fragment/app/f;

    invoke-static {v0}, Landroidx/lifecycle/L;->c(Lx2/f;)V

    return-void
.end method
