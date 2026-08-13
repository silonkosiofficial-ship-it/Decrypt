.class final LK/i0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i0;->s(LH/w;Landroid/view/inputmethod/RemoveSpaceGesture;LM0/d;Landroidx/compose/ui/platform/A1;Lx7/l;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/M;

.field final synthetic E:Ly7/M;


# direct methods
.method constructor <init>(Ly7/M;Ly7/M;)V
    .locals 0

    iput-object p1, p0, LK/i0$a;->D:Ly7/M;

    iput-object p2, p0, LK/i0$a;->E:Ly7/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS8/l;)Ljava/lang/CharSequence;
    .locals 3

    .prologue
    iget-object v0, p0, LK/i0$a;->D:Ly7/M;

    iget v1, v0, Ly7/M;->C:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-interface {p1}, LS8/l;->d()LE7/i;

    move-result-object v1

    invoke-virtual {v1}, LE7/g;->f()I

    move-result v1

    iput v1, v0, Ly7/M;->C:I

    :cond_0
    iget-object v0, p0, LK/i0$a;->E:Ly7/M;

    invoke-interface {p1}, LS8/l;->d()LE7/i;

    move-result-object p1

    invoke-virtual {p1}, LE7/g;->g()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Ly7/M;->C:I

    const-string p1, ""

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/l;

    invoke-virtual {p0, p1}, LK/i0$a;->a(LS8/l;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
