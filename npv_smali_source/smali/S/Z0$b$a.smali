.class final LS/Z0$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0$b;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:I

.field final synthetic F:LD0/X;

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:LD0/X;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(LD0/X;ILD0/X;IILD0/X;II)V
    .locals 0

    iput-object p1, p0, LS/Z0$b$a;->D:LD0/X;

    iput p2, p0, LS/Z0$b$a;->E:I

    iput-object p3, p0, LS/Z0$b$a;->F:LD0/X;

    iput p4, p0, LS/Z0$b$a;->G:I

    iput p5, p0, LS/Z0$b$a;->H:I

    iput-object p6, p0, LS/Z0$b$a;->I:LD0/X;

    iput p7, p0, LS/Z0$b$a;->J:I

    iput p8, p0, LS/Z0$b$a;->K:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 14

    .prologue
    iget-object v1, p0, LS/Z0$b$a;->D:LD0/X;

    iget v3, p0, LS/Z0$b$a;->E:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    iget-object v8, p0, LS/Z0$b$a;->F:LD0/X;

    if-eqz v8, :cond_0

    iget v9, p0, LS/Z0$b$a;->G:I

    iget v10, p0, LS/Z0$b$a;->H:I

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_0
    iget-object v1, p0, LS/Z0$b$a;->I:LD0/X;

    if-eqz v1, :cond_1

    iget v2, p0, LS/Z0$b$a;->J:I

    iget v3, p0, LS/Z0$b$a;->K:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/Z0$b$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
