.class final LQ3/C;
.super LQ3/D;
.source "SourceFile"


# instance fields
.field final synthetic C:Landroid/content/Intent;

.field final synthetic D:LP3/e;


# direct methods
.method constructor <init>(Landroid/content/Intent;LP3/e;I)V
    .locals 0

    iput-object p1, p0, LQ3/C;->C:Landroid/content/Intent;

    iput-object p2, p0, LQ3/C;->D:LP3/e;

    invoke-direct {p0}, LQ3/D;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, LQ3/C;->C:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, LQ3/C;->D:LP3/e;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, LP3/e;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
