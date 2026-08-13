.class final LS/d1$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/d1$f;->b(LD0/M;Ljava/util/List;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:LD0/X;

.field final synthetic F:LD0/M;

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:Ljava/lang/Integer;

.field final synthetic J:Ljava/lang/Integer;


# direct methods
.method constructor <init>(LD0/X;LD0/X;LD0/M;IILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LS/d1$f$a;->D:LD0/X;

    iput-object p2, p0, LS/d1$f$a;->E:LD0/X;

    iput-object p3, p0, LS/d1$f$a;->F:LD0/M;

    iput p4, p0, LS/d1$f$a;->G:I

    iput p5, p0, LS/d1$f$a;->H:I

    iput-object p6, p0, LS/d1$f$a;->I:Ljava/lang/Integer;

    iput-object p7, p0, LS/d1$f$a;->J:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 8

    .prologue
    iget-object v2, p0, LS/d1$f$a;->D:LD0/X;

    if-eqz v2, :cond_0

    iget-object v3, p0, LS/d1$f$a;->E:LD0/X;

    if-eqz v3, :cond_0

    iget-object v1, p0, LS/d1$f$a;->F:LD0/M;

    iget v4, p0, LS/d1$f$a;->G:I

    iget v5, p0, LS/d1$f$a;->H:I

    iget-object v0, p0, LS/d1$f$a;->I:Ljava/lang/Integer;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, LS/d1$f$a;->J:Ljava/lang/Integer;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v0, p1

    invoke-static/range {v0 .. v7}, LS/d1;->k(LD0/X$a;LY0/e;LD0/X;LD0/X;IIII)V

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    iget v0, p0, LS/d1$f$a;->H:I

    invoke-static {p1, v2, v0}, LS/d1;->l(LD0/X$a;LD0/X;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LS/d1$f$a;->E:LD0/X;

    if-eqz v0, :cond_2

    iget v1, p0, LS/d1$f$a;->H:I

    invoke-static {p1, v0, v1}, LS/d1;->l(LD0/X$a;LD0/X;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/d1$f$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
