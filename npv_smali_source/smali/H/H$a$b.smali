.class final LH/H$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/H$a;->k(LS0/d0;LS0/V;LS0/L;LH/V;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/t;


# direct methods
.method constructor <init>(LD0/t;)V
    .locals 0

    iput-object p1, p0, LH/H$a$b;->D:LD0/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([F)V
    .locals 2

    .prologue
    iget-object v0, p0, LH/H$a$b;->D:LD0/t;

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/H$a$b;->D:LD0/t;

    invoke-static {v0}, LD0/u;->d(LD0/t;)LD0/t;

    move-result-object v0

    iget-object v1, p0, LH/H$a$b;->D:LD0/t;

    invoke-interface {v0, v1, p1}, LD0/t;->Y(LD0/t;[F)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/J1;

    invoke-virtual {p1}, Lo0/J1;->r()[F

    move-result-object p1

    invoke-virtual {p0, p1}, LH/H$a$b;->a([F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
