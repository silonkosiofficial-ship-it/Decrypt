.class public final synthetic Lv3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic C:Lv3/v;

.field public final synthetic D:I

.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:I


# direct methods
.method public synthetic constructor <init>(Lv3/v;IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/n;->C:Lv3/v;

    iput p2, p0, Lv3/n;->D:I

    iput p3, p0, Lv3/n;->E:I

    iput p4, p0, Lv3/n;->F:I

    iput p5, p0, Lv3/n;->G:I

    iput p6, p0, Lv3/n;->H:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object v0, p0, Lv3/n;->C:Lv3/v;

    iget v1, p0, Lv3/n;->D:I

    iget v2, p0, Lv3/n;->E:I

    iget v3, p0, Lv3/n;->F:I

    iget v4, p0, Lv3/n;->G:I

    iget v5, p0, Lv3/n;->H:I

    move-object v6, p1

    move v7, p2

    invoke-virtual/range {v0 .. v7}, Lv3/v;->j(IIIIILandroid/content/DialogInterface;I)V

    return-void
.end method
