.class public final Lk0/e$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/e;->U(Lk0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:Lk0/e;

.field final synthetic F:Lk0/b;


# direct methods
.method public constructor <init>(Ly7/O;Lk0/e;Lk0/b;)V
    .locals 0

    iput-object p1, p0, Lk0/e$d;->D:Ly7/O;

    iput-object p2, p0, Lk0/e$d;->E:Lk0/e;

    iput-object p3, p0, Lk0/e$d;->F:Lk0/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/E0;)LF0/D0;
    .locals 3

    .prologue
    move-object v0, p1

    check-cast v0, Lk0/e;

    iget-object v1, p0, Lk0/e$d;->E:Lk0/e;

    invoke-static {v1}, LF0/k;->n(LF0/j;)LF0/o0;

    move-result-object v1

    invoke-interface {v1}, LF0/o0;->getDragAndDropManager()Lk0/c;

    move-result-object v1

    invoke-interface {v1, v0}, Lk0/c;->b(Lk0/d;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lk0/e$d;->F:Lk0/b;

    invoke-static {v1}, Lk0/i;->a(Lk0/b;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lk0/f;->a(Lk0/d;J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk0/e$d;->D:Ly7/O;

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, LF0/D0;->E:LF0/D0;

    return-object p1

    :cond_0
    sget-object p1, LF0/D0;->C:LF0/D0;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/E0;

    invoke-virtual {p0, p1}, Lk0/e$d;->a(LF0/E0;)LF0/D0;

    move-result-object p1

    return-object p1
.end method
