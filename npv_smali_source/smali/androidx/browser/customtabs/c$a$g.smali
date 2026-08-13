.class Landroidx/browser/customtabs/c$a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c$a;->Q3(IILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:I

.field final synthetic D:I

.field final synthetic E:Landroid/os/Bundle;

.field final synthetic F:Landroidx/browser/customtabs/c$a;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/c$a;IILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/c$a$g;->F:Landroidx/browser/customtabs/c$a;

    iput p2, p0, Landroidx/browser/customtabs/c$a$g;->C:I

    iput p3, p0, Landroidx/browser/customtabs/c$a$g;->D:I

    iput-object p4, p0, Landroidx/browser/customtabs/c$a$g;->E:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroidx/browser/customtabs/c$a$g;->F:Landroidx/browser/customtabs/c$a;

    iget-object v0, v0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    iget v1, p0, Landroidx/browser/customtabs/c$a$g;->C:I

    iget v2, p0, Landroidx/browser/customtabs/c$a$g;->D:I

    iget-object v3, p0, Landroidx/browser/customtabs/c$a$g;->E:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/browser/customtabs/b;->d(IILandroid/os/Bundle;)V

    return-void
.end method
