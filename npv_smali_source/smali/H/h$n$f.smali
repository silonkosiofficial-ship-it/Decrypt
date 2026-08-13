.class final LH/h$n$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$n;->a(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;

.field final synthetic E:LS0/s;


# direct methods
.method constructor <init>(LH/w;LS0/s;)V
    .locals 0

    iput-object p1, p0, LH/h$n$f;->D:LH/w;

    iput-object p2, p0, LH/h$n$f;->E:LS0/s;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LH/h$n$f;->D:LH/w;

    invoke-virtual {v0}, LH/w;->l()Lx7/l;

    move-result-object v0

    iget-object v1, p0, LH/h$n$f;->E:LS0/s;

    invoke-virtual {v1}, LS0/s;->e()I

    move-result v1

    invoke-static {v1}, LS0/r;->j(I)LS0/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/h$n$f;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
