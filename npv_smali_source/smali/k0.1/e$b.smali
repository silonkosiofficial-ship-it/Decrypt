.class final Lk0/e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/e;->T1(Lk0/b;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lk0/b;

.field final synthetic E:Lk0/e;

.field final synthetic F:Ly7/K;


# direct methods
.method constructor <init>(Lk0/b;Lk0/e;Ly7/K;)V
    .locals 0

    iput-object p1, p0, Lk0/e$b;->D:Lk0/b;

    iput-object p2, p0, Lk0/e$b;->E:Lk0/e;

    iput-object p3, p0, Lk0/e$b;->F:Ly7/K;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lk0/e;)LF0/D0;
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LF0/D0;->D:LF0/D0;

    return-object p1

    :cond_0
    invoke-static {p1}, Lk0/e;->V1(Lk0/e;)Lk0/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1}, Lk0/e;->U1(Lk0/e;)Lx7/l;

    move-result-object v0

    iget-object v3, p0, Lk0/e$b;->D:Lk0/b;

    invoke-interface {v0, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/g;

    invoke-static {p1, v0}, Lk0/e;->X1(Lk0/e;Lk0/g;)V

    invoke-static {p1}, Lk0/e;->V1(Lk0/e;)Lk0/g;

    move-result-object v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    iget-object v3, p0, Lk0/e$b;->E:Lk0/e;

    invoke-static {v3}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v3

    invoke-interface {v3}, LF0/o0;->getDragAndDropManager()Lk0/c;

    move-result-object v3

    invoke-interface {v3, p1}, Lk0/c;->a(Lk0/d;)V

    :cond_4
    iget-object p1, p0, Lk0/e$b;->F:Ly7/K;

    iget-boolean v3, p1, Ly7/K;->C:Z

    if-nez v3, :cond_5

    if-eqz v0, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    iput-boolean v1, p1, Ly7/K;->C:Z

    sget-object p1, LF0/D0;->C:LF0/D0;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk0/e;

    invoke-virtual {p0, p1}, Lk0/e$b;->a(Lk0/e;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
