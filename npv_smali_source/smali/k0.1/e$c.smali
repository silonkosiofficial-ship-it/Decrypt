.class final Lk0/e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/e;->c0(Lk0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lk0/b;


# direct methods
.method constructor <init>(Lk0/b;)V
    .locals 0

    iput-object p1, p0, Lk0/e$c;->D:Lk0/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lk0/e;)LF0/D0;
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LF0/D0;->D:LF0/D0;

    return-object p1

    :cond_0
    invoke-static {p1}, Lk0/e;->V1(Lk0/e;)Lk0/g;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lk0/e$c;->D:Lk0/b;

    invoke-interface {v0, v1}, Lk0/g;->c0(Lk0/b;)V

    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lk0/e;->X1(Lk0/e;Lk0/g;)V

    invoke-static {p1, v0}, Lk0/e;->W1(Lk0/e;Lk0/d;)V

    sget-object p1, LF0/D0;->C:LF0/D0;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk0/e;

    invoke-virtual {p0, p1}, Lk0/e$c;->a(Lk0/e;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
