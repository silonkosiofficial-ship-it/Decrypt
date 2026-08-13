.class final LV/I$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/I;->u(LV/I$a;Lf0/k;ZLx7/a;)LV/I$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/I;

.field final synthetic E:Ld0/d;

.field final synthetic F:Lr/H;

.field final synthetic G:I


# direct methods
.method constructor <init>(LV/I;Ld0/d;Lr/H;I)V
    .locals 0

    iput-object p1, p0, LV/I$b;->D:LV/I;

    iput-object p2, p0, LV/I$b;->E:Ld0/d;

    iput-object p3, p0, LV/I$b;->F:Lr/H;

    iput p4, p0, LV/I$b;->G:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    iget-object v0, p0, LV/I$b;->D:LV/I;

    if-eq p1, v0, :cond_1

    instance-of v0, p1, Lf0/y;

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/I$b;->E:Ld0/d;

    invoke-virtual {v0}, Ld0/d;->a()I

    move-result v0

    iget-object v1, p0, LV/I$b;->F:Lr/H;

    iget v2, p0, LV/I$b;->G:I

    sub-int/2addr v0, v2

    const v2, 0x7fffffff

    invoke-virtual {v1, p1, v2}, Lr/N;->e(Ljava/lang/Object;I)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Lr/H;->s(Ljava/lang/Object;I)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A derived state calculation cannot read itself"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LV/I$b;->a(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
