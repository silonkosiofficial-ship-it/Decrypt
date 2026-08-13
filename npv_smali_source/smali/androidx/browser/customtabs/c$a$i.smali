.class Landroidx/browser/customtabs/c$a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/browser/customtabs/c$a;->s1(IIIIILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:I

.field final synthetic D:I

.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:Landroid/os/Bundle;

.field final synthetic I:Landroidx/browser/customtabs/c$a;


# direct methods
.method constructor <init>(Landroidx/browser/customtabs/c$a;IIIIILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Landroidx/browser/customtabs/c$a$i;->I:Landroidx/browser/customtabs/c$a;

    iput p2, p0, Landroidx/browser/customtabs/c$a$i;->C:I

    iput p3, p0, Landroidx/browser/customtabs/c$a$i;->D:I

    iput p4, p0, Landroidx/browser/customtabs/c$a$i;->E:I

    iput p5, p0, Landroidx/browser/customtabs/c$a$i;->F:I

    iput p6, p0, Landroidx/browser/customtabs/c$a$i;->G:I

    iput-object p7, p0, Landroidx/browser/customtabs/c$a$i;->H:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Landroidx/browser/customtabs/c$a$i;->I:Landroidx/browser/customtabs/c$a;

    iget-object v1, v0, Landroidx/browser/customtabs/c$a;->D:Landroidx/browser/customtabs/b;

    iget v2, p0, Landroidx/browser/customtabs/c$a$i;->C:I

    iget v3, p0, Landroidx/browser/customtabs/c$a$i;->D:I

    iget v4, p0, Landroidx/browser/customtabs/c$a$i;->E:I

    iget v5, p0, Landroidx/browser/customtabs/c$a$i;->F:I

    iget v6, p0, Landroidx/browser/customtabs/c$a$i;->G:I

    iget-object v7, p0, Landroidx/browser/customtabs/c$a$i;->H:Landroid/os/Bundle;

    invoke-virtual/range {v1 .. v7}, Landroidx/browser/customtabs/b;->c(IIIIILandroid/os/Bundle;)V

    return-void
.end method
