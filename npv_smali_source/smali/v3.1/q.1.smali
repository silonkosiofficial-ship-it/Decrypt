.class public final synthetic Lv3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic C:Lv3/v;

.field public final synthetic D:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I


# direct methods
.method public synthetic constructor <init>(Lv3/v;Ljava/util/concurrent/atomic/AtomicInteger;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/q;->C:Lv3/v;

    iput-object p2, p0, Lv3/q;->D:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p3, p0, Lv3/q;->E:I

    iput p4, p0, Lv3/q;->F:I

    iput p5, p0, Lv3/q;->G:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    iget-object v0, p0, Lv3/q;->C:Lv3/v;

    iget-object v1, p0, Lv3/q;->D:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p0, Lv3/q;->E:I

    iget v3, p0, Lv3/q;->F:I

    iget v4, p0, Lv3/q;->G:I

    move-object v5, p1

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lv3/v;->h(Ljava/util/concurrent/atomic/AtomicInteger;IIILandroid/content/DialogInterface;I)V

    return-void
.end method
